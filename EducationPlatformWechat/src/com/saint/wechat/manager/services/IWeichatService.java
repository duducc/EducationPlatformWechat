package com.saint.wechat.manager.services;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface IWeichatService {
	//post«Î«Û
	String processRequest(Map<String, String> requestmap,String clientsxh,HttpServletRequest request,String openid,String wxtype);

}
