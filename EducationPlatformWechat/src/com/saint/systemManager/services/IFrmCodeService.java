package com.saint.systemManager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IFrmCodeService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteFrmCodeByPrimaryKey(FrmCodeKey key);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertFrmCode(FrmCodeEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertFrmCodeSelective(FrmCodeEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<FrmCodeEntity> selectListPageFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<FrmCodeEntity> selectListFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmCodeBySql(String sql);
    
    //根据代码简称获取记录<DMZ,DMMC>
    List<HashMap<String,Object>> selectListFrmCodeAll(String dmjc);

    /**
     * 根据主键查询一条记录
     * @return
     */
    FrmCodeEntity selectFrmCodeByPrimaryKey(FrmCodeKey key);
    /**
     * 根据主键查询一条记录
     * @return
     */
    String selectFrmCodeByDmz(String dmlb,String dmz);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmCodeBySqlWhereSelective(@Param("record") FrmCodeEntity record, @Param("sqlWhere") FrmCodeSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateFrmCodeBySqlWhere(@Param("record") FrmCodeEntity record, @Param("sqlWhere") FrmCodeSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmCodeByPrimaryKeySelective(FrmCodeEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateFrmCodeByPrimaryKey(FrmCodeEntity record);
    
    public List<FrmCodeEntity> selectListFrmCodeBySqlWhereJB(FrmCodeSqlWhere sqlWhere);
}