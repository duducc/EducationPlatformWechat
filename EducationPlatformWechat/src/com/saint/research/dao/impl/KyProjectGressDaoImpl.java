package com.saint.research.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KyProjectGressEntity;
import com.saint.research.dao.IKyProjectGressDao;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名KY_PROJECTGRESS
	*表说明项目执行情况登记
  */
public class KyProjectGressDaoImpl extends BaseDaoImpl implements IKyProjectGressDao {

    /**
    	*方法注释信息
    	*分页查询表KY_PROJECTGRESS
    	*表说明项目执行情况登记
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<KyProjectGressEntity> selectListPageKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageKyProjectGressBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public KyProjectGressEntity selectKyProjectGressByPrimaryKey(String xh) {
        return (KyProjectGressEntity)getObject(xh, "selectKyProjectGressByPrimaryKey");
    }

    /**
     * 查询表KY_PROJECTGRESS
     * 表说明项目执行情况登记
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<KyProjectGressEntity> selectListKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListKyProjectGressBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyProjectGressBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,插入信息
      */
    public ExcuteResult insertKyProjectGress(KyProjectGressEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyProjectGress");
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyProjectGressSelective(KyProjectGressEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyProjectGressSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*KY_PROJECTGRESS,项目执行情况登记表,修改
      */
    public ExcuteResult updateKyProjectGressByPrimaryKey(KyProjectGressEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyProjectGressByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateKyProjectGressBySqlWhere(KyProjectGressEntity entity, KyProjectGressSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyProjectGressBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*KY_PROJECTGRESS,项目执行情况登记表,修改
      */
    public ExcuteResult updateKyProjectGressBySqlWhereSelective(KyProjectGressEntity entity, KyProjectGressSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyProjectGressBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*KY_PROJECTGRESS,项目执行情况登记表,修改
      */
    public ExcuteResult updateKyProjectGressByPrimaryKeySelective(KyProjectGressEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyProjectGressByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteKyProjectGressByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteKyProjectGressByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*KY_PROJECTGRESS,项目执行情况登记表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteKyProjectGressBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*KY_PROJECTGRESS,项目执行情况登记表
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countKyProjectGressBySqlWhere");
    }
}