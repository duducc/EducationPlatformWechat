package com.saint.research.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KyBonusEntity;
import com.saint.research.dao.IKyBonusDao;
import com.saint.research.sqlWhere.KyBonusSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名KY_BONUS
	*表说明科研奖金管理
  */
public class KyBonusDaoImpl extends BaseDaoImpl implements IKyBonusDao {

    /**
    	*方法注释信息
    	*分页查询表KY_BONUS
    	*表说明科研奖金管理
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<KyBonusEntity> selectListPageKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageKyBonusBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public KyBonusEntity selectKyBonusByPrimaryKey(String xh) {
        return (KyBonusEntity)getObject(xh, "selectKyBonusByPrimaryKey");
    }

    /**
     * 查询表KY_BONUS
     * 表说明科研奖金管理
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<KyBonusEntity> selectListKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListKyBonusBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyBonusBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,插入信息
      */
    public ExcuteResult insertKyBonus(KyBonusEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyBonus");
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyBonusSelective(KyBonusEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertKyBonusSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*KY_BONUS,科研奖金管理表,修改
      */
    public ExcuteResult updateKyBonusByPrimaryKey(KyBonusEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyBonusByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateKyBonusBySqlWhere(KyBonusEntity entity, KyBonusSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyBonusBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*KY_BONUS,科研奖金管理表,修改
      */
    public ExcuteResult updateKyBonusBySqlWhereSelective(KyBonusEntity entity, KyBonusSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateKyBonusBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*KY_BONUS,科研奖金管理表,修改
      */
    public ExcuteResult updateKyBonusByPrimaryKeySelective(KyBonusEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateKyBonusByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteKyBonusByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteKyBonusByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*KY_BONUS,科研奖金管理表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteKyBonusBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*KY_BONUS,科研奖金管理表
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countKyBonusBySqlWhere");
    }
}