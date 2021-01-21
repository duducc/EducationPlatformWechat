package com.saint.wechat.manager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfEmpRegisterEntity;
import com.saint.wechat.manager.dao.IXfEmpRegisterDao;
import com.saint.wechat.manager.services.IXfEmpRegisterService;
import com.saint.wechat.manager.sqlWhere.XfEmpRegisterSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmpRegisterSqlWhere.Criteria;

/**
*类注释信息
*表名XF_EMP_REGISTER
*表说明员工信息申请表
  */
public class XfEmpRegisterServiceImpl implements IXfEmpRegisterService {
    private IXfEmpRegisterDao xfEmpRegisterDao;

    /**
    *方法注释信息
    *分页查询表XF_EMP_REGISTER
    *表说明员工信息申请表
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<XfEmpRegisterEntity> selectListPageXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
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
            List<XfEmpRegisterEntity> entitylist=xfEmpRegisterDao.selectListPageXfEmpRegisterBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表XF_EMP_REGISTER
     * 表说明员工信息申请表
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<XfEmpRegisterEntity> selectListXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
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
            List<XfEmpRegisterEntity> entitylist=xfEmpRegisterDao.selectListXfEmpRegisterBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfEmpRegisterBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfEmpRegisterDao.selectListXfEmpRegisterBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public XfEmpRegisterEntity selectXfEmpRegisterByPrimaryKey(String usernumber) {
        try {
            XfEmpRegisterEntity entity = xfEmpRegisterDao.selectXfEmpRegisterByPrimaryKey(usernumber);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,插入信息
      */
    public ExcuteResult insertXfEmpRegister(XfEmpRegisterEntity entity) {
        try {
            return xfEmpRegisterDao.insertXfEmpRegister(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfEmpRegisterSelective(XfEmpRegisterEntity entity) {
        try {
            return xfEmpRegisterDao.insertXfEmpRegisterSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*XF_EMP_REGISTER,员工信息申请表表,修改
      */
    public ExcuteResult updateXfEmpRegisterByPrimaryKey(XfEmpRegisterEntity entity) {
        try {
            return xfEmpRegisterDao.updateXfEmpRegisterByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateXfEmpRegisterBySqlWhere(XfEmpRegisterEntity entity, XfEmpRegisterSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfEmpRegisterDao.updateXfEmpRegisterBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*XF_EMP_REGISTER,员工信息申请表表,修改
      */
    public ExcuteResult updateXfEmpRegisterBySqlWhereSelective(XfEmpRegisterEntity entity, XfEmpRegisterSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfEmpRegisterDao.updateXfEmpRegisterBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*XF_EMP_REGISTER,员工信息申请表表,修改
      */
    public ExcuteResult updateXfEmpRegisterByPrimaryKeySelective(XfEmpRegisterEntity entity) {
        try {
            return xfEmpRegisterDao.updateXfEmpRegisterByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteXfEmpRegisterByPrimaryKey(String usernumber) {
        try {
            return xfEmpRegisterDao.deleteXfEmpRegisterByPrimaryKey(usernumber);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfEmpRegisterDao.deleteXfEmpRegisterBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfEmpRegister+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*XF_EMP_REGISTER,员工信息申请表表
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)xfEmpRegisterDao.countXfEmpRegisterBySqlWhere(sqlWhere);
    }

    public void setXfEmpRegisterDao(IXfEmpRegisterDao xfEmpRegisterDao) {
        this.xfEmpRegisterDao = xfEmpRegisterDao;
    }

    public IXfEmpRegisterDao getXfEmpRegisterDao() {
        return xfEmpRegisterDao;
    }
}