package com.saint.research.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.research.bean.KyProjectGressEntity;
import com.saint.research.dao.IKyProjectGressDao;
import com.saint.research.services.IKyProjectGressService;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere.*;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
*��ע����Ϣ
*����KY_PROJECTGRESS
*��˵����Ŀִ������Ǽ�
  */
public class KyProjectGressServiceImpl implements IKyProjectGressService {
    private IKyProjectGressDao kyProjectGressDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��KY_PROJECTGRESS
    *��˵����Ŀִ������Ǽ�
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<KyProjectGressEntity> selectListPageKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
                criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
            }
            if(sqlWhere.getTaskname()!=null && !sqlWhere.getTaskname().equals("")){
                criteria.andTasknameLike("%"+sqlWhere.getTaskname()+"%");
            }
            if(sqlWhere.getRegperid()!=null && !sqlWhere.getRegperid().equals("")){
            	criteria.andRegperidEqualTo(sqlWhere.getRegperid());
            }
            if(sqlWhere.getTasknum()!=null && !sqlWhere.getTasknum().equals("")){
            	criteria.andTasknumEqualTo(sqlWhere.getTasknum());
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
            List<KyProjectGressEntity> entitylist=kyProjectGressDao.selectListPageKyProjectGressBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * ��ѯ��KY_PROJECTGRESS
     * ��˵����Ŀִ������Ǽ�
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<KyProjectGressEntity> selectListKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
            if(sqlWhere.getRegperid()!=null && !sqlWhere.getRegperid().equals("")){
                criteria.andRegperidEqualTo(sqlWhere.getRegperid());
            }
            if(sqlWhere.getTasknum()!=null && !sqlWhere.getTasknum().equals("")){
                criteria.andTasknumEqualTo(sqlWhere.getTasknum());
            }
            
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
                criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
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
            List<KyProjectGressEntity> entitylist=kyProjectGressDao.selectListKyProjectGressBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyProjectGressBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=kyProjectGressDao.selectListKyProjectGressBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public KyProjectGressEntity selectKyProjectGressByPrimaryKey(String xh) {
        try {
            KyProjectGressEntity entity = kyProjectGressDao.selectKyProjectGressByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,������Ϣ
      */
    public ExcuteResult insertKyProjectGress(KyProjectGressEntity entity) {
        try {
            return kyProjectGressDao.insertKyProjectGress(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyProjectGressSelective(KyProjectGressEntity entity) {
        try {
            return kyProjectGressDao.insertKyProjectGressSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,�޸�
      */
    public ExcuteResult updateKyProjectGressByPrimaryKey(KyProjectGressEntity entity) {
        try {
            return kyProjectGressDao.updateKyProjectGressByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateKyProjectGressBySqlWhere(KyProjectGressEntity entity, KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kyProjectGressDao.updateKyProjectGressBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,�޸�
      */
    public ExcuteResult updateKyProjectGressBySqlWhereSelective(KyProjectGressEntity entity, KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kyProjectGressDao.updateKyProjectGressBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,�޸�
      */
    public ExcuteResult updateKyProjectGressByPrimaryKeySelective(KyProjectGressEntity entity) {
        try {
            return kyProjectGressDao.updateKyProjectGressByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteKyProjectGressByPrimaryKey(String xh) {
        try {
            return kyProjectGressDao.deleteKyProjectGressByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
            	criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
            if(sqlWhere.getRegperid()!=null && !sqlWhere.getRegperid().equals("")){
            	criteria.andRegperidEqualTo(sqlWhere.getRegperid());
            }
            if(sqlWhere.getTasknum()!=null && !sqlWhere.getTasknum().equals("")){
            	criteria.andTasknumEqualTo(sqlWhere.getTasknum());
            }
        }
        try {
            return kyProjectGressDao.deleteKyProjectGressBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*KY_PROJECTGRESS,��Ŀִ������ǼǱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
            	criteria.andProsequenceEqualTo(sqlWhere.getProsequence());
            }
            if(sqlWhere.getRegperid()!=null && !sqlWhere.getRegperid().equals("")){
            	criteria.andRegperidEqualTo(sqlWhere.getRegperid());
            }
            if(sqlWhere.getTasknum()!=null && !sqlWhere.getTasknum().equals("")){
            	criteria.andTasknumEqualTo(sqlWhere.getTasknum());
            }
        }
        return (Integer)kyProjectGressDao.countKyProjectGressBySqlWhere(sqlWhere);
    }

    public void setKyProjectGressDao(IKyProjectGressDao kyProjectGressDao) {
        this.kyProjectGressDao = kyProjectGressDao;
    }

    public IKyProjectGressDao getKyProjectGressDao() {
        return kyProjectGressDao;
    }
}