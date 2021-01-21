package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import com.saint.teaching.dao.IJxStudentsLeaveDao;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDENTS_LEAVE
	*��˵��ѧ�����
  */
public class JxStudentsLeaveDaoImpl extends BaseDaoImpl implements IJxStudentsLeaveDao {
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
    	*��ҳ��ѯ��JX_STUDENTS_LEAVE
    	*��˵��ѧ�����
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsLeaveEntity> selectListPageJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsLeaveBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsLeaveEntity selectJxStudentsLeaveByPrimaryKey(String xh) {
        return (JxStudentsLeaveEntity)getObject(xh, "selectJxStudentsLeaveByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDENTS_LEAVE
     * ��˵��ѧ�����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsLeaveBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsLeaveBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
      */
    public ExcuteResult insertJxStudentsLeave(JxStudentsLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsLeave");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsLeaveSelective(JxStudentsLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsLeaveSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveByPrimaryKey(JxStudentsLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsLeaveByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsLeaveBySqlWhere(JxStudentsLeaveEntity entity, JxStudentsLeaveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsLeaveBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveBySqlWhereSelective(JxStudentsLeaveEntity entity, JxStudentsLeaveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsLeaveBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveByPrimaryKeySelective(JxStudentsLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsLeaveByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsLeaveByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsLeaveBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsLeaveBySqlWhere");
    }
    
    @Override
	public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveByStuid(String xh) {
		return getObjectList(xh,"selectListJxStudentsLeaveByStuid");
	}

}