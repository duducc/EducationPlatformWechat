package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfEmpRegisterEntity;
import com.saint.wechat.manager.sqlWhere.XfEmpRegisterSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfEmpRegisterService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfEmpRegisterByPrimaryKey(String usernumber);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfEmpRegister(XfEmpRegisterEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfEmpRegisterSelective(XfEmpRegisterEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfEmpRegisterEntity> selectListPageXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfEmpRegisterEntity> selectListXfEmpRegisterBySqlWhere(XfEmpRegisterSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfEmpRegisterBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfEmpRegisterEntity selectXfEmpRegisterByPrimaryKey(String usernumber);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfEmpRegisterBySqlWhereSelective(@Param("record") XfEmpRegisterEntity record, @Param("sqlWhere") XfEmpRegisterSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfEmpRegisterBySqlWhere(@Param("record") XfEmpRegisterEntity record, @Param("sqlWhere") XfEmpRegisterSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfEmpRegisterByPrimaryKeySelective(XfEmpRegisterEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfEmpRegisterByPrimaryKey(XfEmpRegisterEntity record);
}