package com.saint.wechat.manager.bean;


public class WechatBindEntity extends WechatBindKey {
	
    private String yitongCard;//医通卡卡号
    private String deptId; //部门ID
    private String createTime; //添加时间
    private String isAdmin; //是否管理员
    private String islqxx;//是否已拉取信息0.未拉取1.已拉取	
	private String nickname;//用户的昵称	
	private String sex;//用户的性别，值为1时是男性，值为2时是女性，值为0时是未知	
	private String city;//用户所在城市	
	private String country;//用户所在国家	
	private String province;//用户所在省份	
	private String language;//用户的语言，简体中文为zh_CN	
	private String headimgurl;//用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。	
	private String yhlb;//用户类别1.表示警员2.表示群众	
	private String sfzmhm;//身份证明号码，如果用户类别是警员的话，在绑定时做更新	
	private String xm;//姓名，用户完善相关实名信息时使用
    private String state;//状态
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private String gxsj; //更新时间
    
    private String tempticket;  //   TEMPTICKET
    
    private String tempnoncestr;//  TEMPNONCESTR
    
    private String temptimestamp; // TEMPTIMESTAMP
    
    private String tempsignature;// TEMPSIGNATURE
    
    private String apiurl; //  APIURL
    
    public String getYitongCard() {
        return yitongCard;
    }

	public void setYitongCard(String yitongCard) {
        this.yitongCard = yitongCard == null ? null : yitongCard.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getIslqxx() {
        return islqxx;
    }

    public void setIslqxx(String islqxx) {
        this.islqxx = islqxx == null ? null : islqxx.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
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

    public String getYhlb() {
        return yhlb;
    }

    public void setYhlb(String yhlb) {
        this.yhlb = yhlb == null ? null : yhlb.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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

    public String getGxsj() {
        return gxsj;
    }

    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

	public String getTempticket() {
		return tempticket;
	}

	public void setTempticket(String tempticket) {
		this.tempticket = tempticket;
	}

	public String getTempnoncestr() {
		return tempnoncestr;
	}

	public void setTempnoncestr(String tempnoncestr) {
		this.tempnoncestr = tempnoncestr;
	}

	public String getTemptimestamp() {
		return temptimestamp;
	}

	public void setTemptimestamp(String temptimestamp) {
		this.temptimestamp = temptimestamp;
	}

	public String getTempsignature() {
		return tempsignature;
	}

	public void setTempsignature(String tempsignature) {
		this.tempsignature = tempsignature;
	}

	public String getApiurl() {
		return apiurl;
	}

	public void setApiurl(String apiurl) {
		this.apiurl = apiurl;
	}
    
}