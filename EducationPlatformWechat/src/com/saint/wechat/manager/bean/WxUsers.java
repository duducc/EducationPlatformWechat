package com.saint.wechat.manager.bean;



public class WxUsers {
	 private int total;
	 private int count;
	 private Openid data;
	 private String next_openid;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Openid getData() {
		return data;
	}
	public void setData(Openid data) {
		this.data = data;
	}
	public String getNext_openid() {
		return next_openid;
	}
	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}

}
