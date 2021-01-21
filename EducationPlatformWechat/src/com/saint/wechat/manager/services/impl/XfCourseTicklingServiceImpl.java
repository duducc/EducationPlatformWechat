package com.saint.wechat.manager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseTicklingEntity;
import com.saint.wechat.manager.bean.XfCourseTicklingKey;
import com.saint.wechat.manager.dao.IXfCourseTicklingDao;
import com.saint.wechat.manager.services.IXfCourseTicklingService;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere.Criteria;

/**
*类注释信息
*表名XF_COURSE_TICKLING
*表说明课程信息学员反馈
  */
public class XfCourseTicklingServiceImpl implements IXfCourseTicklingService {
    private IXfCourseTicklingDao xfCourseTicklingDao;

    /**
    *方法注释信息
    *分页查询表XF_COURSE_TICKLING
    *表说明课程信息学员反馈
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<XfCourseTicklingEntity> selectListPageXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
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
            List<XfCourseTicklingEntity> entitylist=xfCourseTicklingDao.selectListPageXfCourseTicklingBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表XF_COURSE_TICKLING
     * 表说明课程信息学员反馈
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<XfCourseTicklingEntity> selectListXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
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
            List<XfCourseTicklingEntity> entitylist=xfCourseTicklingDao.selectListXfCourseTicklingBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfCourseTicklingBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfCourseTicklingDao.selectListXfCourseTicklingBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public XfCourseTicklingEntity selectXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key) {
        try {
            XfCourseTicklingEntity entity = xfCourseTicklingDao.selectXfCourseTicklingByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,插入信息
      */
    public ExcuteResult insertXfCourseTickling(XfCourseTicklingEntity entity) {
        try {
            return xfCourseTicklingDao.insertXfCourseTickling(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfCourseTicklingSelective(XfCourseTicklingEntity entity) {
        try {
            return xfCourseTicklingDao.insertXfCourseTicklingSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*XF_COURSE_TICKLING,课程信息学员反馈表,修改
      */
    public ExcuteResult updateXfCourseTicklingByPrimaryKey(XfCourseTicklingEntity entity) {
        try {
            return xfCourseTicklingDao.updateXfCourseTicklingByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateXfCourseTicklingBySqlWhere(XfCourseTicklingEntity entity, XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfCourseTicklingDao.updateXfCourseTicklingBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*XF_COURSE_TICKLING,课程信息学员反馈表,修改
      */
    public ExcuteResult updateXfCourseTicklingBySqlWhereSelective(XfCourseTicklingEntity entity, XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfCourseTicklingDao.updateXfCourseTicklingBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*XF_COURSE_TICKLING,课程信息学员反馈表,修改
      */
    public ExcuteResult updateXfCourseTicklingByPrimaryKeySelective(XfCourseTicklingEntity entity) {
        try {
            return xfCourseTicklingDao.updateXfCourseTicklingByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key) {
        try {
            return xfCourseTicklingDao.deleteXfCourseTicklingByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_COURSE_TICKLING,课程信息学员反馈表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfCourseTicklingDao.deleteXfCourseTicklingBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCourseTickling+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*XF_COURSE_TICKLING,课程信息学员反馈表
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)xfCourseTicklingDao.countXfCourseTicklingBySqlWhere(sqlWhere);
    }

    public void setXfCourseTicklingDao(IXfCourseTicklingDao xfCourseTicklingDao) {
        this.xfCourseTicklingDao = xfCourseTicklingDao;
    }

    public IXfCourseTicklingDao getXfCourseTicklingDao() {
        return xfCourseTicklingDao;
    }
}