package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.dao.IJxStudentLeaveDao;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDENTS_LEAVE
	*��˵��ѧ�����
  */
public class JxStudentLeaveDaoImpl extends BaseDaoImpl implements IJxStudentLeaveDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STUDENTS_LEAVE
    	*��˵��ѧ�����
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentLeaveEntity> selectListPageJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentLeaveBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentLeaveEntity selectJxStudentLeaveByPrimaryKey(String xh) {
        return (JxStudentLeaveEntity)getObject(xh, "selectJxStudentLeaveByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDENTS_LEAVE
     * ��˵��ѧ�����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentLeaveEntity> selectListJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentLeaveBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentLeaveBySql(String sql) {
        return getListBySql(sql); 
    }
    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public int selectXhJxStudentLeaveBySql() {
	    return (Integer)getObject("", "selectXhJxStudentLeaveBySql");
	}
    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
      */
    public ExcuteResult insertJxStudentLeave(JxStudentLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentLeave");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentLeaveSelective(JxStudentLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentLeaveSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveByPrimaryKey(JxStudentLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentLeaveByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentLeaveBySqlWhere(JxStudentLeaveEntity entity, JxStudentLeaveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentLeaveBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveBySqlWhereSelective(JxStudentLeaveEntity entity, JxStudentLeaveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentLeaveBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveByPrimaryKeySelective(JxStudentLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentLeaveByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentLeaveByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentLeaveBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentLeaveBySqlWhere");
    }
}