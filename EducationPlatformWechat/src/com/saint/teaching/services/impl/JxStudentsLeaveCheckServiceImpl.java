package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import com.saint.teaching.dao.IJxStudentsLeaveCheckDao;
import com.saint.teaching.services.IJxStudentsLeaveCheckService;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDENTS_LEAVE_CHECK
*表说明请假审批
  */
public class JxStudentsLeaveCheckServiceImpl implements IJxStudentsLeaveCheckService {
    private IJxStudentsLeaveCheckDao jxStudentsLeaveCheckDao;

    /**
    *方法注释信息
    *分页查询表JX_STUDENTS_LEAVE_CHECK
    *表说明请假审批
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsLeaveCheckEntity> selectListPageJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
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
            List<JxStudentsLeaveCheckEntity> entitylist=jxStudentsLeaveCheckDao.selectListPageJxStudentsLeaveCheckBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDENTS_LEAVE_CHECK
     * 表说明请假审批
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsLeaveCheckEntity> selectListJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
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
            List<JxStudentsLeaveCheckEntity> entitylist=jxStudentsLeaveCheckDao.selectListJxStudentsLeaveCheckBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsLeaveCheckBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsLeaveCheckDao.selectListJxStudentsLeaveCheckBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsLeaveCheckEntity selectJxStudentsLeaveCheckByPrimaryKey(String xh) {
        try {
            JxStudentsLeaveCheckEntity entity = jxStudentsLeaveCheckDao.selectJxStudentsLeaveCheckByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,插入信息
      */
    public ExcuteResult insertJxStudentsLeaveCheck(JxStudentsLeaveCheckEntity entity) {
        try {
            return jxStudentsLeaveCheckDao.insertJxStudentsLeaveCheck(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsLeaveCheckSelective(JxStudentsLeaveCheckEntity entity) {
        try {
            return jxStudentsLeaveCheckDao.insertJxStudentsLeaveCheckSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,修改
      */
    public ExcuteResult updateJxStudentsLeaveCheckByPrimaryKey(JxStudentsLeaveCheckEntity entity) {
        try {
            return jxStudentsLeaveCheckDao.updateJxStudentsLeaveCheckByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckEntity entity, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsLeaveCheckDao.updateJxStudentsLeaveCheckBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,修改
      */
    public ExcuteResult updateJxStudentsLeaveCheckBySqlWhereSelective(JxStudentsLeaveCheckEntity entity, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsLeaveCheckDao.updateJxStudentsLeaveCheckBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,修改
      */
    public ExcuteResult updateJxStudentsLeaveCheckByPrimaryKeySelective(JxStudentsLeaveCheckEntity entity) {
        try {
            return jxStudentsLeaveCheckDao.updateJxStudentsLeaveCheckByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveCheckByPrimaryKey(String xh) {
        try {
            return jxStudentsLeaveCheckDao.deleteJxStudentsLeaveCheckByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsLeaveCheckDao.deleteJxStudentsLeaveCheckBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsLeaveCheck+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_LEAVE_CHECK,请假审批表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudentsLeaveCheckDao.countJxStudentsLeaveCheckBySqlWhere(sqlWhere);
    }

    public void setJxStudentsLeaveCheckDao(IJxStudentsLeaveCheckDao jxStudentsLeaveCheckDao) {
        this.jxStudentsLeaveCheckDao = jxStudentsLeaveCheckDao;
    }

    public IJxStudentsLeaveCheckDao getJxStudentsLeaveCheckDao() {
        return jxStudentsLeaveCheckDao;
    }
}