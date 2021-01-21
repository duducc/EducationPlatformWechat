package com.saint.systemManager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.dao.IFrmDepartmentDao;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名FRM_DEPARTMENT
	*表说明部门信息
  */
public class FrmDepartmentDaoImpl extends BaseDaoImpl implements IFrmDepartmentDao {

    /**
    	*方法注释信息
    	*分页查询表FRM_DEPARTMENT
    	*表说明部门信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<FrmDepartmentEntity> selectListPageFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageFrmDepartmentBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public FrmDepartmentEntity selectFrmDepartmentByPrimaryKey(String glbm) {
        return (FrmDepartmentEntity)getObject(glbm, "selectFrmDepartmentByPrimaryKey");
    }

    /**
     * 查询表FRM_DEPARTMENT
     * 表说明部门信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListFrmDepartmentBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListFrmDepartmentBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,插入信息
      */
    public ExcuteResult insertFrmDepartment(FrmDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmDepartment");
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertFrmDepartmentSelective(FrmDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmDepartmentSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*FRM_DEPARTMENT,部门信息表,修改
      */
    public ExcuteResult updateFrmDepartmentByPrimaryKey(FrmDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmDepartmentByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateFrmDepartmentBySqlWhere(FrmDepartmentEntity entity, FrmDepartmentSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmDepartmentBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*FRM_DEPARTMENT,部门信息表,修改
      */
    public ExcuteResult updateFrmDepartmentBySqlWhereSelective(FrmDepartmentEntity entity, FrmDepartmentSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmDepartmentBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*FRM_DEPARTMENT,部门信息表,修改
      */
    public ExcuteResult updateFrmDepartmentByPrimaryKeySelective(FrmDepartmentEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmDepartmentByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteFrmDepartmentByPrimaryKey(String glbm) {
        return excuteDataBase(glbm, ExcuteType.DELETE, "deleteFrmDepartmentByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteFrmDepartmentBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*FRM_DEPARTMENT,部门信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countFrmDepartmentBySqlWhere");
    }
}