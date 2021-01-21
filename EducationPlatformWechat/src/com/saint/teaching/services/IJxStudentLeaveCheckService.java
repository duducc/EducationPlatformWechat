package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentLeaveCheckEntity;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentLeaveCheckService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStudentLeaveCheckByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentLeaveCheck(JxStudentLeaveCheckEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentLeaveCheckSelective(JxStudentLeaveCheckEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStudentLeaveCheckEntity> selectListPageJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStudentLeaveCheckEntity> selectListJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentLeaveCheckBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStudentLeaveCheckEntity selectJxStudentLeaveCheckByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentLeaveCheckBySqlWhereSelective(@Param("record") JxStudentLeaveCheckEntity record, @Param("sqlWhere") JxStudentLeaveCheckSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStudentLeaveCheckBySqlWhere(@Param("record") JxStudentLeaveCheckEntity record, @Param("sqlWhere") JxStudentLeaveCheckSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentLeaveCheckByPrimaryKeySelective(JxStudentLeaveCheckEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStudentLeaveCheckByPrimaryKey(JxStudentLeaveCheckEntity record);
}