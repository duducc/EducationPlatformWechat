package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseTicklingEntity;
import com.saint.wechat.manager.bean.XfCourseTicklingKey;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfCourseTicklingDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseTickling(XfCourseTicklingEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseTicklingSelective(XfCourseTicklingEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfCourseTicklingEntity> selectListPageXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfCourseTicklingEntity selectXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfCourseTicklingEntity> selectListXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfCourseTicklingBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfCourseTicklingBySqlWhereSelective(@Param("record") XfCourseTicklingEntity record, @Param("sqlWhere") XfCourseTicklingSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfCourseTicklingBySqlWhere(@Param("record") XfCourseTicklingEntity record, @Param("sqlWhere") XfCourseTicklingSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfCourseTicklingByPrimaryKeySelective(XfCourseTicklingEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfCourseTicklingByPrimaryKey(XfCourseTicklingEntity record);
}