package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfEmpRegisterEntity;
import com.saint.wechat.manager.sqlWhere.XfEmpRegisterSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfEmpRegisterDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfEmpRegisterByPrimaryKey(String usernumber);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfEmpRegister(XfEmpRegisterEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfEmpRegisterSelective(XfEmpRegisterEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfEmpRegisterEntity> selectListPageXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfEmpRegisterEntity selectXfEmpRegisterByPrimaryKey(String usernumber);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfEmpRegisterEntity> selectListXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfEmpRegisterBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfEmpRegisterBySqlWhereSelective(@Param("record") XfEmpRegisterEntity record, @Param("sqlWhere") XfEmpRegisterSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfEmpRegisterBySqlWhere(@Param("record") XfEmpRegisterEntity record, @Param("sqlWhere") XfEmpRegisterSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfEmpRegisterByPrimaryKeySelective(XfEmpRegisterEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfEmpRegisterByPrimaryKey(XfEmpRegisterEntity record);
}