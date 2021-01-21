package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxEvaluateTeacherEntity;
import com.saint.teaching.dao.IJxEvaluateTeacherDao;
import com.saint.teaching.services.IJxEvaluateTeacherService;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_EVALUATE_TEACHER
*��˵����ʦ���۱�
  */
public class JxEvaluateTeacherServiceImpl implements IJxEvaluateTeacherService {
    private IJxEvaluateTeacherDao jxEvaluateTeacherDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_EVALUATE_TEACHER
    *��˵����ʦ���۱�
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxEvaluateTeacherEntity> selectListPageJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
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
            List<JxEvaluateTeacherEntity> entitylist=jxEvaluateTeacherDao.selectListPageJxEvaluateTeacherBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_EVALUATE_TEACHER
     * ��˵����ʦ���۱�
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxEvaluateTeacherEntity> selectListJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getDepid()!=null && !sqlWhere.getDepid().equals("")){
                criteria.andDepidEqualTo(sqlWhere.getDepid());
            }
            if(sqlWhere.getStudentid()!=null && !sqlWhere.getStudentid().equals("")){
                criteria.andStudentidEqualTo(sqlWhere.getStudentid());
            }
            if(sqlWhere.getTeacherid()!=null && !sqlWhere.getTeacherid().equals("")){
                criteria.andTeacheridEqualTo(sqlWhere.getTeacherid());
            }
            if(sqlWhere.getRemark1()!=null && !sqlWhere.getRemark1().equals("")){
                criteria.andRemark1EqualTo(sqlWhere.getRemark1());
            }
            if(sqlWhere.getRemark2()!=null && !sqlWhere.getRemark2().equals("")){
                criteria.andRemark2EqualTo(sqlWhere.getRemark2());
            }
            if(sqlWhere.getStudentname()!=null && !sqlWhere.getStudentname().equals("")){
                criteria.andStudentnameLike("%"+sqlWhere.getStudentname()+"%");
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
            List<JxEvaluateTeacherEntity> entitylist=jxEvaluateTeacherDao.selectListJxEvaluateTeacherBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxEvaluateTeacherBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxEvaluateTeacherDao.selectListJxEvaluateTeacherBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxEvaluateTeacherEntity selectJxEvaluateTeacherByPrimaryKey(String xh) {
        try {
            JxEvaluateTeacherEntity entity = jxEvaluateTeacherDao.selectJxEvaluateTeacherByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,������Ϣ
      */
    public ExcuteResult insertJxEvaluateTeacher(JxEvaluateTeacherEntity entity) {
        try {
            return jxEvaluateTeacherDao.insertJxEvaluateTeacher(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxEvaluateTeacherSelective(JxEvaluateTeacherEntity entity) {
        try {
            return jxEvaluateTeacherDao.insertJxEvaluateTeacherSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,�޸�
      */
    public ExcuteResult updateJxEvaluateTeacherByPrimaryKey(JxEvaluateTeacherEntity entity) {
        try {
            return jxEvaluateTeacherDao.updateJxEvaluateTeacherByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherEntity entity, JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxEvaluateTeacherDao.updateJxEvaluateTeacherBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,�޸�
      */
    public ExcuteResult updateJxEvaluateTeacherBySqlWhereSelective(JxEvaluateTeacherEntity entity, JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxEvaluateTeacherDao.updateJxEvaluateTeacherBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,�޸�
      */
    public ExcuteResult updateJxEvaluateTeacherByPrimaryKeySelective(JxEvaluateTeacherEntity entity) {
        try {
            return jxEvaluateTeacherDao.updateJxEvaluateTeacherByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxEvaluateTeacherByPrimaryKey(String xh) {
        try {
            return jxEvaluateTeacherDao.deleteJxEvaluateTeacherByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_EVALUATE_TEACHER,��ʦ���۱��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxEvaluateTeacherDao.deleteJxEvaluateTeacherBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxEvaluateTeacher+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_EVALUATE_TEACHER,��ʦ���۱��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxEvaluateTeacherDao.countJxEvaluateTeacherBySqlWhere(sqlWhere);
    }

    public void setJxEvaluateTeacherDao(IJxEvaluateTeacherDao jxEvaluateTeacherDao) {
        this.jxEvaluateTeacherDao = jxEvaluateTeacherDao;
    }

    public IJxEvaluateTeacherDao getJxEvaluateTeacherDao() {
        return jxEvaluateTeacherDao;
    }
}