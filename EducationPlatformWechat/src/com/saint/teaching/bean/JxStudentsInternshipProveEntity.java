package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStudentsInternshipProveEntity extends JxStudentsInternshipProveKey {
    /**���ݿ�������:String,���ݿ���ע��:ʵϰ��������**/
    private String depname;

    /**���ݿ�������:String,���ݿ���ע��:ѧ������**/
    private String studentsname;

    /**���ݿ�������:String,���ݿ���ע��:��ʼʱ��**/
    private String startdate;

    /**���ݿ�������:String,���ݿ���ע��:����ʱ��**/
    private String enddate;

    /**���ݿ�������:String,���ݿ���ע��:֤����**/
    private String zmr;
    
    /**���ݿ�������:String,���ݿ���ע��:֤����**/
    private String zmrid;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
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