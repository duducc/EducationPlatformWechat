package com.saint.wechat.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.teaching.services.IJxCourseArrangeService;
import com.saint.teaching.services.IJxCoursePlanService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.services.IJxStudyRegistrationService;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatClientinfoService;
import com.saint.wechat.manager.services.IWechatMenuinfoService;
import com.saint.wechat.manager.services.IWechatNewsService;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfCourseSignupService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.services.IXfProjectService;
import com.saint.wechat.manager.services.IXfStudyRegistrationService;


public abstract class BaseService {
	public abstract String service(Map<String, String> resultmap,String clientsxh,HttpServletRequest request,String openid,String wxtype);
	
	protected  IWechatBindService wechatBindService;

	protected IWechatSysparamService wechatSysparamService;
	
	protected IWechatNewsService wechatNewsService;
	
	protected IXfProjectService xfProjectService;
	
	protected GzyhService gzyhservice;
	
	protected IXfCourseSignupService xfCourseSignupService;
	
	protected IXfCourseService xfCourseService;
	
	protected IXfEmployeeService xfEmployeeService;
	
	protected IXfStudyRegistrationService xfStudyRegistrationService;
	
	protected IFrmDepartmentService frmDepartmentService;
	
	protected IFrmSysparaTypeService FrmSysparaTypeService;
	
	protected IWechatClientinfoService wechatClientinfoService;
	
	protected IJxStudentsService jxStudentsService;
	
	protected IWechatMenuinfoService wechatMenuinfoService;
	
	protected IJxCourseArrangeService jxCourseArrangeService;
	
	protected IFrmCodeService frmCodeService;
	
	protected IJxCoursePlanService jxCoursePlanService;
	
	protected IJxStudyRegistrationService jxStudyRegistrationService;
	
	
	
	public IJxStudyRegistrationService getJxStudyRegistrationService() {
		return jxStudyRegistrationService;
	}

	public void setJxStudyRegistrationService(
			IJxStudyRegistrationService jxStudyRegistrationService) {
		this.jxStudyRegistrationService = jxStudyRegistrationService;
	}

	public IJxCoursePlanService getJxCoursePlanService() {
		return jxCoursePlanService;
	}

	public void setJxCoursePlanService(IJxCoursePlanService jxCoursePlanService) {
		this.jxCoursePlanService = jxCoursePlanService;
	}

	public IFrmCodeService getFrmCodeService() {
		return frmCodeService;
	}

	public void setFrmCodeService(IFrmCodeService frmCodeService) {
		this.frmCodeService = frmCodeService;
	}

	public IJxCourseArrangeService getJxCourseArrangeService() {
		return jxCourseArrangeService;
	}

	public void setJxCourseArrangeService(
			IJxCourseArrangeService jxCourseArrangeService) {
		this.jxCourseArrangeService = jxCourseArrangeService;
	}

	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return FrmSysparaTypeService;
	}

	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		FrmSysparaTypeService = frmSysparaTypeService;
	}

	
	public IXfStudyRegistrationService getXfStudyRegistrationService() {
		return xfStudyRegistrationService;
	}

	public void setXfStudyRegistrationService(
			IXfStudyRegistrationService xfStudyRegistrationService) {
		this.xfStudyRegistrationService = xfStudyRegistrationService;
	}

	public IXfCourseSignupService getXfCourseSignupService() {
		return xfCourseSignupService;
	}

	public void setXfCourseSignupService(
			IXfCourseSignupService xfCourseSignupService) {
		this.xfCourseSignupService = xfCourseSignupService;
	}

	public GzyhService getGzyhservice() {
		return gzyhservice;
	}

	public void setGzyhservice(GzyhService gzyhservice) {
		this.gzyhservice = gzyhservice;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IWechatSysparamService getWechatSysparamService() {
		return wechatSysparamService;
	}

	public void setWechatSysparamService(
			IWechatSysparamService wechatSysparamService) {
		this.wechatSysparamService = wechatSysparamService;
	}

	public IWechatNewsService getWechatNewsService() {
		return wechatNewsService;
	}

	public void setWechatNewsService(IWechatNewsService wechatNewsService) {
		this.wechatNewsService = wechatNewsService;
	}

	public IXfProjectService getXfProjectService() {
		return xfProjectService;
	}

	public void setXfProjectService(IXfProjectService xfProjectService) {
		this.xfProjectService = xfProjectService;
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

	public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}

	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}

	public IWechatClientinfoService getWechatClientinfoService() {
		return wechatClientinfoService;
	}

	public void setWechatClientinfoService(
			IWechatClientinfoService wechatClientinfoService) {
		this.wechatClientinfoService = wechatClientinfoService;
	}

	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}

	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}

	public IWechatMenuinfoService getWechatMenuinfoService() {
		return wechatMenuinfoService;
	}

	public void setWechatMenuinfoService(
			IWechatMenuinfoService wechatMenuinfoService) {
		this.wechatMenuinfoService = wechatMenuinfoService;
	}
	
	
	
}
