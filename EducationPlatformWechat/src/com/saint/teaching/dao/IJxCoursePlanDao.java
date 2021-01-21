package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxCoursePlanDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxCoursePlanByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxCoursePlan(JxCoursePlanEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxCoursePlanSelective(JxCoursePlanEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxCoursePlanEntity> selectListPageJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxCoursePlanEntity selectJxCoursePlanByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxCoursePlanEntity> selectListJxCoursePlanBySqlWhere(JxCoursePlanSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxCoursePlanBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxCoursePlanBySqlWhereSelective(@Param("record") JxCoursePlanEntity record, @Param("sqlWhere") JxCoursePlanSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxCoursePlanBySqlWhere(@Param("record") JxCoursePlanEntity record, @Param("sqlWhere") JxCoursePlanSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxCoursePlanByPrimaryKeySelective(JxCoursePlanEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxCoursePlanByPrimaryKey(JxCoursePlanEntity record);
}