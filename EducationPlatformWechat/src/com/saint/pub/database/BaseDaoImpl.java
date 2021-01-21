package com.saint.pub.database;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.poi.hssf.record.formula.functions.T;

import com.saint.pub.Tools;

public class BaseDaoImpl implements IBaseDao{
	private SqlSessionTemplate sqlSessionTemplate;

	@SuppressWarnings("static-access")
	public ExcuteResult excuteDataBase(Object args, ExcuteType excuteType, String excuStr) throws ExcuteException{
		int recount=0;
		try {
			if(excuteType.INSERT!=null)
			{
				recount=sqlSessionTemplate.insert(excuStr, args);
			}
			else if(excuteType.DELETE!=null)
			{
			    recount=sqlSessionTemplate.delete(excuStr, args);
			}
			else if(excuteType.UPDATE!=null)
			{
				recount=sqlSessionTemplate.update(excuStr, args);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("异常了这里："+Tools.getException(e));
			throw new ExcuteException(-1,excuteType+"__"+excuStr+"__操作执行异常:"+Tools.getException(e));
		}
		if(recount==0)
		{
			return new ExcuteResult(String.valueOf(recount),"操作执行没有符合条件的数据项");
		}
		return new ExcuteResult(String.valueOf(recount),"操作执行成功");
	}

	public Object getObject(Object args,String excuStr)  throws ExcuteException{
		try {
			return sqlSessionTemplate.selectOne(excuStr, args);	
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExcuteException(-1,"GETOBJECT__"+excuStr+"__操作执行异常:"+Tools.getException(e));
		}
	}
	
	@SuppressWarnings("unchecked")
	public List getObjectList(Object args, String excuStr)  throws ExcuteException{
		try {
			if(null!=args)
				return sqlSessionTemplate.selectList(excuStr, args);	
			else 
				return sqlSessionTemplate.selectList(excuStr);	
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExcuteException(-1,"GETOBJECTLIST__"+excuStr+"__操作执行异常:"+Tools.getException(e));
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<?, ?>> getObjectListMap(Object args, String excuStr) throws ExcuteException {
		try {
			if(null!=args)
				return (List<Map<?,?>>)sqlSessionTemplate.selectList(excuStr, args);
			else
				return (List<Map<?,?>>)sqlSessionTemplate.selectList(excuStr);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExcuteException(-1,"GETOBJECTLISTMAP__"+excuStr+"__操作执行异常:"+Tools.getException(e));
		}
	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	/**
	 * 
	 * @param sql
	 * @return
	 */
	public List<HashMap<String,Object>> getListBySql(String sql){
		List resultList = null;
		SqlSession session = this.getSqlSessionTemplate().getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
		  Connection conn=session.getConnection();
		  try {
		  PreparedStatement psta = conn.prepareStatement(sql);
		  ResultSet rs = psta.executeQuery();	
		  
		 
		  resultList = getMoreRecord(rs);
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
			 session.close();
			}
			return resultList;

	}
	private List<Object> getMoreRecord(ResultSet rs) throws SQLException {
		ResultSetMetaData rsmd = null;
		List<Object> records = new ArrayList<Object>();
		Map valueMap = null;
		int fieldCount = 0;
		try {
			rsmd = rs.getMetaData();
			fieldCount = rsmd.getColumnCount();
			int index = 0;
			while (rs.next()) {
				valueMap = new HashMap();
				for (int i = 1; i <= fieldCount; i++) {
					String fieldClassName = rsmd.getColumnClassName(i);
					String fieldName = rsmd.getColumnName(i);
					setRsInMap(fieldClassName, fieldName, rs, valueMap);
				}
				records.add(valueMap);
				index = index + 1;
			}
			rs.close();
		} catch (SQLException ex) {
			if (rs != null)
				rs.close();
		}
		return records;
	}
	
	protected void setRsInMap(String fieldClassName, String fieldName,
			ResultSet rs, Map fieldValue) throws SQLException {
		if (fieldClassName.equals("java.lang.String")) {
			String s = rs.getString(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s);
			return;
		}
		if (fieldClassName.equals("java.lang.Integer")) {
			int s = rs.getInt(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, new Integer(s));
			return;
		}
		if (fieldClassName.equals("java.lang.Short")) {
			short s = rs.getShort(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else {
				fieldValue.put(fieldName, new Short(s));
			}
			return;
		}
		if (fieldClassName.equals("java.lang.Float")) {
			float s = rs.getFloat(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, new Float(s));
			return;
		}
		if (fieldClassName.equals("java.lang.Double")) {
			double s = rs.getDouble(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, new Double(s));
			return;
		}
		if (fieldClassName.equals("java.math.BigDecimal")) {
			// double s = rs.getDouble(fieldName);
			BigDecimal s = rs.getBigDecimal(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s);
			return;
		}
		if (fieldClassName.equals("java.sql.Date")) {
			java.sql.Date s = rs.getDate(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s);
			return;
		}
		if (fieldClassName.equals("java.sql.Time")) {
			java.sql.Time s = rs.getTime(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s);
			return;
		}
		if (fieldClassName.equals("java.sql.Timestamp")) {
			java.sql.Timestamp s = rs.getTimestamp(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s.toString());
			return;
		}
		if (fieldClassName.equals("java.lang.Long")) {
			long s = rs.getLong(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, new Long(s));
			return;
		}
		if (fieldClassName.equals("java.lang.Boolean")) {
			boolean s = rs.getBoolean(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, new Boolean(s));
			return;
		}
		if (fieldClassName.equals("java.lang.Byte")) {
			byte s = rs.getByte(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, new Byte(s));
			return;
		}
		if (fieldClassName.equals("java.lang.Object")
				|| fieldClassName.equals("oracle.sql.STRUCT")) {
			Object s = rs.getObject(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s);
			return;
		}
		if (fieldClassName.equals("java.sql.Array")
				|| fieldClassName.equals("oracle.sql.ARRAY")) {
			java.sql.Array s = rs.getArray(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s);
			return;
		}
		if (fieldClassName.equals("java.sql.Clob")) {
			java.sql.Clob s = rs.getClob(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s);
			return;
		}
		if (fieldClassName.equals("java.sql.Blob")) {
			java.sql.Blob s = rs.getBlob(fieldName);
			if (rs.wasNull())
				fieldValue.put(fieldName, null);
			else
				fieldValue.put(fieldName, s);
			return;
		}
	}
}
