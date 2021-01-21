package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.dao.IJxCoursePlanDao;
import com.saint.teaching.services.IJxCoursePlanService;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere.Criteria;

/**
*类注释信息
*表名JX_COURSEPLAN
*表说明理论课教学进度
  */
public class JxCoursePlanServiceImpl implements IJxCoursePlanService {
    private IJxCoursePlanDao jxCoursePlanDao;

    /**
    *方法注释信息
    *分页查询表JX_COURSEPLAN
    *表说明理论课教学进度
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxCoursePlanEntity> selectListPageJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
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
            List<JxCoursePlanEntity> entitylist=jxCoursePlanDao.selectListPageJxCoursePlanBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_COURSEPLAN
     * 表说明理论课教学进度
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxCoursePlanEntity> selectListJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getXh() != null && !"".equals(sqlWhere.getXh())){
            	criteria.andXhEqualTo(sqlWhere.getXh());
            }
            if(sqlWhere.getShkxuexid() != null && !"".equals(sqlWhere.getShkxuexid())){
            	criteria.andShkxuexidEqualTo(sqlWhere.getShkxuexid());
            }
            if(sqlWhere.getNj()!=null && !sqlWhere.getNj().equals("")){
                criteria.andNjLike("%"+sqlWhere.getNj()+"%");
            }
            if(sqlWhere.getXshszzhy()!=null && !sqlWhere.getXshszzhy().equals("")){
                criteria.andXshszzhyLike("%"+sqlWhere.getXshszzhy()+"%");
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
            List<JxCoursePlanEntity> entitylist=jxCoursePlanDao.selectListJxCoursePlanBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCoursePlanBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxCoursePlanDao.selectListJxCoursePlanBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxCoursePlanEntity selectJxCoursePlanByPrimaryKey(String xh) {
        try {
            JxCoursePlanEntity entity = jxCoursePlanDao.selectJxCoursePlanByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,插入信息
      */
    public ExcuteResult insertJxCoursePlan(JxCoursePlanEntity entity) {
        try {
            return jxCoursePlanDao.insertJxCoursePlan(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCoursePlanSelective(JxCoursePlanEntity entity) {
        try {
            return jxCoursePlanDao.insertJxCoursePlanSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_COURSEPLAN,理论课教学进度表,修改
      */
    public ExcuteResult updateJxCoursePlanByPrimaryKey(JxCoursePlanEntity entity) {
        try {
            return jxCoursePlanDao.updateJxCoursePlanByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxCoursePlanBySqlWhere(JxCoursePlanEntity entity, JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCoursePlanDao.updateJxCoursePlanBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_COURSEPLAN,理论课教学进度表,修改
      */
    public ExcuteResult updateJxCoursePlanBySqlWhereSelective(JxCoursePlanEntity entity, JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCoursePlanDao.updateJxCoursePlanBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_COURSEPLAN,理论课教学进度表,修改
      */
    public ExcuteResult updateJxCoursePlanByPrimaryKeySelective(JxCoursePlanEntity entity) {
        try {
            return jxCoursePlanDao.updateJxCoursePlanByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxCoursePlanByPrimaryKey(String xh) {
        try {
            return jxCoursePlanDao.deleteJxCoursePlanByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEPLAN,理论课教学进度表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCoursePlanDao.deleteJxCoursePlanBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCoursePlan+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_COURSEPLAN,理论课教学进度表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxCoursePlanDao.countJxCoursePlanBySqlWhere(sqlWhere);
    }

    public void setJxCoursePlanDao(IJxCoursePlanDao jxCoursePlanDao) {
        this.jxCoursePlanDao = jxCoursePlanDao;
    }

    public IJxCoursePlanDao getJxCoursePlanDao() {
        return jxCoursePlanDao;
    }
}