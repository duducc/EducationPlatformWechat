package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxSignInfoService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxSignInfoByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxSignInfo(JxSignInfoEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxSignInfoSelective(JxSignInfoEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxSignInfoEntity> selectListPageJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxSignInfoEntity> selectListJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxSignInfoBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxSignInfoEntity selectJxSignInfoByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxSignInfoBySqlWhereSelective(@Param("record") JxSignInfoEntity record, @Param("sqlWhere") JxSignInfoSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxSignInfoBySqlWhere(@Param("record") JxSignInfoEntity record, @Param("sqlWhere") JxSignInfoSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxSignInfoByPrimaryKeySelective(JxSignInfoEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxSignInfoByPrimaryKey(JxSignInfoEntity record);
}