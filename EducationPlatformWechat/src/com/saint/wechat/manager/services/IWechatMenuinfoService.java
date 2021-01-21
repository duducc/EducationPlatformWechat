package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import com.saint.wechat.manager.sqlWhere.WechatMenuinfoSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IWechatMenuinfoService {
	
	public String createMenu(WechatMenugroupSqlWhere sqlWhere);
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteWechatMenuinfoByPrimaryKey(String menuid);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertWechatMenuinfo(WechatMenuinfoEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertWechatMenuinfoSelective(WechatMenuinfoEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<WechatMenuinfoEntity> selectListPageWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<WechatMenuinfoEntity> selectListWechatMenuinfoBySqlWhere(WechatMenuinfoSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatMenuinfoBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    WechatMenuinfoEntity selectWechatMenuinfoByPrimaryKey(String menuid);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatMenuinfoBySqlWhereSelective(@Param("record") WechatMenuinfoEntity record, @Param("sqlWhere") WechatMenuinfoSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateWechatMenuinfoBySqlWhere(@Param("record") WechatMenuinfoEntity record, @Param("sqlWhere") WechatMenuinfoSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatMenuinfoByPrimaryKeySelective(WechatMenuinfoEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateWechatMenuinfoByPrimaryKey(WechatMenuinfoEntity record);
}