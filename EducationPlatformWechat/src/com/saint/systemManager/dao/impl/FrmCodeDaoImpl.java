package com.saint.systemManager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.dao.IFrmCodeDao;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名FRM_CODE
	*表说明代码信息
  */
public class FrmCodeDaoImpl extends BaseDaoImpl implements IFrmCodeDao {

    /**
    	*方法注释信息
    	*分页查询表FRM_CODE
    	*表说明代码信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<FrmCodeEntity> selectListPageFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageFrmCodeBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public FrmCodeEntity selectFrmCodeByPrimaryKey(FrmCodeKey key) {
        return (FrmCodeEntity)getObject(key, "selectFrmCodeByPrimaryKey");
    }

    /**
     * 查询表FRM_CODE
     * 表说明代码信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<FrmCodeEntity> selectListFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListFrmCodeBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListFrmCodeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,插入信息
      */
    public ExcuteResult insertFrmCode(FrmCodeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmCode");
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertFrmCodeSelective(FrmCodeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmCodeSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*FRM_CODE,代码信息表,修改
      */
    public ExcuteResult updateFrmCodeByPrimaryKey(FrmCodeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmCodeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateFrmCodeBySqlWhere(FrmCodeEntity entity, FrmCodeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmCodeBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*FRM_CODE,代码信息表,修改
      */
    public ExcuteResult updateFrmCodeBySqlWhereSelective(FrmCodeEntity entity, FrmCodeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmCodeBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*FRM_CODE,代码信息表,修改
      */
    public ExcuteResult updateFrmCodeByPrimaryKeySelective(FrmCodeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmCodeByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteFrmCodeByPrimaryKey(FrmCodeKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteFrmCodeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteFrmCodeBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*FRM_CODE,代码信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countFrmCodeBySqlWhere");
    }
}