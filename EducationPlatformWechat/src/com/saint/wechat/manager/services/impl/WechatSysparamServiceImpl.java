package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.dao.IWechatSysparamDao;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.sqlWhere.WechatSysparamSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.WechatSysparamSqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WechatSysparamServiceImpl implements IWechatSysparamService {
    private IWechatSysparamDao wechatSysparamDao;

    public List<WechatSysparamEntity> selectListPageWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere) {
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
            List<WechatSysparamEntity> entitylist=wechatSysparamDao.selectListPageWechatSysparamBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatSysparam+"失败："+e.getMessage());
        }
    }

    public List<WechatSysparamEntity> selectListWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere) {
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
            List<WechatSysparamEntity> entitylist=wechatSysparamDao.selectListWechatSysparamBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatSysparam+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatSysparamBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatSysparamDao.selectListWechatSysparamBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatSysparam+"失败："+e.getMessage());
        }
    }

    public WechatSysparamEntity selectWechatSysparamByPrimaryKey(WechatSysparamKey key) {
        try {
            WechatSysparamEntity entity = wechatSysparamDao.selectWechatSysparamByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatSysparam+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatSysparam(WechatSysparamEntity entity) {
        try {
            return wechatSysparamDao.insertWechatSysparam(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatSysparam+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatSysparamSelective(WechatSysparamEntity entity) {
        try {
            return wechatSysparamDao.insertWechatSysparamSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatSysparam+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatSysparamByPrimaryKey(WechatSysparamEntity entity) {
        try {
            return wechatSysparamDao.updateWechatSysparamByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatSysparam+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatSysparamBySqlWhere(WechatSysparamEntity entity, WechatSysparamSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatSysparamDao.updateWechatSysparamBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatSysparam+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatSysparamBySqlWhereSelective(WechatSysparamEntity entity, WechatSysparamSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatSysparamDao.updateWechatSysparamBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatSysparam+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatSysparamByPrimaryKeySelective(WechatSysparamEntity entity) {
        try {
            return wechatSysparamDao.updateWechatSysparamByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatSysparam+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatSysparamByPrimaryKey(WechatSysparamKey key) {
        try {
            return wechatSysparamDao.deleteWechatSysparamByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatSysparam+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatSysparamDao.deleteWechatSysparamBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatSysparam+"失败："+e.getMessage());
        }
    }

    public int countWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)wechatSysparamDao.countWechatSysparamBySqlWhere(sqlWhere);
    }

    public void setWechatSysparamDao(IWechatSysparamDao wechatSysparamDao) {
        this.wechatSysparamDao = wechatSysparamDao;
    }

    public IWechatSysparamDao getWechatSysparamDao() {
        return wechatSysparamDao;
    }
}