package com.saint.wechat.manager.dao.impl;

import com.saint.pub.database.BaseDaoImpl;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.database.ExcuteType;
import com.saint.wechat.manager.bean.XfCourseTicklingEntity;
import com.saint.wechat.manager.bean.XfCourseTicklingKey;
import com.saint.wechat.manager.dao.IXfCourseTicklingDao;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
	*��ע����Ϣ
	*����XF_COURSE_TICKLING
	*��˵���γ���ϢѧԱ����
  */
public class XfCourseTicklingDaoImpl extends BaseDaoImpl implements IXfCourseTicklingDao {

    /**
    	*����ע����Ϣ
    	*��ҳ��ѯ��XF_COURSE_TICKLING
    	*��˵���γ���ϢѧԱ����
    	* ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    	* @param sqlWhere
    	* @return
    	*/
    public List<XfCourseTicklingEntity> selectListPageXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListPageXfCourseTicklingBySqlWhere"); 
    }

    /**
     * ����������ѯһ����¼
     * @return
     */
    public XfCourseTicklingEntity selectXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key) {
        return (XfCourseTicklingEntity)getObject(key, "selectXfCourseTicklingByPrimaryKey");
    }

    /**
     * ��ѯ��XF_COURSE_TICKLING
     * ��˵���γ���ϢѧԱ����
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б�
     * @param sqlWhere
     * @return
     */
    public List<XfCourseTicklingEntity> selectListXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        return getObjectList(sqlWhere,"selectListXfCourseTicklingBySqlWhere"); 
    }

    /**
     * ʵ�ָ��ݴ����sql����ѯ����Ϣ�б�����hashMap����
     * @param sql
     * @return
     */
    public List<HashMap<String,Object>> selectListXfCourseTicklingBySql(String sql) {
        return getListBySql(sql); 
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,������Ϣ
      */
    public ExcuteResult insertXfCourseTickling(XfCourseTicklingEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCourseTickling");
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,������Ϣ
    	* ����һ�м�¼������ʱֻ����ǿ���
    	* @param record
    	* @return
    	*/
    public ExcuteResult insertXfCourseTicklingSelective(XfCourseTicklingEntity entity) {
        return excuteDataBase(entity, ExcuteType.INSERT, "insertXfCourseTicklingSelective");
    }

    /**
    	*����ע����Ϣ
    	*���������޸�
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
      */
    public ExcuteResult updateXfCourseTicklingByPrimaryKey(XfCourseTicklingEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCourseTicklingByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
     * ��������sqlWhere�����ļ�¼������ʱֻ���·ǿ���
     * @return
     */
    public ExcuteResult updateXfCourseTicklingBySqlWhere(XfCourseTicklingEntity entity, XfCourseTicklingSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCourseTicklingBySqlWhere");
    }

    /**
    	*����ע����Ϣ
    	*����sqlwhereʵ������ֵ�ø���
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
      */
    public ExcuteResult updateXfCourseTicklingBySqlWhereSelective(XfCourseTicklingEntity entity, XfCourseTicklingSqlWhere sqlWhere) {
        Map<String, Object> tempMap = new HashMap<String, Object>();
        tempMap.put("entity", entity);
        tempMap.put("sqlWhere", sqlWhere);
        return excuteDataBase(tempMap, ExcuteType.UPDATE, "updateXfCourseTicklingBySqlWhereSelective");
    }

    /**
    	*����ע����Ϣ
    	*������������ʵ������ֵ����
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
      */
    public ExcuteResult updateXfCourseTicklingByPrimaryKeySelective(XfCourseTicklingEntity entity) {
        return excuteDataBase(entity, ExcuteType.UPDATE, "updateXfCourseTicklingByPrimaryKeySelective");
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,ɾ��
    	* ʵ�ָ��ݼ�¼����ɾ����Ӧ�ļ�¼
    	* @return
    	*/
    public ExcuteResult deleteXfCourseTicklingByPrimaryKey(XfCourseTicklingKey key) {
        return excuteDataBase(key, ExcuteType.DELETE, "deleteXfCourseTicklingByPrimaryKey");
    }

    /**
    	*����ע����Ϣ
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������,ɾ��
    	* ʵ�ָ���sqlWhere���������ɾ����Ӧ�ļ�¼
    	* @param sqlWhere
    	* @return
    	*/
    public ExcuteResult deleteXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        return excuteDataBase(sqlWhere, ExcuteType.DELETE, "deleteXfCourseTicklingBySqlWhere");
    }

    /**
    	* ʵ�ָ���sqlWhere��������� COUNT ����¼��
    	*XF_COURSE_TICKLING,�γ���ϢѧԱ������
    	* @param sqlWhere
    	* @return
    	*/
    public int countXfCourseTicklingBySqlWhere(XfCourseTicklingSqlWhere sqlWhere) {
        return (Integer)getObject(sqlWhere, "countXfCourseTicklingBySqlWhere");
    }
}