package com.saint.wechat.manager.bean;

public class XfCourseTicklingKey {
    /**���ݿ�������:String,���ݿ���ע��:��ԱID**/
    private String usernumber;

    /**���ݿ�������:String,���ݿ���ע��:�γ�ID**/
    private String courseid;

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber == null ? null : usernumber.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }
}