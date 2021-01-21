package com.saint.wechat.manager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseTicklingEntity;
import com.saint.wechat.manager.bean.XfCourseTicklingKey;
import com.saint.wechat.manager.dao.IXfCourseTicklingDao;
import com.saint.wechat.manager.services.IXfCourseTicklingService;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere.Criteria;

/**
*��ע����Ϣ
*����XF_COURSE_TICKLING
*��˵���γ���ϢѧԱ����
  */
public class XfCourseTicklingServiceImpl implements IXfCourseTicklingService {
    private IXfCourseTicklingDao xfCourseTicklingDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��XF_COURSE_TICKLING
    *��˵���γ���ϢѧԱ����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<XfCourseTicklingEntity> selectListPageXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
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
            List<XfCourseTicklingEntity> entitylist=xfCourseTicklingDao.selectListPageXfCourseTicklingBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��XF_COURSE_TICKLING
     * ��˵���γ���ϢѧԱ����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<XfCourseTicklingEntity> selectListXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
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
            List<XfCourseTicklingEntity> entitylist=xfCourseTicklingDao.selectListXfCourseTicklingBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfCourseTicklingBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfCourseTicklingDao.selectListXfCourseTicklingBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public XfCourseTicklingEntity selectXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key) {
        try {
            XfCourseTicklingEntity entity = xfCourseTicklingDao.selectXfCourseTicklingByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,������Ϣ
      */
    public ExcuteResult insertXfCourseTickling(XfCourseTicklingEntity entity) {
        try {
            return xfCourseTicklingDao.insertXfCourseTickling(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfCourseTicklingSelective(XfCourseTicklingEntity entity) {
        try {
            return xfCourseTicklingDao.insertXfCourseTicklingSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
      */
    public ExcuteResult updateXfCourseTicklingByPrimaryKey(XfCourseTicklingEntity entity) {
        try {
            return xfCourseTicklingDao.updateXfCourseTicklingByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateXfCourseTicklingBySqlWhere(XfCourseTicklingEntity entity, XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseTicklingDao.updateXfCourseTicklingBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
      */
    public ExcuteResult updateXfCourseTicklingBySqlWhereSelective(XfCourseTicklingEntity entity, XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseTicklingDao.updateXfCourseTicklingBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
      */
    public ExcuteResult updateXfCourseTicklingByPrimaryKeySelective(XfCourseTicklingEntity entity) {
        try {
            return xfCourseTicklingDao.updateXfCourseTicklingByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key) {
        try {
            return xfCourseTicklingDao.deleteXfCourseTicklingByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseTicklingDao.deleteXfCourseTicklingBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCourseTickling+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)xfCourseTicklingDao.countXfCourseTicklingBySqlWhere(sqlWhere);
    }

    public void setXfCourseTicklingDao(IXfCourseTicklingDao xfCourseTicklingDao) {
        this.xfCourseTicklingDao = xfCourseTicklingDao;
    }

    public IXfCourseTicklingDao getXfCourseTicklingDao() {
        return xfCourseTicklingDao;
    }
}