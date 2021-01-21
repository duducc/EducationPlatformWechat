package com.saint.teaching.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxSignInfoService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatClientinfoService;

/**
*类注释信息
*表名JX_SIGN_INFO
*表说明实习学员签到信息
  */
public class JxSignInfoAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxSignInfoService jxSignInfoService;
    
    private IWechatBindService wechatBindService;
    
    private IWechatClientinfoService wechatClientinfoService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IJxStudentsService jxStudentsService;
    
    /**
     * 跳转至学员签到页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toStudentsSignPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String date = new SimpleDateFormat("HH:mm:ss").format(new Date()) ;
    		String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date()) ;
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	JxStudentsEntity students = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
        	if(students.getPertype().equals("2")||students.getPertype().equals("5")){
        		JxSignInfoSqlWhere sqlWhere = new JxSignInfoSqlWhere();
            	sqlWhere.setMarking(students.getSignmarking());
            	List<JxSignInfoEntity> entitylist=jxSignInfoService.selectListJxSignInfoBySqlWhere(sqlWhere);
            	
            	String accesstoken = getAccessToken();
            	/******************************新加的用于获取位置信息开始*****************************************/
            	String appId = "no";
    			String timestamp = "no";   
    			String nonceStr = "no";     
    			String signature = "no";
            	WechatClientinfoEntity sysclientinfo = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(clientsxh);
            	if(sysclientinfo != null){  //客户端信息表里有数据
    	        	String access_tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+sysclientinfo.getAppid()+"&secret="+sysclientinfo.getAppsecret();  //获取access_tockent的url
    				String url1 = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=";  //获取ticket的url
    				String apiurl = sysclientinfo.getApiurl()+"clientsxh="+clientsxh+"&openid="+openid;  //签名校验的url
    				String access_token = "";
    				if(accesstoken==null||accesstoken.equals("")){
    					access_token = doGetStr(access_tokenUrl,"access_token");  //获取access_token
    					System.out.println("toStudentsSignPage方法中accesstoken==null----------------------------------------------"+access_token);
    					updateAccessToken(access_token);
    				}else{
    					access_token = accesstoken;
    				}
    				String ticket_url =  url1+access_token+"&type=jsapi";
    				String ticket = doGetStr(ticket_url,"ticket");  //获取ticket
    				Map<String, String> map = sign(ticket,apiurl);  //执行数字签名
    				
    				appId = sysclientinfo.getAppid();
    				timestamp = map.get("timestamp");   
    				nonceStr = map.get("noncestr");     
    				signature = map.get("signature");
            	}
            	/******************************新加的用于获取位置信息结束*****************************************/
            	ServletContext application = request.getSession().getServletContext();
    	    	String Position = (String) application.getAttribute(openid);
    	    	String Longitude = Position==null||Position.equals("")?"":Position.split("/")[0]; 
    	        String Latitude = Position==null||Position.equals("")?"":Position.split("/")[1];
    	        	String wd = entitylist.get(0).getPolitionwd();
    	        	String jd = entitylist.get(0).getPolitionjd();
    	        	double scope = Double.valueOf(entitylist.get(0).getScope());
    	        	String signcishu = String.valueOf(entitylist.size());
    	        	view = new ModelAndView("teaching/students_sign");
    	        	view.addObject("bindinfo", bindinfo);
    	        	view.addObject("signcishu", signcishu);
    	        	view.addObject("date", date);
    	        	view.addObject("time", time);
    	        	view.addObject("wd", wd);
    	        	view.addObject("jd", jd);
    	        	view.addObject("scope", String.valueOf(scope));
    	        	view.addObject("marking", students.getSignmarking());
    	        	view.addObject("Longitude", Longitude);
    	        	view.addObject("Latitude", Latitude);
    	        	
    	        	/*******************新加设置参数开始***********************/
    	        	view.addObject("appId", appId);
    	        	view.addObject("timestamp", timestamp);
    	        	view.addObject("nonceStr", nonceStr);
    	        	view.addObject("signature", signature);
    	        	/*******************新加设置参数结束***********************/
//    	        }
        	}else{
        		view = new ModelAndView("teaching/common_notcanpage");
        	}
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    /**
     * 跳转至学员签到页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toSignStaticsPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	view = new ModelAndView("teaching/students_signstatics");
        	view.addObject("bindinfo", bindinfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    public String getAccessToken(){
    	String access_token = "";
    	try {
    		FrmSysparaTypeKey key = new FrmSysparaTypeKey();
    		key.setXtlb("00");
    		key.setGjz("access_token");
    		FrmSysparaTypeEntity syst= frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(key);
    		long sjc = Long.valueOf(syst.getCssm());
    		long nowt = System.currentTimeMillis();
    		long sjch = nowt-sjc;
    		System.out.println("getAccessToken方法中毫秒数==========================="+sjch);
    		//Long s = sjch / (1000 * 60);
    		System.out.println("getAccessToken方法中access_token==========================="+syst.getMrz());
    		if(sjch<=7200000){
    			access_token = syst.getMrz();
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return access_token;
    }
    public static void main(String[] args) {
    	String sb = "152732844";
    	long sjc = Long.valueOf(sb);
    	System.out.println(sjc);
	}
    public void updateAccessToken(String access_token){
    	ExcuteResult result;
    	try {
    		long nowt = System.currentTimeMillis()-3000;
    		
			FrmSysparaTypeEntity systypeEntity = new FrmSysparaTypeEntity();
			systypeEntity.setXtlb("00");
			systypeEntity.setGjz("access_token");
			systypeEntity.setCssm(String.valueOf(nowt));
			systypeEntity.setMrz(access_token);
			result=frmSysparaTypeService.updateFrmSysparaTypeByPrimaryKeySelective(systypeEntity);
			System.out.println("-----------------------------------"+result.getReturnCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    /**
    *方法注释信息
    *分页查询表JX_SIGN_INFO
    *表说明实习学员签到信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListJxSignInfo(HttpServletRequest request, HttpServletResponse response, JxSignInfoSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	out=response.getWriter();
        	String marking = request.getParameter("marking");
        	sqlWhere.setOrderByClause("SIGNCS");
        	sqlWhere.setMarking(marking);
            List<JxSignInfoEntity> entitylist=jxSignInfoService.selectListJxSignInfoBySqlWhere(sqlWhere);
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxSignInfo.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxSignInfoEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxSignInfo(request,response,entity);
        }else if(option.equals("edit")){
            updateJxSignInfo(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxSignInfo(request,response,entity);
        }
    }

    /**
     * 添加课题（ywq）
     * @param request
     * @param response
     * @param entity
     */
    public void insertJxSignInfo(HttpServletRequest request, HttpServletResponse response,JxSignInfoEntity entity){
    	response.setContentType("text/html; charset=GBK");
    	PrintWriter out = null;
    	ExcuteResult result;
    	ExcuteResult result_d;
    	Map<String,Object> resultMap = new HashMap();
    	try {
    		out = response.getWriter();
    		
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.put("errorMsg", "error");
		}finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
			System.out.println(json);
			out.write(json);
            if(out!=null)out.close();
		}
    }
    /**
    *方法注释信息
    *JX_SIGN_INFO,实习学员签到信息表,修改
      */
    public void updateJxSignInfo(HttpServletRequest request, HttpServletResponse response, JxSignInfoEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxSignInfoService.updateJxSignInfoByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxSignInfo, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxSignInfo.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_SIGN_INFO,实习学员签到信息表,删除
      */
    public void deleteJxSignInfo(HttpServletRequest request, HttpServletResponse response, JxSignInfoEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxSignInfoService.deleteJxSignInfoByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxSignInfo, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxSignInfo.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }
    
    public void getJxSignInfoNowdate(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            out=response.getWriter();
            String nowdate = new SimpleDateFormat("HH:mm:ss").format(new Date());
            System.out.println("--------------------"+nowdate);
            out.write(new Gson().toJson(nowdate));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsSign.toString(),Tools.getException(e));
        }
    }
    
    public void getPosition(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            out=response.getWriter();
            double lat = Double.valueOf(request.getParameter("lat"));
            double lng = Double.valueOf(request.getParameter("lng"));
            double wd = Double.valueOf(request.getParameter("wd"));
            double jd = Double.valueOf(request.getParameter("jd"));
            double distance = getDistance(lng,lat,jd,wd);
            out.write(new Gson().toJson(String.valueOf(distance)));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsSign.toString(),Tools.getException(e));
        }
    }
    
    private static final double EARTH_RADIUS = 6378137;
    private static double rad(double d){
       return d * Math.PI / 180.0;
    }
    
    /**
     * 根据两点间经纬度坐标（double值），计算两点间距离，单位为米
     * @param lng1
     * @param lat1
     * @param lng2
     * @param lat2
     * @return
     */
    public static double getDistance(double lng1, double lat1, double lng2, double lat2){
       double radLat1 = rad(lat1);
       double radLat2 = rad(lat2);
       double a = radLat1 - radLat2;
       double b = rad(lng1) - rad(lng2);
       double s = 2 * Math.asin(
			Math.sqrt(
			    Math.pow(Math.sin(a/2),2) 
			    + Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)
			)
		);
       s = s * EARTH_RADIUS;
       s = Math.round(s * 10000) / 10000;
       return s;
    }
    
    /**
     * 编写Get请求的方法。但没有参数传递的时候，可以使用Get请求
     * 
     * @param url 需要请求的URL
     * @return 将请求URL后返回的数据，转为JSON格式，并return
     * @throws IOException 
     * @throws ParseException 
     */
    public static String doGetStr(String access_tokenUrl,String returnStr) throws ParseException, IOException {
    	DefaultHttpClient client = new DefaultHttpClient();
    	HttpGet request = new HttpGet(access_tokenUrl);
    	HttpResponse response = client.execute(request);
    	String access_token = "";
    	if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
    		String strResult = EntityUtils.toString(response.getEntity());
    		System.out.println(strResult);
    		JSONObject jsonResult = JSONObject.parseObject(strResult);
    		//JSONObject jsonResult = new JSONObject(strResult);
    		access_token = (String) jsonResult.get(returnStr);
    	}
    	return access_token;
    }
    
  //加密函数
    public static Map<String, String> sign(String jsapi_ticket, String url) {
        Map<String, String> ret = new HashMap<String, String>();
        String nonce_str = create_nonce_str();
        String timestamp = create_timestamp();
        String string1;
        String signature = "";
        string1 = "jsapi_ticket=" + jsapi_ticket +
                  "&noncestr=" + nonce_str +
                  "&timestamp=" + timestamp +
                  "&url=" + url;
        System.out.println(string1);
        System.out.println("jsapi_ticket==============================="+jsapi_ticket);
		System.out.println("noncestr==============================="+nonce_str);
		System.out.println("timestamp==============================="+timestamp);
		System.out.println("url==============================="+url);
        try{
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(string1.getBytes("UTF-8"));
            signature = byteToHex(crypt.digest());
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        ret.put("url", url);
        ret.put("jsapi_ticket", jsapi_ticket);
        ret.put("noncestr", nonce_str);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);
        return ret;
    }
    private static String create_nonce_str() {
    	String uuid = UUID.randomUUID().toString();
    	System.out.println("-----------------------------------"+uuid);
        return uuid;
    }

    private static String create_timestamp() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }
  //格式化函数
    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash)
        {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    public void setFrmZlExlogService(IFrmZlExlogService frmZlExlogService) {
        this.frmZlExlogService = frmZlExlogService;
    }

    public IFrmZlExlogService getFrmZlExlogService() {
        return frmZlExlogService;
    }

    public void setProcessResultImpl(ProcessResultImpl processResultImpl) {
        this.processResultImpl = processResultImpl;
    }

    public ProcessResultImpl getProcessResultImpl() {
        return processResultImpl;
    }

    public void setJxSignInfoService(IJxSignInfoService jxSignInfoService) {
        this.jxSignInfoService = jxSignInfoService;
    }

    public IJxSignInfoService getJxSignInfoService() {
        return jxSignInfoService;
    }
	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}
	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
	public IWechatClientinfoService getWechatClientinfoService() {
		return wechatClientinfoService;
	}
	public void setWechatClientinfoService(
			IWechatClientinfoService wechatClientinfoService) {
		this.wechatClientinfoService = wechatClientinfoService;
	}

	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}

	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}

	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}

	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}

	public static double getEarthRadius() {
		return EARTH_RADIUS;
	}
    
    

}