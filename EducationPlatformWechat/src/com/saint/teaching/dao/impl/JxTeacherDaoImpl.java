package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxTeacherEntity;
import com.saint.teaching.dao.IJxTeacherDao;
import com.saint.teaching.sqlWhere.JxTeacherSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_TEACHER
	*表说明教师信息
  */
public class JxTeacherDaoImpl extends BaseDaoImpl implements IJxTeacherDao {

    /**
    	*方法注释信息
    	*分页查询表JX_TEACHER
    	*表说明教师信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxTeacherEntity> selectListPageJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxTeacherBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxTeacherEntity selectJxTeacherByPrimaryKey(String usernumber) {
        return (JxTeacherEntity)getObject(usernumber, "selectJxTeacherByPrimaryKey");
    }

    /**
     * 查询表JX_TEACHER
     * 表说明教师信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxTeacherEntity> selectListJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxTeacherBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeacherBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,插入信息
      */
    public ExcuteResult insertJxTeacher(JxTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeacher");
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeacherSelective(JxTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxTeacherSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_TEACHER,教师信息表,修改
      */
    public ExcuteResult updateJxTeacherByPrimaryKey(JxTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeacherByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxTeacherBySqlWhere(JxTeacherEntity entity, JxTeacherSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeacherBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_TEACHER,教师信息表,修改
      */
    public ExcuteResult updateJxTeacherBySqlWhereSelective(JxTeacherEntity entity, JxTeacherSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxTeacherBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_TEACHER,教师信息表,修改
      */
    public ExcuteResult updateJxTeacherByPrimaryKeySelective(JxTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxTeacherByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxTeacherByPrimaryKey(String usernumber) {
        return excuteDataBase(usernumber, ExcuteType.DELETE, "deleteJxTeacherByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxTeacherBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_TEACHER,教师信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxTeacherBySqlWhere");
    }
}