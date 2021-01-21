package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfPayHistoryEntity;
import com.saint.wechat.manager.sqlWhere.XfPayHistorySqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfPayHistoryDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfPayHistoryByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfPayHistory(XfPayHistoryEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfPayHistorySelective(XfPayHistoryEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfPayHistoryEntity> selectListPageXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfPayHistoryEntity selectXfPayHistoryByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfPayHistoryEntity> selectListXfPayHistoryBySqlWhere(XfPayHistorySqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfPayHistoryBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfPayHistoryBySqlWhereSelective(@Param("record") XfPayHistoryEntity record, @Param("sqlWhere") XfPayHistorySqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfPayHistoryBySqlWhere(@Param("record") XfPayHistoryEntity record, @Param("sqlWhere") XfPayHistorySqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfPayHistoryByPrimaryKeySelective(XfPayHistoryEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfPayHistoryByPrimaryKey(XfPayHistoryEntity record);
}