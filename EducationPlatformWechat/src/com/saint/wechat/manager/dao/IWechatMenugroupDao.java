package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatMenugroupEntity;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWechatMenugroupDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteWechatMenugroupByPrimaryKey(String menusxh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertWechatMenugroup(WechatMenugroupEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertWechatMenugroupSelective(WechatMenugroupEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<WechatMenugroupEntity> selectListPageWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    WechatMenugroupEntity selectWechatMenugroupByPrimaryKey(String menusxh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<WechatMenugroupEntity> selectListWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatMenugroupBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatMenugroupBySqlWhereSelective(@Param("record") WechatMenugroupEntity record, @Param("sqlWhere") WechatMenugroupSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateWechatMenugroupBySqlWhere(@Param("record") WechatMenugroupEntity record, @Param("sqlWhere") WechatMenugroupSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatMenugroupByPrimaryKeySelective(WechatMenugroupEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateWechatMenugroupByPrimaryKey(WechatMenugroupEntity record);
}