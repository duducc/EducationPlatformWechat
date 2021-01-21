package com.saint.research.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyProjectPlanEntity;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IKyProjectPlanService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteKyProjectPlanByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertKyProjectPlan(KyProjectPlanEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertKyProjectPlanSelective(KyProjectPlanEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<KyProjectPlanEntity> selectListPageKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<KyProjectPlanEntity> selectListKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListKyProjectPlanBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    KyProjectPlanEntity selectKyProjectPlanByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateKyProjectPlanBySqlWhereSelective(@Param("record") KyProjectPlanEntity record, @Param("sqlWhere") KyProjectPlanSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateKyProjectPlanBySqlWhere(@Param("record") KyProjectPlanEntity record, @Param("sqlWhere") KyProjectPlanSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateKyProjectPlanByPrimaryKeySelective(KyProjectPlanEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateKyProjectPlanByPrimaryKey(KyProjectPlanEntity record);
}