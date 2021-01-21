package com.saint.systemManager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import com.saint.systemManager.sqlWhere.FrmSysparaTypeSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IFrmSysparaTypeService {

    /**
     * 根据主键查询一条记录
     * @return
     */
	FrmSysparaTypeEntity selectFrmSysparaTypeByPrimaryKey(FrmSysparaTypeKey key);
	
	String selectFrmSysparaTypeBygjz(String gjz);
	
	ExcuteResult updateFrmSysparaTypeByPrimaryKeySelective(FrmSysparaTypeEntity record);

}