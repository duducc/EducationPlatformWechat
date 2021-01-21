package com.saint.wechat.service.impl;

import com.google.gson.Gson;
import com.saint.wechat.manager.bean.WXUserBase;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WxUsers;
import com.saint.wechat.service.GzyhService;
import com.saint.wechat.utils.HTMLHelper;


public class GzyhServiceImpl implements GzyhService {
	
	public WechatBindEntity getwxuserbaseinfo(){
		String USERS_PATH="https://api.weixin.qq.com/cgi-bin/user/get?access_token={ACCESS_TOKEN}&next_openid=";
		String USERINFO_PATH="https://api.weixin.qq.com/cgi-bin/user/info?access_token={ACCESS_TOKEN}&openid={OPENID}";
		String access_token="dSHzPHU3SDWDZwlO0GEi_LMvnlwJjHgsxYtzolfSSD7l8yjF9AxpPu_HHeRpSg8oFAP_9RZaGCCXxTPBc6U5-5EqkRKi-TwjDZrDJmoYPEmSleKmdv8Ft_DnBJsm3OlrLCWaAIAVMG";
		String url=USERS_PATH.replace("{ACCESS_TOKEN}", access_token);
		WechatBindEntity gzyh=new WechatBindEntity();
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
				gzyh.setOpenId(base.getOpenid());
				gzyh.setNickname(base.getNickname());
				gzyh.setCity(base.getCity());
				gzyh.setCountry(base.getCountry());
				gzyh.setProvince(base.getProvince());
				gzyh.setSex(base.getSex());
				gzyh.setHeadimgurl(base.getHeadimgurl());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gzyh;
	}
}
