package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxTeachingDblEntity;
import com.saint.teaching.dao.IJxTeachingDblDao;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_TEACHING_DBL
	*表说明大病历
  */
public class JxTeachingDblDaoImpl extends BaseDaoImpl implements IJxTeachingDblDao {

    /**
    	*方法注释信息
    	*分页查询表JX_TEACHING_DBL
    	*表说明大病历
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxTeachingDblEntity> selectListPageJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxTeachingDblBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxTeachingDblEntity selectJxTeachingDblByPrimaryKey(String xh) {
        return (JxTeachingDblEntity)getObject(xh, "selectJxTeachingDblByPrimaryKey");
    }

    /**
     * 查询表JX_TEACHING_DBL
     * 表说明大病历
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingDblEntity> selectListJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxTeachingDblBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingDblBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,插入信息
      */
    public ExcuteResult insertJxTeachingDbl(JxTeachingDblEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingDbl");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingDblSelective(JxTeachingDblEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingDblSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_TEACHING_DBL,大病历表,修改
      */
    public ExcuteResult updateJxTeachingDblByPrimaryKey(JxTeachingDblEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingDblByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxTeachingDblBySqlWhere(JxTeachingDblEntity entity, JxTeachingDblSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingDblBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_TEACHING_DBL,大病历表,修改
      */
    public ExcuteResult updateJxTeachingDblBySqlWhereSelective(JxTeachingDblEntity entity, JxTeachingDblSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingDblBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_TEACHING_DBL,大病历表,修改
      */
    public ExcuteResult updateJxTeachingDblByPrimaryKeySelective(JxTeachingDblEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingDblByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingDblByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxTeachingDblByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxTeachingDblBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_TEACHING_DBL,大病历表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxTeachingDblBySqlWhere");
    }
}