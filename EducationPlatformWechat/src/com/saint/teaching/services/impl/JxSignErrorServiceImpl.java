package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxSignErrorEntity;
import com.saint.teaching.dao.IJxSignErrorDao;
import com.saint.teaching.services.IJxSignErrorService;
import com.saint.teaching.sqlWhere.JxSignErrorSqlWhere;
import com.saint.teaching.sqlWhere.JxSignErrorSqlWhere.Criteria;

/**
*类注释信息
*表名JX_SIGN_ERROR
*表说明学生签到失败日志
  */
public class JxSignErrorServiceImpl implements IJxSignErrorService {
    private IJxSignErrorDao jxSignErrorDao;

    /**
    *方法注释信息
    *分页查询表JX_SIGN_ERROR
    *表说明学生签到失败日志
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxSignErrorEntity> selectListPageJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
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
            List<JxSignErrorEntity> entitylist=jxSignErrorDao.selectListPageJxSignErrorBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignError+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_SIGN_ERROR
     * 表说明学生签到失败日志
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxSignErrorEntity> selectListJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
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
            List<JxSignErrorEntity> entitylist=jxSignErrorDao.selectListJxSignErrorBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignError+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxSignErrorBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxSignErrorDao.selectListJxSignErrorBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignError+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxSignErrorEntity selectJxSignErrorByPrimaryKey(String xh) {
        try {
            JxSignErrorEntity entity = jxSignErrorDao.selectJxSignErrorByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,插入信息
      */
    public ExcuteResult insertJxSignError(JxSignErrorEntity entity) {
        try {
            return jxSignErrorDao.insertJxSignError(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxSignErrorSelective(JxSignErrorEntity entity) {
        try {
            return jxSignErrorDao.insertJxSignErrorSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_SIGN_ERROR,学生签到失败日志表,修改
      */
    public ExcuteResult updateJxSignErrorByPrimaryKey(JxSignErrorEntity entity) {
        try {
            return jxSignErrorDao.updateJxSignErrorByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxSignErrorBySqlWhere(JxSignErrorEntity entity, JxSignErrorSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxSignErrorDao.updateJxSignErrorBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_SIGN_ERROR,学生签到失败日志表,修改
      */
    public ExcuteResult updateJxSignErrorBySqlWhereSelective(JxSignErrorEntity entity, JxSignErrorSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxSignErrorDao.updateJxSignErrorBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_SIGN_ERROR,学生签到失败日志表,修改
      */
    public ExcuteResult updateJxSignErrorByPrimaryKeySelective(JxSignErrorEntity entity) {
        try {
            return jxSignErrorDao.updateJxSignErrorByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxSignErrorByPrimaryKey(String xh) {
        try {
            return jxSignErrorDao.deleteJxSignErrorByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxSignErrorDao.deleteJxSignErrorBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxSignError+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_SIGN_ERROR,学生签到失败日志表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxSignErrorDao.countJxSignErrorBySqlWhere(sqlWhere);
    }

    public void setJxSignErrorDao(IJxSignErrorDao jxSignErrorDao) {
        this.jxSignErrorDao = jxSignErrorDao;
    }

    public IJxSignErrorDao getJxSignErrorDao() {
        return jxSignErrorDao;
    }
}