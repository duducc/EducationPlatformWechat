package com.saint.research.services.impl;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KYProjectEntity;
import com.saint.research.dao.IKYProjectDao;
import com.saint.research.services.IKYProjectService;
import com.saint.research.sqlWhere.KYProjectSqlWhere.*;
import com.saint.research.sqlWhere.KYProjectSqlWhere;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

/**
*��ע����Ϣ
*����KY_PROJECT
*��˵��������Ŀ��Ϣ
  */
public class KYProjectServiceImpl implements IKYProjectService {
    private IKYProjectDao kYProjectDao;
    /**
	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
	*KY_PROJECT,������Ŀ��Ϣ��
	* @param sqlWhere
	* @return
	*/
	public int selectKYProjectSequence() {
	    return (Integer)kYProjectDao.selectKYProjectSequence();
	}
    /**
    *����ע����Ϣ
    *��ҳ��ѯ��KY_PROJECT
    *��˵��������Ŀ��Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<KYProjectEntity> selectListPageKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getHospitalid()!=null && !sqlWhere.getHospitalid().equals("")){
            	criteria.andHospitalidLike("%"+sqlWhere.getHospitalid()+"%");
            }
            if(sqlWhere.getHospitalname()!=null && !sqlWhere.getHospitalname().equals("")){
            	criteria.andHospitalnameLike("%"+sqlWhere.getHospitalname()+"%");
            }
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceLike("%"+sqlWhere.getProsequence()+"%");
            }
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
            	criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
            }
            if(sqlWhere.getPrograde()!=null && !sqlWhere.getPrograde().equals("")){
            	criteria.andProgradeLike("%"+sqlWhere.getPrograde()+"%");
            }
            
            if(sqlWhere.getPmname()!=null && !sqlWhere.getPmname().equals("")){
            	criteria.andPmnameLike("%"+sqlWhere.getPmname()+"%");
            }
            
            if(sqlWhere.getProstate()!=null && !sqlWhere.getProstate().equals("")){
            	String[] prostates = sqlWhere.getProstate().split(",");
            	List<String> tempList = Arrays.asList(prostates);
            	criteria.andProstateIn(tempList);
            }
            if(sqlWhere.getCheckorder()!=null && !sqlWhere.getCheckorder().equals("")){
                criteria.andCheckorderEqualTo(sqlWhere.getCheckorder());
            }
            if(sqlWhere.getSubjecttype()!=null && !sqlWhere.getSubjecttype().equals("")){
                criteria.andSubjecttypeEqualTo(sqlWhere.getSubjecttype());
            }
            
            if( null != sqlWhere.getpList() ){
            	criteria.andProsequenceIn(sqlWhere.getpList());
            }
            
            if( null != sqlWhere.getPromark() && !sqlWhere.getPromark().equals("")){
            	criteria.andPromarkNotEqualTo(sqlWhere.getPromark()) ;
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
        	List<KYProjectEntity> entitylist = kYProjectDao.selectListPageKYProjectBySqlWhere(sqlWhere) ;
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��KY_PROJECT
     * ��˵��������Ŀ��Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<KYProjectEntity> selectListKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if( !StringUtils.isEmpty(sqlWhere.getProname())){
            	criteria.andPronameLike("%" + sqlWhere.getProname() + "%") ; 
            }
            if( !StringUtils.isEmpty(sqlWhere.getProsequence())){
            	String[] arr = sqlWhere.getProsequence().split(",") ;
            	criteria.andProsequenceIn(Arrays.asList(arr)) ;
            }
            if(sqlWhere.getProstate()!=null && !sqlWhere.getProstate().equals("")){
            	String[] prostates = sqlWhere.getProstate().split(",");
            	List<String> tempList = Arrays.asList(prostates);
            	criteria.andProstateIn(tempList);
            }
            if(sqlWhere.getSubjecttype()!=null && !sqlWhere.getSubjecttype().equals("")){
                criteria.andSubjecttypeEqualTo(sqlWhere.getSubjecttype());
            }
            if(sqlWhere.getPronature()!=null && !sqlWhere.getPronature().equals("")){
                criteria.andPronatureEqualTo(sqlWhere.getPronature());
            }
            if(sqlWhere.getPmname()!=null && !sqlWhere.getPmname().equals("")){
            	criteria.andPmnameLike("%"+sqlWhere.getPmname()+"%");
            }
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
            	criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
            }
        }
        try {
            List<KYProjectEntity> entitylist=kYProjectDao.selectListKYProjectBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListKYProjectBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=kYProjectDao.selectListKYProjectBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public KYProjectEntity selectKYProjectByPrimaryKey(String prosequence) {
        try {
            KYProjectEntity entity = kYProjectDao.selectKYProjectByPrimaryKey(prosequence);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,������Ϣ
      */
    public ExcuteResult insertKYProject(KYProjectEntity entity) {
        try {
            return kYProjectDao.insertKYProject(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertKYProjectSelective(KYProjectEntity entity) {
        try {
            return kYProjectDao.insertKYProjectSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*KY_PROJECT,������Ŀ��Ϣ��,�޸�
      */
    public ExcuteResult updateKYProjectByPrimaryKey(KYProjectEntity entity) {
        try {
            return kYProjectDao.updateKYProjectByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateKYProjectBySqlWhere(KYProjectEntity entity, KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kYProjectDao.updateKYProjectBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*KY_PROJECT,������Ŀ��Ϣ��,�޸�
      */
    public ExcuteResult updateKYProjectBySqlWhereSelective(KYProjectEntity entity, KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kYProjectDao.updateKYProjectBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*KY_PROJECT,������Ŀ��Ϣ��,�޸�
      */
    public ExcuteResult updateKYProjectByPrimaryKeySelective(KYProjectEntity entity) {
        try {
            return kYProjectDao.updateKYProjectByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteKYProjectByPrimaryKey(String prosequence) {
        try {
            return kYProjectDao.deleteKYProjectByPrimaryKey(prosequence);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*KY_PROJECT,������Ŀ��Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return kYProjectDao.deleteKYProjectBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteKYProject+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*KY_PROJECT,������Ŀ��Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)kYProjectDao.countKYProjectBySqlWhere(sqlWhere);
    }
    
    @Override
	public List<String> selectListKYProject(Map<String, Object> map) {
		return kYProjectDao.selectListKYProject(map);
	}

    @Override
	public List<KYProjectEntity> selectListPageProject(KYProjectSqlWhere sqlWhere) {
    	
    	if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getHospitalid()!=null && !sqlWhere.getHospitalid().equals("")){
            	criteria.andHospitalidLike("%"+sqlWhere.getHospitalid()+"%");
            }
            if(sqlWhere.getHospitalname()!=null && !sqlWhere.getHospitalname().equals("")){
            	criteria.andHospitalnameLike("%"+sqlWhere.getHospitalname()+"%");
            }
            if(sqlWhere.getProsequence()!=null && !sqlWhere.getProsequence().equals("")){
                criteria.andProsequenceLike("%"+sqlWhere.getProsequence()+"%");
            }
            if(sqlWhere.getProname()!=null && !sqlWhere.getProname().equals("")){
            	criteria.andPronameLike("%"+sqlWhere.getProname()+"%");
            }
            if(sqlWhere.getPrograde()!=null && !sqlWhere.getPrograde().equals("")){
            	criteria.andProgradeLike("%"+sqlWhere.getPrograde()+"%");
            }
            if(sqlWhere.getPmname()!=null && !sqlWhere.getPmname().equals("")){
            	criteria.andPmnameLike("%"+sqlWhere.getPmname()+"%");
            }
            if(sqlWhere.getProstate()!=null && !sqlWhere.getProstate().equals("")){
            	String[] prostates = sqlWhere.getProstate().split(",");
            	List<String> tempList = Arrays.asList(prostates);
            	criteria.andProstateIn(tempList);
            }
            if(sqlWhere.getCheckorder()!=null && !sqlWhere.getCheckorder().equals("")){
                criteria.andCheckorderEqualTo(sqlWhere.getCheckorder());
            }
            if(sqlWhere.getSubjecttype()!=null && !sqlWhere.getSubjecttype().equals("")){
                criteria.andSubjecttypeEqualTo(sqlWhere.getSubjecttype());
            }
            
            if( null != sqlWhere.getpList() ){
            	criteria.andProsequenceIn(sqlWhere.getpList());
            }
            
            if( null != sqlWhere.getPromark() && !sqlWhere.getPromark().equals("")){
            	criteria.andPromarkNotEqualTo(sqlWhere.getPromark()) ;
            }
    	}
    	
    	 try {
         	List<KYProjectEntity> entitylist = kYProjectDao.selectListPageProject(sqlWhere);
             sqlWhere.clear();
             return entitylist;
         } catch (ExcuteException e) {
             e.printStackTrace();
             throw new ExcuteException(FrmGnid.selectListPageKYProject+"ʧ�ܣ�"+e.getMessage());
         }
	}
    
    public void setKYProjectDao(IKYProjectDao kYProjectDao) {
        this.kYProjectDao = kYProjectDao;
    }

    public IKYProjectDao getKYProjectDao() {
        return kYProjectDao;
    }
    
    
	
	
}