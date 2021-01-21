package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.dao.IJxCoursePlanDao;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_COURSEPLAN
	*��˵�����ۿν�ѧ����
  */
public class JxCoursePlanDaoImpl extends BaseDaoImpl implements IJxCoursePlanDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_COURSEPLAN
    	*��˵�����ۿν�ѧ����
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxCoursePlanEntity> selectListPageJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxCoursePlanBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxCoursePlanEntity selectJxCoursePlanByPrimaryKey(String xh) {
        return (JxCoursePlanEntity)getObject(xh, "selectJxCoursePlanByPrimaryKey");
    }

    /**
     * ��ѯ��JX_COURSEPLAN
     * ��˵�����ۿν�ѧ����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxCoursePlanEntity> selectListJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxCoursePlanBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCoursePlanBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,������Ϣ
      */
    public ExcuteResult insertJxCoursePlan(JxCoursePlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCoursePlan");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCoursePlanSelective(JxCoursePlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCoursePlanSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
      */
    public ExcuteResult updateJxCoursePlanByPrimaryKey(JxCoursePlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCoursePlanByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxCoursePlanBySqlWhere(JxCoursePlanEntity entity, JxCoursePlanSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCoursePlanBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
      */
    public ExcuteResult updateJxCoursePlanBySqlWhereSelective(JxCoursePlanEntity entity, JxCoursePlanSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCoursePlanBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
      */
    public ExcuteResult updateJxCoursePlanByPrimaryKeySelective(JxCoursePlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCoursePlanByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxCoursePlanByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxCoursePlanByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxCoursePlanBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxCoursePlanBySqlWhere");
    }
}