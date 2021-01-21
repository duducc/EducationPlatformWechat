package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveKey;
import com.saint.teaching.dao.IJxStudentsInternshipProveDao;
import com.saint.teaching.sqlWhere.JxStudentsInternshipProveSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STUDENTS_INTERNSHIP_PROVE
	*表说明实习证明
  */
public class JxStudentsInternshipProveDaoImpl extends BaseDaoImpl implements IJxStudentsInternshipProveDao {

    /**
    	*方法注释信息
    	*分页查询表JX_STUDENTS_INTERNSHIP_PROVE
    	*表说明实习证明
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudentsInternshipProveEntity> selectListPageJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudentsInternshipProveBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsInternshipProveEntity selectJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key) {
        return (JxStudentsInternshipProveEntity)getObject(key, "selectJxStudentsInternshipProveByPrimaryKey");
    }

    /**
     * 查询表JX_STUDENTS_INTERNSHIP_PROVE
     * 表说明实习证明
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsInternshipProveEntity> selectListJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudentsInternshipProveBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsInternshipProveBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,插入信息
      */
    public ExcuteResult insertJxStudentsInternshipProve(JxStudentsInternshipProveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsInternshipProve");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsInternshipProveSelective(JxStudentsInternshipProveEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudentsInternshipProveSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,修改
      */
    public ExcuteResult updateJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsInternshipProveByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveEntity entity, JxStudentsInternshipProveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsInternshipProveBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,修改
      */
    public ExcuteResult updateJxStudentsInternshipProveBySqlWhereSelective(JxStudentsInternshipProveEntity entity, JxStudentsInternshipProveSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudentsInternshipProveBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,修改
      */
    public ExcuteResult updateJxStudentsInternshipProveByPrimaryKeySelective(JxStudentsInternshipProveEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudentsInternshipProveByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteJxStudentsInternshipProveByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudentsInternshipProveBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudentsInternshipProveBySqlWhere");
    }
}