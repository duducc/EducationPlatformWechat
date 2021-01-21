package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxDepartmentEntity;
import com.saint.teaching.sqlWhere.JxDepartmentSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxDepartmentDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxDepartmentByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxDepartment(JxDepartmentEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxDepartmentSelective(JxDepartmentEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxDepartmentEntity> selectListPageJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxDepartmentEntity selectJxDepartmentByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxDepartmentEntity> selectListJxDepartmentBySqlWhere(JxDepartmentSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxDepartmentBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxDepartmentBySqlWhereSelective(@Param("record") JxDepartmentEntity record, @Param("sqlWhere") JxDepartmentSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxDepartmentBySqlWhere(@Param("record") JxDepartmentEntity record, @Param("sqlWhere") JxDepartmentSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxDepartmentByPrimaryKeySelective(JxDepartmentEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxDepartmentByPrimaryKey(JxDepartmentEntity record);
}