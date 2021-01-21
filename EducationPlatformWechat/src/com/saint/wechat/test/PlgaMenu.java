package com.saint.wechat.test;

import com.saint.pub.Constant;
import com.saint.wechat.pojo.Button;
import com.saint.wechat.pojo.CommonButton;
import com.saint.wechat.pojo.ComplexButton;
import com.saint.wechat.pojo.Menu;
import com.saint.wechat.pojo.ViewButton;
import com.saint.wechat.utils.WxAPIUtils;

public class PlgaMenu {
	
	public static void main(String[] args) {
		String appid=Constant.APPID;
		String appsecret=Constant.APPSECRET;
		String token=WxAPIUtils.getAccess_token(appid, appsecret);
		if(null!=token){
			System.out.println(token);
			int note=WxAPIUtils.createMenu(getMent(), token);
			System.out.println(note);
			if(note==0){
				System.out.println("创建菜单成功!");
			}else{
				System.out.println("创建菜单失败!");
			}
		}
	}

	private static Menu getMent() {
		//二级菜单点击推菜单
		CommonButton firstButton=new CommonButton();
		firstButton.setKey("");//key
		firstButton.setName("科目一");
		firstButton.setType("click");//click属于点击推事件.view属于跳转URL事件.
		//二级菜单view菜单
		ViewButton view1=new ViewButton();
		view1.setName("微博空间");
		view1.setType("view");
		view1.setUrl("http://www.weibo.com");
		//一级菜单
		ComplexButton  button1=new ComplexButton();
		button1.setName("办事指南");
		button1.setSub_button(new Button[]{firstButton,view1});
		//一级菜单
		ComplexButton  button2=new ComplexButton();
		button2.setName("业务简介");
		button2.setSub_button(new Button[]{firstButton,view1});
		//一级菜单
		ComplexButton  button3=new ComplexButton();
		button3.setName("综合办理");
		button3.setSub_button(new Button[]{firstButton,view1});
		return null;
	}

}
