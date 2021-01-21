package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfPayHistoryEntity;
import com.saint.wechat.manager.sqlWhere.XfPayHistorySqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfPayHistoryDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfPayHistoryByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfPayHistory(XfPayHistoryEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfPayHistorySelective(XfPayHistoryEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfPayHistoryEntity> selectListPageXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfPayHistoryEntity selectXfPayHistoryByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfPayHistoryEntity> selectListXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfPayHistoryBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfPayHistoryBySqlWhereSelective(@Param("record") XfPayHistoryEntity record, @Param("sqlWhere") XfPayHistorySqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfPayHistoryBySqlWhere(@Param("record") XfPayHistoryEntity record, @Param("sqlWhere") XfPayHistorySqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfPayHistoryByPrimaryKeySelective(XfPayHistoryEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfPayHistoryByPrimaryKey(XfPayHistoryEntity record);
}