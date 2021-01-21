package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatMenugroupEntity;
import com.saint.wechat.manager.dao.IWechatMenugroupDao;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatMenugroupDaoImpl extends BaseDaoImpl implements IWechatMenugroupDao {

    public List<WechatMenugroupEntity> selectListPageWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageWechatMenugroupBySqlWhere"); 
    }

    public WechatMenugroupEntity selectWechatMenugroupByPrimaryKey(String menusxh) {
        return (WechatMenugroupEntity)getObject(menusxh, "selectWechatMenugroupByPrimaryKey");
    }

    public List<WechatMenugroupEntity> selectListWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListWechatMenugroupBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListWechatMenugroupBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertWechatMenugroup(WechatMenugroupEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatMenugroup");
    }

    public ExcuteResult insertWechatMenugroupSelective(WechatMenugroupEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatMenugroupSelective");
    }

    public ExcuteResult updateWechatMenugroupByPrimaryKey(WechatMenugroupEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatMenugroupByPrimaryKey");
    }

    public ExcuteResult updateWechatMenugroupBySqlWhere(WechatMenugroupEntity entity, WechatMenugroupSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatMenugroupBySqlWhere");
    }

    public ExcuteResult updateWechatMenugroupBySqlWhereSelective(WechatMenugroupEntity entity, WechatMenugroupSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatMenugroupBySqlWhereSelective");
    }

    public ExcuteResult updateWechatMenugroupByPrimaryKeySelective(WechatMenugroupEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatMenugroupByPrimaryKeySelective");
    }

    public ExcuteResult deleteWechatMenugroupByPrimaryKey(String menusxh) {
        return excuteDataBase(menusxh, ExcuteType.DELETE, "deleteWechatMenugroupByPrimaryKey");
    }

    public ExcuteResult deleteWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteWechatMenugroupBySqlWhere");
    }

    public int countWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countWechatMenugroupBySqlWhere");
    }
}