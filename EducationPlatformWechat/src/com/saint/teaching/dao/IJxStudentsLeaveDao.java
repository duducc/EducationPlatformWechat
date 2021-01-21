package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentsLeaveDao {
	/**
     * 查询序列
     * @param sqlWhere
     * @return
     */
     int selectXhJxStudentLeaveBySql();
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStudentsLeaveByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsLeave(JxStudentsLeaveEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsLeaveSelective(JxStudentsLeaveEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStudentsLeaveEntity> selectListPageJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStudentsLeaveEntity selectJxStudentsLeaveByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStudentsLeaveEntity> selectListJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentsLeaveBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsLeaveBySqlWhereSelective(@Param("record") JxStudentsLeaveEntity record, @Param("sqlWhere") JxStudentsLeaveSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStudentsLeaveBySqlWhere(@Param("record") JxStudentsLeaveEntity record, @Param("sqlWhere") JxStudentsLeaveSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsLeaveByPrimaryKeySelective(JxStudentsLeaveEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStudentsLeaveByPrimaryKey(JxStudentsLeaveEntity record);
    /**
    * 根据主键查询多条
    * @return
    */
	List<JxStudentsLeaveEntity> selectListJxStudentsLeaveByStuid(String xh);

}