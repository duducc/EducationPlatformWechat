package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxEvaluateTeacherEntity;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxEvaluateTeacherService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxEvaluateTeacherByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxEvaluateTeacher(JxEvaluateTeacherEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxEvaluateTeacherSelective(JxEvaluateTeacherEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxEvaluateTeacherEntity> selectListPageJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxEvaluateTeacherEntity> selectListJxEvaluateTeacherBySqlWhere(JxEvaluateTeacherSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxEvaluateTeacherBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxEvaluateTeacherEntity selectJxEvaluateTeacherByPrimaryKey(String xh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxEvaluateTeacherBySqlWhereSelective(@Param("record") JxEvaluateTeacherEntity record, @Param("sqlWhere") JxEvaluateTeacherSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxEvaluateTeacherBySqlWhere(@Param("record") JxEvaluateTeacherEntity record, @Param("sqlWhere") JxEvaluateTeacherSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxEvaluateTeacherByPrimaryKeySelective(JxEvaluateTeacherEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxEvaluateTeacherByPrimaryKey(JxEvaluateTeacherEntity record);
}