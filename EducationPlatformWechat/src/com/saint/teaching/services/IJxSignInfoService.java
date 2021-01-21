package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxSignInfoService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxSignInfoByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxSignInfo(JxSignInfoEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxSignInfoSelective(JxSignInfoEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxSignInfoEntity> selectListPageJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxSignInfoEntity> selectListJxSignInfoBySqlWhere(JxSignInfoSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxSignInfoBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxSignInfoEntity selectJxSignInfoByPrimaryKey(String xh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxSignInfoBySqlWhereSelective(@Param("record") JxSignInfoEntity record, @Param("sqlWhere") JxSignInfoSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxSignInfoBySqlWhere(@Param("record") JxSignInfoEntity record, @Param("sqlWhere") JxSignInfoSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxSignInfoByPrimaryKeySelective(JxSignInfoEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxSignInfoByPrimaryKey(JxSignInfoEntity record);
}