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
	*��ע����Ϣ
	*����XF_EMPLOYEE
	*��˵����Ա��Ϣ
  */
public class XfEmployeeDaoImpl extends BaseDaoImpl implements IXfEmployeeDao {
	@Override
	public int selectJxschoolmanager() {
	    return (Integer)getObject("", "selectJxschoolmanager");
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
        return getObjectList(sqlWhere,"selectListPageXfEmployeeBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public XfEmployeeEntity selectXfEmployeeByPrimaryKey(String usernumber) {
        return (XfEmployeeEntity)getObject(usernumber, "selectXfEmployeeByPrimaryKey");
    }

    /**
     * ��ѯ��XF_EMPLOYEE
     * ��˵����Ա��Ϣ
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<XfEmployeeEntity> selectListXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfEmployeeBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfEmployeeBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,������Ϣ
      */
    public ExcuteResult insertXfEmployee(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfEmployee");
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfEmployeeSelective(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfEmployeeSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*XF_EMPLOYEE,��Ա��Ϣ��,�޸�
      */
    public ExcuteResult updateXfEmployeeByPrimaryKey(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfEmployeeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateXfEmployeeBySqlWhere(XfEmployeeEntity entity, XfEmployeeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfEmployeeBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*XF_EMPLOYEE,��Ա��Ϣ��,�޸�
      */
    public ExcuteResult updateXfEmployeeBySqlWhereSelective(XfEmployeeEntity entity, XfEmployeeSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfEmployeeBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*XF_EMPLOYEE,��Ա��Ϣ��,�޸�
      */
    public ExcuteResult updateXfEmployeeByPrimaryKeySelective(XfEmployeeEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfEmployeeByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteXfEmployeeByPrimaryKey(String usernumber) {
        return excuteDataBase(usernumber, ExcuteType.DELETE, "deleteXfEmployeeByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*XF_EMPLOYEE,��Ա��Ϣ��,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfEmployeeBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*XF_EMPLOYEE,��Ա��Ϣ��
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfEmployeeBySqlWhere");
    }
}