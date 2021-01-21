package com.saint.wechat.manager.services;


/**
 * 
 * @author Lgg
 *
 */
public interface ISysTokenService {
	 String getToken(String clientsxh);
	 String getJSTicket(String clientsxh);
}
