package com.saint.pub;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import sun.misc.BASE64Encoder;

public class Tools {
	
	public static String replaceNull(Object mesg) {
		if (mesg == null || mesg == "" || mesg.equals("") || ("" + mesg).equals("null") || mesg==null) {
			return "";
		} else {
			return mesg.toString();
		}
	} 
	/**
	 * 去除字符串最后的符号
	 * @param instr  传入字符串
	 * @param signstr 需要去除的符号
	 * @return
	 */
	public static String removeLastSign(String instr,String signstr){
		String tempstr = instr;
		if(instr != null && instr.length()>0 ){
			if(instr.substring(instr.length()-1,instr.length()).equals(signstr)){
				tempstr = instr.substring(0,instr.length()-1);
			}
    	}
		return tempstr;
	}
	public static String getIp(HttpServletRequest req) {
		String ip_for = req.getHeader(" x-forwarded-for ");
		String ip_client = req.getHeader(" http_client_ip ");
		String un = " unknown ";

		if (ip_for != null && !ip_for.equalsIgnoreCase(un)
				&& ip_for.trim().length() > 0) {
			return ip_for;
		} else if (ip_client != null && !ip_client.equalsIgnoreCase(un)
				&& ip_client.trim().length() > 0) {
			return ip_client;
		} else {
			return req.getRemoteAddr();
		}
	}
	
	public static boolean checkNotNullOrEmpty(String arg){
		if(null != arg && !"".equals(arg.trim()) && arg.trim().length() != 0){
			return true;
		}
		return false;
	}
	
	public static boolean notEmpty(String s){
		return s!=null && !"".equals(s) && !"null".equals(s);
	}
	
	public static boolean isEmpty(String s){
		return s==null || "".equals(s) || "null".equals(s);
	}
	
	public static String formatDate(Date date){
		if(date!=null){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			return	sdf.format(date);
		}else return "";
	}
	
	public static String formatTimeDate(Date date) {
		if(date==null)return "";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public static String transNullOrZero(Object obj){
		String temp ="";
		if(obj instanceof Integer){
			if(!obj.equals(0)){
				temp = obj.toString();
			}
		}
		if(obj instanceof String){
			if(obj!=null){
				temp = obj.toString();
			}
		}
		return temp;
	}
	public static String formatNull(String str){
		if(str==null||str.equals("")){
			return str="--";
		}else{
			return str;
		}
	}

	public static String getException(Throwable e) {
		String excString = "";
		if (e == null) {
			excString = "空的异常对象";
		} else {
			if (e.getCause() != null) {
				excString = handleSpecialStr(e.getCause().getLocalizedMessage()
						.replaceAll("\n", ""));
			} else {
				excString = handleSpecialStr(e.toString().replaceAll("\n", ""));
			}
		}
		return excString;
	}
	public static String getException(String errMsg) {
		String excString = "";
		excString = handleSpecialStr(errMsg.replaceAll("\n", ""));
		return excString;
	}
	
	public static String handleSpecialStr(String str) {

		if (null == str || 0 == str.length()) {
			return "";
		}
		String hSymbol = "!\"#$%&'()*+,./:;<=>?@[\\]^_`{|}-~";
		String zSymbol = "！”＃＄％＆’（）＊＋，．／：；＜＝＞？＠［￥］＾＿‘｛｜｝－～";
		String tmp = str;
		for (int i = 0; i < hSymbol.length(); i++) {
			tmp = tmp.replace(hSymbol.charAt(i), zSymbol.charAt(i));
		}
		StringBuffer sb = new StringBuffer(tmp);
		return sb.toString();
	}
	
	
	
	public static String handleGlbm(String glbm,String bmjb){
		if("2".equals(bmjb))return glbm.substring(0,2);
		else if("3".equals(bmjb))return glbm.substring(0,4);
		else if("4".equals(bmjb))return glbm.substring(0,6);
		//else if("4".equals(bmjb))return glbm.substring(0,2);
		return glbm;
	}
	
	public static String transResult(int result){
		if(1==result)return "成功";
		return "失败";
	}
	
	public static String transScript(String script){
		StringBuffer sb=new StringBuffer();
		sb.append("<script>");
		sb.append(script);
		sb.append("</script>");
		return sb.toString();
	}
	 /**
	 * 把16进制字符串转换成字节数组
	 * @param hex
	 * @return
	 */
	public static byte[] hexStringToByte(String hex) {
		int len = (hex.length() / 2);
		byte[] result = new byte[len];
		char[] achar = hex.toCharArray();
		for (int i = 0; i < len; i++) {
			int pos = i * 2;
			result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
		}
		return result;
	}

	private static byte toByte(char c) {
		byte b = (byte) "0123456789ABCDEF".indexOf(c);
		return b;
	}

	/** */
	/**
	 * 把字节数组转换成16进制字符串
	 * 
	 * @param bArray
	 * @return
	 */
	public static final String bytesToHexString(byte[] bArray) {
		StringBuffer sb = new StringBuffer(bArray.length);
		String sTemp;
		for (int i = 0; i < bArray.length; i++) {
			sTemp = Integer.toHexString(0xFF & bArray[i]);
			if (sTemp.length() < 2)
				sb.append(0);
			sb.append(sTemp.toUpperCase());
		}
		return sb.toString();
	}
	/**
	 * 字符串转换（处理传值乱码问题）
	 * @param src
	 * @return
	 */
	public static String unescape(String src) {
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length());
		int lastPos = 0, pos = 0;
		char ch;
		while (lastPos < src.length()) {
			pos = src.indexOf("%", lastPos);
			if (pos == lastPos) {
				if (src.charAt(pos + 1) == 'u') {
					ch = (char) Integer.parseInt(src
							.substring(pos + 2, pos + 6), 16);
					tmp.append(ch);
					lastPos = pos + 6;
				} else {
					ch = (char) Integer.parseInt(src
							.substring(pos + 1, pos + 3), 16);
					tmp.append(ch);
					lastPos = pos + 3;
				}
			} else {
				if (pos == -1) {
					tmp.append(src.substring(lastPos));
					lastPos = src.length();
				} else {
					tmp.append(src.substring(lastPos, pos));
					lastPos = pos;
				}
			}
		}
		return tmp.toString();
	}
	
	/**
	   * 方法描述：将字符串补足位数
	   * 参数1:resString 原字符串
	   * 参数2:typeBj 标记，1为在原字符串左边补，2为在原字符串右边补
	   * 参数3:length 要补足的位数
	   * 参数4:spx 要补足的字符
	   */
	  public static String reBuildStringBySpx(String resString,String typeBj,int length,String spx) {
		  if(resString == null) {
			  resString = "";
		  }
		  resString = resString.trim();
		  while(resString.length()<length) {
			  if(typeBj.equals("1")) {
				  resString = spx + resString;
			  } else if(typeBj.equals("2")) {
				  resString  = resString + spx;
			  }
		  }
		  return resString;
	  }
	  
	  
		public static final String bytesToBase64(byte[] bArray) {
			BASE64Encoder bASE64Encoder = new BASE64Encoder();   
			String base64string = bASE64Encoder.encode(bArray);   

			return base64string;
			
			
		}
		
		
		
		public static List parseToListMap(String xml) {
			List result = new ArrayList();
			HashMap map = new HashMap();
			try {
				StringReader sr = new StringReader(xml);
				InputSource is = new InputSource(sr);
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				DocumentBuilder db = dbf.newDocumentBuilder();
				Document doc = db.parse(is);
				String code = doc.getElementsByTagName("code").item(0)
						.getFirstChild().getNodeValue();
				if ("1".equals(code)) {
					String yxqz = null != doc.getElementsByTagName("yxqz").item(0)
							.getFirstChild()?doc.getElementsByTagName("yxqz").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("YXQZ", yxqz);
					String csys = null != doc.getElementsByTagName("csys").item(0)
							.getFirstChild()?doc.getElementsByTagName("csys").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("CSYS", csys);
					String syr = null != doc.getElementsByTagName("syr").item(0)
							.getFirstChild()?doc.getElementsByTagName("syr").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("SYR", syr);
					String hphm = null != doc.getElementsByTagName("hphm").item(0)
							.getFirstChild()?doc.getElementsByTagName("hphm").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("HPHM", hphm);
					String qzbfqz = null != doc.getElementsByTagName("qzbfqz").item(0)
							.getFirstChild()?doc.getElementsByTagName("qzbfqz").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("QZBFQZ", qzbfqz);
					String clxh = null != doc.getElementsByTagName("clxh").item(0)
							.getFirstChild()?doc.getElementsByTagName("clxh").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("CLXH", clxh);
					String zbzl = null != doc.getElementsByTagName("zbzl").item(0)
							.getFirstChild()?doc.getElementsByTagName("zbzl").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("ZBZL", zbzl);
					String fdjxh = null != doc.getElementsByTagName("fdjxh").item(0)
							.getFirstChild()?doc.getElementsByTagName("fdjxh").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("FDJXH", fdjxh);
					String ccrq = null != doc.getElementsByTagName("ccrq").item(0)
							.getFirstChild()?doc.getElementsByTagName("ccrq").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("CCRQ", ccrq);
					String gl = null != doc.getElementsByTagName("gl").item(0)
							.getFirstChild()?doc.getElementsByTagName("gl").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("GL", gl);
					String ccdjrq = null != doc.getElementsByTagName("ccdjrq").item(0)
							.getFirstChild()?doc.getElementsByTagName("ccdjrq").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("CCDJRQ", ccdjrq);
					String hlj = null != doc.getElementsByTagName("hlj").item(0)
							.getFirstChild()?doc.getElementsByTagName("hlj").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("HLJ", hlj);
					String clpp1 = null != doc.getElementsByTagName("clpp1").item(0)
							.getFirstChild()?doc.getElementsByTagName("clpp1").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("CLPP1", clpp1);
					String syxz = null != doc.getElementsByTagName("syxz").item(0)
							.getFirstChild()?doc.getElementsByTagName("syxz").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("SYXZ", syxz);
					String zzl = null != doc.getElementsByTagName("syxz").item(0)
							.getFirstChild()?doc.getElementsByTagName("syxz").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("ZZL", zzl);
					String rlzl = null != doc.getElementsByTagName("rlzl").item(0)
							.getFirstChild()?doc.getElementsByTagName("rlzl").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("RLZL", rlzl);
					String hdzk = null != doc.getElementsByTagName("hdzk").item(0)
							.getFirstChild()?doc.getElementsByTagName("hdzk").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("HDZK", hdzk);
					String qlj = null != doc.getElementsByTagName("qlj").item(0)
							.getFirstChild()?doc.getElementsByTagName("qlj").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("QLJ", qlj);
					String zj = null != doc.getElementsByTagName("zj").item(0)
							.getFirstChild()?doc.getElementsByTagName("zj").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("ZJ", zj);
					String hdzzl = null != doc.getElementsByTagName("zj").item(0)
							.getFirstChild()?doc.getElementsByTagName("zj").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("HDZZL", hdzzl);
					String xh = null != doc.getElementsByTagName("xh").item(0)
							.getFirstChild()?doc.getElementsByTagName("xh").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("XH", xh);
					String cllx = null != doc.getElementsByTagName("cllx").item(0)
							.getFirstChild()?doc.getElementsByTagName("cllx").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("CLLX", cllx);
					String zs = null != doc.getElementsByTagName("zs").item(0)
							.getFirstChild()?doc.getElementsByTagName("zs").item(0)
							.getFirstChild().getNodeValue():"";
					map.put("ZS", zs);
					String zt = null != doc.getElementsByTagName("zt").item(0)
							.getFirstChild()?doc.getElementsByTagName("zt").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("ZT", zt);
					String hpzl = null != doc.getElementsByTagName("hpzl").item(0)
							.getFirstChild()?doc.getElementsByTagName("hpzl").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("HPZL", hpzl);
					String fdjh = null != doc.getElementsByTagName("fdjh").item(0)
							.getFirstChild()?doc.getElementsByTagName("fdjh").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("FDJH", fdjh);
					String clsbdh = null != doc.getElementsByTagName("clsbdh").item(0)
							.getFirstChild()?doc.getElementsByTagName("clsbdh").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("CLSBDH", clsbdh);
					String pl = null != doc.getElementsByTagName("pl").item(0)
							.getFirstChild()?doc.getElementsByTagName("pl").item(0)
									.getFirstChild().getNodeValue():"";
					map.put("PL", pl);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			result.add(map);
			return result;
		}
		
}
