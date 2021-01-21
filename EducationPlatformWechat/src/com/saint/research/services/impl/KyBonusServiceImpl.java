package com.saint.research.services.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyBonusEntity;
import com.saint.research.dao.IKyBonusDao;
import com.saint.research.services.IKyBonusService;
import com.saint.research.sqlWhere.KyBonusSqlWhere;
import com.saint.research.sqlWhere.KyBonusSqlWhere.Criteria;

/**
*��ע����Ϣ
*����KY_BONUS
*��˵�����н������
  */
public class KyBonusServiceImpl implements IKyBonusService {
    private IKyBonusDao kyBonusDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��KY_BONUS
    *��˵�����н������
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<KyBonusEntity> selectListPageKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
        	
            Criteria criteria = sqlWhere.createCriteria();
            if( !StringUtils.isEmpty( sqlWhere.getBonustype() )){
            	criteria.andBonustypeEqualTo( sqlWhere.getBonustype() ) ; 
            }
            
            if(!StringUtils.isEmpty(sqlWhere.getObtainname())){
            	criteria.andObtainnameEqualTo(sqlWhere.getObtainname()) ;
            }
            
            if(!StringUtils.isEmpty(sqlWhere.getTitle())){
            	criteria.andTitleEqualTo( sqlWhere.getTitle() ) ;
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
            List<KyBonusEntity> entitylist=kyBonusDao.selectListPageKyBonusBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��KY_BONUS
     * ��˵�����н������
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<KyBonusEntity> selectListKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            
            if(sqlWhere.getTitle()!=null && !sqlWhere.getTitle().equals("")){
                criteria.andTitleLike("%"+sqlWhere.getTitle()+"%");
            }
            if(sqlWhere.getObtainid()!=null && !sqlWhere.getObtainid().equals("")){
                criteria.andObtainidEqualTo(sqlWhere.getObtainid());
            }
            /**
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
            List<KyBonusEntity> entitylist=kyBonusDao.selectListKyBonusBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKyBonusBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=kyBonusDao.selectListKyBonusBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public KyBonusEntity selectKyBonusByPrimaryKey(String xh) {
        try {
            KyBonusEntity entity = kyBonusDao.selectKyBonusByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,������Ϣ
      */
    public ExcuteResult insertKyBonus(KyBonusEntity entity) {
        try {
            return kyBonusDao.insertKyBonus(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKyBonusSelective(KyBonusEntity entity) {
        try {
            return kyBonusDao.insertKyBonusSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*KY_BONUS,���н�������,�޸�
      */
    public ExcuteResult updateKyBonusByPrimaryKey(KyBonusEntity entity) {
        try {
            return kyBonusDao.updateKyBonusByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateKyBonusBySqlWhere(KyBonusEntity entity, KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kyBonusDao.updateKyBonusBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*KY_BONUS,���н�������,�޸�
      */
    public ExcuteResult updateKyBonusBySqlWhereSelective(KyBonusEntity entity, KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kyBonusDao.updateKyBonusBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*KY_BONUS,���н�������,�޸�
      */
    public ExcuteResult updateKyBonusByPrimaryKeySelective(KyBonusEntity entity) {
        try {
            return kyBonusDao.updateKyBonusByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteKyBonusByPrimaryKey(String xh) {
        try {
            return kyBonusDao.deleteKyBonusByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_BONUS,���н�������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kyBonusDao.deleteKyBonusBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKyBonus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*KY_BONUS,���н�������
    	* @param sqlWhere
    	* @return
    	*/
    public int countKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)kyBonusDao.countKyBonusBySqlWhere(sqlWhere);
    }

    public void setKyBonusDao(IKyBonusDao kyBonusDao) {
        this.kyBonusDao = kyBonusDao;
    }

    public IKyBonusDao getKyBonusDao() {
        return kyBonusDao;
    }
}