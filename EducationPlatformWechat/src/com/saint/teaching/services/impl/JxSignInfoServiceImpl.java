package com.saint.teaching.services.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.dao.IJxSignInfoDao;
import com.saint.teaching.services.IJxSignInfoService;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_SIGN_INFO
*��˵��ʵϰѧԱǩ����Ϣ
  */
public class JxSignInfoServiceImpl implements IJxSignInfoService {
    private IJxSignInfoDao jxSignInfoDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_SIGN_INFO
    *��˵��ʵϰѧԱǩ����Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxSignInfoEntity> selectListPageJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
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
            List<JxSignInfoEntity> entitylist=jxSignInfoDao.selectListPageJxSignInfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_SIGN_INFO
     * ��˵��ʵϰѧԱǩ����Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxSignInfoEntity> selectListJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getSigncs()!=null && !sqlWhere.getSigncs().equals("")){
            	BigDecimal bd=new BigDecimal(sqlWhere.getSigncs());
                criteria.andSigncsEqualTo(bd);
            }
            if(sqlWhere.getMarking()!=null && !sqlWhere.getMarking().equals("")){
                criteria.andMarkingEqualTo(sqlWhere.getMarking());
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
            List<JxSignInfoEntity> entitylist=jxSignInfoDao.selectListJxSignInfoBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxSignInfoBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxSignInfoDao.selectListJxSignInfoBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxSignInfoEntity selectJxSignInfoByPrimaryKey(String xh) {
        try {
            JxSignInfoEntity entity = jxSignInfoDao.selectJxSignInfoByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxSignInfo(JxSignInfoEntity entity) {
        try {
            return jxSignInfoDao.insertJxSignInfo(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxSignInfoSelective(JxSignInfoEntity entity) {
        try {
            return jxSignInfoDao.insertJxSignInfoSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxSignInfoByPrimaryKey(JxSignInfoEntity entity) {
        try {
            return jxSignInfoDao.updateJxSignInfoByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxSignInfoBySqlWhere(JxSignInfoEntity entity, JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxSignInfoDao.updateJxSignInfoBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxSignInfoBySqlWhereSelective(JxSignInfoEntity entity, JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxSignInfoDao.updateJxSignInfoBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxSignInfoByPrimaryKeySelective(JxSignInfoEntity entity) {
        try {
            return jxSignInfoDao.updateJxSignInfoByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxSignInfoByPrimaryKey(String xh) {
        try {
            return jxSignInfoDao.deleteJxSignInfoByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxSignInfoDao.deleteJxSignInfoBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxSignInfo+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_SIGN_INFO,ʵϰѧԱǩ����Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxSignInfoDao.countJxSignInfoBySqlWhere(sqlWhere);
    }

    public void setJxSignInfoDao(IJxSignInfoDao jxSignInfoDao) {
        this.jxSignInfoDao = jxSignInfoDao;
    }

    public IJxSignInfoDao getJxSignInfoDao() {
        return jxSignInfoDao;
    }
}