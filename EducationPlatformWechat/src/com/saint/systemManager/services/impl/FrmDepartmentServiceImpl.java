package com.saint.systemManager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.dao.IFrmDepartmentDao;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere.Criteria;

/**
*��ע����Ϣ
*����FRM_DEPARTMENT
*��˵��������Ϣ
  */
public class FrmDepartmentServiceImpl implements IFrmDepartmentService {
    private IFrmDepartmentDao frmDepartmentDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��FRM_DEPARTMENT
    *��˵��������Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<FrmDepartmentEntity> selectListPageFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
        }
        try {
            List<FrmDepartmentEntity> entitylist=frmDepartmentDao.selectListPageFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��FRM_DEPARTMENT
     * ��˵��������Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getBmjb()!=null && !sqlWhere.getBmjb().equals("")){
                criteria.andBmjbEqualTo(sqlWhere.getBmjb());
            }
            if(sqlWhere.getSjbm()!=null && !sqlWhere.getSjbm().equals("")){
                criteria.andSjbmEqualTo(sqlWhere.getSjbm());
            }
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                criteria.andGlbmEqualTo(sqlWhere.getGlbm());
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
            List<FrmDepartmentEntity> entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }
    public List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWherejc(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getBmjb()!=null && !sqlWhere.getBmjb().equals("")){
                criteria.andBmjbEqualTo(sqlWhere.getBmjb());
            }
            if(sqlWhere.getSjbm()!=null && !sqlWhere.getSjbm().equals("")){
                criteria.andSjbmNotEqualTo(sqlWhere.getSjbm());
            }
        }
        try {
            List<FrmDepartmentEntity> entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }
    /**
     * ��ѯ������ҽԺ
     */
    public List<FrmDepartmentEntity> getListAllyiyuanBySqlWhere() {
    	List<FrmDepartmentEntity> entitylist=null;
        try {
        	FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
        	Criteria criteria=sqlWhere.createCriteria();
        	criteria.andBmjbEqualTo("5");
        	criteria.andSjbmEqualTo("28");
            entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
        return entitylist;
    }
    /**
     * ��ѯ������ҽԺ
     */
    public List<FrmDepartmentEntity> getListAllyiyuanCoverbaseBySqlWhere() {
    	List<FrmDepartmentEntity> entitylist=null;
        try {
        	FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
        	Criteria criteria=sqlWhere.createCriteria();
        	criteria.andBmjbEqualTo("5");
            entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
        return entitylist;
    }
    /**
     * ��ѯ��ҽԺ�����в���
     */
    public List<FrmDepartmentEntity> getListAlldeptBySqlWhere(String yiyuan) {
        try {
        	FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
        	Criteria criteria=sqlWhere.createCriteria();
        	criteria.andSjbmEqualTo(yiyuan);
            List<FrmDepartmentEntity> entitylist=frmDepartmentDao.selectListFrmDepartmentBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }
    
    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListFrmDepartmentBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=frmDepartmentDao.selectListFrmDepartmentBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public FrmDepartmentEntity selectFrmDepartmentByPrimaryKey(String glbm) {
        try {
            FrmDepartmentEntity entity = frmDepartmentDao.selectFrmDepartmentByPrimaryKey(glbm);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,������Ϣ
      */
    public ExcuteResult insertFrmDepartment(FrmDepartmentEntity entity) {
        try {
            return frmDepartmentDao.insertFrmDepartment(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertFrmDepartmentSelective(FrmDepartmentEntity entity) {
        try {
            return frmDepartmentDao.insertFrmDepartmentSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*FRM_DEPARTMENT,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmDepartmentByPrimaryKey(FrmDepartmentEntity entity) {
        try {
            return frmDepartmentDao.updateFrmDepartmentByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateFrmDepartmentBySqlWhere(FrmDepartmentEntity entity, FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmDepartmentDao.updateFrmDepartmentBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*FRM_DEPARTMENT,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmDepartmentBySqlWhereSelective(FrmDepartmentEntity entity, FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmDepartmentDao.updateFrmDepartmentBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*FRM_DEPARTMENT,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmDepartmentByPrimaryKeySelective(FrmDepartmentEntity entity) {
        try {
            return frmDepartmentDao.updateFrmDepartmentByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteFrmDepartmentByPrimaryKey(String glbm) {
        try {
            return frmDepartmentDao.deleteFrmDepartmentByPrimaryKey(glbm);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_DEPARTMENT,������Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmDepartmentDao.deleteFrmDepartmentBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmDepartment+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*FRM_DEPARTMENT,������Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getGlbm()!=null && !sqlWhere.getGlbm().equals("")){
                criteria.andGlbmEqualTo(sqlWhere.getGlbm());
            }
            
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)frmDepartmentDao.countFrmDepartmentBySqlWhere(sqlWhere);
    }
    /**
     * ����������ѯ���������� 
     * @param request
     * @param response
     * @param entity
     */
    public String getDeptNamebyNumber(String deptid) {
    	String name = "";
         try {
        	 FrmDepartmentEntity entity = frmDepartmentDao.selectFrmDepartmentByPrimaryKey(deptid);
        	 if(entity!=null){
        		 name = entity.getBmmc();
        	 }else{
        		 name = "";
        	 }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return name;
    }
    public void setFrmDepartmentDao(IFrmDepartmentDao frmDepartmentDao) {
        this.frmDepartmentDao = frmDepartmentDao;
    }

    public IFrmDepartmentDao getFrmDepartmentDao() {
        return frmDepartmentDao;
    }
}