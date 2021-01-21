package com.saint.wechat.manager.ctrl;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.qq.weixin.mp.aes.WXBizMsgCrypt;
import com.saint.pub.services.imp.MessageUtil;
import com.saint.pub.services.imp.SignUtil;
import com.saint.pub.services.imp.WechatUtil;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.bean.WechatMenuinfoEntity;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.services.IWechatClientinfoService;
import com.saint.wechat.manager.services.IWechatMenuinfoService;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.services.IWeichatService;
import com.saint.wechat.pojo.AccessToken;


public class IndexAction extends MultiActionController {
	
	private IWechatClientinfoService wechatClientinfoService;
	
	private IWeichatService weichatservice;
	
	private IWechatMenuinfoService wechatMenuinfoService;
	
	private IWechatSysparamService wechatSysparamService;
	
	   // �������ƾ֤��Կ��ÿ��secret�����˶�Ӧ�á�ͨѶ¼���ӿڵĲ�ͬȨ�ޣ���ͬ�Ĺ�����ӵ�в�ͬ��secret  
	    //public static String corpsecret = "Bf7IkOMfDYFs4JJBztKub0z23pI9ZgIlL6sv1IjYkHmqeVEXkbxcR3drUkZ3iKGr";  
	   // Ӧ��ID��AgentId  
	    //public static String AgentId = "1";  
	

	/***
	 * ΢�������
	 * GET����ʵ����Ч����֤
	 * POST����ʵ��ҵ���߼�����
	 * @param request
	 * @param response
	 */
	public void init(HttpServletRequest request,HttpServletResponse response){
		String method = request.getMethod();
		String signature = request.getParameter("signature");  
        String timestamp = request.getParameter("timestamp");   
        String echostr = request.getParameter("echostr");       
        String nonce = request.getParameter("nonce");
        String sxh = request.getParameter("sxh");
        String wxtype="1";
        String openid = request.getParameter("openid");
        System.out.println("΢����ⷵ����Ϣ��method:"+method+",signature:"+signature+",echostr:"+echostr+",nonce:"+nonce+",sxh:"+sxh);
		if("GET".equals(method.toUpperCase())){
			WechatClientinfoEntity sysclientinfo = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(sxh);
			if(sysclientinfo!=null&&!"".equals(sysclientinfo.getWxtype())){
				wxtype = sysclientinfo.getWxtype();
			}
	        if (SignUtil.checkSignature(sysclientinfo.getToken(),signature, timestamp, nonce)){  
	        	PrintWriter out = null;
	        	try {
	        		out = response.getWriter();
	        		out.println(echostr);
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					IOUtils.closeQuietly(out);
				}	
	        }
			response.setContentType("text/plain");
		}else if("POST".equals(method.toUpperCase())){
			try{
				request.setCharacterEncoding("utf-8");
				response.setCharacterEncoding("utf-8");
				Map<String, String> requestMap = MessageUtil.parseXml(request);
				String  result = weichatservice.processRequest(requestMap,sxh,request,openid,wxtype);
				System.out.println(requestMap);
				PrintWriter out = response.getWriter();
				out.print(result);
				IOUtils.closeQuietly(out);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	/** 
     * ����У�飨ȷ����������΢�ŷ������� 
     */  
public void qyInit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,Exception {
	String method = request.getMethod();
    // ΢�ż���ǩ��  
   String msg_signature = request.getParameter("msg_signature");  
        // ʱ���  
   String timestamp = request.getParameter("timestamp");  
       // �����  
   String nonce = request.getParameter("nonce");  
        // ����ַ���  
    String echostr = request.getParameter("echostr");  
    String sxh = request.getParameter("sxh");
    System.out.println("sxh:"+sxh);
    WechatClientinfoEntity sysclientinfo = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(sxh);
    AccessToken at = WechatUtil.getAccessToken(sysclientinfo.getAppid(), sysclientinfo.getAppsecret(),sysclientinfo.getWxtype());  // ���ýӿڻ�ȡaccess_token 
    /*******pengyou 2015/10/16 start*********************************/  
       System.out.println("11CoreServlet doget msgSignature:"+msg_signature);  
       System.out.println("22CoreServlet doget nonce:"+nonce);  
       System.out.println("33CoreServlet doget timestamp:"+timestamp);  
       System.out.println("44CoreServlet doget����ǰ��  echostr:"+echostr);  
        // ��ӡ�����ַ  
       System.out.println("55CoreServlet doget request=" + request.getRequestURL());  
     // token  
 	   String token = sysclientinfo.getToken();  
 	  System.out.println("token:"+token);
 	    // �����  
 	   String encodingAESKey = sysclientinfo.getEncodingaeskey();  
 	  System.out.println("encodingAESKey:"+encodingAESKey);
 	    // �����ҵ��ID  
 	   String corpId = sysclientinfo.getAppid(); 
 	  System.out.println("corpId:"+corpId);
 	 String msgBody = "";
       
        PrintWriter out = response.getWriter();  
       // ����У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��  
        String echostr_ret=null;  
        WXBizMsgCrypt wxcpt = new WXBizMsgCrypt(token, encodingAESKey, corpId); 
        if("GET".equals(method.toUpperCase())){
			
	       try{  
	    	   
	            // ��֤URL����  
	            echostr_ret=wxcpt.VerifyURL(msg_signature, timestamp, nonce, echostr);    
	            System.out.println("verifyurl echostr: " + echostr_ret);
	            if (echostr_ret == null) {    
		            // echostr_retΪ�գ�����token  
		            echostr_ret = token;  
		        }  
		        //�ص�������  
		        out.print(echostr_ret);  
	        }catch (Exception e) {    
	            e.printStackTrace();    
	           //log.error("log �ص�����ʧ�� 1",e);  
	        }finally{
				IOUtils.closeQuietly(out);
			}	
	       response.setContentType("text/plain");
        }else if("POST".equals(method.toUpperCase())){
			try{

				InputStream inputStream = request.getInputStream();  
				String postData = IOUtils.toString(inputStream, "UTF-8");  
				System.out.println(postData);  
				String msg = "";
				msg = wxcpt.DecryptMsg(msg_signature, timestamp, nonce, postData);   
				System.out.println("msg=" + msg);  
   
				// ���ú���ҵ���������Ϣ��������Ϣ  
				Map<String, String> requestMap = MessageUtil.parseXml(msg);
				//��ȡopenID
				String openID = WechatUtil.useridToOpenid(requestMap.get("FromUserName"), at.getToken());
		        
		        
		        
				String  respMessage = weichatservice.processRequest(requestMap,sxh,request,openID,sysclientinfo.getWxtype()); 
				System.out.println("respMessage=" + respMessage);  

				String encryptMsg = "";  
				try {  
				//���ܻظ���Ϣ  
					if(encryptMsg != null){
						encryptMsg = wxcpt.EncryptMsg(respMessage, timestamp, nonce);  
					}
				} catch (Exception e) {  
				e.printStackTrace();  
				}  
				// ��Ӧ��Ϣ  
				out.print(encryptMsg);  
				IOUtils.closeQuietly(out); 

			}catch(Exception e){
				e.printStackTrace();
			}
		}
   }  

	/**
	 * ��ת���˵�ҳ��(ywq)
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView ToMenuPage(HttpServletRequest request,HttpServletResponse response){
		ModelAndView view = null;
		try {
			String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatSysparamKey param=new WechatSysparamKey();
        	param.setClientsxh(clientsxh);
        	param.setGjz("RES_PATH");
        	WechatSysparamEntity p=wechatSysparamService.selectWechatSysparamByPrimaryKey(param);
        	String menuid = request.getParameter("menuid");
        	WechatMenuinfoEntity menu = wechatMenuinfoService.selectWechatMenuinfoByPrimaryKey(menuid);
        	String[] menuvalue = menu.getMenuvalue().split(",");
        	List<WechatMenuinfoEntity> menulist = new ArrayList<WechatMenuinfoEntity>();
        	for(int i=0;i<menuvalue.length;i++){
        		WechatMenuinfoEntity entity = wechatMenuinfoService.selectWechatMenuinfoByPrimaryKey(menuvalue[i]);
        		menulist.add(entity);
        	}
        	view  = new ModelAndView("common/menu");
        	view.addObject("openid", openid);
        	view.addObject("clientsxh", clientsxh);
        	view.addObject("menulist", menulist);
        	view.addObject("url", p.getDmz());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	
	public IWechatClientinfoService getWechatClientinfoService() {
		return wechatClientinfoService;
	}

	public void setWechatClientinfoService(
			IWechatClientinfoService wechatClientinfoService) {
		this.wechatClientinfoService = wechatClientinfoService;
	}
	
	public IWeichatService getWeichatservice() {
		return weichatservice;
	}
	
	public void setWeichatservice(IWeichatService weichatservice) {
		this.weichatservice = weichatservice;
	}

	public IWechatMenuinfoService getWechatMenuinfoService() {
		return wechatMenuinfoService;
	}

	public void setWechatMenuinfoService(
			IWechatMenuinfoService wechatMenuinfoService) {
		this.wechatMenuinfoService = wechatMenuinfoService;
	}

	public IWechatSysparamService getWechatSysparamService() {
		return wechatSysparamService;
	}

	public void setWechatSysparamService(
			IWechatSysparamService wechatSysparamService) {
		this.wechatSysparamService = wechatSysparamService;
	}
	
	
}
