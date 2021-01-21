package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxEvaluateTeacherEntity;
import com.saint.teaching.dao.IJxEvaluateTeacherDao;
import com.saint.teaching.services.IJxEvaluateTeacherService;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere.Criteria;

/**
*类注释信息
*表名JX_EVALUATE_TEACHER
*表说明教师评价表
  */
public class JxEvaluateTeacherServiceImpl implements IJxEvaluateTeacherService {
    private IJxEvaluateTeacherDao jxEvaluateTeacherDao;

    /**
    *方法注释信息
    *分页查询表JX_EVALUATE_TEACHER
    *表说明教师评价表
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxEvaluateTeacherEntity> selectListPageJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
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
            List<JxEvaluateTeacherEntity> entitylist=jxEvaluateTeacherDao.selectListPageJxEvaluateTeacherBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_EVALUATE_TEACHER
     * 表说明教师评价表
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxEvaluateTeacherEntity> selectListJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getDepid()!=null && !sqlWhere.getDepid().equals("")){
                criteria.andDepidEqualTo(sqlWhere.getDepid());
            }
            if(sqlWhere.getStudentid()!=null && !sqlWhere.getStudentid().equals("")){
                criteria.andStudentidEqualTo(sqlWhere.getStudentid());
            }
            if(sqlWhere.getTeacherid()!=null && !sqlWhere.getTeacherid().equals("")){
                criteria.andTeacheridEqualTo(sqlWhere.getTeacherid());
            }
            if(sqlWhere.getRemark1()!=null && !sqlWhere.getRemark1().equals("")){
                criteria.andRemark1EqualTo(sqlWhere.getRemark1());
            }
            if(sqlWhere.getRemark2()!=null && !sqlWhere.getRemark2().equals("")){
                criteria.andRemark2EqualTo(sqlWhere.getRemark2());
            }
            if(sqlWhere.getStudentname()!=null && !sqlWhere.getStudentname().equals("")){
                criteria.andStudentnameLike("%"+sqlWhere.getStudentname()+"%");
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
            List<JxEvaluateTeacherEntity> entitylist=jxEvaluateTeacherDao.selectListJxEvaluateTeacherBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxEvaluateTeacherBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxEvaluateTeacherDao.selectListJxEvaluateTeacherBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxEvaluateTeacherEntity selectJxEvaluateTeacherByPrimaryKey(String xh) {
        try {
            JxEvaluateTeacherEntity entity = jxEvaluateTeacherDao.selectJxEvaluateTeacherByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,插入信息
      */
    public ExcuteResult insertJxEvaluateTeacher(JxEvaluateTeacherEntity entity) {
        try {
            return jxEvaluateTeacherDao.insertJxEvaluateTeacher(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxEvaluateTeacherSelective(JxEvaluateTeacherEntity entity) {
        try {
            return jxEvaluateTeacherDao.insertJxEvaluateTeacherSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_EVALUATE_TEACHER,教师评价表表,修改
      */
    public ExcuteResult updateJxEvaluateTeacherByPrimaryKey(JxEvaluateTeacherEntity entity) {
        try {
            return jxEvaluateTeacherDao.updateJxEvaluateTeacherByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherEntity entity, JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxEvaluateTeacherDao.updateJxEvaluateTeacherBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_EVALUATE_TEACHER,教师评价表表,修改
      */
    public ExcuteResult updateJxEvaluateTeacherBySqlWhereSelective(JxEvaluateTeacherEntity entity, JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxEvaluateTeacherDao.updateJxEvaluateTeacherBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_EVALUATE_TEACHER,教师评价表表,修改
      */
    public ExcuteResult updateJxEvaluateTeacherByPrimaryKeySelective(JxEvaluateTeacherEntity entity) {
        try {
            return jxEvaluateTeacherDao.updateJxEvaluateTeacherByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxEvaluateTeacherByPrimaryKey(String xh) {
        try {
            return jxEvaluateTeacherDao.deleteJxEvaluateTeacherByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_EVALUATE_TEACHER,教师评价表表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxEvaluateTeacherDao.deleteJxEvaluateTeacherBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxEvaluateTeacher+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_EVALUATE_TEACHER,教师评价表表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxEvaluateTeacherDao.countJxEvaluateTeacherBySqlWhere(sqlWhere);
    }

    public void setJxEvaluateTeacherDao(IJxEvaluateTeacherDao jxEvaluateTeacherDao) {
        this.jxEvaluateTeacherDao = jxEvaluateTeacherDao;
    }

    public IJxEvaluateTeacherDao getJxEvaluateTeacherDao() {
        return jxEvaluateTeacherDao;
    }
}