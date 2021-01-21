package com.saint.teaching.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IJxClassService {
	/**
	 * ��ѯ����
	 * @return
	 */
	int selectJxClassSequence();
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countJxClassBySqlWhere(JxClassSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteJxClassBySqlWhere(JxClassSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteJxClassByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertJxClass(JxClassEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertJxClassSelective(JxClassEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<JxClassEntity> selectListPageJxClassBySqlWhere(JxClassSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<JxClassEntity> selectListJxClassBySqlWhere(JxClassSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListJxClassBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    JxClassEntity selectJxClassByPrimaryKey(String xh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxClassBySqlWhereSelective(@Param("record") JxClassEntity record, @Param("sqlWhere") JxClassSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateJxClassBySqlWhere(@Param("record") JxClassEntity record, @Param("sqlWhere") JxClassSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateJxClassByPrimaryKeySelective(JxClassEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateJxClassByPrimaryKey(JxClassEntity record);
}