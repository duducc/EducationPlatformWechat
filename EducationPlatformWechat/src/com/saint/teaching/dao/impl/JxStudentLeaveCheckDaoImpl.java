package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentLeaveCheckEntity;
import com.saint.teaching.dao.IJxStudentLeaveCheckDao;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STUDENT_LEAVE_CHECK
	*表说明学生请假审核
  */
public class JxStudentLeaveCheckDaoImpl extends BaseDaoImpl implements IJxStudentLeaveCheckDao {

    /**
    	*方法注释信息
    	*分页查询表JX_STUDENT_LEAVE_CHECK
    	*表说明学生请假审核
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentLeaveCheckEntity> selectListPageJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentLeaveCheckBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentLeaveCheckEntity selectJxStudentLeaveCheckByPrimaryKey(String xh) {
        return (JxStudentLeaveCheckEntity)getObject(xh, "selectJxStudentLeaveCheckByPrimaryKey");
    }

    /**
     * 查询表JX_STUDENT_LEAVE_CHECK
     * 表说明学生请假审核
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentLeaveCheckEntity> selectListJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentLeaveCheckBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentLeaveCheckBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,插入信息
      */
    public ExcuteResult insertJxStudentLeaveCheck(JxStudentLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentLeaveCheck");
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentLeaveCheckSelective(JxStudentLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentLeaveCheckSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
      */
    public ExcuteResult updateJxStudentLeaveCheckByPrimaryKey(JxStudentLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentLeaveCheckByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckEntity entity, JxStudentLeaveCheckSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentLeaveCheckBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
      */
    public ExcuteResult updateJxStudentLeaveCheckBySqlWhereSelective(JxStudentLeaveCheckEntity entity, JxStudentLeaveCheckSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentLeaveCheckBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
      */
    public ExcuteResult updateJxStudentLeaveCheckByPrimaryKeySelective(JxStudentLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentLeaveCheckByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveCheckByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentLeaveCheckByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentLeaveCheckBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentLeaveCheckBySqlWhere");
    }
}