package com.saint.systemManager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmZlLogEntity;
import com.saint.systemManager.sqlWhere.FrmZlLogSqlWhere;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IFrmZlLogDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteFrmZlLogByPrimaryKey(String iden);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertFrmZlLog(FrmZlLogEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertFrmZlLogSelective(FrmZlLogEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<FrmZlLogEntity> selectListPageFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    FrmZlLogEntity selectFrmZlLogByPrimaryKey(String iden);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<FrmZlLogEntity> selectListFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmZlLogBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmZlLogBySqlWhereSelective(@Param("record") FrmZlLogEntity record, @Param("sqlWhere") FrmZlLogSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateFrmZlLogBySqlWhere(@Param("record") FrmZlLogEntity record, @Param("sqlWhere") FrmZlLogSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmZlLogByPrimaryKeySelective(FrmZlLogEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateFrmZlLogByPrimaryKey(FrmZlLogEntity record);
}