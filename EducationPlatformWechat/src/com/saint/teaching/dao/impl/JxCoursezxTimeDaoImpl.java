package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxCoursezxTimeEntity;
import com.saint.teaching.dao.IJxCoursezxTimeDao;
import com.saint.teaching.sqlWhere.JxCoursezxTimeSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_COURSEZXTIME
	*��˵�����ۿ��Ͽ���Ϣʱ��
  */
public class JxCoursezxTimeDaoImpl extends BaseDaoImpl implements IJxCoursezxTimeDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_COURSEZXTIME
    	*��˵�����ۿ��Ͽ���Ϣʱ��
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxCoursezxTimeEntity> selectListPageJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxCoursezxTimeBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxCoursezxTimeEntity selectJxCoursezxTimeByPrimaryKey(String xh) {
        return (JxCoursezxTimeEntity)getObject(xh, "selectJxCoursezxTimeByPrimaryKey");
    }

    /**
     * ��ѯ��JX_COURSEZXTIME
     * ��˵�����ۿ��Ͽ���Ϣʱ��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxCoursezxTimeEntity> selectListJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxCoursezxTimeBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCoursezxTimeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,������Ϣ
      */
    public ExcuteResult insertJxCoursezxTime(JxCoursezxTimeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCoursezxTime");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCoursezxTimeSelective(JxCoursezxTimeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCoursezxTimeSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,�޸�
      */
    public ExcuteResult updateJxCoursezxTimeByPrimaryKey(JxCoursezxTimeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCoursezxTimeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxCoursezxTimeBySqlWhere(JxCoursezxTimeEntity entity, JxCoursezxTimeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCoursezxTimeBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,�޸�
      */
    public ExcuteResult updateJxCoursezxTimeBySqlWhereSelective(JxCoursezxTimeEntity entity, JxCoursezxTimeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCoursezxTimeBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,�޸�
      */
    public ExcuteResult updateJxCoursezxTimeByPrimaryKeySelective(JxCoursezxTimeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCoursezxTimeByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxCoursezxTimeByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxCoursezxTimeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxCoursezxTimeBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxCoursezxTimeBySqlWhere");
    }
}