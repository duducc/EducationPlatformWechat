package com.saint.systemManager.services.impl;

import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.dao.IFrmCodeDao;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere.Criteria;

/**
*��ע����Ϣ
*����FRM_CODE
*��˵��������Ϣ
  */
public class FrmCodeServiceImpl implements IFrmCodeService {
    private IFrmCodeDao frmCodeDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��FRM_CODE
    *��˵��������Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<FrmCodeEntity> selectListPageFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
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
            List<FrmCodeEntity> entitylist=frmCodeDao.selectListPageFrmCodeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��FRM_CODE
     * ��˵��������Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<FrmCodeEntity> selectListFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getDmjc()!=null && !sqlWhere.getDmjc().equals("")){
    			criteria.andDmjcEqualTo(sqlWhere.getDmjc());
    		}
            if(sqlWhere.getXtlb()!=null && !sqlWhere.getXtlb().equals("")){
    			criteria.andXtlbEqualTo(sqlWhere.getXtlb());
    		}
            if(sqlWhere.getDmlb()!=null && !sqlWhere.getDmlb().equals("")){
    			criteria.andDmlbEqualTo(sqlWhere.getDmlb());
    		}
    		if(sqlWhere.getDmz()!=null && !sqlWhere.getDmz().equals("")){
    			criteria.andDmzGreaterThanOrEqualTo(sqlWhere.getDmz());
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
            List<FrmCodeEntity> entitylist=frmCodeDao.selectListFrmCodeBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<FrmCodeEntity> selectListFrmCodeBySqlWhereJB(FrmCodeSqlWhere sqlWhere) {
    	if(sqlWhere !=null){
    		Criteria criteria=sqlWhere.createCriteria();
    		if(sqlWhere.getDmjc()!=null && !sqlWhere.getDmjc().equals("")){
    			criteria.andDmjcEqualTo(sqlWhere.getDmjc());
    		}
    		
    		if(sqlWhere.getDmz()!=null && !sqlWhere.getDmz().equals("")){
    			criteria.andDmzGreaterThanOrEqualTo(sqlWhere.getDmz());
    		}

    		/**
            if(sqlWhere.getJflx()!=null && !sqlWhere.getJflx().equals("")){
                criteria.andJflxEqualTo(sqlWhere.getJflx());
            }
            ��������ڸ�ʽ����Ҫ����ʽת��
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");������
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
    	sqlWhere.setOrderByClause("sxh");
    	try {
    		return frmCodeDao.selectListFrmCodeBySqlWhere(sqlWhere);
    	} catch (ExcuteException e) {
    		e.printStackTrace();
    		throw new ExcuteException(FrmGnid.selectListPageFrmCode+"ʧ�ܣ�"+e.getMessage());
    	}
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListFrmCodeBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=frmCodeDao.selectListFrmCodeBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public FrmCodeEntity selectFrmCodeByPrimaryKey(FrmCodeKey key) {
        try {
            FrmCodeEntity entity = frmCodeDao.selectFrmCodeByPrimaryKey(key);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }
    
    /**
     * ����������ѯһ����¼
     * @return
     */
    public String selectFrmCodeByDmz(String dmlb,String dmz) {
        try {
        	FrmCodeKey codekey = new FrmCodeKey();
            codekey.setXtlb("00");
            codekey.setDmlb(dmlb);
            codekey.setDmz(dmz);
            FrmCodeEntity entity = frmCodeDao.selectFrmCodeByPrimaryKey(codekey);
            return entity.getDmmc();
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,������Ϣ
      */
    public ExcuteResult insertFrmCode(FrmCodeEntity entity) {
        try {
            return frmCodeDao.insertFrmCode(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertFrmCodeSelective(FrmCodeEntity entity) {
        try {
            return frmCodeDao.insertFrmCodeSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*FRM_CODE,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmCodeByPrimaryKey(FrmCodeEntity entity) {
        try {
            return frmCodeDao.updateFrmCodeByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateFrmCodeBySqlWhere(FrmCodeEntity entity, FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmCodeDao.updateFrmCodeBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*FRM_CODE,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmCodeBySqlWhereSelective(FrmCodeEntity entity, FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmCodeDao.updateFrmCodeBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*FRM_CODE,������Ϣ��,�޸�
      */
    public ExcuteResult updateFrmCodeByPrimaryKeySelective(FrmCodeEntity entity) {
        try {
            return frmCodeDao.updateFrmCodeByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteFrmCodeByPrimaryKey(FrmCodeKey key) {
        try {
            return frmCodeDao.deleteFrmCodeByPrimaryKey(key);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*FRM_CODE,������Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return frmCodeDao.deleteFrmCodeBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteFrmCode+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*FRM_CODE,������Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)frmCodeDao.countFrmCodeBySqlWhere(sqlWhere);
    }

    public void setFrmCodeDao(IFrmCodeDao frmCodeDao) {
        this.frmCodeDao = frmCodeDao;
    }

    public IFrmCodeDao getFrmCodeDao() {
        return frmCodeDao;
    }

    //���ݴ����ƻ�ȡ��¼<DMZ,DMMC>
	public List<HashMap<String, Object>> selectListFrmCodeAll(String dmjc) {
		String sql = "SELECT DMZ,DMMC FROM FRM_CODE WHERE DMJC = '"+dmjc+"' ORDER BY DMZ ASC";
		return this.selectListFrmCodeBySql(sql);
	}
}