package com.saint.research.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KYProjectEntity;
import com.saint.research.sqlWhere.KYProjectSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IKYProjectDao {
	/**
    * 查询序列
    * @param sqlWhere
    * @return
    */
    int selectKYProjectSequence();
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteKYProjectByPrimaryKey(String prosequence);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertKYProject(KYProjectEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertKYProjectSelective(KYProjectEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<KYProjectEntity> selectListPageKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    KYProjectEntity selectKYProjectByPrimaryKey(String prosequence);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<KYProjectEntity> selectListKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListKYProjectBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateKYProjectBySqlWhereSelective(@Param("record") KYProjectEntity record, @Param("sqlWhere") KYProjectSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateKYProjectBySqlWhere(@Param("record") KYProjectEntity record, @Param("sqlWhere") KYProjectSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateKYProjectByPrimaryKeySelective(KYProjectEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateKYProjectByPrimaryKey(KYProjectEntity record);
    
    /**
     * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
     * @param sqlWhere
     * @return
     */
    List<String> selectListKYProject(Map<String ,Object> map);
    
    List<KYProjectEntity> selectListPageProject(KYProjectSqlWhere sqlWhere);

    
}