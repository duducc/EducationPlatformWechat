package com.saint.pub;

import javax.servlet.http.HttpServletRequest;

public class GetIpaddress {

	/**
	 * 获得访问的IP地址
	 * @return
	 */
	public String getIpaddress(HttpServletRequest request){
		String ip = request.getHeader("x-forwarded-for");
		
		if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {

			ip = request.getHeader("Proxy-Client-IP");

		}

		if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {

			ip = request.getHeader("WL-Proxy-Client-IP");

		}

		if (ip == null || ip.length() == 0 || ip.equalsIgnoreCase("unknown")) {

			ip = request.getRemoteAddr();

		}
		
		return ip;
		
	}
}
