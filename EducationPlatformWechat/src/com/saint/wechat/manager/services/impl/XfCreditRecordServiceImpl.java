package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfCreditRecordEntity;
import com.saint.wechat.manager.bean.XfPosRecordEntity;
import com.saint.wechat.manager.dao.IXfCreditRecordDao;
import com.saint.wechat.manager.services.IXfCreditRecordService;
import com.saint.wechat.manager.sqlWhere.XfCreditRecordSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.XfCreditRecordSqlWhere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XfCreditRecordServiceImpl implements IXfCreditRecordService {
    private IXfCreditRecordDao xfCreditRecordDao;

    public List<XfCreditRecordEntity> selectListPageXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            条件格式说明
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            Like条件格式说明
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxLike("%"sqlWhere.getJflx()"%");
            }
            如果有日期格式，需要做格式转换
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");短日期
            if((sqlWhere.getXjrqq()!=null && !sqlWhere.getXjrqq().equals(""))&&(sqlWhere.getXjrqz()!=null && !sqlWhere.getXjrqz().equals("")) ){
                Date date_s = null;
                Date date_e = null;
                try {
                    date_s = dateFormat.parse(sqlWhere.getXjrqq());
                    date_e = dateFormat.parse(sqlWhere.getXjrqz());
                } catch (ParseException e) {
                    date_s=new Date();
                    date_e=new Date();
                }
                criteria.andXjrqBetween(date_s, date_e);
            }
            如果需要添加or条件 或其他条件
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                 criteria.addSDWhereSql(" (tjdd like '%"+sqlWhere.getGlbm()+"%' or tjgsdd like '%"+sqlWhere.getGlbm()+"%') ");
            }
            长日期查询条件
            if(sqlWhere.getYjrssjq()!=null && !sqlWhere.getYjrssjq().equals("")){
                criteria.andSnqdyjddsjGreaterThanOrEqualTo(Timestamp.valueOf(sqlWhere.getYjrssjz()));
            }
            **/
        }
        try {
            List<XfCreditRecordEntity> entitylist=xfCreditRecordDao.selectListPageXfCreditRecordBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public List<XfCreditRecordEntity> selectListXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getManId()!=null && !sqlWhere.getManId().equals("")){
                criteria.andManIdEqualTo(sqlWhere.getManId());
            }
            if(sqlWhere.getAddYear()!=null && !sqlWhere.getAddYear().equals("")){
                criteria.andAddYearEqualTo(sqlWhere.getAddYear());
            }
            /**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            如果有日期格式，需要做格式转换
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");短日期
            if((sqlWhere.getXjrqq()!=null && !sqlWhere.getXjrqq().equals(""))&&(sqlWhere.getXjrqz()!=null && !sqlWhere.getXjrqz().equals("")) ){
                Date date_s = null;
                Date date_e = null;
                try {
                    date_s = dateFormat.parse(sqlWhere.getXjrqq());
                    date_e = dateFormat.parse(sqlWhere.getXjrqz());
                } catch (ParseException e) {
                    date_s=new Date();
                    date_e=new Date();
                }
                criteria.andXjrqBetween(date_s, date_e);
            }
            **/
        }
        try {
            List<XfCreditRecordEntity> entitylist=xfCreditRecordDao.selectListXfCreditRecordBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListXfCreditRecordBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfCreditRecordDao.selectListXfCreditRecordBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public XfCreditRecordEntity selectXfCreditRecordByPrimaryKey(String xh) {
        try {
            XfCreditRecordEntity entity = xfCreditRecordDao.selectXfCreditRecordByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertXfCreditRecord(XfCreditRecordEntity entity) {
        try {
            return xfCreditRecordDao.insertXfCreditRecord(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertXfCreditRecordSelective(XfCreditRecordEntity entity) {
        try {
            return xfCreditRecordDao.insertXfCreditRecordSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfCreditRecordByPrimaryKey(XfCreditRecordEntity entity) {
        try {
            return xfCreditRecordDao.updateXfCreditRecordByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfCreditRecordBySqlWhere(XfCreditRecordEntity entity, XfCreditRecordSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfCreditRecordDao.updateXfCreditRecordBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfCreditRecordBySqlWhereSelective(XfCreditRecordEntity entity, XfCreditRecordSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfCreditRecordDao.updateXfCreditRecordBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfCreditRecordByPrimaryKeySelective(XfCreditRecordEntity entity) {
        try {
            return xfCreditRecordDao.updateXfCreditRecordByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteXfCreditRecordByPrimaryKey(String xh) {
        try {
            return xfCreditRecordDao.deleteXfCreditRecordByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfCreditRecordDao.deleteXfCreditRecordBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCreditRecord+"失败："+e.getMessage());
        }
    }

    public int countXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)xfCreditRecordDao.countXfCreditRecordBySqlWhere(sqlWhere);
    }

    public void setXfCreditRecordDao(IXfCreditRecordDao xfCreditRecordDao) {
        this.xfCreditRecordDao = xfCreditRecordDao;
    }

    public IXfCreditRecordDao getXfCreditRecordDao() {
        return xfCreditRecordDao;
    }

	public List<XfPosRecordEntity> selectListXfPosRecordBySqlWhere(String emp_number) {
        try {
            List<XfPosRecordEntity> entitylist=xfCreditRecordDao.selectListXfPosRecordBySqlWhere(emp_number);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfCreditRecord+"失败："+e.getMessage());
        }
    }
	public List<XfPosRecordEntity> selectListXfPosRecodebyIsGrant(String emp_number,String isgrant) {
        try {
            List<XfPosRecordEntity> entitylist=xfCreditRecordDao.selectListXfPosRecodebyIsGrant(emp_number,isgrant);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfCreditRecord+"失败："+e.getMessage());
        }
    }
}