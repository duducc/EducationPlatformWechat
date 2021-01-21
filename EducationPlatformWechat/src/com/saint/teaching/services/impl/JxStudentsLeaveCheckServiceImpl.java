package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import com.saint.teaching.dao.IJxStudentsLeaveCheckDao;
import com.saint.teaching.services.IJxStudentsLeaveCheckService;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDENTS_LEAVE_CHECK
*��˵���������
  */
public class JxStudentsLeaveCheckServiceImpl implements IJxStudentsLeaveCheckService {
    private IJxStudentsLeaveCheckDao jxStudentsLeaveCheckDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS_LEAVE_CHECK
    *��˵���������
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsLeaveCheckEntity> selectListPageJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
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
            List<JxStudentsLeaveCheckEntity> entitylist=jxStudentsLeaveCheckDao.selectListPageJxStudentsLeaveCheckBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDENTS_LEAVE_CHECK
     * ��˵���������
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsLeaveCheckEntity> selectListJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
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
            List<JxStudentsLeaveCheckEntity> entitylist=jxStudentsLeaveCheckDao.selectListJxStudentsLeaveCheckBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsLeaveCheckBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsLeaveCheckDao.selectListJxStudentsLeaveCheckBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsLeaveCheckEntity selectJxStudentsLeaveCheckByPrimaryKey(String xh) {
        try {
            JxStudentsLeaveCheckEntity entity = jxStudentsLeaveCheckDao.selectJxStudentsLeaveCheckByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,������Ϣ
      */
    public ExcuteResult insertJxStudentsLeaveCheck(JxStudentsLeaveCheckEntity entity) {
        try {
            return jxStudentsLeaveCheckDao.insertJxStudentsLeaveCheck(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsLeaveCheckSelective(JxStudentsLeaveCheckEntity entity) {
        try {
            return jxStudentsLeaveCheckDao.insertJxStudentsLeaveCheckSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_LEAVE_CHECK,���������,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveCheckByPrimaryKey(JxStudentsLeaveCheckEntity entity) {
        try {
            return jxStudentsLeaveCheckDao.updateJxStudentsLeaveCheckByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckEntity entity, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsLeaveCheckDao.updateJxStudentsLeaveCheckBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_LEAVE_CHECK,���������,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveCheckBySqlWhereSelective(JxStudentsLeaveCheckEntity entity, JxStudentsLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsLeaveCheckDao.updateJxStudentsLeaveCheckBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_LEAVE_CHECK,���������,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveCheckByPrimaryKeySelective(JxStudentsLeaveCheckEntity entity) {
        try {
            return jxStudentsLeaveCheckDao.updateJxStudentsLeaveCheckByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveCheckByPrimaryKey(String xh) {
        try {
            return jxStudentsLeaveCheckDao.deleteJxStudentsLeaveCheckByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE_CHECK,���������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsLeaveCheckDao.deleteJxStudentsLeaveCheckBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsLeaveCheck+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_LEAVE_CHECK,���������
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudentsLeaveCheckDao.countJxStudentsLeaveCheckBySqlWhere(sqlWhere);
    }

    public void setJxStudentsLeaveCheckDao(IJxStudentsLeaveCheckDao jxStudentsLeaveCheckDao) {
        this.jxStudentsLeaveCheckDao = jxStudentsLeaveCheckDao;
    }

    public IJxStudentsLeaveCheckDao getJxStudentsLeaveCheckDao() {
        return jxStudentsLeaveCheckDao;
    }
}