package com.saint.wechat.pojo;

/** 
 *  
 * @author qindan 
 * @date 2013-11-11 
 */ 
public class ViewButton extends Button {
    private String type;//����
	private String url;//view���ͱ������

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
