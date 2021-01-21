package com.saint.wechat.pojo;

/** 
 *  
 * @author qindan 
 * @date 2013-11-11 
 */ 
public class ViewButton extends Button {
    private String type;//类型
	private String url;//view类型必须参数

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
