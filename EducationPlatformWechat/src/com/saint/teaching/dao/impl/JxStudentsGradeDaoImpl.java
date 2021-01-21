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
	*类注释信息
	*表名JX_STUDENTS_GRADE
	*表说明学员分数明细
  */
public class JxStudentsGradeDaoImpl extends BaseDaoImpl implements IJxStudentsGradeDao {

    /**
    	*方法注释信息
    	*分页查询表JX_STUDENTS_GRADE
    	*表说明学员分数明细
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsGradeEntity> selectListPageJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsGradeBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsGradeEntity selectJxStudentsGradeByPrimaryKey(String xh) {
        return (JxStudentsGradeEntity)getObject(xh, "selectJxStudentsGradeByPrimaryKey");
    }

    /**
     * 查询表JX_STUDENTS_GRADE
     * 表说明学员分数明细
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsGradeEntity> selectListJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsGradeBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsGradeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,插入信息
      */
    public ExcuteResult insertJxStudentsGrade(JxStudentsGradeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsGrade");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsGradeSelective(JxStudentsGradeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsGradeSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_GRADE,学员分数明细表,修改
      */
    public ExcuteResult updateJxStudentsGradeByPrimaryKey(JxStudentsGradeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsGradeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsGradeBySqlWhere(JxStudentsGradeEntity entity, JxStudentsGradeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsGradeBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_GRADE,学员分数明细表,修改
      */
    public ExcuteResult updateJxStudentsGradeBySqlWhereSelective(JxStudentsGradeEntity entity, JxStudentsGradeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsGradeBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_GRADE,学员分数明细表,修改
      */
    public ExcuteResult updateJxStudentsGradeByPrimaryKeySelective(JxStudentsGradeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsGradeByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsGradeByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsGradeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsGradeBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_GRADE,学员分数明细表
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