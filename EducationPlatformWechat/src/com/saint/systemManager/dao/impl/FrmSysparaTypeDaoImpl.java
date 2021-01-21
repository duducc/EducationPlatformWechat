package com.saint.systemManager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.dao.IFrmCodeDao;
import com.saint.systemManager.dao.IFrmSysparaTypeDao;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import com.saint.systemManager.sqlWhere.FrmSysparaTypeSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����FRM_CODE
	*��˵��������Ϣ
  */
public class FrmSysparaTypeDaoImpl extends BaseDaoImpl implements IFrmSysparaTypeDao {

    
    public FrmSysparaTypeEntity selectFrmSysparaTypeByPrimaryKey(FrmSysparaTypeKey key) {
        return (FrmSysparaTypeEntity)getObject(key, "selectFrmSysparaTypeByPrimaryKey");
    }
    public ExcuteResult updateFrmSysparaTypeByPrimaryKeySelective(FrmSysparaTypeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateFrmSysparaTypeByPrimaryKeySelective");
    }
}