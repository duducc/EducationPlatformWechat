package com.saint.teaching.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.dao.IJxCourseArrangeDao;
import com.saint.teaching.services.IJxCourseArrangeService;
import com.saint.teaching.sqlWhere.JxCourseArrangeSqlWhere;
import com.saint.teaching.sqlWhere.JxCourseArrangeSqlWhere.Criteria;

/**
*类注释信息
*表名JX_COURSEARRANGE
*表说明理论课课程安排
  */
public class JxCourseArrangeServiceImpl implements IJxCourseArrangeService {
    private IJxCourseArrangeDao jxCourseArrangeDao;

    /**
    *方法注释信息
    *分页查询表JX_COURSEARRANGE
    *表说明理论课课程安排
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxCourseArrangeEntity> selectListPageJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
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
            List<JxCourseArrangeEntity> entitylist=jxCourseArrangeDao.selectListPageJxCourseArrangeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_COURSEARRANGE
     * 表说明理论课课程安排
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxCourseArrangeEntity> selectListJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getRkjshid() != null && !"".equals(sqlWhere.getRkjshid())){
            	criteria.andRkjshidEqualTo(sqlWhere.getRkjshid());
            }
            if(sqlWhere.getShkzhci() != null && !"".equals(sqlWhere.getShkzhci())){
            	criteria.andShkzhciEqualTo(sqlWhere.getShkzhci());
            }
            if(sqlWhere.getSkjshu() != null && !"".equals(sqlWhere.getSkjshu())){
            	criteria.andSkjshuEqualTo(sqlWhere.getSkjshu());
            }
            if(sqlWhere.getShkxqi() != null && !"".equals(sqlWhere.getShkxqi())){
            	criteria.andShkxqiEqualTo(sqlWhere.getShkxqi());
            }
            if(sqlWhere.getCoursename()!=null && !sqlWhere.getCoursename().equals("")){
                criteria.andCoursenameLike("%"+sqlWhere.getCoursename()+"%");
            }
            if(sqlWhere.getCoursenum()!=null && !sqlWhere.getCoursenum().equals("")){
                criteria.andCoursenumEqualTo(sqlWhere.getCoursenum());
            }
            if(sqlWhere.getSkdate() != null && !"".equals(sqlWhere.getSkdate())){
            	 Date skdate = null;
            	 SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//短日期
            	 try {
                     skdate = dateFormat.parse(sqlWhere.getSkdate());
                 } catch (Exception e) {
                	 skdate =new Date();
                 }
                 criteria.andSkdateEqualTo(skdate);
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
            List<JxCourseArrangeEntity> entitylist=jxCourseArrangeDao.selectListJxCourseArrangeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCourseArrangeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxCourseArrangeDao.selectListJxCourseArrangeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxCourseArrangeEntity selectJxCourseArrangeByPrimaryKey(String xh) {
        try {
            JxCourseArrangeEntity entity = jxCourseArrangeDao.selectJxCourseArrangeByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,插入信息
      */
    public ExcuteResult insertJxCourseArrange(JxCourseArrangeEntity entity) {
        try {
            return jxCourseArrangeDao.insertJxCourseArrange(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCourseArrangeSelective(JxCourseArrangeEntity entity) {
        try {
            return jxCourseArrangeDao.insertJxCourseArrangeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_COURSEARRANGE,理论课课程安排表,修改
      */
    public ExcuteResult updateJxCourseArrangeByPrimaryKey(JxCourseArrangeEntity entity) {
        try {
            return jxCourseArrangeDao.updateJxCourseArrangeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxCourseArrangeBySqlWhere(JxCourseArrangeEntity entity, JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCourseArrangeDao.updateJxCourseArrangeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_COURSEARRANGE,理论课课程安排表,修改
      */
    public ExcuteResult updateJxCourseArrangeBySqlWhereSelective(JxCourseArrangeEntity entity, JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCourseArrangeDao.updateJxCourseArrangeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_COURSEARRANGE,理论课课程安排表,修改
      */
    public ExcuteResult updateJxCourseArrangeByPrimaryKeySelective(JxCourseArrangeEntity entity) {
        try {
            return jxCourseArrangeDao.updateJxCourseArrangeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxCourseArrangeByPrimaryKey(String xh) {
        try {
            return jxCourseArrangeDao.deleteJxCourseArrangeByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_COURSEARRANGE,理论课课程安排表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxCourseArrangeDao.deleteJxCourseArrangeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCourseArrange+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_COURSEARRANGE,理论课课程安排表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxCourseArrangeDao.countJxCourseArrangeBySqlWhere(sqlWhere);
    }

    public void setJxCourseArrangeDao(IJxCourseArrangeDao jxCourseArrangeDao) {
        this.jxCourseArrangeDao = jxCourseArrangeDao;
    }

    public IJxCourseArrangeDao getJxCourseArrangeDao() {
        return jxCourseArrangeDao;
    }
}