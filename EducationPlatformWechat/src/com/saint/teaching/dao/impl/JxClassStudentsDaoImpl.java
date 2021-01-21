package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.dao.IJxClassStudentsDao;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_CLASS_STUDENTS
	*��˵����ѧѧ����Ϣ
  */
public class JxClassStudentsDaoImpl extends BaseDaoImpl implements IJxClassStudentsDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_CLASS_STUDENTS
    	*��˵����ѧѧ����Ϣ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxClassStudentsEntity> selectListPageJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxClassStudentsBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxClassStudentsEntity selectJxClassStudentsByPrimaryKey(String xh) {
        return (JxClassStudentsEntity)getObject(xh, "selectJxClassStudentsByPrimaryKey");
    }

    /**
     * ��ѯ��JX_CLASS_STUDENTS
     * ��˵����ѧѧ����Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxClassStudentsEntity> selectListJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxClassStudentsBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxClassStudentsBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxClassStudents(JxClassStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxClassStudents");
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxClassStudentsSelective(JxClassStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxClassStudentsSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxClassStudentsByPrimaryKey(JxClassStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxClassStudentsByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxClassStudentsBySqlWhere(JxClassStudentsEntity entity, JxClassStudentsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxClassStudentsBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxClassStudentsBySqlWhereSelective(JxClassStudentsEntity entity, JxClassStudentsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxClassStudentsBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxClassStudentsByPrimaryKeySelective(JxClassStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxClassStudentsByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxClassStudentsByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxClassStudentsByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxClassStudentsBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxClassStudentsBySqlWhere");
    }
}