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
*��ע����Ϣ
*����JX_QUESTIONNAIRE_TEST
*��˵��ѧԱ������ϸ
  */
public class JxQuestionnaireTestServiceImpl implements IJxQuestionnaireTestService {
    private IJxQuestionnaireTestDao jxQuestionnaireTestDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_QUESTIONNAIRE_TEST
    *��˵��ѧԱ������ϸ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxQuestionnaireTestEntity> selectListPageJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
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
            List<JxQuestionnaireTestEntity> entitylist=jxQuestionnaireTestDao.selectListPageJxQuestionnaireTestBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_QUESTIONNAIRE_TEST
     * ��˵��ѧԱ������ϸ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
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
            List<JxQuestionnaireTestEntity> entitylist=jxQuestionnaireTestDao.selectListJxQuestionnaireTestBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxQuestionnaireTestBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxQuestionnaireTestDao.selectListJxQuestionnaireTestBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxQuestionnaireTestEntity selectJxQuestionnaireTestByPrimaryKey(String questionid) {
        try {
            JxQuestionnaireTestEntity entity = jxQuestionnaireTestDao.selectJxQuestionnaireTestByPrimaryKey(questionid);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,������Ϣ
      */
    public ExcuteResult insertJxQuestionnaireTest(JxQuestionnaireTestEntity entity) {
        try {
            return jxQuestionnaireTestDao.insertJxQuestionnaireTest(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxQuestionnaireTestSelective(JxQuestionnaireTestEntity entity) {
        try {
            return jxQuestionnaireTestDao.insertJxQuestionnaireTestSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxQuestionnaireTestByPrimaryKey(JxQuestionnaireTestEntity entity) {
        try {
            return jxQuestionnaireTestDao.updateJxQuestionnaireTestByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestEntity entity, JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxQuestionnaireTestDao.updateJxQuestionnaireTestBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxQuestionnaireTestBySqlWhereSelective(JxQuestionnaireTestEntity entity, JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxQuestionnaireTestDao.updateJxQuestionnaireTestBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxQuestionnaireTestByPrimaryKeySelective(JxQuestionnaireTestEntity entity) {
        try {
            return jxQuestionnaireTestDao.updateJxQuestionnaireTestByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireTestByPrimaryKey(String questionid) {
        try {
            return jxQuestionnaireTestDao.deleteJxQuestionnaireTestByPrimaryKey(questionid);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxQuestionnaireTestDao.deleteJxQuestionnaireTestBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxQuestionnaireTest+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_QUESTIONNAIRE_TEST,ѧԱ������ϸ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
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