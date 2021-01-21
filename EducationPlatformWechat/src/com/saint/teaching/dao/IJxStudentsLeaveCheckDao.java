package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentsLeaveCheckDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStudentsLeaveCheckByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsLeaveCheck(JxStudentsLeaveCheckEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsLeaveCheckSelective(JxStudentsLeaveCheckEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStudentsLeaveCheckEntity> selectListPageJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStudentsLeaveCheckEntity selectJxStudentsLeaveCheckByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStudentsLeaveCheckEntity> selectListJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentsLeaveCheckBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsLeaveCheckBySqlWhereSelective(@Param("record") JxStudentsLeaveCheckEntity record, @Param("sqlWhere") JxStudentsLeaveCheckSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStudentsLeaveCheckBySqlWhere(@Param("record") JxStudentsLeaveCheckEntity record, @Param("sqlWhere") JxStudentsLeaveCheckSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsLeaveCheckByPrimaryKeySelective(JxStudentsLeaveCheckEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStudentsLeaveCheckByPrimaryKey(JxStudentsLeaveCheckEntity record);
}