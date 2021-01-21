package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfApplyChangeEntity;
import com.saint.wechat.manager.sqlWhere.XfApplyChangeSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfApplyChangeService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteXfApplyChangeByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertXfApplyChange(XfApplyChangeEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertXfApplyChangeSelective(XfApplyChangeEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<XfApplyChangeEntity> selectListPageXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfApplyChangeEntity> selectListXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere);
    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<XfApplyChangeEntity> selectListXfApplyChangeBySqlWhere_jd(XfApplyChangeSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfApplyChangeBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    XfApplyChangeEntity selectXfApplyChangeByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfApplyChangeBySqlWhereSelective(@Param("record") XfApplyChangeEntity record, @Param("sqlWhere") XfApplyChangeSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateXfApplyChangeBySqlWhere(@Param("record") XfApplyChangeEntity record, @Param("sqlWhere") XfApplyChangeSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateXfApplyChangeByPrimaryKeySelective(XfApplyChangeEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateXfApplyChangeByPrimaryKey(XfApplyChangeEntity record);
}