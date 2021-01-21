package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.dao.IJxClassStudentsDao;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere.Criteria;

/**
*类注释信息
*表名JX_CLASS_STUDENTS
*表说明教学学生信息
  */
public class JxClassStudentsServiceImpl implements IJxClassStudentsService {
    private IJxClassStudentsDao jxClassStudentsDao;

    /**
    *方法注释信息
    *分页查询表JX_CLASS_STUDENTS
    *表说明教学学生信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxClassStudentsEntity> selectListPageJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
            }
            if(sqlWhere.getZuid()!=null && !sqlWhere.getZuid().equals("")){
                criteria.andZuidEqualTo(sqlWhere.getZuid());
            }
            if(sqlWhere.getStudentname()!=null && !sqlWhere.getStudentname().equals("")){
                criteria.andStudentnameLike("%"+sqlWhere.getStudentname()+"%");
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
            List<JxClassStudentsEntity> entitylist=jxClassStudentsDao.selectListPageJxClassStudentsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_CLASS_STUDENTS
     * 表说明教学学生信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxClassStudentsEntity> selectListJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStudentid()!=null && !sqlWhere.getStudentid().equals("")){
                criteria.andStudentidEqualTo(sqlWhere.getStudentid());
            }
            if(sqlWhere.getRemark2()!=null && !sqlWhere.getRemark2().equals("")){
                criteria.andRemark2EqualTo(sqlWhere.getRemark2());
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
            List<JxClassStudentsEntity> entitylist=jxClassStudentsDao.selectListJxClassStudentsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxClassStudentsBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxClassStudentsDao.selectListJxClassStudentsBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxClassStudentsEntity selectJxClassStudentsByPrimaryKey(String xh) {
        try {
            JxClassStudentsEntity entity = jxClassStudentsDao.selectJxClassStudentsByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,插入信息
      */
    public ExcuteResult insertJxClassStudents(JxClassStudentsEntity entity) {
        try {
            return jxClassStudentsDao.insertJxClassStudents(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxClassStudentsSelective(JxClassStudentsEntity entity) {
        try {
            return jxClassStudentsDao.insertJxClassStudentsSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_CLASS_STUDENTS,教学学生信息表,修改
      */
    public ExcuteResult updateJxClassStudentsByPrimaryKey(JxClassStudentsEntity entity) {
        try {
            return jxClassStudentsDao.updateJxClassStudentsByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxClassStudentsBySqlWhere(JxClassStudentsEntity entity, JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxClassStudentsDao.updateJxClassStudentsBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_CLASS_STUDENTS,教学学生信息表,修改
      */
    public ExcuteResult updateJxClassStudentsBySqlWhereSelective(JxClassStudentsEntity entity, JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxClassStudentsDao.updateJxClassStudentsBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_CLASS_STUDENTS,教学学生信息表,修改
      */
    public ExcuteResult updateJxClassStudentsByPrimaryKeySelective(JxClassStudentsEntity entity) {
        try {
            return jxClassStudentsDao.updateJxClassStudentsByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxClassStudentsByPrimaryKey(String xh) {
        try {
            return jxClassStudentsDao.deleteJxClassStudentsByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS_STUDENTS,教学学生信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxClassStudentsDao.deleteJxClassStudentsBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxClassStudents+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_CLASS_STUDENTS,教学学生信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxClassStudentsDao.countJxClassStudentsBySqlWhere(sqlWhere);
    }

    public void setJxClassStudentsDao(IJxClassStudentsDao jxClassStudentsDao) {
        this.jxClassStudentsDao = jxClassStudentsDao;
    }

    public IJxClassStudentsDao getJxClassStudentsDao() {
        return jxClassStudentsDao;
    }
}