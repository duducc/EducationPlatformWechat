package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfStudyRegistrationDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfStudyRegistrationByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfStudyRegistration(XfStudyRegistrationEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfStudyRegistrationSelective(XfStudyRegistrationEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfStudyRegistrationEntity> selectListPageXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfStudyRegistrationEntity selectXfStudyRegistrationByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfStudyRegistrationEntity> selectListXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfStudyRegistrationBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfStudyRegistrationBySqlWhereSelective(@Param("record") XfStudyRegistrationEntity record, @Param("sqlWhere") XfStudyRegistrationSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfStudyRegistrationBySqlWhere(@Param("record") XfStudyRegistrationEntity record, @Param("sqlWhere") XfStudyRegistrationSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfStudyRegistrationByPrimaryKeySelective(XfStudyRegistrationEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfStudyRegistrationByPrimaryKey(XfStudyRegistrationEntity record);
}