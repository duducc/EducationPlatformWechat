package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStencilEntity;
import com.saint.teaching.dao.IJxStencilDao;
import com.saint.teaching.sqlWhere.JxStencilSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STENCIL
	*��˵������ģ��
  */
public class JxStencilDaoImpl extends BaseDaoImpl implements IJxStencilDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STENCIL
    	*��˵������ģ��
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStencilEntity> selectListPageJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStencilBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStencilEntity selectJxStencilByPrimaryKey(String xh) {
        return (JxStencilEntity)getObject(xh, "selectJxStencilByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STENCIL
     * ��˵������ģ��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStencilEntity> selectListJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStencilBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStencilBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STENCIL,����ģ���,������Ϣ
      */
    public ExcuteResult insertJxStencil(JxStencilEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStencil");
    }

    /**
    	*����ע����Ϣ
    	*JX_STENCIL,����ģ���,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStencilSelective(JxStencilEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStencilSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STENCIL,����ģ���,�޸�
      */
    public ExcuteResult updateJxStencilByPrimaryKey(JxStencilEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStencilByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STENCIL,����ģ���,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStencilBySqlWhere(JxStencilEntity entity, JxStencilSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStencilBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STENCIL,����ģ���,�޸�
      */
    public ExcuteResult updateJxStencilBySqlWhereSelective(JxStencilEntity entity, JxStencilSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStencilBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STENCIL,����ģ���,�޸�
      */
    public ExcuteResult updateJxStencilByPrimaryKeySelective(JxStencilEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStencilByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STENCIL,����ģ���,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStencilByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStencilByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STENCIL,����ģ���,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStencilBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STENCIL,����ģ���
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStencilBySqlWhere");
    }
}