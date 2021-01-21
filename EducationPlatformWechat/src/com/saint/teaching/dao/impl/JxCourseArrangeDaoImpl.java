package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.dao.IJxCourseArrangeDao;
import com.saint.teaching.sqlWhere.JxCourseArrangeSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_COURSEARRANGE
	*表说明理论课课程安排
  */
public class JxCourseArrangeDaoImpl extends BaseDaoImpl implements IJxCourseArrangeDao {

    /**
    	*方法注释信息
    	*分页查询表JX_COURSEARRANGE
    	*表说明理论课课程安排
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxCourseArrangeEntity> selectListPageJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxCourseArrangeBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxCourseArrangeEntity selectJxCourseArrangeByPrimaryKey(String xh) {
        return (JxCourseArrangeEntity)getObject(xh, "selectJxCourseArrangeByPrimaryKey");
    }

    /**
     * 查询表JX_COURSEARRANGE
     * 表说明理论课课程安排
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxCourseArrangeEntity> selectListJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxCourseArrangeBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCourseArrangeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,插入信息
      */
    public ExcuteResult insertJxCourseArrange(JxCourseArrangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCourseArrange");
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCourseArrangeSelective(JxCourseArrangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxCourseArrangeSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_COURSEARRANGE,理论课课程安排表,修改
      */
    public ExcuteResult updateJxCourseArrangeByPrimaryKey(JxCourseArrangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCourseArrangeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxCourseArrangeBySqlWhere(JxCourseArrangeEntity entity, JxCourseArrangeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCourseArrangeBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_COURSEARRANGE,理论课课程安排表,修改
      */
    public ExcuteResult updateJxCourseArrangeBySqlWhereSelective(JxCourseArrangeEntity entity, JxCourseArrangeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxCourseArrangeBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_COURSEARRANGE,理论课课程安排表,修改
      */
    public ExcuteResult updateJxCourseArrangeByPrimaryKeySelective(JxCourseArrangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxCourseArrangeByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxCourseArrangeByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxCourseArrangeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxCourseArrangeBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_COURSEARRANGE,理论课课程安排表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxCourseArrangeBySqlWhere");
    }
}