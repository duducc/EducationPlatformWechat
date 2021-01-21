package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxGraduateDbempEntity;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxGraduateDbempDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxGraduateDbempByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxGraduateDbemp(JxGraduateDbempEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxGraduateDbempSelective(JxGraduateDbempEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxGraduateDbempEntity> selectListPageJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxGraduateDbempEntity selectJxGraduateDbempByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxGraduateDbempEntity> selectListJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxGraduateDbempBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxGraduateDbempBySqlWhereSelective(@Param("record") JxGraduateDbempEntity record, @Param("sqlWhere") JxGraduateDbempSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxGraduateDbempBySqlWhere(@Param("record") JxGraduateDbempEntity record, @Param("sqlWhere") JxGraduateDbempSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxGraduateDbempByPrimaryKeySelective(JxGraduateDbempEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxGraduateDbempByPrimaryKey(JxGraduateDbempEntity record);
}