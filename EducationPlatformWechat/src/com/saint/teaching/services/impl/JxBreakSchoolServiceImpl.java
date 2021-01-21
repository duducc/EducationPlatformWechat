package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import com.saint.teaching.dao.IJxBreakSchoolDao;
import com.saint.teaching.services.IJxBreakSchoolService;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere.Criteria;

/**
*类注释信息
*表名JX_BREAKSCHOOL
*表说明学生违纪登记
  */
public class JxBreakSchoolServiceImpl implements IJxBreakSchoolService {
    private IJxBreakSchoolDao jxBreakSchoolDao;

    /**
    *方法注释信息
    *分页查询表JX_BREAKSCHOOL
    *表说明学生违纪登记
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxBreakSchoolEntity> selectListPageJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getOpdate()!=null && !sqlWhere.getOpdate().equals("")){
            	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
					criteria.andOpdateEqualTo(sdf.parse(sqlWhere.getOpdate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
                criteria.andStateEqualTo(sqlWhere.getState());
            }
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
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
            List<JxBreakSchoolEntity> entitylist=jxBreakSchoolDao.selectListPageJxBreakSchoolBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_BREAKSCHOOL
     * 表说明学生违纪登记
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxBreakSchoolEntity> selectListJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
        	Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getOpdate()!=null && !sqlWhere.getOpdate().equals("")){
            	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
					criteria.andOpdateEqualTo(sdf.parse(sqlWhere.getOpdate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
                criteria.andStateEqualTo(sqlWhere.getState());
            }
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
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
            List<JxBreakSchoolEntity> entitylist=jxBreakSchoolDao.selectListJxBreakSchoolBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxBreakSchoolBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxBreakSchoolDao.selectListJxBreakSchoolBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxBreakSchoolEntity selectJxBreakSchoolByPrimaryKey(String xh) {
        try {
            JxBreakSchoolEntity entity = jxBreakSchoolDao.selectJxBreakSchoolByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,插入信息
      */
    public ExcuteResult insertJxBreakSchool(JxBreakSchoolEntity entity) {
        try {
            return jxBreakSchoolDao.insertJxBreakSchool(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxBreakSchoolSelective(JxBreakSchoolEntity entity) {
        try {
            return jxBreakSchoolDao.insertJxBreakSchoolSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_BREAKSCHOOL,学生违纪登记表,修改
      */
    public ExcuteResult updateJxBreakSchoolByPrimaryKey(JxBreakSchoolEntity entity) {
        try {
            return jxBreakSchoolDao.updateJxBreakSchoolByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxBreakSchoolBySqlWhere(JxBreakSchoolEntity entity, JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxBreakSchoolDao.updateJxBreakSchoolBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_BREAKSCHOOL,学生违纪登记表,修改
      */
    public ExcuteResult updateJxBreakSchoolBySqlWhereSelective(JxBreakSchoolEntity entity, JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxBreakSchoolDao.updateJxBreakSchoolBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_BREAKSCHOOL,学生违纪登记表,修改
      */
    public ExcuteResult updateJxBreakSchoolByPrimaryKeySelective(JxBreakSchoolEntity entity) {
        try {
            return jxBreakSchoolDao.updateJxBreakSchoolByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxBreakSchoolByPrimaryKey(String xh) {
        try {
            return jxBreakSchoolDao.deleteJxBreakSchoolByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_BREAKSCHOOL,学生违纪登记表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxBreakSchoolDao.deleteJxBreakSchoolBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxBreakSchool+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_BREAKSCHOOL,学生违纪登记表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxBreakSchoolDao.countJxBreakSchoolBySqlWhere(sqlWhere);
    }

    public void setJxBreakSchoolDao(IJxBreakSchoolDao jxBreakSchoolDao) {
        this.jxBreakSchoolDao = jxBreakSchoolDao;
    }

    public IJxBreakSchoolDao getJxBreakSchoolDao() {
        return jxBreakSchoolDao;
    }
}