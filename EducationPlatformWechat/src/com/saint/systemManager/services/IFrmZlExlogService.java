package com.saint.systemManager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmZlExlogEntity;
import com.saint.systemManager.sqlWhere.FrmZlExlogSqlWhere;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;

public interface IFrmZlExlogService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteFrmZlExlogByPrimaryKey(String iden);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertFrmZlExlog(FrmZlExlogEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertFrmZlExlogSelective(FrmZlExlogEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<FrmZlExlogEntity> selectListPageFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<FrmZlExlogEntity> selectListFrmZlExlogBySqlWhere(FrmZlExlogSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmZlExlogBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    FrmZlExlogEntity selectFrmZlExlogByPrimaryKey(String iden);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmZlExlogBySqlWhereSelective(@Param("record") FrmZlExlogEntity record, @Param("sqlWhere") FrmZlExlogSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateFrmZlExlogBySqlWhere(@Param("record") FrmZlExlogEntity record, @Param("sqlWhere") FrmZlExlogSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmZlExlogByPrimaryKeySelective(FrmZlExlogEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateFrmZlExlogByPrimaryKey(FrmZlExlogEntity record);
    public void saveFrmZlExlog(HttpServletRequest request,String cznr,String loginfo);
}