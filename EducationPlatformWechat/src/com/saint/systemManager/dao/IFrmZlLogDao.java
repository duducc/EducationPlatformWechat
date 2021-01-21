package com.saint.systemManager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmZlLogEntity;
import com.saint.systemManager.sqlWhere.FrmZlLogSqlWhere;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IFrmZlLogDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteFrmZlLogByPrimaryKey(String iden);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertFrmZlLog(FrmZlLogEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertFrmZlLogSelective(FrmZlLogEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<FrmZlLogEntity> selectListPageFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    FrmZlLogEntity selectFrmZlLogByPrimaryKey(String iden);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<FrmZlLogEntity> selectListFrmZlLogBySqlWhere(FrmZlLogSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmZlLogBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmZlLogBySqlWhereSelective(@Param("record") FrmZlLogEntity record, @Param("sqlWhere") FrmZlLogSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateFrmZlLogBySqlWhere(@Param("record") FrmZlLogEntity record, @Param("sqlWhere") FrmZlLogSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmZlLogByPrimaryKeySelective(FrmZlLogEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateFrmZlLogByPrimaryKey(FrmZlLogEntity record);
}