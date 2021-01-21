package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsSignEntity;
import com.saint.teaching.dao.IJxStudentsSignDao;
import com.saint.teaching.services.IJxStudentsSignService;
import com.saint.teaching.sqlWhere.JxStudentsSignSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSignSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDENTS_SIGN
*表说明 学生签到信息
  */
public class JxStudentsSignServiceImpl implements IJxStudentsSignService {
    private IJxStudentsSignDao jxStudentsSignDao;

    /**
    *方法注释信息
    *分页查询表JX_STUDENTS_SIGN
    *表说明 学生签到信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsSignEntity> selectListPageJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
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
            List<JxStudentsSignEntity> entitylist=jxStudentsSignDao.selectListPageJxStudentsSignBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDENTS_SIGN
     * 表说明 学生签到信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsSignEntity> selectListJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getSigncs()!=null && !sqlWhere.getSigncs().equals("")){
                criteria.andSigncsEqualTo(sqlWhere.getSigncs());
            }
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            if(sqlWhere.getSigndate()!=null && !sqlWhere.getSigndate().equals("")){
                criteria.andSigndateEqualTo(sqlWhere.getSigndate());
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
            List<JxStudentsSignEntity> entitylist=jxStudentsSignDao.selectListJxStudentsSignBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsSignBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsSignDao.selectListJxStudentsSignBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsSignEntity selectJxStudentsSignByPrimaryKey(String xh) {
        try {
            JxStudentsSignEntity entity = jxStudentsSignDao.selectJxStudentsSignByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,插入信息
      */
    public ExcuteResult insertJxStudentsSign(JxStudentsSignEntity entity) {
        try {
            return jxStudentsSignDao.insertJxStudentsSign(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsSignSelective(JxStudentsSignEntity entity) {
        try {
            return jxStudentsSignDao.insertJxStudentsSignSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_SIGN, 学生签到信息表,修改
      */
    public ExcuteResult updateJxStudentsSignByPrimaryKey(JxStudentsSignEntity entity) {
        try {
            return jxStudentsSignDao.updateJxStudentsSignByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsSignBySqlWhere(JxStudentsSignEntity entity, JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsSignDao.updateJxStudentsSignBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_SIGN, 学生签到信息表,修改
      */
    public ExcuteResult updateJxStudentsSignBySqlWhereSelective(JxStudentsSignEntity entity, JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsSignDao.updateJxStudentsSignBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_SIGN, 学生签到信息表,修改
      */
    public ExcuteResult updateJxStudentsSignByPrimaryKeySelective(JxStudentsSignEntity entity) {
        try {
            return jxStudentsSignDao.updateJxStudentsSignByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsSignByPrimaryKey(String xh) {
        try {
            return jxStudentsSignDao.deleteJxStudentsSignByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_SIGN, 学生签到信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsSignDao.deleteJxStudentsSignBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsSign+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_SIGN, 学生签到信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudentsSignDao.countJxStudentsSignBySqlWhere(sqlWhere);
    }

    public void setJxStudentsSignDao(IJxStudentsSignDao jxStudentsSignDao) {
        this.jxStudentsSignDao = jxStudentsSignDao;
    }

    public IJxStudentsSignDao getJxStudentsSignDao() {
        return jxStudentsSignDao;
    }
}