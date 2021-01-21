package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfApplyChangeEntity;
import com.saint.wechat.manager.dao.IXfApplyChangeDao;
import com.saint.wechat.manager.services.IXfApplyChangeService;
import com.saint.wechat.manager.sqlWhere.XfApplyChangeSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.XfApplyChangeSqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XfApplyChangeServiceImpl implements IXfApplyChangeService {
    private IXfApplyChangeDao xfApplyChangeDao;

    public List<XfApplyChangeEntity> selectListPageXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere) {
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
            List<XfApplyChangeEntity> entitylist=xfApplyChangeDao.selectListPageXfApplyChangeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfApplyChange+"失败："+e.getMessage());
        }
    }

    public List<XfApplyChangeEntity> selectListXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere) {
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
            if(sqlWhere.getSfzhm()!=null && !sqlWhere.getSfzhm().equals("")){
                criteria.andSfzhmEqualTo(sqlWhere.getSfzhm());
            }
            if(sqlWhere.getOpenid()!=null && !sqlWhere.getOpenid().equals("")){
            	criteria.andOpenidEqualTo(sqlWhere.getOpenid());
            }
            if(sqlWhere.getYitongcode()!=null && !sqlWhere.getYitongcode().equals("")){
            	criteria.andYitongcodeEqualTo(sqlWhere.getYitongcode());
            }
            if(sqlWhere.getBltype()!=null && !sqlWhere.getBltype().equals("")){
            	criteria.andBltypeEqualTo(sqlWhere.getBltype());
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
            	criteria.andStateEqualTo(sqlWhere.getState());
            }
            if(sqlWhere.getYiyuan()!=null && !sqlWhere.getYiyuan().equals("")){
            	criteria.andYiyuanEqualTo(sqlWhere.getYiyuan());
            }
        }
        try {
            List<XfApplyChangeEntity> entitylist=xfApplyChangeDao.selectListXfApplyChangeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfApplyChange+"失败："+e.getMessage());
        }
    }
    
    public List<XfApplyChangeEntity> selectListXfApplyChangeBySqlWhere_jd(XfApplyChangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getYitongcode()!=null && !sqlWhere.getYitongcode().equals("")){
            	criteria.andYitongcodeEqualTo(sqlWhere.getYitongcode());
            }
            if(sqlWhere.getBltype()!=null && !sqlWhere.getBltype().equals("")){
            	criteria.andBltypeNotEqualTo(sqlWhere.getBltype());
            }
        }
        try {
            List<XfApplyChangeEntity> entitylist=xfApplyChangeDao.selectListXfApplyChangeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfApplyChange+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListXfApplyChangeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfApplyChangeDao.selectListXfApplyChangeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfApplyChange+"失败："+e.getMessage());
        }
    }

    public XfApplyChangeEntity selectXfApplyChangeByPrimaryKey(String xh) {
        try {
            XfApplyChangeEntity entity = xfApplyChangeDao.selectXfApplyChangeByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfApplyChange+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertXfApplyChange(XfApplyChangeEntity entity) {
        try {
            return xfApplyChangeDao.insertXfApplyChange(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfApplyChange+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertXfApplyChangeSelective(XfApplyChangeEntity entity) {
        try {
            return xfApplyChangeDao.insertXfApplyChangeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfApplyChange+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfApplyChangeByPrimaryKey(XfApplyChangeEntity entity) {
        try {
            return xfApplyChangeDao.updateXfApplyChangeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfApplyChange+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfApplyChangeBySqlWhere(XfApplyChangeEntity entity, XfApplyChangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfApplyChangeDao.updateXfApplyChangeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfApplyChange+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfApplyChangeBySqlWhereSelective(XfApplyChangeEntity entity, XfApplyChangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfApplyChangeDao.updateXfApplyChangeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfApplyChange+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfApplyChangeByPrimaryKeySelective(XfApplyChangeEntity entity) {
        try {
            return xfApplyChangeDao.updateXfApplyChangeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfApplyChange+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteXfApplyChangeByPrimaryKey(String xh) {
        try {
            return xfApplyChangeDao.deleteXfApplyChangeByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfApplyChange+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfApplyChangeDao.deleteXfApplyChangeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfApplyChange+"失败："+e.getMessage());
        }
    }

    public int countXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)xfApplyChangeDao.countXfApplyChangeBySqlWhere(sqlWhere);
    }

    public void setXfApplyChangeDao(IXfApplyChangeDao xfApplyChangeDao) {
        this.xfApplyChangeDao = xfApplyChangeDao;
    }

    public IXfApplyChangeDao getXfApplyChangeDao() {
        return xfApplyChangeDao;
    }
}