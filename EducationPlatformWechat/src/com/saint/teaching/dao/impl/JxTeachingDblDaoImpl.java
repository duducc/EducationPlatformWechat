package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxTeachingDblEntity;
import com.saint.teaching.dao.IJxTeachingDblDao;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_TEACHING_DBL
	*��˵������
  */
public class JxTeachingDblDaoImpl extends BaseDaoImpl implements IJxTeachingDblDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_TEACHING_DBL
    	*��˵������
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxTeachingDblEntity> selectListPageJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxTeachingDblBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxTeachingDblEntity selectJxTeachingDblByPrimaryKey(String xh) {
        return (JxTeachingDblEntity)getObject(xh, "selectJxTeachingDblByPrimaryKey");
    }

    /**
     * ��ѯ��JX_TEACHING_DBL
     * ��˵������
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingDblEntity> selectListJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxTeachingDblBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingDblBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,������Ϣ
      */
    public ExcuteResult insertJxTeachingDbl(JxTeachingDblEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingDbl");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingDblSelective(JxTeachingDblEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingDblSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_TEACHING_DBL,������,�޸�
      */
    public ExcuteResult updateJxTeachingDblByPrimaryKey(JxTeachingDblEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingDblByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxTeachingDblBySqlWhere(JxTeachingDblEntity entity, JxTeachingDblSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingDblBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_TEACHING_DBL,������,�޸�
      */
    public ExcuteResult updateJxTeachingDblBySqlWhereSelective(JxTeachingDblEntity entity, JxTeachingDblSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingDblBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_TEACHING_DBL,������,�޸�
      */
    public ExcuteResult updateJxTeachingDblByPrimaryKeySelective(JxTeachingDblEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingDblByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingDblByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxTeachingDblByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxTeachingDblBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_TEACHING_DBL,������
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxTeachingDblBySqlWhere");
    }
}