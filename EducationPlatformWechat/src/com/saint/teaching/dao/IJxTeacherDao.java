package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeacherEntity;
import com.saint.teaching.sqlWhere.JxTeacherSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxTeacherDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxTeacherByPrimaryKey(String usernumber);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxTeacher(JxTeacherEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxTeacherSelective(JxTeacherEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxTeacherEntity> selectListPageJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxTeacherEntity selectJxTeacherByPrimaryKey(String usernumber);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxTeacherEntity> selectListJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxTeacherBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxTeacherBySqlWhereSelective(@Param("record") JxTeacherEntity record, @Param("sqlWhere") JxTeacherSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxTeacherBySqlWhere(@Param("record") JxTeacherEntity record, @Param("sqlWhere") JxTeacherSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxTeacherByPrimaryKeySelective(JxTeacherEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxTeacherByPrimaryKey(JxTeacherEntity record);
}