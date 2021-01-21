package com.saint.systemManager.services.impl;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmZlExlogEntity;
import com.saint.systemManager.dao.IFrmZlExlogDao;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmZlExlogSqlWhere;
import com.saint.systemManager.sqlWhere.FrmZlExlogSqlWhere.Criteria;

public class FrmZlExlogServiceImpl implements IFrmZlExlogService {
    private IFrmZlExlogDao frmZlExlogDao;

    public List<FrmZlExlogEntity> selectListPageFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");������
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
            return frmZlExlogDao.selectListPageFrmZlExlogBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<FrmZlExlogEntity> selectListFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");������
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
            return frmZlExlogDao.selectListFrmZlExlogBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListFrmZlExlogBySql(String sql) {
        try {
            return frmZlExlogDao.selectListFrmZlExlogBySql(sql);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public FrmZlExlogEntity selectFrmZlExlogByPrimaryKey(String iden) {
        try {
            return frmZlExlogDao.selectFrmZlExlogByPrimaryKey(iden);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertFrmZlExlog(FrmZlExlogEntity entity) {
        try {
            return frmZlExlogDao.insertFrmZlExlog(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertFrmZlExlogSelective(FrmZlExlogEntity entity) {
        try {
            return frmZlExlogDao.insertFrmZlExlogSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateFrmZlExlogByPrimaryKey(FrmZlExlogEntity entity) {
        try {
            return frmZlExlogDao.updateFrmZlExlogByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateFrmZlExlogBySqlWhere(FrmZlExlogEntity entity, FrmZlExlogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmZlExlogDao.updateFrmZlExlogBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateFrmZlExlogBySqlWhereSelective(FrmZlExlogEntity entity, FrmZlExlogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmZlExlogDao.updateFrmZlExlogBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateFrmZlExlogByPrimaryKeySelective(FrmZlExlogEntity entity) {
        try {
            return frmZlExlogDao.updateFrmZlExlogByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteFrmZlExlogByPrimaryKey(String iden) {
        try {
            return frmZlExlogDao.deleteFrmZlExlogByPrimaryKey(iden);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmZlExlogDao.deleteFrmZlExlogBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmZlExlog+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)frmZlExlogDao.countFrmZlExlogBySqlWhere(sqlWhere);
    }
    public void saveFrmZlExlog(HttpServletRequest request,String cznr,String loginfo) {
		try {
			HttpSession session=request.getSession();
				FrmZlExlogEntity record = new FrmZlExlogEntity();//�����쳣��־����
				record.setLogmess( loginfo);
				record.setIp(Tools.getIp(request));
				record.setCznr( cznr);
				insertFrmZlExlog(record);
		} catch (ExcuteException e) {
			e.printStackTrace();
			//throw new ExcuteException("�����쳣��־��Ϣʧ�ܣ�"+e.getMessage());
		}
	}
    public void setFrmZlExlogDao(IFrmZlExlogDao frmZlExlogDao) {
        this.frmZlExlogDao = frmZlExlogDao;
    }

    public IFrmZlExlogDao getFrmZlExlogDao() {
        return frmZlExlogDao;
    }
}