package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxCourseArrangeEntity;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.services.IJxCourseArrangeService;
import com.saint.teaching.services.IJxCoursePlanService;
import com.saint.teaching.services.IJxStudentsLeaveService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxCourseArrangeSqlWhere;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.services.IWechatBindService;

/**
*类注释信息
*表名JX_COURSEARRANGE
*表说明理论课课程安排
  */
public class JxCourseArrangeAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxCourseArrangeService jxCourseArrangeService;
    
    private IWechatBindService wechatBindService;
    
    private IJxCoursePlanService jxCoursePlanService;
    
    private IFrmCodeService frmCodeService;
    
    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IJxStudentsService jxStudentsService;
    
    private IJxStudentsLeaveService jxStudentsLeaveService;

    /**
     * 提醒未反馈人员(ywq)
     * @param request
     * @param response
     * @param entity
     */
    public void updateJxCourseArrange(HttpServletRequest request, HttpServletResponse response, JxCourseArrangeEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
    	try {
    		out = response.getWriter();
    		String nowtime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	    	String arrangexh = request.getParameter("arrangexh");
	    	JxCourseArrangeEntity arrange = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(arrangexh);
	    	String shkdate = arrange.getSkdate().substring(0,10)+arrange.getShtime();
	    	JxCoursePlanEntity plan = jxCoursePlanService.selectJxCoursePlanByPrimaryKey(arrange.getCoursenum());
	    	String count = request.getParameter("count");
	    	String num = request.getParameter("num");
	    	entity.setXh(arrangexh);
	    	if(num!=null&&!num.equals("")&&num.equals("1")){
	    		entity.setDayreplywx("1");
	    	}else if(num!=null&&!num.equals("")){
	    		entity.setWeekreplywx("1");
	    	}else{
	    		entity.setOpdate(nowtime);
	    	}
	    	result = jxCourseArrangeService.updateJxCourseArrangeByPrimaryKeySelective(entity);
	    	if(result.getReturnCode().equals("1")){
	    		resultMap.put("errorMsg", "success");
	    		FrmSysparaTypeKey key = new FrmSysparaTypeKey();
	    		key.setXtlb("00");
	    		key.setGjz("coursetxrid");
	    		FrmSysparaTypeEntity sys = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(key);
	    		String openid = sys.getMrz();
	    		FrmSysparaTypeKey typekey = new FrmSysparaTypeKey();
				typekey.setXtlb("00");
				typekey.setGjz("remaindnotickling");	
				FrmSysparaTypeEntity entity2 = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(typekey);		
				JxCommonAction.WechatTemplateSendhf(openid,"",arrange.getRkjshname(),plan.getCoursename(),shkdate,count,entity2.getMrz());
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
    *方法注释信息
    *JX_COURSEARRANGE,理论课课程安排表
    *跳转到新增页面
      */
    @SuppressWarnings("null")
	public ModelAndView teacherAffirInfo(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view=null;
        try {
        	String arrangexh = request.getParameter("arrangexh");
        	String num = request.getParameter("num");
        	JxCourseArrangeEntity entity = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(arrangexh);
        	JxCoursePlanEntity plan = jxCoursePlanService.selectJxCoursePlanByPrimaryKey(entity.getCoursenum());
        	FrmCodeKey key = new FrmCodeKey();
        	key.setXtlb("00");
        	key.setDmlb("0136");
        	String zhuanye = "";
        	for(int i=0;i<plan.getXshszzhy().split(",").length;i++){
        		key.setDmz(plan.getXshszzhy().split(",")[i]);
        		FrmCodeEntity code = frmCodeService.selectFrmCodeByPrimaryKey(key);
        		if(code!=null){
        			if(zhuanye==null&&zhuanye.equals("")){
        				zhuanye += code.getDmmc()+plan.getShkbanj().split(",")[i]+"班";
        			}else{
        				zhuanye += "、"+code.getDmmc()+ plan.getShkbanj().split(",")[i]+"班";
        			}
        		}
        	}
        	String time = entity.getSkdate().substring(0,10)+" "+entity.getShtime()+"(星期"+entity.getShkxqi()+"/第"+entity.getShkzhci()+"周)";
        	view=new ModelAndView("teaching/teacher_affirinfo");
            view.addObject("entity", entity);
            view.addObject("plan", plan);
            view.addObject("zhuanye", zhuanye);
            view.addObject("nj", plan.getNj().split(",")[0]);
            view.addObject("time", time);
            view.addObject("num", num);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }

   /**
    *方法注释信息
    *JX_COURSEARRANGE,理论课课程安排表
    *跳转到修改页面
    */
    public ModelAndView barcodeCreate(HttpServletRequest request, HttpServletResponse response, JxCourseArrangeEntity entity) {
    	ModelAndView view=null;
        try {
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	JxStudentsEntity stu = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
//        	JxCoursePlanSqlWhere psqlWhere = new JxCoursePlanSqlWhere();
//        	psqlWhere.setShkxuexid(stu.getGraduateschool());
//        	psqlWhere.setNj(stu.getGrade());
//        	psqlWhere.setXshszzhy(stu.getProfessional());
//        	List<JxCoursePlanEntity> planlist = jxCoursePlanService.selectListJxCoursePlanBySqlWhere(psqlWhere);
        	String nowdate = new SimpleDateFormat("yyyy-MM-dd").format(new Date()); 
        	view=new ModelAndView("llcourse/class_project_zs");
            view.addObject("openid", openid);
            view.addObject("clientsxh", clientsxh);
            String schoolname = frmCodeService.selectFrmCodeByDmz("1676", stu.getGraduateschool());
            String zhuanyename = frmCodeService.selectFrmCodeByDmz("0136", stu.getProfessional());
            view.addObject("schoolname", schoolname);
            view.addObject("zhuanyename", zhuanyename);
            view.addObject("stu", stu);
            view.addObject("nowdate",nowdate);
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
    public void findProjectbyBj(HttpServletRequest request, HttpServletResponse response, JxCourseArrangeSqlWhere sqlWhere) {
    	response.setContentType("text/html; charset=UTF-8");
        PrintWriter out=null; 
        try{
        	out=response.getWriter();
        	String stuxh = request.getParameter("stuxh");
        	String shkdate = request.getParameter("shkdate");
        	JxStudentsEntity stu = jxStudentsService.selectJxStudentsByPrimaryKey(stuxh);
        	JxCoursePlanSqlWhere psqlWhere = new JxCoursePlanSqlWhere();
        	psqlWhere.setShkxuexid(stu.getGraduateschool());
        	psqlWhere.setNj(stu.getGrade());
        	psqlWhere.setXshszzhy(stu.getProfessional());
        	List<JxCoursePlanEntity> planlist = jxCoursePlanService.selectListJxCoursePlanBySqlWhere(psqlWhere);
            List<JxCourseArrangeEntity> entitylist = new ArrayList<JxCourseArrangeEntity>();
            for(int i=0;i<planlist.size();i++){
            	JxCourseArrangeSqlWhere arrsql = new JxCourseArrangeSqlWhere();
            	arrsql.setCoursenum(planlist.get(i).getXh());
            	arrsql.setSkdate(shkdate);
            	List<JxCourseArrangeEntity> arrlist =  jxCourseArrangeService.selectListJxCourseArrangeBySqlWhere(arrsql);
            	for(int j=0;j<arrlist.size();j++){
            		JxCourseArrangeEntity arrentity = arrlist.get(j);
            		entitylist.add(arrentity);
            	}
            }
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfStudyRegistration.toString(),Tools.getException(e));
        }
    }
    
    /**
     *方法注释信息
     *JX_COURSEARRANGE,理论课课程安排表
     *跳转到修改页面
     */
     public ModelAndView toJxCourseArrangeInfo(HttpServletRequest request, HttpServletResponse response, JxCourseArrangeEntity entity) {
     	ModelAndView view=null;
         try {
         	 String xh = request.getParameter("xh");
         	 String openid = request.getParameter("openid");
         	 String clientsxh = request.getParameter("clientsxh");
         	 String nowdate = new SimpleDateFormat("yyyy-MM-dd").format(new Date()); 
         	 entity = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(xh);
         	 view=new ModelAndView("llcourse/class_project_xx");
         	 view.addObject("nowdate",nowdate);
             view.addObject("entity",entity);
             view.addObject("openid",openid);
             view.addObject("clientsxh",clientsxh);
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
         return view;
     }
     
     
    
    
    public ModelAndView toJxCourseArrangeInfoPage(HttpServletRequest request,HttpServletResponse response){ 
    	response.setContentType("text/html; charset=utf-8");
    	ModelAndView view=null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String teachtype = bindinfo.getLanguage();
        	if(teachtype.indexOf("22")!=-1){
        		view=new ModelAndView("teaching/student_coursearrange_list");
        	}else{
        		view=new ModelAndView("teaching/common_notcanpage");
        	}
            view.addObject("yhdh",bindinfo.getYitongCard());
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    
    public void getLoginMessage(HttpServletRequest request,HttpServletResponse response,JxCourseArrangeSqlWhere sqlWhere){
    	  response.setContentType("text/html; charset=utf-8");
          PrintWriter out=null; 
          try{
        	  String applyInfo = request.getParameter("applyInfo");
  	    	  applyInfo = URLDecoder.decode(applyInfo, "utf-8"); 
  	    	  JxCourseArrangeEntity entity = JsonUtil.json2Object(applyInfo, JxCourseArrangeEntity.class);
        	  
        	  sqlWhere.setRkjshid(entity.getRkjshid());
              sqlWhere.setCoursename(entity.getCoursename());
              sqlWhere.setSkdate(entity.getSkdate());
              sqlWhere.setOrderByClause("SKDATE");
        	  List<JxCourseArrangeEntity> entitylist=jxCourseArrangeService.selectListJxCourseArrangeBySqlWhere(sqlWhere);
              out=response.getWriter();
              out.write(new Gson().toJson(entitylist));
          }catch (Exception e) {
              e.printStackTrace();
              frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxCourseArrange.toString(),Tools.getException(e));
          }
    }
    
    
    public ModelAndView getTeacherXxMessage(HttpServletRequest request,HttpServletResponse response){ 
    	response.setContentType("text/html; charset=utf-8");
    	String xh = request.getParameter("xh");
    	String num = request.getParameter("num");
    	ModelAndView mav =new ModelAndView();
    	JxCourseArrangeEntity entity = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(xh);
    	JxCoursePlanEntity en = jxCoursePlanService.selectJxCoursePlanByPrimaryKey(num);
    	mav.setViewName("teaching/student_coursearrange_edit");
        mav.addObject("entity", entity);
        mav.addObject("en", en);
    	return mav;
    }
    
    
    public void GetZcMessage(HttpServletRequest request,HttpServletResponse response){
	   response.setContentType("text/html; charset=GBK");
       PrintWriter out=null; 
       try{
    	   String zc = request.getParameter("zc");
    	   FrmCodeKey key = new FrmCodeKey();
    	   key.setDmlb("0108");
    	   key.setDmz(zc);
    	   key.setXtlb("00");
    	   FrmCodeEntity entity = frmCodeService.selectFrmCodeByPrimaryKey(key);
    	   String dmmc = entity.getDmmc();
    	   out=response.getWriter();
           out.write(new Gson().toJson(dmmc));
       }catch (Exception e) {
           e.printStackTrace();
           frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxBreakSchool.toString(),Tools.getException(e));
       }
    }
    
    public void GetSchoolMessage(HttpServletRequest request,HttpServletResponse response){
 	   response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
     	   String school = request.getParameter("school");
     	   FrmCodeKey key = new FrmCodeKey();
     	   key.setDmlb("1676");
     	   key.setDmz(school);
     	   key.setXtlb("00");
     	   FrmCodeEntity entity = frmCodeService.selectFrmCodeByPrimaryKey(key);
     	   String dmmc = entity.getDmmc();
     	   out=response.getWriter();
            out.write(new Gson().toJson(dmmc));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxBreakSchool.toString(),Tools.getException(e));
        }
     }
    
    
    /**
     * 理论课请假
     * @param request
     * @param response
     * @return
     */
     public ModelAndView toLlcoursetickling(HttpServletRequest request, HttpServletResponse response, JxCourseArrangeEntity entity) {
     	ModelAndView view=null;
         try {
         	 String openid = request.getParameter("openid");
         	 String clientsxh = request.getParameter("clientsxh");
         	 String nowdate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
         	 WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
         	 JxStudentsEntity stu = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
         	 view=new ModelAndView("llcourse/course_leave_zs");
             view.addObject("openid", openid);
             view.addObject("clientsxh", clientsxh);
             String schoolname = frmCodeService.selectFrmCodeByDmz("1676", stu.getGraduateschool());
             String zhuanyename = frmCodeService.selectFrmCodeByDmz("0136", stu.getProfessional());
             view.addObject("schoolname", schoolname);
             view.addObject("zhuanyename", zhuanyename);
             view.addObject("stu", stu);
             view.addObject("nowdate", nowdate);
 		} catch (Exception e) {
 			 e.printStackTrace();
 		}
        return view;
     }
     /**
      * 理论课请假
      * @param request
      * @param response
      * @return
      */
      public ModelAndView toCourseLeaveInfo(HttpServletRequest request, HttpServletResponse response) {
    	  ModelAndView view = null;
      	  try {
      		  String arrangexh = request.getParameter("xh");
      		  JxCourseArrangeEntity arr = jxCourseArrangeService.selectJxCourseArrangeByPrimaryKey(arrangexh);
      		  String openid = request.getParameter("openid");
      		  String clientsxh = request.getParameter("clientsxh");
      		  String gxsj = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
      		  WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
      		  JxStudentsEntity students = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
      		  if(students.getPertype().equals("2")||students.getPertype().equals("5")){
      			  int seq = jxStudentsLeaveService.selectXhJxStudentLeaveBySql();
      			  String xh = String.valueOf(seq);
      			  view = new ModelAndView("llcourse/course_leave_app");
      			  view.addObject("bindinfo", bindinfo);
      			  view.addObject("students", students);
      			  view.addObject("time", gxsj);
      			  view.addObject("xh", xh);
      			  view.addObject("arr", arr);
      		  }else{
      			  view = new ModelAndView("teaching/common_notcanpage");
      		  }
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

    public void setJxCourseArrangeService(IJxCourseArrangeService jxCourseArrangeService) {
        this.jxCourseArrangeService = jxCourseArrangeService;
    }

    public IJxCourseArrangeService getJxCourseArrangeService() {
        return jxCourseArrangeService;
    }

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
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


	public IJxStudentsLeaveService getJxStudentsLeaveService() {
		return jxStudentsLeaveService;
	}


	public void setJxStudentsLeaveService(
			IJxStudentsLeaveService jxStudentsLeaveService) {
		this.jxStudentsLeaveService = jxStudentsLeaveService;
	}

	
    
    
}