package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.TbDictdataEntity;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatSigntagEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.dao.IWechatBindDao;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WechatBindServiceImpl implements IWechatBindService {
    private IWechatBindDao wechatBindDao;
    
    public List<WechatBindEntity> selectListPageWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere) {
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
            List<WechatBindEntity> entitylist=wechatBindDao.selectListPageWechatBindBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<WechatBindEntity> selectListWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getYitongCard()!=null && !sqlWhere.getYitongCard().equals("")){
                criteria.andYitongCardEqualTo(sqlWhere.getYitongCard());
            }
            if(sqlWhere.getXm()!=null && !sqlWhere.getXm().equals("")){
                criteria.andXmEqualTo(sqlWhere.getXm());
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
                criteria.andStateEqualTo(sqlWhere.getState());
            }
            if(sqlWhere.getIsAdmin()!=null && !sqlWhere.getIsAdmin().equals("")){
                criteria.andIsAdminEqualTo(sqlWhere.getIsAdmin());
            }
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
        }
        try {
            List<WechatBindEntity> entitylist=wechatBindDao.selectListWechatBindBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListWechatBindBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=wechatBindDao.selectListWechatBindBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public WechatBindEntity selectWechatBindByPrimaryKey(WechatBindKey key) {
        try {
            WechatBindEntity entity = wechatBindDao.selectWechatBindByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatBind(WechatBindEntity entity) {
        try {
            return wechatBindDao.insertWechatBind(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertWechatBindSelective(WechatBindEntity entity) {
        try {
            return wechatBindDao.insertWechatBindSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatBindByPrimaryKey(WechatBindEntity entity) {
        try {
            return wechatBindDao.updateWechatBindByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatBindBySqlWhere(WechatBindEntity entity, WechatBindSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatBindDao.updateWechatBindBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatBindBySqlWhereSelective(WechatBindEntity entity, WechatBindSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatBindDao.updateWechatBindBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateWechatBindByPrimaryKeySelective(WechatBindEntity entity) {
        try {
            return wechatBindDao.updateWechatBindByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatBindByPrimaryKey(WechatBindKey key) {
        try {
            return wechatBindDao.deleteWechatBindByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return wechatBindDao.deleteWechatBindBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getOpenId()!=null && !sqlWhere.getOpenId().equals("")){
                criteria.andOpenIdEqualTo(sqlWhere.getOpenId());
            }
            if(sqlWhere.getClientsxh()!=null && !sqlWhere.getClientsxh().equals("")){
            	criteria.andClientsxhEqualTo(sqlWhere.getClientsxh());
            }
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)wechatBindDao.countWechatBindBySqlWhere(sqlWhere);
    }
    /**
     * 
     * @param openid
     * @param clientsxh
     * @return
     */
    public WechatBindEntity getBindInfo(String openid,String clientsxh){
    	WechatBindEntity entity = null;
    	try {
    		WechatBindKey key = new WechatBindKey();
    		key.setOpenId(openid);
    		key.setClientsxh(clientsxh);
    		entity= wechatBindDao.selectWechatBindByPrimaryKey(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return entity;
    }
    public void setWechatBindDao(IWechatBindDao wechatBindDao) {
        this.wechatBindDao = wechatBindDao;
    }

    public IWechatBindDao getWechatBindDao() {
        return wechatBindDao;
    }
	
	public ExcuteResult updateEmployeeBySqlWhere(XfEmployeeEntity entity) {
        try {
            return wechatBindDao.updateEmployeeBySqlWhere(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
    }
	@Override
	public TbDictdataEntity selectDictdataById(String zhicheng) {
		TbDictdataEntity entity = wechatBindDao.selectDictdataById(zhicheng);
		return entity;
	}
	@Override
	public List<TbDictdataEntity> selectListDictdataBySqlWhere(String dicttype) {
		List<TbDictdataEntity> entitylist = null;
        try {
        	entitylist=wechatBindDao.selectListDictdataBySqlWhere(dicttype);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatBind+"ʧ�ܣ�"+e.getMessage());
        }
		return entitylist;
	}

	//=======================================ɨ��ǩ�����=========================================
	/**
     * ����������ѯһ����¼
     * @return
     */
    public WechatSigntagEntity selectWechatSigntagByPrimaryKey(String openid) {
        try {
        	WechatSigntagEntity entity = wechatBindDao.selectWechatSigntagByPrimaryKey(openid);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }
    /**
	*����ע����Ϣ
	*XF_EMPLOYEE,��Ա��Ϣ��,������Ϣ
	*/
	public ExcuteResult insertWechatSigntag(WechatSigntagEntity entity) {
	    try {
	        return wechatBindDao.insertWechatSigntag(entity);
	    } catch (ExcuteException e) {
	        e.printStackTrace();
	        throw new ExcuteException(FrmGnid.insertXfEmployee+"ʧ�ܣ�"+e.getMessage());
	    }
	}
	/**
	*����ע����Ϣ
	*XF_EMPLOYEE,��Ա��Ϣ��,ɾ��
	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
	* @return
	*/
	public ExcuteResult deleteWechatSigntagByPrimaryKey(String openid) {
	    try {
	        return wechatBindDao.deleteWechatSigntagByPrimaryKey(openid);
	    } catch (ExcuteException e) {
	        e.printStackTrace();
	        throw new ExcuteException(FrmGnid.deleteXfEmployee+"ʧ�ܣ�"+e.getMessage());
	    }
	}
}