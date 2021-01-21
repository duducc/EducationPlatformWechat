package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxGraduateDabianEntity;
import com.saint.teaching.dao.IJxGraduateDabianDao;
import com.saint.teaching.sqlWhere.JxGraduateDabianSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_GRADUATE_DABIAN
	*表说明研究生答辩申报
  */
public class JxGraduateDabianDaoImpl extends BaseDaoImpl implements IJxGraduateDabianDao {

    /**
    	*方法注释信息
    	*分页查询表JX_GRADUATE_DABIAN
    	*表说明研究生答辩申报
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxGraduateDabianEntity> selectListPageJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxGraduateDabianBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxGraduateDabianEntity selectJxGraduateDabianByPrimaryKey(String xh) {
        return (JxGraduateDabianEntity)getObject(xh, "selectJxGraduateDabianByPrimaryKey");
    }

    /**
     * 查询表JX_GRADUATE_DABIAN
     * 表说明研究生答辩申报
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxGraduateDabianEntity> selectListJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxGraduateDabianBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxGraduateDabianBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,插入信息
      */
    public ExcuteResult insertJxGraduateDabian(JxGraduateDabianEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxGraduateDabian");
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxGraduateDabianSelective(JxGraduateDabianEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxGraduateDabianSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,修改
      */
    public ExcuteResult updateJxGraduateDabianByPrimaryKey(JxGraduateDabianEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxGraduateDabianByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxGraduateDabianBySqlWhere(JxGraduateDabianEntity entity, JxGraduateDabianSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxGraduateDabianBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,修改
      */
    public ExcuteResult updateJxGraduateDabianBySqlWhereSelective(JxGraduateDabianEntity entity, JxGraduateDabianSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxGraduateDabianBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,修改
      */
    public ExcuteResult updateJxGraduateDabianByPrimaryKeySelective(JxGraduateDabianEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxGraduateDabianByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDabianByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxGraduateDabianByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxGraduateDabianBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_GRADUATE_DABIAN,研究生答辩申报表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxGraduateDabianBySqlWhere");
    }
}