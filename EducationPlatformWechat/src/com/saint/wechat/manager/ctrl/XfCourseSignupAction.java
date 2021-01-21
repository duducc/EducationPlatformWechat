package com.saint.wechat.manager.ctrl;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.DateManager;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.CourseOrProjectEntity;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatBindKey;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfCourseSignupEntity;
import com.saint.wechat.manager.bean.XfCourseSignupKey;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfCourseSignupService;
import com.saint.wechat.manager.sqlWhere.XfCourseSignupSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfCourseSqlWhere;
import com.saint.wechat.manager.sqlWhere.XfStudyRegistrationSqlWhere;
import com.saint.wechat.utils.QRCodeUtil;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class XfCourseSignupAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfCourseSignupService xfCourseSignupService;
    private IWechatBindService wechatBindService;
    private IXfCourseService xfCourseService;
    private IFrmDepartmentService frmDepartmentService;
    
    public void getListPageXfCourseSignup(HttpServletRequest request, HttpServletResponse response, XfCourseSignupSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<XfCourseSignupEntity> entitylist=xfCourseSignupService.selectListPageXfCourseSignupBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfCourseSignup.toString(),Tools.getException(e));
        }
    }

    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, XfCourseSignupEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertXfCourseSignup(request,response,entity);
        }else if(option.equals("edit")){
            updateXfCourseSignup(request,response,entity);
        }else if(option.equals("delete")){
            deleteXfCourseSignup(request,response,entity);
        }
    }
/**
 * 向报名表插入数据
 * @param request
 * @param response
 * @param entity
 */
    public void insertXfCourseSignup(HttpServletRequest request, HttpServletResponse response, XfCourseSignupEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        String openId = request.getParameter("openId");
    	String clientsxh = request.getParameter("clientsxh");
    	System.out.println("openId===="+openId);
        try {
            out = response.getWriter();
            result = xfCourseSignupService.insertXfCourseSignup(entity,clientsxh,openId);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertXfCourseSignup, out);
        } catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertXfCourseSignup.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
        
    }

    public void updateXfCourseSignup(HttpServletRequest request, HttpServletResponse response, XfCourseSignupEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfCourseSignupService.updateXfCourseSignupByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateXfCourseSignup, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateXfCourseSignup.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void deleteXfCourseSignup(HttpServletRequest request, HttpServletResponse response, XfCourseSignupKey key) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfCourseSignupService.deleteXfCourseSignupByPrimaryKey(key);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteXfCourseSignup, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteXfCourseSignup.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public ModelAndView toCreateAddPageXfCourseSignup(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    public ModelAndView toCreateUpdatePageXfCourseSignup(HttpServletRequest request, HttpServletResponse response, XfCourseSignupKey key) {
        //修改页面
        XfCourseSignupEntity entityXfCourseSignupEntity=xfCourseSignupService.selectXfCourseSignupByPrimaryKey(key);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityXfCourseSignupEntity);
        return view;
    }
    /**
     * 课题报名列表展示页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCourseSignUpList(HttpServletRequest request, HttpServletResponse response, XfCourseEntity entity){
    	response.setContentType("text/html; charset=utf-8");
    	String openId = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	System.out.println("openId===="+openId);
    	ModelAndView view = null;
    	try {
    		String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    		XfCourseSqlWhere courseSqlWhere = new XfCourseSqlWhere();
    		courseSqlWhere.setEndDate(nowTime);
    		courseSqlWhere.setCoursesTask(entity.getCoursesTask());
    		List<XfCourseEntity> list = xfCourseService.selectListXfCourseBySqlWhere(courseSqlWhere);
    		view = new ModelAndView("crouse_xfrecord/course_signup_list");
    		view.addObject("list", list);
    		view.addObject("openId", openId);
    		view.addObject("clientsxh", clientsxh);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     * 课题报名撤销列表展示页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCourseSignUpCancelList(HttpServletRequest request, HttpServletResponse response, XfCourseSignupEntity entity){
    	response.setContentType("text/html; charset=utf-8");
    	String openId = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	System.out.println("openId===="+openId);
    	
    	String yitongcard = "";
    	if(entity.getYitongCard() != null && !entity.getYitongCard().equals("")){
    		yitongcard = entity.getYitongCard();
    	}else{
    	
        	WechatBindKey key = new WechatBindKey();
            key.setOpenId(openId);
            key.setClientsxh(clientsxh);
            WechatBindEntity bindinfo = wechatBindService.selectWechatBindByPrimaryKey(key);
            yitongcard = bindinfo.getYitongCard();
    	}
    	
    	ModelAndView view = null;
    	try {
    		XfCourseSignupSqlWhere signupSqlWhere = new XfCourseSignupSqlWhere();
    		signupSqlWhere.setState("1");
    		signupSqlWhere.setCoursesTask(entity.getCoursesTask());
    		signupSqlWhere.setYitongCard(yitongcard);
    		List<XfCourseSignupEntity> list = xfCourseSignupService.selectListXfCourseSignupBySqlWhere(signupSqlWhere);
    		view = new ModelAndView("crouse_xfrecord/course_signupcancel_list");
    		view.addObject("list", list);
    		view.addObject("yitongcard", yitongcard);
    		view.addObject("openId", openId);
    		view.addObject("clientsxh", clientsxh);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return view;
    }
    /**
     * 课题报名详细页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCourseSignupInfo(HttpServletRequest request, HttpServletResponse response, XfCourseEntity entity){
    	response.setContentType("text/html; charset=utf-8");
    	ModelAndView view = null;
    	int sign = 0;
    	int wsign = 0;
    	try {
    		String courseId = request.getParameter("courseId");
    		String openId = request.getParameter("openId");
    		String clientsxh = request.getParameter("clientsxh");
    		XfCourseEntity pentity = xfCourseService.selectXfCourseByPrimaryKey(courseId);
    		String yiyuan = pentity.getDeptId();
    		FrmDepartmentEntity dept = frmDepartmentService.selectFrmDepartmentByPrimaryKey(yiyuan);
    		XfCourseSignupSqlWhere signupsqlWhere = new XfCourseSignupSqlWhere();
    		signupsqlWhere.setState("1");
    		signupsqlWhere.setCourseId(courseId);
    		sign = xfCourseSignupService.countXfCourseSignupBySqlWhere(signupsqlWhere);//统计已报名数量
    		if(pentity != null && pentity.getEduObjCount() != null){
    			wsign = Integer.parseInt(pentity.getEduObjCount())  - sign;
    		}
    	
    		view = new ModelAndView("crouse_xfrecord/course_signup_info");
    		view.addObject("pentity", pentity);
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("wsign", wsign);
			view.addObject("deptName", dept.getBmmc());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     * 保存报名信息
     * @param request
     * @param response
     */
  
    public void saveCourseSignuoInfo(HttpServletRequest request, HttpServletResponse response,XfCourseSignupEntity entity){
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap<String, Object>();
    	try {
			out = response.getWriter();
			String openId = request.getParameter("openId");
			String clientsxh = request.getParameter("clientsxh");
			XfCourseEntity couentity = xfCourseService.selectXfCourseByPrimaryKey(entity.getCourseId());
			String coursedate = couentity.getEndDate();
			DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
			Date date = new Date();
			Date btbegindate = sdf.parse(coursedate);  //开始时间
			if(date.getTime()>btbegindate.getTime()){
				resultMap.put("errorMsg", "yijieshu");
			}else{
				result = xfCourseSignupService.insertXfCourseSignup(entity,clientsxh,openId);
				if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
				}else{
					resultMap.put("errorMsg", result.getReturnMessage());
				}
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
     * 课题报名取消详细页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCourseSignupCancelInfo(HttpServletRequest request, HttpServletResponse response, XfCourseSignupEntity entity){
    	response.setContentType("text/html; charset=utf-8");
    	ModelAndView view = null;
    	try {
    		XfCourseSignupKey key = new XfCourseSignupKey();
    		key.setCourseId(entity.getCourseId());
    		key.setYitongCard(entity.getYitongCard());
    		XfCourseSignupEntity pentity = xfCourseSignupService.selectXfCourseSignupByPrimaryKey(key);
    		
    	
    		view = new ModelAndView("crouse_xfrecord/course_signupcancel_info");
    		view.addObject("pentity", pentity);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     * 取消报名
     * @param request
     * @param response
     * @param entity
     */
    public void updateCourseSignuoCancel(HttpServletRequest request, HttpServletResponse response,XfCourseSignupEntity entity){
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap<String, Object>();
    	try {
			out = response.getWriter();
			String openId = request.getParameter("openId");
			String clientsxh = request.getParameter("clientsxh");
			entity.setState("2");
			entity.setGxsj(DateManager.getDate());
			result = xfCourseSignupService.updateXfCourseSignupByPrimaryKeySelective(entity);

	        	if(result.getReturnCode().equals("1")){
		        	resultMap.put("errorMsg", "success");
		        }else{
		        	resultMap.put("errorMsg", result.getReturnMessage());
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
     * 取消报名展示页面
     * @param request
     * @param response
     * @return
     
    public ModelAndView toCancelSignuopage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openId = request.getParameter("openId");
    		String clientsxh = request.getParameter("clientsxh");
    		String type = "1";
    		WechatBindKey key = new WechatBindKey();
	        key.setOpenId(openId);
	        key.setClientsxh(clientsxh);
	        WechatBindEntity bindinfo = wechatBindService.selectWechatBindByPrimaryKey(key);
	        String yitongcard = bindinfo.getYitongCard();
	        List<XfTaskSignupEntity> list = xfProjectService.selectListTaskSignupByYiTongCard(yitongcard);
			view = new ModelAndView("crouse_xfrecord/task_signcancel_zs");
			view.addObject("list", list);
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("type", type);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }*/
    /**
     * 取消报名详细页面
     * @param request
     * @param response
     * @return
     
    public ModelAndView toCourseSignupInfoCancel(HttpServletRequest request, HttpServletResponse response, XfCourseEntity entity){
    	ModelAndView view = null;
    	try {
    		String Id = request.getParameter("Id");
    		String openId = request.getParameter("openId");
    		String clientsxh = request.getParameter("clientsxh");
    		String type = request.getParameter("type");
    		XfTaskSignupEntity entity = xfProjectService.selectTaskSignupById(Id);
			view = new ModelAndView("crouse_xfrecord/task_signcancel_xx");
			view.addObject("entity", entity);
			view.addObject("Id", Id);
			view.addObject("openId", openId);
			view.addObject("clientsxh", clientsxh);
			view.addObject("type", type);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }*/
    /**
     * 取消报名，删除报名记录
     * @param request
     * @param response
     
    public void deleteCourseSignuoInfo(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap<>();
    	try {
			out = response.getWriter();
			String Id = request.getParameter("Id");
        	result = xfProjectService.deleteTaskSignupInfoByPrimaryKey(Id);
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
    }*/
    
    /**
     * 课题管理
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCreateTaskManage(HttpServletRequest request, HttpServletResponse response) {
        String openid = request.getParameter("openid");
        String clientsxh = request.getParameter("clientsxh");
        WechatBindKey key = new WechatBindKey();
        key.setOpenId(openid);
        key.setClientsxh(clientsxh);
        WechatBindEntity bindinfo = wechatBindService.selectWechatBindByPrimaryKey(key);
        String add_until = bindinfo.getRemark1();
        String addyear = new SimpleDateFormat("yyyy").format(new Date());
        XfCourseSqlWhere sqlWhere = new XfCourseSqlWhere();
        List<XfCourseEntity> courselist = xfCourseService.selectListXfCourseBySqlWhere(sqlWhere);
        //List<XfWechatCourseEntity> wechatcourselist = xfCourseService.selectListWechatCourseBydept(add_until);
        /*String courseId = "";
        if(wechatcourselist==null){
        	courseId="";
        }else{
        	courseId=wechatcourselist.get(0).getCourseid();
        }*/
        //跳转页面
        ModelAndView view=new ModelAndView("crouse_xfrecord/task_manage");
        view.addObject("courselist", courselist);
        view.addObject("openId", openid);
        view.addObject("clientsxh", clientsxh);
        view.addObject("deptId", add_until);
        view.addObject("courselistJsonStr", new Gson().toJson(courselist));
        //view.addObject("courseIdJsonStr",new Gson().toJson(courseId));
        return view;
    }
    /**
     * 添加课题
     * @param request
     * @param response
     */
    public ModelAndView saveHoldcourseTask(HttpServletRequest request, HttpServletResponse response){
        ExcuteResult result;
        ModelAndView view = null;
        try{
        	XfCourseEntity xwcentity = new XfCourseEntity();
        	String deptId = request.getParameter("deptId");
        	String courseId = request.getParameter("courseId");
        	SimpleDateFormat sdf =   new SimpleDateFormat( " yyyy-MM-dd HH:mm:ss " );
        	String nowdate = sdf.format(new Date());
        	String taskbegintime = request.getParameter("taskBeginTime");
        	String taskendtime = request.getParameter("taskEndTime");
        	String location = new String(request.getParameter("location").getBytes("ISO-8859-1"), "UTF-8");
        	xwcentity.setPlaceName(location);
        	xwcentity.setPosition("0.0.0");
        	xwcentity.setState("0");
        	xwcentity.setIsbegin("1");
        	xwcentity.setValidTime(taskbegintime+"-"+taskendtime);
        	xwcentity.setCheckNumber("2");
        	xwcentity.setAddTime(nowdate);
        	xwcentity.setGxsj(nowdate);
        	xwcentity.setCourseId(courseId);
        	xwcentity.setDeptId(deptId);
        	result = xfCourseService.updateXfCourseByPrimaryKeySelective(xwcentity);
    		/*if(result.getReturnCode().equals("1")){
    			resultMap.put("errorMsg", "success");
    		}else{
    			resultMap.put("errorMsg", "failed");
    		}*/
//        	String filePath = request.getRealPath("/")+"images/servic/hospital.jpg";
        	String text = "http://lzywq.tunnel.qydev.com/EducationPlatformWechat/xfProject.do?method=ScanQRCodeSign&courseId="+courseId;
			QRCodeUtil.encode(text, "E:/worksprace_2015/EducationPlatformWechat/WebRoot/images/service/ywq_057.jpg", true,response);
    		view = new ModelAndView("crouse_xfrecord/barcode_manage");
    		//request.getRequestDispatcher("WEB-INF/pages/crouse_xfrecord/barcode_manage.jsp").forward(request, response);
    		//response.sendRedirect("WEB-INF/pages/crouse_xfrecord/barcode_manage.jsp");
        }catch(Exception e){
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

    public void setXfCourseSignupService(IXfCourseSignupService xfCourseSignupService) {
        this.xfCourseSignupService = xfCourseSignupService;
    }

    public IXfCourseSignupService getXfCourseSignupService() {
        return xfCourseSignupService;
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

	public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}

	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}
    
    
}