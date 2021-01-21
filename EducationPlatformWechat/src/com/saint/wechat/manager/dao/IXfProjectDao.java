package com.saint.wechat.manager.dao;

import com.saint.pub.database.ExcuteResult;
import com.saint.wechat.manager.bean.CourseOrProjectEntity;
import com.saint.wechat.manager.bean.XfProjectEntity;
import com.saint.wechat.manager.bean.XfTaskSignupEntity;
import com.saint.wechat.manager.sqlWhere.XfProjectSqlWhere;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface IXfProjectDao {
    /**
    * ʵ�ָ���sqlWhere��������� COUNT ����¼��
    * @param sqlWhere
    * @return
    */
    int countXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere);

    /**
    * ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    * @param sqlWhere
    * @return
    */
    ExcuteResult deleteXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere);

    /**
    * ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    * @return
    */
    ExcuteResult deleteTaskSignupInfoByPrimaryKey(String Id);

    /**
    * ����һ�м�¼
    * @param record
    * @return
    */
    ExcuteResult insertXfProject(XfProjectEntity record);

    /**
    * ����һ�м�¼������ʱֻ����ǿ���
    * @param record
    * @return
    */
    ExcuteResult insertXfProjectSelective(XfProjectEntity record);

    /**
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    List<XfProjectEntity> selectListPageXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere);

    /**
     * ����������ѯһ����¼
     * @return
     */
    XfProjectEntity selectXfProjectByPrimaryKey(String proId);

    /**
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    List<XfProjectEntity> selectListXfProjectBySqlWhere(XfProjectSqlWhere sqlWhere);

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�
     * @param sql
     * @return
     */
    List<HashMap<String,Object>> selectListXfProjectBySql(String sql);

    /**
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfProjectBySqlWhereSelective(@Param("record") XfProjectEntity record, @Param("sqlWhere") XfProjectSqlWhere example);

    /**
     * ��������sqlWhere�����ļ�¼
     * @return
     */
    ExcuteResult updateXfProjectBySqlWhere(@Param("record") XfProjectEntity record, @Param("sqlWhere") XfProjectSqlWhere example);

    /**
     * ������������һ����¼������ʱֻ���·ǿ���
     * @return
     */
    ExcuteResult updateXfProjectByPrimaryKeySelective(XfProjectEntity record);

    /**
     * ������������һ����¼
     * @return
     */
    ExcuteResult updateXfProjectByPrimaryKey(XfProjectEntity record);
    /**
     * 
     * @param addTime
     * @return
     */
    List<XfProjectEntity> selectListXfProjectByAddtime(String addTime);
    /**
     * 
     * @param proName
     * @param addTime
     * @return
     */
    List<XfProjectEntity> findListXfProject(String proName,String nowTime);
    List<CourseOrProjectEntity> selectXfCourseorProjectlist(String nowTime);
    /**
     * 
     * @param record
     * @return
     */
    ExcuteResult insertXfTaskSignupInfo(XfTaskSignupEntity record);
    /**
     * 
     * @param yitongcard
     * @param courseId
     * @return
     */
    List<XfTaskSignupEntity> findListTaskSignupInfo(String yitongcard,String courseId);
    /**
     * 
     * @param yitongcard
     * @param courseId
     * @return
     */
    List<XfTaskSignupEntity> selectListTaskSignupByCourseId(String courseId);
    /**
     * 
     * @param yitongcard
     * @param courseId
     * @return
     */
    List<XfTaskSignupEntity> selectListTaskSignupByYiTongCard(String yitongcard);
    /**
     * 
     * @param yitongcard
     * @param courseId
     * @return
     */
    XfTaskSignupEntity selectTaskSignupById(String Id);
}