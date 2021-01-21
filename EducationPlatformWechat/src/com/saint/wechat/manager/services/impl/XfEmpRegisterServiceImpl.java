package com.saint.wechat.manager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfEmpRegisterEntity;
import com.saint.wechat.manager.dao.IXfEmpRegisterDao;
import com.saint.wechat.manager.services.IXfEmpRegisterService;
import com.saint.wechat.manager.sqlWhere.XfEmpRegisterSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmpRegisterSqlWhere.Criteria;

/**
*��ע����Ϣ
*����XF_EMP_REGISTER
*��˵��Ա����Ϣ�����
  */
public class XfEmpRegisterServiceImpl implements IXfEmpRegisterService {
    private IXfEmpRegisterDao xfEmpRegisterDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��XF_EMP_REGISTER
    *��˵��Ա����Ϣ�����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<XfEmpRegisterEntity> selectListPageXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
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
            List<XfEmpRegisterEntity> entitylist=xfEmpRegisterDao.selectListPageXfEmpRegisterBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��XF_EMP_REGISTER
     * ��˵��Ա����Ϣ�����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<XfEmpRegisterEntity> selectListXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
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
            List<XfEmpRegisterEntity> entitylist=xfEmpRegisterDao.selectListXfEmpRegisterBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfEmpRegisterBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfEmpRegisterDao.selectListXfEmpRegisterBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public XfEmpRegisterEntity selectXfEmpRegisterByPrimaryKey(String usernumber) {
        try {
            XfEmpRegisterEntity entity = xfEmpRegisterDao.selectXfEmpRegisterByPrimaryKey(usernumber);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,������Ϣ
      */
    public ExcuteResult insertXfEmpRegister(XfEmpRegisterEntity entity) {
        try {
            return xfEmpRegisterDao.insertXfEmpRegister(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfEmpRegisterSelective(XfEmpRegisterEntity entity) {
        try {
            return xfEmpRegisterDao.insertXfEmpRegisterSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*XF_EMP_REGISTER,Ա����Ϣ������,�޸�
      */
    public ExcuteResult updateXfEmpRegisterByPrimaryKey(XfEmpRegisterEntity entity) {
        try {
            return xfEmpRegisterDao.updateXfEmpRegisterByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateXfEmpRegisterBySqlWhere(XfEmpRegisterEntity entity, XfEmpRegisterSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfEmpRegisterDao.updateXfEmpRegisterBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*XF_EMP_REGISTER,Ա����Ϣ������,�޸�
      */
    public ExcuteResult updateXfEmpRegisterBySqlWhereSelective(XfEmpRegisterEntity entity, XfEmpRegisterSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfEmpRegisterDao.updateXfEmpRegisterBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*XF_EMP_REGISTER,Ա����Ϣ������,�޸�
      */
    public ExcuteResult updateXfEmpRegisterByPrimaryKeySelective(XfEmpRegisterEntity entity) {
        try {
            return xfEmpRegisterDao.updateXfEmpRegisterByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteXfEmpRegisterByPrimaryKey(String usernumber) {
        try {
            return xfEmpRegisterDao.deleteXfEmpRegisterByPrimaryKey(usernumber);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfEmpRegisterDao.deleteXfEmpRegisterBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfEmpRegister+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*XF_EMP_REGISTER,Ա����Ϣ������
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)xfEmpRegisterDao.countXfEmpRegisterBySqlWhere(sqlWhere);
    }

    public void setXfEmpRegisterDao(IXfEmpRegisterDao xfEmpRegisterDao) {
        this.xfEmpRegisterDao = xfEmpRegisterDao;
    }

    public IXfEmpRegisterDao getXfEmpRegisterDao() {
        return xfEmpRegisterDao;
    }
}