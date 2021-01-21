package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxLunxunDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxLunxunByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxLunxun(JxLunxunEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxLunxunSelective(JxLunxunEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxLunxunEntity> selectListPageJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxLunxunEntity selectJxLunxunByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxLunxunEntity> selectListJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxLunxunBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxLunxunBySqlWhereSelective(@Param("record") JxLunxunEntity record, @Param("sqlWhere") JxLunxunSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxLunxunBySqlWhere(@Param("record") JxLunxunEntity record, @Param("sqlWhere") JxLunxunSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxLunxunByPrimaryKeySelective(JxLunxunEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxLunxunByPrimaryKey(JxLunxunEntity record);
}