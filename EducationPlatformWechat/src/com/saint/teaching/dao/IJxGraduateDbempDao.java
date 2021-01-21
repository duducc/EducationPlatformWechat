package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxGraduateDbempEntity;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxGraduateDbempDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxGraduateDbempByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxGraduateDbemp(JxGraduateDbempEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxGraduateDbempSelective(JxGraduateDbempEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxGraduateDbempEntity> selectListPageJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxGraduateDbempEntity selectJxGraduateDbempByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxGraduateDbempEntity> selectListJxGraduateDbempBySqlWhere(JxGraduateDbempSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxGraduateDbempBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxGraduateDbempBySqlWhereSelective(@Param("record") JxGraduateDbempEntity record, @Param("sqlWhere") JxGraduateDbempSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxGraduateDbempBySqlWhere(@Param("record") JxGraduateDbempEntity record, @Param("sqlWhere") JxGraduateDbempSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxGraduateDbempByPrimaryKeySelective(JxGraduateDbempEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxGraduateDbempByPrimaryKey(JxGraduateDbempEntity record);
}