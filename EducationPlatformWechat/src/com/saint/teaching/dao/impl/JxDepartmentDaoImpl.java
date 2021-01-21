package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxDepartmentEntity;
import com.saint.teaching.dao.IJxDepartmentDao;
import com.saint.teaching.sqlWhere.JxDepartmentSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_DEPARTMENT
	*表说明教学部门
  */
public class JxDepartmentDaoImpl extends BaseDaoImpl implements IJxDepartmentDao {

    /**
    	*方法注释信息
    	*分页查询表JX_DEPARTMENT
    	*表说明教学部门
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxDepartmentEntity> selectListPageJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxDepartmentBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxDepartmentEntity selectJxDepartmentByPrimaryKey(String xh) {
        return (JxDepartmentEntity)getObject(xh, "selectJxDepartmentByPrimaryKey");
    }

    /**
     * 查询表JX_DEPARTMENT
     * 表说明教学部门
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxDepartmentEntity> selectListJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxDepartmentBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxDepartmentBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,插入信息
      */
    public ExcuteResult insertJxDepartment(JxDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxDepartment");
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxDepartmentSelective(JxDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxDepartmentSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_DEPARTMENT,教学部门表,修改
      */
    public ExcuteResult updateJxDepartmentByPrimaryKey(JxDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxDepartmentByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxDepartmentBySqlWhere(JxDepartmentEntity entity, JxDepartmentSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxDepartmentBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_DEPARTMENT,教学部门表,修改
      */
    public ExcuteResult updateJxDepartmentBySqlWhereSelective(JxDepartmentEntity entity, JxDepartmentSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxDepartmentBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_DEPARTMENT,教学部门表,修改
      */
    public ExcuteResult updateJxDepartmentByPrimaryKeySelective(JxDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxDepartmentByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxDepartmentByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxDepartmentByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxDepartmentBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_DEPARTMENT,教学部门表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxDepartmentBySqlWhere");
    }
}