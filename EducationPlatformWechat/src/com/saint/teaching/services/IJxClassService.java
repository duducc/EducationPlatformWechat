package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxClassService {
	/**
	 * 查询序列
	 * @return
	 */
	int selectJxClassSequence();
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxClassBySqlWhere(JxClassSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxClassBySqlWhere(JxClassSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxClassByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxClass(JxClassEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxClassSelective(JxClassEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxClassEntity> selectListPageJxClassBySqlWhere(JxClassSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxClassEntity> selectListJxClassBySqlWhere(JxClassSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxClassBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxClassEntity selectJxClassByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxClassBySqlWhereSelective(@Param("record") JxClassEntity record, @Param("sqlWhere") JxClassSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxClassBySqlWhere(@Param("record") JxClassEntity record, @Param("sqlWhere") JxClassSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxClassByPrimaryKeySelective(JxClassEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxClassByPrimaryKey(JxClassEntity record);
}