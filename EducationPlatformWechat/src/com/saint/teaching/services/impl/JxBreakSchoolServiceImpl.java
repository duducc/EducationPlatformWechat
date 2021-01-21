package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import com.saint.teaching.dao.IJxBreakSchoolDao;
import com.saint.teaching.services.IJxBreakSchoolService;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_BREAKSCHOOL
*��˵��ѧ��Υ�͵Ǽ�
  */
public class JxBreakSchoolServiceImpl implements IJxBreakSchoolService {
    private IJxBreakSchoolDao jxBreakSchoolDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_BREAKSCHOOL
    *��˵��ѧ��Υ�͵Ǽ�
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxBreakSchoolEntity> selectListPageJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getOpdate()!=null && !sqlWhere.getOpdate().equals("")){
            	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
					criteria.andOpdateEqualTo(sdf.parse(sqlWhere.getOpdate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
                criteria.andStateEqualTo(sqlWhere.getState());
            }
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
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
            List<JxBreakSchoolEntity> entitylist=jxBreakSchoolDao.selectListPageJxBreakSchoolBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_BREAKSCHOOL
     * ��˵��ѧ��Υ�͵Ǽ�
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxBreakSchoolEntity> selectListJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
        	Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getOpdate()!=null && !sqlWhere.getOpdate().equals("")){
            	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
					criteria.andOpdateEqualTo(sdf.parse(sqlWhere.getOpdate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
            }
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
                criteria.andStateEqualTo(sqlWhere.getState());
            }
            if(sqlWhere.getStuid()!=null && !sqlWhere.getStuid().equals("")){
                criteria.andStuidEqualTo(sqlWhere.getStuid());
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
            List<JxBreakSchoolEntity> entitylist=jxBreakSchoolDao.selectListJxBreakSchoolBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxBreakSchoolBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxBreakSchoolDao.selectListJxBreakSchoolBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxBreakSchoolEntity selectJxBreakSchoolByPrimaryKey(String xh) {
        try {
            JxBreakSchoolEntity entity = jxBreakSchoolDao.selectJxBreakSchoolByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,������Ϣ
      */
    public ExcuteResult insertJxBreakSchool(JxBreakSchoolEntity entity) {
        try {
            return jxBreakSchoolDao.insertJxBreakSchool(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxBreakSchoolSelective(JxBreakSchoolEntity entity) {
        try {
            return jxBreakSchoolDao.insertJxBreakSchoolSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
      */
    public ExcuteResult updateJxBreakSchoolByPrimaryKey(JxBreakSchoolEntity entity) {
        try {
            return jxBreakSchoolDao.updateJxBreakSchoolByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxBreakSchoolBySqlWhere(JxBreakSchoolEntity entity, JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxBreakSchoolDao.updateJxBreakSchoolBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
      */
    public ExcuteResult updateJxBreakSchoolBySqlWhereSelective(JxBreakSchoolEntity entity, JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxBreakSchoolDao.updateJxBreakSchoolBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
      */
    public ExcuteResult updateJxBreakSchoolByPrimaryKeySelective(JxBreakSchoolEntity entity) {
        try {
            return jxBreakSchoolDao.updateJxBreakSchoolByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxBreakSchoolByPrimaryKey(String xh) {
        try {
            return jxBreakSchoolDao.deleteJxBreakSchoolByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxBreakSchoolDao.deleteJxBreakSchoolBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxBreakSchool+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxBreakSchoolDao.countJxBreakSchoolBySqlWhere(sqlWhere);
    }

    public void setJxBreakSchoolDao(IJxBreakSchoolDao jxBreakSchoolDao) {
        this.jxBreakSchoolDao = jxBreakSchoolDao;
    }

    public IJxBreakSchoolDao getJxBreakSchoolDao() {
        return jxBreakSchoolDao;
    }
}