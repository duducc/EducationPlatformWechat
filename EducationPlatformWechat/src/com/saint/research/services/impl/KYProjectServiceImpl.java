package com.saint.research.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KYProjectEntity;
import com.saint.research.dao.IKYProjectDao;
import com.saint.research.services.IKYProjectService;
import com.saint.research.sqlWhere.KYProjectSqlWhere.*;
import com.saint.research.sqlWhere.KYProjectSqlWhere;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

/**
*类注释信息
*表名KY_PROJECT
*表说明科研项目信息
  */
public class KYProjectServiceImpl implements IKYProjectService {
    private IKYProjectDao kYProjectDao;
    /**
	* 实现根据sqlWhere传入的条件 COUNT 出记录数
	*KY_PROJECT,科研项目信息表
	* @param sqlWhere
	* @return
	*/
	public int selectKYProjectSequence() {
	    return (Integer)kYProjectDao.selectKYProjectSequence();
	}
    /**
    *方法注释信息
    *分页查询表KY_PROJECT
    *表说明科研项目信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<KYProjectEntity> selectListPageKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getHospitalid()!=null && !sqlWhere.getHospitalid().equals("")){
            	criteria.andHospitalidLike("%"+sqlWhere.getHospitalid()+"%");
            }
            if(sqlWhere.getHospitalname()!=null && !sqlWhere.getHospitalname().equals("")){
            	criteria.andHospitalnameLike("%"+sqlWhere.getHospitalname()+"%");
            }
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceLike("%"+sqlWhere.getProsequence()+"%");
            }
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
            	criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
            }
            if(sqlWhere.getPrograde()!=null && !sqlWhere.getPrograde().equals("")){
            	criteria.andProgradeLike("%"+sqlWhere.getPrograde()+"%");
            }
            
            if(sqlWhere.getPmname()!=null && !sqlWhere.getPmname().equals("")){
            	criteria.andPmnameLike("%"+sqlWhere.getPmname()+"%");
            }
            
            if(sqlWhere.getProstate()!=null && !sqlWhere.getProstate().equals("")){
            	String[] prostates = sqlWhere.getProstate().split(",");
            	List<String> tempList = Arrays.asList(prostates);
            	criteria.andProstateIn(tempList);
            }
            if(sqlWhere.getCheckorder()!=null && !sqlWhere.getCheckorder().equals("")){
                criteria.andCheckorderEqualTo(sqlWhere.getCheckorder());
            }
            if(sqlWhere.getSubjecttype()!=null && !sqlWhere.getSubjecttype().equals("")){
                criteria.andSubjecttypeEqualTo(sqlWhere.getSubjecttype());
            }
            
            if( null != sqlWhere.getpList() ){
            	criteria.andProsequenceIn(sqlWhere.getpList());
            }
            
            if( null != sqlWhere.getPromark() && !sqlWhere.getPromark().equals("")){
            	criteria.andPromarkNotEqualTo(sqlWhere.getPromark()) ;
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
        	List<KYProjectEntity> entitylist = kYProjectDao.selectListPageKYProjectBySqlWhere(sqlWhere) ;
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKYProject+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表KY_PROJECT
     * 表说明科研项目信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<KYProjectEntity> selectListKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if( !StringUtils.isEmpty(sqlWhere.getProname())){
            	criteria.andPronameLike("%" + sqlWhere.getProname() + "%") ; 
            }
            if( !StringUtils.isEmpty(sqlWhere.getProsequence())){
            	String[] arr = sqlWhere.getProsequence().split(",") ;
            	criteria.andProsequenceIn(Arrays.asList(arr)) ;
            }
            if(sqlWhere.getProstate()!=null && !sqlWhere.getProstate().equals("")){
            	String[] prostates = sqlWhere.getProstate().split(",");
            	List<String> tempList = Arrays.asList(prostates);
            	criteria.andProstateIn(tempList);
            }
            if(sqlWhere.getSubjecttype()!=null && !sqlWhere.getSubjecttype().equals("")){
                criteria.andSubjecttypeEqualTo(sqlWhere.getSubjecttype());
            }
            if(sqlWhere.getPronature()!=null && !sqlWhere.getPronature().equals("")){
                criteria.andPronatureEqualTo(sqlWhere.getPronature());
            }
            if(sqlWhere.getPmname()!=null && !sqlWhere.getPmname().equals("")){
            	criteria.andPmnameLike("%"+sqlWhere.getPmname()+"%");
            }
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
            	criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
            }
        }
        try {
            List<KYProjectEntity> entitylist=kYProjectDao.selectListKYProjectBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKYProject+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKYProjectBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=kYProjectDao.selectListKYProjectBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKYProject+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public KYProjectEntity selectKYProjectByPrimaryKey(String prosequence) {
        try {
            KYProjectEntity entity = kYProjectDao.selectKYProjectByPrimaryKey(prosequence);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,插入信息
      */
    public ExcuteResult insertKYProject(KYProjectEntity entity) {
        try {
            return kYProjectDao.insertKYProject(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKYProjectSelective(KYProjectEntity entity) {
        try {
            return kYProjectDao.insertKYProjectSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*KY_PROJECT,科研项目信息表,修改
      */
    public ExcuteResult updateKYProjectByPrimaryKey(KYProjectEntity entity) {
        try {
            return kYProjectDao.updateKYProjectByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateKYProjectBySqlWhere(KYProjectEntity entity, KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kYProjectDao.updateKYProjectBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*KY_PROJECT,科研项目信息表,修改
      */
    public ExcuteResult updateKYProjectBySqlWhereSelective(KYProjectEntity entity, KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kYProjectDao.updateKYProjectBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*KY_PROJECT,科研项目信息表,修改
      */
    public ExcuteResult updateKYProjectByPrimaryKeySelective(KYProjectEntity entity) {
        try {
            return kYProjectDao.updateKYProjectByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteKYProjectByPrimaryKey(String prosequence) {
        try {
            return kYProjectDao.deleteKYProjectByPrimaryKey(prosequence);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kYProjectDao.deleteKYProjectBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKYProject+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*KY_PROJECT,科研项目信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)kYProjectDao.countKYProjectBySqlWhere(sqlWhere);
    }
    
    @Override
	public List<String> selectListKYProject(Map<String, Object> map) {
		return kYProjectDao.selectListKYProject(map);
	}

    @Override
	public List<KYProjectEntity> selectListPageProject(KYProjectSqlWhere sqlWhere) {
    	
    	if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getHospitalid()!=null && !sqlWhere.getHospitalid().equals("")){
            	criteria.andHospitalidLike("%"+sqlWhere.getHospitalid()+"%");
            }
            if(sqlWhere.getHospitalname()!=null && !sqlWhere.getHospitalname().equals("")){
            	criteria.andHospitalnameLike("%"+sqlWhere.getHospitalname()+"%");
            }
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceLike("%"+sqlWhere.getProsequence()+"%");
            }
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
            	criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
            }
            if(sqlWhere.getPrograde()!=null && !sqlWhere.getPrograde().equals("")){
            	criteria.andProgradeLike("%"+sqlWhere.getPrograde()+"%");
            }
            if(sqlWhere.getPmname()!=null && !sqlWhere.getPmname().equals("")){
            	criteria.andPmnameLike("%"+sqlWhere.getPmname()+"%");
            }
            if(sqlWhere.getProstate()!=null && !sqlWhere.getProstate().equals("")){
            	String[] prostates = sqlWhere.getProstate().split(",");
            	List<String> tempList = Arrays.asList(prostates);
            	criteria.andProstateIn(tempList);
            }
            if(sqlWhere.getCheckorder()!=null && !sqlWhere.getCheckorder().equals("")){
                criteria.andCheckorderEqualTo(sqlWhere.getCheckorder());
            }
            if(sqlWhere.getSubjecttype()!=null && !sqlWhere.getSubjecttype().equals("")){
                criteria.andSubjecttypeEqualTo(sqlWhere.getSubjecttype());
            }
            
            if( null != sqlWhere.getpList() ){
            	criteria.andProsequenceIn(sqlWhere.getpList());
            }
            
            if( null != sqlWhere.getPromark() && !sqlWhere.getPromark().equals("")){
            	criteria.andPromarkNotEqualTo(sqlWhere.getPromark()) ;
            }
    	}
    	
    	 try {
         	List<KYProjectEntity> entitylist = kYProjectDao.selectListPageProject(sqlWhere);
             sqlWhere.clear();
             return entitylist;
         } catch (ExcuteException e) {
             e.printStackTrace();
             throw new ExcuteException(FrmGnid.selectListPageKYProject+"失败："+e.getMessage());
         }
	}
    
    public void setKYProjectDao(IKYProjectDao kYProjectDao) {
        this.kYProjectDao = kYProjectDao;
    }

    public IKYProjectDao getKYProjectDao() {
        return kYProjectDao;
    }
    
    
	
	
}