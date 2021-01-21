package com.saint.systemManager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.systemManager.bean.FrmZlLogEntity;
import com.saint.systemManager.dao.IFrmZlLogDao;
import com.saint.systemManager.sqlWhere.FrmZlLogSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrmZlLogDaoImpl extends BaseDaoImpl implements IFrmZlLogDao {

    public List<FrmZlLogEntity> selectListPageFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageFrmZlLogBySqlWhere"); 
    }

    public FrmZlLogEntity selectFrmZlLogByPrimaryKey(String iden) {
        return (FrmZlLogEntity)getObject(iden, "selectFrmZlLogByPrimaryKey");
    }

    public List<FrmZlLogEntity> selectListFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListFrmZlLogBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListFrmZlLogBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertFrmZlLog(FrmZlLogEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmZlLog");
    }

    public ExcuteResult insertFrmZlLogSelective(FrmZlLogEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmZlLogSelective");
    }

    public ExcuteResult updateFrmZlLogByPrimaryKey(FrmZlLogEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmZlLogByPrimaryKey");
    }

    public ExcuteResult updateFrmZlLogBySqlWhere(FrmZlLogEntity entity, FrmZlLogSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmZlLogBySqlWhere");
    }

    public ExcuteResult updateFrmZlLogBySqlWhereSelective(FrmZlLogEntity entity, FrmZlLogSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmZlLogBySqlWhereSelective");
    }

    public ExcuteResult updateFrmZlLogByPrimaryKeySelective(FrmZlLogEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmZlLogByPrimaryKeySelective");
    }

    public ExcuteResult deleteFrmZlLogByPrimaryKey(String iden) {
        return excuteDataBase(iden, ExcuteType.DELETE, "deleteFrmZlLogByPrimaryKey");
    }

    public ExcuteResult deleteFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteFrmZlLogBySqlWhere");
    }

    public int countFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countFrmZlLogBySqlWhere");
    }
}