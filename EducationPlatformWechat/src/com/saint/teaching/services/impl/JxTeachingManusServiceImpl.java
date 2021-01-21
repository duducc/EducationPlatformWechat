package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.dao.IJxTeachingManusDao;
import com.saint.teaching.services.IJxTeachingManusService;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_TEACHING_MANUS
*��˵�������ֲ����
  */
public class JxTeachingManusServiceImpl implements IJxTeachingManusService {
    private IJxTeachingManusDao jxTeachingManusDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_TEACHING_MANUS
    *��˵�������ֲ����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxTeachingManusEntity> selectListPageJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
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
            List<JxTeachingManusEntity> entitylist=jxTeachingManusDao.selectListPageJxTeachingManusBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_TEACHING_MANUS
     * ��˵�������ֲ����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingManusEntity> selectListJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getManuDm()!=null && !sqlWhere.getManuDm().equals("")){
                criteria.andManuDmEqualTo(sqlWhere.getManuDm());
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
            List<JxTeachingManusEntity> entitylist=jxTeachingManusDao.selectListJxTeachingManusBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingManusBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxTeachingManusDao.selectListJxTeachingManusBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxTeachingManusEntity selectJxTeachingManusByPrimaryKey(String manuId) {
        try {
            JxTeachingManusEntity entity = jxTeachingManusDao.selectJxTeachingManusByPrimaryKey(manuId);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,������Ϣ
      */
    public ExcuteResult insertJxTeachingManus(JxTeachingManusEntity entity) {
        try {
            return jxTeachingManusDao.insertJxTeachingManus(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingManusSelective(JxTeachingManusEntity entity) {
        try {
            return jxTeachingManusDao.insertJxTeachingManusSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_TEACHING_MANUS,�����ֲ�����,�޸�
      */
    public ExcuteResult updateJxTeachingManusByPrimaryKey(JxTeachingManusEntity entity) {
        try {
            return jxTeachingManusDao.updateJxTeachingManusByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxTeachingManusBySqlWhere(JxTeachingManusEntity entity, JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingManusDao.updateJxTeachingManusBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_TEACHING_MANUS,�����ֲ�����,�޸�
      */
    public ExcuteResult updateJxTeachingManusBySqlWhereSelective(JxTeachingManusEntity entity, JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingManusDao.updateJxTeachingManusBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_TEACHING_MANUS,�����ֲ�����,�޸�
      */
    public ExcuteResult updateJxTeachingManusByPrimaryKeySelective(JxTeachingManusEntity entity) {
        try {
            return jxTeachingManusDao.updateJxTeachingManusByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManusByPrimaryKey(String manuId) {
        try {
            return jxTeachingManusDao.deleteJxTeachingManusByPrimaryKey(manuId);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUS,�����ֲ�����,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingManusDao.deleteJxTeachingManusBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingManus+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_TEACHING_MANUS,�����ֲ�����
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxTeachingManusDao.countJxTeachingManusBySqlWhere(sqlWhere);
    }

    public void setJxTeachingManusDao(IJxTeachingManusDao jxTeachingManusDao) {
        this.jxTeachingManusDao = jxTeachingManusDao;
    }

    public IJxTeachingManusDao getJxTeachingManusDao() {
        return jxTeachingManusDao;
    }
}