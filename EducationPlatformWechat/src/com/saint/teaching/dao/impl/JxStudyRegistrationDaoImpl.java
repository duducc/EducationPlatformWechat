package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.dao.IJxStudyRegistrationDao;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_STUDY_REGISTRATION
	*表说明理论课签到
  */
public class JxStudyRegistrationDaoImpl extends BaseDaoImpl implements IJxStudyRegistrationDao {

    /**
    	*方法注释信息
    	*分页查询表JX_STUDY_REGISTRATION
    	*表说明理论课签到
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxStudyRegistrationEntity> selectListPageJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxStudyRegistrationBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxStudyRegistrationEntity selectJxStudyRegistrationByPrimaryKey(String xh) {
        return (JxStudyRegistrationEntity)getObject(xh, "selectJxStudyRegistrationByPrimaryKey");
    }

    /**
     * 查询表JX_STUDY_REGISTRATION
     * 表说明理论课签到
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxStudyRegistrationEntity> selectListJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxStudyRegistrationBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudyRegistrationBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,插入信息
      */
    public ExcuteResult insertJxStudyRegistration(JxStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudyRegistration");
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudyRegistrationSelective(JxStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxStudyRegistrationSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_STUDY_REGISTRATION,理论课签到表,修改
      */
    public ExcuteResult updateJxStudyRegistrationByPrimaryKey(JxStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudyRegistrationByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxStudyRegistrationBySqlWhere(JxStudyRegistrationEntity entity, JxStudyRegistrationSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudyRegistrationBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_STUDY_REGISTRATION,理论课签到表,修改
      */
    public ExcuteResult updateJxStudyRegistrationBySqlWhereSelective(JxStudyRegistrationEntity entity, JxStudyRegistrationSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxStudyRegistrationBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_STUDY_REGISTRATION,理论课签到表,修改
      */
    public ExcuteResult updateJxStudyRegistrationByPrimaryKeySelective(JxStudyRegistrationEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxStudyRegistrationByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxStudyRegistrationByPrimaryKey(String xh) {
        return excuteDataBase(xh, ExcuteType.DELETE, "deleteJxStudyRegistrationByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_STUDY_REGISTRATION,理论课签到表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxStudyRegistrationBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_STUDY_REGISTRATION,理论课签到表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxStudyRegistrationBySqlWhere");
    }
}