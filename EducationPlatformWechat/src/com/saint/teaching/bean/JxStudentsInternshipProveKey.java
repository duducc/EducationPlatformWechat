package com.saint.teaching.bean;

public class JxStudentsInternshipProveKey {
    /**���ݿ�������:String,���ݿ���ע��:ѧ��id**/
    private String studentsid;

    /**���ݿ�������:String,���ݿ���ע��:ʵϰ����ID**/
    private String depid;

    public String getStudentsid() {
        return studentsid;
    }

    public void setStudentsid(String studentsid) {
        this.studentsid = studentsid == null ? null : studentsid.trim();
    }

    public String getDepid() {
        return depid;
    }

    public void setDepid(String depid) {
        this.depid = depid == null ? null : depid.trim();
    }
}