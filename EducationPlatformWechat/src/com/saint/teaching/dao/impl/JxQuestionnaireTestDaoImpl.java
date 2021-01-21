package com.saint.teaching.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.teaching.bean.JxQuestionnaireTestEntity;
import com.saint.teaching.dao.IJxQuestionnaireTestDao;
import com.saint.teaching.sqlWhere.JxQuestionnaireTestSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名JX_QUESTIONNAIRE_TEST
	*表说明学员分数明细
  */
public class JxQuestionnaireTestDaoImpl extends BaseDaoImpl implements IJxQuestionnaireTestDao {

    /**
    	*方法注释信息
    	*分页查询表JX_QUESTIONNAIRE_TEST
    	*表说明学员分数明细
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<JxQuestionnaireTestEntity> selectListPageJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageJxQuestionnaireTestBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxQuestionnaireTestEntity selectJxQuestionnaireTestByPrimaryKey(String questionid) {
        return (JxQuestionnaireTestEntity)getObject(questionid, "selectJxQuestionnaireTestByPrimaryKey");
    }

    /**
     * 查询表JX_QUESTIONNAIRE_TEST
     * 表说明学员分数明细
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxQuestionnaireTestEntity> selectListJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListJxQuestionnaireTestBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxQuestionnaireTestBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,插入信息
      */
    public ExcuteResult insertJxQuestionnaireTest(JxQuestionnaireTestEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxQuestionnaireTest");
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxQuestionnaireTestSelective(JxQuestionnaireTestEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertJxQuestionnaireTestSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,修改
      */
    public ExcuteResult updateJxQuestionnaireTestByPrimaryKey(JxQuestionnaireTestEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxQuestionnaireTestByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestEntity entity, JxQuestionnaireTestSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxQuestionnaireTestBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,修改
      */
    public ExcuteResult updateJxQuestionnaireTestBySqlWhereSelective(JxQuestionnaireTestEntity entity, JxQuestionnaireTestSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateJxQuestionnaireTestBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,修改
      */
    public ExcuteResult updateJxQuestionnaireTestByPrimaryKeySelective(JxQuestionnaireTestEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateJxQuestionnaireTestByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireTestByPrimaryKey(String questionid) {
        return excuteDataBase(questionid, ExcuteType.DELETE, "deleteJxQuestionnaireTestByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteJxQuestionnaireTestBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countJxQuestionnaireTestBySqlWhere");
    }
}