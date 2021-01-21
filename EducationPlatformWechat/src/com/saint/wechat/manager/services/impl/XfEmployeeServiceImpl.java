package com.saint.wechat.manager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.dao.IXfEmployeeDao;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere.Criteria;

/**
*��ע����Ϣ
*����XF_EMPLOYEE
*��˵����Ա��Ϣ
  */
public class XfEmployeeServiceImpl implements IXfEmployeeService {
    private IXfEmployeeDao xfEmployeeDao;
    @Override
	public int selectJxschoolmanager() {
	    return xfEmployeeDao.selectJxschoolmanager();
	}
    /**
    *����ע����Ϣ
    *��ҳ��ѯ��XF_EMPLOYEE
    *��˵����Ա��Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<XfEmployeeEntity> selectListPageXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsername()!=null && !sqlWhere.getUsername().equals("")){
                criteria.andUsernameLike("%"+sqlWhere.getUsername()+"%");
            }
            if(sqlWhere.getDepart()!=null && !sqlWhere.getDepart().equals("")){
                criteria.andDepartEqualTo(sqlWhere.getDepart());
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
            List<XfEmployeeEntity> entitylist=xfEmployeeDao.selectListPageXfEmployeeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��XF_EMPLOYEE
     * ��˵����Ա��Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<XfEmployeeEntity> selectListXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsernumber()!=null && !sqlWhere.getUsernumber().equals("")){
                criteria.andUsernumberEqualTo(sqlWhere.getUsernumber());
            }
            if(sqlWhere.getIdcard()!=null && !sqlWhere.getIdcard().equals("")){
                criteria.andIdcardEqualTo(sqlWhere.getIdcard());
            }
            if(sqlWhere.getUsername()!=null && !sqlWhere.getUsername().equals("")){
                criteria.andUsernameLike("%"+sqlWhere.getUsername()+"%");
            }
            if(sqlWhere.getYiyuan()!=null && !sqlWhere.getYiyuan().equals("")){
                criteria.andYiyuanEqualTo(sqlWhere.getYiyuan());
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
            List<XfEmployeeEntity> entitylist=xfEmployeeDao.selectListXfEmployeeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfEmployeeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfEmployeeDao.selectListXfEmployeeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public XfEmployeeEntity selectXfEmployeeByPrimaryKey(String usernumber) {
        try {
            XfEmployeeEntity entity = xfEmployeeDao.selectXfEmployeeByPrimaryKey(usernumber);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,������Ϣ
      */
    public ExcuteResult insertXfEmployee(XfEmployeeEntity entity) {
        try {
            return xfEmployeeDao.insertXfEmployee(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfEmployeeSelective(XfEmployeeEntity entity) {
        try {
            return xfEmployeeDao.insertXfEmployeeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*XF_EMPLOYEE,��Ա��Ϣ��,�޸�
      */
    public ExcuteResult updateXfEmployeeByPrimaryKey(XfEmployeeEntity entity) {
        try {
            return xfEmployeeDao.updateXfEmployeeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateXfEmployeeBySqlWhere(XfEmployeeEntity entity, XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfEmployeeDao.updateXfEmployeeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*XF_EMPLOYEE,��Ա��Ϣ��,�޸�
      */
    public ExcuteResult updateXfEmployeeBySqlWhereSelective(XfEmployeeEntity entity, XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfEmployeeDao.updateXfEmployeeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*XF_EMPLOYEE,��Ա��Ϣ��,�޸�
      */
    public ExcuteResult updateXfEmployeeByPrimaryKeySelective(XfEmployeeEntity entity) {
        try {
            return xfEmployeeDao.updateXfEmployeeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteXfEmployeeByPrimaryKey(String usernumber) {
        try {
            return xfEmployeeDao.deleteXfEmployeeByPrimaryKey(usernumber);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfEmployeeDao.deleteXfEmployeeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfEmployee+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*XF_EMPLOYEE,��Ա��Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getUsernumber()!=null && !sqlWhere.getUsernumber().equals("")){
                criteria.andUsernumberEqualTo(sqlWhere.getUsernumber());
            }
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)xfEmployeeDao.countXfEmployeeBySqlWhere(sqlWhere);
    }

    public void setXfEmployeeDao(IXfEmployeeDao xfEmployeeDao) {
        this.xfEmployeeDao = xfEmployeeDao;
    }

    public IXfEmployeeDao getXfEmployeeDao() {
        return xfEmployeeDao;
    }
}