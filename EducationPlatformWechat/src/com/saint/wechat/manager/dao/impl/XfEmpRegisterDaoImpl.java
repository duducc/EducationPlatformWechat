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
	*��ע����Ϣ
	*����XF_EMP_REGISTER
	*��˵��Ա����Ϣ�����
  */
public class XfEmpRegisterDaoImpl extends BaseDaoImpl implements IXfEmpRegisterDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��XF_EMP_REGISTER
    	*��˵��Ա����Ϣ�����
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<XfEmpRegisterEntity> selectListPageXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfEmpRegisterBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public XfEmpRegisterEntity selectXfEmpRegisterByPrimaryKey(String usernumber) {
        return (XfEmpRegisterEntity)getObject(usernumber, "selectXfEmpRegisterByPrimaryKey");
    }

    /**
     * ��ѯ��XF_EMP_REGISTER
     * ��˵��Ա����Ϣ�����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<XfEmpRegisterEntity> selectListXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfEmpRegisterBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfEmpRegisterBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,������Ϣ
      */
    public ExcuteResult insertXfEmpRegister(XfEmpRegisterEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfEmpRegister");
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfEmpRegisterSelective(XfEmpRegisterEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfEmpRegisterSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*XF_EMP_REGISTER,Ա����Ϣ������,�޸�
      */
    public ExcuteResult updateXfEmpRegisterByPrimaryKey(XfEmpRegisterEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfEmpRegisterByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateXfEmpRegisterBySqlWhere(XfEmpRegisterEntity entity, XfEmpRegisterSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfEmpRegisterBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*XF_EMP_REGISTER,Ա����Ϣ������,�޸�
      */
    public ExcuteResult updateXfEmpRegisterBySqlWhereSelective(XfEmpRegisterEntity entity, XfEmpRegisterSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfEmpRegisterBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*XF_EMP_REGISTER,Ա����Ϣ������,�޸�
      */
    public ExcuteResult updateXfEmpRegisterByPrimaryKeySelective(XfEmpRegisterEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfEmpRegisterByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteXfEmpRegisterByPrimaryKey(String usernumber) {
        return excuteDataBase(usernumber, ExcuteType.DELETE, "deleteXfEmpRegisterByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*XF_EMP_REGISTER,Ա����Ϣ������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfEmpRegisterBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*XF_EMP_REGISTER,Ա����Ϣ������
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfEmpRegisterBySqlWhere");
    }
}