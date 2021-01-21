package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.dao.IJxSignInfoDao;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_SIGN_INFO
	*��˵��ʵϰѧԱǩ����Ϣ
  */
public class JxSignInfoDaoImpl extends BaseDaoImpl implements IJxSignInfoDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_SIGN_INFO
    	*��˵��ʵϰѧԱǩ����Ϣ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxSignInfoEntity> selectListPageJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxSignInfoBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxSignInfoEntity selectJxSignInfoByPrimaryKey(String xh) {
        return (JxSignInfoEntity)getObject(xh, "selectJxSignInfoByPrimaryKey");
    }

    /**
     * ��ѯ��JX_SIGN_INFO
     * ��˵��ʵϰѧԱǩ����Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxSignInfoEntity> selectListJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxSignInfoBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxSignInfoBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxSignInfo(JxSignInfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxSignInfo");
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxSignInfoSelective(JxSignInfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxSignInfoSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxSignInfoByPrimaryKey(JxSignInfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxSignInfoByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxSignInfoBySqlWhere(JxSignInfoEntity entity, JxSignInfoSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxSignInfoBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxSignInfoBySqlWhereSelective(JxSignInfoEntity entity, JxSignInfoSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxSignInfoBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxSignInfoByPrimaryKeySelective(JxSignInfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxSignInfoByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxSignInfoByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxSignInfoByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxSignInfoBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxSignInfoBySqlWhere");
    }
}