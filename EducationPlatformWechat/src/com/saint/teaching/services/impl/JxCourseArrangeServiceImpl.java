package com.saint.teaching.services.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.dao.IJxCourseArrangeDao;
import com.saint.teaching.services.IJxCourseArrangeService;
import com.saint.teaching.sqlWhere.JxCourseArrangeSqlWhere;
import com.saint.teaching.sqlWhere.JxCourseArrangeSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_COURSEARRANGE
*��˵�����ۿογ̰���
  */
public class JxCourseArrangeServiceImpl implements IJxCourseArrangeService {
    private IJxCourseArrangeDao jxCourseArrangeDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_COURSEARRANGE
    *��˵�����ۿογ̰���
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxCourseArrangeEntity> selectListPageJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
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
            List<JxCourseArrangeEntity> entitylist=jxCourseArrangeDao.selectListPageJxCourseArrangeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_COURSEARRANGE
     * ��˵�����ۿογ̰���
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxCourseArrangeEntity> selectListJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getRkjshid() != null && !"".equals(sqlWhere.getRkjshid())){
            	criteria.andRkjshidEqualTo(sqlWhere.getRkjshid());
            }
            if(sqlWhere.getShkzhci() != null && !"".equals(sqlWhere.getShkzhci())){
            	criteria.andShkzhciEqualTo(sqlWhere.getShkzhci());
            }
            if(sqlWhere.getSkjshu() != null && !"".equals(sqlWhere.getSkjshu())){
            	criteria.andSkjshuEqualTo(sqlWhere.getSkjshu());
            }
            if(sqlWhere.getShkxqi() != null && !"".equals(sqlWhere.getShkxqi())){
            	criteria.andShkxqiEqualTo(sqlWhere.getShkxqi());
            }
            if(sqlWhere.getCoursename()!=null && !sqlWhere.getCoursename().equals("")){
                criteria.andCoursenameLike("%"+sqlWhere.getCoursename()+"%");
            }
            if(sqlWhere.getCoursenum()!=null && !sqlWhere.getCoursenum().equals("")){
                criteria.andCoursenumEqualTo(sqlWhere.getCoursenum());
            }
            if(sqlWhere.getSkdate() != null && !"".equals(sqlWhere.getSkdate())){
            	 Date skdate = null;
            	 SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//������
            	 try {
                     skdate = dateFormat.parse(sqlWhere.getSkdate());
                 } catch (Exception e) {
                	 skdate =new Date();
                 }
                 criteria.andSkdateEqualTo(skdate);
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
            List<JxCourseArrangeEntity> entitylist=jxCourseArrangeDao.selectListJxCourseArrangeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxCourseArrangeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxCourseArrangeDao.selectListJxCourseArrangeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxCourseArrangeEntity selectJxCourseArrangeByPrimaryKey(String xh) {
        try {
            JxCourseArrangeEntity entity = jxCourseArrangeDao.selectJxCourseArrangeByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,������Ϣ
      */
    public ExcuteResult insertJxCourseArrange(JxCourseArrangeEntity entity) {
        try {
            return jxCourseArrangeDao.insertJxCourseArrange(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxCourseArrangeSelective(JxCourseArrangeEntity entity) {
        try {
            return jxCourseArrangeDao.insertJxCourseArrangeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,�޸�
      */
    public ExcuteResult updateJxCourseArrangeByPrimaryKey(JxCourseArrangeEntity entity) {
        try {
            return jxCourseArrangeDao.updateJxCourseArrangeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxCourseArrangeBySqlWhere(JxCourseArrangeEntity entity, JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCourseArrangeDao.updateJxCourseArrangeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,�޸�
      */
    public ExcuteResult updateJxCourseArrangeBySqlWhereSelective(JxCourseArrangeEntity entity, JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCourseArrangeDao.updateJxCourseArrangeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,�޸�
      */
    public ExcuteResult updateJxCourseArrangeByPrimaryKeySelective(JxCourseArrangeEntity entity) {
        try {
            return jxCourseArrangeDao.updateJxCourseArrangeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxCourseArrangeByPrimaryKey(String xh) {
        try {
            return jxCourseArrangeDao.deleteJxCourseArrangeByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_COURSEARRANGE,���ۿογ̰��ű�,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxCourseArrangeDao.deleteJxCourseArrangeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxCourseArrange+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_COURSEARRANGE,���ۿογ̰��ű�
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxCourseArrangeBySqlWhere(JxCourseArrangeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxCourseArrangeDao.countJxCourseArrangeBySqlWhere(sqlWhere);
    }

    public void setJxCourseArrangeDao(IJxCourseArrangeDao jxCourseArrangeDao) {
        this.jxCourseArrangeDao = jxCourseArrangeDao;
    }

    public IJxCourseArrangeDao getJxCourseArrangeDao() {
        return jxCourseArrangeDao;
    }
}