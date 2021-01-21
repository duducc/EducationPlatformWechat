package com.saint.research.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.research.bean.KYProjectEntity;
import com.saint.research.sqlWhere.KYProjectSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IKYProjectDao {
	/**
    * ��ѯ����
    * @param sqlWhere
    * @return
    */
    int selectKYProjectSequence();
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteKYProjectByPrimaryKey(String prosequence);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertKYProject(KYProjectEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertKYProjectSelective(KYProjectEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<KYProjectEntity> selectListPageKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    KYProjectEntity selectKYProjectByPrimaryKey(String prosequence);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<KYProjectEntity> selectListKYProjectBySqlWhere(KYProjectSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListKYProjectBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateKYProjectBySqlWhereSelective(@Param("record") KYProjectEntity record, @Param("sqlWhere") KYProjectSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateKYProjectBySqlWhere(@Param("record") KYProjectEntity record, @Param("sqlWhere") KYProjectSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateKYProjectByPrimaryKeySelective(KYProjectEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateKYProjectByPrimaryKey(KYProjectEntity record);
    
    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
     * @param sqlWhere
     * @return
     */
    List<String> selectListKYProject(Map<String ,Object> map);
    
    List<KYProjectEntity> selectListPageProject(KYProjectSqlWhere sqlWhere);

    
}