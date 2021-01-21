package com.saint.systemManager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.systemManager.bean.FrmZlExlogEntity;
import com.saint.systemManager.dao.IFrmZlExlogDao;
import com.saint.systemManager.sqlWhere.FrmZlExlogSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrmZlExlogDaoImpl extends BaseDaoImpl implements IFrmZlExlogDao {

    public List<FrmZlExlogEntity> selectListPageFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageFrmZlExlogBySqlWhere"); 
    }

    public FrmZlExlogEntity selectFrmZlExlogByPrimaryKey(String iden) {
        return (FrmZlExlogEntity)getObject(iden, "selectFrmZlExlogByPrimaryKey");
    }

    public List<FrmZlExlogEntity> selectListFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListFrmZlExlogBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListFrmZlExlogBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertFrmZlExlog(FrmZlExlogEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmZlExlog");
    }

    public ExcuteResult insertFrmZlExlogSelective(FrmZlExlogEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmZlExlogSelective");
    }

    public ExcuteResult updateFrmZlExlogByPrimaryKey(FrmZlExlogEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmZlExlogByPrimaryKey");
    }

    public ExcuteResult updateFrmZlExlogBySqlWhere(FrmZlExlogEntity entity, FrmZlExlogSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmZlExlogBySqlWhere");
    }

    public ExcuteResult updateFrmZlExlogBySqlWhereSelective(FrmZlExlogEntity entity, FrmZlExlogSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmZlExlogBySqlWhereSelective");
    }

    public ExcuteResult updateFrmZlExlogByPrimaryKeySelective(FrmZlExlogEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmZlExlogByPrimaryKeySelective");
    }

    public ExcuteResult deleteFrmZlExlogByPrimaryKey(String iden) {
        return excuteDataBase(iden, ExcuteType.DELETE, "deleteFrmZlExlogByPrimaryKey");
    }

    public ExcuteResult deleteFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteFrmZlExlogBySqlWhere");
    }

    public int countFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countFrmZlExlogBySqlWhere");
    }
}