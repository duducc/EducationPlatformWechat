package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.dao.IWechatClientinfoDao;
import com.saint.wechat.manager.sqlWhere.WechatClientinfoSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatClientinfoDaoImpl extends BaseDaoImpl implements IWechatClientinfoDao {

    public List<WechatClientinfoEntity> selectListPageWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageWechatClientinfoBySqlWhere"); 
    }

    public WechatClientinfoEntity selectWechatClientinfoByPrimaryKey(String clientsxh) {
        return (WechatClientinfoEntity)getObject(clientsxh, "selectWechatClientinfoByPrimaryKey");
    }

    public List<WechatClientinfoEntity> selectListWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListWechatClientinfoBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListWechatClientinfoBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertWechatClientinfo(WechatClientinfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatClientinfo");
    }

    public ExcuteResult insertWechatClientinfoSelective(WechatClientinfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatClientinfoSelective");
    }

    public ExcuteResult updateWechatClientinfoByPrimaryKey(WechatClientinfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatClientinfoByPrimaryKey");
    }

    public ExcuteResult updateWechatClientinfoBySqlWhere(WechatClientinfoEntity entity, WechatClientinfoSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatClientinfoBySqlWhere");
    }

    public ExcuteResult updateWechatClientinfoBySqlWhereSelective(WechatClientinfoEntity entity, WechatClientinfoSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatClientinfoBySqlWhereSelective");
    }

    public ExcuteResult updateWechatClientinfoByPrimaryKeySelective(WechatClientinfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatClientinfoByPrimaryKeySelective");
    }

    public ExcuteResult deleteWechatClientinfoByPrimaryKey(String clientsxh) {
        return excuteDataBase(clientsxh, ExcuteType.DELETE, "deleteWechatClientinfoByPrimaryKey");
    }

    public ExcuteResult deleteWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteWechatClientinfoBySqlWhere");
    }

    public int countWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countWechatClientinfoBySqlWhere");
    }
}