package com.saint.systemManager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.dao.IFrmCodeDao;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere.Criteria;

/**
*类注释信息
*表名FRM_CODE
*表说明代码信息
  */
public class FrmCodeServiceImpl implements IFrmCodeService {
    private IFrmCodeDao frmCodeDao;

    /**
    *方法注释信息
    *分页查询表FRM_CODE
    *表说明代码信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<FrmCodeEntity> selectListPageFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
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
            List<FrmCodeEntity> entitylist=frmCodeDao.selectListPageFrmCodeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmCode+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表FRM_CODE
     * 表说明代码信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<FrmCodeEntity> selectListFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getDmjc()!=null && !sqlWhere.getDmjc().equals("")){
    			criteria.andDmjcEqualTo(sqlWhere.getDmjc());
    		}
            if(sqlWhere.getXtlb()!=null && !sqlWhere.getXtlb().equals("")){
    			criteria.andXtlbEqualTo(sqlWhere.getXtlb());
    		}
            if(sqlWhere.getDmlb()!=null && !sqlWhere.getDmlb().equals("")){
    			criteria.andDmlbEqualTo(sqlWhere.getDmlb());
    		}
    		if(sqlWhere.getDmz()!=null && !sqlWhere.getDmz().equals("")){
    			criteria.andDmzGreaterThanOrEqualTo(sqlWhere.getDmz());
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
            List<FrmCodeEntity> entitylist=frmCodeDao.selectListFrmCodeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmCode+"失败："+e.getMessage());
        }
    }

    public List<FrmCodeEntity> selectListFrmCodeBySqlWhereJB(FrmCodeSqlWhere sqlWhere) {
    	if(sqlWhere !=null){
    		Criteria criteria=sqlWhere.createCriteria();
    		if(sqlWhere.getDmjc()!=null && !sqlWhere.getDmjc().equals("")){
    			criteria.andDmjcEqualTo(sqlWhere.getDmjc());
    		}
    		
    		if(sqlWhere.getDmz()!=null && !sqlWhere.getDmz().equals("")){
    			criteria.andDmzGreaterThanOrEqualTo(sqlWhere.getDmz());
    		}

    		/**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            如果有日期格式，需要做格式转换
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");短日期
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
    	sqlWhere.setOrderByClause("sxh");
    	try {
    		return frmCodeDao.selectListFrmCodeBySqlWhere(sqlWhere);
    	} catch (ExcuteException e) {
    		e.printStackTrace();
    		throw new ExcuteException(FrmGnid.selectListPageFrmCode+"失败："+e.getMessage());
    	}
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListFrmCodeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=frmCodeDao.selectListFrmCodeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmCode+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public FrmCodeEntity selectFrmCodeByPrimaryKey(FrmCodeKey key) {
        try {
            FrmCodeEntity entity = frmCodeDao.selectFrmCodeByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmCode+"失败："+e.getMessage());
        }
    }
    
    /**
     * 根据主键查询一条记录
     * @return
     */
    public String selectFrmCodeByDmz(String dmlb,String dmz) {
        try {
        	FrmCodeKey codekey = new FrmCodeKey();
            codekey.setXtlb("00");
            codekey.setDmlb(dmlb);
            codekey.setDmz(dmz);
            FrmCodeEntity entity = frmCodeDao.selectFrmCodeByPrimaryKey(codekey);
            return entity.getDmmc();
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,插入信息
      */
    public ExcuteResult insertFrmCode(FrmCodeEntity entity) {
        try {
            return frmCodeDao.insertFrmCode(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertFrmCodeSelective(FrmCodeEntity entity) {
        try {
            return frmCodeDao.insertFrmCodeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*FRM_CODE,代码信息表,修改
      */
    public ExcuteResult updateFrmCodeByPrimaryKey(FrmCodeEntity entity) {
        try {
            return frmCodeDao.updateFrmCodeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateFrmCodeBySqlWhere(FrmCodeEntity entity, FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmCodeDao.updateFrmCodeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*FRM_CODE,代码信息表,修改
      */
    public ExcuteResult updateFrmCodeBySqlWhereSelective(FrmCodeEntity entity, FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmCodeDao.updateFrmCodeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*FRM_CODE,代码信息表,修改
      */
    public ExcuteResult updateFrmCodeByPrimaryKeySelective(FrmCodeEntity entity) {
        try {
            return frmCodeDao.updateFrmCodeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteFrmCodeByPrimaryKey(FrmCodeKey key) {
        try {
            return frmCodeDao.deleteFrmCodeByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*FRM_CODE,代码信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return frmCodeDao.deleteFrmCodeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmCode+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*FRM_CODE,代码信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)frmCodeDao.countFrmCodeBySqlWhere(sqlWhere);
    }

    public void setFrmCodeDao(IFrmCodeDao frmCodeDao) {
        this.frmCodeDao = frmCodeDao;
    }

    public IFrmCodeDao getFrmCodeDao() {
        return frmCodeDao;
    }

    //根据代码简称获取记录<DMZ,DMMC>
	public List<HashMap<String, Object>> selectListFrmCodeAll(String dmjc) {
		String sql = "SELECT DMZ,DMMC FROM FRM_CODE WHERE DMJC = '"+dmjc+"' ORDER BY DMZ ASC";
		return this.selectListFrmCodeBySql(sql);
	}
}