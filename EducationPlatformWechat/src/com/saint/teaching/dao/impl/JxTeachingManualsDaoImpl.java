package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxTeachingManualsEntity;
import com.saint.teaching.dao.IJxTeachingManualsDao;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_TEACHING_MANUALS
	*表说明实习生带教手册记录
  */
public class JxTeachingManualsDaoImpl extends BaseDaoImpl implements IJxTeachingManualsDao {

    /**
    	*方法注释信息
    	*分页查询表JX_TEACHING_MANUALS
    	*表说明实习生带教手册记录
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxTeachingManualsEntity> selectListPageJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxTeachingManualsBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxTeachingManualsEntity selectJxTeachingManualsByPrimaryKey(String xh) {
        return (JxTeachingManualsEntity)getObject(xh, "selectJxTeachingManualsByPrimaryKey");
    }

    /**
     * 查询表JX_TEACHING_MANUALS
     * 表说明实习生带教手册记录
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingManualsEntity> selectListJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxTeachingManualsBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingManualsBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,插入信息
      */
    public ExcuteResult insertJxTeachingManuals(JxTeachingManualsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingManuals");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingManualsSelective(JxTeachingManualsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeachingManualsSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,修改
      */
    public ExcuteResult updateJxTeachingManualsByPrimaryKey(JxTeachingManualsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingManualsByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxTeachingManualsBySqlWhere(JxTeachingManualsEntity entity, JxTeachingManualsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingManualsBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,修改
      */
    public ExcuteResult updateJxTeachingManualsBySqlWhereSelective(JxTeachingManualsEntity entity, JxTeachingManualsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeachingManualsBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,修改
      */
    public ExcuteResult updateJxTeachingManualsByPrimaryKeySelective(JxTeachingManualsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeachingManualsByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManualsByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxTeachingManualsByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxTeachingManualsBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_TEACHING_MANUALS,实习生带教手册记录表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxTeachingManualsBySqlWhere");
    }
}