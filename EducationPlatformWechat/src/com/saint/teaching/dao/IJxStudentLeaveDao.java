package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentLeaveDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxStudentLeaveByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentLeave(JxStudentLeaveEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentLeaveSelective(JxStudentLeaveEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxStudentLeaveEntity> selectListPageJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxStudentLeaveEntity selectJxStudentLeaveByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxStudentLeaveEntity> selectListJxStudentLeaveBySqlWhere(JxStudentLeaveSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentLeaveBySql(String sql);
    /**
     * ��ѯ����
     * @param sqlWhere
     * @return
     */
     int selectXhJxStudentLeaveBySql();

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxStudentLeaveBySqlWhereSelective(@Param("record") JxStudentLeaveEntity record, @Param("sqlWhere") JxStudentLeaveSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxStudentLeaveBySqlWhere(@Param("record") JxStudentLeaveEntity record, @Param("sqlWhere") JxStudentLeaveSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxStudentLeaveByPrimaryKeySelective(JxStudentLeaveEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxStudentLeaveByPrimaryKey(JxStudentLeaveEntity record);
}