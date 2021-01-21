package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCoursezxTimeEntity;
import com.saint.teaching.dao.IJxCoursezxTimeDao;
import com.saint.teaching.services.IJxCoursezxTimeService;
import com.saint.teaching.sqlWhere.JxCoursezxTimeSqlWhere;
import com.saint.teaching.sqlWhere.JxCoursezxTimeSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_COURSEZXTIME
*��˵�����ۿ��Ͽ���Ϣʱ��
  */
public class JxCoursezxTimeServiceImpl implements IJxCoursezxTimeService {
    private IJxCoursezxTimeDao jxCoursezxTimeDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_COURSEZXTIME
    *��˵�����ۿ��Ͽ���Ϣʱ��
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxCoursezxTimeEntity> selectListPageJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
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
            List<JxCoursezxTimeEntity> entitylist=jxCoursezxTimeDao.selectListPageJxCoursezxTimeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_COURSEZXTIME
     * ��˵�����ۿ��Ͽ���Ϣʱ��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxCoursezxTimeEntity> selectListJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
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
            List<JxCoursezxTimeEntity> entitylist=jxCoursezxTimeDao.selectListJxCoursezxTimeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCoursezxTimeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxCoursezxTimeDao.selectListJxCoursezxTimeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxCoursezxTimeEntity selectJxCoursezxTimeByPrimaryKey(String xh) {
        try {
            JxCoursezxTimeEntity entity = jxCoursezxTimeDao.selectJxCoursezxTimeByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,������Ϣ
      */
    public ExcuteResult insertJxCoursezxTime(JxCoursezxTimeEntity entity) {
        try {
            return jxCoursezxTimeDao.insertJxCoursezxTime(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCoursezxTimeSelective(JxCoursezxTimeEntity entity) {
        try {
            return jxCoursezxTimeDao.insertJxCoursezxTimeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,�޸�
      */
    public ExcuteResult updateJxCoursezxTimeByPrimaryKey(JxCoursezxTimeEntity entity) {
        try {
            return jxCoursezxTimeDao.updateJxCoursezxTimeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxCoursezxTimeBySqlWhere(JxCoursezxTimeEntity entity, JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCoursezxTimeDao.updateJxCoursezxTimeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,�޸�
      */
    public ExcuteResult updateJxCoursezxTimeBySqlWhereSelective(JxCoursezxTimeEntity entity, JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCoursezxTimeDao.updateJxCoursezxTimeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,�޸�
      */
    public ExcuteResult updateJxCoursezxTimeByPrimaryKeySelective(JxCoursezxTimeEntity entity) {
        try {
            return jxCoursezxTimeDao.updateJxCoursezxTimeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxCoursezxTimeByPrimaryKey(String xh) {
        try {
            return jxCoursezxTimeDao.deleteJxCoursezxTimeByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCoursezxTimeDao.deleteJxCoursezxTimeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCoursezxTime+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_COURSEZXTIME,���ۿ��Ͽ���Ϣʱ���
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCoursezxTimeBySqlWhere(JxCoursezxTimeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxCoursezxTimeDao.countJxCoursezxTimeBySqlWhere(sqlWhere);
    }

    public void setJxCoursezxTimeDao(IJxCoursezxTimeDao jxCoursezxTimeDao) {
        this.jxCoursezxTimeDao = jxCoursezxTimeDao;
    }

    public IJxCoursezxTimeDao getJxCoursezxTimeDao() {
        return jxCoursezxTimeDao;
    }
}