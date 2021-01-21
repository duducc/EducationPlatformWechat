package com.saint.pub;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
public class Constant {
	//----------------------------------本地------------------------------------------------------
//	public static final String APPID="wxe5e611b85af09c1b";//微信开发者唯一APPID
//	public static final String APPSECRET="1f7b366a028d34d7493a1cd7f66d1953";//微信开发着唯一秘钥
	//---------------------------------青海微信平台-------------------------------------------------
//	public static final String APPID="wxeeeb37ae05c9611e";//微信开发者唯一APPID
//	public static final String APPSECRET="d768ee020c896f73e4957016bafcd450";//微信开发着唯一秘钥
	//----------------------------------兰州市第二人民医院---------------------------------------------
//	public static final String APPID="wx6b4347f439249832";//微信开发者唯一APPID
//	public static final String APPSECRET="f02d8de2b7f9605ea6de4c4b8d2bb58a";//微信开发着唯一秘钥
	//----------------------------------甘肃省人民医院---------------------------------------------
	public static final String APPID="wx6569605b7500fc29";//微信开发者唯一APPID
	public static final String APPSECRET="3538956863daffa7ca4bc79c0cf8e71b";//微信开发着唯一秘钥
	
	public static Map<String, String> GET_WELCOME(){
		Map<String, String> result = new HashMap<String, String>();
		result.put("6201001002", "欢迎您关注教学管理平台微信公众号，请注册账号并完成绑定。");
		return result;
	};

	public static Map<String, String> WECHAT_MENUURL;
	public static Map<String, String> WECHAT_MENUIMGURL;
	public static Map<String, String> WECHAT_MENUVALUE;
	public static Map<String, WechatMenuinfoEntity> WECHAT_MENUENTITY;
	public static List<WechatMenuinfoEntity> WECHAT_MENULIST;
	
	public static final String JHGN_FJYXZ="该功能只限认证医院用户使用！";
	public static final String JHGN_BDTS="您已绑定，请在基础信息中查看！";
	public static final String JHGN_JYRZTS="请先绑定您的个人信息！";
	public static final String DA_KA="打卡成功！";
	public static final String JHGN_GLYQX="该功能只限管理员使用！";
	
	public static String TITLE;
	public static String CONTENTPATH;
	public static String SOFTVER;
	public static String ROOTPATH;
	public static String SYS_SERVLET_CONTEXT = "FRM_WEB_SERVLET_CONTEXT";
	public static String CODEJSNAME = "SAINT_CODE.JS";
	public static String GLBMJSNAME = "SAINT_GLBM.JS";
	
	
	public static int SYSUSERLIST=12;
	public static int DEPTLIST=12;
	public static int SYSLOGLIST=12;
	public static int QXGROUPLIST=12;
	public static int JCZLIST=12;
}
