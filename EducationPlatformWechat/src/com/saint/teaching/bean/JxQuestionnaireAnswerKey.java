package com.saint.teaching.bean;

public class JxQuestionnaireAnswerKey {
    /**���ݿ�������:String,���ݿ���ע��:ѧ��id**/
    private String studentid;

    /**���ݿ�������:String,���ݿ���ע��:�ν�ID**/
    private String arrangexh;

    /**���ݿ�������:String,���ݿ���ע��:����ID**/
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