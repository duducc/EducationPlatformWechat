package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxTeachingManusService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxTeachingManusByPrimaryKey(String manuId);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingManus(JxTeachingManusEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingManusSelective(JxTeachingManusEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxTeachingManusEntity> selectListPageJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxTeachingManusEntity> selectListJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxTeachingManusBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxTeachingManusEntity selectJxTeachingManusByPrimaryKey(String manuId);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxTeachingManusBySqlWhereSelective(@Param("record") JxTeachingManusEntity record, @Param("sqlWhere") JxTeachingManusSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxTeachingManusBySqlWhere(@Param("record") JxTeachingManusEntity record, @Param("sqlWhere") JxTeachingManusSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxTeachingManusByPrimaryKeySelective(JxTeachingManusEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxTeachingManusByPrimaryKey(JxTeachingManusEntity record);
}