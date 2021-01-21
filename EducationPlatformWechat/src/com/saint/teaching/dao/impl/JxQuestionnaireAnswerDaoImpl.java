package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxQuestionnaireAnswerEntity;
import com.saint.teaching.bean.JxQuestionnaireAnswerKey;
import com.saint.teaching.dao.IJxQuestionnaireAnswerDao;
import com.saint.teaching.sqlWhere.JxQuestionnaireAnswerSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_QUESTIONNAIRE_ANSWER
	*��˵�����ۿ�ǩ��
  */
public class JxQuestionnaireAnswerDaoImpl extends BaseDaoImpl implements IJxQuestionnaireAnswerDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_QUESTIONNAIRE_ANSWER
    	*��˵�����ۿ�ǩ��
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxQuestionnaireAnswerEntity> selectListPageJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxQuestionnaireAnswerBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxQuestionnaireAnswerEntity selectJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key) {
        return (JxQuestionnaireAnswerEntity)getObject(key, "selectJxQuestionnaireAnswerByPrimaryKey");
    }

    /**
     * ��ѯ��JX_QUESTIONNAIRE_ANSWER
     * ��˵�����ۿ�ǩ��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxQuestionnaireAnswerEntity> selectListJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxQuestionnaireAnswerBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxQuestionnaireAnswerBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,������Ϣ
      */
    public ExcuteResult insertJxQuestionnaireAnswer(JxQuestionnaireAnswerEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxQuestionnaireAnswer");
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxQuestionnaireAnswerSelective(JxQuestionnaireAnswerEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxQuestionnaireAnswerSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxQuestionnaireAnswerByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerEntity entity, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxQuestionnaireAnswerBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxQuestionnaireAnswerBySqlWhereSelective(JxQuestionnaireAnswerEntity entity, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxQuestionnaireAnswerBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxQuestionnaireAnswerByPrimaryKeySelective(JxQuestionnaireAnswerEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxQuestionnaireAnswerByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteJxQuestionnaireAnswerByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxQuestionnaireAnswerBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxQuestionnaireAnswerBySqlWhere");
    }
}