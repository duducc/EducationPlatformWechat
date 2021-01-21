package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.dao.IJxClassDao;
import com.saint.teaching.services.IJxClassService;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;
import com.saint.teaching.sqlWhere.JxClassSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_CLASS
*��˵����ѧ�༶
  */
public class JxClassServiceImpl implements IJxClassService {
    private IJxClassDao jxClassDao;
    @Override
	public int selectJxClassSequence() {
	    return jxClassDao.selectJxClassSequence();
	}
    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_CLASS
    *��˵����ѧ�༶
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxClassEntity> selectListPageJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
            }
            if(sqlWhere.getGrade()!=null && !sqlWhere.getGrade().equals("")){
                criteria.andGradeEqualTo(sqlWhere.getGrade());
            }
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
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
            List<JxClassEntity> entitylist=jxClassDao.selectListPageJxClassBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_CLASS
     * ��˵����ѧ�༶
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxClassEntity> selectListJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
            }
            if(sqlWhere.getGrade()!=null && !sqlWhere.getGrade().equals("")){
                criteria.andGradeEqualTo(sqlWhere.getGrade());
            }
            if(sqlWhere.getProfesstypeid()!=null && !sqlWhere.getProfesstypeid().equals("")){
                criteria.andProfesstypeidEqualTo(sqlWhere.getProfesstypeid());
            }
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameEqualTo(sqlWhere.getName());
            }
            if(sqlWhere.getType()!=null && !sqlWhere.getType().equals("")){
                criteria.andTypeEqualTo(sqlWhere.getType());
            }
            if(sqlWhere.getBanji()!=null && !sqlWhere.getBanji().equals("")){
                criteria.andBanjiEqualTo(sqlWhere.getBanji());
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
            List<JxClassEntity> entitylist=jxClassDao.selectListJxClassBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxClassBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxClassDao.selectListJxClassBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxClassEntity selectJxClassByPrimaryKey(String xh) {
        try {
            JxClassEntity entity = jxClassDao.selectJxClassByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,������Ϣ
      */
    public ExcuteResult insertJxClass(JxClassEntity entity) {
        try {
            return jxClassDao.insertJxClass(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxClassSelective(JxClassEntity entity) {
        try {
            return jxClassDao.insertJxClassSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_CLASS,��ѧ�༶��,�޸�
      */
    public ExcuteResult updateJxClassByPrimaryKey(JxClassEntity entity) {
        try {
            return jxClassDao.updateJxClassByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxClassBySqlWhere(JxClassEntity entity, JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxClassDao.updateJxClassBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_CLASS,��ѧ�༶��,�޸�
      */
    public ExcuteResult updateJxClassBySqlWhereSelective(JxClassEntity entity, JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxClassDao.updateJxClassBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_CLASS,��ѧ�༶��,�޸�
      */
    public ExcuteResult updateJxClassByPrimaryKeySelective(JxClassEntity entity) {
        try {
            return jxClassDao.updateJxClassByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxClassByPrimaryKey(String xh) {
        try {
            return jxClassDao.deleteJxClassByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS,��ѧ�༶��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxClassDao.deleteJxClassBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_CLASS,��ѧ�༶��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxClassBySqlWhere(JxClassSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxClassDao.countJxClassBySqlWhere(sqlWhere);
    }

    public void setJxClassDao(IJxClassDao jxClassDao) {
        this.jxClassDao = jxClassDao;
    }

    public IJxClassDao getJxClassDao() {
        return jxClassDao;
    }
}