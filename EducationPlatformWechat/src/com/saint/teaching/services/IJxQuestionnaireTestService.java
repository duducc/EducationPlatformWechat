package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxQuestionnaireTestEntity;
import com.saint.teaching.sqlWhere.JxQuestionnaireTestSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxQuestionnaireTestService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxQuestionnaireTestByPrimaryKey(String questionid);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxQuestionnaireTest(JxQuestionnaireTestEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxQuestionnaireTestSelective(JxQuestionnaireTestEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxQuestionnaireTestEntity> selectListPageJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxQuestionnaireTestEntity> selectListJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxQuestionnaireTestBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxQuestionnaireTestEntity selectJxQuestionnaireTestByPrimaryKey(String questionid);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxQuestionnaireTestBySqlWhereSelective(@Param("record") JxQuestionnaireTestEntity record, @Param("sqlWhere") JxQuestionnaireTestSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxQuestionnaireTestBySqlWhere(@Param("record") JxQuestionnaireTestEntity record, @Param("sqlWhere") JxQuestionnaireTestSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxQuestionnaireTestByPrimaryKeySelective(JxQuestionnaireTestEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxQuestionnaireTestByPrimaryKey(JxQuestionnaireTestEntity record);
}