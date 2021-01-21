package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.dao.IJxClassStudentsDao;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_CLASS_STUDENTS
	*表说明教学学生信息
  */
public class JxClassStudentsDaoImpl extends BaseDaoImpl implements IJxClassStudentsDao {

    /**
    	*方法注释信息
    	*分页查询表JX_CLASS_STUDENTS
    	*表说明教学学生信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxClassStudentsEntity> selectListPageJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxClassStudentsBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxClassStudentsEntity selectJxClassStudentsByPrimaryKey(String xh) {
        return (JxClassStudentsEntity)getObject(xh, "selectJxClassStudentsByPrimaryKey");
    }

    /**
     * 查询表JX_CLASS_STUDENTS
     * 表说明教学学生信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxClassStudentsEntity> selectListJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxClassStudentsBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxClassStudentsBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,插入信息
      */
    public ExcuteResult insertJxClassStudents(JxClassStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxClassStudents");
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxClassStudentsSelective(JxClassStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxClassStudentsSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_CLASS_STUDENTS,教学学生信息表,修改
      */
    public ExcuteResult updateJxClassStudentsByPrimaryKey(JxClassStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxClassStudentsByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxClassStudentsBySqlWhere(JxClassStudentsEntity entity, JxClassStudentsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxClassStudentsBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_CLASS_STUDENTS,教学学生信息表,修改
      */
    public ExcuteResult updateJxClassStudentsBySqlWhereSelective(JxClassStudentsEntity entity, JxClassStudentsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxClassStudentsBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_CLASS_STUDENTS,教学学生信息表,修改
      */
    public ExcuteResult updateJxClassStudentsByPrimaryKeySelective(JxClassStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxClassStudentsByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxClassStudentsByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxClassStudentsByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxClassStudentsBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_CLASS_STUDENTS,教学学生信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxClassStudentsBySqlWhere");
    }
}