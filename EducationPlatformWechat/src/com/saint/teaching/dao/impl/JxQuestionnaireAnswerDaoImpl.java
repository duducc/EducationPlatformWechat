package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxQuestionnaireAnswerEntity;
import com.saint.teaching.bean.JxQuestionnaireAnswerKey;
import com.saint.teaching.dao.IJxQuestionnaireAnswerDao;
import com.saint.teaching.sqlWhere.JxQuestionnaireAnswerSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_QUESTIONNAIRE_ANSWER
	*表说明理论课签到
  */
public class JxQuestionnaireAnswerDaoImpl extends BaseDaoImpl implements IJxQuestionnaireAnswerDao {

    /**
    	*方法注释信息
    	*分页查询表JX_QUESTIONNAIRE_ANSWER
    	*表说明理论课签到
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxQuestionnaireAnswerEntity> selectListPageJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxQuestionnaireAnswerBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxQuestionnaireAnswerEntity selectJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key) {
        return (JxQuestionnaireAnswerEntity)getObject(key, "selectJxQuestionnaireAnswerByPrimaryKey");
    }

    /**
     * 查询表JX_QUESTIONNAIRE_ANSWER
     * 表说明理论课签到
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxQuestionnaireAnswerEntity> selectListJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxQuestionnaireAnswerBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxQuestionnaireAnswerBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,插入信息
      */
    public ExcuteResult insertJxQuestionnaireAnswer(JxQuestionnaireAnswerEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxQuestionnaireAnswer");
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxQuestionnaireAnswerSelective(JxQuestionnaireAnswerEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxQuestionnaireAnswerSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
      */
    public ExcuteResult updateJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxQuestionnaireAnswerByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerEntity entity, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxQuestionnaireAnswerBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
      */
    public ExcuteResult updateJxQuestionnaireAnswerBySqlWhereSelective(JxQuestionnaireAnswerEntity entity, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxQuestionnaireAnswerBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
      */
    public ExcuteResult updateJxQuestionnaireAnswerByPrimaryKeySelective(JxQuestionnaireAnswerEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxQuestionnaireAnswerByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteJxQuestionnaireAnswerByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxQuestionnaireAnswerBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxQuestionnaireAnswerBySqlWhere");
    }
}