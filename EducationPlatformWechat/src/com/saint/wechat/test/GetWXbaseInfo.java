package com.saint.wechat.test;

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;
import com.saint.wechat.manager.bean.WXUserBase;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WxUsers;
import com.saint.wechat.manager.services.impl.WechatBindServiceImpl;
import com.saint.wechat.utils.HTMLHelper;
import com.saint.wechat.utils.WcTool;

public class GetWXbaseInfo {
	static String USERS_PATH="https://api.weixin.qq.com/cgi-bin/user/get?access_token={ACCESS_TOKEN}&next_openid=";
	static String USERINFO_PATH="https://api.weixin.qq.com/cgi-bin/user/info?access_token={ACCESS_TOKEN}&openid={OPENID}";
	
	
	
	public static void main(String[] args) {
		WebApplicationContext wc=null;
		wc=WcTool.wc;
		ServletContext servletContext = wc.getServletContext();  
		
		WechatBindServiceImpl gzyhservice=(WechatBindServiceImpl) wc.getBean("wechatBindService");
		
		String access_token="dSHzPHU3SDWDZwlO0GEi_LMvnlwJjHgsxYtzolfSSD7l8yjF9AxpPu_HHeRpSg8oFAP_9RZaGCCXxTPBc6U5-5EqkRKi-TwjDZrDJmoYPEmSleKmdv8Ft_DnBJsm3OlrLCWaAIAVMG";
		String url=USERS_PATH.replace("{ACCESS_TOKEN}", access_token);
		try {
			String a = HTMLHelper.getOneHtml(url, "utf-8");
			
			WxUsers users=new Gson().fromJson(a, WxUsers.class);
			
			String url2=USERINFO_PATH.replace("{ACCESS_TOKEN}", access_token);
			for (String s : users.getData().getOpenid()) {
				System.out.println(s);
				url2=url2.replace("{OPENID}", s);
				
				String info = HTMLHelper.getOneHtml(url2, "utf-8");
				System.out.println(info);
				WXUserBase base=new Gson().fromJson(info, WXUserBase.class);
				WechatBindEntity gzyh=new WechatBindEntity();
				//gzyh.setOpenid(base.getOpenid());
				gzyh.setNickname(base.getNickname());
				gzyh.setCity(base.getCity());
				gzyh.setCountry(base.getCountry());
				gzyh.setProvince(base.getProvince());
				gzyh.setSex(base.getSex());
				gzyh.setHeadimgurl(base.getHeadimgurl());
				System.out.println("openid="+base.getOpenid()+"nickname="+base.getNickname()
						+"city="+base.getCity()+"country="+base.getCountry()+"Province"+base.getProvince()
						+"Sex="+base.getSex());
				//gzyhservice.getwxuserbaseinfo();
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
