package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCreditRecordEntity;
import com.saint.wechat.manager.bean.XfPosRecordEntity;
import com.saint.wechat.manager.sqlWhere.XfCreditRecordSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IXfCreditRecordDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfCreditRecordByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfCreditRecord(XfCreditRecordEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfCreditRecordSelective(XfCreditRecordEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfCreditRecordEntity> selectListPageXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfCreditRecordEntity selectXfCreditRecordByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfCreditRecordEntity> selectListXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfCreditRecordBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfCreditRecordBySqlWhereSelective(@Param("record") XfCreditRecordEntity record, @Param("sqlWhere") XfCreditRecordSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfCreditRecordBySqlWhere(@Param("record") XfCreditRecordEntity record, @Param("sqlWhere") XfCreditRecordSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfCreditRecordByPrimaryKeySelective(XfCreditRecordEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfCreditRecordByPrimaryKey(XfCreditRecordEntity record);
    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return selectListXfPosRecodebyIsGrant
     */
    List<XfPosRecordEntity> selectListXfPosRecordBySqlWhere(String emp_number);
    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param emp_number
     * @param isgrant
     * @return
     */
    List<XfPosRecordEntity> selectListXfPosRecodebyIsGrant(String emp_number,String isgrant);
}