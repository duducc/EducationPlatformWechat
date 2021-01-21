package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import com.saint.teaching.dao.IJxStudentsLeaveDao;
import com.saint.teaching.services.IJxStudentsLeaveService;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDENTS_LEAVE
*表说明学生请假
  */
public class JxStudentsLeaveServiceImpl implements IJxStudentsLeaveService {
    private IJxStudentsLeaveDao jxStudentsLeaveDao;
    public int selectXhJxStudentLeaveBySql() {
	    return (Integer)jxStudentsLeaveDao.selectXhJxStudentLeaveBySql();
	}
    /**
    *方法注释信息
    *分页查询表JX_STUDENTS_LEAVE
    *表说明学生请假
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsLeaveEntity> selectListPageJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            /*if(sqlWhere.getLeavedatestart()!=null && !sqlWhere.getLeavedatestart().equals("")){
                criteria.andLeavedatestartLike("%"+sqlWhere.getLeavedatestart()+"%");
            }*/
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
            List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveDao.selectListPageJxStudentsLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDENTS_LEAVE
     * 表说明学生请假
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
                criteria.andStateEqualTo(sqlWhere.getState());
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
            List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveDao.selectListJxStudentsLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"失败："+e.getMessage());
        }
    }
    @Override
	public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveBySqlWhereforDate(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            /*if(sqlWhere.getLeavedatestart()!=null && !sqlWhere.getLeavedatestart().equals("")){
            	criteria.andLeavedatestartLessThan("%"+sqlWhere.getLeavedatestart()+"%");
            }*/
        }
        try {
            List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveDao.selectListJxStudentsLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"失败："+e.getMessage());
        }
    }
    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsLeaveBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsLeaveDao.selectListJxStudentsLeaveBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsLeaveEntity selectJxStudentsLeaveByPrimaryKey(String xh) {
        try {
            JxStudentsLeaveEntity entity = jxStudentsLeaveDao.selectJxStudentsLeaveByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,插入信息
      */
    public ExcuteResult insertJxStudentsLeave(JxStudentsLeaveEntity entity) {
        try {
            return jxStudentsLeaveDao.insertJxStudentsLeave(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsLeaveSelective(JxStudentsLeaveEntity entity) {
        try {
            return jxStudentsLeaveDao.insertJxStudentsLeaveSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentsLeaveByPrimaryKey(JxStudentsLeaveEntity entity) {
        try {
            return jxStudentsLeaveDao.updateJxStudentsLeaveByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsLeaveBySqlWhere(JxStudentsLeaveEntity entity, JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsLeaveDao.updateJxStudentsLeaveBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentsLeaveBySqlWhereSelective(JxStudentsLeaveEntity entity, JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsLeaveDao.updateJxStudentsLeaveBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentsLeaveByPrimaryKeySelective(JxStudentsLeaveEntity entity) {
        try {
            return jxStudentsLeaveDao.updateJxStudentsLeaveByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveByPrimaryKey(String xh) {
        try {
            return jxStudentsLeaveDao.deleteJxStudentsLeaveByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsLeaveDao.deleteJxStudentsLeaveBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsLeave+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_LEAVE,学生请假表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudentsLeaveDao.countJxStudentsLeaveBySqlWhere(sqlWhere);
    }
    /**
     * 根据学生编号查询请假的学生
     */
	@Override
	public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveByStuid(JxStudentsLeaveSqlWhere sqlWhere, List<String> list) {
		  if(sqlWhere !=null){
	            Criteria criteria=sqlWhere.createCriteria();
	            if(sqlWhere.getState() != null && !sqlWhere.getState().equals("")){
	            	criteria.andStateEqualTo(sqlWhere.getState());
	            }
	            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//短日期
	            if(sqlWhere.getLeavedatestart()!=null && !sqlWhere.getLeavedatestart().equals("") && sqlWhere.getLeavedateend() != null && !sqlWhere.getLeavedateend().equals("")){
	            	Date start = null;
	            	Date end = null;
	            	 try {
	            		 start = dateFormat.parse(sqlWhere.getLeavedatestart());
	            		 end = dateFormat.parse(sqlWhere.getLeavedateend());
	                 } catch (ParseException e) {
	                	 start=new Date();
	                	 end=new Date();
	                 }
	                criteria.andLeavedateendBetween(start, end);
	            }
	            if(list!=null&&list.size()>0){
	            	criteria.andStuidIn(list);
	            } 
	        }
		  try {
	           List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveDao.selectListJxStudentsLeaveBySqlWhere(sqlWhere);
	            sqlWhere.clear();
	            return entitylist;
	        } catch (ExcuteException e) {
	            e.printStackTrace();
	            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"失败："+e.getMessage());
	        }
	}
	/**
     * 根据学生编号查询集合
     */
	@Override
	public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveByStuid(String xh) {
		try {
			 List<JxStudentsLeaveEntity> entity = jxStudentsLeaveDao.selectListJxStudentsLeaveByStuid(xh);
	         return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsLeave+"失败："+e.getMessage());
        }
	}
    public void setJxStudentsLeaveDao(IJxStudentsLeaveDao jxStudentsLeaveDao) {
        this.jxStudentsLeaveDao = jxStudentsLeaveDao;
    }

    public IJxStudentsLeaveDao getJxStudentsLeaveDao() {
        return jxStudentsLeaveDao;
    }
}