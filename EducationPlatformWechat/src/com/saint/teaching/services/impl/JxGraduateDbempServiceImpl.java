package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxGraduateDbempEntity;
import com.saint.teaching.dao.IJxGraduateDbempDao;
import com.saint.teaching.services.IJxGraduateDbempService;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_GRADUATE_DBEMP
*��˵���о������μ���Ա
  */
public class JxGraduateDbempServiceImpl implements IJxGraduateDbempService {
    private IJxGraduateDbempDao jxGraduateDbempDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_GRADUATE_DBEMP
    *��˵���о������μ���Ա
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxGraduateDbempEntity> selectListPageJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
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
            List<JxGraduateDbempEntity> entitylist=jxGraduateDbempDao.selectListPageJxGraduateDbempBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_GRADUATE_DBEMP
     * ��˵���о������μ���Ա
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxGraduateDbempEntity> selectListJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
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
            List<JxGraduateDbempEntity> entitylist=jxGraduateDbempDao.selectListJxGraduateDbempBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxGraduateDbempBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxGraduateDbempDao.selectListJxGraduateDbempBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxGraduateDbempEntity selectJxGraduateDbempByPrimaryKey(String xh) {
        try {
            JxGraduateDbempEntity entity = jxGraduateDbempDao.selectJxGraduateDbempByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,������Ϣ
      */
    public ExcuteResult insertJxGraduateDbemp(JxGraduateDbempEntity entity) {
        try {
            return jxGraduateDbempDao.insertJxGraduateDbemp(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxGraduateDbempSelective(JxGraduateDbempEntity entity) {
        try {
            return jxGraduateDbempDao.insertJxGraduateDbempSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
      */
    public ExcuteResult updateJxGraduateDbempByPrimaryKey(JxGraduateDbempEntity entity) {
        try {
            return jxGraduateDbempDao.updateJxGraduateDbempByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxGraduateDbempBySqlWhere(JxGraduateDbempEntity entity, JxGraduateDbempSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxGraduateDbempDao.updateJxGraduateDbempBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
      */
    public ExcuteResult updateJxGraduateDbempBySqlWhereSelective(JxGraduateDbempEntity entity, JxGraduateDbempSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxGraduateDbempDao.updateJxGraduateDbempBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
      */
    public ExcuteResult updateJxGraduateDbempByPrimaryKeySelective(JxGraduateDbempEntity entity) {
        try {
            return jxGraduateDbempDao.updateJxGraduateDbempByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDbempByPrimaryKey(String xh) {
        try {
            return jxGraduateDbempDao.deleteJxGraduateDbempByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxGraduateDbempDao.deleteJxGraduateDbempBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxGraduateDbemp+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_GRADUATE_DBEMP,�о������μ���Ա��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxGraduateDbempDao.countJxGraduateDbempBySqlWhere(sqlWhere);
    }

    public void setJxGraduateDbempDao(IJxGraduateDbempDao jxGraduateDbempDao) {
        this.jxGraduateDbempDao = jxGraduateDbempDao;
    }

    public IJxGraduateDbempDao getJxGraduateDbempDao() {
        return jxGraduateDbempDao;
    }
}