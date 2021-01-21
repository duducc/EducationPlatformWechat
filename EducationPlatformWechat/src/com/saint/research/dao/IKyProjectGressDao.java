package com.saint.research.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyProjectGressEntity;
import com.saint.research.sqlWhere.KyProjectGressSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IKyProjectGressDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteKyProjectGressByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertKyProjectGress(KyProjectGressEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertKyProjectGressSelective(KyProjectGressEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<KyProjectGressEntity> selectListPageKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    KyProjectGressEntity selectKyProjectGressByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<KyProjectGressEntity> selectListKyProjectGressBySqlWhere(KyProjectGressSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListKyProjectGressBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateKyProjectGressBySqlWhereSelective(@Param("record") KyProjectGressEntity record, @Param("sqlWhere") KyProjectGressSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateKyProjectGressBySqlWhere(@Param("record") KyProjectGressEntity record, @Param("sqlWhere") KyProjectGressSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateKyProjectGressByPrimaryKeySelective(KyProjectGressEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateKyProjectGressByPrimaryKey(KyProjectGressEntity record);
}