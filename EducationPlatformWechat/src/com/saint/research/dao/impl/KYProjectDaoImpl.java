package com.saint.research.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KYProjectEntity;
import com.saint.research.dao.IKYProjectDao;
import com.saint.research.sqlWhere.KYProjectSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����KY_PROJECT
	*��˵��������Ŀ��Ϣ
  */
public class KYProjectDaoImpl extends BaseDaoImpl implements IKYProjectDao {
	 /**
	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
	*KY_PROJECT,������Ŀ��Ϣ��
	* @param sqlWhere
	* @return
	*/
	public int selectKYProjectSequence() {
	    return (Integer)getObject("", "selectKYProjectSequence");
	}
    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��KY_PROJECT
    	*��˵��������Ŀ��Ϣ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    @SuppressWarnings("unchecked")
	public List<KYProjectEntity> selectListPageKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageKYProjectBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public KYProjectEntity selectKYProjectByPrimaryKey(String prosequence) {
        return (KYProjectEntity)getObject(prosequence, "selectKYProjectByPrimaryKey");
    }

    /**
     * ��ѯ��KY_PROJECT
     * ��˵��������Ŀ��Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    @SuppressWarnings("unchecked")
	public List<KYProjectEntity> selectListKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListKYProjectBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKYProjectBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,������Ϣ
      */
    public ExcuteResult insertKYProject(KYProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKYProject");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKYProjectSelective(KYProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKYProjectSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*KY_PROJECT,������Ŀ��Ϣ��,�޸�
      */
    public ExcuteResult updateKYProjectByPrimaryKey(KYProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKYProjectByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateKYProjectBySqlWhere(KYProjectEntity entity, KYProjectSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKYProjectBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*KY_PROJECT,������Ŀ��Ϣ��,�޸�
      */
    public ExcuteResult updateKYProjectBySqlWhereSelective(KYProjectEntity entity, KYProjectSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKYProjectBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*KY_PROJECT,������Ŀ��Ϣ��,�޸�
      */
    public ExcuteResult updateKYProjectByPrimaryKeySelective(KYProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKYProjectByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteKYProjectByPrimaryKey(String prosequence) {
        return excuteDataBase(prosequence, ExcuteType.DELETE, "deleteKYProjectByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteKYProjectBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*KY_PROJECT,������Ŀ��Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countKYProjectBySqlWhere");
    }
    
	@SuppressWarnings("unchecked")
	@Override
	public List<String> selectListKYProject(Map<String, Object> map) {
		return getObjectList(map,"selectListKYProject");
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<KYProjectEntity> selectListPageProject(KYProjectSqlWhere sqlWhere) {
		return getObjectList(sqlWhere,"selectListPageProject"); 
	}
}