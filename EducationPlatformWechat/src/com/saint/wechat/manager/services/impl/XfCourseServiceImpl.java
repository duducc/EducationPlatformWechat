package com.saint.wechat.manager.services.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import com.saint.constant.FrmGnid;
import com.saint.pub.database.ExcuteException;
import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfHoldingTaskEntity;
import com.saint.wechat.manager.dao.IXfCourseDao;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.sqlWhere.XfCourseSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfCourseSqlWhere.Criteria;

public class XfCourseServiceImpl implements IXfCourseService {
    private IXfCourseDao xfCourseDao;

    public List<XfCourseEntity> selectListPageXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere) {
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
            List<XfCourseEntity> entitylist=xfCourseDao.selectListPageXfCourseBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<XfCourseEntity> selectXfBarcodeCourselist(String addunit,String startyear) {
        try {
            List<XfCourseEntity> entitylist=xfCourseDao.selectXfBarcodeCourselist(addunit,startyear);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }
    
    public List<XfCourseEntity> selectListXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            //�������� ����ID
            if(sqlWhere.getDeptId()!=null && !sqlWhere.getDeptId().equals("")){
                criteria.andDeptIdEqualTo(sqlWhere.getDeptId());
            }
            //����״̬
            if(sqlWhere.getState()!=null && !sqlWhere.getState().equals("")){
            	criteria.andStateEqualTo(sqlWhere.getState());
            }
            if(sqlWhere.getIsbegin()!=null && !sqlWhere.getIsbegin().equals("")){
            	criteria.andIsbeginEqualTo(sqlWhere.getIsbegin());
            }
            if(sqlWhere.getCourseName()!=null && !sqlWhere.getCourseName().equals("")){
                criteria.andCourseNameLike("%"+sqlWhere.getCourseName()+"%");
            }
            if(sqlWhere.getAutoCheck()!=null && !sqlWhere.getAutoCheck().equals("")){
                criteria.andAutoCheckEqualTo(sqlWhere.getAutoCheck());
            }
            //��������
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");//������
            if(sqlWhere.getCoursesTask()!=null && !sqlWhere.getCoursesTask().equals("")){
                criteria.andCoursesTaskLike("%"+sqlWhere.getCoursesTask()+"%");
            }
            //��ǰ����С�ڿ�ʼʱ��
            if(sqlWhere.getEndDate()!=null && !sqlWhere.getEndDate().equals("")){
            	try {
					criteria.andEndDateGreaterThan(dateFormat.parse(sqlWhere.getEndDate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
            }
            if(sqlWhere.getStartDate()!=null && !sqlWhere.getStartDate().equals("")){
            	try {
					criteria.andStartDateGreaterThan(dateFormat.parse(sqlWhere.getStartDate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
            }
        }
        try {
            List<XfCourseEntity> entitylist=xfCourseDao.selectListXfCourseBySqlWhere(sqlWhere);
            sqlWhere.clear();
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public List<HashMap<String,Object>> selectListXfCourseBySql(String sql) {
        try {
            List<HashMap<String,Object>> entitylist=xfCourseDao.selectListXfCourseBySql(sql);
            return entitylist;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectListPageXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public XfCourseEntity selectXfCourseByPrimaryKey(String courseId) {
        try {
            XfCourseEntity entity = xfCourseDao.selectXfCourseByPrimaryKey(courseId);
            return entity;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertXfCourse(XfCourseEntity entity) {
        try {
            return xfCourseDao.insertXfCourse(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult insertXfCourseSelective(XfCourseEntity entity) {
        try {
            return xfCourseDao.insertXfCourseSelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfCourseByPrimaryKey(XfCourseEntity entity) {
        try {
            return xfCourseDao.updateXfCourseByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public XfHoldingTaskEntity selectXfHoldingTaskByPrimaryKey(String usernumber) {
        try {
        	XfHoldingTaskEntity courseId = xfCourseDao.selectXfHoldingTaskByPrimaryKey(usernumber);
            return courseId;
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.selectObjectXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }
    public ExcuteResult insertXfHoldingTask(XfHoldingTaskEntity entity) {
        try {
            return xfCourseDao.insertXfHoldingTask(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.insertXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }
    public ExcuteResult updateXfHoldingTaskByPrimaryKey(XfHoldingTaskEntity entity) {
        try {
            return xfCourseDao.updateXfHoldingTaskByPrimaryKey(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }
    
    public ExcuteResult updateXfCourseBySqlWhere(XfCourseEntity entity, XfCourseSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseDao.updateXfCourseBySqlWhere(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfCourseBySqlWhereSelective(XfCourseEntity entity, XfCourseSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseDao.updateXfCourseBySqlWhereSelective(entity,sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult updateXfCourseByPrimaryKeySelective(XfCourseEntity entity) {
        try {
            return xfCourseDao.updateXfCourseByPrimaryKeySelective(entity);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.updateXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteXfCourseByPrimaryKey(String courseId) {
        try {
            return xfCourseDao.deleteXfCourseByPrimaryKey(courseId);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public ExcuteResult deleteXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        try {
            return xfCourseDao.deleteXfCourseBySqlWhere(sqlWhere);
        } catch (ExcuteException e) {
            e.printStackTrace();
            throw new ExcuteException(FrmGnid.deleteXfCourse+"ʧ�ܣ�"+e.getMessage());
        }
    }

    public int countXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere) {
        if(sqlWhere !=null){
            Criteria criteria=sqlWhere.createCriteria();
            /**
            ʾ���μ�getPageListMethod��
            **/
        }
        return (Integer)xfCourseDao.countXfCourseBySqlWhere(sqlWhere);
    }

    public void setXfCourseDao(IXfCourseDao xfCourseDao) {
        this.xfCourseDao = xfCourseDao;
    }

    public IXfCourseDao getXfCourseDao() {
        return xfCourseDao;
    }
}