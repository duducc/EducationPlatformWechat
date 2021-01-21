package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfStudyRegistrationDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfStudyRegistrationByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfStudyRegistration(XfStudyRegistrationEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfStudyRegistrationSelective(XfStudyRegistrationEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfStudyRegistrationEntity> selectListPageXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfStudyRegistrationEntity selectXfStudyRegistrationByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfStudyRegistrationEntity> selectListXfStudyRegistrationBySqlWhere(XfStudyRegistrationSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfStudyRegistrationBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfStudyRegistrationBySqlWhereSelective(@Param("record") XfStudyRegistrationEntity record, @Param("sqlWhere") XfStudyRegistrationSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfStudyRegistrationBySqlWhere(@Param("record") XfStudyRegistrationEntity record, @Param("sqlWhere") XfStudyRegistrationSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfStudyRegistrationByPrimaryKeySelective(XfStudyRegistrationEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfStudyRegistrationByPrimaryKey(XfStudyRegistrationEntity record);
}