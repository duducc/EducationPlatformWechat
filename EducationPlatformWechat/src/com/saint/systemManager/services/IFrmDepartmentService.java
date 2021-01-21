package com.saint.systemManager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IFrmDepartmentService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteFrmDepartmentByPrimaryKey(String glbm);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertFrmDepartment(FrmDepartmentEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertFrmDepartmentSelective(FrmDepartmentEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<FrmDepartmentEntity> selectListPageFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere);
    
    /**
     * ��ѯ������ҽԺ
     * @param sqlWhere
     * @return
     */
     List<FrmDepartmentEntity> getListAllyiyuanBySqlWhere();
     /**
      * ��ѯ������ҽԺ
      * @param sqlWhere
      * @return
      */
      List<FrmDepartmentEntity> getListAllyiyuanCoverbaseBySqlWhere();
     /**
      * ��ѯ��ҽԺ�²���
      * @param sqlWhere
      * @return
      */
      List<FrmDepartmentEntity> getListAlldeptBySqlWhere(String yiyaun);
    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWhere(FrmDepartmentSqlWhere sqlWhere);
    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<FrmDepartmentEntity> selectListFrmDepartmentBySqlWherejc(FrmDepartmentSqlWhere sqlWhere);
    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmDepartmentBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    FrmDepartmentEntity selectFrmDepartmentByPrimaryKey(String glbm);
    /**
     * ����������ѯ���������� 
     * @param deptid
     * @return
     */
    String getDeptNamebyNumber(String deptid);
    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmDepartmentBySqlWhereSelective(@Param("record") FrmDepartmentEntity record, @Param("sqlWhere") FrmDepartmentSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateFrmDepartmentBySqlWhere(@Param("record") FrmDepartmentEntity record, @Param("sqlWhere") FrmDepartmentSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmDepartmentByPrimaryKeySelective(FrmDepartmentEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateFrmDepartmentByPrimaryKey(FrmDepartmentEntity record);
}