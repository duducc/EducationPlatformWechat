package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.dao.IJxClassDao;
import com.saint.teaching.services.IJxClassService;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;
import com.saint.teaching.sqlWhere.JxClassSqlWhere.Criteria;

/**
*类注释信息
*表名JX_CLASS
*表说明教学班级
  */
public class JxClassServiceImpl implements IJxClassService {
    private IJxClassDao jxClassDao;
    @Override
	public int selectJxClassSequence() {
	    return jxClassDao.selectJxClassSequence();
	}
    /**
    *方法注释信息
    *分页查询表JX_CLASS
    *表说明教学班级
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxClassEntity> selectListPageJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
            }
            if(sqlWhere.getGrade()!=null && !sqlWhere.getGrade().equals("")){
                criteria.andGradeEqualTo(sqlWhere.getGrade());
            }
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
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
            List<JxClassEntity> entitylist=jxClassDao.selectListPageJxClassBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
     * 查询表JX_CLASS
     * 表说明教学班级
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxClassEntity> selectListJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
            }
            if(sqlWhere.getGrade()!=null && !sqlWhere.getGrade().equals("")){
                criteria.andGradeEqualTo(sqlWhere.getGrade());
            }
            if(sqlWhere.getProfesstypeid()!=null && !sqlWhere.getProfesstypeid().equals("")){
                criteria.andProfesstypeidEqualTo(sqlWhere.getProfesstypeid());
            }
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameEqualTo(sqlWhere.getName());
            }
            if(sqlWhere.getType()!=null && !sqlWhere.getType().equals("")){
                criteria.andTypeEqualTo(sqlWhere.getType());
            }
            if(sqlWhere.getBanji()!=null && !sqlWhere.getBanji().equals("")){
                criteria.andBanjiEqualTo(sqlWhere.getBanji());
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
            List<JxClassEntity> entitylist=jxClassDao.selectListJxClassBySqlWhere(sqlWhere);
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
    public List<HashMap<String,Object>> selectListJxClassBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxClassDao.selectListJxClassBySql(sql);
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
    public JxClassEntity selectJxClassByPrimaryKey(String xh) {
        try {
            JxClassEntity entity = jxClassDao.selectJxClassByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,插入信息
      */
    public ExcuteResult insertJxClass(JxClassEntity entity) {
        try {
            return jxClassDao.insertJxClass(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxClassSelective(JxClassEntity entity) {
        try {
            return jxClassDao.insertJxClassSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_CLASS,教学班级表,修改
      */
    public ExcuteResult updateJxClassByPrimaryKey(JxClassEntity entity) {
        try {
            return jxClassDao.updateJxClassByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxClassBySqlWhere(JxClassEntity entity, JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxClassDao.updateJxClassBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_CLASS,教学班级表,修改
      */
    public ExcuteResult updateJxClassBySqlWhereSelective(JxClassEntity entity, JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxClassDao.updateJxClassBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_CLASS,教学班级表,修改
      */
    public ExcuteResult updateJxClassByPrimaryKeySelective(JxClassEntity entity) {
        try {
            return jxClassDao.updateJxClassByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxClassByPrimaryKey(String xh) {
        try {
            return jxClassDao.deleteJxClassByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_CLASS,教学班级表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxClassDao.deleteJxClassBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_CLASS,教学班级表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxClassDao.countJxClassBySqlWhere(sqlWhere);
    }

    public void setJxClassDao(IJxClassDao jxClassDao) {
        this.jxClassDao = jxClassDao;
    }

    public IJxClassDao getJxClassDao() {
        return jxClassDao;
    }
}