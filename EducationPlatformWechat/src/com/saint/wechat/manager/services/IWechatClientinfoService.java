package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.sqlWhere.WechatClientinfoSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWechatClientinfoService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteWechatClientinfoByPrimaryKey(String clientsxh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertWechatClientinfo(WechatClientinfoEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertWechatClientinfoSelective(WechatClientinfoEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<WechatClientinfoEntity> selectListPageWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<WechatClientinfoEntity> selectListWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatClientinfoBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    WechatClientinfoEntity selectWechatClientinfoByPrimaryKey(String clientsxh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatClientinfoBySqlWhereSelective(@Param("record") WechatClientinfoEntity record, @Param("sqlWhere") WechatClientinfoSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateWechatClientinfoBySqlWhere(@Param("record") WechatClientinfoEntity record, @Param("sqlWhere") WechatClientinfoSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatClientinfoByPrimaryKeySelective(WechatClientinfoEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateWechatClientinfoByPrimaryKey(WechatClientinfoEntity record);
}