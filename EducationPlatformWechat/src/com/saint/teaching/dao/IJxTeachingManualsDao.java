package com.saint.teaching.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingManualsEntity;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxTeachingManualsDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxTeachingManualsByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingManuals(JxTeachingManualsEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingManualsSelective(JxTeachingManualsEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxTeachingManualsEntity> selectListPageJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxTeachingManualsEntity selectJxTeachingManualsByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxTeachingManualsEntity> selectListJxTeachingManualsBySqlWhere(JxTeachingManualsSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxTeachingManualsBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxTeachingManualsBySqlWhereSelective(@Param("record") JxTeachingManualsEntity record, @Param("sqlWhere") JxTeachingManualsSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxTeachingManualsBySqlWhere(@Param("record") JxTeachingManualsEntity record, @Param("sqlWhere") JxTeachingManualsSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxTeachingManualsByPrimaryKeySelective(JxTeachingManualsEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxTeachingManualsByPrimaryKey(JxTeachingManualsEntity record);
}