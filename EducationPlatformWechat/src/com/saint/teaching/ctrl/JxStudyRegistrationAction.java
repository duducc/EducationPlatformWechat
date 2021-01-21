package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.bean.JxQuestionnaireTestListEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.services.IJxCourseArrangeService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.services.IJxStudyRegistrationService;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;

/**
*类注释信息
*表名JX_STUDY_REGISTRATION
*表说明理论课签到
  */
public class JxStudyRegistrationAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudyRegistrationService jxStudyRegistrationService;
    
    private IWechatBindService wechatBindService;
    
    private IJxCourseArrangeService jxCourseArrangeService;
    
    private IJxStudentsService jxStudentsService;
    
    private IFrmCodeService frmCodeService;
    
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
			view = new ModelAndView("llcourse/my_course_list");
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
			view = new ModelAndView("llcourse/my_course_list");
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
     * 查询课程详细信息
     * @param request
     * @param response
     * @param entity
     * @return
     */
    public void getMycourseLictInfo(HttpServletRequest request, HttpServletResponse response, JxStudyRegistrationSqlWhere sqlWhere) {
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
            sqlWhere.setStuid(usernumber);
            sqlWhere.setCourseName(courseName);
            sqlWhere.setAddYear(year);
            List<JxStudyRegistrationEntity> entitylist=jxStudyRegistrationService.selectListJxStudyRegistrationBySqlWhere(sqlWhere);
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
    		String xh = request.getParameter("xh");
    		JxStudyRegistrationEntity stuentity = jxStudyRegistrationService.selectJxStudyRegistrationByPrimaryKey(xh);
    		String courseId = request.getParameter("courseId");
    		String isgrant = request.getParameter("isgrant");
    		String awardstate = request.getParameter("awardstate");
    		String remarks3 = request.getParameter("remarks3");
    		if(remarks3.equals("undefined")){
    			remarks3="0";
    		}
    		System.out.println(remarks3);
    		JxCourseArrangeEntity entity = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(courseId);
			view = new ModelAndView("llcourse/my_course_info");
			view.addObject("isgrant", isgrant);
			view.addObject("awardstate", awardstate);
			view.addObject("remarks3", remarks3);
			view.addObject("entity", entity);
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("fenshu", stuentity.getPosition());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
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

    public void setJxStudyRegistrationService(IJxStudyRegistrationService jxStudyRegistrationService) {
        this.jxStudyRegistrationService = jxStudyRegistrationService;
    }

    public IJxStudyRegistrationService getJxStudyRegistrationService() {
        return jxStudyRegistrationService;
    }

	public IJxCourseArrangeService getJxCourseArrangeService() {
		return jxCourseArrangeService;
	}

	public void setJxCourseArrangeService(
			IJxCourseArrangeService jxCourseArrangeService) {
		this.jxCourseArrangeService = jxCourseArrangeService;
	}
	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}
	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}
	public IFrmCodeService getFrmCodeService() {
		return frmCodeService;
	}
	public void setFrmCodeService(IFrmCodeService frmCodeService) {
		this.frmCodeService = frmCodeService;
	}
    
    
}