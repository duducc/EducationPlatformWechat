package com.saint.research.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KyProjectGressEntity;
import com.saint.research.dao.IKyProjectGressDao;
import com.saint.research.services.IKyProjectGressService;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere.*;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
*类注释信息
*表名KY_PROJECTGRESS
*表说明项目执行情况登记
  */
public class KyProjectGressServiceImpl implements IKyProjectGressService {
    private IKyProjectGressDao kyProjectGressDao;

    /**
    *方法注释信息
    *分页查询表KY_PROJECTGRESS
    *表说明项目执行情况登记
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<KyProjectGressEntity> selectListPageKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
                criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
            }
            if(sqlWhere.getTaskname()!=null && !sqlWhere.getTaskname().equals("")){
                criteria.andTasknameLike("%"+sqlWhere.getTaskname()+"%");
            }
            if(sqlWhere.getRegperid()!=null && !sqlWhere.getRegperid().equals("")){
            	criteria.andRegperidEqualTo(sqlWhere.getRegperid());
            }
            if(sqlWhere.getTasknum()!=null && !sqlWhere.getTasknum().equals("")){
            	criteria.andTasknumEqualTo(sqlWhere.getTasknum());
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
            List<KyProjectGressEntity> entitylist=kyProjectGressDao.selectListPageKyProjectGressBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询表KY_PROJECTGRESS
     * 表说明项目执行情况登记
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<KyProjectGressEntity> selectListKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
            if(sqlWhere.getRegperid()!=null && !sqlWhere.getRegperid().equals("")){
                criteria.andRegperidEqualTo(sqlWhere.getRegperid());
            }
            if(sqlWhere.getTasknum()!=null && !sqlWhere.getTasknum().equals("")){
                criteria.andTasknumEqualTo(sqlWhere.getTasknum());
            }
            
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
                criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
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
            List<KyProjectGressEntity> entitylist=kyProjectGressDao.selectListKyProjectGressBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyProjectGressBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=kyProjectGressDao.selectListKyProjectGressBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public KyProjectGressEntity selectKyProjectGressByPrimaryKey(String xh) {
        try {
            KyProjectGressEntity entity = kyProjectGressDao.selectKyProjectGressByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,插入信息
      */
    public ExcuteResult insertKyProjectGress(KyProjectGressEntity entity) {
        try {
            return kyProjectGressDao.insertKyProjectGress(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyProjectGressSelective(KyProjectGressEntity entity) {
        try {
            return kyProjectGressDao.insertKyProjectGressSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*KY_PROJECTGRESS,项目执行情况登记表,修改
      */
    public ExcuteResult updateKyProjectGressByPrimaryKey(KyProjectGressEntity entity) {
        try {
            return kyProjectGressDao.updateKyProjectGressByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateKyProjectGressBySqlWhere(KyProjectGressEntity entity, KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kyProjectGressDao.updateKyProjectGressBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*KY_PROJECTGRESS,项目执行情况登记表,修改
      */
    public ExcuteResult updateKyProjectGressBySqlWhereSelective(KyProjectGressEntity entity, KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kyProjectGressDao.updateKyProjectGressBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*KY_PROJECTGRESS,项目执行情况登记表,修改
      */
    public ExcuteResult updateKyProjectGressByPrimaryKeySelective(KyProjectGressEntity entity) {
        try {
            return kyProjectGressDao.updateKyProjectGressByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteKyProjectGressByPrimaryKey(String xh) {
        try {
            return kyProjectGressDao.deleteKyProjectGressByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
            	criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
            if(sqlWhere.getRegperid()!=null && !sqlWhere.getRegperid().equals("")){
            	criteria.andRegperidEqualTo(sqlWhere.getRegperid());
            }
            if(sqlWhere.getTasknum()!=null && !sqlWhere.getTasknum().equals("")){
            	criteria.andTasknumEqualTo(sqlWhere.getTasknum());
            }
        }
        try {
            return kyProjectGressDao.deleteKyProjectGressBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*KY_PROJECTGRESS,项目执行情况登记表
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
            	criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
            if(sqlWhere.getRegperid()!=null && !sqlWhere.getRegperid().equals("")){
            	criteria.andRegperidEqualTo(sqlWhere.getRegperid());
            }
            if(sqlWhere.getTasknum()!=null && !sqlWhere.getTasknum().equals("")){
            	criteria.andTasknumEqualTo(sqlWhere.getTasknum());
            }
        }
        return (Integer)kyProjectGressDao.countKyProjectGressBySqlWhere(sqlWhere);
    }

    public void setKyProjectGressDao(IKyProjectGressDao kyProjectGressDao) {
        this.kyProjectGressDao = kyProjectGressDao;
    }

    public IKyProjectGressDao getKyProjectGressDao() {
        return kyProjectGressDao;
    }
}