package com.saint.teaching.bean;

public class JxQuestionnaireAnswerKey {
    /**数据库列类型:String,数据库列注释:学生id**/
    private String studentid;

    /**数据库列类型:String,数据库列注释:课节ID**/
    private String arrangexh;

    /**数据库列类型:String,数据库列注释:问题ID**/
    private String questionid;

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getArrangexh() {
        return arrangexh;
    }

    public void setArrangexh(String arrangexh) {
        this.arrangexh = arrangexh == null ? null : arrangexh.trim();
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid == null ? null : questionid.trim();
    }
}