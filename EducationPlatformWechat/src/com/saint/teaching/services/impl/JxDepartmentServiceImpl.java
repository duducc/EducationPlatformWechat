package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxDepartmentEntity;
import com.saint.teaching.dao.IJxDepartmentDao;
import com.saint.teaching.services.IJxDepartmentService;
import com.saint.teaching.sqlWhere.JxDepartmentSqlWhere;
import com.saint.teaching.sqlWhere.JxDepartmentSqlWhere.Criteria;

/**
*类注释信息
*表名JX_DEPARTMENT
*表说明教学部门
  */
public class JxDepartmentServiceImpl implements IJxDepartmentService {
    private IJxDepartmentDao jxDepartmentDao;

    /**
    *方法注释信息
    *分页查询表JX_DEPARTMENT
    *表说明教学部门
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxDepartmentEntity> selectListPageJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
            }
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
            List<JxDepartmentEntity> entitylist=jxDepartmentDao.selectListPageJxDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_DEPARTMENT
     * 表说明教学部门
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxDepartmentEntity> selectListJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
            }
            if(sqlWhere.getDepid()!=null && !sqlWhere.getDepid().equals("")){
                criteria.andDepidEqualTo(sqlWhere.getDepid());
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
            List<JxDepartmentEntity> entitylist=jxDepartmentDao.selectListJxDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxDepartmentBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxDepartmentDao.selectListJxDepartmentBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxDepartmentEntity selectJxDepartmentByPrimaryKey(String xh) {
        try {
            JxDepartmentEntity entity = jxDepartmentDao.selectJxDepartmentByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,插入信息
      */
    public ExcuteResult insertJxDepartment(JxDepartmentEntity entity) {
        try {
            return jxDepartmentDao.insertJxDepartment(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxDepartmentSelective(JxDepartmentEntity entity) {
        try {
            return jxDepartmentDao.insertJxDepartmentSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_DEPARTMENT,教学部门表,修改
      */
    public ExcuteResult updateJxDepartmentByPrimaryKey(JxDepartmentEntity entity) {
        try {
            return jxDepartmentDao.updateJxDepartmentByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxDepartmentBySqlWhere(JxDepartmentEntity entity, JxDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxDepartmentDao.updateJxDepartmentBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_DEPARTMENT,教学部门表,修改
      */
    public ExcuteResult updateJxDepartmentBySqlWhereSelective(JxDepartmentEntity entity, JxDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxDepartmentDao.updateJxDepartmentBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_DEPARTMENT,教学部门表,修改
      */
    public ExcuteResult updateJxDepartmentByPrimaryKeySelective(JxDepartmentEntity entity) {
        try {
            return jxDepartmentDao.updateJxDepartmentByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxDepartmentByPrimaryKey(String xh) {
        try {
            return jxDepartmentDao.deleteJxDepartmentByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_DEPARTMENT,教学部门表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxDepartmentDao.deleteJxDepartmentBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_DEPARTMENT,教学部门表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxDepartmentDao.countJxDepartmentBySqlWhere(sqlWhere);
    }

    public void setJxDepartmentDao(IJxDepartmentDao jxDepartmentDao) {
        this.jxDepartmentDao = jxDepartmentDao;
    }

    public IJxDepartmentDao getJxDepartmentDao() {
        return jxDepartmentDao;
    }
}