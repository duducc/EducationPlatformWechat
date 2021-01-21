package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveKey;
import com.saint.teaching.sqlWhere.JxStudentsInternshipProveSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentsInternshipProveDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsInternshipProve(JxStudentsInternshipProveEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsInternshipProveSelective(JxStudentsInternshipProveEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStudentsInternshipProveEntity> selectListPageJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStudentsInternshipProveEntity selectJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStudentsInternshipProveEntity> selectListJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentsInternshipProveBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsInternshipProveBySqlWhereSelective(@Param("record") JxStudentsInternshipProveEntity record, @Param("sqlWhere") JxStudentsInternshipProveSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStudentsInternshipProveBySqlWhere(@Param("record") JxStudentsInternshipProveEntity record, @Param("sqlWhere") JxStudentsInternshipProveSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsInternshipProveByPrimaryKeySelective(JxStudentsInternshipProveEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveEntity record);
}