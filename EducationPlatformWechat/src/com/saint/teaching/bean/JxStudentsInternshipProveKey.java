package com.saint.teaching.bean;

public class JxStudentsInternshipProveKey {
    /**数据库列类型:String,数据库列注释:学生id**/
    private String studentsid;

    /**数据库列类型:String,数据库列注释:实习科室ID**/
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