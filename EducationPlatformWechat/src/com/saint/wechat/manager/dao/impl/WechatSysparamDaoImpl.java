package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.dao.IWechatSysparamDao;
import com.saint.wechat.manager.sqlWhere.WechatSysparamSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatSysparamDaoImpl extends BaseDaoImpl implements IWechatSysparamDao {

    public List<WechatSysparamEntity> selectListPageWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageWechatSysparamBySqlWhere"); 
    }

    public WechatSysparamEntity selectWechatSysparamByPrimaryKey(WechatSysparamKey key) {
        return (WechatSysparamEntity)getObject(key, "selectWechatSysparamByPrimaryKey");
    }

    public List<WechatSysparamEntity> selectListWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListWechatSysparamBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListWechatSysparamBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertWechatSysparam(WechatSysparamEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatSysparam");
    }

    public ExcuteResult insertWechatSysparamSelective(WechatSysparamEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatSysparamSelective");
    }

    public ExcuteResult updateWechatSysparamByPrimaryKey(WechatSysparamEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatSysparamByPrimaryKey");
    }

    public ExcuteResult updateWechatSysparamBySqlWhere(WechatSysparamEntity entity, WechatSysparamSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatSysparamBySqlWhere");
    }

    public ExcuteResult updateWechatSysparamBySqlWhereSelective(WechatSysparamEntity entity, WechatSysparamSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatSysparamBySqlWhereSelective");
    }

    public ExcuteResult updateWechatSysparamByPrimaryKeySelective(WechatSysparamEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatSysparamByPrimaryKeySelective");
    }

    public ExcuteResult deleteWechatSysparamByPrimaryKey(WechatSysparamKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteWechatSysparamByPrimaryKey");
    }

    public ExcuteResult deleteWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteWechatSysparamBySqlWhere");
    }

    public int countWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countWechatSysparamBySqlWhere");
    }
}