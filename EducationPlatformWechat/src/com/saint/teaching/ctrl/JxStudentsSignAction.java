package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.bean.JxStudentsSignEntity;
import com.saint.teaching.bean.JxStudentsSignListEntity;
import com.saint.teaching.services.IJxSignInfoService;
import com.saint.teaching.services.IJxStudentsSignService;
import com.saint.teaching.sqlWhere.JxSignInfoSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSignSqlWhere;
import com.saint.wechat.manager.bean.XfApplyChangeEntity;

/**
*类注释信息
*表名JX_STUDENTS_SIGN
*表说明 学生签到信息
  */
public class JxStudentsSignAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentsSignService jxStudentsSignService;

    private IJxSignInfoService jxSignInfoService;
    /**
    *方法注释信息
    *分页查询表JX_STUDENTS_SIGN
    *表说明 学生签到信息
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudentsSign(HttpServletRequest request, HttpServletResponse response, JxStudentsSignSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxStudentsSignEntity> entitylist=jxStudentsSignService.selectListPageJxStudentsSignBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsSign.toString(),Tools.getException(e));
        }
    }
    /**
     * 获取学生签到信息
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void getSignEntityById(HttpServletRequest request, HttpServletResponse response, JxStudentsSignSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            out=response.getWriter();
            String signcs = request.getParameter("signcs");
            String stuid = request.getParameter("stuid");
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date()) ;
            sqlWhere.setSigncs(signcs);
            sqlWhere.setStuid(stuid);
            sqlWhere.setSigndate(date);
            List<JxStudentsSignEntity> list = jxStudentsSignService.selectListJxStudentsSignBySqlWhere(sqlWhere);
            JxStudentsSignEntity entity = null;
            if(list.size()>0){
            	entity = list.get(0);
            }
            out.write(new Gson().toJson(entity));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsSign.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *JX_STUDENTS_SIGN, 学生签到信息表,插入信息
      */
    public void insertJxStudentsSign(HttpServletRequest request, HttpServletResponse response, JxStudentsSignEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
		PrintWriter out = null;
	    ExcuteResult result;
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    try {
	    	out = response.getWriter();
//	    	ServletContext application = request.getSession().getServletContext();
//	    	String Longitude = (String) application.getAttribute("Longitude");
//	        String Latitude = (String) application.getAttribute("Latitude");
//	        String remark1 = Longitude+"/"+Latitude;
	        String type = request.getParameter("type");
	        /*double swd = Double.valueOf(Longitude);
	        double sjd = Double.valueOf(Latitude);
	        JxSignInfoSqlWhere jssqlWhere = new JxSignInfoSqlWhere();
	        List<JxSignInfoEntity> jslist=jxSignInfoService.selectListJxSignInfoBySqlWhere(jssqlWhere);
	        String wd = jslist.get(0).getPolitionwd();
	        String jd = jslist.get(0).getPolitionjd();
	        double dwd = Double.valueOf(wd);
	        double djd = Double.valueOf(jd);
	        double scope = Double.valueOf(jslist.get(0).getScope());
	        double distance = getDistance(dwd,djd,swd,sjd);*/
	        /*if(distance>scope){
	        	resultMap.put("errorMsg", "chaochujl");
	        }else{*/
	        	String applyInfo = request.getParameter("applyInfo");
		    	applyInfo = URLDecoder.decode(applyInfo, "utf-8"); 
	        	entity = JsonUtil.json2Object(applyInfo, JxStudentsSignEntity.class);
	        	String nowtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	        	String nowdate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	        	String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
	        	entity.setSigntime(nowtime);
	        	entity.setSigndate(nowdate);
	        	entity.setType(type);
	        	JxSignInfoSqlWhere sqlWhere = new JxSignInfoSqlWhere();
	        	sqlWhere.setOrderByClause("SIGNCS");
	        	sqlWhere.setSigncs(entity.getSigncs());
	            List<JxSignInfoEntity> entitylist=jxSignInfoService.selectListJxSignInfoBySqlWhere(sqlWhere);
	            JxSignInfoEntity signinfo = entitylist.get(0);
	            String endtime = signinfo.getEndtime();
	        	Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(nowtime);
	        	Calendar cal = Calendar.getInstance();
	        	cal.setTime(date1);
	        	long nowtimel = cal.getTimeInMillis();
	        	Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(nowdate+" "+endtime);
	        	cal.setTime(date2);
	        	long endtimel = cal.getTimeInMillis();
	            long sjc = endtimel-nowtimel;
	            String signstate = "0";
	            String latetime = "0";
	            if(sjc<0){
	            	signstate = "1";
	            	latetime = String.valueOf(sjc);
	            }
	            entity.setSignstate(signstate);
	            entity.setLatetime(latetime);
	            result = jxStudentsSignService.insertJxStudentsSign(entity);
	    		if(result.getReturnCode().equals("1")){
	    			resultMap.put("errorMsg", "success");
	    		}else{
	    			resultMap.put("errorMsg", "failed");
	    		}
//	        }
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
    *JX_STUDENTS_SIGN, 学生签到信息表,修改
      */
    public void updateJxStudentsSign(HttpServletRequest request, HttpServletResponse response, JxStudentsSignEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
		PrintWriter out = null;
	    ExcuteResult result;
	    Map<String, Object> resultMap = new HashMap<String, Object>();
	    try {
	    	out = response.getWriter();
	    	String xh = request.getParameter("xh");
	    	String signcs = request.getParameter("signcs");
        	String nowtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        	String nowdate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        	entity.setXh(xh);
        	entity.setSigntime(nowtime);
        	entity.setSigndate(nowdate);
        	JxSignInfoSqlWhere sqlWhere = new JxSignInfoSqlWhere();
        	sqlWhere.setOrderByClause("SIGNCS");
        	sqlWhere.setSigncs(signcs);
            List<JxSignInfoEntity> entitylist=jxSignInfoService.selectListJxSignInfoBySqlWhere(sqlWhere);
            JxSignInfoEntity signinfo = entitylist.get(0);
            String endtime = signinfo.getEndtime();
        	Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(nowtime);
        	Calendar cal = Calendar.getInstance();
        	cal.setTime(date1);
        	long nowtimel = cal.getTimeInMillis();
        	Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(nowdate+" "+endtime);
        	cal.setTime(date2);
        	long endtimel = cal.getTimeInMillis();
            long sjc = endtimel-nowtimel;
            String signstate = "0";
            String latetime = "0";
            if(sjc<0){
            	signstate = "1";
            	latetime = String.valueOf(sjc);
            }
            entity.setSignstate(signstate);
            entity.setLatetime(latetime);
            result = jxStudentsSignService.updateJxStudentsSignByPrimaryKeySelective(entity);
    		if(result.getReturnCode().equals("1")){
    			resultMap.put("errorMsg", "success");
    		}else{
    			resultMap.put("errorMsg", "failed");
    		}
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
     * 统计学生签到信息
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void getStuSignInfo(HttpServletRequest request, HttpServletResponse response, JxStudentsSignSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            out=response.getWriter();
            String signdates = request.getParameter("signdates");
            String stuid = request.getParameter("stuid");
            String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date()) ;
            List<JxStudentsSignListEntity> tempList = new ArrayList<JxStudentsSignListEntity>() ; 
            for(int i=1;i<32;i++){
            	String ri = String.valueOf(i);
            	ri = i<10?"0"+ri:ri;
            	String signdate = signdates+"-"+ri;
            	sqlWhere.setStuid(stuid);
            	sqlWhere.setSigndate(signdate);
            	sqlWhere.setOrderByClause("SIGNCS");
            	List<JxStudentsSignEntity> list = jxStudentsSignService.selectListJxStudentsSignBySqlWhere(sqlWhere);
            	if(list.size()>0){
            		JxStudentsSignListEntity jssln = new JxStudentsSignListEntity();
            		jssln.setEntity(list.get(0));
            		jssln.setList(list);
            		jssln.setTotalProgress(i);
            		tempList.add(jssln) ;
            	}
            }
            Collections.reverse(tempList); 
            out.write(new Gson().toJson(tempList));
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
      * test
      * @param args
      */
     public static void main(String[] args){
         double distance = getDistance(103.85108897340777,36.06279263459836,103.848831,36.063099);
         System.out.println("Distance is:"+distance);
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

    public void setJxStudentsSignService(IJxStudentsSignService jxStudentsSignService) {
        this.jxStudentsSignService = jxStudentsSignService;
    }

    public IJxStudentsSignService getJxStudentsSignService() {
        return jxStudentsSignService;
    }
	public IJxSignInfoService getJxSignInfoService() {
		return jxSignInfoService;
	}
	public void setJxSignInfoService(IJxSignInfoService jxSignInfoService) {
		this.jxSignInfoService = jxSignInfoService;
	}
    
    
}