package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxGraduateDbempEntity;
import com.saint.teaching.dao.IJxGraduateDbempDao;
import com.saint.teaching.services.IJxGraduateDbempService;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere.Criteria;

/**
*类注释信息
*表名JX_GRADUATE_DBEMP
*表说明研究生答辩参加人员
  */
public class JxGraduateDbempServiceImpl implements IJxGraduateDbempService {
    private IJxGraduateDbempDao jxGraduateDbempDao;

    /**
    *方法注释信息
    *分页查询表JX_GRADUATE_DBEMP
    *表说明研究生答辩参加人员
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxGraduateDbempEntity> selectListPageJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
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
            List<JxGraduateDbempEntity> entitylist=jxGraduateDbempDao.selectListPageJxGraduateDbempBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_GRADUATE_DBEMP
     * 表说明研究生答辩参加人员
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxGraduateDbempEntity> selectListJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
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
            List<JxGraduateDbempEntity> entitylist=jxGraduateDbempDao.selectListJxGraduateDbempBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxGraduateDbempBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxGraduateDbempDao.selectListJxGraduateDbempBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxGraduateDbempEntity selectJxGraduateDbempByPrimaryKey(String xh) {
        try {
            JxGraduateDbempEntity entity = jxGraduateDbempDao.selectJxGraduateDbempByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,插入信息
      */
    public ExcuteResult insertJxGraduateDbemp(JxGraduateDbempEntity entity) {
        try {
            return jxGraduateDbempDao.insertJxGraduateDbemp(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxGraduateDbempSelective(JxGraduateDbempEntity entity) {
        try {
            return jxGraduateDbempDao.insertJxGraduateDbempSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,修改
      */
    public ExcuteResult updateJxGraduateDbempByPrimaryKey(JxGraduateDbempEntity entity) {
        try {
            return jxGraduateDbempDao.updateJxGraduateDbempByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxGraduateDbempBySqlWhere(JxGraduateDbempEntity entity, JxGraduateDbempSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxGraduateDbempDao.updateJxGraduateDbempBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,修改
      */
    public ExcuteResult updateJxGraduateDbempBySqlWhereSelective(JxGraduateDbempEntity entity, JxGraduateDbempSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxGraduateDbempDao.updateJxGraduateDbempBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,修改
      */
    public ExcuteResult updateJxGraduateDbempByPrimaryKeySelective(JxGraduateDbempEntity entity) {
        try {
            return jxGraduateDbempDao.updateJxGraduateDbempByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDbempByPrimaryKey(String xh) {
        try {
            return jxGraduateDbempDao.deleteJxGraduateDbempByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxGraduateDbempDao.deleteJxGraduateDbempBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxGraduateDbemp+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_GRADUATE_DBEMP,研究生答辩参加人员表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxGraduateDbempDao.countJxGraduateDbempBySqlWhere(sqlWhere);
    }

    public void setJxGraduateDbempDao(IJxGraduateDbempDao jxGraduateDbempDao) {
        this.jxGraduateDbempDao = jxGraduateDbempDao;
    }

    public IJxGraduateDbempDao getJxGraduateDbempDao() {
        return jxGraduateDbempDao;
    }
}