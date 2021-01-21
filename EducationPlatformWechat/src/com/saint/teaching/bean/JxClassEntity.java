package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxClassEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:主键
**/
    private String xh;

    /**数据库列类型:String,数据库列注释:班级名称
**/
    private String name;

    /**数据库列类型:String,数据库列注释:年级
**/
    private String grade;

    /**数据库列类型:String,数据库列注释:科室ID
**/
    private String deptid;

    /**数据库列类型:String,数据库列注释:科室名称
**/
    private String deptname;

    /**数据库列类型:Date,数据库列注释:开始时间
**/
    private String starttime;

    /**数据库列类型:Date,数据库列注释:结束时间
**/
    private String endtime;

    /**数据库列类型:BigDecimal,数据库列注释:人数
**/
    private String empnumber;

    /**数据库列类型:String,数据库列注释:导师ID
**/
    private String teacherid;

    /**数据库列类型:String,数据库列注释:导师姓名
**/
    private String teachername;

    /**数据库列类型:String,数据库列注释:描述
**/
    private String description;

    /**数据库列类型:String,数据库列注释:创建人ID
**/
    private String creatperid;

    /**数据库列类型:String,数据库列注释:创建人名称
**/
    private String creatpername;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String updatetime;
    
    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String professtypeid;
    
    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String professtypename;
    
    private String type;
    
    private String banji;
    
    
    
    public String getBanji() {
		return banji;
	}

	public void setBanji(String banji) {
		this.banji = banji;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProfesstypeid() {
		return professtypeid;
	}

	public void setProfesstypeid(String professtypeid) {
		this.professtypeid = professtypeid;
	}

	public String getProfesstypename() {
		return professtypename;
	}

	public void setProfesstypename(String professtypename) {
		this.professtypename = professtypename;
	}

	public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getEmpnumber() {
        return empnumber;
    }

    public void setEmpnumber(String empnumber) {
        this.empnumber = empnumber;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCreatperid() {
        return creatperid;
    }

    public void setCreatperid(String creatperid) {
        this.creatperid = creatperid == null ? null : creatperid.trim();
    }

    public String getCreatpername() {
        return creatpername;
    }

    public void setCreatpername(String creatpername) {
        this.creatpername = creatpername == null ? null : creatpername.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}