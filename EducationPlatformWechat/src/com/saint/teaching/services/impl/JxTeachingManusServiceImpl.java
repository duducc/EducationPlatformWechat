package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.dao.IJxTeachingManusDao;
import com.saint.teaching.services.IJxTeachingManusService;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere.Criteria;

/**
*类注释信息
*表名JX_TEACHING_MANUS
*表说明带教手册类别
  */
public class JxTeachingManusServiceImpl implements IJxTeachingManusService {
    private IJxTeachingManusDao jxTeachingManusDao;

    /**
    *方法注释信息
    *分页查询表JX_TEACHING_MANUS
    *表说明带教手册类别
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxTeachingManusEntity> selectListPageJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
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
            List<JxTeachingManusEntity> entitylist=jxTeachingManusDao.selectListPageJxTeachingManusBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_TEACHING_MANUS
     * 表说明带教手册类别
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingManusEntity> selectListJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getManuDm()!=null && !sqlWhere.getManuDm().equals("")){
                criteria.andManuDmEqualTo(sqlWhere.getManuDm());
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
            List<JxTeachingManusEntity> entitylist=jxTeachingManusDao.selectListJxTeachingManusBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingManusBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxTeachingManusDao.selectListJxTeachingManusBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxTeachingManusEntity selectJxTeachingManusByPrimaryKey(String manuId) {
        try {
            JxTeachingManusEntity entity = jxTeachingManusDao.selectJxTeachingManusByPrimaryKey(manuId);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,插入信息
      */
    public ExcuteResult insertJxTeachingManus(JxTeachingManusEntity entity) {
        try {
            return jxTeachingManusDao.insertJxTeachingManus(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingManusSelective(JxTeachingManusEntity entity) {
        try {
            return jxTeachingManusDao.insertJxTeachingManusSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_TEACHING_MANUS,带教手册类别表,修改
      */
    public ExcuteResult updateJxTeachingManusByPrimaryKey(JxTeachingManusEntity entity) {
        try {
            return jxTeachingManusDao.updateJxTeachingManusByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxTeachingManusBySqlWhere(JxTeachingManusEntity entity, JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingManusDao.updateJxTeachingManusBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_TEACHING_MANUS,带教手册类别表,修改
      */
    public ExcuteResult updateJxTeachingManusBySqlWhereSelective(JxTeachingManusEntity entity, JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingManusDao.updateJxTeachingManusBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_TEACHING_MANUS,带教手册类别表,修改
      */
    public ExcuteResult updateJxTeachingManusByPrimaryKeySelective(JxTeachingManusEntity entity) {
        try {
            return jxTeachingManusDao.updateJxTeachingManusByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManusByPrimaryKey(String manuId) {
        try {
            return jxTeachingManusDao.deleteJxTeachingManusByPrimaryKey(manuId);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUS,带教手册类别表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingManusDao.deleteJxTeachingManusBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingManus+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_TEACHING_MANUS,带教手册类别表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxTeachingManusDao.countJxTeachingManusBySqlWhere(sqlWhere);
    }

    public void setJxTeachingManusDao(IJxTeachingManusDao jxTeachingManusDao) {
        this.jxTeachingManusDao = jxTeachingManusDao;
    }

    public IJxTeachingManusDao getJxTeachingManusDao() {
        return jxTeachingManusDao;
    }
}