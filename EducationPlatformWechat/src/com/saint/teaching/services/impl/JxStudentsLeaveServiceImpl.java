package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import com.saint.teaching.dao.IJxStudentsLeaveDao;
import com.saint.teaching.services.IJxStudentsLeaveService;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDENTS_LEAVE
*��˵��ѧ�����
  */
public class JxStudentsLeaveServiceImpl implements IJxStudentsLeaveService {
    private IJxStudentsLeaveDao jxStudentsLeaveDao;
    public int selectXhJxStudentLeaveBySql() {
	    return (Integer)jxStudentsLeaveDao.selectXhJxStudentLeaveBySql();
	}
    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS_LEAVE
    *��˵��ѧ�����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsLeaveEntity> selectListPageJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            /*if(sqlWhere.getLeavedatestart()!=null && !sqlWhere.getLeavedatestart().equals("")){
                criteria.andLeavedatestartLike("%"+sqlWhere.getLeavedatestart()+"%");
            }*/
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
            List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveDao.selectListPageJxStudentsLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDENTS_LEAVE
     * ��˵��ѧ�����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
                criteria.andStateEqualTo(sqlWhere.getState());
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
            List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveDao.selectListJxStudentsLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }
    @Override
	public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveBySqlWhereforDate(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            /*if(sqlWhere.getLeavedatestart()!=null && !sqlWhere.getLeavedatestart().equals("")){
            	criteria.andLeavedatestartLessThan("%"+sqlWhere.getLeavedatestart()+"%");
            }*/
        }
        try {
            List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveDao.selectListJxStudentsLeaveBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }
    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsLeaveBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsLeaveDao.selectListJxStudentsLeaveBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsLeaveEntity selectJxStudentsLeaveByPrimaryKey(String xh) {
        try {
            JxStudentsLeaveEntity entity = jxStudentsLeaveDao.selectJxStudentsLeaveByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
      */
    public ExcuteResult insertJxStudentsLeave(JxStudentsLeaveEntity entity) {
        try {
            return jxStudentsLeaveDao.insertJxStudentsLeave(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsLeaveSelective(JxStudentsLeaveEntity entity) {
        try {
            return jxStudentsLeaveDao.insertJxStudentsLeaveSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveByPrimaryKey(JxStudentsLeaveEntity entity) {
        try {
            return jxStudentsLeaveDao.updateJxStudentsLeaveByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsLeaveBySqlWhere(JxStudentsLeaveEntity entity, JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsLeaveDao.updateJxStudentsLeaveBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveBySqlWhereSelective(JxStudentsLeaveEntity entity, JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsLeaveDao.updateJxStudentsLeaveBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,�޸�
      */
    public ExcuteResult updateJxStudentsLeaveByPrimaryKeySelective(JxStudentsLeaveEntity entity) {
        try {
            return jxStudentsLeaveDao.updateJxStudentsLeaveByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveByPrimaryKey(String xh) {
        try {
            return jxStudentsLeaveDao.deleteJxStudentsLeaveByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsLeaveDao.deleteJxStudentsLeaveBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_LEAVE,ѧ����ٱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudentsLeaveDao.countJxStudentsLeaveBySqlWhere(sqlWhere);
    }
    /**
     * ����ѧ����Ų�ѯ��ٵ�ѧ��
     */
	@Override
	public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveByStuid(JxStudentsLeaveSqlWhere sqlWhere, List<String> list) {
		  if(sqlWhere !=null){
	            Criteria criteria=sqlWhere.createCriteria();
	            if(sqlWhere.getState() != null && !sqlWhere.getState().equals("")){
	            	criteria.andStateEqualTo(sqlWhere.getState());
	            }
	            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//������
	            if(sqlWhere.getLeavedatestart()!=null && !sqlWhere.getLeavedatestart().equals("") && sqlWhere.getLeavedateend() != null && !sqlWhere.getLeavedateend().equals("")){
	            	Date start = null;
	            	Date end = null;
	            	 try {
	            		 start = dateFormat.parse(sqlWhere.getLeavedatestart());
	            		 end = dateFormat.parse(sqlWhere.getLeavedateend());
	                 } catch (ParseException e) {
	                	 start=new Date();
	                	 end=new Date();
	                 }
	                criteria.andLeavedateendBetween(start, end);
	            }
	            if(list!=null&&list.size()>0){
	            	criteria.andStuidIn(list);
	            } 
	        }
		  try {
	           List<JxStudentsLeaveEntity> entitylist=jxStudentsLeaveDao.selectListJxStudentsLeaveBySqlWhere(sqlWhere);
	            sqlWhere.clear();
	            return entitylist;
	        } catch (ExcuteException e) {
	            e.printStackTrace();
	            throw new ExcuteException(FrmGnid.selectListPageJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
	        }
	}
	/**
     * ����ѧ����Ų�ѯ����
     */
	@Override
	public List<JxStudentsLeaveEntity> selectListJxStudentsLeaveByStuid(String xh) {
		try {
			 List<JxStudentsLeaveEntity> entity = jxStudentsLeaveDao.selectListJxStudentsLeaveByStuid(xh);
	         return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsLeave+"ʧ�ܣ�"+e.getMessage());
        }
	}
    public void setJxStudentsLeaveDao(IJxStudentsLeaveDao jxStudentsLeaveDao) {
        this.jxStudentsLeaveDao = jxStudentsLeaveDao;
    }

    public IJxStudentsLeaveDao getJxStudentsLeaveDao() {
        return jxStudentsLeaveDao;
    }
}