package com.saint.research.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyProjectPlanEntity;
import com.saint.research.sqlWhere.KyProjectPlanSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IKyProjectPlanService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteKyProjectPlanByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertKyProjectPlan(KyProjectPlanEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertKyProjectPlanSelective(KyProjectPlanEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<KyProjectPlanEntity> selectListPageKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<KyProjectPlanEntity> selectListKyProjectPlanBySqlWhere(KyProjectPlanSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListKyProjectPlanBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    KyProjectPlanEntity selectKyProjectPlanByPrimaryKey(String xh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateKyProjectPlanBySqlWhereSelective(@Param("record") KyProjectPlanEntity record, @Param("sqlWhere") KyProjectPlanSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateKyProjectPlanBySqlWhere(@Param("record") KyProjectPlanEntity record, @Param("sqlWhere") KyProjectPlanSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateKyProjectPlanByPrimaryKeySelective(KyProjectPlanEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateKyProjectPlanByPrimaryKey(KyProjectPlanEntity record);
}