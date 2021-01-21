package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.dao.IJxLunxunDao;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_LUNXUN
	*表说明教学轮训
  */
public class JxLunxunDaoImpl extends BaseDaoImpl implements IJxLunxunDao {

    /**
    	*方法注释信息
    	*分页查询表JX_LUNXUN
    	*表说明教学轮训
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxLunxunEntity> selectListPageJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxLunxunBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxLunxunEntity selectJxLunxunByPrimaryKey(String xh) {
        return (JxLunxunEntity)getObject(xh, "selectJxLunxunByPrimaryKey");
    }

    /**
     * 查询表JX_LUNXUN
     * 表说明教学轮训
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxLunxunEntity> selectListJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxLunxunBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxLunxunBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,插入信息
      */
    public ExcuteResult insertJxLunxun(JxLunxunEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxLunxun");
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxLunxunSelective(JxLunxunEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxLunxunSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_LUNXUN,教学轮训表,修改
      */
    public ExcuteResult updateJxLunxunByPrimaryKey(JxLunxunEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxLunxunByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxLunxunBySqlWhere(JxLunxunEntity entity, JxLunxunSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxLunxunBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_LUNXUN,教学轮训表,修改
      */
    public ExcuteResult updateJxLunxunBySqlWhereSelective(JxLunxunEntity entity, JxLunxunSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxLunxunBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_LUNXUN,教学轮训表,修改
      */
    public ExcuteResult updateJxLunxunByPrimaryKeySelective(JxLunxunEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxLunxunByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxLunxunByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxLunxunByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxLunxunBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_LUNXUN,教学轮训表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxLunxunBySqlWhere");
    }
}