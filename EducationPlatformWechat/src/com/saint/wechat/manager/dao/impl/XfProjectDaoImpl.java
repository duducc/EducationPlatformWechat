package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.CourseOrProjectEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfProjectEntity;
import com.saint.wechat.manager.bean.XfTaskSignupEntity;
import com.saint.wechat.manager.dao.IXfProjectDao;
import com.saint.wechat.manager.sqlWhere.XfProjectSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XfProjectDaoImpl extends BaseDaoImpl implements IXfProjectDao {

    public List<XfProjectEntity> selectListPageXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfProjectBySqlWhere"); 
    }

    public XfProjectEntity selectXfProjectByPrimaryKey(String proId) {
        return (XfProjectEntity)getObject(proId, "selectXfProjectByPrimaryKey");
    }

    public List<XfProjectEntity> selectListXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfProjectBySqlWhere"); 
    }

    public List<HashMap<String,Object>> selectListXfProjectBySql(String sql) {
        return getListBySql(sql); 
    }

    public ExcuteResult insertXfProject(XfProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfProject");
    }

    public ExcuteResult insertXfProjectSelective(XfProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfProjectSelective");
    }

    public ExcuteResult updateXfProjectByPrimaryKey(XfProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfProjectByPrimaryKey");
    }

    public ExcuteResult updateXfProjectBySqlWhere(XfProjectEntity entity, XfProjectSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfProjectBySqlWhere");
    }

    public ExcuteResult updateXfProjectBySqlWhereSelective(XfProjectEntity entity, XfProjectSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfProjectBySqlWhereSelective");
    }

    public ExcuteResult updateXfProjectByPrimaryKeySelective(XfProjectEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfProjectByPrimaryKeySelective");
    }

    public ExcuteResult deleteTaskSignupInfoByPrimaryKey(String Id) {
        return excuteDataBase(Id, ExcuteType.DELETE, "deleteTaskSignupInfoByPrimaryKey");
    }

    public ExcuteResult deleteXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfProjectBySqlWhere");
    }

    public int countXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfProjectBySqlWhere");
    }

	@Override
	public List<XfProjectEntity> selectListXfProjectByAddtime(String addTime) {
		return getObjectList(addTime,"selectListXfProjectByAddtime"); 
	}

	@Override
	public List<XfProjectEntity> findListXfProject(String proName,String nowTime) {
		XfProjectEntity entity = new XfProjectEntity();
		entity.setProName(proName);
		entity.setHoldStartDate(nowTime);
		return getObjectList(entity,"findListXfProject"); 
	}

	@Override
	public List<CourseOrProjectEntity> selectXfCourseorProjectlist(String nowTime) {
		return getObjectList(nowTime,"selectXfCourseorProjectlist");
	}
	public ExcuteResult insertXfTaskSignupInfo(XfTaskSignupEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfTaskSignupInfo");
    }

	@Override
	public List<XfTaskSignupEntity> findListTaskSignupInfo(String yitongcard,String courseId) {
		XfTaskSignupEntity entity = new XfTaskSignupEntity();
		entity.setCourseId(courseId);
		entity.setYitongcard(yitongcard);
		return getObjectList(entity,"findListTaskSignupInfo");
	}

	@Override
	public List<XfTaskSignupEntity> selectListTaskSignupByCourseId(String courseId) {
		return getObjectList(courseId,"selectListTaskSignupByCourseId");
	}

	@Override
	public List<XfTaskSignupEntity> selectListTaskSignupByYiTongCard(
			String yitongcard) {
		return getObjectList(yitongcard,"selectListTaskSignupByYiTongCard");
	}

	@Override
	public XfTaskSignupEntity selectTaskSignupById(String Id) {
		return (XfTaskSignupEntity)getObject(Id, "selectTaskSignupById");
	}
}