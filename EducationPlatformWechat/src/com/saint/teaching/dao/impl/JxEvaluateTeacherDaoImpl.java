package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxEvaluateTeacherEntity;
import com.saint.teaching.dao.IJxEvaluateTeacherDao;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_EVALUATE_TEACHER
	*表说明教师评价表
  */
public class JxEvaluateTeacherDaoImpl extends BaseDaoImpl implements IJxEvaluateTeacherDao {

    /**
    	*方法注释信息
    	*分页查询表JX_EVALUATE_TEACHER
    	*表说明教师评价表
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxEvaluateTeacherEntity> selectListPageJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxEvaluateTeacherBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxEvaluateTeacherEntity selectJxEvaluateTeacherByPrimaryKey(String xh) {
        return (JxEvaluateTeacherEntity)getObject(xh, "selectJxEvaluateTeacherByPrimaryKey");
    }

    /**
     * 查询表JX_EVALUATE_TEACHER
     * 表说明教师评价表
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxEvaluateTeacherEntity> selectListJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxEvaluateTeacherBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxEvaluateTeacherBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,插入信息
      */
    public ExcuteResult insertJxEvaluateTeacher(JxEvaluateTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxEvaluateTeacher");
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxEvaluateTeacherSelective(JxEvaluateTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxEvaluateTeacherSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_EVALUATE_TEACHER,教师评价表表,修改
      */
    public ExcuteResult updateJxEvaluateTeacherByPrimaryKey(JxEvaluateTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxEvaluateTeacherByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherEntity entity, JxEvaluateTeacherSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxEvaluateTeacherBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_EVALUATE_TEACHER,教师评价表表,修改
      */
    public ExcuteResult updateJxEvaluateTeacherBySqlWhereSelective(JxEvaluateTeacherEntity entity, JxEvaluateTeacherSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxEvaluateTeacherBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_EVALUATE_TEACHER,教师评价表表,修改
      */
    public ExcuteResult updateJxEvaluateTeacherByPrimaryKeySelective(JxEvaluateTeacherEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxEvaluateTeacherByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxEvaluateTeacherByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxEvaluateTeacherByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxEvaluateTeacherBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_EVALUATE_TEACHER,教师评价表表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxEvaluateTeacherBySqlWhere");
    }
}