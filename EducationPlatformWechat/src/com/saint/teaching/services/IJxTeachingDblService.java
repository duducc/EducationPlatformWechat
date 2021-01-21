package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingDblEntity;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxTeachingDblService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxTeachingDblByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingDbl(JxTeachingDblEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingDblSelective(JxTeachingDblEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxTeachingDblEntity> selectListPageJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxTeachingDblEntity> selectListJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxTeachingDblBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxTeachingDblEntity selectJxTeachingDblByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxTeachingDblBySqlWhereSelective(@Param("record") JxTeachingDblEntity record, @Param("sqlWhere") JxTeachingDblSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxTeachingDblBySqlWhere(@Param("record") JxTeachingDblEntity record, @Param("sqlWhere") JxTeachingDblSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxTeachingDblByPrimaryKeySelective(JxTeachingDblEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxTeachingDblByPrimaryKey(JxTeachingDblEntity record);
}