package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.dao.IJxStudentsDao;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDENTS
*��˵��ѧԱ��Ϣ
  */
public class JxStudentsServiceImpl implements IJxStudentsService {
    private IJxStudentsDao jxStudentsDao;
    
    
    @Override
	public int selectJXStudentsSequence() {
	    return jxStudentsDao.selectJXStudentsSequence();
	}
    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS
    *��˵��ѧԱ��Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsEntity> selectListPageJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameLike("%"+sqlWhere.getName()+"%");
            }
            if(sqlWhere.getSex()!=null && !sqlWhere.getSex().equals("")){
                criteria.andSexEqualTo(sqlWhere.getSex());
            }
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
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
            List<JxStudentsEntity> entitylist=jxStudentsDao.selectListPageJxStudentsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDENTS
     * ��˵��ѧԱ��Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsEntity> selectListJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getName()!=null && !sqlWhere.getName().equals("")){
                criteria.andNameEqualTo(sqlWhere.getName());
            }
            if(sqlWhere.getIdcard()!=null && !sqlWhere.getIdcard().equals("")){
                criteria.andIdcardEqualTo(sqlWhere.getIdcard());
            }
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
            }
            if(sqlWhere.getRemark2()!=null && !sqlWhere.getRemark2().equals("")){
                criteria.andRemark2EqualTo(sqlWhere.getRemark2());
            }
            if(sqlWhere.getTelnumber()!=null && !sqlWhere.getTelnumber().equals("")){
                criteria.andTelnumberEqualTo(sqlWhere.getTelnumber());
            }
            if(sqlWhere.getPertype()!=null && !sqlWhere.getPertype().equals("")){
                criteria.andPertypeEqualTo(sqlWhere.getPertype());
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
            List<JxStudentsEntity> entitylist=jxStudentsDao.selectListJxStudentsBySqlWhere(sqlWhere);
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
    public List<HashMap<String,Object>> selectListJxStudentsBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsDao.selectListJxStudentsBySql(sql);
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
    public JxStudentsEntity selectJxStudentsByPrimaryKey(String xh) {
        try {
            JxStudentsEntity entity = jxStudentsDao.selectJxStudentsByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxStudents(JxStudentsEntity entity) {
        try {
            return jxStudentsDao.insertJxStudents(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsSelective(JxStudentsEntity entity) {
        try {
            return jxStudentsDao.insertJxStudentsSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS,ѧԱ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsByPrimaryKey(JxStudentsEntity entity) {
        try {
            return jxStudentsDao.updateJxStudentsByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsBySqlWhere(JxStudentsEntity entity, JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsDao.updateJxStudentsBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS,ѧԱ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsBySqlWhereSelective(JxStudentsEntity entity, JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsDao.updateJxStudentsBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS,ѧԱ��Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsByPrimaryKeySelective(JxStudentsEntity entity) {
        try {
            return jxStudentsDao.updateJxStudentsByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsByPrimaryKey(String xh) {
        try {
            return jxStudentsDao.deleteJxStudentsByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS,ѧԱ��Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsDao.deleteJxStudentsBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS,ѧԱ��Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsBySqlWhere(JxStudentsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudentsDao.countJxStudentsBySqlWhere(sqlWhere);
    }

    public void setJxStudentsDao(IJxStudentsDao jxStudentsDao) {
        this.jxStudentsDao = jxStudentsDao;
    }

    public IJxStudentsDao getJxStudentsDao() {
        return jxStudentsDao;
    }
}