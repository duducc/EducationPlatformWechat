package com.saint.pub.services.imp;

import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;


/**
 * ��������Ŀ�Ĺ�����
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
	 * ����һ���ָ�����
	 * 
	 * @param str
	 *            Ҫ�ָ���ַ���
	 * @param reg
	 *            ʹ�÷ָ�ı�ʶ
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
        Random rd = new Random(); // �����������
        String n = "";            //���������
        int rdGet; // ȡ�������
        do {
            if (rd.nextInt() % 2 == 1) {
            rdGet = Math.abs(rd.nextInt()) % 10 + 48; // ����48��57�������(0-9�ļ�λֵ)
           } else
           {
             rdGet = Math.abs(rd.nextInt()) % 26 + 97; // ����97��122�������(a-z�ļ�λֵ)
           }
        char num1 = (char) rdGet;            //intת��char
        String dd = Character.toString(num1);
        n += dd;
   } while (n.length() < 8);// �趨���ȣ��˴��ٶ�����С��8
     
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
