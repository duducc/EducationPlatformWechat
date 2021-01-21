package com.saint.wechat.manager.bean;

public class PayHistoryEntity {
	private String id;
	private String yitongcard; //医通卡号
	private String username; //用户人姓名
	private String yiyuan; //用户所在医院
	private String paymethod; //支付方式
	private String paymoney; //支付金额
	private String yhreceipekh; //转账（支付卡号）
	private String yhrecripexm; //转账（支付姓名）
	private String rgreceipexm;	//人工（支付人姓名）
	private String rgreceipetel; //人工（支付人联系方式）
	private String rgbz; //人工（备注）
	private String remark1; 
	private String remark2;
	private String remark3;
	private String remark4;
	private String remark5;
	private String paytime; //支付时间
	private String type; //付款类型  1.续费  2.补卡  3.办卡
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getYitongcard() {
		return yitongcard;
	}
	public void setYitongcard(String yitongcard) {
		this.yitongcard = yitongcard;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getYiyuan() {
		return yiyuan;
	}
	public void setYiyuan(String yiyuan) {
		this.yiyuan = yiyuan;
	}
	public String getPaymethod() {
		return paymethod;
	}
	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}
	public String getPaymoney() {
		return paymoney;
	}
	public void setPaymoney(String paymoney) {
		this.paymoney = paymoney;
	}
	public String getYhreceipekh() {
		return yhreceipekh;
	}
	public void setYhreceipekh(String yhreceipekh) {
		this.yhreceipekh = yhreceipekh;
	}
	public String getYhrecripexm() {
		return yhrecripexm;
	}
	public void setYhrecripexm(String yhrecripexm) {
		this.yhrecripexm = yhrecripexm;
	}
	public String getRgreceipexm() {
		return rgreceipexm;
	}
	public void setRgreceipexm(String rgreceipexm) {
		this.rgreceipexm = rgreceipexm;
	}
	public String getRgreceipetel() {
		return rgreceipetel;
	}
	public void setRgreceipetel(String rgreceipetel) {
		this.rgreceipetel = rgreceipetel;
	}
	public String getRgbz() {
		return rgbz;
	}
	public void setRgbz(String rgbz) {
		this.rgbz = rgbz;
	}
	public String getRemark1() {
		return remark1;
	}
	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
	public String getRemark2() {
		return remark2;
	}
	public void setRemark2(String remark2) {
		this.remark2 = remark2;
	}
	public String getRemark3() {
		return remark3;
	}
	public void setRemark3(String remark3) {
		this.remark3 = remark3;
	}
	public String getRemark4() {
		return remark4;
	}
	public void setRemark4(String remark4) {
		this.remark4 = remark4;
	}
	public String getRemark5() {
		return remark5;
	}
	public void setRemark5(String remark5) {
		this.remark5 = remark5;
	}
	public String getPaytime() {
		return paytime;
	}
	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}
	
	
}
