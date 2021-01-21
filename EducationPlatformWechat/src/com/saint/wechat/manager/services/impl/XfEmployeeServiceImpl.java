package com.saint.wechat.manager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.dao.IXfEmployeeDao;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere.Criteria;

/**
*类注释信息
*表名XF_EMPLOYEE
*表说明人员信息
  */
public class XfEmployeeServiceImpl implements IXfEmployeeService {
    private IXfEmployeeDao xfEmployeeDao;
    @Override
	public int selectJxschoolmanager() {
	    return xfEmployeeDao.selectJxschoolmanager();
	}
    /**
    *方法注释信息
    *分页查询表XF_EMPLOYEE
    *表说明人员信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<XfEmployeeEntity> selectListPageXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsername()!=null && !sqlWhere.getUsername().equals("")){
                criteria.andUsernameLike("%"+sqlWhere.getUsername()+"%");
            }
            if(sqlWhere.getDepart()!=null && !sqlWhere.getDepart().equals("")){
                criteria.andDepartEqualTo(sqlWhere.getDepart());
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
            List<XfEmployeeEntity> entitylist=xfEmployeeDao.selectListPageXfEmployeeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表XF_EMPLOYEE
     * 表说明人员信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<XfEmployeeEntity> selectListXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsernumber()!=null && !sqlWhere.getUsernumber().equals("")){
                criteria.andUsernumberEqualTo(sqlWhere.getUsernumber());
            }
            if(sqlWhere.getIdcard()!=null && !sqlWhere.getIdcard().equals("")){
                criteria.andIdcardEqualTo(sqlWhere.getIdcard());
            }
            if(sqlWhere.getUsername()!=null && !sqlWhere.getUsername().equals("")){
                criteria.andUsernameLike("%"+sqlWhere.getUsername()+"%");
            }
            if(sqlWhere.getYiyuan()!=null && !sqlWhere.getYiyuan().equals("")){
                criteria.andYiyuanEqualTo(sqlWhere.getYiyuan());
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
            List<XfEmployeeEntity> entitylist=xfEmployeeDao.selectListXfEmployeeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfEmployeeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfEmployeeDao.selectListXfEmployeeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public XfEmployeeEntity selectXfEmployeeByPrimaryKey(String usernumber) {
        try {
            XfEmployeeEntity entity = xfEmployeeDao.selectXfEmployeeByPrimaryKey(usernumber);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,插入信息
      */
    public ExcuteResult insertXfEmployee(XfEmployeeEntity entity) {
        try {
            return xfEmployeeDao.insertXfEmployee(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfEmployeeSelective(XfEmployeeEntity entity) {
        try {
            return xfEmployeeDao.insertXfEmployeeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*XF_EMPLOYEE,人员信息表,修改
      */
    public ExcuteResult updateXfEmployeeByPrimaryKey(XfEmployeeEntity entity) {
        try {
            return xfEmployeeDao.updateXfEmployeeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateXfEmployeeBySqlWhere(XfEmployeeEntity entity, XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfEmployeeDao.updateXfEmployeeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*XF_EMPLOYEE,人员信息表,修改
      */
    public ExcuteResult updateXfEmployeeBySqlWhereSelective(XfEmployeeEntity entity, XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfEmployeeDao.updateXfEmployeeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*XF_EMPLOYEE,人员信息表,修改
      */
    public ExcuteResult updateXfEmployeeByPrimaryKeySelective(XfEmployeeEntity entity) {
        try {
            return xfEmployeeDao.updateXfEmployeeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteXfEmployeeByPrimaryKey(String usernumber) {
        try {
            return xfEmployeeDao.deleteXfEmployeeByPrimaryKey(usernumber);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return xfEmployeeDao.deleteXfEmployeeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfEmployee+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*XF_EMPLOYEE,人员信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsernumber()!=null && !sqlWhere.getUsernumber().equals("")){
                criteria.andUsernumberEqualTo(sqlWhere.getUsernumber());
            }
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)xfEmployeeDao.countXfEmployeeBySqlWhere(sqlWhere);
    }

    public void setXfEmployeeDao(IXfEmployeeDao xfEmployeeDao) {
        this.xfEmployeeDao = xfEmployeeDao;
    }

    public IXfEmployeeDao getXfEmployeeDao() {
        return xfEmployeeDao;
    }
}