package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsLeaveCheckEntity;
import com.saint.teaching.sqlWhere.JxStudentsLeaveCheckSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentsLeaveCheckDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxStudentsLeaveCheckByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsLeaveCheck(JxStudentsLeaveCheckEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsLeaveCheckSelective(JxStudentsLeaveCheckEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxStudentsLeaveCheckEntity> selectListPageJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxStudentsLeaveCheckEntity selectJxStudentsLeaveCheckByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxStudentsLeaveCheckEntity> selectListJxStudentsLeaveCheckBySqlWhere(JxStudentsLeaveCheckSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentsLeaveCheckBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxStudentsLeaveCheckBySqlWhereSelective(@Param("record") JxStudentsLeaveCheckEntity record, @Param("sqlWhere") JxStudentsLeaveCheckSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxStudentsLeaveCheckBySqlWhere(@Param("record") JxStudentsLeaveCheckEntity record, @Param("sqlWhere") JxStudentsLeaveCheckSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxStudentsLeaveCheckByPrimaryKeySelective(JxStudentsLeaveCheckEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxStudentsLeaveCheckByPrimaryKey(JxStudentsLeaveCheckEntity record);
}