package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.dao.IJxClassDao;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

	/**
		*类注释信息
		*表名JX_CLASS
		*表说明教学班级
	  */
	public class JxClassDaoImpl extends BaseDaoImpl implements IJxClassDao {
		
		public int selectJxClassSequence() {
		    return (Integer)getObject("", "selectJxClassSequence");
		}
    /**
    	*方法注释信息
    	*分页查询表JX_CLASS
    	*表说明教学班级
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxClassEntity> selectListPageJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxClassBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxClassEntity selectJxClassByPrimaryKey(String xh) {
        return (JxClassEntity)getObject(xh, "selectJxClassByPrimaryKey");
    }

    /**
     * 查询表JX_CLASS
     * 表说明教学班级
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxClassEntity> selectListJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxClassBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxClassBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,插入信息
      */
    public ExcuteResult insertJxClass(JxClassEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxClass");
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxClassSelective(JxClassEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxClassSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_CLASS,教学班级表,修改
      */
    public ExcuteResult updateJxClassByPrimaryKey(JxClassEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxClassByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxClassBySqlWhere(JxClassEntity entity, JxClassSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxClassBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_CLASS,教学班级表,修改
      */
    public ExcuteResult updateJxClassBySqlWhereSelective(JxClassEntity entity, JxClassSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxClassBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_CLASS,教学班级表,修改
      */
    public ExcuteResult updateJxClassByPrimaryKeySelective(JxClassEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxClassByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxClassByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxClassByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxClassBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_CLASS,教学班级表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxClassBySqlWhere");
    }
}