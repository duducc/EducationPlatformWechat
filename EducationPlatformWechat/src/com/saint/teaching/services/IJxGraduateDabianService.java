package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxGraduateDabianEntity;
import com.saint.teaching.sqlWhere.JxGraduateDabianSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxGraduateDabianService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxGraduateDabianByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxGraduateDabian(JxGraduateDabianEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxGraduateDabianSelective(JxGraduateDabianEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxGraduateDabianEntity> selectListPageJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxGraduateDabianEntity> selectListJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxGraduateDabianBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxGraduateDabianEntity selectJxGraduateDabianByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxGraduateDabianBySqlWhereSelective(@Param("record") JxGraduateDabianEntity record, @Param("sqlWhere") JxGraduateDabianSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxGraduateDabianBySqlWhere(@Param("record") JxGraduateDabianEntity record, @Param("sqlWhere") JxGraduateDabianSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxGraduateDabianByPrimaryKeySelective(JxGraduateDabianEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxGraduateDabianByPrimaryKey(JxGraduateDabianEntity record);
}