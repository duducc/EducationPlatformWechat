package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfHoldingTaskEntity;
import com.saint.wechat.manager.dao.IXfCourseDao;
import com.saint.wechat.manager.sqlWhere.XfCourseSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XfCourseDaoImpl extends BaseDaoImpl implements IXfCourseDao {

    public List<XfCourseEntity> selectListPageXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfCourseBySqlWhere"); 
    }

    public XfCourseEntity selectXfCourseByPrimaryKey(String courseId) {
        return (XfCourseEntity)getObject(courseId, "selectXfCourseByPrimaryKey");
    }
    
    public List<XfCourseEntity> selectXfBarcodeCourselist(String addunit,String startyear) {
    	XfCourseEntity entity = new XfCourseEntity();
    	entity.setRemark1(addunit);
    	entity.setStartDate(startyear);
        return getObjectList(entity,"selectXfBarcodeCourselist"); 
    }

    public List<XfCourseEntity> selectListXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfCourseBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListXfCourseBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertXfCourse(XfCourseEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCourse");
    }

    public ExcuteResult insertXfCourseSelective(XfCourseEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCourseSelective");
    }

    public ExcuteResult updateXfCourseByPrimaryKey(XfCourseEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCourseByPrimaryKey");
    }

    public ExcuteResult updateXfCourseBySqlWhere(XfCourseEntity entity, XfCourseSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCourseBySqlWhere");
    }

    public ExcuteResult updateXfCourseBySqlWhereSelective(XfCourseEntity entity, XfCourseSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCourseBySqlWhereSelective");
    }

    public ExcuteResult updateXfCourseByPrimaryKeySelective(XfCourseEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCourseByPrimaryKeySelective");
    }

    public ExcuteResult deleteXfCourseByPrimaryKey(String courseId) {
        return excuteDataBase(courseId, ExcuteType.DELETE, "deleteXfCourseByPrimaryKey");
    }

    public ExcuteResult deleteXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfCourseBySqlWhere");
    }

    public int countXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfCourseBySqlWhere");
    }
    public ExcuteResult insertXfHoldingTask(XfHoldingTaskEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfHoldingtask");
    }
    public ExcuteResult updateXfHoldingTaskByPrimaryKey(XfHoldingTaskEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfHoldingTaskByPrimaryKey");
    }
    public XfHoldingTaskEntity selectXfHoldingTaskByPrimaryKey(String usernumber) {
        return (XfHoldingTaskEntity)getObject(usernumber, "selectXfHoldingTaskByPrimaryKey");
    }
}