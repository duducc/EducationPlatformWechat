package com.saint.research.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KyProjectPlanEntity;
import com.saint.research.dao.IKyProjectPlanDao;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����KY_PROJECTPLAN
	*��˵��������ȼƻ�
  */
public class KyProjectPlanDaoImpl extends BaseDaoImpl implements IKyProjectPlanDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��KY_PROJECTPLAN
    	*��˵��������ȼƻ�
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<KyProjectPlanEntity> selectListPageKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageKyProjectPlanBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public KyProjectPlanEntity selectKyProjectPlanByPrimaryKey(String xh) {
        return (KyProjectPlanEntity)getObject(xh, "selectKyProjectPlanByPrimaryKey");
    }

    /**
     * ��ѯ��KY_PROJECTPLAN
     * ��˵��������ȼƻ�
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<KyProjectPlanEntity> selectListKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListKyProjectPlanBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyProjectPlanBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,������Ϣ
      */
    public ExcuteResult insertKyProjectPlan(KyProjectPlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyProjectPlan");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyProjectPlanSelective(KyProjectPlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyProjectPlanSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*KY_PROJECTPLAN,������ȼƻ���,�޸�
      */
    public ExcuteResult updateKyProjectPlanByPrimaryKey(KyProjectPlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyProjectPlanByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateKyProjectPlanBySqlWhere(KyProjectPlanEntity entity, KyProjectPlanSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyProjectPlanBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*KY_PROJECTPLAN,������ȼƻ���,�޸�
      */
    public ExcuteResult updateKyProjectPlanBySqlWhereSelective(KyProjectPlanEntity entity, KyProjectPlanSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyProjectPlanBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*KY_PROJECTPLAN,������ȼƻ���,�޸�
      */
    public ExcuteResult updateKyProjectPlanByPrimaryKeySelective(KyProjectPlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyProjectPlanByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteKyProjectPlanByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteKyProjectPlanByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteKyProjectPlanBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*KY_PROJECTPLAN,������ȼƻ���
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countKyProjectPlanBySqlWhere");
    }
}