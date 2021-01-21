package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxTeachingManualsEntity extends PageEntity {
    /**数据库列类型:String,数据库列注释:唯一主键**/
    private String xh;

    /**数据库列类型:String,数据库列注释:学生ID**/
    private String stuId;

    /**数据库列类型:String,数据库列注释:学生姓名**/
    private String stuName;

    /**数据库列类型:String,数据库列注释:带教老师ID**/
    private String teacherId;

    /**数据库列类型:String,数据库列注释:带教老师姓名**/
    private String teacherName;

    /**数据库列类型:String,数据库列注释:当时轮训科室ID**/
    private String deptid;

    /**数据库列类型:String,数据库列注释:当时轮训科室名称**/
    private String deptname;

    /**数据库列类型:String,数据库列注释:班级ID**/
    private String classid;

    /**数据库列类型:String,数据库列注释:班级名称**/
    private String classname;

    /**数据库列类型:String,数据库列注释:所在组ID**/
    private String zuid;

    /**数据库列类型:String,数据库列注释:所在组名称**/
    private String zuname;

    /**数据库列类型:Date,数据库列注释:时间**/
    private String zttime;

    /**数据库列类型:String,数据库列注释:地点**/
    private String position;

    /**数据库列类型:String,数据库列注释:病人标识**/
    private String patientBs;

    /**数据库列类型:String,数据库列注释:病人姓名**/
    private String patient;

    /**数据库列类型:String,数据库列注释:病人性别**/
    private String patientSex;

    /**数据库列类型:String,数据库列注释:病人年龄**/
    private String patientAge;

    /**数据库列类型:String,数据库列注释:床号**/
    private String patientBednum;

    /**数据库列类型:String,数据库列注释:病历号**/
    private String patientBlh;

    /**数据库列类型:String,数据库列注释:麻醉方式**/
    private String patientMzfs;

    /**数据库列类型:String,数据库列注释:查房、病例讲解-诊断内容**/
    private String cfDiagnose;

    /**数据库列类型:String,数据库列注释:内容1（查房：教学准备；操作：操作项目；病例讲解：病例特点；病例讨论：学生发言摘要；讲座：讲座内容摘要）**/
    private String contento;

    /**数据库列类型:String,数据库列注释:内容2（查房：临床分析；操作：操作内容；病例讲解：讲授内容；）**/
    private String contentt;

    /**数据库列类型:String,数据库列注释:内容3（查房：操作指导；）**/
    private String contentth;

    /**数据库列类型:String,数据库列注释:内容4（查房：示范）**/
    private String contentf;

    /**数据库列类型:String,数据库列注释:内容5（）**/
    private String contentw;

    /**数据库列类型:String,数据库列注释:操作：观摩助手Id**/
    private String czGmassistantid;

    /**数据库列类型:String,数据库列注释:操作：观摩助手姓名**/
    private String czGmassistantname;

    /**数据库列类型:String,数据库列注释:操作：实作助手Id**/
    private String czSzassistantid;

    /**数据库列类型:String,数据库列注释:操作：实作助手姓名**/
    private String czSzassistantname;

    /**数据库列类型:String,数据库列注释:操作：助手1Id**/
    private String czAssistantid1;

    /**数据库列类型:String,数据库列注释:操作：助手1姓名**/
    private String czAssistantname1;

    /**数据库列类型:String,数据库列注释:操作：助手2Id**/
    private String czAssistantid2;

    /**数据库列类型:String,数据库列注释:操作：助手2姓名**/
    private String czAssistantname2;

    /**数据库列类型:String,数据库列注释:操作：助手Id**/
    private String czAssistantid;

    /**数据库列类型:String,数据库列注释:操作：助手姓名**/
    private String czAssistantname;

    /**数据库列类型:String,数据库列注释:定力讨论：讨论目的**/
    private String tlAmsnmd;

    /**数据库列类型:String,数据库列注释:讲座：课题题目**/
    private String jzCourse;

    /**数据库列类型:String,数据库列注释:讲座：参加人员ID（多人用逗号隔开）**/
    private String jzPersonid;

    /**数据库列类型:String,数据库列注释:讲座：参加人员姓名（多人用逗号隔开）**/
    private String jzPersonname;

    /**数据库列类型:String,数据库列注释:教学对象id**/
    private String teachobjid;

    /**数据库列类型:String,数据库列注释:教学对象姓名**/
    private String teachobjname;

    /**数据库列类型:String,数据库列注释:其他实习医师id**/
    private String otherstudentid;

    /**数据库列类型:String,数据库列注释:其他实习医师姓名**/
    private String otherstudentname;

    /**数据库列类型:String,数据库列注释:主管医师id**/
    private String mainguanteacherid;

    /**数据库列类型:String,数据库列注释:主管医师姓名**/
    private String mainguanteachername;

    /**数据库列类型:String,数据库列注释:主查医师id**/
    private String mainchateacherid;

    /**数据库列类型:String,数据库列注释:主查医师姓名**/
    private String mainchateachername;

    /**数据库列类型:String,数据库列注释:其他医师id**/
    private String otherteacherid;

    /**数据库列类型:String,数据库列注释:其他医师姓名**/
    private String otherteachername;

    /**数据库列类型:String,数据库列注释:汇报人id**/
    private String huibaouserid;

    /**数据库列类型:String,数据库列注释:汇报人姓名**/
    private String huibaousername;

    /**数据库列类型:String,数据库列注释:主诉人id**/
    private String mainuserid;

    /**数据库列类型:String,数据库列注释:主诉人姓名**/
    private String mainusername;

    /**数据库列类型:String,数据库列注释:文件路径**/
    private String wjlj;

    /**数据库列类型:String,数据库列注释:类型（1，查房；2，实习生操作；3，典型病例讲解；4，实习生病例讨论；5讲座记录）**/
    private String type;

    /**数据库列类型:String,数据库列注释:状态（0，未审核；1，已审核）**/
    private String state;

    /**数据库列类型:String,数据库列注释:登记人ID**/
    private String opemid;

    /**数据库列类型:String,数据库列注释:登记人姓名**/
    private String opemname;

    /**数据库列类型:Date,数据库列注释:登记时间**/
    private String opemdate;

    /**数据库列类型:String,数据库列注释:审核人ID**/
    private String spemid;

    /**数据库列类型:String,数据库列注释:审核人姓名**/
    private String spemname;

    /**数据库列类型:Date,数据库列注释:更新时间**/
    private String uptime;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark1;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark2;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark3;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark4;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark5;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark6;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark7;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark8;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark9;

    /**数据库列类型:String,数据库列注释:null**/
    private String remark10;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
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

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getZuid() {
        return zuid;
    }

    public void setZuid(String zuid) {
        this.zuid = zuid == null ? null : zuid.trim();
    }

    public String getZuname() {
        return zuname;
    }

    public void setZuname(String zuname) {
        this.zuname = zuname == null ? null : zuname.trim();
    }

    public String getZttime() {
        return zttime;
    }

    public void setZttime(String zttime) {
        this.zttime = zttime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getPatientBs() {
        return patientBs;
    }

    public void setPatientBs(String patientBs) {
        this.patientBs = patientBs == null ? null : patientBs.trim();
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient == null ? null : patient.trim();
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex == null ? null : patientSex.trim();
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge == null ? null : patientAge.trim();
    }

    public String getPatientBednum() {
        return patientBednum;
    }

    public void setPatientBednum(String patientBednum) {
        this.patientBednum = patientBednum == null ? null : patientBednum.trim();
    }

    public String getPatientBlh() {
        return patientBlh;
    }

    public void setPatientBlh(String patientBlh) {
        this.patientBlh = patientBlh == null ? null : patientBlh.trim();
    }

    public String getPatientMzfs() {
        return patientMzfs;
    }

    public void setPatientMzfs(String patientMzfs) {
        this.patientMzfs = patientMzfs == null ? null : patientMzfs.trim();
    }

    public String getCfDiagnose() {
        return cfDiagnose;
    }

    public void setCfDiagnose(String cfDiagnose) {
        this.cfDiagnose = cfDiagnose == null ? null : cfDiagnose.trim();
    }

    public String getContento() {
        return contento;
    }

    public void setContento(String contento) {
        this.contento = contento == null ? null : contento.trim();
    }

    public String getContentt() {
        return contentt;
    }

    public void setContentt(String contentt) {
        this.contentt = contentt == null ? null : contentt.trim();
    }

    public String getContentth() {
        return contentth;
    }

    public void setContentth(String contentth) {
        this.contentth = contentth == null ? null : contentth.trim();
    }

    public String getContentf() {
        return contentf;
    }

    public void setContentf(String contentf) {
        this.contentf = contentf == null ? null : contentf.trim();
    }

    public String getContentw() {
        return contentw;
    }

    public void setContentw(String contentw) {
        this.contentw = contentw == null ? null : contentw.trim();
    }

    public String getCzGmassistantid() {
        return czGmassistantid;
    }

    public void setCzGmassistantid(String czGmassistantid) {
        this.czGmassistantid = czGmassistantid == null ? null : czGmassistantid.trim();
    }

    public String getCzGmassistantname() {
        return czGmassistantname;
    }

    public void setCzGmassistantname(String czGmassistantname) {
        this.czGmassistantname = czGmassistantname == null ? null : czGmassistantname.trim();
    }

    public String getCzSzassistantid() {
        return czSzassistantid;
    }

    public void setCzSzassistantid(String czSzassistantid) {
        this.czSzassistantid = czSzassistantid == null ? null : czSzassistantid.trim();
    }

    public String getCzSzassistantname() {
        return czSzassistantname;
    }

    public void setCzSzassistantname(String czSzassistantname) {
        this.czSzassistantname = czSzassistantname == null ? null : czSzassistantname.trim();
    }

    public String getCzAssistantid1() {
        return czAssistantid1;
    }

    public void setCzAssistantid1(String czAssistantid1) {
        this.czAssistantid1 = czAssistantid1 == null ? null : czAssistantid1.trim();
    }

    public String getCzAssistantname1() {
        return czAssistantname1;
    }

    public void setCzAssistantname1(String czAssistantname1) {
        this.czAssistantname1 = czAssistantname1 == null ? null : czAssistantname1.trim();
    }

    public String getCzAssistantid2() {
        return czAssistantid2;
    }

    public void setCzAssistantid2(String czAssistantid2) {
        this.czAssistantid2 = czAssistantid2 == null ? null : czAssistantid2.trim();
    }

    public String getCzAssistantname2() {
        return czAssistantname2;
    }

    public void setCzAssistantname2(String czAssistantname2) {
        this.czAssistantname2 = czAssistantname2 == null ? null : czAssistantname2.trim();
    }

    public String getCzAssistantid() {
        return czAssistantid;
    }

    public void setCzAssistantid(String czAssistantid) {
        this.czAssistantid = czAssistantid == null ? null : czAssistantid.trim();
    }

    public String getCzAssistantname() {
        return czAssistantname;
    }

    public void setCzAssistantname(String czAssistantname) {
        this.czAssistantname = czAssistantname == null ? null : czAssistantname.trim();
    }

    public String getTlAmsnmd() {
        return tlAmsnmd;
    }

    public void setTlAmsnmd(String tlAmsnmd) {
        this.tlAmsnmd = tlAmsnmd == null ? null : tlAmsnmd.trim();
    }

    public String getJzCourse() {
        return jzCourse;
    }

    public void setJzCourse(String jzCourse) {
        this.jzCourse = jzCourse == null ? null : jzCourse.trim();
    }

    public String getJzPersonid() {
        return jzPersonid;
    }

    public void setJzPersonid(String jzPersonid) {
        this.jzPersonid = jzPersonid == null ? null : jzPersonid.trim();
    }

    public String getJzPersonname() {
        return jzPersonname;
    }

    public void setJzPersonname(String jzPersonname) {
        this.jzPersonname = jzPersonname == null ? null : jzPersonname.trim();
    }

    public String getTeachobjid() {
        return teachobjid;
    }

    public void setTeachobjid(String teachobjid) {
        this.teachobjid = teachobjid == null ? null : teachobjid.trim();
    }

    public String getTeachobjname() {
        return teachobjname;
    }

    public void setTeachobjname(String teachobjname) {
        this.teachobjname = teachobjname == null ? null : teachobjname.trim();
    }

    public String getOtherstudentid() {
        return otherstudentid;
    }

    public void setOtherstudentid(String otherstudentid) {
        this.otherstudentid = otherstudentid == null ? null : otherstudentid.trim();
    }

    public String getOtherstudentname() {
        return otherstudentname;
    }

    public void setOtherstudentname(String otherstudentname) {
        this.otherstudentname = otherstudentname == null ? null : otherstudentname.trim();
    }

    public String getMainguanteacherid() {
        return mainguanteacherid;
    }

    public void setMainguanteacherid(String mainguanteacherid) {
        this.mainguanteacherid = mainguanteacherid == null ? null : mainguanteacherid.trim();
    }

    public String getMainguanteachername() {
        return mainguanteachername;
    }

    public void setMainguanteachername(String mainguanteachername) {
        this.mainguanteachername = mainguanteachername == null ? null : mainguanteachername.trim();
    }

    public String getMainchateacherid() {
        return mainchateacherid;
    }

    public void setMainchateacherid(String mainchateacherid) {
        this.mainchateacherid = mainchateacherid == null ? null : mainchateacherid.trim();
    }

    public String getMainchateachername() {
        return mainchateachername;
    }

    public void setMainchateachername(String mainchateachername) {
        this.mainchateachername = mainchateachername == null ? null : mainchateachername.trim();
    }

    public String getOtherteacherid() {
        return otherteacherid;
    }

    public void setOtherteacherid(String otherteacherid) {
        this.otherteacherid = otherteacherid == null ? null : otherteacherid.trim();
    }

    public String getOtherteachername() {
        return otherteachername;
    }

    public void setOtherteachername(String otherteachername) {
        this.otherteachername = otherteachername == null ? null : otherteachername.trim();
    }

    public String getHuibaouserid() {
        return huibaouserid;
    }

    public void setHuibaouserid(String huibaouserid) {
        this.huibaouserid = huibaouserid == null ? null : huibaouserid.trim();
    }

    public String getHuibaousername() {
        return huibaousername;
    }

    public void setHuibaousername(String huibaousername) {
        this.huibaousername = huibaousername == null ? null : huibaousername.trim();
    }

    public String getMainuserid() {
        return mainuserid;
    }

    public void setMainuserid(String mainuserid) {
        this.mainuserid = mainuserid == null ? null : mainuserid.trim();
    }

    public String getMainusername() {
        return mainusername;
    }

    public void setMainusername(String mainusername) {
        this.mainusername = mainusername == null ? null : mainusername.trim();
    }

    public String getWjlj() {
        return wjlj;
    }

    public void setWjlj(String wjlj) {
        this.wjlj = wjlj == null ? null : wjlj.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getOpemid() {
        return opemid;
    }

    public void setOpemid(String opemid) {
        this.opemid = opemid == null ? null : opemid.trim();
    }

    public String getOpemname() {
        return opemname;
    }

    public void setOpemname(String opemname) {
        this.opemname = opemname == null ? null : opemname.trim();
    }

    public String getOpemdate() {
        return opemdate;
    }

    public void setOpemdate(String opemdate) {
        this.opemdate = opemdate;
    }

    public String getSpemid() {
        return spemid;
    }

    public void setSpemid(String spemid) {
        this.spemid = spemid == null ? null : spemid.trim();
    }

    public String getSpemname() {
        return spemname;
    }

    public void setSpemname(String spemname) {
        this.spemname = spemname == null ? null : spemname.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
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

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }

    public String getRemark6() {
        return remark6;
    }

    public void setRemark6(String remark6) {
        this.remark6 = remark6 == null ? null : remark6.trim();
    }

    public String getRemark7() {
        return remark7;
    }

    public void setRemark7(String remark7) {
        this.remark7 = remark7 == null ? null : remark7.trim();
    }

    public String getRemark8() {
        return remark8;
    }

    public void setRemark8(String remark8) {
        this.remark8 = remark8 == null ? null : remark8.trim();
    }

    public String getRemark9() {
        return remark9;
    }

    public void setRemark9(String remark9) {
        this.remark9 = remark9 == null ? null : remark9.trim();
    }

    public String getRemark10() {
        return remark10;
    }

    public void setRemark10(String remark10) {
        this.remark10 = remark10 == null ? null : remark10.trim();
    }
}