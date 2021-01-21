package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsSignEntity;
import com.saint.teaching.dao.IJxStudentsSignDao;
import com.saint.teaching.sqlWhere.JxStudentsSignSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STUDENTS_SIGN
	*表说明 学生签到信息
  */
public class JxStudentsSignDaoImpl extends BaseDaoImpl implements IJxStudentsSignDao {

    /**
    	*方法注释信息
    	*分页查询表JX_STUDENTS_SIGN
    	*表说明 学生签到信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsSignEntity> selectListPageJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsSignBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsSignEntity selectJxStudentsSignByPrimaryKey(String xh) {
        return (JxStudentsSignEntity)getObject(xh, "selectJxStudentsSignByPrimaryKey");
    }

    /**
     * 查询表JX_STUDENTS_SIGN
     * 表说明 学生签到信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsSignEntity> selectListJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsSignBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsSignBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,插入信息
      */
    public ExcuteResult insertJxStudentsSign(JxStudentsSignEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsSign");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsSignSelective(JxStudentsSignEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsSignSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_SIGN, 学生签到信息表,修改
      */
    public ExcuteResult updateJxStudentsSignByPrimaryKey(JxStudentsSignEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsSignByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsSignBySqlWhere(JxStudentsSignEntity entity, JxStudentsSignSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsSignBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_SIGN, 学生签到信息表,修改
      */
    public ExcuteResult updateJxStudentsSignBySqlWhereSelective(JxStudentsSignEntity entity, JxStudentsSignSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsSignBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_SIGN, 学生签到信息表,修改
      */
    public ExcuteResult updateJxStudentsSignByPrimaryKeySelective(JxStudentsSignEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsSignByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsSignByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudentsSignByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsSignBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_SIGN, 学生签到信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsSignBySqlWhere");
    }
}