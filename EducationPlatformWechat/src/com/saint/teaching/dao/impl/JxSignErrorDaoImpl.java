package com.saint.teaching.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxSignErrorEntity;
import com.saint.teaching.dao.IJxSignErrorDao;
import com.saint.teaching.sqlWhere.JxSignErrorSqlWhere;

/**
	*类注释信息
	*表名JX_SIGN_ERROR
	*表说明学生签到失败日志
  */
public class JxSignErrorDaoImpl extends BaseDaoImpl implements IJxSignErrorDao {

    /**
    	*方法注释信息
    	*分页查询表JX_SIGN_ERROR
    	*表说明学生签到失败日志
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxSignErrorEntity> selectListPageJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxSignErrorBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxSignErrorEntity selectJxSignErrorByPrimaryKey(String xh) {
        return (JxSignErrorEntity)getObject(xh, "selectJxSignErrorByPrimaryKey");
    }

    /**
     * 查询表JX_SIGN_ERROR
     * 表说明学生签到失败日志
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxSignErrorEntity> selectListJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxSignErrorBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxSignErrorBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,插入信息
      */
    public ExcuteResult insertJxSignError(JxSignErrorEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxSignError");
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxSignErrorSelective(JxSignErrorEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxSignErrorSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_SIGN_ERROR,学生签到失败日志表,修改
      */
    public ExcuteResult updateJxSignErrorByPrimaryKey(JxSignErrorEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxSignErrorByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxSignErrorBySqlWhere(JxSignErrorEntity entity, JxSignErrorSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxSignErrorBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_SIGN_ERROR,学生签到失败日志表,修改
      */
    public ExcuteResult updateJxSignErrorBySqlWhereSelective(JxSignErrorEntity entity, JxSignErrorSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxSignErrorBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_SIGN_ERROR,学生签到失败日志表,修改
      */
    public ExcuteResult updateJxSignErrorByPrimaryKeySelective(JxSignErrorEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxSignErrorByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxSignErrorByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxSignErrorByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_SIGN_ERROR,学生签到失败日志表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxSignErrorBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_SIGN_ERROR,学生签到失败日志表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxSignErrorBySqlWhere");
    }
}