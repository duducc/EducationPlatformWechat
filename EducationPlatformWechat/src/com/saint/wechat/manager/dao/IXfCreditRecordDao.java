package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCreditRecordEntity;
import com.saint.wechat.manager.bean.XfPosRecordEntity;
import com.saint.wechat.manager.sqlWhere.XfCreditRecordSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IXfCreditRecordDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfCreditRecordByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfCreditRecord(XfCreditRecordEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfCreditRecordSelective(XfCreditRecordEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfCreditRecordEntity> selectListPageXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfCreditRecordEntity selectXfCreditRecordByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfCreditRecordEntity> selectListXfCreditRecordBySqlWhere(XfCreditRecordSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfCreditRecordBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfCreditRecordBySqlWhereSelective(@Param("record") XfCreditRecordEntity record, @Param("sqlWhere") XfCreditRecordSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfCreditRecordBySqlWhere(@Param("record") XfCreditRecordEntity record, @Param("sqlWhere") XfCreditRecordSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfCreditRecordByPrimaryKeySelective(XfCreditRecordEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfCreditRecordByPrimaryKey(XfCreditRecordEntity record);
    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return selectListXfPosRecodebyIsGrant
     */
    List<XfPosRecordEntity> selectListXfPosRecordBySqlWhere(String emp_number);
    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param emp_number
     * @param isgrant
     * @return
     */
    List<XfPosRecordEntity> selectListXfPosRecodebyIsGrant(String emp_number,String isgrant);
}