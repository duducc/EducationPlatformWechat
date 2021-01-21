package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxTeacherEntity;
import com.saint.teaching.dao.IJxTeacherDao;
import com.saint.teaching.sqlWhere.JxTeacherSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_TEACHER
	*��˵����ʦ��Ϣ
  */
public class JxTeacherDaoImpl extends BaseDaoImpl implements IJxTeacherDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_TEACHER
    	*��˵����ʦ��Ϣ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxTeacherEntity> selectListPageJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxTeacherBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxTeacherEntity selectJxTeacherByPrimaryKey(String usernumber) {
        return (JxTeacherEntity)getObject(usernumber, "selectJxTeacherByPrimaryKey");
    }

    /**
     * ��ѯ��JX_TEACHER
     * ��˵����ʦ��Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxTeacherEntity> selectListJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxTeacherBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeacherBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxTeacher(JxTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeacher");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeacherSelective(JxTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeacherSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_TEACHER,��ʦ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxTeacherByPrimaryKey(JxTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeacherByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxTeacherBySqlWhere(JxTeacherEntity entity, JxTeacherSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeacherBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_TEACHER,��ʦ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxTeacherBySqlWhereSelective(JxTeacherEntity entity, JxTeacherSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeacherBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_TEACHER,��ʦ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxTeacherByPrimaryKeySelective(JxTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeacherByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxTeacherByPrimaryKey(String usernumber) {
        return excuteDataBase(usernumber, ExcuteType.DELETE, "deleteJxTeacherByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxTeacherBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_TEACHER,��ʦ��Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxTeacherBySqlWhere");
    }
}