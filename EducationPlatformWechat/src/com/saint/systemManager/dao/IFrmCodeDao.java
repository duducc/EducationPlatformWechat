package com.saint.systemManager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IFrmCodeDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteFrmCodeByPrimaryKey(FrmCodeKey key);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertFrmCode(FrmCodeEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertFrmCodeSelective(FrmCodeEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б������������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<FrmCodeEntity> selectListPageFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    FrmCodeEntity selectFrmCodeByPrimaryKey(FrmCodeKey key);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<FrmCodeEntity> selectListFrmCodeBySqlWhere(FrmCodeSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmCodeBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmCodeBySqlWhereSelective(@Param("record") FrmCodeEntity record, @Param("sqlWhere") FrmCodeSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateFrmCodeBySqlWhere(@Param("record") FrmCodeEntity record, @Param("sqlWhere") FrmCodeSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmCodeByPrimaryKeySelective(FrmCodeEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateFrmCodeByPrimaryKey(FrmCodeEntity record);
}