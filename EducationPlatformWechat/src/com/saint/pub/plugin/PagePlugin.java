package com.saint.pub.plugin;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import javax.xml.bind.PropertyException;
import org.apache.ibatis.builder.xml.dynamic.ForEachSqlNode;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.executor.statement.BaseStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;
import com.saint.pub.Tools;

@Intercepts({@Signature(type=StatementHandler.class,method="prepare",args={Connection.class})})
public class PagePlugin implements Interceptor {

	private static String dialect = "";	//���ݿⷽ��,��Ӧmybatis.xml<plugin><property name="dialect" value="oracle"/></plugin>
	private static String pageSqlId = ""; //��Ҫ���ص�mapper.xml�е�SQLID(����ƥ��)��Ӧmybatis.xml<plugin><property name="pageSqlId" value=".*listPage.*"/></plugin>,����mapper.xml��SQLID����listPage������������
	
	public Object intercept(Invocation ivk) throws Throwable {
		// TODO Auto-generated method stub
		if(ivk.getTarget() instanceof RoutingStatementHandler){
			RoutingStatementHandler statementHandler = (RoutingStatementHandler)ivk.getTarget();
			BaseStatementHandler delegate = (BaseStatementHandler) ReflectHelper.getValueByFieldName(statementHandler, "delegate");
			MappedStatement mappedStatement = (MappedStatement) ReflectHelper.getValueByFieldName(delegate, "mappedStatement");
			
			if(mappedStatement.getId().matches(pageSqlId)){ //������Ҫ��ҳ��SQL
				BoundSql boundSql = delegate.getBoundSql();
				Object parameterObject = boundSql.getParameterObject();//mapper.xml��<select>��parameterType���Զ�Ӧ��ʵ���������DAO�ӿ���ִ�з�ҳ�����Ĳ���,�ò�������Ϊ��
				if(parameterObject==null){
					throw new NullPointerException("parameterObject��δʵ������");
				}else{
					Connection connection = (Connection) ivk.getArgs()[0];
					String sql = boundSql.getSql();
					String countSql = "select count(0) from (" + sql+ ")"; //��ҳ���ܼ�¼��
					PreparedStatement countStmt = connection.prepareStatement(countSql);
					BoundSql countBS = new BoundSql(mappedStatement.getConfiguration(),countSql,boundSql.getParameterMappings(),parameterObject);
					
					for (ParameterMapping mapping : boundSql.getParameterMappings()) {
		                String prop = mapping.getProperty();
		                if (boundSql.hasAdditionalParameter(prop)) {
		                	countBS.setAdditionalParameter(prop, boundSql.getAdditionalParameter(prop));
		                }
		            }
					
					setParameters(countStmt,mappedStatement,countBS,parameterObject);
					ResultSet rs = countStmt.executeQuery();
					int count = 0;
					if (rs.next()) {
						count = rs.getInt(1);
					}
					rs.close();
					countStmt.close();
					Page listPage = null;
					if(parameterObject instanceof Page){//��������Pageʵ��
						listPage = (Page) parameterObject;
						listPage.setEntityOrField(true);//��Page.entityOrField ע��
						listPage.setTotalResult(count);
					}else{//����Ϊĳ��ʵ�壬��ʵ��ӵ��Page���ԣ���HpglDao�ķ���listPageUnlockHp(Hpjlls hpjlls)���˴�����ΪHpjlls��Hpjllsӵ��Page����
						Field pageField = ReflectHelper.getFieldByFieldName(parameterObject,"listPage");
						if(pageField!=null){
							listPage = (Page) ReflectHelper.getValueByFieldName(parameterObject,"listPage");
							if(listPage==null)
								listPage = new Page();
							listPage.setEntityOrField(false); //��Page.entityOrField ע��
							listPage.setTotalResult(count);
							ReflectHelper.setValueByFieldName(parameterObject,"listPage", listPage); //ͨ�����䣬��ʵ��������÷�ҳ����
						}else{
							throw new NoSuchFieldException(parameterObject.getClass().getName()+"������ page ���ԣ�");
						}
					}
					String pageSql = generatePageSql(sql,listPage);
					ReflectHelper.setValueByFieldName(boundSql, "sql", pageSql); //����ҳsql��䷴���BoundSql.
				}
			}
		}
		return ivk.proceed();
	}

	
	private void setParameters(PreparedStatement ps,MappedStatement mappedStatement,BoundSql boundSql,Object parameterObject) throws SQLException {
		ErrorContext.instance().activity("setting parameters").object(mappedStatement.getParameterMap().getId());
		List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
		if (parameterMappings != null) {
			Configuration configuration = mappedStatement.getConfiguration();
			TypeHandlerRegistry typeHandlerRegistry = configuration.getTypeHandlerRegistry();
			MetaObject metaObject = parameterObject == null ? null: configuration.newMetaObject(parameterObject);
			for (int i = 0; i < parameterMappings.size(); i++) {
				ParameterMapping parameterMapping = parameterMappings.get(i);
				if (parameterMapping.getMode() != ParameterMode.OUT) {
					Object value;
					String propertyName = parameterMapping.getProperty();
					PropertyTokenizer prop = new PropertyTokenizer(propertyName);
					if (parameterObject == null) {
						value = null;
					} else if (typeHandlerRegistry.hasTypeHandler(parameterObject.getClass())) {
						value = parameterObject;
					} else if (boundSql.hasAdditionalParameter(propertyName)) {
						value = boundSql.getAdditionalParameter(propertyName);
					} else if (propertyName.startsWith(ForEachSqlNode.ITEM_PREFIX)&& boundSql.hasAdditionalParameter(prop.getName())) {
						value = boundSql.getAdditionalParameter(prop.getName());
						if (value != null) {
							value = configuration.newMetaObject(value).getValue(propertyName.substring(prop.getName().length()));
						}
					} else {
						value = metaObject == null ? null : metaObject.getValue(propertyName);
					}
					TypeHandler typeHandler = parameterMapping.getTypeHandler();
					if (typeHandler == null) {
						throw new ExecutorException("There was no TypeHandler found for parameter "+ propertyName + " of statement "+ mappedStatement.getId());
					}
					typeHandler.setParameter(ps, i + 1, value, parameterMapping.getJdbcType());
				}
			}
		}
	}
	private String generatePageSql(String sql,Page page){
		if(page!=null && Tools.notEmpty(dialect)){
			StringBuffer pageSql = new StringBuffer();
			if("oracle".equals(dialect)){
				if(0==page.getRows()){
					pageSql.append(sql);
					pageSql.append(page.getCurrentResult());
				}else{
					pageSql.append("select * from ( select row_.*, rownum rownum_ from (");
					pageSql.append(sql);
					pageSql.append(")row_ where rownum<=");
					pageSql.append(page.getCurrentResult()+page.getRows());
					pageSql.append(") where rownum_>");
					pageSql.append(page.getCurrentResult());
				}
			}else if("mysql".equals(dialect)){
				//mysql��ҳ��ѯ���
			}else if("sqlserver".equals(dialect)){
				//sqlserver��ҳ��ѯ���
			}
			return pageSql.toString();
		}else{
			return sql;
		}
	}
	
	public Object plugin(Object arg0) {
		// TODO Auto-generated method stub
		return Plugin.wrap(arg0, this);
	}

	public void setProperties(Properties p) {
		dialect = p.getProperty("dialect");
		if (Tools.isEmpty(dialect)) {
			try {
				throw new PropertyException("dialect property is not found!");
			} catch (PropertyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pageSqlId = p.getProperty("pageSqlId");
		if (Tools.isEmpty(pageSqlId)) {
			try {
				throw new PropertyException("pageSqlId property is not found!");
			} catch (PropertyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
