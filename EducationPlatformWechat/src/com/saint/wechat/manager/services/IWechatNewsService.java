package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatNewsEntity;
import com.saint.wechat.manager.sqlWhere.WechatNewsSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWechatNewsService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteWechatNewsByPrimaryKey(String ywxh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertWechatNews(WechatNewsEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertWechatNewsSelective(WechatNewsEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<WechatNewsEntity> selectListPageWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<WechatNewsEntity> selectListWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatNewsBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    WechatNewsEntity selectWechatNewsByPrimaryKey(String ywxh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatNewsBySqlWhereSelective(@Param("record") WechatNewsEntity record, @Param("sqlWhere") WechatNewsSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateWechatNewsBySqlWhere(@Param("record") WechatNewsEntity record, @Param("sqlWhere") WechatNewsSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatNewsByPrimaryKeySelective(WechatNewsEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateWechatNewsByPrimaryKey(WechatNewsEntity record);
}