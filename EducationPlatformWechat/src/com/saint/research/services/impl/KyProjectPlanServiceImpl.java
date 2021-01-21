package com.saint.research.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyProjectPlanEntity;
import com.saint.research.dao.IKyProjectPlanDao;
import com.saint.research.services.IKyProjectPlanService;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere.Criteria;

/**
*��ע����Ϣ
*����KY_PROJECTPLAN
*��˵��������ȼƻ�
  */
public class KyProjectPlanServiceImpl implements IKyProjectPlanService {
    private IKyProjectPlanDao kyProjectPlanDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��KY_PROJECTPLAN
    *��˵��������ȼƻ�
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<KyProjectPlanEntity> selectListPageKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getRemark1()!=null && !sqlWhere.getRemark1().equals("")){
                criteria.andRemark1Like("%"+sqlWhere.getRemark1()+"%");
            }
            if(sqlWhere.getTaskgoal()!=null && !sqlWhere.getTaskgoal().equals("")){
                criteria.andTaskgoalLike("%"+sqlWhere.getTaskgoal()+"%");
            }
            if(sqlWhere.getExcuteusername()!=null && !sqlWhere.getExcuteusername().equals("")){
                criteria.andExcuteusernameLike("%"+sqlWhere.getExcuteusername()+"%");
            }
            if(sqlWhere.getExcuteuserid()!=null && !sqlWhere.getExcuteuserid().equals("")){
                criteria.andExcuteuseridLike("%"+sqlWhere.getExcuteuserid()+"%");
            }
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
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
            List<KyProjectPlanEntity> entitylist=kyProjectPlanDao.selectListPageKyProjectPlanBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��KY_PROJECTPLAN
     * ��˵��������ȼƻ�
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<KyProjectPlanEntity> selectListKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
            if(sqlWhere.getExcuteuserid()!=null && !sqlWhere.getExcuteuserid().equals("")){
                criteria.andExcuteuseridEqualTo(sqlWhere.getExcuteuserid());
            }
            if(sqlWhere.getXh()!=null && !sqlWhere.getXh().equals("")){
                criteria.andXhNotEqualTo(sqlWhere.getXh());
            }
            if(sqlWhere.getTaskgoal()!=null && !sqlWhere.getTaskgoal().equals("")){
                criteria.andTaskgoalEqualTo(sqlWhere.getTaskgoal());
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
            List<KyProjectPlanEntity> entitylist=kyProjectPlanDao.selectListKyProjectPlanBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyProjectPlanBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=kyProjectPlanDao.selectListKyProjectPlanBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public KyProjectPlanEntity selectKyProjectPlanByPrimaryKey(String xh) {
        try {
            KyProjectPlanEntity entity = kyProjectPlanDao.selectKyProjectPlanByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,������Ϣ
      */
    public ExcuteResult insertKyProjectPlan(KyProjectPlanEntity entity) {
        try {
            return kyProjectPlanDao.insertKyProjectPlan(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyProjectPlanSelective(KyProjectPlanEntity entity) {
        try {
            return kyProjectPlanDao.insertKyProjectPlanSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*KY_PROJECTPLAN,������ȼƻ���,�޸�
      */
    public ExcuteResult updateKyProjectPlanByPrimaryKey(KyProjectPlanEntity entity) {
        try {
            return kyProjectPlanDao.updateKyProjectPlanByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateKyProjectPlanBySqlWhere(KyProjectPlanEntity entity, KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kyProjectPlanDao.updateKyProjectPlanBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*KY_PROJECTPLAN,������ȼƻ���,�޸�
      */
    public ExcuteResult updateKyProjectPlanBySqlWhereSelective(KyProjectPlanEntity entity, KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kyProjectPlanDao.updateKyProjectPlanBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*KY_PROJECTPLAN,������ȼƻ���,�޸�
      */
    public ExcuteResult updateKyProjectPlanByPrimaryKeySelective(KyProjectPlanEntity entity) {
        try {
            return kyProjectPlanDao.updateKyProjectPlanByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteKyProjectPlanByPrimaryKey(String xh) {
        try {
            return kyProjectPlanDao.deleteKyProjectPlanByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTPLAN,������ȼƻ���,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kyProjectPlanDao.deleteKyProjectPlanBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKyProjectPlan+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*KY_PROJECTPLAN,������ȼƻ���
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)kyProjectPlanDao.countKyProjectPlanBySqlWhere(sqlWhere);
    }

    public void setKyProjectPlanDao(IKyProjectPlanDao kyProjectPlanDao) {
        this.kyProjectPlanDao = kyProjectPlanDao;
    }

    public IKyProjectPlanDao getKyProjectPlanDao() {
        return kyProjectPlanDao;
    }
}