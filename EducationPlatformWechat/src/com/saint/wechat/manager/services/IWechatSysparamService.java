package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.sqlWhere.WechatSysparamSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWechatSysparamService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteWechatSysparamByPrimaryKey(WechatSysparamKey key);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertWechatSysparam(WechatSysparamEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertWechatSysparamSelective(WechatSysparamEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<WechatSysparamEntity> selectListPageWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<WechatSysparamEntity> selectListWechatSysparamBySqlWhere(WechatSysparamSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatSysparamBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    WechatSysparamEntity selectWechatSysparamByPrimaryKey(WechatSysparamKey key);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatSysparamBySqlWhereSelective(@Param("record") WechatSysparamEntity record, @Param("sqlWhere") WechatSysparamSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateWechatSysparamBySqlWhere(@Param("record") WechatSysparamEntity record, @Param("sqlWhere") WechatSysparamSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatSysparamByPrimaryKeySelective(WechatSysparamEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateWechatSysparamByPrimaryKey(WechatSysparamEntity record);
}