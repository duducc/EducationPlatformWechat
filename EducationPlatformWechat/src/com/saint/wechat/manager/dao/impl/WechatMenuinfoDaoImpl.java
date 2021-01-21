package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
import com.saint.wechat.manager.dao.IWechatMenuinfoDao;
import com.saint.wechat.manager.sqlWhere.WechatMenuinfoSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatMenuinfoDaoImpl extends BaseDaoImpl implements IWechatMenuinfoDao {

    public List<WechatMenuinfoEntity> selectListPageWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageWechatMenuinfoBySqlWhere"); 
    }

    public WechatMenuinfoEntity selectWechatMenuinfoByPrimaryKey(String menuid) {
        return (WechatMenuinfoEntity)getObject(menuid, "selectWechatMenuinfoByPrimaryKey");
    }

    public List<WechatMenuinfoEntity> selectListWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListWechatMenuinfoBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListWechatMenuinfoBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertWechatMenuinfo(WechatMenuinfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatMenuinfo");
    }

    public ExcuteResult insertWechatMenuinfoSelective(WechatMenuinfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatMenuinfoSelective");
    }

    public ExcuteResult updateWechatMenuinfoByPrimaryKey(WechatMenuinfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatMenuinfoByPrimaryKey");
    }

    public ExcuteResult updateWechatMenuinfoBySqlWhere(WechatMenuinfoEntity entity, WechatMenuinfoSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatMenuinfoBySqlWhere");
    }

    public ExcuteResult updateWechatMenuinfoBySqlWhereSelective(WechatMenuinfoEntity entity, WechatMenuinfoSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatMenuinfoBySqlWhereSelective");
    }

    public ExcuteResult updateWechatMenuinfoByPrimaryKeySelective(WechatMenuinfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatMenuinfoByPrimaryKeySelective");
    }

    public ExcuteResult deleteWechatMenuinfoByPrimaryKey(String menuid) {
        return excuteDataBase(menuid, ExcuteType.DELETE, "deleteWechatMenuinfoByPrimaryKey");
    }

    public ExcuteResult deleteWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteWechatMenuinfoBySqlWhere");
    }

    public int countWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countWechatMenuinfoBySqlWhere");
    }
}