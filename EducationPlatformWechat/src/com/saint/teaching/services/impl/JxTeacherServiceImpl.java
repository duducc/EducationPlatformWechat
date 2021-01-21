package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeacherEntity;
import com.saint.teaching.dao.IJxTeacherDao;
import com.saint.teaching.services.IJxTeacherService;
import com.saint.teaching.sqlWhere.JxTeacherSqlWhere;
import com.saint.teaching.sqlWhere.JxTeacherSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_TEACHER
*��˵����ʦ��Ϣ
  */
public class JxTeacherServiceImpl implements IJxTeacherService {
    private IJxTeacherDao jxTeacherDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_TEACHER
    *��˵����ʦ��Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxTeacherEntity> selectListPageJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsernumber()!=null && !sqlWhere.getUsernumber().equals("")){
                criteria.andUsernumberEqualTo(sqlWhere.getUsernumber());
            }
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
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
            List<JxTeacherEntity> entitylist=jxTeacherDao.selectListPageJxTeacherBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_TEACHER
     * ��˵����ʦ��Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxTeacherEntity> selectListJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsernumber()!=null && !sqlWhere.getUsernumber().equals("")){
                criteria.andUsernumberEqualTo(sqlWhere.getUsernumber());
            }
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
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
            List<JxTeacherEntity> entitylist=jxTeacherDao.selectListJxTeacherBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeacherBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxTeacherDao.selectListJxTeacherBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxTeacherEntity selectJxTeacherByPrimaryKey(String usernumber) {
        try {
            JxTeacherEntity entity = jxTeacherDao.selectJxTeacherByPrimaryKey(usernumber);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxTeacher(JxTeacherEntity entity) {
        try {
            return jxTeacherDao.insertJxTeacher(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeacherSelective(JxTeacherEntity entity) {
        try {
            return jxTeacherDao.insertJxTeacherSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_TEACHER,��ʦ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxTeacherByPrimaryKey(JxTeacherEntity entity) {
        try {
            return jxTeacherDao.updateJxTeacherByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxTeacherBySqlWhere(JxTeacherEntity entity, JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeacherDao.updateJxTeacherBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_TEACHER,��ʦ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxTeacherBySqlWhereSelective(JxTeacherEntity entity, JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeacherDao.updateJxTeacherBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_TEACHER,��ʦ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxTeacherByPrimaryKeySelective(JxTeacherEntity entity) {
        try {
            return jxTeacherDao.updateJxTeacherByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxTeacherByPrimaryKey(String usernumber) {
        try {
            return jxTeacherDao.deleteJxTeacherByPrimaryKey(usernumber);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHER,��ʦ��Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeacherDao.deleteJxTeacherBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_TEACHER,��ʦ��Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxTeacherDao.countJxTeacherBySqlWhere(sqlWhere);
    }

    public void setJxTeacherDao(IJxTeacherDao jxTeacherDao) {
        this.jxTeacherDao = jxTeacherDao;
    }

    public IJxTeacherDao getJxTeacherDao() {
        return jxTeacherDao;
    }
}