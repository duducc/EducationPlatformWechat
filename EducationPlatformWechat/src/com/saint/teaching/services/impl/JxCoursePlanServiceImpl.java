package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.dao.IJxCoursePlanDao;
import com.saint.teaching.services.IJxCoursePlanService;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_COURSEPLAN
*��˵�����ۿν�ѧ����
  */
public class JxCoursePlanServiceImpl implements IJxCoursePlanService {
    private IJxCoursePlanDao jxCoursePlanDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_COURSEPLAN
    *��˵�����ۿν�ѧ����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxCoursePlanEntity> selectListPageJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
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
            List<JxCoursePlanEntity> entitylist=jxCoursePlanDao.selectListPageJxCoursePlanBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_COURSEPLAN
     * ��˵�����ۿν�ѧ����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxCoursePlanEntity> selectListJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getXh() != null && !"".equals(sqlWhere.getXh())){
            	criteria.andXhEqualTo(sqlWhere.getXh());
            }
            if(sqlWhere.getShkxuexid() != null && !"".equals(sqlWhere.getShkxuexid())){
            	criteria.andShkxuexidEqualTo(sqlWhere.getShkxuexid());
            }
            if(sqlWhere.getNj()!=null && !sqlWhere.getNj().equals("")){
                criteria.andNjLike("%"+sqlWhere.getNj()+"%");
            }
            if(sqlWhere.getXshszzhy()!=null && !sqlWhere.getXshszzhy().equals("")){
                criteria.andXshszzhyLike("%"+sqlWhere.getXshszzhy()+"%");
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
            List<JxCoursePlanEntity> entitylist=jxCoursePlanDao.selectListJxCoursePlanBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCoursePlanBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxCoursePlanDao.selectListJxCoursePlanBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxCoursePlanEntity selectJxCoursePlanByPrimaryKey(String xh) {
        try {
            JxCoursePlanEntity entity = jxCoursePlanDao.selectJxCoursePlanByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,������Ϣ
      */
    public ExcuteResult insertJxCoursePlan(JxCoursePlanEntity entity) {
        try {
            return jxCoursePlanDao.insertJxCoursePlan(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCoursePlanSelective(JxCoursePlanEntity entity) {
        try {
            return jxCoursePlanDao.insertJxCoursePlanSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
      */
    public ExcuteResult updateJxCoursePlanByPrimaryKey(JxCoursePlanEntity entity) {
        try {
            return jxCoursePlanDao.updateJxCoursePlanByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxCoursePlanBySqlWhere(JxCoursePlanEntity entity, JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCoursePlanDao.updateJxCoursePlanBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
      */
    public ExcuteResult updateJxCoursePlanBySqlWhereSelective(JxCoursePlanEntity entity, JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCoursePlanDao.updateJxCoursePlanBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
      */
    public ExcuteResult updateJxCoursePlanByPrimaryKeySelective(JxCoursePlanEntity entity) {
        try {
            return jxCoursePlanDao.updateJxCoursePlanByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxCoursePlanByPrimaryKey(String xh) {
        try {
            return jxCoursePlanDao.deleteJxCoursePlanByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCoursePlanDao.deleteJxCoursePlanBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCoursePlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_COURSEPLAN,���ۿν�ѧ���ȱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxCoursePlanDao.countJxCoursePlanBySqlWhere(sqlWhere);
    }

    public void setJxCoursePlanDao(IJxCoursePlanDao jxCoursePlanDao) {
        this.jxCoursePlanDao = jxCoursePlanDao;
    }

    public IJxCoursePlanDao getJxCoursePlanDao() {
        return jxCoursePlanDao;
    }
}