package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentsService {
	
	/**
	 * 查询序列
	 * @return
	 */
	int selectJXStudentsSequence();
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxStudentsByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxStudents(JxStudentsEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsSelective(JxStudentsEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxStudentsEntity> selectListPageJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxStudentsEntity> selectListJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentsBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxStudentsEntity selectJxStudentsByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsBySqlWhereSelective(@Param("record") JxStudentsEntity record, @Param("sqlWhere") JxStudentsSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxStudentsBySqlWhere(@Param("record") JxStudentsEntity record, @Param("sqlWhere") JxStudentsSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxStudentsByPrimaryKeySelective(JxStudentsEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxStudentsByPrimaryKey(JxStudentsEntity record);
}