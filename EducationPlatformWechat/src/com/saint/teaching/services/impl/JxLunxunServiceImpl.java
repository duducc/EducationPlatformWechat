package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.dao.IJxLunxunDao;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere.Criteria;

/**
*类注释信息
*表名JX_LUNXUN
*表说明教学轮训
  */
public class JxLunxunServiceImpl implements IJxLunxunService {
    private IJxLunxunDao jxLunxunDao;

    /**
    *方法注释信息
    *分页查询表JX_LUNXUN
    *表说明教学轮训
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxLunxunEntity> selectListPageJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
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
            List<JxLunxunEntity> entitylist=jxLunxunDao.selectListPageJxLunxunBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_LUNXUN
     * 表说明教学轮训
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxLunxunEntity> selectListJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getZuid()!=null && !sqlWhere.getZuid().equals("")){
                criteria.andZuidEqualTo(sqlWhere.getZuid());
            }
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
            }
            if(sqlWhere.getOperatedate()!=null && !sqlWhere.getOperatedate().equals("")){
                String time = sqlWhere.getOperatedate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date nowdate = null;
				try {
					nowdate = sdf.parse(time);
				} catch (ParseException e) {
					e.printStackTrace();
				}
                criteria.andStartdateLessThan(nowdate);
                criteria.andEnddateGreaterThan(nowdate);
            }
            if(sqlWhere.getNum()!=null && !sqlWhere.getNum().equals("")){
                criteria.andNumLessThan(sqlWhere.getNum());
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
            List<JxLunxunEntity> entitylist=jxLunxunDao.selectListJxLunxunBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxLunxun+"失败："+e.getMessage());
        }
    }
    public List<JxLunxunEntity> selectListJxLunxunBySqlWhereandDate(JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getZuid()!=null && !sqlWhere.getZuid().equals("")){
                criteria.andZuidEqualTo(sqlWhere.getZuid());
            }
            Date nowdate = new Date() ;
            criteria.andStartdateLessThanOrEqualTo(nowdate);
            criteria.andEnddateGreaterThanOrEqualTo(nowdate);
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
            List<JxLunxunEntity> entitylist=jxLunxunDao.selectListJxLunxunBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxLunxun+"失败："+e.getMessage());
        }
    }
    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxLunxunBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxLunxunDao.selectListJxLunxunBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxLunxunEntity selectJxLunxunByPrimaryKey(String xh) {
        try {
            JxLunxunEntity entity = jxLunxunDao.selectJxLunxunByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,插入信息
      */
    public ExcuteResult insertJxLunxun(JxLunxunEntity entity) {
        try {
            return jxLunxunDao.insertJxLunxun(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxLunxunSelective(JxLunxunEntity entity) {
        try {
            return jxLunxunDao.insertJxLunxunSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_LUNXUN,教学轮训表,修改
      */
    public ExcuteResult updateJxLunxunByPrimaryKey(JxLunxunEntity entity) {
        try {
            return jxLunxunDao.updateJxLunxunByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxLunxunBySqlWhere(JxLunxunEntity entity, JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxLunxunDao.updateJxLunxunBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_LUNXUN,教学轮训表,修改
      */
    public ExcuteResult updateJxLunxunBySqlWhereSelective(JxLunxunEntity entity, JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxLunxunDao.updateJxLunxunBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_LUNXUN,教学轮训表,修改
      */
    public ExcuteResult updateJxLunxunByPrimaryKeySelective(JxLunxunEntity entity) {
        try {
            return jxLunxunDao.updateJxLunxunByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxLunxunByPrimaryKey(String xh) {
        try {
            return jxLunxunDao.deleteJxLunxunByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_LUNXUN,教学轮训表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxLunxunDao.deleteJxLunxunBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxLunxun+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_LUNXUN,教学轮训表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxLunxunDao.countJxLunxunBySqlWhere(sqlWhere);
    }

    public void setJxLunxunDao(IJxLunxunDao jxLunxunDao) {
        this.jxLunxunDao = jxLunxunDao;
    }

    public IJxLunxunDao getJxLunxunDao() {
        return jxLunxunDao;
    }
}