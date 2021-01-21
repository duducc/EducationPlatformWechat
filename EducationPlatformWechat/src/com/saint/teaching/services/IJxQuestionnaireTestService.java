package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxQuestionnaireTestEntity;
import com.saint.teaching.sqlWhere.JxQuestionnaireTestSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxQuestionnaireTestService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxQuestionnaireTestByPrimaryKey(String questionid);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxQuestionnaireTest(JxQuestionnaireTestEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxQuestionnaireTestSelective(JxQuestionnaireTestEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxQuestionnaireTestEntity> selectListPageJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxQuestionnaireTestEntity> selectListJxQuestionnaireTestBySqlWhere(JxQuestionnaireTestSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxQuestionnaireTestBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxQuestionnaireTestEntity selectJxQuestionnaireTestByPrimaryKey(String questionid);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxQuestionnaireTestBySqlWhereSelective(@Param("record") JxQuestionnaireTestEntity record, @Param("sqlWhere") JxQuestionnaireTestSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxQuestionnaireTestBySqlWhere(@Param("record") JxQuestionnaireTestEntity record, @Param("sqlWhere") JxQuestionnaireTestSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxQuestionnaireTestByPrimaryKeySelective(JxQuestionnaireTestEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxQuestionnaireTestByPrimaryKey(JxQuestionnaireTestEntity record);
}