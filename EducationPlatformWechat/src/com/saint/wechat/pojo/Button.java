package com.saint.wechat.pojo;

/** 
 * 按钮的父类
 *

 */  
public class Button {
	private String name;  //菜单标题，不超过16个字节，子菜单不超过40个字节
	  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
}
