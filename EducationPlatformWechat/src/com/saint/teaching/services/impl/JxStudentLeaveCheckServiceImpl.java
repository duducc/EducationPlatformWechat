package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentLeaveCheckEntity;
import com.saint.teaching.dao.IJxStudentLeaveCheckDao;
import com.saint.teaching.services.IJxStudentLeaveCheckService;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDENT_LEAVE_CHECK
*��˵��ѧ��������
  */
public class JxStudentLeaveCheckServiceImpl implements IJxStudentLeaveCheckService {
    private IJxStudentLeaveCheckDao jxStudentLeaveCheckDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENT_LEAVE_CHECK
    *��˵��ѧ��������
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudentLeaveCheckEntity> selectListPageJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
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
            List<JxStudentLeaveCheckEntity> entitylist=jxStudentLeaveCheckDao.selectListPageJxStudentLeaveCheckBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDENT_LEAVE_CHECK
     * ��˵��ѧ��������
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentLeaveCheckEntity> selectListJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStulevid()!=null && !sqlWhere.getStulevid().equals("")){
                criteria.andStulevidEqualTo(sqlWhere.getStulevid());
            }
            if(sqlWhere.getCheckorder()!=null && !sqlWhere.getCheckorder().equals("")){
                criteria.andCheckorderEqualTo(sqlWhere.getCheckorder());
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
            List<JxStudentLeaveCheckEntity> entitylist=jxStudentLeaveCheckDao.selectListJxStudentLeaveCheckBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentLeaveCheckBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentLeaveCheckDao.selectListJxStudentLeaveCheckBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentLeaveCheckEntity selectJxStudentLeaveCheckByPrimaryKey(String xh) {
        try {
            JxStudentLeaveCheckEntity entity = jxStudentLeaveCheckDao.selectJxStudentLeaveCheckByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,������Ϣ
      */
    public ExcuteResult insertJxStudentLeaveCheck(JxStudentLeaveCheckEntity entity) {
        try {
            return jxStudentLeaveCheckDao.insertJxStudentLeaveCheck(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentLeaveCheckSelective(JxStudentLeaveCheckEntity entity) {
        try {
            return jxStudentLeaveCheckDao.insertJxStudentLeaveCheckSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveCheckByPrimaryKey(JxStudentLeaveCheckEntity entity) {
        try {
            return jxStudentLeaveCheckDao.updateJxStudentLeaveCheckByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckEntity entity, JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentLeaveCheckDao.updateJxStudentLeaveCheckBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveCheckBySqlWhereSelective(JxStudentLeaveCheckEntity entity, JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentLeaveCheckDao.updateJxStudentLeaveCheckBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveCheckByPrimaryKeySelective(JxStudentLeaveCheckEntity entity) {
        try {
            return jxStudentLeaveCheckDao.updateJxStudentLeaveCheckByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveCheckByPrimaryKey(String xh) {
        try {
            return jxStudentLeaveCheckDao.deleteJxStudentLeaveCheckByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentLeaveCheckDao.deleteJxStudentLeaveCheckBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENT_LEAVE_CHECK,ѧ�������˱�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentLeaveCheckBySqlWhere(JxStudentLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudentLeaveCheckDao.countJxStudentLeaveCheckBySqlWhere(sqlWhere);
    }

    public void setJxStudentLeaveCheckDao(IJxStudentLeaveCheckDao jxStudentLeaveCheckDao) {
        this.jxStudentLeaveCheckDao = jxStudentLeaveCheckDao;
    }

    public IJxStudentLeaveCheckDao getJxStudentLeaveCheckDao() {
        return jxStudentLeaveCheckDao;
    }
}