package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.TbDictdataEntity;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatSigntagEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IWechatBindDao {
	
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteWechatBindByPrimaryKey(WechatBindKey key);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertWechatBind(WechatBindEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertWechatBindSelective(WechatBindEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<WechatBindEntity> selectListPageWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    WechatBindEntity selectWechatBindByPrimaryKey(WechatBindKey key);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<WechatBindEntity> selectListWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatBindBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatBindBySqlWhereSelective(@Param("record") WechatBindEntity record, @Param("sqlWhere") WechatBindSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateWechatBindBySqlWhere(@Param("record") WechatBindEntity record, @Param("sqlWhere") WechatBindSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateWechatBindByPrimaryKeySelective(WechatBindEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateWechatBindByPrimaryKey(WechatBindEntity record);
    /**
     * 
     * @param yitongcard
     * @return
     */
    List<XfEmployeeEntity> selectListEmployeeByyitong(String yitongcard);
    /**
     * 
     * @param entity
     * @return
     */
    ExcuteResult updateEmployeeBySqlWhere(XfEmployeeEntity entity);
    /**
     * 实现根据ID查询出人员医院
     * @param deptid
     * @return
     */
    TbDictdataEntity selectDictdataById(String zhicheng);
    /**
     * 实现根据ID查询出人员医院
     * @param deptid
     * @return
     */
    List<TbDictdataEntity> selectListDictdataBySqlWhere(String dicttype);
    
    //=====================================扫码签到标价==========================================
    /**
     * 根据主键查询一条记录
     * @return
     */
    WechatSigntagEntity selectWechatSigntagByPrimaryKey(String openid);
    /**
     * 新增一行记录
     * @param record
     * @return
     */
    ExcuteResult insertWechatSigntag(WechatSigntagEntity record);
    /**
     * 实现根据记录主键删除相应的记录
     * @return
    */
    ExcuteResult deleteWechatSigntagByPrimaryKey(String openid);
}