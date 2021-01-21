package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCoursezxTimeEntity;
import com.saint.teaching.dao.IJxCoursezxTimeDao;
import com.saint.teaching.services.IJxCoursezxTimeService;
import com.saint.teaching.sqlWhere.JxCoursezxTimeSqlWhere;
import com.saint.teaching.sqlWhere.JxCoursezxTimeSqlWhere.Criteria;

/**
*类注释信息
*表名JX_COURSEZXTIME
*表说明理论课上课作息时间
  */
public class JxCoursezxTimeServiceImpl implements IJxCoursezxTimeService {
    private IJxCoursezxTimeDao jxCoursezxTimeDao;

    /**
    *方法注释信息
    *分页查询表JX_COURSEZXTIME
    *表说明理论课上课作息时间
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxCoursezxTimeEntity> selectListPageJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
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
            List<JxCoursezxTimeEntity> entitylist=jxCoursezxTimeDao.selectListPageJxCoursezxTimeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_COURSEZXTIME
     * 表说明理论课上课作息时间
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxCoursezxTimeEntity> selectListJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
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
            List<JxCoursezxTimeEntity> entitylist=jxCoursezxTimeDao.selectListJxCoursezxTimeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCoursezxTimeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxCoursezxTimeDao.selectListJxCoursezxTimeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxCoursezxTimeEntity selectJxCoursezxTimeByPrimaryKey(String xh) {
        try {
            JxCoursezxTimeEntity entity = jxCoursezxTimeDao.selectJxCoursezxTimeByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,插入信息
      */
    public ExcuteResult insertJxCoursezxTime(JxCoursezxTimeEntity entity) {
        try {
            return jxCoursezxTimeDao.insertJxCoursezxTime(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCoursezxTimeSelective(JxCoursezxTimeEntity entity) {
        try {
            return jxCoursezxTimeDao.insertJxCoursezxTimeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_COURSEZXTIME,理论课上课作息时间表,修改
      */
    public ExcuteResult updateJxCoursezxTimeByPrimaryKey(JxCoursezxTimeEntity entity) {
        try {
            return jxCoursezxTimeDao.updateJxCoursezxTimeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxCoursezxTimeBySqlWhere(JxCoursezxTimeEntity entity, JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCoursezxTimeDao.updateJxCoursezxTimeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_COURSEZXTIME,理论课上课作息时间表,修改
      */
    public ExcuteResult updateJxCoursezxTimeBySqlWhereSelective(JxCoursezxTimeEntity entity, JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCoursezxTimeDao.updateJxCoursezxTimeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_COURSEZXTIME,理论课上课作息时间表,修改
      */
    public ExcuteResult updateJxCoursezxTimeByPrimaryKeySelective(JxCoursezxTimeEntity entity) {
        try {
            return jxCoursezxTimeDao.updateJxCoursezxTimeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxCoursezxTimeByPrimaryKey(String xh) {
        try {
            return jxCoursezxTimeDao.deleteJxCoursezxTimeByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEZXTIME,理论课上课作息时间表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCoursezxTimeDao.deleteJxCoursezxTimeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCoursezxTime+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_COURSEZXTIME,理论课上课作息时间表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxCoursezxTimeDao.countJxCoursezxTimeBySqlWhere(sqlWhere);
    }

    public void setJxCoursezxTimeDao(IJxCoursezxTimeDao jxCoursezxTimeDao) {
        this.jxCoursezxTimeDao = jxCoursezxTimeDao;
    }

    public IJxCoursezxTimeDao getJxCoursezxTimeDao() {
        return jxCoursezxTimeDao;
    }
}