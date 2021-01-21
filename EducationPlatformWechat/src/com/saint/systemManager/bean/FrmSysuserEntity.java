package com.saint.systemManager.bean;

import com.saint.pub.plugin.PageEntity;

public class FrmSysuserEntity extends PageEntity {
    private String yhdh;//用户代号

    private String yhgh;//用户工号

    private String sfzmhm;//身份证号码

    private String xm;//姓名

    private String mm;//密码

    private String mmyxq;//mmyxq

    private String yhyxq;//用户有效期

    private String glbm;//管理部门

    private String yhjb;//用户级别

    private String yhlb;//用户类别

    private String qxms;//权限描述

    private String ipstart;

    private String ipend;

    private String ip1;

    private String ip2;

    private String mac;

    private String zt;

    private String zhdlsj;

    private String gxsj;

    private String bz;

    private String sfgly;

    private String sfxz;

    private String lxdh;

    private String sn1;
   	private String sn2;
   	private String sn3;
   	private String defaultmm;
   	
   	private String qxgroup;// 权限组
   	private String result;
   	private String cxdh;
   	private String sfbhxj;
	private String ymm;
   	public String getDefaultmm() {
   		return this.yhdh+"111111";
   	}

   	public void setDefaultmm(String defaultmm) {
   		this.defaultmm = defaultmm;
   	}
   	public String getSn1() {
   		return "49412";
   	}

   	public void setSn1(String sn1) {
   		this.sn1 = sn1;
   	}

   	public String getSn2() {
   		return "12544";
   	}

   	public void setSn2(String sn2) {
   		this.sn2 = sn2;
   	}

   	public String getSn3() {
   		return "05153";
   	}

   	public void setSn3(String sn3) {
   		this.sn3 = sn3;
   	}
   	
    public String getYhdh() {
        return yhdh;
    }

    public void setYhdh(String yhdh) {
        this.yhdh = yhdh == null ? null : yhdh.trim();
    }

    public String getYhgh() {
        return yhgh;
    }

    public void setYhgh(String yhgh) {
        this.yhgh = yhgh == null ? null : yhgh.trim();
    }

    public String getSfzmhm() {
        return sfzmhm;
    }

    public void setSfzmhm(String sfzmhm) {
        this.sfzmhm = sfzmhm == null ? null : sfzmhm.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm == null ? null : mm.trim();
    }

    public String getMmyxq() {
        return mmyxq;
    }

    public void setMmyxq(String mmyxq) {
        this.mmyxq = mmyxq;
    }

    public String getYhyxq() {
        return yhyxq;
    }

    public void setYhyxq(String yhyxq) {
        this.yhyxq = yhyxq;
    }

    public String getGlbm() {
        return glbm;
    }

    public void setGlbm(String glbm) {
        this.glbm = glbm == null ? null : glbm.trim();
    }

    public String getYhjb() {
        return yhjb;
    }

    public void setYhjb(String yhjb) {
        this.yhjb = yhjb == null ? null : yhjb.trim();
    }

    public String getYhlb() {
        return yhlb;
    }

    public void setYhlb(String yhlb) {
        this.yhlb = yhlb == null ? null : yhlb.trim();
    }

    public String getQxms() {
        return qxms;
    }

    public void setQxms(String qxms) {
        this.qxms = qxms == null ? null : qxms.trim();
    }

    public String getIpstart() {
        return ipstart;
    }

    public void setIpstart(String ipstart) {
        this.ipstart = ipstart == null ? null : ipstart.trim();
    }

    public String getIpend() {
        return ipend;
    }

    public void setIpend(String ipend) {
        this.ipend = ipend == null ? null : ipend.trim();
    }

    public String getIp1() {
        return ip1;
    }

    public void setIp1(String ip1) {
        this.ip1 = ip1 == null ? null : ip1.trim();
    }

    public String getIp2() {
        return ip2;
    }

    public void setIp2(String ip2) {
        this.ip2 = ip2 == null ? null : ip2.trim();
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt == null ? null : zt.trim();
    }

    public String getZhdlsj() {
        return zhdlsj;
    }

    public void setZhdlsj(String zhdlsj) {
        this.zhdlsj = zhdlsj;
    }

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz == null ? null : bz.trim();
    }

    public String getSfgly() {
        return sfgly;
    }

    public void setSfgly(String sfgly) {
        this.sfgly = sfgly == null ? null : sfgly.trim();
    }

    public String getSfxz() {
        return sfxz;
    }

    public void setSfxz(String sfxz) {
        this.sfxz = sfxz == null ? null : sfxz.trim();
    }



	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getQxgroup() {
		return qxgroup;
	}

	public void setQxgroup(String qxgroup) {
		this.qxgroup = qxgroup;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getCxdh() {
		return cxdh;
	}

	public void setCxdh(String cxdh) {
		this.cxdh = cxdh;
	}

	public String getYmm() {
		return ymm;
	}

	public void setYmm(String ymm) {
		this.ymm = ymm;
	}

	public String getSfbhxj() {
		return sfbhxj;
	}

	public void setSfbhxj(String sfbhxj) {
		this.sfbhxj = sfbhxj;
	}
	
}