package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatMenugroupEntity;
import com.saint.wechat.manager.dao.IWechatMenugroupDao;
import com.saint.wechat.manager.services.IWechatMenugroupService;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WechatMenugroupServiceImpl implements IWechatMenugroupService {
    private IWechatMenugroupDao wechatMenugroupDao;

    public List<WechatMenugroupEntity> selectListPageWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
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
            List<WechatMenugroupEntity> entitylist=wechatMenugroupDao.selectListPageWechatMenugroupBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public List<WechatMenugroupEntity> selectListWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getClientsxh()!=null && !sqlWhere.getClientsxh().equals("")){
                criteria.andClientsxhEqualTo(sqlWhere.getClientsxh());
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
            sqlWhere.setOrderByClause(" menusxh ");
        }
        try {
            List<WechatMenugroupEntity> entitylist=wechatMenugroupDao.selectListWechatMenugroupBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatMenugroupBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatMenugroupDao.selectListWechatMenugroupBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public WechatMenugroupEntity selectWechatMenugroupByPrimaryKey(String menusxh) {
        try {
            WechatMenugroupEntity entity = wechatMenugroupDao.selectWechatMenugroupByPrimaryKey(menusxh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatMenugroup(WechatMenugroupEntity entity) {
        try {
            return wechatMenugroupDao.insertWechatMenugroup(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatMenugroupSelective(WechatMenugroupEntity entity) {
        try {
            return wechatMenugroupDao.insertWechatMenugroupSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenugroupByPrimaryKey(WechatMenugroupEntity entity) {
        try {
            return wechatMenugroupDao.updateWechatMenugroupByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenugroupBySqlWhere(WechatMenugroupEntity entity, WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatMenugroupDao.updateWechatMenugroupBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenugroupBySqlWhereSelective(WechatMenugroupEntity entity, WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatMenugroupDao.updateWechatMenugroupBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenugroupByPrimaryKeySelective(WechatMenugroupEntity entity) {
        try {
            return wechatMenugroupDao.updateWechatMenugroupByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatMenugroupByPrimaryKey(String menusxh) {
        try {
            return wechatMenugroupDao.deleteWechatMenugroupByPrimaryKey(menusxh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatMenugroupDao.deleteWechatMenugroupBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatMenugroup+"失败："+e.getMessage());
        }
    }

    public int countWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)wechatMenugroupDao.countWechatMenugroupBySqlWhere(sqlWhere);
    }

    public void setWechatMenugroupDao(IWechatMenugroupDao wechatMenugroupDao) {
        this.wechatMenugroupDao = wechatMenugroupDao;
    }

    public IWechatMenugroupDao getWechatMenugroupDao() {
        return wechatMenugroupDao;
    }
}