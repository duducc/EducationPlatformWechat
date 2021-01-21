package com.saint.teaching.services.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.dao.IJxStudentLeaveDao;
import com.saint.teaching.services.IJxStudentLeaveService;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDENTS_LEAVE
*��˵��ѧ�����
  */
public class JxStudentLeaveServiceImpl implements IJxStudentLeaveService {
    private IJxStudentLeaveDao jxStudentLeaveDao;
    
    public int selectXhJxStudentLeaveBySql() {
	    return (Integer)jxStudentLeaveDao.selectXhJxStudentLeaveBySql();
	}

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS_LEAVE
    *��˵��ѧ�����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudentLeaveEntity> selectListPageJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
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
            List<JxStudentLeaveEntity> entitylist=jxStudentLeaveDao.selectListPageJxStudentLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDENTS_LEAVE
     * ��˵��ѧ�����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentLeaveEntity> selectListJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            if(sqlWhere.getRemark1()!=null && !sqlWhere.getRemark1().equals("")){
                criteria.andRemark1EqualTo(sqlWhere.getRemark1());
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
            	String states = sqlWhere.getState();
            	String[] statess = states.split(",");
            	if(statess.length>1){
            		List<String> list =  Arrays.asList(statess);
            		criteria.andStateIn(list);
            	}else{
            		criteria.andStateEqualTo(sqlWhere.getState());
            	}
            }
            if(sqlWhere.getStuname()!=null && !sqlWhere.getStuname().equals("")){
                criteria.andStunameLike("%"+sqlWhere.getStuname()+"%");
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
            List<JxStudentLeaveEntity> entitylist=jxStudentLeaveDao.selectListJxStudentLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentLeaveBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentLeaveDao.selectListJxStudentLeaveBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }
    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentLeaveEntity selectJxStudentLeaveByPrimaryKey(String xh) {
        try {
            JxStudentLeaveEntity entity = jxStudentLeaveDao.selectJxStudentLeaveByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
      */
    public ExcuteResult insertJxStudentLeave(JxStudentLeaveEntity entity) {
        try {
            return jxStudentLeaveDao.insertJxStudentLeave(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentLeaveSelective(JxStudentLeaveEntity entity) {
        try {
            return jxStudentLeaveDao.insertJxStudentLeaveSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveByPrimaryKey(JxStudentLeaveEntity entity) {
        try {
            return jxStudentLeaveDao.updateJxStudentLeaveByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentLeaveBySqlWhere(JxStudentLeaveEntity entity, JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentLeaveDao.updateJxStudentLeaveBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveBySqlWhereSelective(JxStudentLeaveEntity entity, JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentLeaveDao.updateJxStudentLeaveBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentLeaveByPrimaryKeySelective(JxStudentLeaveEntity entity) {
        try {
            return jxStudentLeaveDao.updateJxStudentLeaveByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveByPrimaryKey(String xh) {
        try {
            return jxStudentLeaveDao.deleteJxStudentLeaveByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentLeaveDao.deleteJxStudentLeaveBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudentLeaveDao.countJxStudentLeaveBySqlWhere(sqlWhere);
    }

    public void setJxStudentLeaveDao(IJxStudentLeaveDao jxStudentLeaveDao) {
        this.jxStudentLeaveDao = jxStudentLeaveDao;
    }

    public IJxStudentLeaveDao getJxStudentLeaveDao() {
        return jxStudentLeaveDao;
    }
}