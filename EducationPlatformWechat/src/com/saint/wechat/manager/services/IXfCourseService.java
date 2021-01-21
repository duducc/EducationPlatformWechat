package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfHoldingTaskEntity;
import com.saint.wechat.manager.sqlWhere.XfCourseSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IXfCourseService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfCourseByPrimaryKey(String courseId);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfCourse(XfCourseEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseSelective(XfCourseEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfCourseEntity> selectListPageXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere);
    /**
     * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
     * @param sqlWhere
     * @return
     */
     List<XfCourseEntity> selectXfBarcodeCourselist(String addunit,String startyear);
    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfCourseEntity> selectListXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfCourseBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfCourseEntity selectXfCourseByPrimaryKey(String courseId);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfCourseBySqlWhereSelective(@Param("record") XfCourseEntity record, @Param("sqlWhere") XfCourseSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfCourseBySqlWhere(@Param("record") XfCourseEntity record, @Param("sqlWhere") XfCourseSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfCourseByPrimaryKeySelective(XfCourseEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfCourseByPrimaryKey(XfCourseEntity record);
    /**
     * 新增一行记录
     * @param record
     * @return
     */
     ExcuteResult insertXfHoldingTask(XfHoldingTaskEntity record);
     /**
      * 根据主键更新一条记录
      * @return
      */
     ExcuteResult updateXfHoldingTaskByPrimaryKey(XfHoldingTaskEntity record);
     /**
      * 根据主键查询一条记录
      * @return
      */
     XfHoldingTaskEntity selectXfHoldingTaskByPrimaryKey(String usernumber);
}