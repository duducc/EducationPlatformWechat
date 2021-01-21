package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.dao.IJxClassStudentsDao;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_CLASS_STUDENTS
*��˵����ѧѧ����Ϣ
  */
public class JxClassStudentsServiceImpl implements IJxClassStudentsService {
    private IJxClassStudentsDao jxClassStudentsDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_CLASS_STUDENTS
    *��˵����ѧѧ����Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxClassStudentsEntity> selectListPageJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
            }
            if(sqlWhere.getZuid()!=null && !sqlWhere.getZuid().equals("")){
                criteria.andZuidEqualTo(sqlWhere.getZuid());
            }
            if(sqlWhere.getStudentname()!=null && !sqlWhere.getStudentname().equals("")){
                criteria.andStudentnameLike("%"+sqlWhere.getStudentname()+"%");
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
            List<JxClassStudentsEntity> entitylist=jxClassStudentsDao.selectListPageJxClassStudentsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_CLASS_STUDENTS
     * ��˵����ѧѧ����Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxClassStudentsEntity> selectListJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStudentid()!=null && !sqlWhere.getStudentid().equals("")){
                criteria.andStudentidEqualTo(sqlWhere.getStudentid());
            }
            if(sqlWhere.getRemark2()!=null && !sqlWhere.getRemark2().equals("")){
                criteria.andRemark2EqualTo(sqlWhere.getRemark2());
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
            List<JxClassStudentsEntity> entitylist=jxClassStudentsDao.selectListJxClassStudentsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxClassStudentsBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxClassStudentsDao.selectListJxClassStudentsBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxClassStudentsEntity selectJxClassStudentsByPrimaryKey(String xh) {
        try {
            JxClassStudentsEntity entity = jxClassStudentsDao.selectJxClassStudentsByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxClassStudents(JxClassStudentsEntity entity) {
        try {
            return jxClassStudentsDao.insertJxClassStudents(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxClassStudentsSelective(JxClassStudentsEntity entity) {
        try {
            return jxClassStudentsDao.insertJxClassStudentsSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxClassStudentsByPrimaryKey(JxClassStudentsEntity entity) {
        try {
            return jxClassStudentsDao.updateJxClassStudentsByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxClassStudentsBySqlWhere(JxClassStudentsEntity entity, JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxClassStudentsDao.updateJxClassStudentsBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxClassStudentsBySqlWhereSelective(JxClassStudentsEntity entity, JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxClassStudentsDao.updateJxClassStudentsBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxClassStudentsByPrimaryKeySelective(JxClassStudentsEntity entity) {
        try {
            return jxClassStudentsDao.updateJxClassStudentsByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxClassStudentsByPrimaryKey(String xh) {
        try {
            return jxClassStudentsDao.deleteJxClassStudentsByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxClassStudentsDao.deleteJxClassStudentsBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxClassStudents+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_CLASS_STUDENTS,��ѧѧ����Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxClassStudentsBySqlWhere(JxClassStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxClassStudentsDao.countJxClassStudentsBySqlWhere(sqlWhere);
    }

    public void setJxClassStudentsDao(IJxClassStudentsDao jxClassStudentsDao) {
        this.jxClassStudentsDao = jxClassStudentsDao;
    }

    public IJxClassStudentsDao getJxClassStudentsDao() {
        return jxClassStudentsDao;
    }
}