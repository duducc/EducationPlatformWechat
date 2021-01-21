package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import com.saint.teaching.dao.IJxStudentsLeaveCheckDao;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDENTS_LEAVE_CHECK
	*��˵���������
  */
public class JxStudentsLeaveCheckDaoImpl extends BaseDaoImpl implements IJxStudentsLeaveCheckDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STUDENTS_LEAVE_CHECK
    	*��˵���������
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsLeaveCheckEntity> selectListPageJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsLeaveCheckBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsLeaveCheckEntity selectJxStudentsLeaveCheckByPrimaryKey(String xh) {
        return (JxStudentsLeaveCheckEntity)getObject(xh, "selectJxStudentsLeaveCheckByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDENTS_LEAVE_CHECK
     * ��˵���������
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsLeaveCheckEntity> selectListJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsLeaveCheckBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsLeaveCheckBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,������Ϣ
      */
    public ExcuteResult insertJxStudentsLeaveCheck(JxStudentsLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsLeaveCheck");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsLeaveCheckSelective(JxStudentsLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsLeaveCheckSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_LEAVE_CHECK,���������,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveCheckByPrimaryKey(JxStudentsLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsLeaveCheckByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckEntity entity, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsLeaveCheckBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_LEAVE_CHECK,���������,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveCheckBySqlWhereSelective(JxStudentsLeaveCheckEntity entity, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsLeaveCheckBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_LEAVE_CHECK,���������,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveCheckByPrimaryKeySelective(JxStudentsLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsLeaveCheckByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveCheckByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsLeaveCheckByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsLeaveCheckBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_LEAVE_CHECK,���������
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsLeaveCheckBySqlWhere");
    }
}