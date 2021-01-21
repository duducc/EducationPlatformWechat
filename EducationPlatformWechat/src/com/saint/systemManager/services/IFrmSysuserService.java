package com.saint.systemManager.services;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmProgramQxgroupEntity;
import com.saint.systemManager.bean.FrmSysuserEntity;
import com.saint.systemManager.sqlWhere.FrmSysuserSqlWhere;

public interface IFrmSysuserService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteFrmSysuserByPrimaryKey(String yhdh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertFrmSysuser(FrmSysuserEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertFrmSysuserSelective(FrmSysuserEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<FrmSysuserEntity> selectListPageFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<FrmSysuserEntity> selectListFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmSysuserBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    FrmSysuserEntity selectFrmSysuserByPrimaryKey(String yhdh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmSysuserBySqlWhereSelective(@Param("record") FrmSysuserEntity record, @Param("sqlWhere") FrmSysuserSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateFrmSysuserBySqlWhere(@Param("record") FrmSysuserEntity record, @Param("sqlWhere") FrmSysuserSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateFrmSysuserByPrimaryKeySelective(FrmSysuserEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateFrmSysuserByPrimaryKey(FrmSysuserEntity record);
    
    public List<FrmSysuserEntity> selectListFrmSysuserBySqlWhereYhjb(FrmSysuserSqlWhere sqlWhere);
    
    /**
     * 自定义方法 
     */
    /**
     * 重置密码
     * @param user
     * @return
     */
    ExcuteResult resetUserMM(FrmSysuserEntity user);
    /**
     * 用户密码
     * @param sysuser
     * @return
     */
    ExcuteResult updateUserMM(FrmSysuserEntity sysuser);
    /**
     * 根据主键查询一条记录
     * @return
     */
    FrmProgramQxgroupEntity selectFrmProgramQxgroupByPrimaryKey(String qxgroup);
}