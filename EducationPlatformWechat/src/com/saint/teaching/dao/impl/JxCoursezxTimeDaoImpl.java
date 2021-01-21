package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxCoursezxTimeEntity;
import com.saint.teaching.dao.IJxCoursezxTimeDao;
import com.saint.teaching.sqlWhere.JxCoursezxTimeSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_COURSEZXTIME
	*表说明理论课上课作息时间
  */
public class JxCoursezxTimeDaoImpl extends BaseDaoImpl implements IJxCoursezxTimeDao {

    /**
    	*方法注释信息
    	*分页查询表JX_COURSEZXTIME
    	*表说明理论课上课作息时间
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxCoursezxTimeEntity> selectListPageJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxCoursezxTimeBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxCoursezxTimeEntity selectJxCoursezxTimeByPrimaryKey(String xh) {
        return (JxCoursezxTimeEntity)getObject(xh, "selectJxCoursezxTimeByPrimaryKey");
    }

    /**
     * 查询表JX_COURSEZXTIME
     * 表说明理论课上课作息时间
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxCoursezxTimeEntity> selectListJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxCoursezxTimeBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCoursezxTimeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,插入信息
      */
    public ExcuteResult insertJxCoursezxTime(JxCoursezxTimeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCoursezxTime");
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCoursezxTimeSelective(JxCoursezxTimeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCoursezxTimeSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_COURSEZXTIME,理论课上课作息时间表,修改
      */
    public ExcuteResult updateJxCoursezxTimeByPrimaryKey(JxCoursezxTimeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCoursezxTimeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxCoursezxTimeBySqlWhere(JxCoursezxTimeEntity entity, JxCoursezxTimeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCoursezxTimeBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_COURSEZXTIME,理论课上课作息时间表,修改
      */
    public ExcuteResult updateJxCoursezxTimeBySqlWhereSelective(JxCoursezxTimeEntity entity, JxCoursezxTimeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCoursezxTimeBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_COURSEZXTIME,理论课上课作息时间表,修改
      */
    public ExcuteResult updateJxCoursezxTimeByPrimaryKeySelective(JxCoursezxTimeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCoursezxTimeByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxCoursezxTimeByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxCoursezxTimeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxCoursezxTimeBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_COURSEZXTIME,理论课上课作息时间表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxCoursezxTimeBySqlWhere");
    }
}