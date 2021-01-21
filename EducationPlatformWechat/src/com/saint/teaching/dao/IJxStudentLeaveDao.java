package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentLeaveDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStudentLeaveByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentLeave(JxStudentLeaveEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentLeaveSelective(JxStudentLeaveEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStudentLeaveEntity> selectListPageJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStudentLeaveEntity selectJxStudentLeaveByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStudentLeaveEntity> selectListJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentLeaveBySql(String sql);
    /**
     * 查询序列
     * @param sqlWhere
     * @return
     */
     int selectXhJxStudentLeaveBySql();

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentLeaveBySqlWhereSelective(@Param("record") JxStudentLeaveEntity record, @Param("sqlWhere") JxStudentLeaveSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStudentLeaveBySqlWhere(@Param("record") JxStudentLeaveEntity record, @Param("sqlWhere") JxStudentLeaveSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentLeaveByPrimaryKeySelective(JxStudentLeaveEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStudentLeaveByPrimaryKey(JxStudentLeaveEntity record);
}