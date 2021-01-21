package com.saint.systemManager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.dao.IFrmDepartmentDao;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere.Criteria;

/**
*类注释信息
*表名FRM_DEPARTMENT
*表说明部门信息
  */
public class FrmDepartmentServiceImpl implements IFrmDepartmentService {
    private IFrmDepartmentDao frmDepartmentDao;

    /**
    *方法注释信息
    *分页查询表FRM_DEPARTMENT
    *表说明部门信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<FrmDepartmentEntity> selectListPageFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
        }
        try {
            List<FrmDepartmentEntity> entitylist=frmDepartmentDao.selectListPageFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表FRM_DEPARTMENT
     * 表说明部门信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getBmjb()!=null && !sqlWhere.getBmjb().equals("")){
                criteria.andBmjbEqualTo(sqlWhere.getBmjb());
            }
            if(sqlWhere.getSjbm()!=null && !sqlWhere.getSjbm().equals("")){
                criteria.andSjbmEqualTo(sqlWhere.getSjbm());
            }
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                criteria.andGlbmEqualTo(sqlWhere.getGlbm());
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
            List<FrmDepartmentEntity> entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"失败："+e.getMessage());
        }
    }
    public List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWherejc(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getBmjb()!=null && !sqlWhere.getBmjb().equals("")){
                criteria.andBmjbEqualTo(sqlWhere.getBmjb());
            }
            if(sqlWhere.getSjbm()!=null && !sqlWhere.getSjbm().equals("")){
                criteria.andSjbmNotEqualTo(sqlWhere.getSjbm());
            }
        }
        try {
            List<FrmDepartmentEntity> entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"失败："+e.getMessage());
        }
    }
    /**
     * 查询出所有医院
     */
    public List<FrmDepartmentEntity> getListAllyiyuanBySqlWhere() {
    	List<FrmDepartmentEntity> entitylist=null;
        try {
        	FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
        	Criteria criteria=sqlWhere.createCriteria();
        	criteria.andBmjbEqualTo("5");
        	criteria.andSjbmEqualTo("28");
            entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"失败："+e.getMessage());
        }
        return entitylist;
    }
    /**
     * 查询出所有医院
     */
    public List<FrmDepartmentEntity> getListAllyiyuanCoverbaseBySqlWhere() {
    	List<FrmDepartmentEntity> entitylist=null;
        try {
        	FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
        	Criteria criteria=sqlWhere.createCriteria();
        	criteria.andBmjbEqualTo("5");
            entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"失败："+e.getMessage());
        }
        return entitylist;
    }
    /**
     * 查询出医院下所有部门
     */
    public List<FrmDepartmentEntity> getListAlldeptBySqlWhere(String yiyuan) {
        try {
        	FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
        	Criteria criteria=sqlWhere.createCriteria();
        	criteria.andSjbmEqualTo(yiyuan);
            List<FrmDepartmentEntity> entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"失败："+e.getMessage());
        }
    }
    
    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListFrmDepartmentBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=frmDepartmentDao.selectListFrmDepartmentBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public FrmDepartmentEntity selectFrmDepartmentByPrimaryKey(String glbm) {
        try {
            FrmDepartmentEntity entity = frmDepartmentDao.selectFrmDepartmentByPrimaryKey(glbm);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,插入信息
      */
    public ExcuteResult insertFrmDepartment(FrmDepartmentEntity entity) {
        try {
            return frmDepartmentDao.insertFrmDepartment(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertFrmDepartmentSelective(FrmDepartmentEntity entity) {
        try {
            return frmDepartmentDao.insertFrmDepartmentSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*FRM_DEPARTMENT,部门信息表,修改
      */
    public ExcuteResult updateFrmDepartmentByPrimaryKey(FrmDepartmentEntity entity) {
        try {
            return frmDepartmentDao.updateFrmDepartmentByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateFrmDepartmentBySqlWhere(FrmDepartmentEntity entity, FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmDepartmentDao.updateFrmDepartmentBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*FRM_DEPARTMENT,部门信息表,修改
      */
    public ExcuteResult updateFrmDepartmentBySqlWhereSelective(FrmDepartmentEntity entity, FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmDepartmentDao.updateFrmDepartmentBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*FRM_DEPARTMENT,部门信息表,修改
      */
    public ExcuteResult updateFrmDepartmentByPrimaryKeySelective(FrmDepartmentEntity entity) {
        try {
            return frmDepartmentDao.updateFrmDepartmentByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteFrmDepartmentByPrimaryKey(String glbm) {
        try {
            return frmDepartmentDao.deleteFrmDepartmentByPrimaryKey(glbm);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_DEPARTMENT,部门信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmDepartmentDao.deleteFrmDepartmentBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmDepartment+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*FRM_DEPARTMENT,部门信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                criteria.andGlbmEqualTo(sqlWhere.getGlbm());
            }
            
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)frmDepartmentDao.countFrmDepartmentBySqlWhere(sqlWhere);
    }
    /**
     * 根据条件查询出部门名称 
     * @param request
     * @param response
     * @param entity
     */
    public String getDeptNamebyNumber(String deptid) {
    	String name = "";
         try {
        	 FrmDepartmentEntity entity = frmDepartmentDao.selectFrmDepartmentByPrimaryKey(deptid);
        	 if(entity!=null){
        		 name = entity.getBmmc();
        	 }else{
        		 name = "";
        	 }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return name;
    }
    public void setFrmDepartmentDao(IFrmDepartmentDao frmDepartmentDao) {
        this.frmDepartmentDao = frmDepartmentDao;
    }

    public IFrmDepartmentDao getFrmDepartmentDao() {
        return frmDepartmentDao;
    }
}