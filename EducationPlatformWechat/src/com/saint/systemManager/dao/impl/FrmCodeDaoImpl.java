package com.saint.systemManager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.dao.IFrmCodeDao;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����FRM_CODE
	*��˵��������Ϣ
  */
public class FrmCodeDaoImpl extends BaseDaoImpl implements IFrmCodeDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��FRM_CODE
    	*��˵��������Ϣ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<FrmCodeEntity> selectListPageFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageFrmCodeBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public FrmCodeEntity selectFrmCodeByPrimaryKey(FrmCodeKey key) {
        return (FrmCodeEntity)getObject(key, "selectFrmCodeByPrimaryKey");
    }

    /**
     * ��ѯ��FRM_CODE
     * ��˵��������Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<FrmCodeEntity> selectListFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListFrmCodeBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListFrmCodeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,������Ϣ
      */
    public ExcuteResult insertFrmCode(FrmCodeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmCode");
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertFrmCodeSelective(FrmCodeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmCodeSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*FRM_CODE,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmCodeByPrimaryKey(FrmCodeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmCodeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateFrmCodeBySqlWhere(FrmCodeEntity entity, FrmCodeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmCodeBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*FRM_CODE,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmCodeBySqlWhereSelective(FrmCodeEntity entity, FrmCodeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmCodeBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*FRM_CODE,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmCodeByPrimaryKeySelective(FrmCodeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmCodeByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteFrmCodeByPrimaryKey(FrmCodeKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteFrmCodeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteFrmCodeBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*FRM_CODE,������Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countFrmCodeBySqlWhere");
    }
}