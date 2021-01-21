package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.dao.IJxTeachingManusDao;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_TEACHING_MANUS
	*表说明带教手册类别
  */
public class JxTeachingManusDaoImpl extends BaseDaoImpl implements IJxTeachingManusDao {

    /**
    	*方法注释信息
    	*分页查询表JX_TEACHING_MANUS
    	*表说明带教手册类别
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxTeachingManusEntity> selectListPageJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxTeachingManusBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxTeachingManusEntity selectJxTeachingManusByPrimaryKey(String manuId) {
        return (JxTeachingManusEntity)getObject(manuId, "selectJxTeachingManusByPrimaryKey");
    }

    /**
     * 查询表JX_TEACHING_MANUS
     * 表说明带教手册类别
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingManusEntity> selectListJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxTeachingManusBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingManusBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,插入信息
      */
    public ExcuteResult insertJxTeachingManus(JxTeachingManusEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingManus");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingManusSelective(JxTeachingManusEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingManusSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_TEACHING_MANUS,带教手册类别表,修改
      */
    public ExcuteResult updateJxTeachingManusByPrimaryKey(JxTeachingManusEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingManusByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxTeachingManusBySqlWhere(JxTeachingManusEntity entity, JxTeachingManusSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingManusBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_TEACHING_MANUS,带教手册类别表,修改
      */
    public ExcuteResult updateJxTeachingManusBySqlWhereSelective(JxTeachingManusEntity entity, JxTeachingManusSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingManusBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_TEACHING_MANUS,带教手册类别表,修改
      */
    public ExcuteResult updateJxTeachingManusByPrimaryKeySelective(JxTeachingManusEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingManusByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManusByPrimaryKey(String manuId) {
        return excuteDataBase(manuId, ExcuteType.DELETE, "deleteJxTeachingManusByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxTeachingManusBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_TEACHING_MANUS,带教手册类别表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxTeachingManusBySqlWhere");
    }
}