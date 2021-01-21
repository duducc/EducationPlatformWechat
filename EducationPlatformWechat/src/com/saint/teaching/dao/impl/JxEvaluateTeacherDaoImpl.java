package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxEvaluateTeacherEntity;
import com.saint.teaching.dao.IJxEvaluateTeacherDao;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_EVALUATE_TEACHER
	*��˵����ʦ���۱�
  */
public class JxEvaluateTeacherDaoImpl extends BaseDaoImpl implements IJxEvaluateTeacherDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_EVALUATE_TEACHER
    	*��˵����ʦ���۱�
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxEvaluateTeacherEntity> selectListPageJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxEvaluateTeacherBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxEvaluateTeacherEntity selectJxEvaluateTeacherByPrimaryKey(String xh) {
        return (JxEvaluateTeacherEntity)getObject(xh, "selectJxEvaluateTeacherByPrimaryKey");
    }

    /**
     * ��ѯ��JX_EVALUATE_TEACHER
     * ��˵����ʦ���۱�
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxEvaluateTeacherEntity> selectListJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxEvaluateTeacherBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxEvaluateTeacherBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,������Ϣ
      */
    public ExcuteResult insertJxEvaluateTeacher(JxEvaluateTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxEvaluateTeacher");
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxEvaluateTeacherSelective(JxEvaluateTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxEvaluateTeacherSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,�޸�
      */
    public ExcuteResult updateJxEvaluateTeacherByPrimaryKey(JxEvaluateTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxEvaluateTeacherByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherEntity entity, JxEvaluateTeacherSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxEvaluateTeacherBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,�޸�
      */
    public ExcuteResult updateJxEvaluateTeacherBySqlWhereSelective(JxEvaluateTeacherEntity entity, JxEvaluateTeacherSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxEvaluateTeacherBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,�޸�
      */
    public ExcuteResult updateJxEvaluateTeacherByPrimaryKeySelective(JxEvaluateTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxEvaluateTeacherByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxEvaluateTeacherByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxEvaluateTeacherByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxEvaluateTeacherBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_EVALUATE_TEACHER,��ʦ���۱��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxEvaluateTeacherBySqlWhere");
    }
}