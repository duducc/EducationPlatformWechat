package com.saint.systemManager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.bean.FrmZlLogEntity;
import com.saint.systemManager.sqlWhere.FrmSysparaTypeSqlWhere;
import com.saint.systemManager.sqlWhere.FrmZlLogSqlWhere;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IFrmSysparaTypeDao {
    /**
     * 根据主键查询一条记录
     * @return
     */
	FrmSysparaTypeEntity selectFrmSysparaTypeByPrimaryKey(FrmSysparaTypeKey key);
	 ExcuteResult updateFrmSysparaTypeByPrimaryKeySelective(FrmSysparaTypeEntity record);

}