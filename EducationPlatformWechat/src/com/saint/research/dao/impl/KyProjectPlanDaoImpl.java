package com.saint.research.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KyProjectPlanEntity;
import com.saint.research.dao.IKyProjectPlanDao;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名KY_PROJECTPLAN
	*表说明任务进度计划
  */
public class KyProjectPlanDaoImpl extends BaseDaoImpl implements IKyProjectPlanDao {

    /**
    	*方法注释信息
    	*分页查询表KY_PROJECTPLAN
    	*表说明任务进度计划
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<KyProjectPlanEntity> selectListPageKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageKyProjectPlanBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public KyProjectPlanEntity selectKyProjectPlanByPrimaryKey(String xh) {
        return (KyProjectPlanEntity)getObject(xh, "selectKyProjectPlanByPrimaryKey");
    }

    /**
     * 查询表KY_PROJECTPLAN
     * 表说明任务进度计划
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<KyProjectPlanEntity> selectListKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListKyProjectPlanBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyProjectPlanBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,插入信息
      */
    public ExcuteResult insertKyProjectPlan(KyProjectPlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyProjectPlan");
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyProjectPlanSelective(KyProjectPlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyProjectPlanSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*KY_PROJECTPLAN,任务进度计划表,修改
      */
    public ExcuteResult updateKyProjectPlanByPrimaryKey(KyProjectPlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyProjectPlanByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateKyProjectPlanBySqlWhere(KyProjectPlanEntity entity, KyProjectPlanSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyProjectPlanBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*KY_PROJECTPLAN,任务进度计划表,修改
      */
    public ExcuteResult updateKyProjectPlanBySqlWhereSelective(KyProjectPlanEntity entity, KyProjectPlanSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyProjectPlanBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*KY_PROJECTPLAN,任务进度计划表,修改
      */
    public ExcuteResult updateKyProjectPlanByPrimaryKeySelective(KyProjectPlanEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyProjectPlanByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteKyProjectPlanByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteKyProjectPlanByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteKyProjectPlanBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*KY_PROJECTPLAN,任务进度计划表
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countKyProjectPlanBySqlWhere");
    }
}