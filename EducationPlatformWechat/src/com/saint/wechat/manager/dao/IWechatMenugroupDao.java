package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.WechatMenugroupEntity;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IWechatMenugroupDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteWechatMenugroupByPrimaryKey(String menusxh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertWechatMenugroup(WechatMenugroupEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertWechatMenugroupSelective(WechatMenugroupEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<WechatMenugroupEntity> selectListPageWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    WechatMenugroupEntity selectWechatMenugroupByPrimaryKey(String menusxh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<WechatMenugroupEntity> selectListWechatMenugroupBySqlWhere(WechatMenugroupSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatMenugroupBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatMenugroupBySqlWhereSelective(@Param("record") WechatMenugroupEntity record, @Param("sqlWhere") WechatMenugroupSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateWechatMenugroupBySqlWhere(@Param("record") WechatMenugroupEntity record, @Param("sqlWhere") WechatMenugroupSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatMenugroupByPrimaryKeySelective(WechatMenugroupEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateWechatMenugroupByPrimaryKey(WechatMenugroupEntity record);
}