package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatNewsEntity;
import com.saint.wechat.manager.sqlWhere.WechatNewsSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWechatNewsService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteWechatNewsByPrimaryKey(String ywxh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertWechatNews(WechatNewsEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertWechatNewsSelective(WechatNewsEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<WechatNewsEntity> selectListPageWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<WechatNewsEntity> selectListWechatNewsBySqlWhere(WechatNewsSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatNewsBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    WechatNewsEntity selectWechatNewsByPrimaryKey(String ywxh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatNewsBySqlWhereSelective(@Param("record") WechatNewsEntity record, @Param("sqlWhere") WechatNewsSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateWechatNewsBySqlWhere(@Param("record") WechatNewsEntity record, @Param("sqlWhere") WechatNewsSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatNewsByPrimaryKeySelective(WechatNewsEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateWechatNewsByPrimaryKey(WechatNewsEntity record);
}