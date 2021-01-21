package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.sqlWhere.JxCourseArrangeSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxCourseArrangeService {
    /**
    * 实现根据sqlWhere传入的条件 COUNT 出记录数
    * @param sqlWhere
    * @return
    */
    int countJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere);

    /**
    * 实现根据sqlWhere传入的条件删除相应的记录
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere);

    /**
    * 实现根据记录主键删除相应的记录
    * @return
    */
    ExcuteResult deleteJxCourseArrangeByPrimaryKey(String xh);

    /**
    * 新增一行记录
    * @param record
    * @return
    */
    ExcuteResult insertJxCourseArrange(JxCourseArrangeEntity record);

    /**
    * 新增一行记录，插入时只插入非空列
    * @param record
    * @return
    */
    ExcuteResult insertJxCourseArrangeSelective(JxCourseArrangeEntity record);

    /**
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    List<JxCourseArrangeEntity> selectListPageJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere);

    /**
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    List<JxCourseArrangeEntity> selectListJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere);

    /**
     * 实现根据传入的sql语句查询出信息列表
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxCourseArrangeBySql(String sql);

    /**
     * 根据主键查询一条记录
     * @return
     */
    JxCourseArrangeEntity selectJxCourseArrangeByPrimaryKey(String xh);

    /**
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxCourseArrangeBySqlWhereSelective(@Param("record") JxCourseArrangeEntity record, @Param("sqlWhere") JxCourseArrangeSqlWhere example);

    /**
     * 更新满足sqlWhere条件的记录
     * @return
     */
    ExcuteResult updateJxCourseArrangeBySqlWhere(@Param("record") JxCourseArrangeEntity record, @Param("sqlWhere") JxCourseArrangeSqlWhere example);

    /**
     * 根据主键更新一条记录，更新时只更新非空列
     * @return
     */
    ExcuteResult updateJxCourseArrangeByPrimaryKeySelective(JxCourseArrangeEntity record);

    /**
     * 根据主键更新一条记录
     * @return
     */
    ExcuteResult updateJxCourseArrangeByPrimaryKey(JxCourseArrangeEntity record);
}