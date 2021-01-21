package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.dao.IWechatClientinfoDao;
import com.saint.wechat.manager.services.IWechatClientinfoService;
import com.saint.wechat.manager.sqlWhere.WechatClientinfoSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.WechatClientinfoSqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WechatClientinfoServiceImpl implements IWechatClientinfoService {
    private IWechatClientinfoDao wechatClientinfoDao;

    public List<WechatClientinfoEntity> selectListPageWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
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
            List<WechatClientinfoEntity> entitylist=wechatClientinfoDao.selectListPageWechatClientinfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public List<WechatClientinfoEntity> selectListWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
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
            List<WechatClientinfoEntity> entitylist=wechatClientinfoDao.selectListWechatClientinfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatClientinfoBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatClientinfoDao.selectListWechatClientinfoBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public WechatClientinfoEntity selectWechatClientinfoByPrimaryKey(String clientsxh) {
        try {
            WechatClientinfoEntity entity = wechatClientinfoDao.selectWechatClientinfoByPrimaryKey(clientsxh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatClientinfo(WechatClientinfoEntity entity) {
        try {
            return wechatClientinfoDao.insertWechatClientinfo(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertWechatClientinfoSelective(WechatClientinfoEntity entity) {
        try {
            return wechatClientinfoDao.insertWechatClientinfoSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatClientinfoByPrimaryKey(WechatClientinfoEntity entity) {
        try {
            return wechatClientinfoDao.updateWechatClientinfoByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatClientinfoBySqlWhere(WechatClientinfoEntity entity, WechatClientinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatClientinfoDao.updateWechatClientinfoBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatClientinfoBySqlWhereSelective(WechatClientinfoEntity entity, WechatClientinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatClientinfoDao.updateWechatClientinfoBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateWechatClientinfoByPrimaryKeySelective(WechatClientinfoEntity entity) {
        try {
            return wechatClientinfoDao.updateWechatClientinfoByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatClientinfoByPrimaryKey(String clientsxh) {
        try {
            return wechatClientinfoDao.deleteWechatClientinfoByPrimaryKey(clientsxh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return wechatClientinfoDao.deleteWechatClientinfoBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatClientinfo+"失败："+e.getMessage());
        }
    }

    public int countWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)wechatClientinfoDao.countWechatClientinfoBySqlWhere(sqlWhere);
    }

    public void setWechatClientinfoDao(IWechatClientinfoDao wechatClientinfoDao) {
        this.wechatClientinfoDao = wechatClientinfoDao;
    }

    public IWechatClientinfoDao getWechatClientinfoDao() {
        return wechatClientinfoDao;
    }
}