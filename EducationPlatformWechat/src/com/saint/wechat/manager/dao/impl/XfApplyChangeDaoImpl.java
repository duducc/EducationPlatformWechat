package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfApplyChangeEntity;
import com.saint.wechat.manager.dao.IXfApplyChangeDao;
import com.saint.wechat.manager.sqlWhere.XfApplyChangeSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XfApplyChangeDaoImpl extends BaseDaoImpl implements IXfApplyChangeDao {

    public List<XfApplyChangeEntity> selectListPageXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfApplyChangeBySqlWhere"); 
    }

    public XfApplyChangeEntity selectXfApplyChangeByPrimaryKey(String xh) {
        return (XfApplyChangeEntity)getObject(xh, "selectXfApplyChangeByPrimaryKey");
    }

    public List<XfApplyChangeEntity> selectListXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfApplyChangeBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListXfApplyChangeBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertXfApplyChange(XfApplyChangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfApplyChange");
    }

    public ExcuteResult insertXfApplyChangeSelective(XfApplyChangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfApplyChangeSelective");
    }

    public ExcuteResult updateXfApplyChangeByPrimaryKey(XfApplyChangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfApplyChangeByPrimaryKey");
    }

    public ExcuteResult updateXfApplyChangeBySqlWhere(XfApplyChangeEntity entity, XfApplyChangeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfApplyChangeBySqlWhere");
    }

    public ExcuteResult updateXfApplyChangeBySqlWhereSelective(XfApplyChangeEntity entity, XfApplyChangeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfApplyChangeBySqlWhereSelective");
    }

    public ExcuteResult updateXfApplyChangeByPrimaryKeySelective(XfApplyChangeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfApplyChangeByPrimaryKeySelective");
    }

    public ExcuteResult deleteXfApplyChangeByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteXfApplyChangeByPrimaryKey");
    }

    public ExcuteResult deleteXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfApplyChangeBySqlWhere");
    }

    public int countXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfApplyChangeBySqlWhere");
    }
}