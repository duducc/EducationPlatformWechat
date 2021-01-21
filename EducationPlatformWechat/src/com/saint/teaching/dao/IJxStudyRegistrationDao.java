package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudyRegistrationDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStudyRegistrationByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStudyRegistration(JxStudyRegistrationEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStudyRegistrationSelective(JxStudyRegistrationEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStudyRegistrationEntity> selectListPageJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStudyRegistrationEntity selectJxStudyRegistrationByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStudyRegistrationEntity> selectListJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudyRegistrationBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudyRegistrationBySqlWhereSelective(@Param("record") JxStudyRegistrationEntity record, @Param("sqlWhere") JxStudyRegistrationSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStudyRegistrationBySqlWhere(@Param("record") JxStudyRegistrationEntity record, @Param("sqlWhere") JxStudyRegistrationSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudyRegistrationByPrimaryKeySelective(JxStudyRegistrationEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStudyRegistrationByPrimaryKey(JxStudyRegistrationEntity record);
}