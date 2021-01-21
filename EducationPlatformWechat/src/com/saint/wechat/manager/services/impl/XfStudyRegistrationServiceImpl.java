package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.dao.IXfStudyRegistrationDao;
import com.saint.wechat.manager.services.IXfStudyRegistrationService;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XfStudyRegistrationServiceImpl implements IXfStudyRegistrationService {
    private IXfStudyRegistrationDao xfStudyRegistrationDao;

    public List<XfStudyRegistrationEntity> selectListPageXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere) {
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
            List<XfStudyRegistrationEntity> entitylist=xfStudyRegistrationDao.selectListPageXfStudyRegistrationBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<XfStudyRegistrationEntity> selectListXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getEmpNumber()!=null && !sqlWhere.getEmpNumber().equals("")){
                criteria.andEmpNumberEqualTo(sqlWhere.getEmpNumber());
            }
            if(sqlWhere.getIsgrant()!=null && !sqlWhere.getIsgrant().equals("")){
                criteria.andIsgrantEqualTo(sqlWhere.getIsgrant());
            }
            if(sqlWhere.getCourseId()!=null && !sqlWhere.getCourseId().equals("")){
                criteria.andCourseIdEqualTo(sqlWhere.getCourseId());
            }
            if(sqlWhere.getCourseName()!=null && !sqlWhere.getCourseName().equals("")){
            	criteria.andCourseNameLike("%"+sqlWhere.getCourseName()+"%");
            }
            if(sqlWhere.getAddYear()!=null && !sqlWhere.getAddYear().equals("")){
                criteria.andAddYearEqualTo(sqlWhere.getAddYear());
            }
            if(sqlWhere.getDakaTime()!=null && !sqlWhere.getDakaTime().equals("")){
                criteria.andDakaTimeIsNotNull();
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
        }
        try {
            List<XfStudyRegistrationEntity> entitylist=xfStudyRegistrationDao.selectListXfStudyRegistrationBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListXfStudyRegistrationBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfStudyRegistrationDao.selectListXfStudyRegistrationBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public XfStudyRegistrationEntity selectXfStudyRegistrationByPrimaryKey(String xh) {
        try {
            XfStudyRegistrationEntity entity = xfStudyRegistrationDao.selectXfStudyRegistrationByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertXfStudyRegistration(XfStudyRegistrationEntity entity) {
        try {
            return xfStudyRegistrationDao.insertXfStudyRegistration(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertXfStudyRegistrationSelective(XfStudyRegistrationEntity entity) {
        try {
            return xfStudyRegistrationDao.insertXfStudyRegistrationSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfStudyRegistrationByPrimaryKey(XfStudyRegistrationEntity entity) {
        try {
            return xfStudyRegistrationDao.updateXfStudyRegistrationByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfStudyRegistrationBySqlWhere(XfStudyRegistrationEntity entity, XfStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfStudyRegistrationDao.updateXfStudyRegistrationBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfStudyRegistrationBySqlWhereSelective(XfStudyRegistrationEntity entity, XfStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfStudyRegistrationDao.updateXfStudyRegistrationBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfStudyRegistrationByPrimaryKeySelective(XfStudyRegistrationEntity entity) {
        try {
            return xfStudyRegistrationDao.updateXfStudyRegistrationByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteXfStudyRegistrationByPrimaryKey(String xh) {
        try {
            return xfStudyRegistrationDao.deleteXfStudyRegistrationByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfStudyRegistrationDao.deleteXfStudyRegistrationBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getCourseId()!=null && !sqlWhere.getCourseId().equals("")){
                criteria.andCourseIdEqualTo(sqlWhere.getCourseId());
            }
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)xfStudyRegistrationDao.countXfStudyRegistrationBySqlWhere(sqlWhere);
    }

    public void setXfStudyRegistrationDao(IXfStudyRegistrationDao xfStudyRegistrationDao) {
        this.xfStudyRegistrationDao = xfStudyRegistrationDao;
    }

    public IXfStudyRegistrationDao getXfStudyRegistrationDao() {
        return xfStudyRegistrationDao;
    }
}