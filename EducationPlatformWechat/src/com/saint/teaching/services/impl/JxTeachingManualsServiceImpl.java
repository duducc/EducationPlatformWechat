package com.saint.teaching.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingManualsEntity;
import com.saint.teaching.dao.IJxTeachingManualsDao;
import com.saint.teaching.services.IJxTeachingManualsService;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere.Criteria;

/**
*��ע����Ϣ
*����JX_TEACHING_MANUALS
*��˵��ʵϰ�������ֲ��¼
  */
public class JxTeachingManualsServiceImpl implements IJxTeachingManualsService {
    private IJxTeachingManualsDao jxTeachingManualsDao;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_TEACHING_MANUALS
    *��˵��ʵϰ�������ֲ��¼
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public List<JxTeachingManualsEntity> selectListPageJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
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
            List<JxTeachingManualsEntity> entitylist=jxTeachingManualsDao.selectListPageJxTeachingManualsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ��ѯ��JX_TEACHING_MANUALS
     * ��˵��ʵϰ�������ֲ��¼
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<JxTeachingManualsEntity> selectListJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getTeacherName()!=null && !sqlWhere.getTeacherName().equals("")){
                criteria.andTeacherNameLike("%"+sqlWhere.getTeacherName()+"%");
            }
            if(sqlWhere.getStuId()!=null && !sqlWhere.getStuId().equals("")){
                criteria.andStuIdEqualTo(sqlWhere.getStuId());
            }
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
            }
            if(sqlWhere.getType()!=null && !sqlWhere.getType().equals("")){
                criteria.andTypeEqualTo(sqlWhere.getType());
            }
            if(sqlWhere.getOpemid()!=null && !sqlWhere.getOpemid().equals("")){
                criteria.andOpemidEqualTo(sqlWhere.getOpemid());
            }
            if(sqlWhere.getZttime()!=null && !sqlWhere.getZttime().equals("")){
	            String time = sqlWhere.getZttime();
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//yyyy-mm-dd, �����ʱ�䲻��, ��ΪСд��mm�Ǵ���: ��
	            Date utilDate = null;
				try {
					utilDate = sdf.parse(time);
				} catch (ParseException e) {
					e.printStackTrace();
				}
	            criteria.andZttimeGreaterThanOrEqualTo(utilDate);
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
            List<JxTeachingManualsEntity> entitylist=jxTeachingManualsDao.selectListJxTeachingManualsBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListJxTeachingManualsBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=jxTeachingManualsDao.selectListJxTeachingManualsBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public JxTeachingManualsEntity selectJxTeachingManualsByPrimaryKey(String xh) {
        try {
            JxTeachingManualsEntity entity = jxTeachingManualsDao.selectJxTeachingManualsByPrimaryKey(xh);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,������Ϣ
      */
    public ExcuteResult insertJxTeachingManuals(JxTeachingManualsEntity entity) {
        try {
            return jxTeachingManualsDao.insertJxTeachingManuals(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertJxTeachingManualsSelective(JxTeachingManualsEntity entity) {
        try {
            return jxTeachingManualsDao.insertJxTeachingManualsSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,�޸�
      */
    public ExcuteResult updateJxTeachingManualsByPrimaryKey(JxTeachingManualsEntity entity) {
        try {
            return jxTeachingManualsDao.updateJxTeachingManualsByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateJxTeachingManualsBySqlWhere(JxTeachingManualsEntity entity, JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingManualsDao.updateJxTeachingManualsBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,�޸�
      */
    public ExcuteResult updateJxTeachingManualsBySqlWhereSelective(JxTeachingManualsEntity entity, JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingManualsDao.updateJxTeachingManualsBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,�޸�
      */
    public ExcuteResult updateJxTeachingManualsByPrimaryKeySelective(JxTeachingManualsEntity entity) {
        try {
            return jxTeachingManualsDao.updateJxTeachingManualsByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManualsByPrimaryKey(String xh) {
        try {
            return jxTeachingManualsDao.deleteJxTeachingManualsByPrimaryKey(xh);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	*����ע����Ϣ
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return jxTeachingManualsDao.deleteJxTeachingManualsBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteJxTeachingManuals+"ʧ�ܣ�"+e.getMessage());
        }
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*JX_TEACHING_MANUALS,ʵϰ�������ֲ��¼��
    	* @param sqlWhere
    	* @return
    	*/
    public int countJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            if(sqlWhere.getStuId()!=null && !sqlWhere.getStuId().equals("")){
                criteria.andStuIdEqualTo(sqlWhere.getStuId());
            }
            if(sqlWhere.getDeptid()!=null && !sqlWhere.getDeptid().equals("")){
                criteria.andDeptidEqualTo(sqlWhere.getDeptid());
            }
            if(sqlWhere.getType()!=null && !sqlWhere.getType().equals("")){
                criteria.andTypeEqualTo(sqlWhere.getType());
            }
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)jxTeachingManualsDao.countJxTeachingManualsBySqlWhere(sqlWhere);
    }

    public void setJxTeachingManualsDao(IJxTeachingManualsDao jxTeachingManualsDao) {
        this.jxTeachingManualsDao = jxTeachingManualsDao;
    }

    public IJxTeachingManualsDao getJxTeachingManualsDao() {
        return jxTeachingManualsDao;
    }
}