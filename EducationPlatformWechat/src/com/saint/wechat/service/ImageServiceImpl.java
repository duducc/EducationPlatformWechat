package com.saint.wechat.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;



public class ImageServiceImpl extends BaseService {


	public String service(Map<String, String> resultmap,String clientsxh,HttpServletRequest request,String openid,String wxtype) {
		// TODO Auto-generated method stub
		String picUrl = resultmap.get("PicUrl");
		String respMessage = null;
		String fromUserName = resultmap.get("FromUserName");//�û��˺�  
        String toUserName = resultmap.get("ToUserName");  // �����ʺ�  
		return respMessage;
	}
}
