package com.saint.teaching.services.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.dao.IJxSignInfoDao;
import com.saint.teaching.services.IJxSignInfoService;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere.Criteria;

/**
*类注释信息
*表名JX_SIGN_INFO
*表说明实习学员签到信息
  */
public class JxSignInfoServiceImpl implements IJxSignInfoService {
    private IJxSignInfoDao jxSignInfoDao;

    /**
    *方法注释信息
    *分页查询表JX_SIGN_INFO
    *表说明实习学员签到信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxSignInfoEntity> selectListPageJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
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
            List<JxSignInfoEntity> entitylist=jxSignInfoDao.selectListPageJxSignInfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_SIGN_INFO
     * 表说明实习学员签到信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxSignInfoEntity> selectListJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getSigncs()!=null && !sqlWhere.getSigncs().equals("")){
            	BigDecimal bd=new BigDecimal(sqlWhere.getSigncs());
                criteria.andSigncsEqualTo(bd);
            }
            if(sqlWhere.getMarking()!=null && !sqlWhere.getMarking().equals("")){
                criteria.andMarkingEqualTo(sqlWhere.getMarking());
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
            List<JxSignInfoEntity> entitylist=jxSignInfoDao.selectListJxSignInfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxSignInfoBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxSignInfoDao.selectListJxSignInfoBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxSignInfoEntity selectJxSignInfoByPrimaryKey(String xh) {
        try {
            JxSignInfoEntity entity = jxSignInfoDao.selectJxSignInfoByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,插入信息
      */
    public ExcuteResult insertJxSignInfo(JxSignInfoEntity entity) {
        try {
            return jxSignInfoDao.insertJxSignInfo(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxSignInfoSelective(JxSignInfoEntity entity) {
        try {
            return jxSignInfoDao.insertJxSignInfoSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_SIGN_INFO,实习学员签到信息表,修改
      */
    public ExcuteResult updateJxSignInfoByPrimaryKey(JxSignInfoEntity entity) {
        try {
            return jxSignInfoDao.updateJxSignInfoByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxSignInfoBySqlWhere(JxSignInfoEntity entity, JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxSignInfoDao.updateJxSignInfoBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_SIGN_INFO,实习学员签到信息表,修改
      */
    public ExcuteResult updateJxSignInfoBySqlWhereSelective(JxSignInfoEntity entity, JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxSignInfoDao.updateJxSignInfoBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_SIGN_INFO,实习学员签到信息表,修改
      */
    public ExcuteResult updateJxSignInfoByPrimaryKeySelective(JxSignInfoEntity entity) {
        try {
            return jxSignInfoDao.updateJxSignInfoByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxSignInfoByPrimaryKey(String xh) {
        try {
            return jxSignInfoDao.deleteJxSignInfoByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxSignInfoDao.deleteJxSignInfoBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxSignInfo+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_SIGN_INFO,实习学员签到信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxSignInfoDao.countJxSignInfoBySqlWhere(sqlWhere);
    }

    public void setJxSignInfoDao(IJxSignInfoDao jxSignInfoDao) {
        this.jxSignInfoDao = jxSignInfoDao;
    }

    public IJxSignInfoDao getJxSignInfoDao() {
        return jxSignInfoDao;
    }
}