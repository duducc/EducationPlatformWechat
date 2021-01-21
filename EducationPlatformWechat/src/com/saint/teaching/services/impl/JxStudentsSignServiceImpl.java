package com.saint.teaching.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsSignEntity;
import com.saint.teaching.dao.IJxStudentsSignDao;
import com.saint.teaching.services.IJxStudentsSignService;
import com.saint.teaching.sqlWhere.JxStudentsSignSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSignSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_STUDENTS_SIGN
*��˵�� ѧ��ǩ����Ϣ
  */
public class JxStudentsSignServiceImpl implements IJxStudentsSignService {
    private IJxStudentsSignDao jxStudentsSignDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS_SIGN
    *��˵�� ѧ��ǩ����Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxStudentsSignEntity> selectListPageJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
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
            List<JxStudentsSignEntity> entitylist=jxStudentsSignDao.selectListPageJxStudentsSignBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_STUDENTS_SIGN
     * ��˵�� ѧ��ǩ����Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxStudentsSignEntity> selectListJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getSigncs()!=null && !sqlWhere.getSigncs().equals("")){
                criteria.andSigncsEqualTo(sqlWhere.getSigncs());
            }
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
            }
            if(sqlWhere.getSigndate()!=null && !sqlWhere.getSigndate().equals("")){
                criteria.andSigndateEqualTo(sqlWhere.getSigndate());
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
            List<JxStudentsSignEntity> entitylist=jxStudentsSignDao.selectListJxStudentsSignBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxStudentsSignBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxStudentsSignDao.selectListJxStudentsSignBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxStudentsSignEntity selectJxStudentsSignByPrimaryKey(String xh) {
        try {
            JxStudentsSignEntity entity = jxStudentsSignDao.selectJxStudentsSignByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,������Ϣ
      */
    public ExcuteResult insertJxStudentsSign(JxStudentsSignEntity entity) {
        try {
            return jxStudentsSignDao.insertJxStudentsSign(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxStudentsSignSelective(JxStudentsSignEntity entity) {
        try {
            return jxStudentsSignDao.insertJxStudentsSignSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsSignByPrimaryKey(JxStudentsSignEntity entity) {
        try {
            return jxStudentsSignDao.updateJxStudentsSignByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxStudentsSignBySqlWhere(JxStudentsSignEntity entity, JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsSignDao.updateJxStudentsSignBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsSignBySqlWhereSelective(JxStudentsSignEntity entity, JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsSignDao.updateJxStudentsSignBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,�޸�
      */
    public ExcuteResult updateJxStudentsSignByPrimaryKeySelective(JxStudentsSignEntity entity) {
        try {
            return jxStudentsSignDao.updateJxStudentsSignByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsSignByPrimaryKey(String xh) {
        try {
            return jxStudentsSignDao.deleteJxStudentsSignByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxStudentsSignDao.deleteJxStudentsSignBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxStudentsSign+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_STUDENTS_SIGN, ѧ��ǩ����Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxStudentsSignBySqlWhere(JxStudentsSignSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxStudentsSignDao.countJxStudentsSignBySqlWhere(sqlWhere);
    }

    public void setJxStudentsSignDao(IJxStudentsSignDao jxStudentsSignDao) {
        this.jxStudentsSignDao = jxStudentsSignDao;
    }

    public IJxStudentsSignDao getJxStudentsSignDao() {
        return jxStudentsSignDao;
    }
}