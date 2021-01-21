package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfCourseSignupEntity;
import com.saint.wechat.manager.bean.XfCourseSignupKey;
import com.saint.wechat.manager.dao.IXfCourseSignupDao;
import com.saint.wechat.manager.sqlWhere.XfCourseSignupSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XfCourseSignupDaoImpl extends BaseDaoImpl implements IXfCourseSignupDao {

    public List<XfCourseSignupEntity> selectListPageXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfCourseSignupBySqlWhere"); 
    }

    public XfCourseSignupEntity selectXfCourseSignupByPrimaryKey(XfCourseSignupKey key) {
        return (XfCourseSignupEntity)getObject(key, "selectXfCourseSignupByPrimaryKey");
    }

    public List<XfCourseSignupEntity> selectListXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfCourseSignupBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListXfCourseSignupBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertXfCourseSignup(XfCourseSignupEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCourseSignup");
    }

    public ExcuteResult insertXfCourseSignupSelective(XfCourseSignupEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCourseSignupSelective");
    }

    public ExcuteResult updateXfCourseSignupByPrimaryKey(XfCourseSignupEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCourseSignupByPrimaryKey");
    }

    public ExcuteResult updateXfCourseSignupBySqlWhere(XfCourseSignupEntity entity, XfCourseSignupSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCourseSignupBySqlWhere");
    }

    public ExcuteResult updateXfCourseSignupBySqlWhereSelective(XfCourseSignupEntity entity, XfCourseSignupSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCourseSignupBySqlWhereSelective");
    }

    public ExcuteResult updateXfCourseSignupByPrimaryKeySelective(XfCourseSignupEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCourseSignupByPrimaryKeySelective");
    }

    public ExcuteResult deleteXfCourseSignupByPrimaryKey(XfCourseSignupKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteXfCourseSignupByPrimaryKey");
    }

    public ExcuteResult deleteXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfCourseSignupBySqlWhere");
    }

    public int countXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfCourseSignupBySqlWhere");
    }
}