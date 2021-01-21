package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStencilEntity;
import com.saint.teaching.dao.IJxStencilDao;
import com.saint.teaching.sqlWhere.JxStencilSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STENCIL
	*表说明评价模板
  */
public class JxStencilDaoImpl extends BaseDaoImpl implements IJxStencilDao {

    /**
    	*方法注释信息
    	*分页查询表JX_STENCIL
    	*表说明评价模板
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStencilEntity> selectListPageJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStencilBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStencilEntity selectJxStencilByPrimaryKey(String xh) {
        return (JxStencilEntity)getObject(xh, "selectJxStencilByPrimaryKey");
    }

    /**
     * 查询表JX_STENCIL
     * 表说明评价模板
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStencilEntity> selectListJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStencilBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStencilBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,插入信息
      */
    public ExcuteResult insertJxStencil(JxStencilEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStencil");
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStencilSelective(JxStencilEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStencilSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STENCIL,评价模板表,修改
      */
    public ExcuteResult updateJxStencilByPrimaryKey(JxStencilEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStencilByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStencilBySqlWhere(JxStencilEntity entity, JxStencilSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStencilBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STENCIL,评价模板表,修改
      */
    public ExcuteResult updateJxStencilBySqlWhereSelective(JxStencilEntity entity, JxStencilSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStencilBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STENCIL,评价模板表,修改
      */
    public ExcuteResult updateJxStencilByPrimaryKeySelective(JxStencilEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStencilByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStencilByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStencilByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStencilBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STENCIL,评价模板表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStencilBySqlWhere");
    }
}