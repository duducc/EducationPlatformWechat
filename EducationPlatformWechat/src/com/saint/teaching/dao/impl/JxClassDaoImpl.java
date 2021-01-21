package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.dao.IJxClassDao;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

	/**
		*��ע����Ϣ
		*����JX_CLASS
		*��˵����ѧ�༶
	  */
	public class JxClassDaoImpl extends BaseDaoImpl implements IJxClassDao {
		
		public int selectJxClassSequence() {
		    return (Integer)getObject("", "selectJxClassSequence");
		}
    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_CLASS
    	*��˵����ѧ�༶
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxClassEntity> selectListPageJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxClassBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxClassEntity selectJxClassByPrimaryKey(String xh) {
        return (JxClassEntity)getObject(xh, "selectJxClassByPrimaryKey");
    }

    /**
     * ��ѯ��JX_CLASS
     * ��˵����ѧ�༶
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxClassEntity> selectListJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxClassBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxClassBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,������Ϣ
      */
    public ExcuteResult insertJxClass(JxClassEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxClass");
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxClassSelective(JxClassEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxClassSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_CLASS,��ѧ�༶��,�޸�
      */
    public ExcuteResult updateJxClassByPrimaryKey(JxClassEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxClassByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxClassBySqlWhere(JxClassEntity entity, JxClassSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxClassBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_CLASS,��ѧ�༶��,�޸�
      */
    public ExcuteResult updateJxClassBySqlWhereSelective(JxClassEntity entity, JxClassSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxClassBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_CLASS,��ѧ�༶��,�޸�
      */
    public ExcuteResult updateJxClassByPrimaryKeySelective(JxClassEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxClassByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxClassByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxClassByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxClassBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_CLASS,��ѧ�༶��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxClassBySqlWhere");
    }
}