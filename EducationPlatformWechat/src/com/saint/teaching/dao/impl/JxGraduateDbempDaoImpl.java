package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxGraduateDbempEntity;
import com.saint.teaching.dao.IJxGraduateDbempDao;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_GRADUATE_DBEMP
	*表说明研究生答辩参加人员
  */
public class JxGraduateDbempDaoImpl extends BaseDaoImpl implements IJxGraduateDbempDao {

    /**
    	*方法注释信息
    	*分页查询表JX_GRADUATE_DBEMP
    	*表说明研究生答辩参加人员
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxGraduateDbempEntity> selectListPageJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxGraduateDbempBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxGraduateDbempEntity selectJxGraduateDbempByPrimaryKey(String xh) {
        return (JxGraduateDbempEntity)getObject(xh, "selectJxGraduateDbempByPrimaryKey");
    }

    /**
     * 查询表JX_GRADUATE_DBEMP
     * 表说明研究生答辩参加人员
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxGraduateDbempEntity> selectListJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxGraduateDbempBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxGraduateDbempBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,插入信息
      */
    public ExcuteResult insertJxGraduateDbemp(JxGraduateDbempEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxGraduateDbemp");
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxGraduateDbempSelective(JxGraduateDbempEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxGraduateDbempSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,修改
      */
    public ExcuteResult updateJxGraduateDbempByPrimaryKey(JxGraduateDbempEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxGraduateDbempByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxGraduateDbempBySqlWhere(JxGraduateDbempEntity entity, JxGraduateDbempSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxGraduateDbempBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,修改
      */
    public ExcuteResult updateJxGraduateDbempBySqlWhereSelective(JxGraduateDbempEntity entity, JxGraduateDbempSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxGraduateDbempBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,修改
      */
    public ExcuteResult updateJxGraduateDbempByPrimaryKeySelective(JxGraduateDbempEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxGraduateDbempByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDbempByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxGraduateDbempByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxGraduateDbempBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxGraduateDbempBySqlWhere");
    }
}