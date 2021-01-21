package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxTeachingManusService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxTeachingManusByPrimaryKey(String manuId);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingManus(JxTeachingManusEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingManusSelective(JxTeachingManusEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxTeachingManusEntity> selectListPageJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxTeachingManusEntity> selectListJxTeachingManusBySqlWhere(JxTeachingManusSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxTeachingManusBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxTeachingManusEntity selectJxTeachingManusByPrimaryKey(String manuId);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxTeachingManusBySqlWhereSelective(@Param("record") JxTeachingManusEntity record, @Param("sqlWhere") JxTeachingManusSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxTeachingManusBySqlWhere(@Param("record") JxTeachingManusEntity record, @Param("sqlWhere") JxTeachingManusSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxTeachingManusByPrimaryKeySelective(JxTeachingManusEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxTeachingManusByPrimaryKey(JxTeachingManusEntity record);
}