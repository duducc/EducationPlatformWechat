package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeacherEntity;
import com.saint.teaching.dao.IJxTeacherDao;
import com.saint.teaching.services.IJxTeacherService;
import com.saint.teaching.sqlWhere.JxTeacherSqlWhere;
import com.saint.teaching.sqlWhere.JxTeacherSqlWhere.Criteria;

/**
*类注释信息
*表名JX_TEACHER
*表说明教师信息
  */
public class JxTeacherServiceImpl implements IJxTeacherService {
    private IJxTeacherDao jxTeacherDao;

    /**
    *方法注释信息
    *分页查询表JX_TEACHER
    *表说明教师信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxTeacherEntity> selectListPageJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsernumber()!=null && !sqlWhere.getUsernumber().equals("")){
                criteria.andUsernumberEqualTo(sqlWhere.getUsernumber());
            }
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
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
            List<JxTeacherEntity> entitylist=jxTeacherDao.selectListPageJxTeacherBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_TEACHER
     * 表说明教师信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxTeacherEntity> selectListJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsernumber()!=null && !sqlWhere.getUsernumber().equals("")){
                criteria.andUsernumberEqualTo(sqlWhere.getUsernumber());
            }
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
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
            List<JxTeacherEntity> entitylist=jxTeacherDao.selectListJxTeacherBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeacherBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxTeacherDao.selectListJxTeacherBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxTeacherEntity selectJxTeacherByPrimaryKey(String usernumber) {
        try {
            JxTeacherEntity entity = jxTeacherDao.selectJxTeacherByPrimaryKey(usernumber);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,插入信息
      */
    public ExcuteResult insertJxTeacher(JxTeacherEntity entity) {
        try {
            return jxTeacherDao.insertJxTeacher(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeacherSelective(JxTeacherEntity entity) {
        try {
            return jxTeacherDao.insertJxTeacherSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_TEACHER,教师信息表,修改
      */
    public ExcuteResult updateJxTeacherByPrimaryKey(JxTeacherEntity entity) {
        try {
            return jxTeacherDao.updateJxTeacherByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxTeacherBySqlWhere(JxTeacherEntity entity, JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeacherDao.updateJxTeacherBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_TEACHER,教师信息表,修改
      */
    public ExcuteResult updateJxTeacherBySqlWhereSelective(JxTeacherEntity entity, JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeacherDao.updateJxTeacherBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_TEACHER,教师信息表,修改
      */
    public ExcuteResult updateJxTeacherByPrimaryKeySelective(JxTeacherEntity entity) {
        try {
            return jxTeacherDao.updateJxTeacherByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxTeacherByPrimaryKey(String usernumber) {
        try {
            return jxTeacherDao.deleteJxTeacherByPrimaryKey(usernumber);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHER,教师信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeacherDao.deleteJxTeacherBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_TEACHER,教师信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxTeacherDao.countJxTeacherBySqlWhere(sqlWhere);
    }

    public void setJxTeacherDao(IJxTeacherDao jxTeacherDao) {
        this.jxTeacherDao = jxTeacherDao;
    }

    public IJxTeacherDao getJxTeacherDao() {
        return jxTeacherDao;
    }
}