package com.saint.research.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyBonusEntity;
import com.saint.research.sqlWhere.KyBonusSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IKyBonusDao {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteKyBonusByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertKyBonus(KyBonusEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertKyBonusSelective(KyBonusEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<KyBonusEntity> selectListPageKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere);

    /**
     * 根据主键查询一条记录
     * @return
     */
    KyBonusEntity selectKyBonusByPrimaryKey(String xh);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<KyBonusEntity> selectListKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListKyBonusBySql(String sql);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateKyBonusBySqlWhereSelective(@Param("record") KyBonusEntity record, @Param("sqlWhere") KyBonusSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateKyBonusBySqlWhere(@Param("record") KyBonusEntity record, @Param("sqlWhere") KyBonusSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateKyBonusByPrimaryKeySelective(KyBonusEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateKyBonusByPrimaryKey(KyBonusEntity record);
}