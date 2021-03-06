package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxCoursePlanService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxCoursePlanByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxCoursePlan(JxCoursePlanEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxCoursePlanSelective(JxCoursePlanEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxCoursePlanEntity> selectListPageJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxCoursePlanEntity> selectListJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxCoursePlanBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxCoursePlanEntity selectJxCoursePlanByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxCoursePlanBySqlWhereSelective(@Param("record") JxCoursePlanEntity record, @Param("sqlWhere") JxCoursePlanSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxCoursePlanBySqlWhere(@Param("record") JxCoursePlanEntity record, @Param("sqlWhere") JxCoursePlanSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxCoursePlanByPrimaryKeySelective(JxCoursePlanEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxCoursePlanByPrimaryKey(JxCoursePlanEntity record);
}