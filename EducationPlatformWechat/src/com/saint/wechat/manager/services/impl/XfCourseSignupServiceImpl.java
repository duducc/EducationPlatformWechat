package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.DateManager;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfCourseSignupEntity;
import com.saint.wechat.manager.bean.XfCourseSignupKey;
import com.saint.wechat.manager.dao.IXfCourseSignupDao;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfCourseSignupService;
import com.saint.wechat.manager.sqlWhere.XfCourseSignupSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.XfCourseSignupSqlWhere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XfCourseSignupServiceImpl implements IXfCourseSignupService {
    private IXfCourseSignupDao xfCourseSignupDao;
    
    private IXfCourseService xfCourseService;
    
    private IWechatBindService wechatBindService;

    public List<XfCourseSignupEntity> selectListPageXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere) {
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
            
            if(sqlWhere.getCourseId()!=null && !sqlWhere.getCourseId().equals("")){
                criteria.andCourseIdEqualTo(sqlWhere.getCourseId());
            }
	       	 if(sqlWhere.getYitongCard()!=null && !sqlWhere.getYitongCard().equals("")){
	       		 criteria.andYitongCardEqualTo(sqlWhere.getYitongCard());
	       	 }
	       	 if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
	       		 criteria.andStateEqualTo(sqlWhere.getState());
	       	 }
        }
        try {
            List<XfCourseSignupEntity> entitylist=xfCourseSignupDao.selectListPageXfCourseSignupBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<XfCourseSignupEntity> selectListXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere) {
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
            if(sqlWhere.getCourseId()!=null && !sqlWhere.getCourseId().equals("")){
                criteria.andCourseIdEqualTo(sqlWhere.getCourseId());
            }
	       	 if(sqlWhere.getYitongCard()!=null && !sqlWhere.getYitongCard().equals("")){
	       		 criteria.andYitongCardEqualTo(sqlWhere.getYitongCard());
	       	 }
	       	 if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
	       		 criteria.andStateEqualTo(sqlWhere.getState());
	       	 }
	       	 if(sqlWhere.getCoursesTask()!=null && !sqlWhere.getCoursesTask().equals("")){
	       		 criteria.andCoursesTaskLike("%"+sqlWhere.getCoursesTask()+"%");
	       	 }
        }
        try {
            List<XfCourseSignupEntity> entitylist=xfCourseSignupDao.selectListXfCourseSignupBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListXfCourseSignupBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfCourseSignupDao.selectListXfCourseSignupBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public XfCourseSignupEntity selectXfCourseSignupByPrimaryKey(XfCourseSignupKey key) {
        try {
            XfCourseSignupEntity entity = xfCourseSignupDao.selectXfCourseSignupByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }
/**
 * ���ⱨ��
 */
    public ExcuteResult insertXfCourseSignup(XfCourseSignupEntity entity,String clientsxh,String openId) {
        try {
        	int countsign = 0;
        	//�ӿ�����ѯ����
        	XfCourseEntity courseEntity = xfCourseService.selectXfCourseByPrimaryKey(entity.getCourseId());
        	//��΢�Ű󶨱��ѯ��Ա��Ϣ
        	WechatBindKey key = new WechatBindKey();
        	key.setClientsxh(clientsxh);
        	key.setOpenId(openId);
        	WechatBindEntity wechatBindEntity = wechatBindService.selectWechatBindByPrimaryKey(key);
        	XfCourseSignupKey signupkey = new XfCourseSignupKey();
        	signupkey.setCourseId(entity.getCourseId());
        	signupkey.setYitongCard(wechatBindEntity.getYitongCard());
        	XfCourseSignupEntity countentity = selectXfCourseSignupByPrimaryKey(signupkey);
        	
        	if(countentity != null && countentity.getState().equals("1")){//�ѱ���
        		ExcuteResult result = new ExcuteResult();
        		result.setReturnCode("0");
        		result.setReturnMessage("repetition");
        		return result;
        	}else if(countentity != null && countentity.getState().equals("2")){//������ȡ��
        		XfCourseSignupEntity entity2 = new XfCourseSignupEntity();
        		entity2.setCourseId(entity.getCourseId());
        		entity2.setYitongCard(wechatBindEntity.getYitongCard());
        		entity2.setState("1");
        		entity2.setGxsj(DateManager.getDate());
        		return xfCourseSignupDao.updateXfCourseSignupByPrimaryKeySelective(entity2);
        	}else{//δ����
	        	if(wechatBindEntity != null){
	        		entity.setYitongCard(wechatBindEntity.getYitongCard());
	        		entity.setXm(wechatBindEntity.getXm());
	        	}
	        	
	        	if(courseEntity != null){
	        		entity.setCoursesContent(courseEntity.getCoursesContent());
	        		entity.setCoursesTask(courseEntity.getCoursesTask());
	        		entity.setCredit(courseEntity.getCredit());
	        		entity.setHours(courseEntity.getHours());
	        		entity.setProId(courseEntity.getProId());
	        		entity.setProName(courseEntity.getProName());
	        		entity.setSignupDate(DateManager.getDate());
	        		entity.setState("1");
	        		entity.setMethod(courseEntity.getMethod());
	        		entity.setGxsj(DateManager.getDate());
	        	}
	            return xfCourseSignupDao.insertXfCourseSignup(entity);
        	}
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }
    public ExcuteResult insertXfCourseSignup(XfCourseSignupEntity entity) {
        try {
        	
            return xfCourseSignupDao.insertXfCourseSignup(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }
    public ExcuteResult insertXfCourseSignupSelective(XfCourseSignupEntity entity) {
        try {
            return xfCourseSignupDao.insertXfCourseSignupSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfCourseSignupByPrimaryKey(XfCourseSignupEntity entity) {
        try {
            return xfCourseSignupDao.updateXfCourseSignupByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfCourseSignupBySqlWhere(XfCourseSignupEntity entity, XfCourseSignupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseSignupDao.updateXfCourseSignupBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfCourseSignupBySqlWhereSelective(XfCourseSignupEntity entity, XfCourseSignupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseSignupDao.updateXfCourseSignupBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfCourseSignupByPrimaryKeySelective(XfCourseSignupEntity entity) {
        try {
            return xfCourseSignupDao.updateXfCourseSignupByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteXfCourseSignupByPrimaryKey(XfCourseSignupKey key) {
        try {
            return xfCourseSignupDao.deleteXfCourseSignupByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseSignupDao.deleteXfCourseSignupBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCourseSignup+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere) {
        if(sqlWhere !=null){
        	 Criteria criteria=sqlWhere.createCriteria();
        	 
        	 if(sqlWhere.getCourseId()!=null && !sqlWhere.getCourseId().equals("")){
                 criteria.andCourseIdEqualTo(sqlWhere.getCourseId());
             }
        	 if(sqlWhere.getYitongCard()!=null && !sqlWhere.getYitongCard().equals("")){
        		 criteria.andYitongCardEqualTo(sqlWhere.getYitongCard());
        	 }
        	 if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
        		 criteria.andStateEqualTo(sqlWhere.getState());
        	 }
           
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)xfCourseSignupDao.countXfCourseSignupBySqlWhere(sqlWhere);
    }

    public void setXfCourseSignupDao(IXfCourseSignupDao xfCourseSignupDao) {
        this.xfCourseSignupDao = xfCourseSignupDao;
    }

    public IXfCourseSignupDao getXfCourseSignupDao() {
        return xfCourseSignupDao;
    }

	public IXfCourseService getXfCourseService() {
		return xfCourseService;
	}

	public void setXfCourseService(IXfCourseService xfCourseService) {
		this.xfCourseService = xfCourseService;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
    
    
}