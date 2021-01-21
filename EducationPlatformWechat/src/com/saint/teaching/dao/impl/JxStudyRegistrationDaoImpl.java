package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.dao.IJxStudyRegistrationDao;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDY_REGISTRATION
	*��˵�����ۿ�ǩ��
  */
public class JxStudyRegistrationDaoImpl extends BaseDaoImpl implements IJxStudyRegistrationDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STUDY_REGISTRATION
    	*��˵�����ۿ�ǩ��
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudyRegistrationEntity> selectListPageJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudyRegistrationBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudyRegistrationEntity selectJxStudyRegistrationByPrimaryKey(String xh) {
        return (JxStudyRegistrationEntity)getObject(xh, "selectJxStudyRegistrationByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDY_REGISTRATION
     * ��˵�����ۿ�ǩ��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudyRegistrationEntity> selectListJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudyRegistrationBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudyRegistrationBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,������Ϣ
      */
    public ExcuteResult insertJxStudyRegistration(JxStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudyRegistration");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudyRegistrationSelective(JxStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudyRegistrationSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxStudyRegistrationByPrimaryKey(JxStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudyRegistrationByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudyRegistrationBySqlWhere(JxStudyRegistrationEntity entity, JxStudyRegistrationSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudyRegistrationBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxStudyRegistrationBySqlWhereSelective(JxStudyRegistrationEntity entity, JxStudyRegistrationSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudyRegistrationBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxStudyRegistrationByPrimaryKeySelective(JxStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudyRegistrationByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudyRegistrationByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudyRegistrationByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudyRegistrationBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudyRegistrationBySqlWhere");
    }
}