package com.saint.teaching.bean;

import com.saint.pub.plugin.PageEntity;

public class JxStencilEntity extends PageEntity {
    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String xh;

    /**���ݿ�������:String,���ݿ���ע��:����**/
    private String name;

    /**���ݿ�������:String,���ݿ���ע��:ģ�����(0:����ѧ����1:���۽�ʦ��2:���ۿγ̣�3:���ۿ���)**/
    private String type;

    /**���ݿ�������:String,���ݿ���ע��:�Ƿ�����(0:��1:��)**/
    private String isusing;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark1;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark2;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark3;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark4;

    /**���ݿ�������:String,���ݿ���ע��:null**/
    private String remark5;

    /**���ݿ�������:Date,���ݿ���ע��:��������**/
    private String createdate;

    /**���ݿ�������:String,���ݿ���ע��:������**/
    private String createper;

    /**���ݿ�������:Date,���ݿ���ע��:����ʱ��**/
    private String updatedate;
    

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIsusing() {
        return isusing;
    }

    public void setIsusing(String isusing) {
        this.isusing = isusing == null ? null : isusing.trim();
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

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getCreateper() {
        return createper;
    }

    public void setCreateper(String createper) {
        this.createper = createper == null ? null : createper.trim();
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }
}