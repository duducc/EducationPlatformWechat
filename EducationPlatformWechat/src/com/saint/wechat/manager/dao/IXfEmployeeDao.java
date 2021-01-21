package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfEmployeeDao {
	/**
    * 查询序列
    * @param sqlWhere
    * @return
    */
    int selectJxschoolmanager();
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfEmployeeByPrimaryKey(String usernumber);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfEmployee(XfEmployeeEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfEmployeeSelective(XfEmployeeEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfEmployeeEntity> selectListPageXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfEmployeeEntity selectXfEmployeeByPrimaryKey(String usernumber);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfEmployeeEntity> selectListXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfEmployeeBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfEmployeeBySqlWhereSelective(@Param("record") XfEmployeeEntity record, @Param("sqlWhere") XfEmployeeSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfEmployeeBySqlWhere(@Param("record") XfEmployeeEntity record, @Param("sqlWhere") XfEmployeeSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfEmployeeByPrimaryKeySelective(XfEmployeeEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfEmployeeByPrimaryKey(XfEmployeeEntity record);
}