package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import com.saint.wechat.manager.sqlWhere.WechatMenuinfoSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IWechatMenuinfoService {
	
	public String createMenu(WechatMenugroupSqlWhere sqlWhere);
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteWechatMenuinfoByPrimaryKey(String menuid);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertWechatMenuinfo(WechatMenuinfoEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertWechatMenuinfoSelective(WechatMenuinfoEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<WechatMenuinfoEntity> selectListPageWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<WechatMenuinfoEntity> selectListWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatMenuinfoBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    WechatMenuinfoEntity selectWechatMenuinfoByPrimaryKey(String menuid);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatMenuinfoBySqlWhereSelective(@Param("record") WechatMenuinfoEntity record, @Param("sqlWhere") WechatMenuinfoSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateWechatMenuinfoBySqlWhere(@Param("record") WechatMenuinfoEntity record, @Param("sqlWhere") WechatMenuinfoSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatMenuinfoByPrimaryKeySelective(WechatMenuinfoEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateWechatMenuinfoByPrimaryKey(WechatMenuinfoEntity record);
}