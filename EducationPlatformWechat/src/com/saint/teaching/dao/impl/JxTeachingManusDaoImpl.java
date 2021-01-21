package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.dao.IJxTeachingManusDao;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_TEACHING_MANUS
	*��˵�������ֲ����
  */
public class JxTeachingManusDaoImpl extends BaseDaoImpl implements IJxTeachingManusDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_TEACHING_MANUS
    	*��˵�������ֲ����
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxTeachingManusEntity> selectListPageJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxTeachingManusBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxTeachingManusEntity selectJxTeachingManusByPrimaryKey(String manuId) {
        return (JxTeachingManusEntity)getObject(manuId, "selectJxTeachingManusByPrimaryKey");
    }

    /**
     * ��ѯ��JX_TEACHING_MANUS
     * ��˵�������ֲ����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingManusEntity> selectListJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxTeachingManusBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingManusBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,������Ϣ
      */
    public ExcuteResult insertJxTeachingManus(JxTeachingManusEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingManus");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingManusSelective(JxTeachingManusEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingManusSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_TEACHING_MANUS,�����ֲ�����,�޸�
      */
    public ExcuteResult updateJxTeachingManusByPrimaryKey(JxTeachingManusEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingManusByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxTeachingManusBySqlWhere(JxTeachingManusEntity entity, JxTeachingManusSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingManusBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_TEACHING_MANUS,�����ֲ�����,�޸�
      */
    public ExcuteResult updateJxTeachingManusBySqlWhereSelective(JxTeachingManusEntity entity, JxTeachingManusSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingManusBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_TEACHING_MANUS,�����ֲ�����,�޸�
      */
    public ExcuteResult updateJxTeachingManusByPrimaryKeySelective(JxTeachingManusEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingManusByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManusByPrimaryKey(String manuId) {
        return excuteDataBase(manuId, ExcuteType.DELETE, "deleteJxTeachingManusByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxTeachingManusBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_TEACHING_MANUS,�����ֲ�����
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxTeachingManusBySqlWhere");
    }
}