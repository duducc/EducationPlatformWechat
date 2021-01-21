package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.dao.IJxStudentsDao;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDENTS
*表说明学员信息
  */
public class JxStudentsServiceImpl implements IJxStudentsService {
    private IJxStudentsDao jxStudentsDao;
    
    
    @Override
	public int selectJXStudentsSequence() {
	    return jxStudentsDao.selectJXStudentsSequence();
	}
    /**
    *方法注释信息
    *分页查询表JX_STUDENTS
    *表说明学员信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsEntity> selectListPageJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
            }
            if(sqlWhere.getSex()!=null && !sqlWhere.getSex().equals("")){
                criteria.andSexEqualTo(sqlWhere.getSex());
            }
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
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
            List<JxStudentsEntity> entitylist=jxStudentsDao.selectListPageJxStudentsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDENTS
     * 表说明学员信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsEntity> selectListJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameEqualTo(sqlWhere.getName());
            }
            if(sqlWhere.getIdcard()!=null && !sqlWhere.getIdcard().equals("")){
                criteria.andIdcardEqualTo(sqlWhere.getIdcard());
            }
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
            }
            if(sqlWhere.getRemark2()!=null && !sqlWhere.getRemark2().equals("")){
                criteria.andRemark2EqualTo(sqlWhere.getRemark2());
            }
            if(sqlWhere.getTelnumber()!=null && !sqlWhere.getTelnumber().equals("")){
                criteria.andTelnumberEqualTo(sqlWhere.getTelnumber());
            }
            if(sqlWhere.getPertype()!=null && !sqlWhere.getPertype().equals("")){
                criteria.andPertypeEqualTo(sqlWhere.getPertype());
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
            List<JxStudentsEntity> entitylist=jxStudentsDao.selectListJxStudentsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsDao.selectListJxStudentsBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsEntity selectJxStudentsByPrimaryKey(String xh) {
        try {
            JxStudentsEntity entity = jxStudentsDao.selectJxStudentsByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,插入信息
      */
    public ExcuteResult insertJxStudents(JxStudentsEntity entity) {
        try {
            return jxStudentsDao.insertJxStudents(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsSelective(JxStudentsEntity entity) {
        try {
            return jxStudentsDao.insertJxStudentsSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS,学员信息表,修改
      */
    public ExcuteResult updateJxStudentsByPrimaryKey(JxStudentsEntity entity) {
        try {
            return jxStudentsDao.updateJxStudentsByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsBySqlWhere(JxStudentsEntity entity, JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsDao.updateJxStudentsBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS,学员信息表,修改
      */
    public ExcuteResult updateJxStudentsBySqlWhereSelective(JxStudentsEntity entity, JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsDao.updateJxStudentsBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS,学员信息表,修改
      */
    public ExcuteResult updateJxStudentsByPrimaryKeySelective(JxStudentsEntity entity) {
        try {
            return jxStudentsDao.updateJxStudentsByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsByPrimaryKey(String xh) {
        try {
            return jxStudentsDao.deleteJxStudentsByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS,学员信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsDao.deleteJxStudentsBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS,学员信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudentsDao.countJxStudentsBySqlWhere(sqlWhere);
    }

    public void setJxStudentsDao(IJxStudentsDao jxStudentsDao) {
        this.jxStudentsDao = jxStudentsDao;
    }

    public IJxStudentsDao getJxStudentsDao() {
        return jxStudentsDao;
    }
}