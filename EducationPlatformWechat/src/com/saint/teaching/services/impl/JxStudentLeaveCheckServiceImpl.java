package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentLeaveCheckEntity;
import com.saint.teaching.dao.IJxStudentLeaveCheckDao;
import com.saint.teaching.services.IJxStudentLeaveCheckService;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDENT_LEAVE_CHECK
*表说明学生请假审核
  */
public class JxStudentLeaveCheckServiceImpl implements IJxStudentLeaveCheckService {
    private IJxStudentLeaveCheckDao jxStudentLeaveCheckDao;

    /**
    *方法注释信息
    *分页查询表JX_STUDENT_LEAVE_CHECK
    *表说明学生请假审核
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudentLeaveCheckEntity> selectListPageJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
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
            List<JxStudentLeaveCheckEntity> entitylist=jxStudentLeaveCheckDao.selectListPageJxStudentLeaveCheckBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDENT_LEAVE_CHECK
     * 表说明学生请假审核
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentLeaveCheckEntity> selectListJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStulevid()!=null && !sqlWhere.getStulevid().equals("")){
                criteria.andStulevidEqualTo(sqlWhere.getStulevid());
            }
            if(sqlWhere.getCheckorder()!=null && !sqlWhere.getCheckorder().equals("")){
                criteria.andCheckorderEqualTo(sqlWhere.getCheckorder());
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
            List<JxStudentLeaveCheckEntity> entitylist=jxStudentLeaveCheckDao.selectListJxStudentLeaveCheckBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentLeaveCheckBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentLeaveCheckDao.selectListJxStudentLeaveCheckBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentLeaveCheckEntity selectJxStudentLeaveCheckByPrimaryKey(String xh) {
        try {
            JxStudentLeaveCheckEntity entity = jxStudentLeaveCheckDao.selectJxStudentLeaveCheckByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,插入信息
      */
    public ExcuteResult insertJxStudentLeaveCheck(JxStudentLeaveCheckEntity entity) {
        try {
            return jxStudentLeaveCheckDao.insertJxStudentLeaveCheck(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentLeaveCheckSelective(JxStudentLeaveCheckEntity entity) {
        try {
            return jxStudentLeaveCheckDao.insertJxStudentLeaveCheckSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
      */
    public ExcuteResult updateJxStudentLeaveCheckByPrimaryKey(JxStudentLeaveCheckEntity entity) {
        try {
            return jxStudentLeaveCheckDao.updateJxStudentLeaveCheckByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckEntity entity, JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentLeaveCheckDao.updateJxStudentLeaveCheckBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
      */
    public ExcuteResult updateJxStudentLeaveCheckBySqlWhereSelective(JxStudentLeaveCheckEntity entity, JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentLeaveCheckDao.updateJxStudentLeaveCheckBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,修改
      */
    public ExcuteResult updateJxStudentLeaveCheckByPrimaryKeySelective(JxStudentLeaveCheckEntity entity) {
        try {
            return jxStudentLeaveCheckDao.updateJxStudentLeaveCheckByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveCheckByPrimaryKey(String xh) {
        try {
            return jxStudentLeaveCheckDao.deleteJxStudentLeaveCheckByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentLeaveCheckDao.deleteJxStudentLeaveCheckBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENT_LEAVE_CHECK,学生请假审核表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudentLeaveCheckDao.countJxStudentLeaveCheckBySqlWhere(sqlWhere);
    }

    public void setJxStudentLeaveCheckDao(IJxStudentLeaveCheckDao jxStudentLeaveCheckDao) {
        this.jxStudentLeaveCheckDao = jxStudentLeaveCheckDao;
    }

    public IJxStudentLeaveCheckDao getJxStudentLeaveCheckDao() {
        return jxStudentLeaveCheckDao;
    }
}