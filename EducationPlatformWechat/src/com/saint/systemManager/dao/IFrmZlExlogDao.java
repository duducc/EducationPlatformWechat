package com.saint.systemManager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmZlExlogEntity;
import com.saint.systemManager.sqlWhere.FrmZlExlogSqlWhere;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IFrmZlExlogDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteFrmZlExlogByPrimaryKey(String iden);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertFrmZlExlog(FrmZlExlogEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertFrmZlExlogSelective(FrmZlExlogEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<FrmZlExlogEntity> selectListPageFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    FrmZlExlogEntity selectFrmZlExlogByPrimaryKey(String iden);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<FrmZlExlogEntity> selectListFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmZlExlogBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmZlExlogBySqlWhereSelective(@Param("record") FrmZlExlogEntity record, @Param("sqlWhere") FrmZlExlogSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateFrmZlExlogBySqlWhere(@Param("record") FrmZlExlogEntity record, @Param("sqlWhere") FrmZlExlogSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmZlExlogByPrimaryKeySelective(FrmZlExlogEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateFrmZlExlogByPrimaryKey(FrmZlExlogEntity record);
}