package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCoursezxTimeEntity;
import com.saint.teaching.sqlWhere.JxCoursezxTimeSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxCoursezxTimeDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxCoursezxTimeByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxCoursezxTime(JxCoursezxTimeEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxCoursezxTimeSelective(JxCoursezxTimeEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxCoursezxTimeEntity> selectListPageJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxCoursezxTimeEntity selectJxCoursezxTimeByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxCoursezxTimeEntity> selectListJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxCoursezxTimeBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxCoursezxTimeBySqlWhereSelective(@Param("record") JxCoursezxTimeEntity record, @Param("sqlWhere") JxCoursezxTimeSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxCoursezxTimeBySqlWhere(@Param("record") JxCoursezxTimeEntity record, @Param("sqlWhere") JxCoursezxTimeSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxCoursezxTimeByPrimaryKeySelective(JxCoursezxTimeEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxCoursezxTimeByPrimaryKey(JxCoursezxTimeEntity record);
}