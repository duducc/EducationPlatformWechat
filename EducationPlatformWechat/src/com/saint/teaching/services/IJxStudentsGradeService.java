package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsGradeEntity;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IJxStudentsGradeService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStudentsGradeByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsGrade(JxStudentsGradeEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsGradeSelective(JxStudentsGradeEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStudentsGradeEntity> selectListPageJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStudentsGradeEntity> selectListJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentsGradeBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStudentsGradeEntity selectJxStudentsGradeByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsGradeBySqlWhereSelective(@Param("record") JxStudentsGradeEntity record, @Param("sqlWhere") JxStudentsGradeSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStudentsGradeBySqlWhere(@Param("record") JxStudentsGradeEntity record, @Param("sqlWhere") JxStudentsGradeSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsGradeByPrimaryKeySelective(JxStudentsGradeEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStudentsGradeByPrimaryKey(JxStudentsGradeEntity record);
    /**
     * 查询下一个主键
     * @return
     */
	String queryNextIndex();
}