package com.saint.teaching.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxSignErrorEntity;
import com.saint.teaching.dao.IJxSignErrorDao;
import com.saint.teaching.sqlWhere.JxSignErrorSqlWhere;

/**
	*��ע����Ϣ
	*����JX_SIGN_ERROR
	*��˵��ѧ��ǩ��ʧ����־
  */
public class JxSignErrorDaoImpl extends BaseDaoImpl implements IJxSignErrorDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_SIGN_ERROR
    	*��˵��ѧ��ǩ��ʧ����־
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxSignErrorEntity> selectListPageJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxSignErrorBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxSignErrorEntity selectJxSignErrorByPrimaryKey(String xh) {
        return (JxSignErrorEntity)getObject(xh, "selectJxSignErrorByPrimaryKey");
    }

    /**
     * ��ѯ��JX_SIGN_ERROR
     * ��˵��ѧ��ǩ��ʧ����־
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxSignErrorEntity> selectListJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxSignErrorBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxSignErrorBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,������Ϣ
      */
    public ExcuteResult insertJxSignError(JxSignErrorEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxSignError");
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxSignErrorSelective(JxSignErrorEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxSignErrorSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,�޸�
      */
    public ExcuteResult updateJxSignErrorByPrimaryKey(JxSignErrorEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxSignErrorByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxSignErrorBySqlWhere(JxSignErrorEntity entity, JxSignErrorSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxSignErrorBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,�޸�
      */
    public ExcuteResult updateJxSignErrorBySqlWhereSelective(JxSignErrorEntity entity, JxSignErrorSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxSignErrorBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,�޸�
      */
    public ExcuteResult updateJxSignErrorByPrimaryKeySelective(JxSignErrorEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxSignErrorByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxSignErrorByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxSignErrorByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxSignErrorBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxSignErrorBySqlWhere");
    }
}