package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxTeachingManualsEntity;
import com.saint.teaching.dao.IJxTeachingManualsDao;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_TEACHING_MANUALS
	*��˵��ʵϰ�������ֲ��¼
  */
public class JxTeachingManualsDaoImpl extends BaseDaoImpl implements IJxTeachingManualsDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_TEACHING_MANUALS
    	*��˵��ʵϰ�������ֲ��¼
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxTeachingManualsEntity> selectListPageJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxTeachingManualsBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxTeachingManualsEntity selectJxTeachingManualsByPrimaryKey(String xh) {
        return (JxTeachingManualsEntity)getObject(xh, "selectJxTeachingManualsByPrimaryKey");
    }

    /**
     * ��ѯ��JX_TEACHING_MANUALS
     * ��˵��ʵϰ�������ֲ��¼
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingManualsEntity> selectListJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxTeachingManualsBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingManualsBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,������Ϣ
      */
    public ExcuteResult insertJxTeachingManuals(JxTeachingManualsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingManuals");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingManualsSelective(JxTeachingManualsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingManualsSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,�޸�
      */
    public ExcuteResult updateJxTeachingManualsByPrimaryKey(JxTeachingManualsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingManualsByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxTeachingManualsBySqlWhere(JxTeachingManualsEntity entity, JxTeachingManualsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingManualsBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,�޸�
      */
    public ExcuteResult updateJxTeachingManualsBySqlWhereSelective(JxTeachingManualsEntity entity, JxTeachingManualsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingManualsBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,�޸�
      */
    public ExcuteResult updateJxTeachingManualsByPrimaryKeySelective(JxTeachingManualsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingManualsByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManualsByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxTeachingManualsByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxTeachingManualsBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxTeachingManualsBySqlWhere");
    }
}