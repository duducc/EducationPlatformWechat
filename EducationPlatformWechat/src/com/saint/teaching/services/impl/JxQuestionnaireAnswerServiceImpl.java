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
*��ע����Ϣ
*����JX_QUESTIONNAIRE_ANSWER
*��˵�����ۿ�ǩ��
  */
public class JxQuestionnaireAnswerServiceImpl implements IJxQuestionnaireAnswerService {
    private IJxQuestionnaireAnswerDao jxQuestionnaireAnswerDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_QUESTIONNAIRE_ANSWER
    *��˵�����ۿ�ǩ��
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxQuestionnaireAnswerEntity> selectListPageJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ������ʽ˵��
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            Like������ʽ˵��
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxLike("%"sqlWhere.getJflx()"%");
            }
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");������
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
            �����Ҫ���or���� ����������
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                 criteria.addSDWhereSql(" (tjdd like '%"+sqlWhere.getGlbm()+"%' or tjgsdd like '%"+sqlWhere.getGlbm()+"%') ");
            }
            �����ڲ�ѯ����
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
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_QUESTIONNAIRE_ANSWER
     * ��˵�����ۿ�ǩ��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
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
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");������
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
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxQuestionnaireAnswerBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxQuestionnaireAnswerDao.selectListJxQuestionnaireAnswerBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxQuestionnaireAnswerEntity selectJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key) {
        try {
            JxQuestionnaireAnswerEntity entity = jxQuestionnaireAnswerDao.selectJxQuestionnaireAnswerByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,������Ϣ
      */
    public ExcuteResult insertJxQuestionnaireAnswer(JxQuestionnaireAnswerEntity entity) {
        try {
            return jxQuestionnaireAnswerDao.insertJxQuestionnaireAnswer(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxQuestionnaireAnswerSelective(JxQuestionnaireAnswerEntity entity) {
        try {
            return jxQuestionnaireAnswerDao.insertJxQuestionnaireAnswerSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerEntity entity) {
        try {
            return jxQuestionnaireAnswerDao.updateJxQuestionnaireAnswerByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerEntity entity, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxQuestionnaireAnswerDao.updateJxQuestionnaireAnswerBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxQuestionnaireAnswerBySqlWhereSelective(JxQuestionnaireAnswerEntity entity, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxQuestionnaireAnswerDao.updateJxQuestionnaireAnswerBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxQuestionnaireAnswerByPrimaryKeySelective(JxQuestionnaireAnswerEntity entity) {
        try {
            return jxQuestionnaireAnswerDao.updateJxQuestionnaireAnswerByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireAnswerByPrimaryKey(JxQuestionnaireAnswerKey key) {
        try {
            return jxQuestionnaireAnswerDao.deleteJxQuestionnaireAnswerByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxQuestionnaireAnswerDao.deleteJxQuestionnaireAnswerBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxQuestionnaireAnswer+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_QUESTIONNAIRE_ANSWER,���ۿ�ǩ����
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxQuestionnaireAnswerBySqlWhere(JxQuestionnaireAnswerSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
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