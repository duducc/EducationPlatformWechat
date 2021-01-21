package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingManualsEntity;
import com.saint.teaching.dao.IJxTeachingManualsDao;
import com.saint.teaching.services.IJxTeachingManualsService;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere.Criteria;

/**
*类注释信息
*表名JX_TEACHING_MANUALS
*表说明实习生带教手册记录
  */
public class JxTeachingManualsServiceImpl implements IJxTeachingManualsService {
    private IJxTeachingManualsDao jxTeachingManualsDao;

    /**
    *方法注释信息
    *分页查询表JX_TEACHING_MANUALS
    *表说明实习生带教手册记录
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxTeachingManualsEntity> selectListPageJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
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
            List<JxTeachingManualsEntity> entitylist=jxTeachingManualsDao.selectListPageJxTeachingManualsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_TEACHING_MANUALS
     * 表说明实习生带教手册记录
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingManualsEntity> selectListJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getTeacherName()!=null && !sqlWhere.getTeacherName().equals("")){
                criteria.andTeacherNameLike("%"+sqlWhere.getTeacherName()+"%");
            }
            if(sqlWhere.getStuId()!=null && !sqlWhere.getStuId().equals("")){
                criteria.andStuIdEqualTo(sqlWhere.getStuId());
            }
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
            }
            if(sqlWhere.getType()!=null && !sqlWhere.getType().equals("")){
                criteria.andTypeEqualTo(sqlWhere.getType());
            }
            if(sqlWhere.getOpemid()!=null && !sqlWhere.getOpemid().equals("")){
                criteria.andOpemidEqualTo(sqlWhere.getOpemid());
            }
            if(sqlWhere.getZttime()!=null && !sqlWhere.getZttime().equals("")){
	            String time = sqlWhere.getZttime();
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//yyyy-mm-dd, 会出现时间不对, 因为小写的mm是代表: 秒
	            Date utilDate = null;
				try {
					utilDate = sdf.parse(time);
				} catch (ParseException e) {
					e.printStackTrace();
				}
	            criteria.andZttimeGreaterThanOrEqualTo(utilDate);
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
            List<JxTeachingManualsEntity> entitylist=jxTeachingManualsDao.selectListJxTeachingManualsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingManualsBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxTeachingManualsDao.selectListJxTeachingManualsBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxTeachingManualsEntity selectJxTeachingManualsByPrimaryKey(String xh) {
        try {
            JxTeachingManualsEntity entity = jxTeachingManualsDao.selectJxTeachingManualsByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,插入信息
      */
    public ExcuteResult insertJxTeachingManuals(JxTeachingManualsEntity entity) {
        try {
            return jxTeachingManualsDao.insertJxTeachingManuals(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingManualsSelective(JxTeachingManualsEntity entity) {
        try {
            return jxTeachingManualsDao.insertJxTeachingManualsSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,修改
      */
    public ExcuteResult updateJxTeachingManualsByPrimaryKey(JxTeachingManualsEntity entity) {
        try {
            return jxTeachingManualsDao.updateJxTeachingManualsByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxTeachingManualsBySqlWhere(JxTeachingManualsEntity entity, JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingManualsDao.updateJxTeachingManualsBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,修改
      */
    public ExcuteResult updateJxTeachingManualsBySqlWhereSelective(JxTeachingManualsEntity entity, JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingManualsDao.updateJxTeachingManualsBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,修改
      */
    public ExcuteResult updateJxTeachingManualsByPrimaryKeySelective(JxTeachingManualsEntity entity) {
        try {
            return jxTeachingManualsDao.updateJxTeachingManualsByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManualsByPrimaryKey(String xh) {
        try {
            return jxTeachingManualsDao.deleteJxTeachingManualsByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_TEACHING_MANUALS,实习生带教手册记录表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxTeachingManualsDao.deleteJxTeachingManualsBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingManuals+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_TEACHING_MANUALS,实习生带教手册记录表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuId()!=null && !sqlWhere.getStuId().equals("")){
                criteria.andStuIdEqualTo(sqlWhere.getStuId());
            }
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
            }
            if(sqlWhere.getType()!=null && !sqlWhere.getType().equals("")){
                criteria.andTypeEqualTo(sqlWhere.getType());
            }
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxTeachingManualsDao.countJxTeachingManualsBySqlWhere(sqlWhere);
    }

    public void setJxTeachingManualsDao(IJxTeachingManualsDao jxTeachingManualsDao) {
        this.jxTeachingManualsDao = jxTeachingManualsDao;
    }

    public IJxTeachingManualsDao getJxTeachingManualsDao() {
        return jxTeachingManualsDao;
    }
}