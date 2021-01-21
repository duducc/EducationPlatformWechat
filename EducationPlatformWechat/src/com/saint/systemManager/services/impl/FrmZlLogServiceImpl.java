package com.saint.systemManager.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.saint.constant.FrmGnid;
import com.saint.pub.DateManager;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmZlLogEntity;
import com.saint.systemManager.dao.IFrmZlLogDao;
import com.saint.systemManager.services.IFrmZlLogService;
import com.saint.systemManager.sqlWhere.FrmZlLogSqlWhere;
import com.saint.systemManager.sqlWhere.FrmZlLogSqlWhere.Criteria;

public class FrmZlLogServiceImpl implements IFrmZlLogService {
    private IFrmZlLogDao frmZlLogDao;

    public List<FrmZlLogEntity> selectListPageFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
        	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        	 Date date_s = null;
             Date date_e = null;
             
            Criteria criteria=sqlWhere.createCriteria();
           if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){ //管理部门
        	   criteria.andGlbmEqualTo(sqlWhere.getGlbm());
           } 
           if(sqlWhere.getYhdh()!=null && !sqlWhere.getYhdh().equals("")){//用户代号
        	   criteria.andYhdhLike(sqlWhere.getYhdh()+"%");
           }
           if(sqlWhere.getCznr()!=null && !sqlWhere.getCznr().equals("")){//操作内容
        	   criteria.andCznrLike("%"+sqlWhere.getCznr()+"%");
           }
           System.out.println(sqlWhere.getBegindate());
           System.out.println(sqlWhere.getEnddate());
           DateManager dat = new DateManager();
           if((sqlWhere.getBegindate()!=null && !sqlWhere.getBegindate().equals("")) && (sqlWhere.getEnddate()!=null && !sqlWhere.getEnddate().equals(""))){ //时间段
		           try {
						date_s=dateFormat.parse(sqlWhere.getBegindate());
						date_e=dateFormat.parse(DateManager.getDate(sqlWhere.getEnddate(), 3, 1, "S"));
					} catch (ParseException e) {
						date_s=new Date();
	                    date_e=new Date();
					}
		           criteria.andLogtimeBetween(date_s, date_e);
        	   
           }else if(sqlWhere.getEnddate()!=null && !sqlWhere.getEnddate().equals("")){ //结束时间
        	   try {
					date_e=dateFormat.parse(DateManager.getDate(sqlWhere.getEnddate(), 3, 1, "S"));
					
				} catch (ParseException e) {
                   date_e=new Date();
				}
        	   criteria.andLogtimeLessThanOrEqualTo(date_e);
           }else if(sqlWhere.getBegindate()!=null && !sqlWhere.getBegindate().equals("")){ //开始时间
        	   try {
        		   date_s=dateFormat.parse(sqlWhere.getBegindate());
					
				} catch (ParseException e) {
					date_s=new Date();
				}
        	   criteria.andLogtimeGreaterThanOrEqualTo(date_s);
        	   
           }
           
           
        }
        try {
        	sqlWhere.setOrderByClause("iden desc");
            return frmZlLogDao.selectListPageFrmZlLogBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmZlLog+"失败："+e.getMessage());
        }finally{
        	sqlWhere.clear();
        }
    }

    public List<FrmZlLogEntity> selectListFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            如果有日期格式，需要做格式转换
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");短日期
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
            return frmZlLogDao.selectListFrmZlLogBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmZlLog+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListFrmZlLogBySql(String sql) {
        try {
            return frmZlLogDao.selectListFrmZlLogBySql(sql);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmZlLog+"失败："+e.getMessage());
        }
    }

    public FrmZlLogEntity selectFrmZlLogByPrimaryKey(String iden) {
        try {
            return frmZlLogDao.selectFrmZlLogByPrimaryKey(iden);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmZlLog+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertFrmZlLog(FrmZlLogEntity entity) {
        try {
            return frmZlLogDao.insertFrmZlLog(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmZlLog+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertFrmZlLogSelective(FrmZlLogEntity entity) {
        try {
            return frmZlLogDao.insertFrmZlLogSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmZlLog+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateFrmZlLogByPrimaryKey(FrmZlLogEntity entity) {
        try {
            return frmZlLogDao.updateFrmZlLogByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmZlLog+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateFrmZlLogBySqlWhere(FrmZlLogEntity entity, FrmZlLogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmZlLogDao.updateFrmZlLogBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmZlLog+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateFrmZlLogBySqlWhereSelective(FrmZlLogEntity entity, FrmZlLogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmZlLogDao.updateFrmZlLogBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmZlLog+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateFrmZlLogByPrimaryKeySelective(FrmZlLogEntity entity) {
        try {
            return frmZlLogDao.updateFrmZlLogByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmZlLog+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteFrmZlLogByPrimaryKey(String iden) {
        try {
            return frmZlLogDao.deleteFrmZlLogByPrimaryKey(iden);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmZlLog+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmZlLogDao.deleteFrmZlLogBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmZlLog+"失败："+e.getMessage());
        }
    }

    public int countFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)frmZlLogDao.countFrmZlLogBySqlWhere(sqlWhere);
    }
    public void saveFrmZlLog(HttpServletRequest request, String cznr,String loginfo)throws ExcuteException {
			HttpSession session=request.getSession();
						FrmZlLogEntity log=new FrmZlLogEntity();
						log.setLogmess(loginfo);
						log.setIp(Tools.getIp(request));
						log.setCznr(cznr);
						log.setLogtime(DateManager.getDate());
						insertFrmZlLog(log);
	}
    public void setFrmZlLogDao(IFrmZlLogDao frmZlLogDao) {
        this.frmZlLogDao = frmZlLogDao;
    }

    public IFrmZlLogDao getFrmZlLogDao() {
        return frmZlLogDao;
    }
}