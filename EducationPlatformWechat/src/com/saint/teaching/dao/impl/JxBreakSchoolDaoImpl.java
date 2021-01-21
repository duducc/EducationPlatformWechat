package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import com.saint.teaching.dao.IJxBreakSchoolDao;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_BREAKSCHOOL
	*表说明学生违纪登记
  */
public class JxBreakSchoolDaoImpl extends BaseDaoImpl implements IJxBreakSchoolDao {

    /**
    	*方法注释信息
    	*分页查询表JX_BREAKSCHOOL
    	*表说明学生违纪登记
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxBreakSchoolEntity> selectListPageJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxBreakSchoolBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxBreakSchoolEntity selectJxBreakSchoolByPrimaryKey(String xh) {
        return (JxBreakSchoolEntity)getObject(xh, "selectJxBreakSchoolByPrimaryKey");
    }

    /**
     * 查询表JX_BREAKSCHOOL
     * 表说明学生违纪登记
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxBreakSchoolEntity> selectListJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxBreakSchoolBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxBreakSchoolBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,插入信息
      */
    public ExcuteResult insertJxBreakSchool(JxBreakSchoolEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxBreakSchool");
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxBreakSchoolSelective(JxBreakSchoolEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxBreakSchoolSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_BREAKSCHOOL,学生违纪登记表,修改
      */
    public ExcuteResult updateJxBreakSchoolByPrimaryKey(JxBreakSchoolEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxBreakSchoolByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxBreakSchoolBySqlWhere(JxBreakSchoolEntity entity, JxBreakSchoolSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxBreakSchoolBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_BREAKSCHOOL,学生违纪登记表,修改
      */
    public ExcuteResult updateJxBreakSchoolBySqlWhereSelective(JxBreakSchoolEntity entity, JxBreakSchoolSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxBreakSchoolBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_BREAKSCHOOL,学生违纪登记表,修改
      */
    public ExcuteResult updateJxBreakSchoolByPrimaryKeySelective(JxBreakSchoolEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxBreakSchoolByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxBreakSchoolByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxBreakSchoolByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxBreakSchoolBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_BREAKSCHOOL,学生违纪登记表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxBreakSchoolBySqlWhere");
    }
}