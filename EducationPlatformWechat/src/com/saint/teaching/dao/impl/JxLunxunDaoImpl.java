package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.dao.IJxLunxunDao;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_LUNXUN
	*��˵����ѧ��ѵ
  */
public class JxLunxunDaoImpl extends BaseDaoImpl implements IJxLunxunDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_LUNXUN
    	*��˵����ѧ��ѵ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxLunxunEntity> selectListPageJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxLunxunBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxLunxunEntity selectJxLunxunByPrimaryKey(String xh) {
        return (JxLunxunEntity)getObject(xh, "selectJxLunxunByPrimaryKey");
    }

    /**
     * ��ѯ��JX_LUNXUN
     * ��˵����ѧ��ѵ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxLunxunEntity> selectListJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxLunxunBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxLunxunBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,������Ϣ
      */
    public ExcuteResult insertJxLunxun(JxLunxunEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxLunxun");
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxLunxunSelective(JxLunxunEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxLunxunSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_LUNXUN,��ѧ��ѵ��,�޸�
      */
    public ExcuteResult updateJxLunxunByPrimaryKey(JxLunxunEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxLunxunByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxLunxunBySqlWhere(JxLunxunEntity entity, JxLunxunSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxLunxunBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_LUNXUN,��ѧ��ѵ��,�޸�
      */
    public ExcuteResult updateJxLunxunBySqlWhereSelective(JxLunxunEntity entity, JxLunxunSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxLunxunBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_LUNXUN,��ѧ��ѵ��,�޸�
      */
    public ExcuteResult updateJxLunxunByPrimaryKeySelective(JxLunxunEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxLunxunByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxLunxunByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxLunxunByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxLunxunBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_LUNXUN,��ѧ��ѵ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxLunxunBySqlWhere");
    }
}