package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingDblEntity;
import com.saint.teaching.dao.IJxTeachingDblDao;
import com.saint.teaching.services.IJxTeachingDblService;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere.Criteria;

/**
*类注释信息
*表名JX_TEACHING_DBL
*表说明大病历
  */
public class JxTeachingDblServiceImpl implements IJxTeachingDblService {
    private IJxTeachingDblDao jxTeachingDblDao;

    /**
    *方法注释信息
    *分页查询表JX_TEACHING_DBL
    *表说明大病历
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxTeachingDblEntity> selectListPageJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
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
            List<JxTeachingDblEntity> entitylist=jxTeachingDblDao.selectListPageJxTeachingDblBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_TEACHING_DBL
     * 表说明大病历
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingDblEntity> selectListJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
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
            List<JxTeachingDblEntity> entitylist=jxTeachingDblDao.selectListJxTeachingDblBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingDblBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxTeachingDblDao.selectListJxTeachingDblBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxTeachingDblEntity selectJxTeachingDblByPrimaryKey(String xh) {
        try {
            JxTeachingDblEntity entity = jxTeachingDblDao.selectJxTeachingDblByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,插入信息
      */
    public ExcuteResult insertJxTeachingDbl(JxTeachingDblEntity entity) {
        try {
            return jxTeachingDblDao.insertJxTeachingDbl(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingDblSelective(JxTeachingDblEntity entity) {
        try {
            return jxTeachingDblDao.insertJxTeachingDblSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_TEACHING_DBL,大病历表,修改
      */
    public ExcuteResult updateJxTeachingDblByPrimaryKey(JxTeachingDblEntity entity) {
        try {
            return jxTeachingDblDao.updateJxTeachingDblByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxTeachingDblBySqlWhere(JxTeachingDblEntity entity, JxTeachingDblSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingDblDao.updateJxTeachingDblBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_TEACHING_DBL,大病历表,修改
      */
    public ExcuteResult updateJxTeachingDblBySqlWhereSelective(JxTeachingDblEntity entity, JxTeachingDblSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingDblDao.updateJxTeachingDblBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_TEACHING_DBL,大病历表,修改
      */
    public ExcuteResult updateJxTeachingDblByPrimaryKeySelective(JxTeachingDblEntity entity) {
        try {
            return jxTeachingDblDao.updateJxTeachingDblByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingDblByPrimaryKey(String xh) {
        try {
            return jxTeachingDblDao.deleteJxTeachingDblByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_DBL,大病历表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingDblDao.deleteJxTeachingDblBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingDbl+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_TEACHING_DBL,大病历表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuId()!=null && !sqlWhere.getStuId().equals("")){
                criteria.andStuIdEqualTo(sqlWhere.getStuId());
            }
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
            }
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxTeachingDblDao.countJxTeachingDblBySqlWhere(sqlWhere);
    }

    public void setJxTeachingDblDao(IJxTeachingDblDao jxTeachingDblDao) {
        this.jxTeachingDblDao = jxTeachingDblDao;
    }

    public IJxTeachingDblDao getJxTeachingDblDao() {
        return jxTeachingDblDao;
    }
}