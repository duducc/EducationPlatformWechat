package com.saint.research.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyProjectPlanEntity;
import com.saint.research.dao.IKyProjectPlanDao;
import com.saint.research.services.IKyProjectPlanService;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere.Criteria;

/**
*类注释信息
*表名KY_PROJECTPLAN
*表说明任务进度计划
  */
public class KyProjectPlanServiceImpl implements IKyProjectPlanService {
    private IKyProjectPlanDao kyProjectPlanDao;

    /**
    *方法注释信息
    *分页查询表KY_PROJECTPLAN
    *表说明任务进度计划
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<KyProjectPlanEntity> selectListPageKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getRemark1()!=null && !sqlWhere.getRemark1().equals("")){
                criteria.andRemark1Like("%"+sqlWhere.getRemark1()+"%");
            }
            if(sqlWhere.getTaskgoal()!=null && !sqlWhere.getTaskgoal().equals("")){
                criteria.andTaskgoalLike("%"+sqlWhere.getTaskgoal()+"%");
            }
            if(sqlWhere.getExcuteusername()!=null && !sqlWhere.getExcuteusername().equals("")){
                criteria.andExcuteusernameLike("%"+sqlWhere.getExcuteusername()+"%");
            }
            if(sqlWhere.getExcuteuserid()!=null && !sqlWhere.getExcuteuserid().equals("")){
                criteria.andExcuteuseridLike("%"+sqlWhere.getExcuteuserid()+"%");
            }
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
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
            List<KyProjectPlanEntity> entitylist=kyProjectPlanDao.selectListPageKyProjectPlanBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表KY_PROJECTPLAN
     * 表说明任务进度计划
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<KyProjectPlanEntity> selectListKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
            if(sqlWhere.getExcuteuserid()!=null && !sqlWhere.getExcuteuserid().equals("")){
                criteria.andExcuteuseridEqualTo(sqlWhere.getExcuteuserid());
            }
            if(sqlWhere.getXh()!=null && !sqlWhere.getXh().equals("")){
                criteria.andXhNotEqualTo(sqlWhere.getXh());
            }
            if(sqlWhere.getTaskgoal()!=null && !sqlWhere.getTaskgoal().equals("")){
                criteria.andTaskgoalEqualTo(sqlWhere.getTaskgoal());
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
            List<KyProjectPlanEntity> entitylist=kyProjectPlanDao.selectListKyProjectPlanBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyProjectPlanBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=kyProjectPlanDao.selectListKyProjectPlanBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public KyProjectPlanEntity selectKyProjectPlanByPrimaryKey(String xh) {
        try {
            KyProjectPlanEntity entity = kyProjectPlanDao.selectKyProjectPlanByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,插入信息
      */
    public ExcuteResult insertKyProjectPlan(KyProjectPlanEntity entity) {
        try {
            return kyProjectPlanDao.insertKyProjectPlan(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyProjectPlanSelective(KyProjectPlanEntity entity) {
        try {
            return kyProjectPlanDao.insertKyProjectPlanSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*KY_PROJECTPLAN,任务进度计划表,修改
      */
    public ExcuteResult updateKyProjectPlanByPrimaryKey(KyProjectPlanEntity entity) {
        try {
            return kyProjectPlanDao.updateKyProjectPlanByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateKyProjectPlanBySqlWhere(KyProjectPlanEntity entity, KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kyProjectPlanDao.updateKyProjectPlanBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*KY_PROJECTPLAN,任务进度计划表,修改
      */
    public ExcuteResult updateKyProjectPlanBySqlWhereSelective(KyProjectPlanEntity entity, KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kyProjectPlanDao.updateKyProjectPlanBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*KY_PROJECTPLAN,任务进度计划表,修改
      */
    public ExcuteResult updateKyProjectPlanByPrimaryKeySelective(KyProjectPlanEntity entity) {
        try {
            return kyProjectPlanDao.updateKyProjectPlanByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteKyProjectPlanByPrimaryKey(String xh) {
        try {
            return kyProjectPlanDao.deleteKyProjectPlanByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTPLAN,任务进度计划表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kyProjectPlanDao.deleteKyProjectPlanBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKyProjectPlan+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*KY_PROJECTPLAN,任务进度计划表
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)kyProjectPlanDao.countKyProjectPlanBySqlWhere(sqlWhere);
    }

    public void setKyProjectPlanDao(IKyProjectPlanDao kyProjectPlanDao) {
        this.kyProjectPlanDao = kyProjectPlanDao;
    }

    public IKyProjectPlanDao getKyProjectPlanDao() {
        return kyProjectPlanDao;
    }
}