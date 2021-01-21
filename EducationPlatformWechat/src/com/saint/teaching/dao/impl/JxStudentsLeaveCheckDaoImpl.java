package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import com.saint.teaching.dao.IJxStudentsLeaveCheckDao;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STUDENTS_LEAVE_CHECK
	*表说明请假审批
  */
public class JxStudentsLeaveCheckDaoImpl extends BaseDaoImpl implements IJxStudentsLeaveCheckDao {

    /**
    	*方法注释信息
    	*分页查询表JX_STUDENTS_LEAVE_CHECK
    	*表说明请假审批
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsLeaveCheckEntity> selectListPageJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsLeaveCheckBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsLeaveCheckEntity selectJxStudentsLeaveCheckByPrimaryKey(String xh) {
        return (JxStudentsLeaveCheckEntity)getObject(xh, "selectJxStudentsLeaveCheckByPrimaryKey");
    }

    /**
     * 查询表JX_STUDENTS_LEAVE_CHECK
     * 表说明请假审批
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsLeaveCheckEntity> selectListJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsLeaveCheckBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsLeaveCheckBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,插入信息
      */
    public ExcuteResult insertJxStudentsLeaveCheck(JxStudentsLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsLeaveCheck");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsLeaveCheckSelective(JxStudentsLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsLeaveCheckSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,修改
      */
    public ExcuteResult updateJxStudentsLeaveCheckByPrimaryKey(JxStudentsLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsLeaveCheckByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckEntity entity, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsLeaveCheckBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,修改
      */
    public ExcuteResult updateJxStudentsLeaveCheckBySqlWhereSelective(JxStudentsLeaveCheckEntity entity, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsLeaveCheckBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,修改
      */
    public ExcuteResult updateJxStudentsLeaveCheckByPrimaryKeySelective(JxStudentsLeaveCheckEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsLeaveCheckByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveCheckByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsLeaveCheckByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsLeaveCheckBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsLeaveCheckBySqlWhere");
    }
}