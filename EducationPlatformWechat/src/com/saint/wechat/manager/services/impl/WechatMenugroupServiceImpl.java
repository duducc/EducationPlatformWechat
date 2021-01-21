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
            List<WechatMenugroupEntity> entitylist=wechatMenugroupDao.selectListPageWechatMenugroupBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
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
            sqlWhere.setOrderByClause(" menusxh ");
        }
        try {
            List<WechatMenugroupEntity> entitylist=wechatMenugroupDao.selectListWechatMenugroupBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatMenugroupBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatMenugroupDao.selectListWechatMenugroupBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public WechatMenugroupEntity selectWechatMenugroupByPrimaryKey(String menusxh) {
        try {
            WechatMenugroupEntity entity = wechatMenugroupDao.selectWechatMenugroupByPrimaryKey(menusxh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatMenugroup(WechatMenugroupEntity entity) {
        try {
            return wechatMenugroupDao.insertWechatMenugroup(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatMenugroupSelective(WechatMenugroupEntity entity) {
        try {
            return wechatMenugroupDao.insertWechatMenugroupSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenugroupByPrimaryKey(WechatMenugroupEntity entity) {
        try {
            return wechatMenugroupDao.updateWechatMenugroupByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenugroupBySqlWhere(WechatMenugroupEntity entity, WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatMenugroupDao.updateWechatMenugroupBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenugroupBySqlWhereSelective(WechatMenugroupEntity entity, WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatMenugroupDao.updateWechatMenugroupBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatMenugroupByPrimaryKeySelective(WechatMenugroupEntity entity) {
        try {
            return wechatMenugroupDao.updateWechatMenugroupByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatMenugroupByPrimaryKey(String menusxh) {
        try {
            return wechatMenugroupDao.deleteWechatMenugroupByPrimaryKey(menusxh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatMenugroupDao.deleteWechatMenugroupBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatMenugroup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
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