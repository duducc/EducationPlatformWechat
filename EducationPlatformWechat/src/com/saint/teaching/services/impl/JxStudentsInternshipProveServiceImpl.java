package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveKey;
import com.saint.teaching.dao.IJxStudentsInternshipProveDao;
import com.saint.teaching.services.IJxStudentsInternshipProveService;
import com.saint.teaching.sqlWhere.JxStudentsInternshipProveSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsInternshipProveSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDENTS_INTERNSHIP_PROVE
*��˵��ʵϰ֤��
  */
public class JxStudentsInternshipProveServiceImpl implements IJxStudentsInternshipProveService {
    private IJxStudentsInternshipProveDao jxStudentsInternshipProveDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS_INTERNSHIP_PROVE
    *��˵��ʵϰ֤��
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsInternshipProveEntity> selectListPageJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
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
            List<JxStudentsInternshipProveEntity> entitylist=jxStudentsInternshipProveDao.selectListPageJxStudentsInternshipProveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDENTS_INTERNSHIP_PROVE
     * ��˵��ʵϰ֤��
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsInternshipProveEntity> selectListJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStudentsid() != null && !"".equals(sqlWhere.getStudentsid())){
            	criteria.andStudentsidEqualTo(sqlWhere.getStudentsid());
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
            List<JxStudentsInternshipProveEntity> entitylist=jxStudentsInternshipProveDao.selectListJxStudentsInternshipProveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsInternshipProveBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsInternshipProveDao.selectListJxStudentsInternshipProveBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsInternshipProveEntity selectJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key) {
        try {
            JxStudentsInternshipProveEntity entity = jxStudentsInternshipProveDao.selectJxStudentsInternshipProveByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,������Ϣ
      */
    public ExcuteResult insertJxStudentsInternshipProve(JxStudentsInternshipProveEntity entity) {
        try {
            return jxStudentsInternshipProveDao.insertJxStudentsInternshipProve(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsInternshipProveSelective(JxStudentsInternshipProveEntity entity) {
        try {
            return jxStudentsInternshipProveDao.insertJxStudentsInternshipProveSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
      */
    public ExcuteResult updateJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveEntity entity) {
        try {
            return jxStudentsInternshipProveDao.updateJxStudentsInternshipProveByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveEntity entity, JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsInternshipProveDao.updateJxStudentsInternshipProveBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
      */
    public ExcuteResult updateJxStudentsInternshipProveBySqlWhereSelective(JxStudentsInternshipProveEntity entity, JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsInternshipProveDao.updateJxStudentsInternshipProveBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
      */
    public ExcuteResult updateJxStudentsInternshipProveByPrimaryKeySelective(JxStudentsInternshipProveEntity entity) {
        try {
            return jxStudentsInternshipProveDao.updateJxStudentsInternshipProveByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsInternshipProveByPrimaryKey(JxStudentsInternshipProveKey key) {
        try {
            return jxStudentsInternshipProveDao.deleteJxStudentsInternshipProveByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsInternshipProveDao.deleteJxStudentsInternshipProveBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsInternshipProve+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsInternshipProveBySqlWhere(JxStudentsInternshipProveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudentsInternshipProveDao.countJxStudentsInternshipProveBySqlWhere(sqlWhere);
    }

    public void setJxStudentsInternshipProveDao(IJxStudentsInternshipProveDao jxStudentsInternshipProveDao) {
        this.jxStudentsInternshipProveDao = jxStudentsInternshipProveDao;
    }

    public IJxStudentsInternshipProveDao getJxStudentsInternshipProveDao() {
        return jxStudentsInternshipProveDao;
    }
}