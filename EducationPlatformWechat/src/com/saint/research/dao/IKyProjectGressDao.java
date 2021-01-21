package com.saint.research.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyProjectGressEntity;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IKyProjectGressDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteKyProjectGressByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertKyProjectGress(KyProjectGressEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertKyProjectGressSelective(KyProjectGressEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<KyProjectGressEntity> selectListPageKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    KyProjectGressEntity selectKyProjectGressByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<KyProjectGressEntity> selectListKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListKyProjectGressBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateKyProjectGressBySqlWhereSelective(@Param("record") KyProjectGressEntity record, @Param("sqlWhere") KyProjectGressSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateKyProjectGressBySqlWhere(@Param("record") KyProjectGressEntity record, @Param("sqlWhere") KyProjectGressSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateKyProjectGressByPrimaryKeySelective(KyProjectGressEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateKyProjectGressByPrimaryKey(KyProjectGressEntity record);
}