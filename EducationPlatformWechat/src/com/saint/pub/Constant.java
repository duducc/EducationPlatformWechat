package com.saint.pub;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
public class Constant {
	//----------------------------------����------------------------------------------------------
//	public static final String APPID="wxe5e611b85af09c1b";//΢�ſ�����ΨһAPPID
//	public static final String APPSECRET="1f7b366a028d34d7493a1cd7f66d1953";//΢�ſ�����Ψһ��Կ
	//---------------------------------�ຣ΢��ƽ̨-------------------------------------------------
//	public static final String APPID="wxeeeb37ae05c9611e";//΢�ſ�����ΨһAPPID
//	public static final String APPSECRET="d768ee020c896f73e4957016bafcd450";//΢�ſ�����Ψһ��Կ
	//----------------------------------�����еڶ�����ҽԺ---------------------------------------------
//	public static final String APPID="wx6b4347f439249832";//΢�ſ�����ΨһAPPID
//	public static final String APPSECRET="f02d8de2b7f9605ea6de4c4b8d2bb58a";//΢�ſ�����Ψһ��Կ
	//----------------------------------����ʡ����ҽԺ---------------------------------------------
	public static final String APPID="wx6569605b7500fc29";//΢�ſ�����ΨһAPPID
	public static final String APPSECRET="3538956863daffa7ca4bc79c0cf8e71b";//΢�ſ�����Ψһ��Կ
	
	public static Map<String, String> GET_WELCOME(){
		Map<String, String> result = new HashMap<String, String>();
		result.put("6201001002", "��ӭ����ע��ѧ����ƽ̨΢�Ź��ںţ���ע���˺Ų���ɰ󶨡�");
		return result;
	};

	public static Map<String, String> WECHAT_MENUURL;
	public static Map<String, String> WECHAT_MENUIMGURL;
	public static Map<String, String> WECHAT_MENUVALUE;
	public static Map<String, WechatMenuinfoEntity> WECHAT_MENUENTITY;
	public static List<WechatMenuinfoEntity> WECHAT_MENULIST;
	
	public static final String JHGN_FJYXZ="�ù���ֻ����֤ҽԺ�û�ʹ�ã�";
	public static final String JHGN_BDTS="���Ѱ󶨣����ڻ�����Ϣ�в鿴��";
	public static final String JHGN_JYRZTS="���Ȱ����ĸ�����Ϣ��";
	public static final String DA_KA="�򿨳ɹ���";
	public static final String JHGN_GLYQX="�ù���ֻ�޹���Աʹ�ã�";
	
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
