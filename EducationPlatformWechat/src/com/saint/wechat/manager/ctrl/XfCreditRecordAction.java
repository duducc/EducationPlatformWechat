package com.saint.wechat.manager.ctrl;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxStudentsGradeEntity;
import com.saint.teaching.services.IJxStudentsGradeService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere;
import com.saint.wechat.manager.bean.MyxfEntity;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfCreditRecordEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfProjectEntity;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfCreditRecordService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.services.IXfProjectService;
import com.saint.wechat.manager.services.IXfStudyRegistrationService;
import com.saint.wechat.manager.sqlWhere.XfCreditRecordSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfEmployeeSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class XfCreditRecordAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfCreditRecordService xfCreditRecordService;
    
    private IWechatBindService wechatBindService;
    
    private IXfProjectService XfProjectService;
    
    private IXfCourseService xfCourseService;
    
    private IXfStudyRegistrationService xfStudyRegistrationService;
    
    private IXfEmployeeService xfEmployeeService;
    
    private IFrmDepartmentService frmDepartmentService;
    
    private IJxStudentsService jxStudentsService;
    
    private IJxStudentsGradeService jxStudentsGradeService;
    
    public IXfProjectService getXfProjectService() {
		return XfProjectService;
	}
	public void setXfProjectService(IXfProjectService xfProjectService) {
		XfProjectService = xfProjectService;
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
	/**
     * 我的学分
     * @param request
     * @param response
     * @return
     */
	/*public ModelAndView toXfCreditRecords(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html; charset=utf-8");
        ModelAndView view= null;
		try {
			view=new ModelAndView("crouse_xfrecord/ownCredit");
			String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid, clientsxh);
        	String YitongCard = bindinfo.getYitongCard();
        	XfEmployeeEntity entity = xfEmployeeService.selectXfEmployeeByPrimaryKey(YitongCard);
        	FrmDepartmentEntity dept = frmDepartmentService.selectFrmDepartmentByPrimaryKey(entity.getDepart());
        	String deptname = dept!=null?dept.getBmmc():entity.getDepart();
        	view.addObject("deptname", deptname);
        	view.addObject("entity", entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}*/
	
	/**
	 * 我的学分页面的学分显示
	 * @param request
	 * @param response
	 * @return
	 */
	public ModelAndView toXfCreditRecord(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html; charset=utf-8");
        ModelAndView view= null;
		try {
			view=new ModelAndView("crouse_xfrecord/ownCredit");
			String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid, clientsxh);
        	String YitongCard = bindinfo.getYitongCard();
        	JxStudentsEntity entity = jxStudentsService.selectJxStudentsByPrimaryKey(YitongCard);
        	view.addObject("entity",entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return view;
	}
	
	/**
	 * 按年度查询加减分详细记录
	 * @param request
	 * @param response
	 * @param sqlWhere
	 */
	public void toSearchStudentGradeByStuid(HttpServletRequest request,HttpServletResponse response,JxStudentsGradeSqlWhere sqlWhere){
	   response.setContentType("text/html; charset=GBK");
       PrintWriter out=null; 
       try{
    	   String usernumber = request.getParameter("usernumber");
    	   usernumber=usernumber.substring(2,usernumber.length());
    	   String year = request.getParameter("year");
    	   sqlWhere.setStudentid(usernumber);
    	   if(year != null && !"".equals(year)){
    		   JxStudentsEntity entity = jxStudentsService.selectJxStudentsByPrimaryKey(usernumber);
    		   String begin = entity.getStuyear() +"-"+ year +"-01";
        	   String end = entity.getStuyear() +"-"+ (Integer.parseInt(year)+1) +"-01";
        	   sqlWhere.setJjfsj(begin);
        	   sqlWhere.setCreatedate(end);
    	   }
    	   sqlWhere.setOrderByClause("JJFSJ ASC");
    	   List<JxStudentsGradeEntity> list = jxStudentsGradeService.selectListJxStudentsGradeBySqlWhere(sqlWhere);
    	   out=response.getWriter();
           out.write(new Gson().toJson(list));
       }catch (Exception e) {
           e.printStackTrace();
       }
	}
   
	
	/**
	 * 我的学分
	 * @param request
	 * @param response
	 * @param sqlWhere
	 */
	public void getMyxfInfo(HttpServletRequest request, HttpServletResponse response, XfCreditRecordSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	String usernumber = request.getParameter("usernumber");
        	String year = request.getParameter("year");
        	sqlWhere.setManId(usernumber);
        	sqlWhere.setAddYear(year);
            List<XfCreditRecordEntity> entitylist=xfCreditRecordService.selectListXfCreditRecordBySqlWhere(sqlWhere);
            /*int scode = 0;
            for(int i=0;i<entitylist.size();i++){
    			int educredit = Integer.valueOf(entitylist.get(i).getCredit());
    			scode+=educredit;
            }*/
            
            out=response.getWriter();
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfEmployee.toString(),Tools.getException(e));
        }
    }
   /* public ModelAndView toXfCreditRecord(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view= null;
        try {
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid, clientsxh);
        	String YitongCard = bindinfo.getYitongCard();
        	XfStudyRegistrationSqlWhere stusqlWhere = new XfStudyRegistrationSqlWhere();
        	stusqlWhere.setEmpNumber(YitongCard);
        	List<XfStudyRegistrationEntity> list = xfStudyRegistrationService.selectListXfStudyRegistrationBySqlWhere(stusqlWhere);
        	String course_id = "";
        	List<MyxfEntity> xflist = new ArrayList<MyxfEntity>();
        	int scode = 0;
        	for(int i=0;i<list.size();i++){
        		MyxfEntity myxf = new MyxfEntity();
        		course_id = list.get(i).getCourseId();
        		String isgrant = list.get(i).getIsgrant();
        		XfCourseEntity courseentity = xfCourseService.selectXfCourseByPrimaryKey(course_id);
        		String pro_id = "";
        		if(courseentity!=null){
        			pro_id = courseentity.getProId();
        			XfProjectEntity projectentity = XfProjectService.selectXfProjectByPrimaryKey(pro_id);
        			String holdUnit = projectentity.getHoldUnit();
        			String coursesTask = courseentity.getCoursesTask();
        			String eduCredit = courseentity.getCredit();
        			int educredit = Integer.valueOf(eduCredit);
        			scode+=educredit;
        			myxf.setCourseid(course_id);
        			myxf.setHoldUnit(holdUnit);
        			myxf.setCoursesTask(coursesTask);
        			myxf.setEduCredit(eduCredit);
        			myxf.setState(isgrant);
        			xflist.add(myxf);
        		}
        	}
        	System.out.println("我的总学分是："+scode);
        	stusqlWhere.setIsgrant("1");
        	List<XfStudyRegistrationEntity> ysflist = xfStudyRegistrationService.selectListXfStudyRegistrationBySqlWhere(stusqlWhere);
        	String ysfcourse_id = "";
        	int ysfscode = 0;
        	for(int i=0;i<ysflist.size();i++){
        		ysfcourse_id = ysflist.get(i).getCourseId();
        		XfCourseEntity courseentity = xfCourseService.selectXfCourseByPrimaryKey(ysfcourse_id);
        		if(courseentity!=null){
        			String ysfpro_id = courseentity.getProId();
        			XfProjectEntity projectentity = XfProjectService.selectXfProjectByPrimaryKey(ysfpro_id);
        			String eduCredit = courseentity.getCredit();
        			int educredit = Integer.valueOf(eduCredit);
        			ysfscode+=educredit;
        		}
        	}
        	System.out.println("已授分总学分"+ysfscode);
        	view=new ModelAndView("crouse_xfrecord/xf_record_zs");
        	view.addObject("scode", scode);
        	view.addObject("ysfscode", ysfscode);
        	view.addObject("xflist", xflist);
        	view.addObject("size", xflist.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }*/
    /**
     * 我的学分详细
     * @param request
     * @param response
     * @return
     */
   /* public ModelAndView getMyxfInfo(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html; charset=utf-8");
    	String course_id = request.getParameter("courseid");
    	XfCourseEntity courseentity = xfCourseService.selectXfCourseByPrimaryKey(course_id);
    	String pro_id = courseentity.getProId();
    	XfProjectEntity projectentity = XfProjectService.selectXfProjectByPrimaryKey(pro_id);
    	String holdtime = projectentity.getHoldStartDate();
    	String holddate = holdtime.substring(0,10);
    	String proCode = projectentity.getProCode();
    	System.out.println("--------------------"+proCode);
    	String a1 = "国";
    	String a2 = "I";
    	String a3 = "II";
    	String a4 = "Ⅱ";
    	String a5 = "自";
    	long recordType = -1;
    	System.out.println("================="+proCode.indexOf(a1));
    	if(proCode.indexOf(a1)!=-1){
    		recordType = 0;
    	}else if(proCode.indexOf(a2)!=-1){
    		recordType = 1;
    	}else if(proCode.indexOf(a3)!=-1){
    		recordType = 2;
    	}else if(proCode.indexOf(a4)!=-1){
    		recordType = 2;
    	}else if(proCode.indexOf(a5)!=-1){
    		recordType = 3;
    	}else{
    		recordType = 4;
    	}
        ModelAndView view=new ModelAndView("crouse_xfrecord/xf_record_xx");
        view.addObject("recordType", recordType);
        view.addObject("holddate", holddate);
        view.addObject("courseentity", courseentity);
        view.addObject("projectentity", projectentity);
        return view;
    }*/
    public static void main(String[] args) {
		String proCode = "Ⅰ-2012-05-01-01";
		String a1 = "国";
		int a = proCode.indexOf(a1);
		System.out.println(a);
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
    public void setXfCreditRecordService(IXfCreditRecordService xfCreditRecordService) {
        this.xfCreditRecordService = xfCreditRecordService;
    }
    public IXfCreditRecordService getXfCreditRecordService() {
        return xfCreditRecordService;
    }
	public IXfStudyRegistrationService getXfStudyRegistrationService() {
		return xfStudyRegistrationService;
	}
	public void setXfStudyRegistrationService(
			IXfStudyRegistrationService xfStudyRegistrationService) {
		this.xfStudyRegistrationService = xfStudyRegistrationService;
	}
	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}
	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}
	
	public IJxStudentsGradeService getJxStudentsGradeService() {
		return jxStudentsGradeService;
	}
	public void setJxStudentsGradeService(
			IJxStudentsGradeService jxStudentsGradeService) {
		this.jxStudentsGradeService = jxStudentsGradeService;
	}
    
	
}