package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxTeachingDblEntity;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxTeachingDblService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxTeachingDblByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingDbl(JxTeachingDblEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxTeachingDblSelective(JxTeachingDblEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxTeachingDblEntity> selectListPageJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxTeachingDblEntity> selectListJxTeachingDblBySqlWhere(JxTeachingDblSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxTeachingDblBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxTeachingDblEntity selectJxTeachingDblByPrimaryKey(String xh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxTeachingDblBySqlWhereSelective(@Param("record") JxTeachingDblEntity record, @Param("sqlWhere") JxTeachingDblSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxTeachingDblBySqlWhere(@Param("record") JxTeachingDblEntity record, @Param("sqlWhere") JxTeachingDblSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxTeachingDblByPrimaryKeySelective(JxTeachingDblEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxTeachingDblByPrimaryKey(JxTeachingDblEntity record);
}