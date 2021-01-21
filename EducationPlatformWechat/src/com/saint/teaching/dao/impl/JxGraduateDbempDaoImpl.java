package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxGraduateDbempEntity;
import com.saint.teaching.dao.IJxGraduateDbempDao;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_GRADUATE_DBEMP
	*��˵���о������μ���Ա
  */
public class JxGraduateDbempDaoImpl extends BaseDaoImpl implements IJxGraduateDbempDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_GRADUATE_DBEMP
    	*��˵���о������μ���Ա
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxGraduateDbempEntity> selectListPageJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxGraduateDbempBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxGraduateDbempEntity selectJxGraduateDbempByPrimaryKey(String xh) {
        return (JxGraduateDbempEntity)getObject(xh, "selectJxGraduateDbempByPrimaryKey");
    }

    /**
     * ��ѯ��JX_GRADUATE_DBEMP
     * ��˵���о������μ���Ա
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxGraduateDbempEntity> selectListJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxGraduateDbempBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxGraduateDbempBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,������Ϣ
      */
    public ExcuteResult insertJxGraduateDbemp(JxGraduateDbempEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxGraduateDbemp");
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxGraduateDbempSelective(JxGraduateDbempEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxGraduateDbempSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
      */
    public ExcuteResult updateJxGraduateDbempByPrimaryKey(JxGraduateDbempEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxGraduateDbempByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxGraduateDbempBySqlWhere(JxGraduateDbempEntity entity, JxGraduateDbempSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxGraduateDbempBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
      */
    public ExcuteResult updateJxGraduateDbempBySqlWhereSelective(JxGraduateDbempEntity entity, JxGraduateDbempSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxGraduateDbempBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
      */
    public ExcuteResult updateJxGraduateDbempByPrimaryKeySelective(JxGraduateDbempEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxGraduateDbempByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDbempByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxGraduateDbempByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxGraduateDbempBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxGraduateDbempBySqlWhere");
    }
}