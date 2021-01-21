package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxStudentsLeaveEntity;
import com.saint.teaching.sqlWhere.JxStudentsLeaveSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxStudentsLeaveDao {
	/**
     * ��ѯ����
     * @param sqlWhere
     * @return
     */
     int selectXhJxStudentLeaveBySql();
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxStudentsLeaveByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsLeave(JxStudentsLeaveEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxStudentsLeaveSelective(JxStudentsLeaveEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxStudentsLeaveEntity> selectListPageJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxStudentsLeaveEntity selectJxStudentsLeaveByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxStudentsLeaveEntity> selectListJxStudentsLeaveBySqlWhere(JxStudentsLeaveSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxStudentsLeaveBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxStudentsLeaveBySqlWhereSelective(@Param("record") JxStudentsLeaveEntity record, @Param("sqlWhere") JxStudentsLeaveSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxStudentsLeaveBySqlWhere(@Param("record") JxStudentsLeaveEntity record, @Param("sqlWhere") JxStudentsLeaveSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxStudentsLeaveByPrimaryKeySelective(JxStudentsLeaveEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxStudentsLeaveByPrimaryKey(JxStudentsLeaveEntity record);
    /**
    * ����������ѯ����
    * @return
    */
	List<JxStudentsLeaveEntity> selectListJxStudentsLeaveByStuid(String xh);

}