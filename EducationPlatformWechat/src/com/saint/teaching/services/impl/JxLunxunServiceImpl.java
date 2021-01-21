package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.dao.IJxLunxunDao;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_LUNXUN
*��˵����ѧ��ѵ
  */
public class JxLunxunServiceImpl implements IJxLunxunService {
    private IJxLunxunDao jxLunxunDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_LUNXUN
    *��˵����ѧ��ѵ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxLunxunEntity> selectListPageJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
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
            List<JxLunxunEntity> entitylist=jxLunxunDao.selectListPageJxLunxunBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_LUNXUN
     * ��˵����ѧ��ѵ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxLunxunEntity> selectListJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getZuid()!=null && !sqlWhere.getZuid().equals("")){
                criteria.andZuidEqualTo(sqlWhere.getZuid());
            }
            if(sqlWhere.getClassid()!=null && !sqlWhere.getClassid().equals("")){
                criteria.andClassidEqualTo(sqlWhere.getClassid());
            }
            if(sqlWhere.getOperatedate()!=null && !sqlWhere.getOperatedate().equals("")){
                String time = sqlWhere.getOperatedate();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date nowdate = null;
				try {
					nowdate = sdf.parse(time);
				} catch (ParseException e) {
					e.printStackTrace();
				}
                criteria.andStartdateLessThan(nowdate);
                criteria.andEnddateGreaterThan(nowdate);
            }
            if(sqlWhere.getNum()!=null && !sqlWhere.getNum().equals("")){
                criteria.andNumLessThan(sqlWhere.getNum());
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
            List<JxLunxunEntity> entitylist=jxLunxunDao.selectListJxLunxunBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }
    public List<JxLunxunEntity> selectListJxLunxunBySqlWhereandDate(JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getZuid()!=null && !sqlWhere.getZuid().equals("")){
                criteria.andZuidEqualTo(sqlWhere.getZuid());
            }
            Date nowdate = new Date() ;
            criteria.andStartdateLessThanOrEqualTo(nowdate);
            criteria.andEnddateGreaterThanOrEqualTo(nowdate);
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
            List<JxLunxunEntity> entitylist=jxLunxunDao.selectListJxLunxunBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }
    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxLunxunBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxLunxunDao.selectListJxLunxunBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxLunxunEntity selectJxLunxunByPrimaryKey(String xh) {
        try {
            JxLunxunEntity entity = jxLunxunDao.selectJxLunxunByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,������Ϣ
      */
    public ExcuteResult insertJxLunxun(JxLunxunEntity entity) {
        try {
            return jxLunxunDao.insertJxLunxun(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxLunxunSelective(JxLunxunEntity entity) {
        try {
            return jxLunxunDao.insertJxLunxunSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_LUNXUN,��ѧ��ѵ��,�޸�
      */
    public ExcuteResult updateJxLunxunByPrimaryKey(JxLunxunEntity entity) {
        try {
            return jxLunxunDao.updateJxLunxunByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxLunxunBySqlWhere(JxLunxunEntity entity, JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxLunxunDao.updateJxLunxunBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_LUNXUN,��ѧ��ѵ��,�޸�
      */
    public ExcuteResult updateJxLunxunBySqlWhereSelective(JxLunxunEntity entity, JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxLunxunDao.updateJxLunxunBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_LUNXUN,��ѧ��ѵ��,�޸�
      */
    public ExcuteResult updateJxLunxunByPrimaryKeySelective(JxLunxunEntity entity) {
        try {
            return jxLunxunDao.updateJxLunxunByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxLunxunByPrimaryKey(String xh) {
        try {
            return jxLunxunDao.deleteJxLunxunByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_LUNXUN,��ѧ��ѵ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxLunxunDao.deleteJxLunxunBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxLunxun+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_LUNXUN,��ѧ��ѵ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxLunxunBySqlWhere(JxLunxunSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxLunxunDao.countJxLunxunBySqlWhere(sqlWhere);
    }

    public void setJxLunxunDao(IJxLunxunDao jxLunxunDao) {
        this.jxLunxunDao = jxLunxunDao;
    }

    public IJxLunxunDao getJxLunxunDao() {
        return jxLunxunDao;
    }
}