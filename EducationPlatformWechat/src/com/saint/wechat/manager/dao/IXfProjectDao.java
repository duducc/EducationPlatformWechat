package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.CourseOrProjectEntity;
import com.saint.wechat.manager.bean.XfProjectEntity;
import com.saint.wechat.manager.bean.XfTaskSignupEntity;
import com.saint.wechat.manager.sqlWhere.XfProjectSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IXfProjectDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteTaskSignupInfoByPrimaryKey(String Id);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfProject(XfProjectEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfProjectSelective(XfProjectEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfProjectEntity> selectListPageXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfProjectEntity selectXfProjectByPrimaryKey(String proId);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfProjectEntity> selectListXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfProjectBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfProjectBySqlWhereSelective(@Param("record") XfProjectEntity record, @Param("sqlWhere") XfProjectSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfProjectBySqlWhere(@Param("record") XfProjectEntity record, @Param("sqlWhere") XfProjectSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfProjectByPrimaryKeySelective(XfProjectEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfProjectByPrimaryKey(XfProjectEntity record);
    /**
     * 
     * @param addTime
     * @return
     */
    List<XfProjectEntity> selectListXfProjectByAddtime(String addTime);
    /**
     * 
     * @param proName
     * @param addTime
     * @return
     */
    List<XfProjectEntity> findListXfProject(String proName,String nowTime);
    List<CourseOrProjectEntity> selectXfCourseorProjectlist(String nowTime);
    /**
     * 
     * @param record
     * @return
     */
    ExcuteResult insertXfTaskSignupInfo(XfTaskSignupEntity record);
    /**
     * 
     * @param yitongcard
     * @param courseId
     * @return
     */
    List<XfTaskSignupEntity> findListTaskSignupInfo(String yitongcard,String courseId);
    /**
     * 
     * @param yitongcard
     * @param courseId
     * @return
     */
    List<XfTaskSignupEntity> selectListTaskSignupByCourseId(String courseId);
    /**
     * 
     * @param yitongcard
     * @param courseId
     * @return
     */
    List<XfTaskSignupEntity> selectListTaskSignupByYiTongCard(String yitongcard);
    /**
     * 
     * @param yitongcard
     * @param courseId
     * @return
     */
    XfTaskSignupEntity selectTaskSignupById(String Id);
}