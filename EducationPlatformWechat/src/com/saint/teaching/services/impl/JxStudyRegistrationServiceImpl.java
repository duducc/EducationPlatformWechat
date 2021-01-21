package com.saint.teaching.services.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.dao.IJxStudyRegistrationDao;
import com.saint.teaching.services.IJxStudyRegistrationService;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDY_REGISTRATION
*��˵�����ۿ�ǩ��
  */
public class JxStudyRegistrationServiceImpl implements IJxStudyRegistrationService {
    private IJxStudyRegistrationDao jxStudyRegistrationDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDY_REGISTRATION
    *��˵�����ۿ�ǩ��
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudyRegistrationEntity> selectListPageJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
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
            List<JxStudyRegistrationEntity> entitylist=jxStudyRegistrationDao.selectListPageJxStudyRegistrationBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDY_REGISTRATION
     * ��˵�����ۿ�ǩ��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudyRegistrationEntity> selectListJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getCourseId()!=null && !sqlWhere.getCourseId().equals("")){
            	BigDecimal b = new BigDecimal(sqlWhere.getCourseId());
                criteria.andCourseIdEqualTo(b);
            }
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            if(sqlWhere.getAddYear()!=null && !sqlWhere.getAddYear().equals("")){
                criteria.andAddYearEqualTo(sqlWhere.getAddYear());
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
            List<JxStudyRegistrationEntity> entitylist=jxStudyRegistrationDao.selectListJxStudyRegistrationBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudyRegistrationBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudyRegistrationDao.selectListJxStudyRegistrationBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudyRegistrationEntity selectJxStudyRegistrationByPrimaryKey(String xh) {
        try {
            JxStudyRegistrationEntity entity = jxStudyRegistrationDao.selectJxStudyRegistrationByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,������Ϣ
      */
    public ExcuteResult insertJxStudyRegistration(JxStudyRegistrationEntity entity) {
        try {
            return jxStudyRegistrationDao.insertJxStudyRegistration(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudyRegistrationSelective(JxStudyRegistrationEntity entity) {
        try {
            return jxStudyRegistrationDao.insertJxStudyRegistrationSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxStudyRegistrationByPrimaryKey(JxStudyRegistrationEntity entity) {
        try {
            return jxStudyRegistrationDao.updateJxStudyRegistrationByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudyRegistrationBySqlWhere(JxStudyRegistrationEntity entity, JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudyRegistrationDao.updateJxStudyRegistrationBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxStudyRegistrationBySqlWhereSelective(JxStudyRegistrationEntity entity, JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudyRegistrationDao.updateJxStudyRegistrationBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,�޸�
      */
    public ExcuteResult updateJxStudyRegistrationByPrimaryKeySelective(JxStudyRegistrationEntity entity) {
        try {
            return jxStudyRegistrationDao.updateJxStudyRegistrationByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudyRegistrationByPrimaryKey(String xh) {
        try {
            return jxStudyRegistrationDao.deleteJxStudyRegistrationByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudyRegistrationDao.deleteJxStudyRegistrationBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudyRegistration+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDY_REGISTRATION,���ۿ�ǩ����
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudyRegistrationBySqlWhere(JxStudyRegistrationSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudyRegistrationDao.countJxStudyRegistrationBySqlWhere(sqlWhere);
    }

    public void setJxStudyRegistrationDao(IJxStudyRegistrationDao jxStudyRegistrationDao) {
        this.jxStudyRegistrationDao = jxStudyRegistrationDao;
    }

    public IJxStudyRegistrationDao getJxStudyRegistrationDao() {
        return jxStudyRegistrationDao;
    }
}