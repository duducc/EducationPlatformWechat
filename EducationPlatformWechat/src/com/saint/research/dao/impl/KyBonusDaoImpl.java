package com.saint.research.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KyBonusEntity;
import com.saint.research.dao.IKyBonusDao;
import com.saint.research.sqlWhere.KyBonusSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����KY_BONUS
	*��˵�����н������
  */
public class KyBonusDaoImpl extends BaseDaoImpl implements IKyBonusDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��KY_BONUS
    	*��˵�����н������
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<KyBonusEntity> selectListPageKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageKyBonusBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public KyBonusEntity selectKyBonusByPrimaryKey(String xh) {
        return (KyBonusEntity)getObject(xh, "selectKyBonusByPrimaryKey");
    }

    /**
     * ��ѯ��KY_BONUS
     * ��˵�����н������
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<KyBonusEntity> selectListKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListKyBonusBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyBonusBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,������Ϣ
      */
    public ExcuteResult insertKyBonus(KyBonusEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyBonus");
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyBonusSelective(KyBonusEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyBonusSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*KY_BONUS,���н�������,�޸�
      */
    public ExcuteResult updateKyBonusByPrimaryKey(KyBonusEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyBonusByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateKyBonusBySqlWhere(KyBonusEntity entity, KyBonusSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyBonusBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*KY_BONUS,���н�������,�޸�
      */
    public ExcuteResult updateKyBonusBySqlWhereSelective(KyBonusEntity entity, KyBonusSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyBonusBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*KY_BONUS,���н�������,�޸�
      */
    public ExcuteResult updateKyBonusByPrimaryKeySelective(KyBonusEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyBonusByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteKyBonusByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteKyBonusByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteKyBonusBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*KY_BONUS,���н�������
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countKyBonusBySqlWhere");
    }
}