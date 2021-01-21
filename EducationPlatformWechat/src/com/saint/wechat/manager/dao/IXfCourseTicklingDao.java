package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseTicklingEntity;
import com.saint.wechat.manager.bean.XfCourseTicklingKey;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IXfCourseTicklingDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseTickling(XfCourseTicklingEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseTicklingSelective(XfCourseTicklingEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfCourseTicklingEntity> selectListPageXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfCourseTicklingEntity selectXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfCourseTicklingEntity> selectListXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfCourseTicklingBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfCourseTicklingBySqlWhereSelective(@Param("record") XfCourseTicklingEntity record, @Param("sqlWhere") XfCourseTicklingSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfCourseTicklingBySqlWhere(@Param("record") XfCourseTicklingEntity record, @Param("sqlWhere") XfCourseTicklingSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfCourseTicklingByPrimaryKeySelective(XfCourseTicklingEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfCourseTicklingByPrimaryKey(XfCourseTicklingEntity record);
}