package com.saint.wechat.manager.ctrl;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfCourseSignupEntity;
import com.saint.wechat.manager.bean.XfCourseSignupKey;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.services.IXfStudyRegistrationService;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis.wsdl.symbolTable.Undefined;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class XfStudyRegistrationAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfStudyRegistrationService xfStudyRegistrationService;
    
    private IWechatBindService wechatBindService;
    
    private IXfCourseService xfCourseService;
    
    private IXfEmployeeService xfEmployeeService;
    
    private IJxStudentsService jxStudentsService;

    public void getListPageXfStudyRegistration(HttpServletRequest request, HttpServletResponse response, XfStudyRegistrationSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<XfStudyRegistrationEntity> entitylist=xfStudyRegistrationService.selectListPageXfStudyRegistrationBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfStudyRegistration.toString(),Tools.getException(e));
        }
    }

    /**
     * 我的课程
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toMyTaskInfoPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openId = request.getParameter("openid");
    		String clientsxh = request.getParameter("clientsxh");
    		WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId, clientsxh);
			view = new ModelAndView("crouse_xfrecord/my_course_list");
			view.addObject("usernumber", bindinfo.getYitongCard());
			view.addObject("clientsxh", clientsxh);
			view.addObject("openId", openId);
			view.addObject("type", "0");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     * 查询课程详细信息
     * @param request
     * @param response
     * @param entity
     * @return
     */
    public void getMycourseLictInfo(HttpServletRequest request, HttpServletResponse response, XfStudyRegistrationSqlWhere sqlWhere) {
    	response.setContentType("text/html; charset=UTF-8");
        PrintWriter out=null; 
        try{
        	out=response.getWriter();
            String year = request.getParameter("year");
            String courseName = request.getParameter("courseName");
            if(courseName!=null&&!courseName.equals("")){
            	courseName = new String(courseName.getBytes("GBK"), "UTF-8");
            }
            String usernumber = request.getParameter("usernumber");
            sqlWhere.setEmpNumber(usernumber);
            sqlWhere.setCourseName(courseName);
            sqlWhere.setAddYear(year);
            List<XfStudyRegistrationEntity> entitylist=xfStudyRegistrationService.selectListXfStudyRegistrationBySqlWhere(sqlWhere);
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfStudyRegistration.toString(),Tools.getException(e));
        }
    }
    /**
     * 我的课程
     * @param request
     * @param response
     * @return
     */
    public ModelAndView selectXfCourseByPrimaryKey(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openId = request.getParameter("openId");
    		String clientsxh = request.getParameter("clientsxh");
    		String courseId = request.getParameter("courseId");
    		String isgrant = request.getParameter("isgrant");
    		String awardstate = request.getParameter("awardstate");
    		String remarks3 = request.getParameter("remarks3");
    		if(remarks3.equals("undefined")){
    			remarks3="0";
    		}
    		System.out.println(remarks3);
    		XfCourseEntity entity = xfCourseService.selectXfCourseByPrimaryKey(courseId);
			view = new ModelAndView("crouse_xfrecord/my_course_info");
			view.addObject("isgrant", isgrant);
			view.addObject("awardstate", awardstate);
			view.addObject("remarks3", remarks3);
			view.addObject("entity", entity);
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
	 /**
     * 我的课程
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toMyTaskInfotickling(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openId = request.getParameter("openid");
    		String clientsxh = request.getParameter("clientsxh");
    		WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId, clientsxh);
			view = new ModelAndView("crouse_xfrecord/my_course_list");
			view.addObject("usernumber", bindinfo.getYitongCard());
			view.addObject("clientsxh", clientsxh);
			view.addObject("openId", openId);
			view.addObject("type", "1");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     * 跳转至反馈页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toTaskInfoTickling(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String usernumber = request.getParameter("usernumber");
    		String courseId = request.getParameter("courseId");
    		String xh = request.getParameter("xh");
    		XfEmployeeEntity empentity = xfEmployeeService.selectXfEmployeeByPrimaryKey(usernumber);
    		JxStudentsEntity stuentity = jxStudentsService.selectJxStudentsByPrimaryKey(usernumber);
    		String username = "";
    		if(empentity!=null){
    			username = empentity.getUsername();
    		}else{
    			if(stuentity!=null){
    				username = stuentity.getName();
    			}
    		}
    		XfCourseEntity entity = xfCourseService.selectXfCourseByPrimaryKey(courseId);
			view = new ModelAndView("crouse_xfrecord/my_course_tickling");
			view.addObject("xh", xh);
			view.addObject("usernumber", usernumber);
			view.addObject("username", username);
			view.addObject("entity",entity);
			view.addObject("type", "1");
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
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

    public void setXfStudyRegistrationService(IXfStudyRegistrationService xfStudyRegistrationService) {
        this.xfStudyRegistrationService = xfStudyRegistrationService;
    }

    public IXfStudyRegistrationService getXfStudyRegistrationService() {
        return xfStudyRegistrationService;
    }

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IXfCourseService getXfCourseService() {
		return xfCourseService;
	}

	public void setXfCourseService(IXfCourseService xfCourseService) {
		this.xfCourseService = xfCourseService;
	}

	public IXfEmployeeService getXfEmployeeService() {
		return xfEmployeeService;
	}

	public void setXfEmployeeService(IXfEmployeeService xfEmployeeService) {
		this.xfEmployeeService = xfEmployeeService;
	}

	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}

	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}
    
    
}