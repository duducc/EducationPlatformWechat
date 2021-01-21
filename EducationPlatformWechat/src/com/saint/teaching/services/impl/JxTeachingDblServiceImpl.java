package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingDblEntity;
import com.saint.teaching.dao.IJxTeachingDblDao;
import com.saint.teaching.services.IJxTeachingDblService;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_TEACHING_DBL
*��˵������
  */
public class JxTeachingDblServiceImpl implements IJxTeachingDblService {
    private IJxTeachingDblDao jxTeachingDblDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_TEACHING_DBL
    *��˵������
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxTeachingDblEntity> selectListPageJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
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
            List<JxTeachingDblEntity> entitylist=jxTeachingDblDao.selectListPageJxTeachingDblBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_TEACHING_DBL
     * ��˵������
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingDblEntity> selectListJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
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
            List<JxTeachingDblEntity> entitylist=jxTeachingDblDao.selectListJxTeachingDblBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingDblBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxTeachingDblDao.selectListJxTeachingDblBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxTeachingDblEntity selectJxTeachingDblByPrimaryKey(String xh) {
        try {
            JxTeachingDblEntity entity = jxTeachingDblDao.selectJxTeachingDblByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,������Ϣ
      */
    public ExcuteResult insertJxTeachingDbl(JxTeachingDblEntity entity) {
        try {
            return jxTeachingDblDao.insertJxTeachingDbl(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingDblSelective(JxTeachingDblEntity entity) {
        try {
            return jxTeachingDblDao.insertJxTeachingDblSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_TEACHING_DBL,������,�޸�
      */
    public ExcuteResult updateJxTeachingDblByPrimaryKey(JxTeachingDblEntity entity) {
        try {
            return jxTeachingDblDao.updateJxTeachingDblByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxTeachingDblBySqlWhere(JxTeachingDblEntity entity, JxTeachingDblSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingDblDao.updateJxTeachingDblBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_TEACHING_DBL,������,�޸�
      */
    public ExcuteResult updateJxTeachingDblBySqlWhereSelective(JxTeachingDblEntity entity, JxTeachingDblSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingDblDao.updateJxTeachingDblBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_TEACHING_DBL,������,�޸�
      */
    public ExcuteResult updateJxTeachingDblByPrimaryKeySelective(JxTeachingDblEntity entity) {
        try {
            return jxTeachingDblDao.updateJxTeachingDblByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingDblByPrimaryKey(String xh) {
        try {
            return jxTeachingDblDao.deleteJxTeachingDblByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_DBL,������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingDblDao.deleteJxTeachingDblBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingDbl+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_TEACHING_DBL,������
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuId()!=null && !sqlWhere.getStuId().equals("")){
                criteria.andStuIdEqualTo(sqlWhere.getStuId());
            }
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
            }
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxTeachingDblDao.countJxTeachingDblBySqlWhere(sqlWhere);
    }

    public void setJxTeachingDblDao(IJxTeachingDblDao jxTeachingDblDao) {
        this.jxTeachingDblDao = jxTeachingDblDao;
    }

    public IJxTeachingDblDao getJxTeachingDblDao() {
        return jxTeachingDblDao;
    }
}