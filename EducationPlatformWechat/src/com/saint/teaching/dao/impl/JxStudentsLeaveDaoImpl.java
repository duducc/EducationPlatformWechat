package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import com.saint.teaching.dao.IJxStudentsLeaveDao;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STUDENTS_LEAVE
	*表说明学生请假
  */
public class JxStudentsLeaveDaoImpl extends BaseDaoImpl implements IJxStudentsLeaveDao {
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
    	*分页查询表JX_STUDENTS_LEAVE
    	*表说明学生请假
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsLeaveEntity> selectListPageJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsLeaveBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsLeaveEntity selectJxStudentsLeaveByPrimaryKey(String xh) {
        return (JxStudentsLeaveEntity)getObject(xh, "selectJxStudentsLeaveByPrimaryKey");
    }

    /**
     * 查询表JX_STUDENTS_LEAVE
     * 表说明学生请假
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsLeaveBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsLeaveBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,插入信息
      */
    public ExcuteResult insertJxStudentsLeave(JxStudentsLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsLeave");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsLeaveSelective(JxStudentsLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsLeaveSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentsLeaveByPrimaryKey(JxStudentsLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsLeaveByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsLeaveBySqlWhere(JxStudentsLeaveEntity entity, JxStudentsLeaveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsLeaveBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentsLeaveBySqlWhereSelective(JxStudentsLeaveEntity entity, JxStudentsLeaveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsLeaveBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentsLeaveByPrimaryKeySelective(JxStudentsLeaveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsLeaveByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsLeaveByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsLeaveBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_LEAVE,学生请假表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsLeaveBySqlWhere");
    }
    
    @Override
	public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveByStuid(String xh) {
		return getObjectList(xh,"selectListJxStudentsLeaveByStuid");
	}

}