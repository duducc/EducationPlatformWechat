package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStencilEntity;
import com.saint.teaching.sqlWhere.JxStencilSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStencilService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStencilByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStencil(JxStencilEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStencilSelective(JxStencilEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStencilEntity> selectListPageJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStencilEntity> selectListJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStencilBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStencilEntity selectJxStencilByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStencilBySqlWhereSelective(@Param("record") JxStencilEntity record, @Param("sqlWhere") JxStencilSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStencilBySqlWhere(@Param("record") JxStencilEntity record, @Param("sqlWhere") JxStencilSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStencilByPrimaryKeySelective(JxStencilEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStencilByPrimaryKey(JxStencilEntity record);
}