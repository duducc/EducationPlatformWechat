package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseSignupEntity;
import com.saint.wechat.manager.bean.XfCourseSignupKey;
import com.saint.wechat.manager.sqlWhere.XfCourseSignupSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IXfCourseSignupService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfCourseSignupByPrimaryKey(XfCourseSignupKey key);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseSignup(XfCourseSignupEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseSignupSelective(XfCourseSignupEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfCourseSignupEntity> selectListPageXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfCourseSignupEntity> selectListXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfCourseSignupBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfCourseSignupEntity selectXfCourseSignupByPrimaryKey(XfCourseSignupKey key);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfCourseSignupBySqlWhereSelective(@Param("record") XfCourseSignupEntity record, @Param("sqlWhere") XfCourseSignupSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfCourseSignupBySqlWhere(@Param("record") XfCourseSignupEntity record, @Param("sqlWhere") XfCourseSignupSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfCourseSignupByPrimaryKeySelective(XfCourseSignupEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfCourseSignupByPrimaryKey(XfCourseSignupEntity record);
    
    
    ExcuteResult insertXfCourseSignup(XfCourseSignupEntity entity,String clientsxh,String openId);
}