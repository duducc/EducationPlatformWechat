package com.saint.wechat.manager.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.CourseOrProjectEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfProjectEntity;
import com.saint.wechat.manager.bean.XfTaskSignupEntity;
import com.saint.wechat.manager.dao.IXfProjectDao;
import com.saint.wechat.manager.services.IXfProjectService;
import com.saint.wechat.manager.sqlWhere.XfProjectSqlWhere.*;
import com.saint.wechat.manager.sqlWhere.XfProjectSqlWhere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class XfProjectServiceImpl implements IXfProjectService {
    private IXfProjectDao xfProjectDao;

    public List<XfProjectEntity> selectListPageXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere) {
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
            List<XfProjectEntity> entitylist=xfProjectDao.selectListPageXfProjectBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfProject+"失败："+e.getMessage());
        }
    }

    public List<XfProjectEntity> selectListXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProName()!=null && !sqlWhere.getProName().equals("")){
                criteria.andProNameLike("%"+sqlWhere.getProName()+"%");
            }
            if(sqlWhere.getHoldUnit()!=null && !sqlWhere.getHoldUnit().equals("")){
                criteria.andHoldUnitLike("%"+sqlWhere.getHoldUnit()+"%");
            }
            if(sqlWhere.getAddYear()!=null && !sqlWhere.getAddYear().equals("")){
                criteria.andAddYearEqualTo(sqlWhere.getAddYear());
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
            List<XfProjectEntity> entitylist=xfProjectDao.selectListXfProjectBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfProject+"失败："+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListXfProjectBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfProjectDao.selectListXfProjectBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfProject+"失败："+e.getMessage());
        }
    }

    public XfProjectEntity selectXfProjectByPrimaryKey(String proId) {
        try {
            XfProjectEntity entity = xfProjectDao.selectXfProjectByPrimaryKey(proId);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfProject+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertXfProject(XfProjectEntity entity) {
        try {
            return xfProjectDao.insertXfProject(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfProject+"失败："+e.getMessage());
        }
    }

    public ExcuteResult insertXfProjectSelective(XfProjectEntity entity) {
        try {
            return xfProjectDao.insertXfProjectSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfProject+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfProjectByPrimaryKey(XfProjectEntity entity) {
        try {
            return xfProjectDao.updateXfProjectByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfProject+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfProjectBySqlWhere(XfProjectEntity entity, XfProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfProjectDao.updateXfProjectBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfProject+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfProjectBySqlWhereSelective(XfProjectEntity entity, XfProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfProjectDao.updateXfProjectBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfProject+"失败："+e.getMessage());
        }
    }

    public ExcuteResult updateXfProjectByPrimaryKeySelective(XfProjectEntity entity) {
        try {
            return xfProjectDao.updateXfProjectByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfProject+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteTaskSignupInfoByPrimaryKey(String Id) {
        try {
            return xfProjectDao.deleteTaskSignupInfoByPrimaryKey(Id);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfProject+"失败："+e.getMessage());
        }
    }

    public ExcuteResult deleteXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfProjectDao.deleteXfProjectBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfProject+"失败："+e.getMessage());
        }
    }

    public int countXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)xfProjectDao.countXfProjectBySqlWhere(sqlWhere);
    }
    
    public List<XfProjectEntity> selectListXfProjectByAddtime(String addTime) {
        try {
            List<XfProjectEntity> entitylist=xfProjectDao.selectListXfProjectByAddtime(addTime);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfProject+"失败："+e.getMessage());
        }
    }
    public List<XfProjectEntity> findListXfProject(String proName,String nowTime) {
		List<XfProjectEntity> entitylist = null;
        try {
        	entitylist=xfProjectDao.findListXfProject(proName,nowTime);;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatBind+"失败："+e.getMessage());
        }
		return entitylist;
    }
    @Override
	public List<CourseOrProjectEntity> selectXfCourseorProjectlist(String nowTime) {
		List<CourseOrProjectEntity> list = null;
		try {
			list = xfProjectDao.selectXfCourseorProjectlist(nowTime);
		} catch (Exception e) {
			e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageWechatBind+"失败："+e.getMessage());
		}
		return list;
	}
    public ExcuteResult insertXfTaskSignupInfo(XfTaskSignupEntity entity) {
        try {
            return xfProjectDao.insertXfTaskSignupInfo(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfProject+"失败："+e.getMessage());
        }
    }
    @Override
   	public List<XfTaskSignupEntity> findListTaskSignupInfo(String yitongcard,String courseId) {
   		List<XfTaskSignupEntity> list = null;
   		try {
   			list = xfProjectDao.findListTaskSignupInfo(yitongcard, courseId);
   		} catch (Exception e) {
   			e.printStackTrace();
               throw new ExcuteException(FrmGnid.selectListPageWechatBind+"失败："+e.getMessage());
   		}
   		return list;
   	}
    public void setXfProjectDao(IXfProjectDao xfProjectDao) {
        this.xfProjectDao = xfProjectDao;
    }

    public IXfProjectDao getXfProjectDao() {
        return xfProjectDao;
    }

	@Override
	public List<XfTaskSignupEntity> selectListTaskSignupByCourseId(
			String courseId) {
		List<XfTaskSignupEntity> list = null;
   		try {
   			list = xfProjectDao.selectListTaskSignupByCourseId(courseId);
   		} catch (Exception e) {
   			e.printStackTrace();
               throw new ExcuteException(FrmGnid.selectListPageWechatBind+"失败："+e.getMessage());
   		}
   		return list;
	}

	@Override
	public List<XfTaskSignupEntity> selectListTaskSignupByYiTongCard(
			String yitongcard) {
		List<XfTaskSignupEntity> list = null;
   		try {
   			list = xfProjectDao.selectListTaskSignupByYiTongCard(yitongcard);
   		} catch (Exception e) {
   			e.printStackTrace();
               throw new ExcuteException(FrmGnid.selectListPageWechatBind+"失败："+e.getMessage());
   		}
   		return list;
	}
	 public XfTaskSignupEntity selectTaskSignupById(String Id) {
	        try {
	        	XfTaskSignupEntity entity = xfProjectDao.selectTaskSignupById(Id);
	            return entity;
	        } catch (ExcuteException e) {
	            e.printStackTrace();
	            throw new ExcuteException(FrmGnid.selectObjectXfProject+"失败："+e.getMessage());
	        }
	    }
}