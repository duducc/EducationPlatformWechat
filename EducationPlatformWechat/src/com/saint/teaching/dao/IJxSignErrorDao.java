package com.saint.teaching.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxSignErrorEntity;
import com.saint.teaching.sqlWhere.JxSignErrorSqlWhere;

public interface IJxSignErrorDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxSignErrorByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxSignError(JxSignErrorEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxSignErrorSelective(JxSignErrorEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxSignErrorEntity> selectListPageJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxSignErrorEntity selectJxSignErrorByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxSignErrorEntity> selectListJxSignErrorBySqlWhere(JxSignErrorSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxSignErrorBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxSignErrorBySqlWhereSelective(@Param("record") JxSignErrorEntity record, @Param("sqlWhere") JxSignErrorSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxSignErrorBySqlWhere(@Param("record") JxSignErrorEntity record, @Param("sqlWhere") JxSignErrorSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxSignErrorByPrimaryKeySelective(JxSignErrorEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxSignErrorByPrimaryKey(JxSignErrorEntity record);
}