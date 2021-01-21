package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.dao.IXfEmployeeDao;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名XF_EMPLOYEE
	*表说明人员信息
  */
public class XfEmployeeDaoImpl extends BaseDaoImpl implements IXfEmployeeDao {
	@Override
	public int selectJxschoolmanager() {
	    return (Integer)getObject("", "selectJxschoolmanager");
	}
    /**
    	*方法注释信息
    	*分页查询表XF_EMPLOYEE
    	*表说明人员信息
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<XfEmployeeEntity> selectListPageXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfEmployeeBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public XfEmployeeEntity selectXfEmployeeByPrimaryKey(String usernumber) {
        return (XfEmployeeEntity)getObject(usernumber, "selectXfEmployeeByPrimaryKey");
    }

    /**
     * 查询表XF_EMPLOYEE
     * 表说明人员信息
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<XfEmployeeEntity> selectListXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfEmployeeBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfEmployeeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,插入信息
      */
    public ExcuteResult insertXfEmployee(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfEmployee");
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfEmployeeSelective(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfEmployeeSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*XF_EMPLOYEE,人员信息表,修改
      */
    public ExcuteResult updateXfEmployeeByPrimaryKey(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfEmployeeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateXfEmployeeBySqlWhere(XfEmployeeEntity entity, XfEmployeeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfEmployeeBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*XF_EMPLOYEE,人员信息表,修改
      */
    public ExcuteResult updateXfEmployeeBySqlWhereSelective(XfEmployeeEntity entity, XfEmployeeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfEmployeeBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*XF_EMPLOYEE,人员信息表,修改
      */
    public ExcuteResult updateXfEmployeeByPrimaryKeySelective(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfEmployeeByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteXfEmployeeByPrimaryKey(String usernumber) {
        return excuteDataBase(usernumber, ExcuteType.DELETE, "deleteXfEmployeeByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*XF_EMPLOYEE,人员信息表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfEmployeeBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*XF_EMPLOYEE,人员信息表
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfEmployeeBySqlWhere");
    }
}