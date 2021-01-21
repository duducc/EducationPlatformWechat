package com.saint.pub.services.imp;

import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;


/**
 * 是整个项目的工具类
 * 
 * @author fapwlh
 * 
 */
public class Tools {


	public static boolean getNotEmpstring(String a) {
		return StringUtils.isEmpty(a);
	}
	public static boolean notEmpty(String dialect) {
		// TODO Auto-generated method stub
		return StringUtils.isNotEmpty(dialect);
	}
	public static boolean isEmpty(String dialect) {
		// TODO Auto-generated method stub
		return StringUtils.isEmpty(dialect);
	}
	/**
	 * 返回一个分割数据
	 * 
	 * @param str
	 *            要分割的字符串
	 * @param reg
	 *            使用分割的标识
	 * @return java.lang.String[]
	 */
	public static String[] getStringSplit(String str, String reg) {
		if (getNotEmpstring(str) && getNotEmpstring(reg)) {
			return str.split(reg);
		} else {
			return null;
		}
	}
	public static String getRands() {
        Random rd = new Random(); // 创建随机对象
        String n = "";            //保存随机数
        int rdGet; // 取得随机数
        do {
            if (rd.nextInt() % 2 == 1) {
            rdGet = Math.abs(rd.nextInt()) % 10 + 48; // 产生48到57的随机数(0-9的键位值)
           } else
           {
             rdGet = Math.abs(rd.nextInt()) % 26 + 97; // 产生97到122的随机数(a-z的键位值)
           }
        char num1 = (char) rdGet;            //int转换char
        String dd = Character.toString(num1);
        n += dd;
   } while (n.length() < 8);// 设定长度，此处假定长度小于8
     
     return n;
 }
	public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
	public static String[] getFzjg(){
		return "A,B,C,D,E,F,G,H,I,J,K,L,M,N,P,Q,R,S,T,U,V,W,X,Y,Z".split(",");
	}
	

}
