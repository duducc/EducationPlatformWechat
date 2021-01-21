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
            List<WechatClientinfoEntity> entitylist=wechatClientinfoDao.selectListPageWechatClientinfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<WechatClientinfoEntity> selectListWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
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
            List<WechatClientinfoEntity> entitylist=wechatClientinfoDao.selectListWechatClientinfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatClientinfoBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatClientinfoDao.selectListWechatClientinfoBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public WechatClientinfoEntity selectWechatClientinfoByPrimaryKey(String clientsxh) {
        try {
            WechatClientinfoEntity entity = wechatClientinfoDao.selectWechatClientinfoByPrimaryKey(clientsxh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatClientinfo(WechatClientinfoEntity entity) {
        try {
            return wechatClientinfoDao.insertWechatClientinfo(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatClientinfoSelective(WechatClientinfoEntity entity) {
        try {
            return wechatClientinfoDao.insertWechatClientinfoSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatClientinfoByPrimaryKey(WechatClientinfoEntity entity) {
        try {
            return wechatClientinfoDao.updateWechatClientinfoByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatClientinfoBySqlWhere(WechatClientinfoEntity entity, WechatClientinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatClientinfoDao.updateWechatClientinfoBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatClientinfoBySqlWhereSelective(WechatClientinfoEntity entity, WechatClientinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatClientinfoDao.updateWechatClientinfoBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatClientinfoByPrimaryKeySelective(WechatClientinfoEntity entity) {
        try {
            return wechatClientinfoDao.updateWechatClientinfoByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatClientinfoByPrimaryKey(String clientsxh) {
        try {
            return wechatClientinfoDao.deleteWechatClientinfoByPrimaryKey(clientsxh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatClientinfoDao.deleteWechatClientinfoBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatClientinfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
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