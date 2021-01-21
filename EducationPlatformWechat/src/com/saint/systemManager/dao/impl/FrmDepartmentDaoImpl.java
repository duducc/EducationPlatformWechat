package com.saint.systemManager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.dao.IFrmDepartmentDao;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����FRM_DEPARTMENT
	*��˵��������Ϣ
  */
public class FrmDepartmentDaoImpl extends BaseDaoImpl implements IFrmDepartmentDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��FRM_DEPARTMENT
    	*��˵��������Ϣ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<FrmDepartmentEntity> selectListPageFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageFrmDepartmentBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public FrmDepartmentEntity selectFrmDepartmentByPrimaryKey(String glbm) {
        return (FrmDepartmentEntity)getObject(glbm, "selectFrmDepartmentByPrimaryKey");
    }

    /**
     * ��ѯ��FRM_DEPARTMENT
     * ��˵��������Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListFrmDepartmentBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListFrmDepartmentBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,������Ϣ
      */
    public ExcuteResult insertFrmDepartment(FrmDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmDepartment");
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertFrmDepartmentSelective(FrmDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmDepartmentSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*FRM_DEPARTMENT,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmDepartmentByPrimaryKey(FrmDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmDepartmentByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateFrmDepartmentBySqlWhere(FrmDepartmentEntity entity, FrmDepartmentSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmDepartmentBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*FRM_DEPARTMENT,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmDepartmentBySqlWhereSelective(FrmDepartmentEntity entity, FrmDepartmentSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmDepartmentBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*FRM_DEPARTMENT,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmDepartmentByPrimaryKeySelective(FrmDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmDepartmentByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteFrmDepartmentByPrimaryKey(String glbm) {
        return excuteDataBase(glbm, ExcuteType.DELETE, "deleteFrmDepartmentByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteFrmDepartmentBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*FRM_DEPARTMENT,������Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countFrmDepartmentBySqlWhere");
    }
}