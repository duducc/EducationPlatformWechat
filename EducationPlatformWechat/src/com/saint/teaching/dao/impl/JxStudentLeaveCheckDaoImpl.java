package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentLeaveCheckEntity;
import com.saint.teaching.dao.IJxStudentLeaveCheckDao;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDENT_LEAVE_CHECK
	*��˵��ѧ��������
  */
public class JxStudentLeaveCheckDaoImpl extends BaseDaoImpl implements IJxStudentLeaveCheckDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STUDENT_LEAVE_CHECK
    	*��˵��ѧ��������
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentLeaveCheckEntity> selectListPageJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentLeaveCheckBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentLeaveCheckEntity selectJxStudentLeaveCheckByPrimaryKey(String xh) {
        return (JxStudentLeaveCheckEntity)getObject(xh, "selectJxStudentLeaveCheckByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDENT_LEAVE_CHECK
     * ��˵��ѧ��������
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentLeaveCheckEntity> selectListJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentLeaveCheckBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentLeaveCheckBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,������Ϣ
      */
    public ExcuteResult insertJxStudentLeaveCheck(JxStudentLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentLeaveCheck");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentLeaveCheckSelective(JxStudentLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentLeaveCheckSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveCheckByPrimaryKey(JxStudentLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentLeaveCheckByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckEntity entity, JxStudentLeaveCheckSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentLeaveCheckBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveCheckBySqlWhereSelective(JxStudentLeaveCheckEntity entity, JxStudentLeaveCheckSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentLeaveCheckBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveCheckByPrimaryKeySelective(JxStudentLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentLeaveCheckByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveCheckByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentLeaveCheckByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentLeaveCheckBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentLeaveCheckBySqlWhere");
    }
}