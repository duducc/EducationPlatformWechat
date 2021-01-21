package com.saint.wechat.manager.bean;

public class XfCourseTicklingKey {
    /**数据库列类型:String,数据库列注释:人员ID**/
    private String usernumber;

    /**数据库列类型:String,数据库列注释:课程ID**/
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