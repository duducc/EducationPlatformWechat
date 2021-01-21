package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxGraduateDabianEntity;
import com.saint.teaching.dao.IJxGraduateDabianDao;
import com.saint.teaching.services.IJxGraduateDabianService;
import com.saint.teaching.sqlWhere.JxGraduateDabianSqlWhere;
import com.saint.teaching.sqlWhere.JxGraduateDabianSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_GRADUATE_DABIAN
*��˵���о�������걨
  */
public class JxGraduateDabianServiceImpl implements IJxGraduateDabianService {
    private IJxGraduateDabianDao jxGraduateDabianDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_GRADUATE_DABIAN
    *��˵���о�������걨
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxGraduateDabianEntity> selectListPageJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
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
            List<JxGraduateDabianEntity> entitylist=jxGraduateDabianDao.selectListPageJxGraduateDabianBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_GRADUATE_DABIAN
     * ��˵���о�������걨
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxGraduateDabianEntity> selectListJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
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
            List<JxGraduateDabianEntity> entitylist=jxGraduateDabianDao.selectListJxGraduateDabianBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxGraduateDabianBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxGraduateDabianDao.selectListJxGraduateDabianBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxGraduateDabianEntity selectJxGraduateDabianByPrimaryKey(String xh) {
        try {
            JxGraduateDabianEntity entity = jxGraduateDabianDao.selectJxGraduateDabianByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,������Ϣ
      */
    public ExcuteResult insertJxGraduateDabian(JxGraduateDabianEntity entity) {
        try {
            return jxGraduateDabianDao.insertJxGraduateDabian(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxGraduateDabianSelective(JxGraduateDabianEntity entity) {
        try {
            return jxGraduateDabianDao.insertJxGraduateDabianSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_GRADUATE_DABIAN,�о�������걨��,�޸�
      */
    public ExcuteResult updateJxGraduateDabianByPrimaryKey(JxGraduateDabianEntity entity) {
        try {
            return jxGraduateDabianDao.updateJxGraduateDabianByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxGraduateDabianBySqlWhere(JxGraduateDabianEntity entity, JxGraduateDabianSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxGraduateDabianDao.updateJxGraduateDabianBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_GRADUATE_DABIAN,�о�������걨��,�޸�
      */
    public ExcuteResult updateJxGraduateDabianBySqlWhereSelective(JxGraduateDabianEntity entity, JxGraduateDabianSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxGraduateDabianDao.updateJxGraduateDabianBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_GRADUATE_DABIAN,�о�������걨��,�޸�
      */
    public ExcuteResult updateJxGraduateDabianByPrimaryKeySelective(JxGraduateDabianEntity entity) {
        try {
            return jxGraduateDabianDao.updateJxGraduateDabianByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDabianByPrimaryKey(String xh) {
        try {
            return jxGraduateDabianDao.deleteJxGraduateDabianByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_GRADUATE_DABIAN,�о�������걨��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxGraduateDabianDao.deleteJxGraduateDabianBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxGraduateDabian+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_GRADUATE_DABIAN,�о�������걨��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxGraduateDabianBySqlWhere(JxGraduateDabianSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxGraduateDabianDao.countJxGraduateDabianBySqlWhere(sqlWhere);
    }

    public void setJxGraduateDabianDao(IJxGraduateDabianDao jxGraduateDabianDao) {
        this.jxGraduateDabianDao = jxGraduateDabianDao;
    }

    public IJxGraduateDabianDao getJxGraduateDabianDao() {
        return jxGraduateDabianDao;
    }
}