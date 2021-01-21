package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.dao.IJxStudentsDao;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STUDENTS
	*表说明学员信息
  */
public class JxStudentsDaoImpl extends BaseDaoImpl implements IJxStudentsDao {
	
	@Override
	public int selectJXStudentsSequence() {
	    return (Integer)getObject("", "selectJXStudentsSequence");
	}
    /**
    	*方法注释信息
    	*分页查询表JX_STUDENTS
    	*表说明学员信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsEntity> selectListPageJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsEntity selectJxStudentsByPrimaryKey(String xh) {
        return (JxStudentsEntity)getObject(xh, "selectJxStudentsByPrimaryKey");
    }

    /**
     * 查询表JX_STUDENTS
     * 表说明学员信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsEntity> selectListJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,插入信息
      */
    public ExcuteResult insertJxStudents(JxStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudents");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsSelective(JxStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS,学员信息表,修改
      */
    public ExcuteResult updateJxStudentsByPrimaryKey(JxStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsBySqlWhere(JxStudentsEntity entity, JxStudentsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS,学员信息表,修改
      */
    public ExcuteResult updateJxStudentsBySqlWhereSelective(JxStudentsEntity entity, JxStudentsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS,学员信息表,修改
      */
    public ExcuteResult updateJxStudentsByPrimaryKeySelective(JxStudentsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS,学员信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsBySqlWhere");
    }
}