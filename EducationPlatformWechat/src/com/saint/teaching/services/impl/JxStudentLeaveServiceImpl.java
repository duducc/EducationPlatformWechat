package com.saint.teaching.services.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.dao.IJxStudentLeaveDao;
import com.saint.teaching.services.IJxStudentLeaveService;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDENTS_LEAVE
*表说明学生请假
  */
public class JxStudentLeaveServiceImpl implements IJxStudentLeaveService {
    private IJxStudentLeaveDao jxStudentLeaveDao;
    
    public int selectXhJxStudentLeaveBySql() {
	    return (Integer)jxStudentLeaveDao.selectXhJxStudentLeaveBySql();
	}

    /**
    *方法注释信息
    *分页查询表JX_STUDENTS_LEAVE
    *表说明学生请假
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudentLeaveEntity> selectListPageJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
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
            List<JxStudentLeaveEntity> entitylist=jxStudentLeaveDao.selectListPageJxStudentLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDENTS_LEAVE
     * 表说明学生请假
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentLeaveEntity> selectListJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            if(sqlWhere.getRemark1()!=null && !sqlWhere.getRemark1().equals("")){
                criteria.andRemark1EqualTo(sqlWhere.getRemark1());
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
            	String states = sqlWhere.getState();
            	String[] statess = states.split(",");
            	if(statess.length>1){
            		List<String> list =  Arrays.asList(statess);
            		criteria.andStateIn(list);
            	}else{
            		criteria.andStateEqualTo(sqlWhere.getState());
            	}
            }
            if(sqlWhere.getStuname()!=null && !sqlWhere.getStuname().equals("")){
                criteria.andStunameLike("%"+sqlWhere.getStuname()+"%");
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
            List<JxStudentLeaveEntity> entitylist=jxStudentLeaveDao.selectListJxStudentLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentLeaveBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentLeaveDao.selectListJxStudentLeaveBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeave+"失败："+e.getMessage());
        }
    }
    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentLeaveEntity selectJxStudentLeaveByPrimaryKey(String xh) {
        try {
            JxStudentLeaveEntity entity = jxStudentLeaveDao.selectJxStudentLeaveByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,插入信息
      */
    public ExcuteResult insertJxStudentLeave(JxStudentLeaveEntity entity) {
        try {
            return jxStudentLeaveDao.insertJxStudentLeave(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentLeaveSelective(JxStudentLeaveEntity entity) {
        try {
            return jxStudentLeaveDao.insertJxStudentLeaveSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentLeaveByPrimaryKey(JxStudentLeaveEntity entity) {
        try {
            return jxStudentLeaveDao.updateJxStudentLeaveByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentLeaveBySqlWhere(JxStudentLeaveEntity entity, JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentLeaveDao.updateJxStudentLeaveBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentLeaveBySqlWhereSelective(JxStudentLeaveEntity entity, JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentLeaveDao.updateJxStudentLeaveBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public ExcuteResult updateJxStudentLeaveByPrimaryKeySelective(JxStudentLeaveEntity entity) {
        try {
            return jxStudentLeaveDao.updateJxStudentLeaveByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveByPrimaryKey(String xh) {
        try {
            return jxStudentLeaveDao.deleteJxStudentLeaveByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE,学生请假表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentLeaveDao.deleteJxStudentLeaveBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentLeave+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_LEAVE,学生请假表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudentLeaveDao.countJxStudentLeaveBySqlWhere(sqlWhere);
    }

    public void setJxStudentLeaveDao(IJxStudentLeaveDao jxStudentLeaveDao) {
        this.jxStudentLeaveDao = jxStudentLeaveDao;
    }

    public IJxStudentLeaveDao getJxStudentLeaveDao() {
        return jxStudentLeaveDao;
    }
}