package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxQuestionnaireTestEntity;
import com.saint.teaching.dao.IJxQuestionnaireTestDao;
import com.saint.teaching.sqlWhere.JxQuestionnaireTestSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_QUESTIONNAIRE_TEST
	*��˵��ѧԱ������ϸ
  */
public class JxQuestionnaireTestDaoImpl extends BaseDaoImpl implements IJxQuestionnaireTestDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_QUESTIONNAIRE_TEST
    	*��˵��ѧԱ������ϸ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxQuestionnaireTestEntity> selectListPageJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxQuestionnaireTestBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxQuestionnaireTestEntity selectJxQuestionnaireTestByPrimaryKey(String questionid) {
        return (JxQuestionnaireTestEntity)getObject(questionid, "selectJxQuestionnaireTestByPrimaryKey");
    }

    /**
     * ��ѯ��JX_QUESTIONNAIRE_TEST
     * ��˵��ѧԱ������ϸ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxQuestionnaireTestEntity> selectListJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxQuestionnaireTestBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxQuestionnaireTestBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,������Ϣ
      */
    public ExcuteResult insertJxQuestionnaireTest(JxQuestionnaireTestEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxQuestionnaireTest");
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxQuestionnaireTestSelective(JxQuestionnaireTestEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxQuestionnaireTestSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxQuestionnaireTestByPrimaryKey(JxQuestionnaireTestEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxQuestionnaireTestByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestEntity entity, JxQuestionnaireTestSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxQuestionnaireTestBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxQuestionnaireTestBySqlWhereSelective(JxQuestionnaireTestEntity entity, JxQuestionnaireTestSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxQuestionnaireTestBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxQuestionnaireTestByPrimaryKeySelective(JxQuestionnaireTestEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxQuestionnaireTestByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireTestByPrimaryKey(String questionid) {
        return excuteDataBase(questionid, ExcuteType.DELETE, "deleteJxQuestionnaireTestByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxQuestionnaireTestBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxQuestionnaireTestBySqlWhere");
    }
}