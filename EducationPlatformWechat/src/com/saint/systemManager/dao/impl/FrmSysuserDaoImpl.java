package com.saint.systemManager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.systemManager.bean.FrmProgramQxgroupEntity;
import com.saint.systemManager.bean.FrmSysuserEntity;
import com.saint.systemManager.dao.IFrmSysuserDao;
import com.saint.systemManager.sqlWhere.FrmSysuserSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrmSysuserDaoImpl extends BaseDaoImpl implements IFrmSysuserDao {

    public List<FrmSysuserEntity> selectListPageFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageFrmSysuserBySqlWhere"); 
    }

    public FrmSysuserEntity selectFrmSysuserByPrimaryKey(String yhdh) {
        return (FrmSysuserEntity)getObject(yhdh, "selectFrmSysuserByPrimaryKey");
    }

    public List<FrmSysuserEntity> selectListFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListFrmSysuserBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListFrmSysuserBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertFrmSysuser(FrmSysuserEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmSysuser");
    }

    public ExcuteResult insertFrmSysuserSelective(FrmSysuserEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertFrmSysuserSelective");
    }

    public ExcuteResult updateFrmSysuserByPrimaryKey(FrmSysuserEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmSysuserByPrimaryKey");
    }

    public ExcuteResult updateFrmSysuserBySqlWhere(FrmSysuserEntity entity, FrmSysuserSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmSysuserBySqlWhere");
    }

    public ExcuteResult updateFrmSysuserBySqlWhereSelective(FrmSysuserEntity entity, FrmSysuserSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateFrmSysuserBySqlWhereSelective");
    }

    public ExcuteResult updateFrmSysuserByPrimaryKeySelective(FrmSysuserEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmSysuserByPrimaryKeySelective");
    }

    public ExcuteResult deleteFrmSysuserByPrimaryKey(String yhdh) {
        return excuteDataBase(yhdh, ExcuteType.DELETE, "deleteFrmSysuserByPrimaryKey");
    }

    public ExcuteResult deleteFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteFrmSysuserBySqlWhere");
    }

    public int countFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countFrmSysuserBySqlWhere");
    }

	public ExcuteResult updateUserMm(FrmSysuserEntity user) {
		getObject(user, "updateUserMm");
		String recount="0".equals(user.getResult())?"1":"-1";
		if(!user.getResult().equals("0"))
		{
			return new ExcuteResult(recount,user.getResult(),"操作执行失败");
		}
		return new ExcuteResult(recount,"操作执行成功");
	
	}

	public ExcuteResult resetUserMm(FrmSysuserEntity user) {
		getObject(user, "resetUserMm");
		if(!user.getResult().equals("0"))
		{
			return new ExcuteResult(user.getResult(),"操作执行失败");
		}
		return new ExcuteResult(user.getResult(),"操作执行成功");
	}
	
	public FrmProgramQxgroupEntity selectFrmProgramQxgroupByPrimaryKey(String qxgroup) {
        return (FrmProgramQxgroupEntity)getObject(qxgroup, "selectFrmProgramQxgroupByPrimaryKey");
    }
	
	public ExcuteResult saveUserMenu(FrmSysuserEntity user) {
		return excuteDataBase(user, ExcuteType.INSERT, "saveUserMenu");
	}

	public ExcuteResult deleteUserMenu(FrmSysuserEntity user) {
		return excuteDataBase(user, ExcuteType.DELETE, "deleteUserMenu");
	}

	public ExcuteResult updateUserMenu(FrmSysuserEntity user) {
		
		return excuteDataBase(user, ExcuteType.UPDATE, "updateUserMenu");
	}
}