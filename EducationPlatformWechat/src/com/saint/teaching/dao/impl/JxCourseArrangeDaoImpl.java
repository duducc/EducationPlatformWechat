package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.dao.IJxCourseArrangeDao;
import com.saint.teaching.sqlWhere.JxCourseArrangeSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_COURSEARRANGE
	*��˵�����ۿογ̰���
  */
public class JxCourseArrangeDaoImpl extends BaseDaoImpl implements IJxCourseArrangeDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_COURSEARRANGE
    	*��˵�����ۿογ̰���
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxCourseArrangeEntity> selectListPageJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxCourseArrangeBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxCourseArrangeEntity selectJxCourseArrangeByPrimaryKey(String xh) {
        return (JxCourseArrangeEntity)getObject(xh, "selectJxCourseArrangeByPrimaryKey");
    }

    /**
     * ��ѯ��JX_COURSEARRANGE
     * ��˵�����ۿογ̰���
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxCourseArrangeEntity> selectListJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxCourseArrangeBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCourseArrangeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,������Ϣ
      */
    public ExcuteResult insertJxCourseArrange(JxCourseArrangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCourseArrange");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCourseArrangeSelective(JxCourseArrangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCourseArrangeSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,�޸�
      */
    public ExcuteResult updateJxCourseArrangeByPrimaryKey(JxCourseArrangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCourseArrangeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxCourseArrangeBySqlWhere(JxCourseArrangeEntity entity, JxCourseArrangeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCourseArrangeBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,�޸�
      */
    public ExcuteResult updateJxCourseArrangeBySqlWhereSelective(JxCourseArrangeEntity entity, JxCourseArrangeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCourseArrangeBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,�޸�
      */
    public ExcuteResult updateJxCourseArrangeByPrimaryKeySelective(JxCourseArrangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCourseArrangeByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxCourseArrangeByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxCourseArrangeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxCourseArrangeBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_COURSEARRANGE,���ۿογ̰��ű�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxCourseArrangeBySqlWhere");
    }
}