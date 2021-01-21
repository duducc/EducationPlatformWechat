package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.dao.IXfStudyRegistrationDao;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XfStudyRegistrationDaoImpl extends BaseDaoImpl implements IXfStudyRegistrationDao {

    public List<XfStudyRegistrationEntity> selectListPageXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfStudyRegistrationBySqlWhere"); 
    }

    public XfStudyRegistrationEntity selectXfStudyRegistrationByPrimaryKey(String xh) {
        return (XfStudyRegistrationEntity)getObject(xh, "selectXfStudyRegistrationByPrimaryKey");
    }

    public List<XfStudyRegistrationEntity> selectListXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfStudyRegistrationBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListXfStudyRegistrationBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertXfStudyRegistration(XfStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfStudyRegistration");
    }

    public ExcuteResult insertXfStudyRegistrationSelective(XfStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfStudyRegistrationSelective");
    }

    public ExcuteResult updateXfStudyRegistrationByPrimaryKey(XfStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfStudyRegistrationByPrimaryKey");
    }

    public ExcuteResult updateXfStudyRegistrationBySqlWhere(XfStudyRegistrationEntity entity, XfStudyRegistrationSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfStudyRegistrationBySqlWhere");
    }

    public ExcuteResult updateXfStudyRegistrationBySqlWhereSelective(XfStudyRegistrationEntity entity, XfStudyRegistrationSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfStudyRegistrationBySqlWhereSelective");
    }

    public ExcuteResult updateXfStudyRegistrationByPrimaryKeySelective(XfStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfStudyRegistrationByPrimaryKeySelective");
    }

    public ExcuteResult deleteXfStudyRegistrationByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteXfStudyRegistrationByPrimaryKey");
    }

    public ExcuteResult deleteXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfStudyRegistrationBySqlWhere");
    }

    public int countXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfStudyRegistrationBySqlWhere");
    }
}