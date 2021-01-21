package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsGradeEntity;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IJxStudentsGradeDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxStudentsGradeByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsGrade(JxStudentsGradeEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsGradeSelective(JxStudentsGradeEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxStudentsGradeEntity> selectListPageJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxStudentsGradeEntity selectJxStudentsGradeByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxStudentsGradeEntity> selectListJxStudentsGradeBySqlWhere(JxStudentsGradeSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentsGradeBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxStudentsGradeBySqlWhereSelective(@Param("record") JxStudentsGradeEntity record, @Param("sqlWhere") JxStudentsGradeSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxStudentsGradeBySqlWhere(@Param("record") JxStudentsGradeEntity record, @Param("sqlWhere") JxStudentsGradeSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxStudentsGradeByPrimaryKeySelective(JxStudentsGradeEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxStudentsGradeByPrimaryKey(JxStudentsGradeEntity record);
    /**
     * 
     * ��ѯ��һ������
     * @return
     */
	String queryNextIndex();
}