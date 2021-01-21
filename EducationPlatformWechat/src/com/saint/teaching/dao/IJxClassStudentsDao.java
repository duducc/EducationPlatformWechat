package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxClassStudentsDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxClassStudentsByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxClassStudents(JxClassStudentsEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxClassStudentsSelective(JxClassStudentsEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxClassStudentsEntity> selectListPageJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxClassStudentsEntity selectJxClassStudentsByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxClassStudentsEntity> selectListJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxClassStudentsBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxClassStudentsBySqlWhereSelective(@Param("record") JxClassStudentsEntity record, @Param("sqlWhere") JxClassStudentsSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxClassStudentsBySqlWhere(@Param("record") JxClassStudentsEntity record, @Param("sqlWhere") JxClassStudentsSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxClassStudentsByPrimaryKeySelective(JxClassStudentsEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxClassStudentsByPrimaryKey(JxClassStudentsEntity record);
}