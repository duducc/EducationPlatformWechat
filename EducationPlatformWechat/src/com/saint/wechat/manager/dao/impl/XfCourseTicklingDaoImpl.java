package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfCourseTicklingEntity;
import com.saint.wechat.manager.bean.XfCourseTicklingKey;
import com.saint.wechat.manager.dao.IXfCourseTicklingDao;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名XF_COURSE_TICKLING
	*表说明课程信息学员反馈
  */
public class XfCourseTicklingDaoImpl extends BaseDaoImpl implements IXfCourseTicklingDao {

    /**
    	*方法注释信息
    	*分页查询表XF_COURSE_TICKLING
    	*表说明课程信息学员反馈
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<XfCourseTicklingEntity> selectListPageXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfCourseTicklingBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public XfCourseTicklingEntity selectXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key) {
        return (XfCourseTicklingEntity)getObject(key, "selectXfCourseTicklingByPrimaryKey");
    }

    /**
     * 查询表XF_COURSE_TICKLING
     * 表说明课程信息学员反馈
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<XfCourseTicklingEntity> selectListXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfCourseTicklingBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfCourseTicklingBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,插入信息
      */
    public ExcuteResult insertXfCourseTickling(XfCourseTicklingEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCourseTickling");
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfCourseTicklingSelective(XfCourseTicklingEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCourseTicklingSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*XF_COURSE_TICKLING,课程信息学员反馈表,修改
      */
    public ExcuteResult updateXfCourseTicklingByPrimaryKey(XfCourseTicklingEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCourseTicklingByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateXfCourseTicklingBySqlWhere(XfCourseTicklingEntity entity, XfCourseTicklingSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCourseTicklingBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*XF_COURSE_TICKLING,课程信息学员反馈表,修改
      */
    public ExcuteResult updateXfCourseTicklingBySqlWhereSelective(XfCourseTicklingEntity entity, XfCourseTicklingSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCourseTicklingBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*XF_COURSE_TICKLING,课程信息学员反馈表,修改
      */
    public ExcuteResult updateXfCourseTicklingByPrimaryKeySelective(XfCourseTicklingEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCourseTicklingByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteXfCourseTicklingByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfCourseTicklingBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*XF_COURSE_TICKLING,课程信息学员反馈表
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfCourseTicklingBySqlWhere");
    }
}