package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfEmpRegisterEntity;
import com.saint.wechat.manager.dao.IXfEmpRegisterDao;
import com.saint.wechat.manager.sqlWhere.XfEmpRegisterSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*类注释信息
	*表名XF_EMP_REGISTER
	*表说明员工信息申请表
  */
public class XfEmpRegisterDaoImpl extends BaseDaoImpl implements IXfEmpRegisterDao {

    /**
    	*方法注释信息
    	*分页查询表XF_EMP_REGISTER
    	*表说明员工信息申请表
    	* 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    	* @param sqlWhere
    	* @return
    	*/
    public List<XfEmpRegisterEntity> selectListPageXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfEmpRegisterBySqlWhere"); 
    }

    /**
     * 根据主键查询一条记录
     * @return
     */
    public XfEmpRegisterEntity selectXfEmpRegisterByPrimaryKey(String usernumber) {
        return (XfEmpRegisterEntity)getObject(usernumber, "selectXfEmpRegisterByPrimaryKey");
    }

    /**
     * 查询表XF_EMP_REGISTER
     * 表说明员工信息申请表
     * 实现根据sqlWhere传入的条件查询出信息列表
     * @param sqlWhere
     * @return
     */
    public List<XfEmpRegisterEntity> selectListXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfEmpRegisterBySqlWhere"); 
    }

    /**
     * 实现根据传入的sql语句查询出信息列表，返回hashMap类型
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfEmpRegisterBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,插入信息
      */
    public ExcuteResult insertXfEmpRegister(XfEmpRegisterEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfEmpRegister");
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,插入信息
    	* 新增一行记录，插入时只插入非空列
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfEmpRegisterSelective(XfEmpRegisterEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfEmpRegisterSelective");
    }

    /**
    	*方法注释信息
    	*根据主键修改
    	*XF_EMP_REGISTER,员工信息申请表表,修改
      */
    public ExcuteResult updateXfEmpRegisterByPrimaryKey(XfEmpRegisterEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfEmpRegisterByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,修改
     * 更新满足sqlWhere条件的记录，更新时只更新非空列
     * @return
     */
    public ExcuteResult updateXfEmpRegisterBySqlWhere(XfEmpRegisterEntity entity, XfEmpRegisterSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfEmpRegisterBySqlWhere");
    }

    /**
    	*方法注释信息
    	*根据sqlwhere实体里有值得更新
    	*XF_EMP_REGISTER,员工信息申请表表,修改
      */
    public ExcuteResult updateXfEmpRegisterBySqlWhereSelective(XfEmpRegisterEntity entity, XfEmpRegisterSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfEmpRegisterBySqlWhereSelective");
    }

    /**
    	*方法注释信息
    	*根据主键更新实体里有值得列
    	*XF_EMP_REGISTER,员工信息申请表表,修改
      */
    public ExcuteResult updateXfEmpRegisterByPrimaryKeySelective(XfEmpRegisterEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfEmpRegisterByPrimaryKeySelective");
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,删除
    	* 实现根据记录主键删除相应的记录
    	* @return
    	*/
    public ExcuteResult deleteXfEmpRegisterByPrimaryKey(String usernumber) {
        return excuteDataBase(usernumber, ExcuteType.DELETE, "deleteXfEmpRegisterByPrimaryKey");
    }

    /**
    	*方法注释信息
    	*XF_EMP_REGISTER,员工信息申请表表,删除
    	* 实现根据sqlWhere传入的条件删除相应的记录
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfEmpRegisterBySqlWhere");
    }

    /**
    	* 实现根据sqlWhere传入的条件 COUNT 出记录数
    	*XF_EMP_REGISTER,员工信息申请表表
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfEmpRegisterBySqlWhere");
    }
}