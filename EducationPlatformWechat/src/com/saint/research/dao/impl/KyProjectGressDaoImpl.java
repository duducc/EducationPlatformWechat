package com.saint.research.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KyProjectGressEntity;
import com.saint.research.dao.IKyProjectGressDao;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����KY_PROJECTGRESS
	*��˵����Ŀִ������Ǽ�
  */
public class KyProjectGressDaoImpl extends BaseDaoImpl implements IKyProjectGressDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��KY_PROJECTGRESS
    	*��˵����Ŀִ������Ǽ�
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<KyProjectGressEntity> selectListPageKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageKyProjectGressBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public KyProjectGressEntity selectKyProjectGressByPrimaryKey(String xh) {
        return (KyProjectGressEntity)getObject(xh, "selectKyProjectGressByPrimaryKey");
    }

    /**
     * ��ѯ��KY_PROJECTGRESS
     * ��˵����Ŀִ������Ǽ�
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<KyProjectGressEntity> selectListKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListKyProjectGressBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyProjectGressBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,������Ϣ
      */
    public ExcuteResult insertKyProjectGress(KyProjectGressEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyProjectGress");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyProjectGressSelective(KyProjectGressEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyProjectGressSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,�޸�
      */
    public ExcuteResult updateKyProjectGressByPrimaryKey(KyProjectGressEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyProjectGressByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateKyProjectGressBySqlWhere(KyProjectGressEntity entity, KyProjectGressSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyProjectGressBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,�޸�
      */
    public ExcuteResult updateKyProjectGressBySqlWhereSelective(KyProjectGressEntity entity, KyProjectGressSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyProjectGressBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,�޸�
      */
    public ExcuteResult updateKyProjectGressByPrimaryKeySelective(KyProjectGressEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyProjectGressByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteKyProjectGressByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteKyProjectGressByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteKyProjectGressBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countKyProjectGressBySqlWhere");
    }
}