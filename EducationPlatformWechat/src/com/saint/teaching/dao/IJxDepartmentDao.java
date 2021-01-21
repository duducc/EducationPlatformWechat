package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxDepartmentEntity;
import com.saint.teaching.sqlWhere.JxDepartmentSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxDepartmentDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxDepartmentByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxDepartment(JxDepartmentEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxDepartmentSelective(JxDepartmentEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxDepartmentEntity> selectListPageJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxDepartmentEntity selectJxDepartmentByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxDepartmentEntity> selectListJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxDepartmentBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxDepartmentBySqlWhereSelective(@Param("record") JxDepartmentEntity record, @Param("sqlWhere") JxDepartmentSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxDepartmentBySqlWhere(@Param("record") JxDepartmentEntity record, @Param("sqlWhere") JxDepartmentSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxDepartmentByPrimaryKeySelective(JxDepartmentEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxDepartmentByPrimaryKey(JxDepartmentEntity record);
}