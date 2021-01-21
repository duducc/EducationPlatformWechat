package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.sqlWhere.WechatClientinfoSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWechatClientinfoService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteWechatClientinfoByPrimaryKey(String clientsxh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertWechatClientinfo(WechatClientinfoEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertWechatClientinfoSelective(WechatClientinfoEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<WechatClientinfoEntity> selectListPageWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<WechatClientinfoEntity> selectListWechatClientinfoBySqlWhere(WechatClientinfoSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatClientinfoBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    WechatClientinfoEntity selectWechatClientinfoByPrimaryKey(String clientsxh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatClientinfoBySqlWhereSelective(@Param("record") WechatClientinfoEntity record, @Param("sqlWhere") WechatClientinfoSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateWechatClientinfoBySqlWhere(@Param("record") WechatClientinfoEntity record, @Param("sqlWhere") WechatClientinfoSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatClientinfoByPrimaryKeySelective(WechatClientinfoEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateWechatClientinfoByPrimaryKey(WechatClientinfoEntity record);
}