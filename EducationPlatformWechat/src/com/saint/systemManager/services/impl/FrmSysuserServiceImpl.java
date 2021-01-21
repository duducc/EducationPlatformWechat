package com.saint.systemManager.services.impl;

import java.util.HashMap;
import java.util.List;

import bsh.StringUtil;

import com.saint.constant.FrmGnid;
import com.saint.pub.DateManager;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmProgramQxgroupEntity;
import com.saint.systemManager.bean.FrmSysuserEntity;
import com.saint.systemManager.dao.IFrmSysuserDao;
import com.saint.systemManager.services.IFrmSysuserService;
import com.saint.systemManager.sqlWhere.FrmSysuserSqlWhere;
import com.saint.systemManager.sqlWhere.FrmSysuserSqlWhere.Criteria;

public class FrmSysuserServiceImpl implements IFrmSysuserService {
    private IFrmSysuserDao frmSysuserDao;

    public List<FrmSysuserEntity> selectListPageFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getXm()!=null && !sqlWhere.getXm().equals("")){
                criteria.andXmLike("%"+sqlWhere.getXm()+"%");
            }
            if(sqlWhere.getYhdh()!=null && !sqlWhere.getYhdh().equals("")){
                criteria.andYhdhEqualTo(sqlWhere.getYhdh());
            }
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                criteria.andGlbmEqualTo(sqlWhere.getGlbm());
            }
            if(sqlWhere.getYhdh()!=null && !sqlWhere.getYhdh().equals("")){ 	//用户代号
            	criteria.andYhdhLike(sqlWhere.getYhdh()+"%");
            }
            if(sqlWhere.getXm()!=null && !sqlWhere.getXm().equals("")){			//姓名
            	criteria.andXmLike("%"+sqlWhere.getXm()+"%");
            }
        	if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){     //管理部门
        		criteria.andGlbmLike(sqlWhere.getGlbm()+"%");
            }
        	
            if(sqlWhere.getSfgly()!=null && !sqlWhere.getSfgly().equals("")){   //是否管理员
            	criteria.andSfglyEqualTo(sqlWhere.getSfgly());
            }
        }
        try {
        	sqlWhere.setOrderByClause("YHDH");
            return frmSysuserDao.selectListPageFrmSysuserBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmSysuser+"失败："+e.getMessage());
        }finally{
        	sqlWhere.clear();
        }
    }

    public List<FrmSysuserEntity> selectListFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            
            if(sqlWhere.getQxms()!=null && !sqlWhere.getQxms().equals("")){
                criteria.andQxmsEqualTo(sqlWhere.getQxms());
            }
            /**
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
            return frmSysuserDao.selectListFrmSysuserBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmSysuser+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListFrmSysuserBySql(String sql) {
        try {
            return frmSysuserDao.selectListFrmSysuserBySql(sql);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmSysuser+"失败："+e.getMessage());
        }
    }

    public FrmSysuserEntity selectFrmSysuserByPrimaryKey(String yhdh) {
        try {
            return frmSysuserDao.selectFrmSysuserByPrimaryKey(yhdh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmSysuser+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertFrmSysuser(FrmSysuserEntity entity) {
    	try {
			//if("@".equals(entity.getQxms())){
				frmSysuserDao.deleteUserMenu(entity);
				frmSysuserDao.saveUserMenu(entity);
			//}
			entity.setGxsj(DateManager.getNowDate());
			return frmSysuserDao.insertFrmSysuser(entity);
		} catch (ExcuteException e) {
			e.printStackTrace();
			return e.getExcuteResult();
		}
    }

    public ExcuteResult insertFrmSysuserSelective(FrmSysuserEntity entity) {
        try {
        	entity.setGxsj(DateManager.getNowDate());
            return frmSysuserDao.insertFrmSysuserSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmSysuser+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateFrmSysuserByPrimaryKey(FrmSysuserEntity entity) {
        try {
        	entity.setGxsj(DateManager.getNowDate());
            return frmSysuserDao.updateFrmSysuserByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmSysuser+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateFrmSysuserBySqlWhere(FrmSysuserEntity entity, FrmSysuserSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
        	entity.setGxsj(DateManager.getNowDate());
            return frmSysuserDao.updateFrmSysuserBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmSysuser+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateFrmSysuserBySqlWhereSelective(FrmSysuserEntity entity, FrmSysuserSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
        	entity.setGxsj(DateManager.getNowDate());
            return frmSysuserDao.updateFrmSysuserBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmSysuser+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateFrmSysuserByPrimaryKeySelective(FrmSysuserEntity entity) {
    	try {
    		entity.setGxsj(DateManager.getNowDate());
			if("@".equals(entity.getQxms())){
				frmSysuserDao.deleteUserMenu(entity);
				frmSysuserDao.saveUserMenu(entity);
			}
			return frmSysuserDao.updateFrmSysuserByPrimaryKeySelective(entity);
		} catch (ExcuteException e) {
			e.printStackTrace();
			return e.getExcuteResult();
		}
    }

    public ExcuteResult deleteFrmSysuserByPrimaryKey(String yhdh) {
    	try {
    		frmSysuserDao.deleteUserMenu(frmSysuserDao.selectFrmSysuserByPrimaryKey(yhdh));
			return frmSysuserDao.deleteFrmSysuserByPrimaryKey(yhdh);
		} catch (ExcuteException e) {
			e.printStackTrace();
			return e.getExcuteResult();
		}
    }

    public ExcuteResult deleteFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmSysuserDao.deleteFrmSysuserBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmSysuser+"失败："+e.getMessage());
        }
    }

    public int countFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)frmSysuserDao.countFrmSysuserBySqlWhere(sqlWhere);
    }

    public void setFrmSysuserDao(IFrmSysuserDao frmSysuserDao) {
        this.frmSysuserDao = frmSysuserDao;
    }

    public IFrmSysuserDao getFrmSysuserDao() {
        return frmSysuserDao;
    }
    
 //******************************************手动添加方法*********************************
    public List<FrmSysuserEntity> selectListFrmSysuserBySqlWhereYhjb(FrmSysuserSqlWhere sqlWhere) {
    	
        if(sqlWhere !=null){
        	if(sqlWhere.getYhjb().equals("2")){			//总队
    			sqlWhere.setGlbm(sqlWhere.getGlbm().substring(0,2));
    		}
    		if(sqlWhere.getYhjb().equals("3")){			//支队
    			sqlWhere.setGlbm(sqlWhere.getGlbm().substring(0,4));
    		}
    		if(sqlWhere.getYhjb().equals("4")){			//大队
    			sqlWhere.setGlbm(sqlWhere.getGlbm().substring(0,8));
    		}
    		if(sqlWhere.getYhjb().equals("5")){			//中队
    			sqlWhere.setGlbm(sqlWhere.getGlbm().substring(0,10));
    		}
    		
            Criteria criteria=sqlWhere.createCriteria();
            
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                criteria.andGlbmLike(sqlWhere.getGlbm()+"%");
            }
            if(sqlWhere.getYhjb()!=null && !sqlWhere.getYhjb().equals("")){
            	criteria.andYhjbGreaterThanOrEqualTo(sqlWhere.getYhjb());
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
        }
        try {
            return frmSysuserDao.selectListFrmSysuserBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmSysuser+"失败："+e.getMessage());
        }
    }

	public ExcuteResult resetUserMM(FrmSysuserEntity user) {
		try {
			return frmSysuserDao.resetUserMm(user);
		} catch (ExcuteException e) {
			e.printStackTrace();
			return e.getExcuteResult();
		}
	}

	public ExcuteResult updateUserMM(FrmSysuserEntity user) {
		try {
			return frmSysuserDao.updateUserMm(user);
		} catch (ExcuteException e) {
			e.printStackTrace();
			return e.getExcuteResult();
		}
	}
	
	public FrmProgramQxgroupEntity selectFrmProgramQxgroupByPrimaryKey(String qxgroup) {
        try {
            return frmSysuserDao.selectFrmProgramQxgroupByPrimaryKey(qxgroup);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmProgramQxgroup+"失败："+e.getMessage());
        }
    }
}