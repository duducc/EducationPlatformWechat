package com.saint.wechat.manager.ctrl;

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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.WechatClientinfoEntity;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfProjectEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatClientinfoService;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfCourseSignupService;
import com.saint.wechat.manager.services.IXfProjectService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfCourseSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfProjectSqlWhere;
import com.saint.wechat.utils.Encryptutil;

public class XfProjectAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfProjectService xfProjectService;
    
    private IWechatBindService wechatBindService;
    
    private IXfCourseService xfCourseService;
    
    private IXfCourseSignupService xfCourseSignupService;
    
    private IFrmDepartmentService frmDepartmentService;
    
    private IWechatClientinfoService wechatClientinfoService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    String respMessage = null;
    
    public static String web_oauth_userinfo_url = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID";
    
    
    public IXfCourseSignupService getXfCourseSignupService() {
		return xfCourseSignupService;
	}

	public void setXfCourseSignupService(
			IXfCourseSignupService xfCourseSignupService) {
		this.xfCourseSignupService = xfCourseSignupService;
	}

	public IXfCourseService getXfCourseService() {
		return xfCourseService;
	}

	public void setXfCourseService(IXfCourseService xfCourseService) {
		this.xfCourseService = xfCourseService;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
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
    
    public void setXfProjectService(IXfProjectService xfProjectService) {
    	this.xfProjectService = xfProjectService;
    }
    
    public IXfProjectService getXfProjectService() {
    	return xfProjectService;
    }
    
    public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}

	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}

	public String getRespMessage() {
		return respMessage;
	}

	public void setRespMessage(String respMessage) {
		this.respMessage = respMessage;
	}

	public static String getWeb_oauth_userinfo_url() {
		return web_oauth_userinfo_url;
	}

	public static void setWeb_oauth_userinfo_url(String web_oauth_userinfo_url) {
		XfProjectAction.web_oauth_userinfo_url = web_oauth_userinfo_url;
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

	/**
     * 项目查询展示页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toProjectQueryPage(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        String addtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        List<XfProjectEntity> projectList = xfProjectService.selectListXfProjectByAddtime(addtime);
        List<FrmDepartmentEntity> yiyuanList = frmDepartmentService.getListAllyiyuanBySqlWhere();
        ModelAndView view=new ModelAndView("crouse_xfrecord/project_query_zs");
        view.addObject("projectList", projectList);
        view.addObject("yiyuanList", yiyuanList);
        return view;
    }
    /**
     * 项目查询详细页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toMinuteProjectPage(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	String proId = request.getParameter("proId");
    	//String holdtime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    	XfProjectEntity projectEntity = xfProjectService.selectXfProjectByPrimaryKey(proId);
    	String startTime = projectEntity.getHoldStartDate();
    	String endTime = projectEntity.getHoldEndDate();
    	String start = startTime.substring(0,10);
    	String end = endTime.substring(0,10);
    	System.out.println(start+"---"+end);
    	ModelAndView view=new ModelAndView("crouse_xfrecord/project_query_xx");
        view.addObject("projectEntity", projectEntity);
        view.addObject("start", start);
        view.addObject("end", end);
        //view.addObject("holdtime", holdtime);
        return view;
    }
    /**
     * 根据项目名称查询项目
     * @param request
     * @param response
     * @return
     */
    public void findProjectbyproName(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html; charset=UTF-8");
        PrintWriter out=null; 
        try{
        	out=response.getWriter();
        	String proName =request.getParameter("proName");
			String yiyuan = request.getParameter("yiyuan");
			String year = request.getParameter("begintime");
			XfProjectSqlWhere sqlWhere = new XfProjectSqlWhere();
			sqlWhere.setProName(proName);
			sqlWhere.setAddYear(year);
			sqlWhere.setHoldUnit(yiyuan);
			List<XfProjectEntity> projectList = xfProjectService.selectListXfProjectBySqlWhere(sqlWhere);
            out.write(new Gson().toJson(projectList));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfStudyRegistration.toString(),Tools.getException(e));
        }
    }
    //跳转到扫描二维码页面
    public ModelAndView courseCheckIn(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
        ModelAndView view=null;
        try {
        	//扫描二维码的东西
        	view = new ModelAndView("crouse_xfrecord/barcode_qyscan");
        	String clientsxh = request.getParameter("clientsxh");   //客户端顺序号
        	String openid = request.getParameter("openid");   //用户openid
        	WechatClientinfoEntity sysclientinfo = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(clientsxh);
        	WechatBindKey bindkey = new WechatBindKey();
        	bindkey.setClientsxh(clientsxh);
        	bindkey.setOpenId(openid);
        	WechatBindEntity bindinfo = wechatBindService.selectWechatBindByPrimaryKey(bindkey);
        	if(sysclientinfo != null){  //客户端信息表里有数据
        		String access_tokenUrl = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid="+sysclientinfo.getAppid()+"&corpsecret="+sysclientinfo.getAppsecret();  //获取access_tockent的url
				String url1 = "https://qyapi.weixin.qq.com/cgi-bin/get_jsapi_ticket?access_token=";  //获取ticket的url
				String apiurl = sysclientinfo.getApiurl()+"clientsxh="+clientsxh+"&openid="+openid;  //签名校验的url
        		String appId = sysclientinfo.getAppid();
        		String timestamp = "";
        		String nonceStr = "";
        		String signature = "";
	    		if(sysclientinfo.getWxtype().equals("1")){
	    			
	    		}else if(sysclientinfo.getWxtype().equals("3")){
	    			if(bindinfo!=null){   //判断绑定表是否有该用户信息
	    				timestamp = bindinfo.getTemptimestamp();  
	    				nonceStr = bindinfo.getTempnoncestr();    
	    				signature = bindinfo.getTempsignature();           
	            		long nowTimestamp = System.currentTimeMillis() / 1000;
		    			long tempTimestamp = (bindinfo.getTemptimestamp()==null||"".equals(bindinfo.getTemptimestamp()))?0:Long.parseLong(bindinfo.getTemptimestamp());
		    			if((nowTimestamp-tempTimestamp)>7200){  //数字签名是否超过两小时
		    				String access_token = doGetStr(access_tokenUrl,"access_token");  //获取access_token
		    				String ticket_url =  url1+access_token;
		    				String ticket = doGetStr(ticket_url,"ticket");  //获取ticket
		    				Map<String, String> map = sign(ticket,apiurl);  //执行数字签名
		    				timestamp = map.get("timestamp");   
		    				nonceStr = map.get("nonceStr");     
		    				signature = map.get("signature");               
		    				WechatBindSqlWhere BindSqlWhere = new WechatBindSqlWhere();
		    				BindSqlWhere.setTempticket(map.get("jsapi_ticket"));
		    				BindSqlWhere.setTempnoncestr(map.get("nonceStr"));
		    				BindSqlWhere.setTemptimestamp(map.get("timestamp"));
		    				BindSqlWhere.setTempsignature(map.get("signature"));
		    				BindSqlWhere.setApiurl(map.get("url"));
		    				BindSqlWhere.setOpenId(openid);
		    				BindSqlWhere.setClientsxh(clientsxh);
		    				wechatBindService.updateWechatBindByPrimaryKeySelective(BindSqlWhere);
		    			}
	        		}else{
	    				String access_token = doGetStr(access_tokenUrl,"access_token");  //获取access_token
	    				String ticket_url =  url1+access_token;
	    				String ticket = doGetStr(ticket_url,"ticket");  //获取ticket
	    				Map<String, String> map = sign(ticket,apiurl);  //执行数字签名
	    				timestamp = map.get("timestamp");   
	    				nonceStr = map.get("nonceStr");     
	    				signature = map.get("signature");
	    				WechatBindEntity wechatBindEntity = new WechatBindEntity();
	    				wechatBindEntity.setTempticket(map.get("jsapi_ticket"));
	    				wechatBindEntity.setTempnoncestr(map.get("nonceStr"));
	    				wechatBindEntity.setTemptimestamp(map.get("timestamp"));
	    				wechatBindEntity.setTempsignature(map.get("signature"));
	    				wechatBindEntity.setApiurl(map.get("url"));
	    				wechatBindEntity.setOpenId(openid);
	    				wechatBindEntity.setClientsxh(clientsxh);
	    				wechatBindService.insertWechatBindSelective(wechatBindEntity);
	        		}
	    		}
	    		String addtime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	    		view.addObject("appId", appId);
	        	view.addObject("timestamp", timestamp);
	        	view.addObject("nonceStr", nonceStr);
	        	view.addObject("signature", signature);
	        	view.addObject("time", addtime);
	        	view.addObject("openId", openid);
	        	view.addObject("clientsxh", clientsxh);
	        	view.addObject("bindinfo", bindinfo);
	    	}
        } catch (Exception e) {
  			e.printStackTrace();
  		}
          return view;
    }


    /**
     * 生成二维码页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toQRCodeManage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openId = request.getParameter("openid");
    		String clientsxh = request.getParameter("clientsxh");
    		WechatBindKey key = new WechatBindKey();
	        key.setOpenId(openId);
	        key.setClientsxh(clientsxh);
	        WechatBindEntity bindinfo = wechatBindService.selectWechatBindByPrimaryKey(key);
	        String addunit = bindinfo.getRemark1();
	        String startyear = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    		List<XfCourseEntity> list = xfCourseService.selectXfBarcodeCourselist(addunit, startyear);
    		String placename = list.get(0).getPlaceName();
    		String time = list.get(0).getValidTime();
    		if(time==null||time.equals("")){
    			view = new ModelAndView("tool/task_bind");
    		}
    		String starttime = time.substring(0,16);
    		String endtime = time.substring(17);
    		//直接跳转至二维码页面
	        view = new ModelAndView("crouse_xfrecord/barcode_manage");
	        view.addObject("list",list);
	        view.addObject("placename",placename);
	        view.addObject("starttime",starttime);
	        view.addObject("endtime",endtime);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    public void getBarcodeInfo(HttpServletRequest request,HttpServletResponse response){
		response.setContentType("text/html;charset=UTF-8");
		String courseId = request.getParameter("courseId");
		PrintWriter out = null;
		try {	
			out=response.getWriter();
			XfCourseEntity courseEntity = xfCourseService.selectXfCourseByPrimaryKey(courseId);
			out.write(new Gson().toJson(courseEntity));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    /**
     * 跳转二维码页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView tobarcodeCreateofQR(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String yitongcard = "";
			String openId = request.getParameter("openid");
			String clientsxh = request.getParameter("clientsxh");
			WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);
			yitongcard = bindinfo.getYitongCard();
			view = new ModelAndView("crouse_xfrecord/barcode_create");
			view.addObject("usernumber", yitongcard);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    /*public ModelAndView tobarcodeCreateofPC(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String courseId = request.getParameter("courseId");
			view = new ModelAndView("crouse_xfrecord/barcode_create_pc");
			view.addObject("courseId", courseId);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    public void barcodeCreateofPC(HttpServletRequest request,HttpServletResponse response){
    	response.setContentType("text/html; charset=GBK");
        PrintWriter out=null;
        try{
//        	String yitongcard = request.getParameter("usernumber");
//    		XfHoldingTaskEntity entity = xfCourseService.selectXfHoldingTaskByPrimaryKey(yitongcard);
    		String courseId = request.getParameter("courseId");
    		long now = System.currentTimeMillis()/1000;
    		String qrtime = String.valueOf(now);
    		String info = courseId+qrtime; 
            //=============================开始生存二维码===================================
//    		String access_tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxeeeb37ae05c9611e&secret=d768ee020c896f73e4957016bafcd450";
    		String access_tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxe5e611b85af09c1b&secret=1f7b366a028d34d7493a1cd7f66d1953";
    		String access_token = doGetStr(access_tokenUrl);
    		String ticket_url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+access_token;
    		System.out.println("courseId="+courseId+"-------------------------------------------");
    		String qrcode = "{\"action_name\": \"QR_SCENE\", \"action_info\": {\"scene\": {\"scene_id\":"+info+"}}}";
    		String ticket = doPostStr(ticket_url,qrcode);
    		String QR_images = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+ticket;
            out=response.getWriter();
            out.write(new Gson().toJson(QR_images));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfProject.toString(),Tools.getException(e));
        }
    }*/
    /**
     * 生成二维码微信(ywq)
     * @param request
     * @param response
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public ModelAndView tobarcodeCreateofPC(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
		ModelAndView view = null;
    	try {
    		FrmSysparaTypeKey dakatimekey = new FrmSysparaTypeKey();
			dakatimekey.setXtlb("00");
			dakatimekey.setGjz("dakatimes");
			FrmSysparaTypeEntity dakatimeentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(dakatimekey);
			String dakatimes = dakatimeentity.getMrz();
    		long now = System.currentTimeMillis()/1000;
    		String qrtime = String.valueOf(now);
    		String courseId = request.getParameter("courseId");
    		String type = request.getParameter("type");
    		String SessionToken = request.getParameter("SessionToken");
    		String info = type+courseId+qrtime; 
    		System.out.println("穿的参数----------------------"+info+"-----------------------------");
//    		String access_tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxeeeb37ae05c9611e&secret=d768ee020c896f73e4957016bafcd450";
//    		String access_tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxe5e611b85af09c1b&secret=1f7b366a028d34d7493a1cd7f66d1953";
    		String access_tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wx6569605b7500fc29&secret=3538956863daffa7ca4bc79c0cf8e71b";
    		String access_token = "";
    		if(SessionToken==null||SessionToken.equals("")){
    			access_token = doGetStr(access_tokenUrl);
    		}else{
    			access_token = SessionToken;
    		}
    		String ticket_url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+access_token;
    		
    		System.out.println("courseId="+courseId+"-------------------------------------------");
    		String qrcode = "{\"action_name\": \"QR_STR_SCENE\", \"action_info\": {\"scene\": {\"scene_str\":"+info+"}}}";
    		String ticket = doPostStr(ticket_url,qrcode);
    		String QR_images = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+ticket;
    		//String QR_images_t = doGetStr_QR(QR_images);
			view = new ModelAndView("crouse_xfrecord/barcode_create_pc");
			//view.addObject("usernumber", entity.getUsernumber());
			view.addObject("type", type);
			view.addObject("QR_images", QR_images);
			view.addObject("courseId", courseId);
			view.addObject("dakatimes", dakatimes);
			view.addObject("access_token", access_token);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }  
    
    public ModelAndView barcodeCreate(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
    	ModelAndView view=null;
    	try {
    		String openid = request.getParameter("openid");
	        String clientsxh = request.getParameter("clientsxh");
	        WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
	        WechatClientinfoEntity clientinfo = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(clientsxh);
	        
	        String add_until = bindinfo.getRemark1();//医院编号
	        XfCourseSqlWhere courseSqlWhere = new XfCourseSqlWhere();
	        courseSqlWhere.setDeptId(add_until);
	        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	        courseSqlWhere.setEndDate(dateNowStr);
	        courseSqlWhere.setIsbegin("1");
	        List<XfCourseEntity> courselist = xfCourseService.selectListXfCourseBySqlWhere(courseSqlWhere);
	        //跳转页面
	        String teachtype = bindinfo.getLanguage();
        	if(teachtype.indexOf("22")!=-1){
        		view=new ModelAndView("crouse_xfrecord/Create_QR");
        	}else{
        		view=new ModelAndView("teaching/common_notcanpage");
        	}
	        view.addObject("courselist", courselist);
	        view.addObject("usernumber", bindinfo.getYitongCard());
	        view.addObject("deptId", add_until);
	        view.addObject("courselistJsonStr", new Gson().toJson(courselist));
	        view.addObject("wxtype", clientinfo.getWxtype());
	        view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }  
    /**
     * 生成二维码微信(ywq)
     * @param request
     * @param response
     * @return
     * @throws ServletException
     * @throws IOException
     */
    public ModelAndView CreditQR(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
		ModelAndView view = null;
    	try {
    		FrmSysparaTypeKey dakatimekey = new FrmSysparaTypeKey();
			dakatimekey.setXtlb("00");
			dakatimekey.setGjz("dakatimes");
			
			FrmSysparaTypeEntity dakatimeentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(dakatimekey);
			String dakatimes = dakatimeentity.getMrz();
    		long now = System.currentTimeMillis()/1000;
    		String qrtime = String.valueOf(now);
    		String courseId = request.getParameter("courseId");
    		String SessionToken = request.getParameter("SessionToken");
    		String clientsxh = request.getParameter("clientsxh");
    		String type = request.getParameter("type");
    		WechatClientinfoEntity clientinfo = wechatClientinfoService.selectWechatClientinfoByPrimaryKey(clientsxh);
    		String appid = clientinfo.getAppid();
    		String appsecret = clientinfo.getAppsecret();
    		String info = type+courseId+qrtime; 
    		System.out.println("穿的参数----------------------"+info+"-----------------------------");
    		String access_tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+appid+"&secret="+appsecret;
    		String access_token = "";
    		if(SessionToken==null||SessionToken.equals("")){
    			access_token = doGetStr(access_tokenUrl);
    		}else{
    			access_token = SessionToken;
    		}
    		String ticket_url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+access_token;
    		System.out.println("courseId="+courseId+"-------------------------------------------");
    		String qrcode = "{\"action_name\": \"QR_STR_SCENE\", \"action_info\": {\"scene\": {\"scene_str\":"+info+"}}}";
    		String ticket = doPostStr(ticket_url,qrcode);
    		String QR_images = "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket="+ticket;
    		//String QR_images_t = doGetStr_QR(QR_images);
			view = new ModelAndView("crouse_xfrecord/barcode_create");
			//view.addObject("usernumber", entity.getUsernumber());
			view.addObject("type", type);
			view.addObject("QR_images", QR_images);
			view.addObject("courseId", courseId);
			view.addObject("dakatimes", dakatimes);
			view.addObject("access_token", access_token);
			view.addObject("clientsxh", clientsxh);
    	} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }  
    /**
     * 编写Get请求的方法。但没有参数传递的时候，可以使用Get请求
     * 
     * @param url 需要请求的URL
     * @return 将请求URL后返回的数据，转为JSON格式，并return
     * @throws IOException 
     * @throws ParseException 
     */
    public static String doGetStr_QR(String QR_images) throws ParseException, IOException {
    	DefaultHttpClient client = new DefaultHttpClient();
    	HttpGet request = new HttpGet(QR_images);
    	HttpResponse response = client.execute(request);
    	String QR_images_s = "";
    	if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
    		QR_images_s = EntityUtils.toString(response.getEntity());
    		System.out.println(QR_images_s);
    		//JSONObject jsonResult = JSONObject.parseObject(strResult);
    		//QR_images_s = (String) jsonResult.get("access_token");
    	}
    	return QR_images_s;
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

        try
        {
            MessageDigest crypt = MessageDigest.getInstance("SHA-1");
            crypt.reset();
            crypt.update(string1.getBytes("UTF-8"));
            signature = byteToHex(crypt.digest());
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }

        ret.put("url", url);
        ret.put("jsapi_ticket", jsapi_ticket);
        ret.put("nonceStr", nonce_str);
        ret.put("timestamp", timestamp);
        ret.put("signature", signature);

        return ret;
    }
    
    /**
     * 构造一个用于产生二维码的本地连接
     * @return
     */
    public ModelAndView creatQRCode(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	String key = "9ba45bfd500642328ec03ad8ef1b6e75";// 自定义密钥 
        ModelAndView view=null;
        try{
        	FrmSysparaTypeKey frmSysparaTypeKey = new FrmSysparaTypeKey();
    		frmSysparaTypeKey.setXtlb("00");
    		frmSysparaTypeKey.setGjz("dakatimes");
    		FrmSysparaTypeEntity frmSysparaTypeEntity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(frmSysparaTypeKey);
        	String dakatime = (frmSysparaTypeEntity==null||frmSysparaTypeEntity.getMrz().equals(""))?"10":frmSysparaTypeEntity.getMrz();
    		Encryptutil des = new Encryptutil(key, "utf-8");
        	String courseId = request.getParameter("courseId");
        	String checkNumber = request.getParameter("checkNumber");
        	view = new ModelAndView("crouse_xfrecord/barcode_create_new");
        	//String message = "wechatBind.do?method=punchOut&courseId="+courseId+"&timespan="+create_timestamp()+"&checkNumber="+checkNumber;
        	String message = "wechatBind.do?method=punchOut&courseId="+courseId+"&checkNumber="+checkNumber;
        	message = des.encode(message);
        	String QR_images = "wechatBind.do?method=creatQRcodeReturnStr&message="+message;
        	view.addObject("dakatime", dakatime);
        	view.addObject("QR_images", QR_images);
        }catch(Exception e) {
  			e.printStackTrace();
  		}
        return view;
    }
    
    
    /**
     * 构造一个用于产生二维码的本地连接 电脑端
     * @return
     */
    public ModelAndView creatQRCodeOfPc(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	String key = "9ba45bfd500642328ec03ad8ef1b6e75";// 自定义密钥 
        ModelAndView view=null;
        try{
        	StringBuffer yuanUrl = request.getRequestURL();
        	String servleturl = request.getServletPath();
        	String url=yuanUrl.toString().replace(servleturl, "/");
        	FrmSysparaTypeKey frmSysparaTypeKey = new FrmSysparaTypeKey();
    		frmSysparaTypeKey.setXtlb("00");
    		frmSysparaTypeKey.setGjz("dakatimes");
    		FrmSysparaTypeEntity frmSysparaTypeEntity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(frmSysparaTypeKey);
        	String dakatime = (frmSysparaTypeEntity==null||frmSysparaTypeEntity.getMrz().equals(""))?"10":frmSysparaTypeEntity.getMrz();
    		Encryptutil des = new Encryptutil(key, "utf-8");
        	String courseId = request.getParameter("courseId");
        	String checkNumber = request.getParameter("checkNumber");
        	view = new ModelAndView("crouse_xfrecord/barcode_create_pc_new");
        	//String message = "wechatBind.do?method=punchOut&courseId="+courseId+"&timespan="+create_timestamp()+"&checkNumber="+checkNumber;
        	String message = url+"wechatBind.do?method=punchOut&courseId="+courseId+"&checkNumber="+checkNumber;
        	message = des.encode(message);
        	String QR_images = url+"wechatBind.do?method=creatQRcodeReturnStr&message="+message;
        	view.addObject("dakatime", dakatime);
        	view.addObject("QR_images", QR_images);
        }catch(Exception e) {
  			e.printStackTrace();
  		}
        return view;
    }
    /**
     * 编写Get请求的方法。但没有参数传递的时候，可以使用Get请求
     * 
     * @param url 需要请求的URL
     * @return 将请求URL后返回的数据，转为JSON格式，并return
     * @throws IOException 
     * @throws ParseException 
     */
    public static String doGetStr(String access_tokenUrl) throws ParseException, IOException {
    	System.out.println("token获取此时------------------------------------------------------------");
    	DefaultHttpClient client = new DefaultHttpClient();
    	HttpGet request = new HttpGet(access_tokenUrl);
    	HttpResponse response = client.execute(request);
    	String access_token = "";
    	if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
    		String strResult = EntityUtils.toString(response.getEntity());
    		System.out.println(strResult);
    		JSONObject jsonResult = JSONObject.parseObject(strResult);
    		//JSONObject jsonResult = new JSONObject(strResult);
    		access_token = (String) jsonResult.get("access_token");
    	}
    	return access_token;
    }
    /**
     * 编写Get请求的方法。但没有参数传递的时候，可以使用Get请求
     * 
     * @param url 需要请求的URL
     * @return 将请求URL后返回的数据，转为JSON格式，并return
     * @throws IOException 
     * @throws ParseException 
     */
    public static String doPostStr(String ticket_url,String qrcode) throws ParseException, IOException {
    	DefaultHttpClient client = new DefaultHttpClient();
    	HttpPost request = new HttpPost(ticket_url);
    	HttpEntity entity = new StringEntity(qrcode, "UTF-8");  
    	request.setEntity(entity);  
    	HttpResponse response = client.execute(request);
    	String ticket = "";
    	if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
    		String strResult = EntityUtils.toString(response.getEntity());
    		System.out.println(strResult);
    		JSONObject jsonResult = JSONObject.parseObject(strResult);
    		//JSONObject jsonResult = new JSONObject(strResult);
    		ticket = (String) jsonResult.get("ticket");
    	}
    	return ticket;
    }
    /**
     * 获得参数表有效时间(ywq)
     * @param request
     * @param response
     */
    public void getTypedakaTimes(HttpServletRequest request,HttpServletResponse response){
    	response.setContentType("text/html; charset=GBK");
        PrintWriter out=null;
        try{
            out=response.getWriter();
            FrmSysparaTypeKey dakatimekey = new FrmSysparaTypeKey();
			dakatimekey.setXtlb("00");
			dakatimekey.setGjz("dakatimes");
			FrmSysparaTypeEntity dakatimeentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(dakatimekey);
			String dakatimes = dakatimeentity.getMrz();
            out.write(new Gson().toJson(dakatimes));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfProject.toString(),Tools.getException(e));
        }
    }
    private static String create_nonce_str() {
        return UUID.randomUUID().toString();
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
    public static void main(String[] args) {
    	String nowTime = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    	System.out.println(nowTime);
	}
}