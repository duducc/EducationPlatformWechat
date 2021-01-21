package com.saint.research.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KyBonusEntity;
import com.saint.research.sqlWhere.KyBonusSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IKyBonusDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteKyBonusByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertKyBonus(KyBonusEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertKyBonusSelective(KyBonusEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<KyBonusEntity> selectListPageKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    KyBonusEntity selectKyBonusByPrimaryKey(String xh);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<KyBonusEntity> selectListKyBonusBySqlWhere(KyBonusSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListKyBonusBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateKyBonusBySqlWhereSelective(@Param("record") KyBonusEntity record, @Param("sqlWhere") KyBonusSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateKyBonusBySqlWhere(@Param("record") KyBonusEntity record, @Param("sqlWhere") KyBonusSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateKyBonusByPrimaryKeySelective(KyBonusEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateKyBonusByPrimaryKey(KyBonusEntity record);
}