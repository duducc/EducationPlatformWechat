package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfPayHistoryEntity;
import com.saint.wechat.manager.dao.IXfPayHistoryDao;
import com.saint.wechat.manager.sqlWhere.XfPayHistorySqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XfPayHistoryDaoImpl extends BaseDaoImpl implements IXfPayHistoryDao {

    public List<XfPayHistoryEntity> selectListPageXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfPayHistoryBySqlWhere"); 
    }

    public XfPayHistoryEntity selectXfPayHistoryByPrimaryKey(String xh) {
        return (XfPayHistoryEntity)getObject(xh, "selectXfPayHistoryByPrimaryKey");
    }

    public List<XfPayHistoryEntity> selectListXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfPayHistoryBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListXfPayHistoryBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertXfPayHistory(XfPayHistoryEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfPayHistory");
    }

    public ExcuteResult insertXfPayHistorySelective(XfPayHistoryEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfPayHistorySelective");
    }

    public ExcuteResult updateXfPayHistoryByPrimaryKey(XfPayHistoryEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfPayHistoryByPrimaryKey");
    }

    public ExcuteResult updateXfPayHistoryBySqlWhere(XfPayHistoryEntity entity, XfPayHistorySqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfPayHistoryBySqlWhere");
    }

    public ExcuteResult updateXfPayHistoryBySqlWhereSelective(XfPayHistoryEntity entity, XfPayHistorySqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfPayHistoryBySqlWhereSelective");
    }

    public ExcuteResult updateXfPayHistoryByPrimaryKeySelective(XfPayHistoryEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfPayHistoryByPrimaryKeySelective");
    }

    public ExcuteResult deleteXfPayHistoryByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteXfPayHistoryByPrimaryKey");
    }

    public ExcuteResult deleteXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfPayHistoryBySqlWhere");
    }

    public int countXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfPayHistoryBySqlWhere");
    }
}