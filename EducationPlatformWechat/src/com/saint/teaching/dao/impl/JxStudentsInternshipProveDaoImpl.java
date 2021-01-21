package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveKey;
import com.saint.teaching.dao.IJxStudentsInternshipProveDao;
import com.saint.teaching.sqlWhere.JxStudentsInternshipProveSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDENTS_INTERNSHIP_PROVE
	*��˵��ʵϰ֤��
  */
public class JxStudentsInternshipProveDaoImpl extends BaseDaoImpl implements IJxStudentsInternshipProveDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STUDENTS_INTERNSHIP_PROVE
    	*��˵��ʵϰ֤��
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsInternshipProveEntity> selectListPageJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsInternshipProveBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsInternshipProveEntity selectJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key) {
        return (JxStudentsInternshipProveEntity)getObject(key, "selectJxStudentsInternshipProveByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDENTS_INTERNSHIP_PROVE
     * ��˵��ʵϰ֤��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsInternshipProveEntity> selectListJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsInternshipProveBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsInternshipProveBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,������Ϣ
      */
    public ExcuteResult insertJxStudentsInternshipProve(JxStudentsInternshipProveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsInternshipProve");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsInternshipProveSelective(JxStudentsInternshipProveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsInternshipProveSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
      */
    public ExcuteResult updateJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsInternshipProveByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveEntity entity, JxStudentsInternshipProveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsInternshipProveBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
      */
    public ExcuteResult updateJxStudentsInternshipProveBySqlWhereSelective(JxStudentsInternshipProveEntity entity, JxStudentsInternshipProveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsInternshipProveBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
      */
    public ExcuteResult updateJxStudentsInternshipProveByPrimaryKeySelective(JxStudentsInternshipProveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsInternshipProveByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteJxStudentsInternshipProveByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsInternshipProveBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsInternshipProveBySqlWhere");
    }
}