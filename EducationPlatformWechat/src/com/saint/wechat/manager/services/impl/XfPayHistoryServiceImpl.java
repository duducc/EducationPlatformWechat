package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfPayHistoryEntity;
import com.saint.wechat.manager.dao.IXfPayHistoryDao;
import com.saint.wechat.manager.services.IXfPayHistoryService;
import com.saint.wechat.manager.sqlWhere.XfPayHistorySqlWhere.*;
import com.saint.wechat.manager.sqlWhere.XfPayHistorySqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XfPayHistoryServiceImpl implements IXfPayHistoryService {
    private IXfPayHistoryDao xfPayHistoryDao;

    public List<XfPayHistoryEntity> selectListPageXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere) {
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
            List<XfPayHistoryEntity> entitylist=xfPayHistoryDao.selectListPageXfPayHistoryBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfPayHistory+"失败："+e.getMessage());
        }
    }

    public List<XfPayHistoryEntity> selectListXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
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
            if(sqlWhere.getYitongcard()!=null && !sqlWhere.getYitongcard().equals("")){
                criteria.andYitongcardEqualTo(sqlWhere.getYitongcard());
            }
        }
        try {
            List<XfPayHistoryEntity> entitylist=xfPayHistoryDao.selectListXfPayHistoryBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfPayHistory+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListXfPayHistoryBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfPayHistoryDao.selectListXfPayHistoryBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfPayHistory+"失败："+e.getMessage());
        }
    }

    public XfPayHistoryEntity selectXfPayHistoryByPrimaryKey(String xh) {
        try {
            XfPayHistoryEntity entity = xfPayHistoryDao.selectXfPayHistoryByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfPayHistory+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertXfPayHistory(XfPayHistoryEntity entity) {
        try {
            return xfPayHistoryDao.insertXfPayHistory(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfPayHistory+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertXfPayHistorySelective(XfPayHistoryEntity entity) {
        try {
            return xfPayHistoryDao.insertXfPayHistorySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfPayHistory+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfPayHistoryByPrimaryKey(XfPayHistoryEntity entity) {
        try {
            return xfPayHistoryDao.updateXfPayHistoryByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfPayHistory+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfPayHistoryBySqlWhere(XfPayHistoryEntity entity, XfPayHistorySqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfPayHistoryDao.updateXfPayHistoryBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfPayHistory+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfPayHistoryBySqlWhereSelective(XfPayHistoryEntity entity, XfPayHistorySqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfPayHistoryDao.updateXfPayHistoryBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfPayHistory+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfPayHistoryByPrimaryKeySelective(XfPayHistoryEntity entity) {
        try {
            return xfPayHistoryDao.updateXfPayHistoryByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfPayHistory+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteXfPayHistoryByPrimaryKey(String xh) {
        try {
            return xfPayHistoryDao.deleteXfPayHistoryByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfPayHistory+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfPayHistoryDao.deleteXfPayHistoryBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfPayHistory+"失败："+e.getMessage());
        }
    }

    public int countXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)xfPayHistoryDao.countXfPayHistoryBySqlWhere(sqlWhere);
    }

    public void setXfPayHistoryDao(IXfPayHistoryDao xfPayHistoryDao) {
        this.xfPayHistoryDao = xfPayHistoryDao;
    }

    public IXfPayHistoryDao getXfPayHistoryDao() {
        return xfPayHistoryDao;
    }
}