package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfHoldingTaskEntity;
import com.saint.wechat.manager.sqlWhere.XfCourseSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IXfCourseDao {
    /**

     * 
     * @param addunit
     * @param addyear
     * @return
     */
    List<XfCourseEntity> selectXfBarcodeCourselist(String addunit,String startyear);
    /**

    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteXfCourseByPrimaryKey(String courseId);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfCourse(XfCourseEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfCourseSelective(XfCourseEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfCourseEntity> selectListPageXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfCourseEntity selectXfCourseByPrimaryKey(String courseId);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfCourseEntity> selectListXfCourseBySqlWhere(XfCourseSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfCourseBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfCourseBySqlWhereSelective(@Param("record") XfCourseEntity record, @Param("sqlWhere") XfCourseSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfCourseBySqlWhere(@Param("record") XfCourseEntity record, @Param("sqlWhere") XfCourseSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfCourseByPrimaryKeySelective(XfCourseEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfCourseByPrimaryKey(XfCourseEntity record);
    /**
     * ����һ�м�¼(���ھٰ����)
     * @param record
     * @return
     */
     ExcuteResult insertXfHoldingTask(XfHoldingTaskEntity record);
     /**
      * ������������һ����¼(���ھٰ����)
      * @return
      */
     ExcuteResult updateXfHoldingTaskByPrimaryKey(XfHoldingTaskEntity record);
     /**
      * ����������ѯһ����¼(���ھٰ����)
      * @return
      */
     XfHoldingTaskEntity selectXfHoldingTaskByPrimaryKey(String usernumber);
}