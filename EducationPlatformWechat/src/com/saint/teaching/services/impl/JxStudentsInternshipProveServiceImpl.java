package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveKey;
import com.saint.teaching.dao.IJxStudentsInternshipProveDao;
import com.saint.teaching.services.IJxStudentsInternshipProveService;
import com.saint.teaching.sqlWhere.JxStudentsInternshipProveSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsInternshipProveSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STUDENTS_INTERNSHIP_PROVE
*表说明实习证明
  */
public class JxStudentsInternshipProveServiceImpl implements IJxStudentsInternshipProveService {
    private IJxStudentsInternshipProveDao jxStudentsInternshipProveDao;

    /**
    *方法注释信息
    *分页查询表JX_STUDENTS_INTERNSHIP_PROVE
    *表说明实习证明
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsInternshipProveEntity> selectListPageJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
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
            List<JxStudentsInternshipProveEntity> entitylist=jxStudentsInternshipProveDao.selectListPageJxStudentsInternshipProveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STUDENTS_INTERNSHIP_PROVE
     * 表说明实习证明
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsInternshipProveEntity> selectListJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStudentsid() != null && !"".equals(sqlWhere.getStudentsid())){
            	criteria.andStudentsidEqualTo(sqlWhere.getStudentsid());
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
            List<JxStudentsInternshipProveEntity> entitylist=jxStudentsInternshipProveDao.selectListJxStudentsInternshipProveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsInternshipProveBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsInternshipProveDao.selectListJxStudentsInternshipProveBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudentsInternshipProveEntity selectJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key) {
        try {
            JxStudentsInternshipProveEntity entity = jxStudentsInternshipProveDao.selectJxStudentsInternshipProveByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,插入信息
      */
    public ExcuteResult insertJxStudentsInternshipProve(JxStudentsInternshipProveEntity entity) {
        try {
            return jxStudentsInternshipProveDao.insertJxStudentsInternshipProve(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsInternshipProveSelective(JxStudentsInternshipProveEntity entity) {
        try {
            return jxStudentsInternshipProveDao.insertJxStudentsInternshipProveSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,修改
      */
    public ExcuteResult updateJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveEntity entity) {
        try {
            return jxStudentsInternshipProveDao.updateJxStudentsInternshipProveByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveEntity entity, JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsInternshipProveDao.updateJxStudentsInternshipProveBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,修改
      */
    public ExcuteResult updateJxStudentsInternshipProveBySqlWhereSelective(JxStudentsInternshipProveEntity entity, JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsInternshipProveDao.updateJxStudentsInternshipProveBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,修改
      */
    public ExcuteResult updateJxStudentsInternshipProveByPrimaryKeySelective(JxStudentsInternshipProveEntity entity) {
        try {
            return jxStudentsInternshipProveDao.updateJxStudentsInternshipProveByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key) {
        try {
            return jxStudentsInternshipProveDao.deleteJxStudentsInternshipProveByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStudentsInternshipProveDao.deleteJxStudentsInternshipProveBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsInternshipProve+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDENTS_INTERNSHIP_PROVE,实习证明表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStudentsInternshipProveDao.countJxStudentsInternshipProveBySqlWhere(sqlWhere);
    }

    public void setJxStudentsInternshipProveDao(IJxStudentsInternshipProveDao jxStudentsInternshipProveDao) {
        this.jxStudentsInternshipProveDao = jxStudentsInternshipProveDao;
    }

    public IJxStudentsInternshipProveDao getJxStudentsInternshipProveDao() {
        return jxStudentsInternshipProveDao;
    }
}