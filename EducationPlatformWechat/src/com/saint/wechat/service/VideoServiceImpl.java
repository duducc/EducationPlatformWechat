package com.saint.wechat.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;



public class VideoServiceImpl extends BaseService {

	public String service(Map<String, String> resultmap,String clientsxh,HttpServletRequest request,String openid,String wxtype) {
		// TODO Auto-generated method stub
		String respMessage = null;
		String fromUserName = resultmap.get("FromUserName");//�û��˺�  
        String toUserName = resultmap.get("ToUserName");  // �����ʺ�  
        String MediaId = resultmap.get("MediaId");
        String ThumbMediaId = resultmap.get("ThumbMediaId");
        String MsgId = resultmap.get("MsgId");
		return respMessage;
	}

}
