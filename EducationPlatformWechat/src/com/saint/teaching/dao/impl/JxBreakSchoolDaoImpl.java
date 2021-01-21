package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import com.saint.teaching.dao.IJxBreakSchoolDao;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_BREAKSCHOOL
	*��˵��ѧ��Υ�͵Ǽ�
  */
public class JxBreakSchoolDaoImpl extends BaseDaoImpl implements IJxBreakSchoolDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_BREAKSCHOOL
    	*��˵��ѧ��Υ�͵Ǽ�
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxBreakSchoolEntity> selectListPageJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxBreakSchoolBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxBreakSchoolEntity selectJxBreakSchoolByPrimaryKey(String xh) {
        return (JxBreakSchoolEntity)getObject(xh, "selectJxBreakSchoolByPrimaryKey");
    }

    /**
     * ��ѯ��JX_BREAKSCHOOL
     * ��˵��ѧ��Υ�͵Ǽ�
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxBreakSchoolEntity> selectListJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxBreakSchoolBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxBreakSchoolBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,������Ϣ
      */
    public ExcuteResult insertJxBreakSchool(JxBreakSchoolEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxBreakSchool");
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxBreakSchoolSelective(JxBreakSchoolEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxBreakSchoolSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
      */
    public ExcuteResult updateJxBreakSchoolByPrimaryKey(JxBreakSchoolEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxBreakSchoolByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxBreakSchoolBySqlWhere(JxBreakSchoolEntity entity, JxBreakSchoolSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxBreakSchoolBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
      */
    public ExcuteResult updateJxBreakSchoolBySqlWhereSelective(JxBreakSchoolEntity entity, JxBreakSchoolSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxBreakSchoolBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
      */
    public ExcuteResult updateJxBreakSchoolByPrimaryKeySelective(JxBreakSchoolEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxBreakSchoolByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxBreakSchoolByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxBreakSchoolByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxBreakSchoolBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxBreakSchoolBySqlWhere");
    }
}