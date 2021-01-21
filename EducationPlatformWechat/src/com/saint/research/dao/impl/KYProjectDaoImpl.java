package com.saint.research.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KYProjectEntity;
import com.saint.research.dao.IKYProjectDao;
import com.saint.research.sqlWhere.KYProjectSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名KY_PROJECT
	*表说明科研项目信息
  */
public class KYProjectDaoImpl extends BaseDaoImpl implements IKYProjectDao {
	 /**
	* 实现根据sqlWhere传入的条件 COUNT 出记录数
	*KY_PROJECT,科研项目信息表
	* @param sqlWhere
	* @return
	*/
	public int selectKYProjectSequence() {
	    return (Integer)getObject("", "selectKYProjectSequence");
	}
    /**
    	*方法注释信息
    	*分页查询表KY_PROJECT
    	*表说明科研项目信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    @SuppressWarnings("unchecked")
	public List<KYProjectEntity> selectListPageKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageKYProjectBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public KYProjectEntity selectKYProjectByPrimaryKey(String prosequence) {
        return (KYProjectEntity)getObject(prosequence, "selectKYProjectByPrimaryKey");
    }

    /**
     * 查询表KY_PROJECT
     * 表说明科研项目信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    @SuppressWarnings("unchecked")
	public List<KYProjectEntity> selectListKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListKYProjectBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKYProjectBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,插入信息
      */
    public ExcuteResult insertKYProject(KYProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKYProject");
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKYProjectSelective(KYProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKYProjectSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*KY_PROJECT,科研项目信息表,修改
      */
    public ExcuteResult updateKYProjectByPrimaryKey(KYProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKYProjectByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateKYProjectBySqlWhere(KYProjectEntity entity, KYProjectSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKYProjectBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*KY_PROJECT,科研项目信息表,修改
      */
    public ExcuteResult updateKYProjectBySqlWhereSelective(KYProjectEntity entity, KYProjectSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKYProjectBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*KY_PROJECT,科研项目信息表,修改
      */
    public ExcuteResult updateKYProjectByPrimaryKeySelective(KYProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKYProjectByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteKYProjectByPrimaryKey(String prosequence) {
        return excuteDataBase(prosequence, ExcuteType.DELETE, "deleteKYProjectByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*KY_PROJECT,科研项目信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteKYProjectBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*KY_PROJECT,科研项目信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countKYProjectBySqlWhere");
    }
    
	@SuppressWarnings("unchecked")
	@Override
	public List<String> selectListKYProject(Map<String, Object> map) {
		return getObjectList(map,"selectListKYProject");
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<KYProjectEntity> selectListPageProject(KYProjectSqlWhere sqlWhere) {
		return getObjectList(sqlWhere,"selectListPageProject"); 
	}
}