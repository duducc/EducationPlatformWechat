package com.saint.teaching.services.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.dao.IJxStudyRegistrationDao;
import com.saint.teaching.services.IJxStudyRegistrationService;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDY_REGISTRATION
*表说明理论课签到
  */
public class JxStudyRegistrationServiceImpl implements IJxStudyRegistrationService {
    private IJxStudyRegistrationDao jxStudyRegistrationDao;

    /**
    *方法注释信息
    *分页查询表JX_STUDY_REGISTRATION
    *表说明理论课签到
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudyRegistrationEntity> selectListPageJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
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
            List<JxStudyRegistrationEntity> entitylist=jxStudyRegistrationDao.selectListPageJxStudyRegistrationBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDY_REGISTRATION
     * 表说明理论课签到
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudyRegistrationEntity> selectListJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getCourseId()!=null && !sqlWhere.getCourseId().equals("")){
            	BigDecimal b = new BigDecimal(sqlWhere.getCourseId());
                criteria.andCourseIdEqualTo(b);
            }
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            if(sqlWhere.getAddYear()!=null && !sqlWhere.getAddYear().equals("")){
                criteria.andAddYearEqualTo(sqlWhere.getAddYear());
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
            List<JxStudyRegistrationEntity> entitylist=jxStudyRegistrationDao.selectListJxStudyRegistrationBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudyRegistrationBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudyRegistrationDao.selectListJxStudyRegistrationBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudyRegistrationEntity selectJxStudyRegistrationByPrimaryKey(String xh) {
        try {
            JxStudyRegistrationEntity entity = jxStudyRegistrationDao.selectJxStudyRegistrationByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,插入信息
      */
    public ExcuteResult insertJxStudyRegistration(JxStudyRegistrationEntity entity) {
        try {
            return jxStudyRegistrationDao.insertJxStudyRegistration(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudyRegistrationSelective(JxStudyRegistrationEntity entity) {
        try {
            return jxStudyRegistrationDao.insertJxStudyRegistrationSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDY_REGISTRATION,理论课签到表,修改
      */
    public ExcuteResult updateJxStudyRegistrationByPrimaryKey(JxStudyRegistrationEntity entity) {
        try {
            return jxStudyRegistrationDao.updateJxStudyRegistrationByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudyRegistrationBySqlWhere(JxStudyRegistrationEntity entity, JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudyRegistrationDao.updateJxStudyRegistrationBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDY_REGISTRATION,理论课签到表,修改
      */
    public ExcuteResult updateJxStudyRegistrationBySqlWhereSelective(JxStudyRegistrationEntity entity, JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudyRegistrationDao.updateJxStudyRegistrationBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDY_REGISTRATION,理论课签到表,修改
      */
    public ExcuteResult updateJxStudyRegistrationByPrimaryKeySelective(JxStudyRegistrationEntity entity) {
        try {
            return jxStudyRegistrationDao.updateJxStudyRegistrationByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudyRegistrationByPrimaryKey(String xh) {
        try {
            return jxStudyRegistrationDao.deleteJxStudyRegistrationByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudyRegistrationDao.deleteJxStudyRegistrationBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudyRegistration+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDY_REGISTRATION,理论课签到表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudyRegistrationDao.countJxStudyRegistrationBySqlWhere(sqlWhere);
    }

    public void setJxStudyRegistrationDao(IJxStudyRegistrationDao jxStudyRegistrationDao) {
        this.jxStudyRegistrationDao = jxStudyRegistrationDao;
    }

    public IJxStudyRegistrationDao getJxStudyRegistrationDao() {
        return jxStudyRegistrationDao;
    }
}