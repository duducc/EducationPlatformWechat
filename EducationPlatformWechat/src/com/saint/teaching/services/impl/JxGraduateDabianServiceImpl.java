package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxGraduateDabianEntity;
import com.saint.teaching.dao.IJxGraduateDabianDao;
import com.saint.teaching.services.IJxGraduateDabianService;
import com.saint.teaching.sqlWhere.JxGraduateDabianSqlWhere;
import com.saint.teaching.sqlWhere.JxGraduateDabianSqlWhere.Criteria;

/**
*类注释信息
*表名JX_GRADUATE_DABIAN
*表说明研究生答辩申报
  */
public class JxGraduateDabianServiceImpl implements IJxGraduateDabianService {
    private IJxGraduateDabianDao jxGraduateDabianDao;

    /**
    *方法注释信息
    *分页查询表JX_GRADUATE_DABIAN
    *表说明研究生答辩申报
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxGraduateDabianEntity> selectListPageJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
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
            List<JxGraduateDabianEntity> entitylist=jxGraduateDabianDao.selectListPageJxGraduateDabianBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_GRADUATE_DABIAN
     * 表说明研究生答辩申报
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxGraduateDabianEntity> selectListJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
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
            List<JxGraduateDabianEntity> entitylist=jxGraduateDabianDao.selectListJxGraduateDabianBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxGraduateDabianBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxGraduateDabianDao.selectListJxGraduateDabianBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxGraduateDabianEntity selectJxGraduateDabianByPrimaryKey(String xh) {
        try {
            JxGraduateDabianEntity entity = jxGraduateDabianDao.selectJxGraduateDabianByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,插入信息
      */
    public ExcuteResult insertJxGraduateDabian(JxGraduateDabianEntity entity) {
        try {
            return jxGraduateDabianDao.insertJxGraduateDabian(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxGraduateDabianSelective(JxGraduateDabianEntity entity) {
        try {
            return jxGraduateDabianDao.insertJxGraduateDabianSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,修改
      */
    public ExcuteResult updateJxGraduateDabianByPrimaryKey(JxGraduateDabianEntity entity) {
        try {
            return jxGraduateDabianDao.updateJxGraduateDabianByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxGraduateDabianBySqlWhere(JxGraduateDabianEntity entity, JxGraduateDabianSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxGraduateDabianDao.updateJxGraduateDabianBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,修改
      */
    public ExcuteResult updateJxGraduateDabianBySqlWhereSelective(JxGraduateDabianEntity entity, JxGraduateDabianSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxGraduateDabianDao.updateJxGraduateDabianBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,修改
      */
    public ExcuteResult updateJxGraduateDabianByPrimaryKeySelective(JxGraduateDabianEntity entity) {
        try {
            return jxGraduateDabianDao.updateJxGraduateDabianByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDabianByPrimaryKey(String xh) {
        try {
            return jxGraduateDabianDao.deleteJxGraduateDabianByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DABIAN,研究生答辩申报表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxGraduateDabianDao.deleteJxGraduateDabianBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxGraduateDabian+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_GRADUATE_DABIAN,研究生答辩申报表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxGraduateDabianDao.countJxGraduateDabianBySqlWhere(sqlWhere);
    }

    public void setJxGraduateDabianDao(IJxGraduateDabianDao jxGraduateDabianDao) {
        this.jxGraduateDabianDao = jxGraduateDabianDao;
    }

    public IJxGraduateDabianDao getJxGraduateDabianDao() {
        return jxGraduateDabianDao;
    }
}