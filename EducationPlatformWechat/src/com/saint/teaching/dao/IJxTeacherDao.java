package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeacherEntity;
import com.saint.teaching.sqlWhere.JxTeacherSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxTeacherDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxTeacherByPrimaryKey(String usernumber);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxTeacher(JxTeacherEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxTeacherSelective(JxTeacherEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxTeacherEntity> selectListPageJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxTeacherEntity selectJxTeacherByPrimaryKey(String usernumber);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxTeacherEntity> selectListJxTeacherBySqlWhere(JxTeacherSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxTeacherBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxTeacherBySqlWhereSelective(@Param("record") JxTeacherEntity record, @Param("sqlWhere") JxTeacherSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxTeacherBySqlWhere(@Param("record") JxTeacherEntity record, @Param("sqlWhere") JxTeacherSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxTeacherByPrimaryKeySelective(JxTeacherEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxTeacherByPrimaryKey(JxTeacherEntity record);
}