package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxQuestionnaireTestEntity;
import com.saint.teaching.dao.IJxQuestionnaireTestDao;
import com.saint.teaching.services.IJxQuestionnaireTestService;
import com.saint.teaching.sqlWhere.JxQuestionnaireTestSqlWhere;
import com.saint.teaching.sqlWhere.JxQuestionnaireTestSqlWhere.Criteria;

/**
*类注释信息
*表名JX_QUESTIONNAIRE_TEST
*表说明学员分数明细
  */
public class JxQuestionnaireTestServiceImpl implements IJxQuestionnaireTestService {
    private IJxQuestionnaireTestDao jxQuestionnaireTestDao;

    /**
    *方法注释信息
    *分页查询表JX_QUESTIONNAIRE_TEST
    *表说明学员分数明细
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public List<JxQuestionnaireTestEntity> selectListPageJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
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
            List<JxQuestionnaireTestEntity> entitylist=jxQuestionnaireTestDao.selectListPageJxQuestionnaireTestBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
     * 查询表JX_QUESTIONNAIRE_TEST
     * 表说明学员分数明细
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<JxQuestionnaireTestEntity> selectListJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getWjlb()!=null && !sqlWhere.getWjlb().equals("")){
                criteria.andWjlbEqualTo(sqlWhere.getWjlb());
            }
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
            List<JxQuestionnaireTestEntity> entitylist=jxQuestionnaireTestDao.selectListJxQuestionnaireTestBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxQuestionnaireTestBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxQuestionnaireTestDao.selectListJxQuestionnaireTestBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public JxQuestionnaireTestEntity selectJxQuestionnaireTestByPrimaryKey(String questionid) {
        try {
            JxQuestionnaireTestEntity entity = jxQuestionnaireTestDao.selectJxQuestionnaireTestByPrimaryKey(questionid);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,插入信息
      */
    public ExcuteResult insertJxQuestionnaireTest(JxQuestionnaireTestEntity entity) {
        try {
            return jxQuestionnaireTestDao.insertJxQuestionnaireTest(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxQuestionnaireTestSelective(JxQuestionnaireTestEntity entity) {
        try {
            return jxQuestionnaireTestDao.insertJxQuestionnaireTestSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,修改
      */
    public ExcuteResult updateJxQuestionnaireTestByPrimaryKey(JxQuestionnaireTestEntity entity) {
        try {
            return jxQuestionnaireTestDao.updateJxQuestionnaireTestByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestEntity entity, JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxQuestionnaireTestDao.updateJxQuestionnaireTestBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,修改
      */
    public ExcuteResult updateJxQuestionnaireTestBySqlWhereSelective(JxQuestionnaireTestEntity entity, JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxQuestionnaireTestDao.updateJxQuestionnaireTestBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,修改
      */
    public ExcuteResult updateJxQuestionnaireTestByPrimaryKeySelective(JxQuestionnaireTestEntity entity) {
        try {
            return jxQuestionnaireTestDao.updateJxQuestionnaireTestByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireTestByPrimaryKey(String questionid) {
        try {
            return jxQuestionnaireTestDao.deleteJxQuestionnaireTestByPrimaryKey(questionid);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	*方法注释信息
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        try {
            return jxQuestionnaireTestDao.deleteJxQuestionnaireTestBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxQuestionnaireTest+"失败："+e.getMessage());
        }
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*JX_QUESTIONNAIRE_TEST,学员分数明细表
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            示例参见getPageListMethod内
            **/
        }
        return (Integer)jxQuestionnaireTestDao.countJxQuestionnaireTestBySqlWhere(sqlWhere);
    }

    public void setJxQuestionnaireTestDao(IJxQuestionnaireTestDao jxQuestionnaireTestDao) {
        this.jxQuestionnaireTestDao = jxQuestionnaireTestDao;
    }

    public IJxQuestionnaireTestDao getJxQuestionnaireTestDao() {
        return jxQuestionnaireTestDao;
    }
}