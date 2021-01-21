package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsGradeEntity;
import com.saint.teaching.dao.IJxStudentsGradeDao;
import com.saint.teaching.services.IJxStudentsGradeService;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDENTS_GRADE
*表说明学员分数明细
  */
public class JxStudentsGradeServiceImpl implements IJxStudentsGradeService {
    private IJxStudentsGradeDao jxStudentsGradeDao;

    /**
    *方法注释信息
    *分页查询表JX_STUDENTS_GRADE
    *表说明学员分数明细
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsGradeEntity> selectListPageJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStudentname() != null && !"".equals(sqlWhere.getStudentname())){
            	criteria.andStudentnameLike("%"+sqlWhere.getStudentname()+"%");
            }
            if(sqlWhere.getEmplx() != null && !"".equals(sqlWhere.getEmplx())){
            	criteria.andEmplxEqualTo(sqlWhere.getEmplx());
            }
            if(sqlWhere.getSybj() != null && !"".equals(sqlWhere.getSybj())){
            	criteria.andSybjEqualTo(sqlWhere.getSybj());
            }
            if(sqlWhere.getStudentid() != null && !"".equals(sqlWhere.getStudentid())){
            	criteria.andStudentidEqualTo(sqlWhere.getStudentid());
            }
            if(sqlWhere.getRemark1() != null && !"".equals(sqlWhere.getRemark1())){
            	criteria.andRemark1EqualTo(sqlWhere.getRemark1());
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
            List<JxStudentsGradeEntity> entitylist=jxStudentsGradeDao.selectListPageJxStudentsGradeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDENTS_GRADE
     * 表说明学员分数明细
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsGradeEntity> selectListJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStudentid() != null && !"".equals(sqlWhere.getStudentid())){
            	criteria.andStudentidEqualTo(sqlWhere.getStudentid());
            }
            String jjfsj = sqlWhere.getJjfsj();
            System.out.println(jjfsj);
            String createdate = sqlWhere.getCreatedate();
            if(sqlWhere.getJjfsj() != null && !"".equals(sqlWhere.getJjfsj()) && sqlWhere.getCreatedate() != null && !"".equals(sqlWhere.getCreatedate())){
              	 SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//短日期
              	 try {
              		Date start = dateFormat.parse(sqlWhere.getJjfsj());
   					Date end = dateFormat.parse(sqlWhere.getCreatedate());
   					criteria.andJjfsjBetween(start, end);
   				} catch (ParseException e) {
   					e.printStackTrace();
   				}
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
            List<JxStudentsGradeEntity> entitylist=jxStudentsGradeDao.selectListJxStudentsGradeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsGradeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsGradeDao.selectListJxStudentsGradeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsGradeEntity selectJxStudentsGradeByPrimaryKey(String xh) {
        try {
            JxStudentsGradeEntity entity = jxStudentsGradeDao.selectJxStudentsGradeByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,插入信息
      */
    public ExcuteResult insertJxStudentsGrade(JxStudentsGradeEntity entity) {
        try {
            return jxStudentsGradeDao.insertJxStudentsGrade(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsGradeSelective(JxStudentsGradeEntity entity) {
        try {
            return jxStudentsGradeDao.insertJxStudentsGradeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_GRADE,学员分数明细表,修改
      */
    public ExcuteResult updateJxStudentsGradeByPrimaryKey(JxStudentsGradeEntity entity) {
        try {
            return jxStudentsGradeDao.updateJxStudentsGradeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsGradeBySqlWhere(JxStudentsGradeEntity entity, JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsGradeDao.updateJxStudentsGradeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_GRADE,学员分数明细表,修改
      */
    public ExcuteResult updateJxStudentsGradeBySqlWhereSelective(JxStudentsGradeEntity entity, JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsGradeDao.updateJxStudentsGradeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_GRADE,学员分数明细表,修改
      */
    public ExcuteResult updateJxStudentsGradeByPrimaryKeySelective(JxStudentsGradeEntity entity) {
        try {
            return jxStudentsGradeDao.updateJxStudentsGradeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsGradeByPrimaryKey(String xh) {
        try {
            return jxStudentsGradeDao.deleteJxStudentsGradeByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_GRADE,学员分数明细表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsGradeDao.deleteJxStudentsGradeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsGrade+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_GRADE,学员分数明细表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudentsGradeDao.countJxStudentsGradeBySqlWhere(sqlWhere);
    }
   
	@Override
	public String queryNextIndex() {
		try {
	   		return jxStudentsGradeDao.queryNextIndex();
	    } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException("主键查询"+"失败："+e.getMessage());
	    }
	}
    
    public void setJxStudentsGradeDao(IJxStudentsGradeDao jxStudentsGradeDao) {
        this.jxStudentsGradeDao = jxStudentsGradeDao;
    }

    public IJxStudentsGradeDao getJxStudentsGradeDao() {
        return jxStudentsGradeDao;
    }


}