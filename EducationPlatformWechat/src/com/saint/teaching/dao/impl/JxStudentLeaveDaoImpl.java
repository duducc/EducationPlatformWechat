package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.dao.IJxStudentLeaveDao;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STUDENTS_LEAVE
	*表说明学生请假
  */
public class JxStudentLeaveDaoImpl extends BaseDaoImpl implements IJxStudentLeaveDao {

    /**
    	*方法注释信息
    	*分页查询表JX_STUDENTS_LEAVE
    	*表说明学生请假
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentLeaveEntity> selectListPageJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentLeaveBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentLeaveEntity selectJxStudentLeaveByPrimaryKey(String xh) {
        return (JxStudentLeaveEntity)getObject(xh, "selectJxStudentLeaveByPrimaryKey");
    }

    /**
     * 查询表JX_STUDENTS_LEAVE
     * 表说明学生请假
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentLeaveEntity> selectListJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentLeaveBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentLeaveBySql(String sql) {
        return getListBySql(sql); 
    }
    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public int selectXhJxStudentLeaveBySql() {
	    return (Integer)getObject("", "selectXhJxStudentLeaveBySql");
	}
    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,插入信息
      */
    public ExcuteResult insertJxStudentLeave(JxStudentLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentLeave");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentLeaveSelective(JxStudentLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentLeaveSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentLeaveByPrimaryKey(JxStudentLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentLeaveByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentLeaveBySqlWhere(JxStudentLeaveEntity entity, JxStudentLeaveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentLeaveBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentLeaveBySqlWhereSelective(JxStudentLeaveEntity entity, JxStudentLeaveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentLeaveBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentLeaveByPrimaryKeySelective(JxStudentLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentLeaveByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentLeaveByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentLeaveBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_LEAVE,学生请假表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentLeaveBySqlWhere");
    }
}