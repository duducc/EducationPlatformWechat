package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxEvaluateTeacherEntity;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxEvaluateTeacherDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxEvaluateTeacherByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxEvaluateTeacher(JxEvaluateTeacherEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxEvaluateTeacherSelective(JxEvaluateTeacherEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxEvaluateTeacherEntity> selectListPageJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxEvaluateTeacherEntity selectJxEvaluateTeacherByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxEvaluateTeacherEntity> selectListJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxEvaluateTeacherBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxEvaluateTeacherBySqlWhereSelective(@Param("record") JxEvaluateTeacherEntity record, @Param("sqlWhere") JxEvaluateTeacherSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxEvaluateTeacherBySqlWhere(@Param("record") JxEvaluateTeacherEntity record, @Param("sqlWhere") JxEvaluateTeacherSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxEvaluateTeacherByPrimaryKeySelective(JxEvaluateTeacherEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxEvaluateTeacherByPrimaryKey(JxEvaluateTeacherEntity record);
}