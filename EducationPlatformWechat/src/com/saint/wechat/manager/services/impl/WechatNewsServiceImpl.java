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
            ������ʽ˵��
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            Like������ʽ˵��
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxLike("%"sqlWhere.getJflx()"%");
            }
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");������
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
            �����Ҫ���or���� ����������
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                 criteria.addSDWhereSql(" (tjdd like '%"+sqlWhere.getGlbm()+"%' or tjgsdd like '%"+sqlWhere.getGlbm()+"%') ");
            }
            �����ڲ�ѯ����
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
            throw new ExcuteException(FrmGnid.selectListPageWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<WechatNewsEntity> selectListWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");������
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
            throw new ExcuteException(FrmGnid.selectListPageWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatNewsBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatNewsDao.selectListWechatNewsBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public WechatNewsEntity selectWechatNewsByPrimaryKey(String ywxh) {
        try {
            WechatNewsEntity entity = wechatNewsDao.selectWechatNewsByPrimaryKey(ywxh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatNews(WechatNewsEntity entity) {
        try {
            return wechatNewsDao.insertWechatNews(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatNewsSelective(WechatNewsEntity entity) {
        try {
            return wechatNewsDao.insertWechatNewsSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatNewsByPrimaryKey(WechatNewsEntity entity) {
        try {
            return wechatNewsDao.updateWechatNewsByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatNewsBySqlWhere(WechatNewsEntity entity, WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatNewsDao.updateWechatNewsBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatNewsBySqlWhereSelective(WechatNewsEntity entity, WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatNewsDao.updateWechatNewsBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatNewsByPrimaryKeySelective(WechatNewsEntity entity) {
        try {
            return wechatNewsDao.updateWechatNewsByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatNewsByPrimaryKey(String ywxh) {
        try {
            return wechatNewsDao.deleteWechatNewsByPrimaryKey(ywxh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatNewsDao.deleteWechatNewsBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatNews+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
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