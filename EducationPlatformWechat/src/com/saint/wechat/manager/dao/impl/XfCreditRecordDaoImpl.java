package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfCreditRecordEntity;
import com.saint.wechat.manager.bean.XfPosRecordEntity;
import com.saint.wechat.manager.dao.IXfCreditRecordDao;
import com.saint.wechat.manager.sqlWhere.XfCreditRecordSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XfCreditRecordDaoImpl extends BaseDaoImpl implements IXfCreditRecordDao {

    public List<XfCreditRecordEntity> selectListPageXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfCreditRecordBySqlWhere"); 
    }

    public XfCreditRecordEntity selectXfCreditRecordByPrimaryKey(String xh) {
        return (XfCreditRecordEntity)getObject(xh, "selectXfCreditRecordByPrimaryKey");
    }

    public List<XfCreditRecordEntity> selectListXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfCreditRecordBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListXfCreditRecordBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertXfCreditRecord(XfCreditRecordEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCreditRecord");
    }

    public ExcuteResult insertXfCreditRecordSelective(XfCreditRecordEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCreditRecordSelective");
    }

    public ExcuteResult updateXfCreditRecordByPrimaryKey(XfCreditRecordEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCreditRecordByPrimaryKey");
    }

    public ExcuteResult updateXfCreditRecordBySqlWhere(XfCreditRecordEntity entity, XfCreditRecordSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCreditRecordBySqlWhere");
    }

    public ExcuteResult updateXfCreditRecordBySqlWhereSelective(XfCreditRecordEntity entity, XfCreditRecordSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCreditRecordBySqlWhereSelective");
    }

    public ExcuteResult updateXfCreditRecordByPrimaryKeySelective(XfCreditRecordEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCreditRecordByPrimaryKeySelective");
    }

    public ExcuteResult deleteXfCreditRecordByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteXfCreditRecordByPrimaryKey");
    }

    public ExcuteResult deleteXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfCreditRecordBySqlWhere");
    }

    public int countXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfCreditRecordBySqlWhere");
    }

	@Override
	public List<XfPosRecordEntity> selectListXfPosRecordBySqlWhere(String emp_number) {
		return getObjectList(emp_number,"selectListXfPosRecode"); 
	}
	@Override
	public List<XfPosRecordEntity> selectListXfPosRecodebyIsGrant(String emp_number,String isgrant) {
		XfPosRecordEntity entity = new XfPosRecordEntity();
		entity.setEmp_number(emp_number);
		entity.setIsgrant(isgrant);
		return getObjectList(entity,"selectListXfPosRecodebyIsGrant"); 
	}
}