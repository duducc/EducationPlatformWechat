package com.saint.systemManager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IFrmDepartmentDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteFrmDepartmentByPrimaryKey(String glbm);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertFrmDepartment(FrmDepartmentEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertFrmDepartmentSelective(FrmDepartmentEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<FrmDepartmentEntity> selectListPageFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    FrmDepartmentEntity selectFrmDepartmentByPrimaryKey(String glbm);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmDepartmentBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmDepartmentBySqlWhereSelective(@Param("record") FrmDepartmentEntity record, @Param("sqlWhere") FrmDepartmentSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateFrmDepartmentBySqlWhere(@Param("record") FrmDepartmentEntity record, @Param("sqlWhere") FrmDepartmentSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmDepartmentByPrimaryKeySelective(FrmDepartmentEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateFrmDepartmentByPrimaryKey(FrmDepartmentEntity record);
}