package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxBreakSchoolService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxBreakSchoolByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxBreakSchool(JxBreakSchoolEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxBreakSchoolSelective(JxBreakSchoolEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxBreakSchoolEntity> selectListPageJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxBreakSchoolEntity> selectListJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxBreakSchoolBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxBreakSchoolEntity selectJxBreakSchoolByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxBreakSchoolBySqlWhereSelective(@Param("record") JxBreakSchoolEntity record, @Param("sqlWhere") JxBreakSchoolSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxBreakSchoolBySqlWhere(@Param("record") JxBreakSchoolEntity record, @Param("sqlWhere") JxBreakSchoolSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxBreakSchoolByPrimaryKeySelective(JxBreakSchoolEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxBreakSchoolByPrimaryKey(JxBreakSchoolEntity record);
}