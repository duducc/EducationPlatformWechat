package com.saint.wechat.manager.bean;

public class XfCourseSignupKey {
    private String courseId;

    private String yitongCard;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getYitongCard() {
        return yitongCard;
    }

    public void setYitongCard(String yitongCard) {
        this.yitongCard = yitongCard == null ? null : yitongCard.trim();
    }
}