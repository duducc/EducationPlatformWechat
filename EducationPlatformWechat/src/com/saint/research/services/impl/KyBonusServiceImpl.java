package com.saint.research.services.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyBonusEntity;
import com.saint.research.dao.IKyBonusDao;
import com.saint.research.services.IKyBonusService;
import com.saint.research.sqlWhere.KyBonusSqlWhere;
import com.saint.research.sqlWhere.KyBonusSqlWhere.Criteria;

/**
*类注释信息
*表名KY_BONUS
*表说明科研奖金管理
  */
public class KyBonusServiceImpl implements IKyBonusService {
    private IKyBonusDao kyBonusDao;

    /**
    *方法注释信息
    *分页查询表KY_BONUS
    *表说明科研奖金管理
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<KyBonusEntity> selectListPageKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
        	
            Criteria criteria = sqlWhere.createCriteria();
            if( !StringUtils.isEmpty( sqlWhere.getBonustype() )){
            	criteria.andBonustypeEqualTo( sqlWhere.getBonustype() ) ; 
            }
            
            if(!StringUtils.isEmpty(sqlWhere.getObtainname())){
            	criteria.andObtainnameEqualTo(sqlWhere.getObtainname()) ;
            }
            
            if(!StringUtils.isEmpty(sqlWhere.getTitle())){
            	criteria.andTitleEqualTo( sqlWhere.getTitle() ) ;
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
            List<KyBonusEntity> entitylist=kyBonusDao.selectListPageKyBonusBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyBonus+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表KY_BONUS
     * 表说明科研奖金管理
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<KyBonusEntity> selectListKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            
            if(sqlWhere.getTitle()!=null && !sqlWhere.getTitle().equals("")){
                criteria.andTitleLike("%"+sqlWhere.getTitle()+"%");
            }
            if(sqlWhere.getObtainid()!=null && !sqlWhere.getObtainid().equals("")){
                criteria.andObtainidEqualTo(sqlWhere.getObtainid());
            }
            /**
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
            List<KyBonusEntity> entitylist=kyBonusDao.selectListKyBonusBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyBonus+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyBonusBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=kyBonusDao.selectListKyBonusBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyBonus+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public KyBonusEntity selectKyBonusByPrimaryKey(String xh) {
        try {
            KyBonusEntity entity = kyBonusDao.selectKyBonusByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,插入信息
      */
    public ExcuteResult insertKyBonus(KyBonusEntity entity) {
        try {
            return kyBonusDao.insertKyBonus(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyBonusSelective(KyBonusEntity entity) {
        try {
            return kyBonusDao.insertKyBonusSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*KY_BONUS,科研奖金管理表,修改
      */
    public ExcuteResult updateKyBonusByPrimaryKey(KyBonusEntity entity) {
        try {
            return kyBonusDao.updateKyBonusByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateKyBonusBySqlWhere(KyBonusEntity entity, KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kyBonusDao.updateKyBonusBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*KY_BONUS,科研奖金管理表,修改
      */
    public ExcuteResult updateKyBonusBySqlWhereSelective(KyBonusEntity entity, KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kyBonusDao.updateKyBonusBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*KY_BONUS,科研奖金管理表,修改
      */
    public ExcuteResult updateKyBonusByPrimaryKeySelective(KyBonusEntity entity) {
        try {
            return kyBonusDao.updateKyBonusByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteKyBonusByPrimaryKey(String xh) {
        try {
            return kyBonusDao.deleteKyBonusByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return kyBonusDao.deleteKyBonusBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKyBonus+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*KY_BONUS,科研奖金管理表
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)kyBonusDao.countKyBonusBySqlWhere(sqlWhere);
    }

    public void setKyBonusDao(IKyBonusDao kyBonusDao) {
        this.kyBonusDao = kyBonusDao;
    }

    public IKyBonusDao getKyBonusDao() {
        return kyBonusDao;
    }
}