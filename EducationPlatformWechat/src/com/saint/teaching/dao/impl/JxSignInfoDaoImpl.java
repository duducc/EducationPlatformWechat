package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.dao.IJxSignInfoDao;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_SIGN_INFO
	*表说明实习学员签到信息
  */
public class JxSignInfoDaoImpl extends BaseDaoImpl implements IJxSignInfoDao {

    /**
    	*方法注释信息
    	*分页查询表JX_SIGN_INFO
    	*表说明实习学员签到信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxSignInfoEntity> selectListPageJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxSignInfoBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxSignInfoEntity selectJxSignInfoByPrimaryKey(String xh) {
        return (JxSignInfoEntity)getObject(xh, "selectJxSignInfoByPrimaryKey");
    }

    /**
     * 查询表JX_SIGN_INFO
     * 表说明实习学员签到信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxSignInfoEntity> selectListJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxSignInfoBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxSignInfoBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,插入信息
      */
    public ExcuteResult insertJxSignInfo(JxSignInfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxSignInfo");
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxSignInfoSelective(JxSignInfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxSignInfoSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_SIGN_INFO,实习学员签到信息表,修改
      */
    public ExcuteResult updateJxSignInfoByPrimaryKey(JxSignInfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxSignInfoByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxSignInfoBySqlWhere(JxSignInfoEntity entity, JxSignInfoSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxSignInfoBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_SIGN_INFO,实习学员签到信息表,修改
      */
    public ExcuteResult updateJxSignInfoBySqlWhereSelective(JxSignInfoEntity entity, JxSignInfoSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxSignInfoBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_SIGN_INFO,实习学员签到信息表,修改
      */
    public ExcuteResult updateJxSignInfoByPrimaryKeySelective(JxSignInfoEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxSignInfoByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxSignInfoByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxSignInfoByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_SIGN_INFO,实习学员签到信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxSignInfoBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_SIGN_INFO,实习学员签到信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxSignInfoBySqlWhere");
    }
}