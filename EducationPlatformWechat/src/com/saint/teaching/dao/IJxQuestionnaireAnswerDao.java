package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxQuestionnaireAnswerEntity;
import com.saint.teaching.bean.JxQuestionnaireAnswerKey;
import com.saint.teaching.sqlWhere.JxQuestionnaireAnswerSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxQuestionnaireAnswerDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxQuestionnaireAnswer(JxQuestionnaireAnswerEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxQuestionnaireAnswerSelective(JxQuestionnaireAnswerEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxQuestionnaireAnswerEntity> selectListPageJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxQuestionnaireAnswerEntity selectJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxQuestionnaireAnswerEntity> selectListJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxQuestionnaireAnswerBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxQuestionnaireAnswerBySqlWhereSelective(@Param("record") JxQuestionnaireAnswerEntity record, @Param("sqlWhere") JxQuestionnaireAnswerSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxQuestionnaireAnswerBySqlWhere(@Param("record") JxQuestionnaireAnswerEntity record, @Param("sqlWhere") JxQuestionnaireAnswerSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxQuestionnaireAnswerByPrimaryKeySelective(JxQuestionnaireAnswerEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerEntity record);
}