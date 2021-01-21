package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.TbDictdataEntity;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatSigntagEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IWechatBindService {
	
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteWechatBindByPrimaryKey(WechatBindKey key);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertWechatBind(WechatBindEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertWechatBindSelective(WechatBindEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<WechatBindEntity> selectListPageWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<WechatBindEntity> selectListWechatBindBySqlWhere(WechatBindSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListWechatBindBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    WechatBindEntity selectWechatBindByPrimaryKey(WechatBindKey key);
    /**
     * 
     * @param openid
     * @param clientsxh
     * @return
     */
    WechatBindEntity getBindInfo(String openid,String clientsxh);
    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatBindBySqlWhereSelective(@Param("record") WechatBindEntity record, @Param("sqlWhere") WechatBindSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateWechatBindBySqlWhere(@Param("record") WechatBindEntity record, @Param("sqlWhere") WechatBindSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateWechatBindByPrimaryKeySelective(WechatBindEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateWechatBindByPrimaryKey(WechatBindEntity record);

    /**
     * 
     * @param entity
     * @return
     */
    ExcuteResult updateEmployeeBySqlWhere(XfEmployeeEntity entity);
    /**
     * ʵ�ָ���id��ѯ����Աְ��
     * @param sqlWhere
     * @return
     */
    TbDictdataEntity selectDictdataById(String zhicheng);
    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ա��Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<TbDictdataEntity> selectListDictdataBySqlWhere(String dicttype);
    //=====================================ɨ��ǩ�����==========================================
    /**
     * ����������ѯһ����¼
     * @return
     */
    WechatSigntagEntity selectWechatSigntagByPrimaryKey(String openid);
    /**
     * ����һ�м�¼
     * @param record
     * @return
     */
    ExcuteResult insertWechatSigntag(WechatSigntagEntity record);
    /**
     * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
     * @return
    */
    ExcuteResult deleteWechatSigntagByPrimaryKey(String openid);
}