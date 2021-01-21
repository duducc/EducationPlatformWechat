package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.dao.IJxStudentsDao;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDENTS
	*��˵��ѧԱ��Ϣ
  */
public class JxStudentsDaoImpl extends BaseDaoImpl implements IJxStudentsDao {
	
	@Override
	public int selectJXStudentsSequence() {
	    return (Integer)getObject("", "selectJXStudentsSequence");
	}
    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STUDENTS
    	*��˵��ѧԱ��Ϣ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsEntity> selectListPageJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsEntity selectJxStudentsByPrimaryKey(String xh) {
        return (JxStudentsEntity)getObject(xh, "selectJxStudentsByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDENTS
     * ��˵��ѧԱ��Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsEntity> selectListJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxStudents(JxStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudents");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsSelective(JxStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS,ѧԱ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsByPrimaryKey(JxStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsBySqlWhere(JxStudentsEntity entity, JxStudentsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS,ѧԱ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsBySqlWhereSelective(JxStudentsEntity entity, JxStudentsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS,ѧԱ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsByPrimaryKeySelective(JxStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS,ѧԱ��Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsBySqlWhere");
    }
}