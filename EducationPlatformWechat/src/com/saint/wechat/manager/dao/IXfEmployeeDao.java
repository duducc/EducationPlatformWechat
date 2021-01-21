package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfEmployeeDao {
	/**
    * ��ѯ����
    * @param sqlWhere
    * @return
    */
    int selectJxschoolmanager();
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfEmployeeByPrimaryKey(String usernumber);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfEmployee(XfEmployeeEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfEmployeeSelective(XfEmployeeEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfEmployeeEntity> selectListPageXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfEmployeeEntity selectXfEmployeeByPrimaryKey(String usernumber);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfEmployeeEntity> selectListXfEmployeeBySqlWhere(XfEmployeeSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfEmployeeBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfEmployeeBySqlWhereSelective(@Param("record") XfEmployeeEntity record, @Param("sqlWhere") XfEmployeeSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfEmployeeBySqlWhere(@Param("record") XfEmployeeEntity record, @Param("sqlWhere") XfEmployeeSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfEmployeeByPrimaryKeySelective(XfEmployeeEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfEmployeeByPrimaryKey(XfEmployeeEntity record);
}