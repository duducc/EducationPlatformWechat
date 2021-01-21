package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsSignEntity;
import com.saint.teaching.dao.IJxStudentsSignDao;
import com.saint.teaching.sqlWhere.JxStudentsSignSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDENTS_SIGN
	*��˵�� ѧ��ǩ����Ϣ
  */
public class JxStudentsSignDaoImpl extends BaseDaoImpl implements IJxStudentsSignDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STUDENTS_SIGN
    	*��˵�� ѧ��ǩ����Ϣ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsSignEntity> selectListPageJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsSignBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsSignEntity selectJxStudentsSignByPrimaryKey(String xh) {
        return (JxStudentsSignEntity)getObject(xh, "selectJxStudentsSignByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDENTS_SIGN
     * ��˵�� ѧ��ǩ����Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsSignEntity> selectListJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsSignBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsSignBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxStudentsSign(JxStudentsSignEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsSign");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsSignSelective(JxStudentsSignEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsSignSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsSignByPrimaryKey(JxStudentsSignEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsSignByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsSignBySqlWhere(JxStudentsSignEntity entity, JxStudentsSignSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsSignBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsSignBySqlWhereSelective(JxStudentsSignEntity entity, JxStudentsSignSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsSignBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsSignByPrimaryKeySelective(JxStudentsSignEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsSignByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsSignByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsSignByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsSignBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsSignBySqlWhere");
    }
}