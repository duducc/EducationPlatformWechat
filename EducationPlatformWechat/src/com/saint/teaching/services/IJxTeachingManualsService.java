package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingManualsEntity;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxTeachingManualsService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxTeachingManualsByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingManuals(JxTeachingManualsEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingManualsSelective(JxTeachingManualsEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxTeachingManualsEntity> selectListPageJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxTeachingManualsEntity> selectListJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxTeachingManualsBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxTeachingManualsEntity selectJxTeachingManualsByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxTeachingManualsBySqlWhereSelective(@Param("record") JxTeachingManualsEntity record, @Param("sqlWhere") JxTeachingManualsSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxTeachingManualsBySqlWhere(@Param("record") JxTeachingManualsEntity record, @Param("sqlWhere") JxTeachingManualsSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxTeachingManualsByPrimaryKeySelective(JxTeachingManualsEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxTeachingManualsByPrimaryKey(JxTeachingManualsEntity record);
}