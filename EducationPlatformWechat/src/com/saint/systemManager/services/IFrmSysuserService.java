package com.saint.systemManager.services;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.bean.FrmProgramQxgroupEntity;
import com.saint.systemManager.bean.FrmSysuserEntity;
import com.saint.systemManager.sqlWhere.FrmSysuserSqlWhere;

public interface IFrmSysuserService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteFrmSysuserByPrimaryKey(String yhdh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertFrmSysuser(FrmSysuserEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertFrmSysuserSelective(FrmSysuserEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<FrmSysuserEntity> selectListPageFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<FrmSysuserEntity> selectListFrmSysuserBySqlWhere(FrmSysuserSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListFrmSysuserBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    FrmSysuserEntity selectFrmSysuserByPrimaryKey(String yhdh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmSysuserBySqlWhereSelective(@Param("record") FrmSysuserEntity record, @Param("sqlWhere") FrmSysuserSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateFrmSysuserBySqlWhere(@Param("record") FrmSysuserEntity record, @Param("sqlWhere") FrmSysuserSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateFrmSysuserByPrimaryKeySelective(FrmSysuserEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateFrmSysuserByPrimaryKey(FrmSysuserEntity record);
    
    public List<FrmSysuserEntity> selectListFrmSysuserBySqlWhereYhjb(FrmSysuserSqlWhere sqlWhere);
    
    /**
     * �Զ��巽�� 
     */
    /**
     * ��������
     * @param user
     * @return
     */
    ExcuteResult resetUserMM(FrmSysuserEntity user);
    /**
     * �û�����
     * @param sysuser
     * @return
     */
    ExcuteResult updateUserMM(FrmSysuserEntity sysuser);
    /**
     * ����������ѯһ����¼
     * @return
     */
    FrmProgramQxgroupEntity selectFrmProgramQxgroupByPrimaryKey(String qxgroup);
}