package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentsInternshipProveEntity extends JxStudentsInternshipProveKey {
    /**数据库列类型:String,数据库列注释:实习科室名称**/
    private String depname;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String studentsname;

    /**数据库列类型:String,数据库列注释:开始时间**/
    private String startdate;

    /**数据库列类型:String,数据库列注释:结束时间**/
    private String enddate;

    /**数据库列类型:String,数据库列注释:证明人**/
    private String zmr;
    
    /**数据库列类型:String,数据库列注释:证明人**/
    private String zmrid;

    /**数据库列类型:Date,数据库列注释:创建时间**/
    private String createdate;

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public String getStudentsname() {
        return studentsname;
    }

    public void setStudentsname(String studentsname) {
        this.studentsname = studentsname == null ? null : studentsname.trim();
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate == null ? null : startdate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getZmr() {
        return zmr;
    }

    public void setZmr(String zmr) {
        this.zmr = zmr == null ? null : zmr.trim();
    }
    
    
    
    public String getZmrid() {
		return zmrid;
	}

	public void setZmrid(String zmrid) {
		this.zmrid = zmrid;
	}

	public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }
}