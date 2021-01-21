package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsGradeEntity;
import com.saint.teaching.dao.IJxStudentsGradeDao;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����JX_STUDENTS_GRADE
	*��˵��ѧԱ������ϸ
  */
public class JxStudentsGradeDaoImpl extends BaseDaoImpl implements IJxStudentsGradeDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��JX_STUDENTS_GRADE
    	*��˵��ѧԱ������ϸ
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsGradeEntity> selectListPageJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsGradeBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsGradeEntity selectJxStudentsGradeByPrimaryKey(String xh) {
        return (JxStudentsGradeEntity)getObject(xh, "selectJxStudentsGradeByPrimaryKey");
    }

    /**
     * ��ѯ��JX_STUDENTS_GRADE
     * ��˵��ѧԱ������ϸ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsGradeEntity> selectListJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsGradeBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsGradeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,������Ϣ
      */
    public ExcuteResult insertJxStudentsGrade(JxStudentsGradeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsGrade");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsGradeSelective(JxStudentsGradeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsGradeSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxStudentsGradeByPrimaryKey(JxStudentsGradeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsGradeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsGradeBySqlWhere(JxStudentsGradeEntity entity, JxStudentsGradeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsGradeBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxStudentsGradeBySqlWhereSelective(JxStudentsGradeEntity entity, JxStudentsGradeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsGradeBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxStudentsGradeByPrimaryKeySelective(JxStudentsGradeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsGradeByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsGradeByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsGradeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsGradeBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsGradeBySqlWhere");
    }

	@Override
	public String queryNextIndex() {
		
		return (String)getObject(null, "queryNextIndexJxStudentsGrade");
	}
}