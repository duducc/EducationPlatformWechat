package com.saint.wechat.manager.services;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseSignupEntity;
import com.saint.wechat.manager.bean.XfCourseSignupKey;
import com.saint.wechat.manager.sqlWhere.XfCourseSignupSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IXfCourseSignupService {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfCourseSignupByPrimaryKey(XfCourseSignupKey key);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseSignup(XfCourseSignupEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseSignupSelective(XfCourseSignupEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfCourseSignupEntity> selectListPageXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfCourseSignupEntity> selectListXfCourseSignupBySqlWhere(XfCourseSignupSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfCourseSignupBySql(String sql);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfCourseSignupEntity selectXfCourseSignupByPrimaryKey(XfCourseSignupKey key);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfCourseSignupBySqlWhereSelective(@Param("record") XfCourseSignupEntity record, @Param("sqlWhere") XfCourseSignupSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfCourseSignupBySqlWhere(@Param("record") XfCourseSignupEntity record, @Param("sqlWhere") XfCourseSignupSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfCourseSignupByPrimaryKeySelective(XfCourseSignupEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfCourseSignupByPrimaryKey(XfCourseSignupEntity record);
    
    
    ExcuteResult insertXfCourseSignup(XfCourseSignupEntity entity,String clientsxh,String openId);
}