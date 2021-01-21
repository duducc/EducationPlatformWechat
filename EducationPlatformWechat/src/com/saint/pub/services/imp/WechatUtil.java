package com.saint.pub.services.imp;





import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import com.google.gson.JsonObject;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.pojo.AccessToken;
import com.saint.wechat.pojo.Menu;

public class WechatUtil {
//	private static Logger log = LoggerFactory.getLogger(WechatUtil.class);
	//access_token�ǹ��ںŵ�ȫ��ΨһƱ�ݣ����ںŵ��ø��ӿ�ʱ����ʹ��access_token����������Ҫ�������Ʊ��档access_token�Ĵ洢����Ҫ����512���ַ��ռ䡣access_token����Ч��ĿǰΪ2��Сʱ���趨ʱˢ�£��ظ���ȡ�������ϴλ�ȡ��access_tokenʧЧ��
	private final static String access_token_url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	//��ȡaccess_token��ҵ
	private final static String qyaccess_token_url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRECT";
	
	private final static String userid_to_openid = "https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_openid?access_token=ACCESS_TOKEN";
	
	private final static String openid_to_userid = "https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_userid?access_token=ACCESS_TOKEN";
	
	private final static String userid_to_userInfo = " https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&userid=USERID";
	public static String qymenu_create_url = "https://qyapi.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN&agentid=AGENTID";
	public static String menu_create_url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
//	private static String userinfo_url = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID"; 
//	private static String uplod_Media_url ="http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";
	
	//������ά��ticket����
    //public static String qrcode_ticket_url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+access_token;
    										//https://qyapi.weixin.qq.com/cgi-bin/service/get_permanent_code?suite_access_token=SUITE_ACCESS_TOKEN
	public static JSONObject httpRequest(String requestUrl, String requestMethod, String outputStr) {
		JSONObject jsonObject = null;  
        StringBuffer buffer = new StringBuffer();  
        try {  
            TrustManager[] tm = { new TrustAnyTrustManager() };  
//            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE"); 
            SSLContext sslContext = SSLContext.getInstance("TLS");  
            sslContext.init(null, tm, new java.security.SecureRandom());  
            SSLSocketFactory ssf = sslContext.getSocketFactory();  
  
            URL url = new URL(requestUrl);  
            HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();  
            httpUrlConn.setSSLSocketFactory(ssf);  
  
            httpUrlConn.setDoOutput(true);  
            httpUrlConn.setDoInput(true);  
            httpUrlConn.setUseCaches(false);  
            httpUrlConn.setRequestMethod(requestMethod);  
  
            if ("GET".equalsIgnoreCase(requestMethod))  
                httpUrlConn.connect();  
  
            if (null != outputStr) {  
                OutputStream outputStream = httpUrlConn.getOutputStream();  
                outputStream.write(outputStr.getBytes("UTF-8"));  
                outputStream.close();  
            }  
  
            InputStream inputStream = httpUrlConn.getInputStream();  
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
  
            String str = null;  
            while ((str = bufferedReader.readLine()) != null) {  
                buffer.append(str);  
            }  
            bufferedReader.close();  
            inputStreamReader.close();  
            inputStream.close();  
            inputStream = null;  
            httpUrlConn.disconnect();  
            jsonObject = JSONObject.fromObject(buffer.toString());  
        } catch (ConnectException ce) {  
        	ce.printStackTrace();
        } catch (Exception e) {  
        	e.printStackTrace();
        }  
        return jsonObject;  
	}
    public static AccessToken getAccessToken2(String appid, String appsecret) {  
        AccessToken accessToken = null;  
        String requestUrl = access_token_url.replace("APPID", appid).replace("APPSECRET", appsecret); 
        JSONObject jsonObject = httpRequest(requestUrl, "GET", null);  
        if (null != jsonObject) {  
            try {  
                accessToken = new AccessToken();  
                accessToken.setToken(jsonObject.getString("access_token"));  
                accessToken.setExpiresIn(jsonObject.getInt("expires_in"));  
            } catch (Exception e) {  
            	e.printStackTrace();
                accessToken = null;  
            }  
        }  
        return accessToken;  
    }
    public static String createMenu(Menu menu, String accessToken,String agentid,String wxtype) {  
    	String url = "";
    	if(wxtype != null && wxtype.equals("1")){
    		url = menu_create_url.replace("ACCESS_TOKEN", accessToken);  
    	}if(wxtype != null && wxtype.equals("3")){
    		url = qymenu_create_url.replace("ACCESS_TOKEN", accessToken).replace("AGENTID", agentid);  
    	}
System.out.println("url:"+url);
        String jsonMenu = JSONObject.fromObject(menu).toString();  
System.out.println("jsonMenu:"+jsonMenu);
        JSONObject jsonObject = httpRequest(url, "POST", jsonMenu);  
        return jsonObject.toString();  
    }   
    public static int createMenu2(Menu menu, String accessToken) {  
        int result = 0;  
      
        String url = menu_create_url.replace("ACCESS_TOKEN", accessToken);  
        String jsonMenu = JSONObject.fromObject(menu).toString();  
        JSONObject jsonObject = httpRequest(url, "POST", jsonMenu);  
        
        if (null != jsonObject) {  
            if (0 != jsonObject.getInt("errcode")) {  
                result = jsonObject.getInt("errcode");  
            }  
        }  
        return result;  
    }    
    public static AccessToken getAccessToken(String appid, String appsecret,String wxtype) {  
        AccessToken accessToken = null;  
        String requestUrl = "";
        if(wxtype != null && wxtype.equals("1")){
        	requestUrl = access_token_url.replace("APPID", appid).replace("APPSECRET", appsecret); 
        }else if(wxtype != null && wxtype.equals("3")){
        	requestUrl = qyaccess_token_url.replace("ID", appid).replace("SECRECT", appsecret); 
        }
        JSONObject jsonObject = httpRequest(requestUrl, "GET", null);  
        System.out.println(jsonObject.toString());
        if (null != jsonObject) {  
            try {  
            	if(null!=jsonObject.getString("access_token")){
            		 accessToken = new AccessToken();  
                     accessToken.setToken(jsonObject.getString("access_token"));  
                     accessToken.setExpiresIn(jsonObject.getInt("expires_in"));  
            	}
            } catch (JSONException e) {  
            	e.printStackTrace();
                accessToken = null;  
            }  
        }  
        return accessToken;  
    }
    
    public static String useridToOpenid(String userid, String accessToken) {  
      
        String url = userid_to_openid.replace("ACCESS_TOKEN", accessToken);  
        String param = "{\"userid\": \""+userid+"\"}";
        String OpenId = "";
        JSONObject jsonObject = httpRequest(url, "POST", param);  
        
        if (null != jsonObject) {  
            if (0 != jsonObject.getInt("errcode")) {  
                int errorrcode = jsonObject.getInt("errcode");
                String errmsg = jsonObject.getString("errmsg");
                System.out.println("�����룺" + errorrcode + "��������" + "������Ϣ��" + errmsg);
            }else{
             	OpenId = jsonObject.getString("openid").toString();
             	System.out.println("��ȡ��Ϣ�ɹ���o(��_��)o ��������OpenId:" + OpenId);
            }
        } else {     
            System.out.println("��ȡOpenIdʧ����");
        } 
        return OpenId;  
    }  
    
    public static String OpenidTouserid(String openid, String accessToken) {  
        
        String url = openid_to_userid.replace("ACCESS_TOKEN", accessToken);  
        String param = "{\"openid\": \""+openid+"\"}";
        String userid = "";
        JSONObject jsonObject = httpRequest(url, "POST", param);  
        
        if (null != jsonObject) {  
            if (0 != jsonObject.getInt("errcode")) {  
                int errorrcode = jsonObject.getInt("errcode");
                String errmsg = jsonObject.getString("errmsg");
                System.out.println("�����룺" + errorrcode + "��������" + "������Ϣ��" + errmsg);
            }else{
            	userid = jsonObject.getString("userid").toString();
             	System.out.println("��ȡ��Ϣ�ɹ���o(��_��)o ��������userid:" + userid);
            }
        } else {     
            System.out.println("��ȡuseridʧ����");
        } 
        return userid;  
    } 
    
    public static JSONObject useridToUserInfo(String userid, String accessToken) {  
        
        String url = userid_to_userInfo.replace("ACCESS_TOKEN", accessToken).replace("USERID", userid);  
        JSONObject jsonObject = httpRequest(url, "GET", null);  
        if (null != jsonObject) {  
            if (0 != jsonObject.getInt("errcode")) {  
                int errorrcode = jsonObject.getInt("errcode");
                String errmsg = jsonObject.getString("errmsg");
                System.out.println("�����룺" + errorrcode + "��������" + "������Ϣ��" + errmsg);
            }else{
             	System.out.println("��ȡ��Ϣ�ɹ���o(��_��)o ��������jsonObject:" + jsonObject);
            }
        } else {     
            System.out.println("��ȡuserinfoʧ����");
        } 
        return jsonObject;  
    } 

    public static String getQRimages(WechatClientinfoEntity sysclientinfo,String openid,String clientsxh,String courseId){
    	String QR_images = "";
		AccessToken at = getAccessToken(sysclientinfo.getAppid(),sysclientinfo.getAppsecret(),sysclientinfo.getWxtype());
		String access_token = at.getToken();
		String ticket_url = "https://qyapi.weixin.qq.com/cgi-bin/qrcode/create?access_token="+access_token;
		System.out.println("courseId="+courseId+"-------------------------------------------");
		String qrcode = "{\"expire_seconds\":2592000, \"action_name\": \"QR_SCENE\", \"action_info\": {\"scene\": {\"scene_id\":"+courseId+"}}}";
		JSONObject jsonObject = httpRequest(ticket_url, "POST", qrcode);  
        
        /*if (null != jsonObject) {  
            if (0 != jsonObject.getInt("errcode")) {  
                result = jsonObject.getInt("errcode");  
            }  
        }*/  
		/*String ticket = doPostStr(ticket_url,qrcode);
		String QR_images = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+ticket;*/
    	return QR_images;

    }
//  
//    public static String uploadMedia(String accessToken,String type,String path){
//    	String media_id=null;
//    	String requestUrl = "media=@"+path+" "+uplod_Media_url.replace("ACCESS_TOKEN",accessToken).replace("TYPE",type);
//    	JSONObject jsonObject = httpRequest(requestUrl, "POST", null);
//        if (null != jsonObject) {
//			try {
//				media_id = jsonObject.getString("MEDIA_ID");
//				System.out.println(media_id);
//			} catch (JSONException e) {
//				media_id = null;
//			}
//		} else{
//			System.out.println("3");
//		}
//    	return media_id;
//    	
//    }
}
