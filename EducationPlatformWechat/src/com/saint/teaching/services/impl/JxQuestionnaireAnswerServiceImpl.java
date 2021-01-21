package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxQuestionnaireAnswerEntity;
import com.saint.teaching.bean.JxQuestionnaireAnswerKey;
import com.saint.teaching.dao.IJxQuestionnaireAnswerDao;
import com.saint.teaching.services.IJxQuestionnaireAnswerService;
import com.saint.teaching.sqlWhere.JxQuestionnaireAnswerSqlWhere;
import com.saint.teaching.sqlWhere.JxQuestionnaireAnswerSqlWhere.Criteria;

/**
*类注释信息
*表名JX_QUESTIONNAIRE_ANSWER
*表说明理论课签到
  */
public class JxQuestionnaireAnswerServiceImpl implements IJxQuestionnaireAnswerService {
    private IJxQuestionnaireAnswerDao jxQuestionnaireAnswerDao;

    /**
    *方法注释信息
    *分页查询表JX_QUESTIONNAIRE_ANSWER
    *表说明理论课签到
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxQuestionnaireAnswerEntity> selectListPageJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
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
            List<JxQuestionnaireAnswerEntity> entitylist=jxQuestionnaireAnswerDao.selectListPageJxQuestionnaireAnswerBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_QUESTIONNAIRE_ANSWER
     * 表说明理论课签到
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxQuestionnaireAnswerEntity> selectListJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
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
            **/
        }
        try {
            List<JxQuestionnaireAnswerEntity> entitylist=jxQuestionnaireAnswerDao.selectListJxQuestionnaireAnswerBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxQuestionnaireAnswerBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxQuestionnaireAnswerDao.selectListJxQuestionnaireAnswerBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxQuestionnaireAnswerEntity selectJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key) {
        try {
            JxQuestionnaireAnswerEntity entity = jxQuestionnaireAnswerDao.selectJxQuestionnaireAnswerByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,插入信息
      */
    public ExcuteResult insertJxQuestionnaireAnswer(JxQuestionnaireAnswerEntity entity) {
        try {
            return jxQuestionnaireAnswerDao.insertJxQuestionnaireAnswer(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxQuestionnaireAnswerSelective(JxQuestionnaireAnswerEntity entity) {
        try {
            return jxQuestionnaireAnswerDao.insertJxQuestionnaireAnswerSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
      */
    public ExcuteResult updateJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerEntity entity) {
        try {
            return jxQuestionnaireAnswerDao.updateJxQuestionnaireAnswerByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerEntity entity, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxQuestionnaireAnswerDao.updateJxQuestionnaireAnswerBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
      */
    public ExcuteResult updateJxQuestionnaireAnswerBySqlWhereSelective(JxQuestionnaireAnswerEntity entity, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxQuestionnaireAnswerDao.updateJxQuestionnaireAnswerBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
      */
    public ExcuteResult updateJxQuestionnaireAnswerByPrimaryKeySelective(JxQuestionnaireAnswerEntity entity) {
        try {
            return jxQuestionnaireAnswerDao.updateJxQuestionnaireAnswerByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key) {
        try {
            return jxQuestionnaireAnswerDao.deleteJxQuestionnaireAnswerByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxQuestionnaireAnswerDao.deleteJxQuestionnaireAnswerBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxQuestionnaireAnswer+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_QUESTIONNAIRE_ANSWER,理论课签到表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxQuestionnaireAnswerDao.countJxQuestionnaireAnswerBySqlWhere(sqlWhere);
    }

    public void setJxQuestionnaireAnswerDao(IJxQuestionnaireAnswerDao jxQuestionnaireAnswerDao) {
        this.jxQuestionnaireAnswerDao = jxQuestionnaireAnswerDao;
    }

    public IJxQuestionnaireAnswerDao getJxQuestionnaireAnswerDao() {
        return jxQuestionnaireAnswerDao;
    }
}