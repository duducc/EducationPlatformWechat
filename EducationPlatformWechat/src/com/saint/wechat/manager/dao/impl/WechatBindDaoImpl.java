package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.TbDictdataEntity;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatSigntagEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.dao.IWechatBindDao;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WechatBindDaoImpl extends BaseDaoImpl implements IWechatBindDao {

    private static final Object String = null;
    
    
	public List<WechatBindEntity> selectListPageWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageWechatBindBySqlWhere"); 
    }

    public WechatBindEntity selectWechatBindByPrimaryKey(WechatBindKey key) {
        return (WechatBindEntity)getObject(key, "selectWechatBindByPrimaryKey");
    }

    public List<WechatBindEntity> selectListWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListWechatBindBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListWechatBindBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertWechatBind(WechatBindEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatBind");
    }

    public ExcuteResult insertWechatBindSelective(WechatBindEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatBindSelective");
    }
    
    public ExcuteResult updateWechatBindByPrimaryKey(WechatBindEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatBindByPrimaryKey");
    }

    public ExcuteResult updateWechatBindBySqlWhere(WechatBindEntity entity, WechatBindSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatBindBySqlWhere");
    }

    public ExcuteResult updateWechatBindBySqlWhereSelective(WechatBindEntity entity, WechatBindSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateWechatBindBySqlWhereSelective");
    }

    public ExcuteResult updateWechatBindByPrimaryKeySelective(WechatBindEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateWechatBindByPrimaryKeySelective");
    }

    public ExcuteResult deleteWechatBindByPrimaryKey(WechatBindKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteWechatBindByPrimaryKey");
    }

    public ExcuteResult deleteWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteWechatBindBySqlWhere");
    }

    public int countWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countWechatBindBySqlWhere");
    }


	public ExcuteResult updateEmployeeBySqlWhere(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateEmployeeBySqlWhere");
    }
	@Override
	public TbDictdataEntity selectDictdataById(java.lang.String zhicheng) {
		return (TbDictdataEntity)getObject(zhicheng, "selectDictdataById");
	}
	@Override
	public List<TbDictdataEntity> selectListDictdataBySqlWhere(
			java.lang.String dicttype) {
		return getObjectList(dicttype,"selectListDictdataBySqlWhere"); 
	}

	@Override
	public List<XfEmployeeEntity> selectListEmployeeByyitong(
			java.lang.String yitongcard) {
		return getObjectList(yitongcard,"selectListEmployeeByyitong");
	}
	//=======================================É¨ÂëÇ©µ½±ê¼Ç============================================
	public WechatSigntagEntity selectWechatSigntagByPrimaryKey(String openid) {
        return (WechatSigntagEntity)getObject(openid, "selectWechatSigntagByPrimaryKey");
    }
	public ExcuteResult insertWechatSigntag(WechatSigntagEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertWechatSigntag");
    }
	public ExcuteResult deleteWechatSigntagByPrimaryKey(String openid) {
        return excuteDataBase(openid, ExcuteType.DELETE, "deleteWechatSigntagByPrimaryKey");
    }
}