package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.dao.IJxCoursePlanDao;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_COURSEPLAN
	*表说明理论课教学进度
  */
public class JxCoursePlanDaoImpl extends BaseDaoImpl implements IJxCoursePlanDao {

    /**
    	*方法注释信息
    	*分页查询表JX_COURSEPLAN
    	*表说明理论课教学进度
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxCoursePlanEntity> selectListPageJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxCoursePlanBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxCoursePlanEntity selectJxCoursePlanByPrimaryKey(String xh) {
        return (JxCoursePlanEntity)getObject(xh, "selectJxCoursePlanByPrimaryKey");
    }

    /**
     * 查询表JX_COURSEPLAN
     * 表说明理论课教学进度
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxCoursePlanEntity> selectListJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxCoursePlanBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCoursePlanBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,插入信息
      */
    public ExcuteResult insertJxCoursePlan(JxCoursePlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCoursePlan");
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCoursePlanSelective(JxCoursePlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCoursePlanSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_COURSEPLAN,理论课教学进度表,修改
      */
    public ExcuteResult updateJxCoursePlanByPrimaryKey(JxCoursePlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCoursePlanByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxCoursePlanBySqlWhere(JxCoursePlanEntity entity, JxCoursePlanSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCoursePlanBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_COURSEPLAN,理论课教学进度表,修改
      */
    public ExcuteResult updateJxCoursePlanBySqlWhereSelective(JxCoursePlanEntity entity, JxCoursePlanSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCoursePlanBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_COURSEPLAN,理论课教学进度表,修改
      */
    public ExcuteResult updateJxCoursePlanByPrimaryKeySelective(JxCoursePlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCoursePlanByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxCoursePlanByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxCoursePlanByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxCoursePlanBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_COURSEPLAN,理论课教学进度表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxCoursePlanBySqlWhere");
    }
}