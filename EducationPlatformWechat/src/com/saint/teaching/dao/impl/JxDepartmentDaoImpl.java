package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxDepartmentEntity;
import com.saint.teaching.dao.IJxDepartmentDao;
import com.saint.teaching.sqlWhere.JxDepartmentSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_DEPARTMENT
	*��˵����ѧ����
  */
public class JxDepartmentDaoImpl extends BaseDaoImpl implements IJxDepartmentDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_DEPARTMENT
    	*��˵����ѧ����
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxDepartmentEntity> selectListPageJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxDepartmentBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxDepartmentEntity selectJxDepartmentByPrimaryKey(String xh) {
        return (JxDepartmentEntity)getObject(xh, "selectJxDepartmentByPrimaryKey");
    }

    /**
     * ��ѯ��JX_DEPARTMENT
     * ��˵����ѧ����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxDepartmentEntity> selectListJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxDepartmentBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxDepartmentBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_DEPARTMENT,��ѧ���ű�,������Ϣ
      */
    public ExcuteResult insertJxDepartment(JxDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxDepartment");
    }

    /**
    	*����ע����Ϣ
    	*JX_DEPARTMENT,��ѧ���ű�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxDepartmentSelective(JxDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxDepartmentSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_DEPARTMENT,��ѧ���ű�,�޸�
      */
    public ExcuteResult updateJxDepartmentByPrimaryKey(JxDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxDepartmentByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_DEPARTMENT,��ѧ���ű�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxDepartmentBySqlWhere(JxDepartmentEntity entity, JxDepartmentSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxDepartmentBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_DEPARTMENT,��ѧ���ű�,�޸�
      */
    public ExcuteResult updateJxDepartmentBySqlWhereSelective(JxDepartmentEntity entity, JxDepartmentSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxDepartmentBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_DEPARTMENT,��ѧ���ű�,�޸�
      */
    public ExcuteResult updateJxDepartmentByPrimaryKeySelective(JxDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxDepartmentByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_DEPARTMENT,��ѧ���ű�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxDepartmentByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxDepartmentByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_DEPARTMENT,��ѧ���ű�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxDepartmentBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_DEPARTMENT,��ѧ���ű�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxDepartmentBySqlWhere");
    }
}