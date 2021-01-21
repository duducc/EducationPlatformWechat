package com.saint.wechat.manager.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfHoldingTaskEntity;
import com.saint.wechat.manager.bean.XfProjectEntity;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfProjectService;
import com.saint.wechat.manager.sqlWhere.XfCourseSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;

public class XfCourseAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfCourseService xfCourseService;
    
    private IWechatBindService wechatBindService;
    
    private IXfProjectService xfProjectService;
    
   
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

    public void setXfCourseService(IXfCourseService xfCourseService) {
        this.xfCourseService = xfCourseService;
    }

    public IXfCourseService getXfCourseService() {
        return xfCourseService;
    }
    

    public IXfProjectService getXfProjectService() {
		return xfProjectService;
	}

	public void setXfProjectService(IXfProjectService xfProjectService) {
		this.xfProjectService = xfProjectService;
	}

	/**
     * 课题管理
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCreateTaskManage(HttpServletRequest request, HttpServletResponse response) {
    	ModelAndView view=null;
    	try {
    		String openid = request.getParameter("openid");
	        String clientsxh = request.getParameter("clientsxh");
	        WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String teachtype = bindinfo.getLanguage();
        	if(teachtype.indexOf("22")!=-1){
        		view=new ModelAndView("crouse_xfrecord/task_manage_main");
        	}else{
        		view=new ModelAndView("teaching/common_notcanpage");
        	}
	        view.addObject("openid", openid);
	        view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    /**
     * 获取课题地址及时间信息
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void getCourseLocTimInfo(HttpServletRequest request, HttpServletResponse response, XfCourseSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	out=response.getWriter();
            String courseId = request.getParameter("courseId");
            XfCourseEntity entity=xfCourseService.selectXfCourseByPrimaryKey(courseId);
            XfProjectEntity proentity = xfProjectService.selectXfProjectByPrimaryKey(entity.getProId());
            entity.setRemark1(proentity.getHoldStartDate());
            entity.setRemark2(proentity.getHoldEndDate());
            out.write(new Gson().toJson(entity));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfProject.toString(),Tools.getException(e));
        }
    }
    /**
     * 打开地图
     * @param request
     * @param response
     * @return
     */
    public ModelAndView openMapGetPoint(HttpServletRequest request, HttpServletResponse response){
    	String jd=request.getParameter("jd");
    	String wd=request.getParameter("wd");
    	ModelAndView view=new ModelAndView ("tool/map_getPoint_singleton_qq");
    	view.addObject("csdd", "西宁");
    	view.addObject("jd", jd);
    	view.addObject("wd", wd);
		return view;
    }
    /**
     * 打开地图 查询
     * @param request
     * @param response
     * @return
     */
    public ModelAndView openMapQueryPoint(HttpServletRequest request, HttpServletResponse response){
    	String jd=request.getParameter("jd");
    	String wd=request.getParameter("wd");
    	String xh=request.getParameter("xh");
    	ModelAndView view=new ModelAndView ("tool/map_queryPoint_singleton");
    	view.addObject("jd", jd);
    	view.addObject("wd", wd);
		return view;
    }
    
    /**
     * 添加课题
     * @param request
     * @param response
     */
    public void saveHoldcourseTask(HttpServletRequest request, HttpServletResponse response,XfCourseEntity xwcentity){
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap<String, Object>();
        try{
        	out = response.getWriter();
        	String nowdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        	String courseInfo = request.getParameter("courseInfo");
        	courseInfo = URLDecoder.decode(courseInfo, "UTF-8");
        	xwcentity = JsonUtil.json2Object(courseInfo, XfCourseEntity.class);
        	xwcentity.setGxsj(nowdate);
        	result = xfCourseService.updateXfCourseByPrimaryKeySelective(xwcentity);
    		if(result.getReturnCode().equals("1")){
    			resultMap.put("errorMsg", "success");
    		}else{
    			resultMap.put("errorMsg", "failed");
    		}
        }catch(Exception e){
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
     * 添加课题(TS)
     * @param request
     * @param response
     */
    public void saveHoldcourseTask_ing(HttpServletRequest request, HttpServletResponse response,XfCourseEntity xwcentity){
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap<String, Object>();
        try{
        	out = response.getWriter();
        	String courseId = request.getParameter("courseId");
        	String usernumber = request.getParameter("usernumber");
        	String deptid = request.getParameter("deptid");
        	XfHoldingTaskEntity htentity_ts = xfCourseService.selectXfHoldingTaskByPrimaryKey(usernumber);
        	XfHoldingTaskEntity entity = new XfHoldingTaskEntity();
        	entity.setUsernumber(usernumber);
        	entity.setState("0");
        	entity.setCourseid(courseId);
        	entity.setDeptid(deptid);
        	String nowdate = new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " ).format(new Date());
        	entity.setAddtime(nowdate);
			if(htentity_ts==null){
				result = xfCourseService.insertXfHoldingTask(entity);
			}else{
				result = xfCourseService.updateXfHoldingTaskByPrimaryKey(entity);
			}
			if(result.getReturnCode().equals("1")){
    			resultMap.put("errorMsg", "success");
    		}else{
    			resultMap.put("errorMsg", "failed");
    		}
        }catch(Exception e){
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
     * 查询课程详细信息
     * @param request
     * @param response
     * @param entity
     * @return
     */
    public void getMycourseListInfo(HttpServletRequest request, HttpServletResponse response, XfCourseSqlWhere sqlWhere) {
    	response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	out=response.getWriter();
			String year = new SimpleDateFormat("yyyy").format(new Date());
        	String openid = request.getParameter("openid");
	        String clientsxh = request.getParameter("clientsxh");
	        WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
	        String dept = bindinfo.getRemark1();
            String courseName = request.getParameter("courseName");
            sqlWhere.setIsbegin(request.getParameter("isbegin"));
            sqlWhere.setDeptId(dept);
            sqlWhere.setCourseName(courseName);
            sqlWhere.setAutoCheck(year);
            List<XfCourseEntity> entitylist=xfCourseService.selectListXfCourseBySqlWhere(sqlWhere);
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfStudyRegistration.toString(),Tools.getException(e));
        }
    }
    
    
    /**
     * 跳转到课题举办页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toholdTaskPage(HttpServletRequest request, HttpServletResponse response) {
    	ModelAndView view=null;
    	try {
    		String courseId = request.getParameter("courseId");
    		XfCourseEntity entity = xfCourseService.selectXfCourseByPrimaryKey(courseId);
	        view=new ModelAndView("crouse_xfrecord/task_manage_info");
	        view.addObject("entity", entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    
    /**
     * 添加课题(TS)
     * @param request
     * @param response
     */
    public void courseTaskHoldingManager(HttpServletRequest request, HttpServletResponse response,XfCourseEntity entity){
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap<>();
        try{
        	out = response.getWriter();
        	String courseId = request.getParameter("courseId");
        	String isbegin = request.getParameter("isbegin");
        	entity.setCourseId(courseId);
        	entity.setIsbegin(isbegin);
        	result = xfCourseService.updateXfCourseByPrimaryKeySelective(entity);
			if(result.getReturnCode().equals("1")){
    			resultMap.put("errorMsg", "success");
    		}else{
    			resultMap.put("errorMsg", "failed");
    		}
        }catch(Exception e){
        	e.printStackTrace(); 
        	resultMap.put("errorMsg", "error");
        }finally{
			String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
			System.out.println(json);
			out.write(json);
            if(out!=null)out.close();
		}
	}
	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}
	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
    
    
}