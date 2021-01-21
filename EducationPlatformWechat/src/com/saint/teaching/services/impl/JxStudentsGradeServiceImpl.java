package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsGradeEntity;
import com.saint.teaching.dao.IJxStudentsGradeDao;
import com.saint.teaching.services.IJxStudentsGradeService;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDENTS_GRADE
*��˵��ѧԱ������ϸ
  */
public class JxStudentsGradeServiceImpl implements IJxStudentsGradeService {
    private IJxStudentsGradeDao jxStudentsGradeDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS_GRADE
    *��˵��ѧԱ������ϸ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsGradeEntity> selectListPageJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStudentname() != null && !"".equals(sqlWhere.getStudentname())){
            	criteria.andStudentnameLike("%"+sqlWhere.getStudentname()+"%");
            }
            if(sqlWhere.getEmplx() != null && !"".equals(sqlWhere.getEmplx())){
            	criteria.andEmplxEqualTo(sqlWhere.getEmplx());
            }
            if(sqlWhere.getSybj() != null && !"".equals(sqlWhere.getSybj())){
            	criteria.andSybjEqualTo(sqlWhere.getSybj());
            }
            if(sqlWhere.getStudentid() != null && !"".equals(sqlWhere.getStudentid())){
            	criteria.andStudentidEqualTo(sqlWhere.getStudentid());
            }
            if(sqlWhere.getRemark1() != null && !"".equals(sqlWhere.getRemark1())){
            	criteria.andRemark1EqualTo(sqlWhere.getRemark1());
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
            List<JxStudentsGradeEntity> entitylist=jxStudentsGradeDao.selectListPageJxStudentsGradeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDENTS_GRADE
     * ��˵��ѧԱ������ϸ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsGradeEntity> selectListJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStudentid() != null && !"".equals(sqlWhere.getStudentid())){
            	criteria.andStudentidEqualTo(sqlWhere.getStudentid());
            }
            String jjfsj = sqlWhere.getJjfsj();
            System.out.println(jjfsj);
            String createdate = sqlWhere.getCreatedate();
            if(sqlWhere.getJjfsj() != null && !"".equals(sqlWhere.getJjfsj()) && sqlWhere.getCreatedate() != null && !"".equals(sqlWhere.getCreatedate())){
              	 SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//������
              	 try {
              		Date start = dateFormat.parse(sqlWhere.getJjfsj());
   					Date end = dateFormat.parse(sqlWhere.getCreatedate());
   					criteria.andJjfsjBetween(start, end);
   				} catch (ParseException e) {
   					e.printStackTrace();
   				}
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
            List<JxStudentsGradeEntity> entitylist=jxStudentsGradeDao.selectListJxStudentsGradeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsGradeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsGradeDao.selectListJxStudentsGradeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsGradeEntity selectJxStudentsGradeByPrimaryKey(String xh) {
        try {
            JxStudentsGradeEntity entity = jxStudentsGradeDao.selectJxStudentsGradeByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,������Ϣ
      */
    public ExcuteResult insertJxStudentsGrade(JxStudentsGradeEntity entity) {
        try {
            return jxStudentsGradeDao.insertJxStudentsGrade(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsGradeSelective(JxStudentsGradeEntity entity) {
        try {
            return jxStudentsGradeDao.insertJxStudentsGradeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxStudentsGradeByPrimaryKey(JxStudentsGradeEntity entity) {
        try {
            return jxStudentsGradeDao.updateJxStudentsGradeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsGradeBySqlWhere(JxStudentsGradeEntity entity, JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsGradeDao.updateJxStudentsGradeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxStudentsGradeBySqlWhereSelective(JxStudentsGradeEntity entity, JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsGradeDao.updateJxStudentsGradeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,�޸�
      */
    public ExcuteResult updateJxStudentsGradeByPrimaryKeySelective(JxStudentsGradeEntity entity) {
        try {
            return jxStudentsGradeDao.updateJxStudentsGradeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsGradeByPrimaryKey(String xh) {
        try {
            return jxStudentsGradeDao.deleteJxStudentsGradeByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsGradeDao.deleteJxStudentsGradeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsGrade+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_GRADE,ѧԱ������ϸ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudentsGradeDao.countJxStudentsGradeBySqlWhere(sqlWhere);
    }
   
	@Override
	public String queryNextIndex() {
		try {
	   		return jxStudentsGradeDao.queryNextIndex();
	    } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException("������ѯ"+"ʧ�ܣ�"+e.getMessage());
	    }
	}
    
    public void setJxStudentsGradeDao(IJxStudentsGradeDao jxStudentsGradeDao) {
        this.jxStudentsGradeDao = jxStudentsGradeDao;
    }

    public IJxStudentsGradeDao getJxStudentsGradeDao() {
        return jxStudentsGradeDao;
    }


}