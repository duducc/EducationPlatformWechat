package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStencilEntity;
import com.saint.teaching.dao.IJxStencilDao;
import com.saint.teaching.services.IJxStencilService;
import com.saint.teaching.sqlWhere.JxStencilSqlWhere;
import com.saint.teaching.sqlWhere.JxStencilSqlWhere.Criteria;

/**
*类注释信息
*表名JX_STENCIL
*表说明评价模板
  */
public class JxStencilServiceImpl implements IJxStencilService {
    private IJxStencilDao jxStencilDao;

    /**
    *方法注释信息
    *分页查询表JX_STENCIL
    *表说明评价模板
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxStencilEntity> selectListPageJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
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
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
            }
        }
        try {
            List<JxStencilEntity> entitylist=jxStencilDao.selectListPageJxStencilBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStencil+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_STENCIL
     * 表说明评价模板
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStencilEntity> selectListJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getType()!=null && !sqlWhere.getType().equals("")){
                criteria.andTypeEqualTo(sqlWhere.getType());
            }
            if(sqlWhere.getIsusing()!=null && !sqlWhere.getIsusing().equals("")){
                criteria.andIsusingEqualTo(sqlWhere.getIsusing());
            }
            if(sqlWhere.getRemark4()!=null && !sqlWhere.getRemark4().equals("")){
                criteria.andRemark4EqualTo(sqlWhere.getRemark4());
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
            if(sqlWhere.getType()!=null && !sqlWhere.getType().equals("")){
                criteria.andTypeEqualTo(sqlWhere.getType());
            }
            if(sqlWhere.getIsusing()!=null && !sqlWhere.getIsusing().equals("")){
                criteria.andIsusingEqualTo(sqlWhere.getIsusing());
            }
        }
        try {
            List<JxStencilEntity> entitylist=jxStencilDao.selectListJxStencilBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStencil+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStencilBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStencilDao.selectListJxStencilBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStencil+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStencilEntity selectJxStencilByPrimaryKey(String xh) {
        try {
            JxStencilEntity entity = jxStencilDao.selectJxStencilByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,插入信息
      */
    public ExcuteResult insertJxStencil(JxStencilEntity entity) {
        try {
            return jxStencilDao.insertJxStencil(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStencilSelective(JxStencilEntity entity) {
        try {
            return jxStencilDao.insertJxStencilSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STENCIL,评价模板表,修改
      */
    public ExcuteResult updateJxStencilByPrimaryKey(JxStencilEntity entity) {
        try {
            return jxStencilDao.updateJxStencilByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStencilBySqlWhere(JxStencilEntity entity, JxStencilSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStencilDao.updateJxStencilBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STENCIL,评价模板表,修改
      */
    public ExcuteResult updateJxStencilBySqlWhereSelective(JxStencilEntity entity, JxStencilSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStencilDao.updateJxStencilBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STENCIL,评价模板表,修改
      */
    public ExcuteResult updateJxStencilByPrimaryKeySelective(JxStencilEntity entity) {
        try {
            return jxStencilDao.updateJxStencilByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStencilByPrimaryKey(String xh) {
        try {
            return jxStencilDao.deleteJxStencilByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_STENCIL,评价模板表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxStencilDao.deleteJxStencilBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStencil+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STENCIL,评价模板表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStencilBySqlWhere(JxStencilSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxStencilDao.countJxStencilBySqlWhere(sqlWhere);
    }

    public void setJxStencilDao(IJxStencilDao jxStencilDao) {
        this.jxStencilDao = jxStencilDao;
    }

    public IJxStencilDao getJxStencilDao() {
        return jxStencilDao;
    }
}