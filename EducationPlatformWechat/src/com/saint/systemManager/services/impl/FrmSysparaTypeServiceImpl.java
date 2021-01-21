package com.saint.systemManager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.dao.IFrmCodeDao;
import com.saint.systemManager.dao.IFrmSysparaTypeDao;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import com.saint.systemManager.sqlWhere.FrmSysparaTypeSqlWhere;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere.Criteria;

/**
*类注释信息
*表名FRM_CODE
*表说明代码信息
  */
public class FrmSysparaTypeServiceImpl implements IFrmSysparaTypeService {
    private IFrmSysparaTypeDao frmSysparaTypeDao;

    /**
     * 根据主键查询一条记录
     * @return
     */
    public FrmSysparaTypeEntity selectFrmSysparaTypeByPrimaryKey(FrmSysparaTypeKey key) {
        try {
        	FrmSysparaTypeEntity entity = frmSysparaTypeDao.selectFrmSysparaTypeByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmCode+"失败："+e.getMessage());
        }
    }
    /**
     * 根据主键查询一条记录
     * @return
     */
    public String selectFrmSysparaTypeBygjz(String gjz) {
        try {
        	FrmSysparaTypeKey key = new FrmSysparaTypeKey();
        	key.setXtlb("00");
        	key.setGjz(gjz);
        	FrmSysparaTypeEntity entity = frmSysparaTypeDao.selectFrmSysparaTypeByPrimaryKey(key);
            return entity.getMrz();
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmCode+"失败："+e.getMessage());
        }
    }
    public ExcuteResult updateFrmSysparaTypeByPrimaryKeySelective(FrmSysparaTypeEntity entity) {
        try {
            return frmSysparaTypeDao.updateFrmSysparaTypeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmSysparaType+"失败："+e.getMessage());
        }
    }
	public IFrmSysparaTypeDao getFrmSysparaTypeDao() {
		return frmSysparaTypeDao;
	}

	public void setFrmSysparaTypeDao(IFrmSysparaTypeDao frmSysparaTypeDao) {
		this.frmSysparaTypeDao = frmSysparaTypeDao;
	}
}