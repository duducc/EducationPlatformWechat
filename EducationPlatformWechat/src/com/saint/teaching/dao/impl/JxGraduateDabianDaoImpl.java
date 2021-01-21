package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxGraduateDabianEntity;
import com.saint.teaching.dao.IJxGraduateDabianDao;
import com.saint.teaching.sqlWhere.JxGraduateDabianSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_GRADUATE_DABIAN
	*��˵���о�������걨
  */
public class JxGraduateDabianDaoImpl extends BaseDaoImpl implements IJxGraduateDabianDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_GRADUATE_DABIAN
    	*��˵���о�������걨
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxGraduateDabianEntity> selectListPageJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxGraduateDabianBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxGraduateDabianEntity selectJxGraduateDabianByPrimaryKey(String xh) {
        return (JxGraduateDabianEntity)getObject(xh, "selectJxGraduateDabianByPrimaryKey");
    }

    /**
     * ��ѯ��JX_GRADUATE_DABIAN
     * ��˵���о�������걨
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxGraduateDabianEntity> selectListJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxGraduateDabianBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxGraduateDabianBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,������Ϣ
      */
    public ExcuteResult insertJxGraduateDabian(JxGraduateDabianEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxGraduateDabian");
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxGraduateDabianSelective(JxGraduateDabianEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxGraduateDabianSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_GRADUATE_DABIAN,�о�������걨��,�޸�
      */
    public ExcuteResult updateJxGraduateDabianByPrimaryKey(JxGraduateDabianEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxGraduateDabianByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxGraduateDabianBySqlWhere(JxGraduateDabianEntity entity, JxGraduateDabianSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxGraduateDabianBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_GRADUATE_DABIAN,�о�������걨��,�޸�
      */
    public ExcuteResult updateJxGraduateDabianBySqlWhereSelective(JxGraduateDabianEntity entity, JxGraduateDabianSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxGraduateDabianBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_GRADUATE_DABIAN,�о�������걨��,�޸�
      */
    public ExcuteResult updateJxGraduateDabianByPrimaryKeySelective(JxGraduateDabianEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxGraduateDabianByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDabianByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxGraduateDabianByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxGraduateDabianBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_GRADUATE_DABIAN,�о�������걨��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxGraduateDabianBySqlWhere");
    }
}