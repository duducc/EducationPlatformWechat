package com.saint.teaching.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxSignErrorEntity;
import com.saint.teaching.sqlWhere.JxSignErrorSqlWhere;

public interface IJxSignErrorDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxSignErrorByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxSignError(JxSignErrorEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxSignErrorSelective(JxSignErrorEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxSignErrorEntity> selectListPageJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxSignErrorEntity selectJxSignErrorByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxSignErrorEntity> selectListJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxSignErrorBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxSignErrorBySqlWhereSelective(@Param("record") JxSignErrorEntity record, @Param("sqlWhere") JxSignErrorSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxSignErrorBySqlWhere(@Param("record") JxSignErrorEntity record, @Param("sqlWhere") JxSignErrorSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxSignErrorByPrimaryKeySelective(JxSignErrorEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxSignErrorByPrimaryKey(JxSignErrorEntity record);
}