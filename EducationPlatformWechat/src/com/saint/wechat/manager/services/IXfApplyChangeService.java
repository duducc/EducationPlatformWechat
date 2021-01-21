package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfApplyChangeEntity;
import com.saint.wechat.manager.sqlWhere.XfApplyChangeSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfApplyChangeService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfApplyChangeByPrimaryKey(String xh);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfApplyChange(XfApplyChangeEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfApplyChangeSelective(XfApplyChangeEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfApplyChangeEntity> selectListPageXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfApplyChangeEntity> selectListXfApplyChangeBySqlWhere(XfApplyChangeSqlWhere sqlWhere);
    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfApplyChangeEntity> selectListXfApplyChangeBySqlWhere_jd(XfApplyChangeSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfApplyChangeBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfApplyChangeEntity selectXfApplyChangeByPrimaryKey(String xh);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfApplyChangeBySqlWhereSelective(@Param("record") XfApplyChangeEntity record, @Param("sqlWhere") XfApplyChangeSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfApplyChangeBySqlWhere(@Param("record") XfApplyChangeEntity record, @Param("sqlWhere") XfApplyChangeSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfApplyChangeByPrimaryKeySelective(XfApplyChangeEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfApplyChangeByPrimaryKey(XfApplyChangeEntity record);
}