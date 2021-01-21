package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatNewsEntity;
import com.saint.wechat.manager.dao.IWechatNewsDao;
import com.saint.wechat.manager.services.IWechatNewsService;
import com.saint.wechat.manager.sqlWhere.WechatNewsSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.WechatNewsSqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WechatNewsServiceImpl implements IWechatNewsService {
    private IWechatNewsDao wechatNewsDao;

    public List<WechatNewsEntity> selectListPageWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
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
            List<WechatNewsEntity> entitylist=wechatNewsDao.selectListPageWechatNewsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatNews+"失败："+e.getMessage());
        }
    }

    public List<WechatNewsEntity> selectListWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
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
        }
        try {
            List<WechatNewsEntity> entitylist=wechatNewsDao.selectListWechatNewsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatNews+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatNewsBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatNewsDao.selectListWechatNewsBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatNews+"失败："+e.getMessage());
        }
    }

    public WechatNewsEntity selectWechatNewsByPrimaryKey(String ywxh) {
        try {
            WechatNewsEntity entity = wechatNewsDao.selectWechatNewsByPrimaryKey(ywxh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatNews+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatNews(WechatNewsEntity entity) {
        try {
            return wechatNewsDao.insertWechatNews(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatNews+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatNewsSelective(WechatNewsEntity entity) {
        try {
            return wechatNewsDao.insertWechatNewsSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatNews+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatNewsByPrimaryKey(WechatNewsEntity entity) {
        try {
            return wechatNewsDao.updateWechatNewsByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatNews+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatNewsBySqlWhere(WechatNewsEntity entity, WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatNewsDao.updateWechatNewsBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatNews+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatNewsBySqlWhereSelective(WechatNewsEntity entity, WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatNewsDao.updateWechatNewsBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatNews+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatNewsByPrimaryKeySelective(WechatNewsEntity entity) {
        try {
            return wechatNewsDao.updateWechatNewsByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatNews+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatNewsByPrimaryKey(String ywxh) {
        try {
            return wechatNewsDao.deleteWechatNewsByPrimaryKey(ywxh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatNews+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatNewsDao.deleteWechatNewsBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatNews+"失败："+e.getMessage());
        }
    }

    public int countWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)wechatNewsDao.countWechatNewsBySqlWhere(sqlWhere);
    }

    public void setWechatNewsDao(IWechatNewsDao wechatNewsDao) {
        this.wechatNewsDao = wechatNewsDao;
    }

    public IWechatNewsDao getWechatNewsDao() {
        return wechatNewsDao;
    }
}