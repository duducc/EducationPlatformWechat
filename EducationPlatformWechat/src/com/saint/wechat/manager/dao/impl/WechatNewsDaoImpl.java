package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatNewsEntity;
import com.saint.wechat.manager.dao.IWechatNewsDao;
import com.saint.wechat.manager.sqlWhere.WechatNewsSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatNewsDaoImpl extends BaseDaoImpl implements IWechatNewsDao {

    public List<WechatNewsEntity> selectListPageWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageWechatNewsBySqlWhere"); 
    }

    public WechatNewsEntity selectWechatNewsByPrimaryKey(String ywxh) {
        return (WechatNewsEntity)getObject(ywxh, "selectWechatNewsByPrimaryKey");
    }

    public List<WechatNewsEntity> selectListWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListWechatNewsBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListWechatNewsBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertWechatNews(WechatNewsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatNews");
    }

    public ExcuteResult insertWechatNewsSelective(WechatNewsEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatNewsSelective");
    }

    public ExcuteResult updateWechatNewsByPrimaryKey(WechatNewsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatNewsByPrimaryKey");
    }

    public ExcuteResult updateWechatNewsBySqlWhere(WechatNewsEntity entity, WechatNewsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatNewsBySqlWhere");
    }

    public ExcuteResult updateWechatNewsBySqlWhereSelective(WechatNewsEntity entity, WechatNewsSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatNewsBySqlWhereSelective");
    }

    public ExcuteResult updateWechatNewsByPrimaryKeySelective(WechatNewsEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatNewsByPrimaryKeySelective");
    }

    public ExcuteResult deleteWechatNewsByPrimaryKey(String ywxh) {
        return excuteDataBase(ywxh, ExcuteType.DELETE, "deleteWechatNewsByPrimaryKey");
    }

    public ExcuteResult deleteWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteWechatNewsBySqlWhere");
    }

    public int countWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countWechatNewsBySqlWhere");
    }
}