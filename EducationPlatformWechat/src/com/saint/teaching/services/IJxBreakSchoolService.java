package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxBreakSchoolService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxBreakSchoolByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxBreakSchool(JxBreakSchoolEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxBreakSchoolSelective(JxBreakSchoolEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxBreakSchoolEntity> selectListPageJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxBreakSchoolEntity> selectListJxBreakSchoolBySqlWhere(JxBreakSchoolSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxBreakSchoolBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxBreakSchoolEntity selectJxBreakSchoolByPrimaryKey(String xh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxBreakSchoolBySqlWhereSelective(@Param("record") JxBreakSchoolEntity record, @Param("sqlWhere") JxBreakSchoolSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxBreakSchoolBySqlWhere(@Param("record") JxBreakSchoolEntity record, @Param("sqlWhere") JxBreakSchoolSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxBreakSchoolByPrimaryKeySelective(JxBreakSchoolEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxBreakSchoolByPrimaryKey(JxBreakSchoolEntity record);
}