package com.saint.teaching.ctrl;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.saint.constant.FrmGnid;
import com.saint.pub.DateManager;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxTeachingDblEntity;
import com.saint.teaching.bean.JxTeachingManualsEntity;
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.services.IJxDepartmentService;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.services.IJxTeachingDblService;
import com.saint.teaching.services.IJxTeachingManualsService;
import com.saint.teaching.services.IJxTeachingManusService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxDepartmentSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.services.IWechatBindService;

/**
*类注释信息
*表名JX_TEACHING_MANUALS
*表说明实习生带教手册记录
  */
public class JxTeachingManualsAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxTeachingManualsService jxTeachingManualsService;
    
    private IWechatBindService wechatBindService;
    
    private IFrmDepartmentService frmDepartmentService;
    
    private IJxStudentsService jxStudentsService;
    
    private IJxDepartmentService  jxDepartmentService;
    
    private IJxClassStudentsService jxClassStudentsService;
    
    private IJxLunxunService jxLunxunService;
    
    private IFrmCodeService frmCodeService;
    
    private IJxTeachingManusService jxTeachingManusService;
    
    private IJxTeachingDblService jxTeachingDblService;
    
    
    /**
     * 跳转至带教手册轮训科室页面（ywq）
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCreditTeachingsc(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	JxClassStudentsSqlWhere cssql = new JxClassStudentsSqlWhere();
        	cssql.setStudentid(bindinfo.getYitongCard());
        	List<JxClassStudentsEntity> cslist = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(cssql);
        	if(cslist.size()>0){
        		String zuid = cslist.get(0).getZuid();
        		JxLunxunSqlWhere lxsql = new JxLunxunSqlWhere();
        		lxsql.setZuid(zuid);
        		List<JxLunxunEntity> lxlist = jxLunxunService.selectListJxLunxunBySqlWhere(lxsql);
        		List<JxLunxunEntity> erreylist = new ArrayList<JxLunxunEntity>();
        		for(int i=0;i<lxlist.size();i++){
        			JxLunxunEntity lxentity = new JxLunxunEntity();
        			lxentity = lxlist.get(i);
        			long todayTime = new Date().getTime();
        			long startDate = sdf.parse(lxentity.getStartdate()).getTime();
            		long endDate = sdf.parse(lxentity.getEnddate()).getTime();
            		String marking = "0";
            		if(todayTime>=endDate||todayTime>=startDate&&todayTime<=endDate){
            			marking = "1";
            		}
            		lxentity.setRemark6(marking);
            		erreylist.add(lxentity);
        		}
        		view = new ModelAndView("teaching_manuals/teaching_manuals_main");
        		view.addObject("openid",openid);
        		view.addObject("clientsxh",clientsxh);
        		view.addObject("erreylist",erreylist);
        	}else{
        		view = new ModelAndView("common/403.jsp");
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    public ModelAndView toAddTeachingmanuals(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String deptid = request.getParameter("deptid");
        	String lxxh = request.getParameter("lxxh");
//        	FrmCodeSqlWhere sqlWhere = new FrmCodeSqlWhere();
//        	sqlWhere.setDmlb("1738");
//        	sqlWhere.setXtlb("00");
//        	sqlWhere.setDmjc("SJLB");
//        	List<FrmCodeEntity> list = frmCodeService.selectListFrmCodeBySqlWhere(sqlWhere);
        	JxTeachingManusSqlWhere sqlWhere = new JxTeachingManusSqlWhere();
        	List<JxTeachingManusEntity> list = jxTeachingManusService.selectListJxTeachingManusBySqlWhere(sqlWhere);
        	List<JxTeachingManusEntity> erreylist = new ArrayList<JxTeachingManusEntity>();
        	for(int i=0;i<list.size();i++){
        		JxTeachingManusEntity mentity = new JxTeachingManusEntity();
        		mentity = list.get(i);
        		String sxh = list.get(i).getManuDm();
        		JxTeachingManualsSqlWhere msql = new JxTeachingManualsSqlWhere();
        		msql.setStuId(bindinfo.getYitongCard());
        		msql.setDeptid(deptid);
        		msql.setType(sxh);
        		int manushl = 0;
        		if(sxh.equals("3")){
        			JxTeachingDblSqlWhere sqll = new JxTeachingDblSqlWhere();
        			sqll.setStuId(bindinfo.getYitongCard());
        			sqll.setDeptid(deptid);
        			manushl = jxTeachingDblService.countJxTeachingDblBySqlWhere(sqll);
        		}else{
        			manushl = jxTeachingManualsService.countJxTeachingManualsBySqlWhere(msql);
        		}
        		mentity.setRemark1(String.valueOf(manushl));
        		erreylist.add(mentity);
        	}
        	JxTeachingManualsSqlWhere msqlt = new JxTeachingManualsSqlWhere();
    		msqlt.setStuId(bindinfo.getYitongCard());
    		msqlt.setDeptid(deptid);
    		msqlt.setType("1");
    		int rkjy = jxTeachingManualsService.countJxTeachingManualsBySqlWhere(msqlt);
    		JxTeachingManualsSqlWhere msqlo = new JxTeachingManualsSqlWhere();
    		msqlo.setStuId(bindinfo.getYitongCard());
    		msqlo.setDeptid(deptid);
    		msqlo.setType("2");
    		int djzrs = jxTeachingManualsService.countJxTeachingManualsBySqlWhere(msqlo);
    		System.out.println(rkjy+"-------"+djzrs);
        	view = new ModelAndView("teaching_manuals/teaching_manuals_books");
        	view.addObject("list",erreylist);
        	view.addObject("openid",openid);
        	view.addObject("clientsxh",clientsxh);
        	view.addObject("deptid",deptid);
        	view.addObject("lxxh",lxxh);
        	view.addObject("rkjy",rkjy);
        	view.addObject("djzrs",djzrs);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    
    
    public ModelAndView addrkjyPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String opinion = request.getParameter("opinion");
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	String type = request.getParameter("type");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String deptid = request.getParameter("deptid");
        	String lxxh = request.getParameter("lxxh");
        	String deptname = frmDepartmentService.selectFrmDepartmentByPrimaryKey(deptid).getBmmc();
        	if(opinion.equals("0")){
        		if(type.equals("1")){
        			view = new ModelAndView("teaching_manuals/jx_indepteducation_add");
        		}else if(type.equals("2")){
        			view = new ModelAndView("teaching_manuals/jx_teacherdutybooks_add");
        		}else if(type.equals("3")){
        			view = new ModelAndView("teaching_manuals/jx_teacherbagCase_add");
        		}else if(type.equals("4")){
        			view = new ModelAndView("teaching_manuals/jx_lectureNotes");
        		}else if(type.equals("5")){
        			view = new ModelAndView("teaching_manuals/jx_wardround");
        		}else if(type.equals("6")){
        			view = new ModelAndView("teaching_manuals/jx_practicerecord");
        		}else if(type.equals("7")){
        			view = new ModelAndView("teaching_manuals/jx_caseDiscussion");
        		}else if(type.equals("8")){
        			view = new ModelAndView("teaching_manuals/jx_typicalCaseRecord");
        		}
        		String xh = request.getParameter("xh");
        		if(xh==null||xh.equals("")){
            		JxLunxunEntity lunxun = jxLunxunService.selectJxLunxunByPrimaryKey(lxxh);
                	view.addObject("openid",openid);
                	view.addObject("clientsxh",clientsxh);
                	view.addObject("deptid",deptid);
                	view.addObject("lxxh",lxxh);
                	view.addObject("deptname",deptname);
                	view.addObject("bindinfo",bindinfo);
                	view.addObject("lunxun",lunxun);
                	view.addObject("type",type);
                	view.addObject("opinion","0");
        		}else{
        			JxTeachingManualsEntity entity = jxTeachingManualsService.selectJxTeachingManualsByPrimaryKey(xh);
        			JxTeachingDblEntity entitydbl = jxTeachingDblService.selectJxTeachingDblByPrimaryKey(xh);
        			if(entity!=null){
        				entity.setRemark10(getPropertiesValue("imgAccessPath")+entity.getWjlj());
        			}
        			view.addObject("openid",openid);
                	view.addObject("clientsxh",clientsxh);
                	view.addObject("deptid",deptid);
                	view.addObject("bindinfo",bindinfo);
                	view.addObject("type",type);
                	view.addObject("entity",type.equals("3")?entitydbl:entity);
                	view.addObject("deptname",deptname);
                	view.addObject("opinion","1");
        		}
        	}else{
        		String manudm = frmCodeService.selectFrmCodeByDmz("1738", type);
        		view = new ModelAndView("teaching_manuals/teaching_manuals_list");
        		view.addObject("openid",openid);
            	view.addObject("clientsxh",clientsxh);
            	view.addObject("deptid",deptid);
            	view.addObject("stuid",bindinfo.getYitongCard());
            	view.addObject("type",type);
            	view.addObject("manudm",manudm);
            	view.addObject("lxxh",lxxh);
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
    *方法注释信息
    *分页查询表JX_TEACHING_MANUALS
    *表说明实习生带教手册记录
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListJxTeachingManuals(HttpServletRequest request, HttpServletResponse response, JxTeachingManualsSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	String openId = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	String stuid = request.getParameter("stuid");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);
        	String opemid = bindinfo.getYitongCard();
        	String type = request.getParameter("type");
//        	JxTeachingManusSqlWhere sqlWheres = new JxTeachingManusSqlWhere();
//        	sqlWheres.setManuDm(type);
//        	List<JxTeachingManusEntity> manulist = jxTeachingManusService.selectListJxTeachingManusBySqlWhere(sqlWheres);
//        	String manudm = manulist.size()>0?manulist.get(0).getManuName():"";
        	String teacherName = request.getParameter("teacherName");
        	String deptid = request.getParameter("deptid");
        	String zttime = request.getParameter("zttime");
        	if(zttime==null||zttime.equals("")){
        		zttime = "";
        	}else{
        		zttime = zttime+"-01";
        	}
        	sqlWhere.setTeacherName(teacherName);
        	sqlWhere.setDeptid(deptid);
        	sqlWhere.setZttime(zttime);
        	sqlWhere.setOpemid(opemid);
        	sqlWhere.setType(type);
        	sqlWhere.setStuId(stuid);
            List<JxTeachingManualsEntity> entitylist=jxTeachingManualsService.selectListJxTeachingManualsBySqlWhere(sqlWhere);
            out=response.getWriter();
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxTeachingManuals.toString(),Tools.getException(e));
        }
    }
    /**
     *方法注释信息
     *分页查询表JX_TEACHING_MANUALS
     *表说明实习生带教手册记录
     * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
     * @param sqlWhere
     * @return
     */
     public void getupdeptState(HttpServletRequest request, HttpServletResponse response, JxTeachingManualsSqlWhere sqlWhere) {
         response.setContentType("text/html; charset=GBK");
         PrintWriter out=null; 
         try{
         	String openId = request.getParameter("openid");
         	String clientsxh = request.getParameter("clientsxh");
         	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);
         	String lxxh = request.getParameter("lxxh");
         	String num = request.getParameter("num");
         	String zuid = request.getParameter("zuid");
         	JxLunxunSqlWhere lxsql = new JxLunxunSqlWhere();
         	lxsql.setZuid(zuid);
         	lxsql.setNum(num);
         	List<JxLunxunEntity> lxlist = jxLunxunService.selectListJxLunxunBySqlWhere(lxsql);
         	String state = "0";
         	for(int i=0;i<lxlist.size();i++){
         		JxTeachingManusSqlWhere tmssql = new JxTeachingManusSqlWhere();
            	List<JxTeachingManusEntity> list = jxTeachingManusService.selectListJxTeachingManusBySqlWhere(tmssql);
            	if(state.equals("0")){
            		for(int j=0;j<list.size();j++){
            			String manushl = list.get(j).getManuShl();
            			String manudm = list.get(j).getManuDm();
            			String deptid = lxlist.get(i).getDeptid();
            			JxTeachingManualsSqlWhere msqlt = new JxTeachingManualsSqlWhere();
            			msqlt.setStuId(bindinfo.getYitongCard());
            			msqlt.setDeptid(deptid);
            			msqlt.setType(manudm);
            			int rkjy = 0;
            			if(manudm.equals("3")){
            				JxTeachingDblSqlWhere sqll = new JxTeachingDblSqlWhere();
                			sqll.setStuId(bindinfo.getYitongCard());
                			sqll.setDeptid(deptid);
                			rkjy = jxTeachingDblService.countJxTeachingDblBySqlWhere(sqll);
            			}else{
            				rkjy = jxTeachingManualsService.countJxTeachingManualsBySqlWhere(msqlt);
            			}
            			if(rkjy<Integer.valueOf(manushl)){
            				state = "1";
            				break;
            			}
            		}
            	}
         	}
         	System.out.println(state);
            out=response.getWriter();
            out.write(new Gson().toJson(state));
         }catch (Exception e) {
             e.printStackTrace();
             frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxTeachingManuals.toString(),Tools.getException(e));
         }
     }
    /**
    *方法注释信息
    *JX_TEACHING_MANUALS,实习生带教手册记录表,插入信息
      */
    public void insertJxTeachingManuals(HttpServletRequest request, HttpServletResponse response, JxTeachingManualsEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            out = response.getWriter();
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) ;	
            String Info = request.getParameter("Info") ;
            Info = URLDecoder.decode(Info, "utf-8"); 
            entity = JsonUtil.json2Object(Info, JxTeachingManualsEntity.class);
            entity.setOpemid(bindinfo.getYitongCard());
            entity.setOpemname(bindinfo.getXm());
            entity.setOpemdate(date);
            result = jxTeachingManualsService.insertJxTeachingManuals(entity);
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
    *方法注释信息
    *JX_TEACHING_MANUALS,实习生带教手册记录表,修改
      */
    public void updateJxTeachingManuals(HttpServletRequest request, HttpServletResponse response, JxTeachingManualsEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            out = response.getWriter();
        	String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) ;	
            String Info = request.getParameter("Info") ;
            Info = URLDecoder.decode(Info, "utf-8"); 
            entity = JsonUtil.json2Object(Info, JxTeachingManualsEntity.class);
            entity.setUptime(date);
            entity.setZttime(entity.getZttime().substring(0,10));
            result = jxTeachingManualsService.updateJxTeachingManualsByPrimaryKeySelective(entity);
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
    *方法注释信息
    *JX_TEACHING_MANUALS,实习生带教手册记录表,删除
      */
    public void deleteJxTeachingManuals(HttpServletRequest request, HttpServletResponse response, JxTeachingManualsEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            out = response.getWriter();
        	String xh = request.getParameter("xh");
            result = jxTeachingManualsService.deleteJxTeachingManualsByPrimaryKey(xh);
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
     * 跳转至我的登记页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toMyManualsRegister(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view=null;
        try {
        	String yiyuan = "28000002";
        	String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        	List<FrmDepartmentEntity> deptList = frmDepartmentService.getListAlldeptBySqlWhere(yiyuan);
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
			view = new ModelAndView("teaching_manuals/my_register_zs");
			view.addObject("bindinfo", bindinfo);
			view.addObject("deptList", deptList);
			view.addObject("time", time);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    /**
     * 跳转至我的登记页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toMinuteTeachingManualsPage(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view=null;
        try {
        	String openId = request.getParameter("openId");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId,clientsxh);
        	String xh = request.getParameter("xh");
        	String type = request.getParameter("type");
        	String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        	JxTeachingManualsEntity entity = jxTeachingManualsService.selectJxTeachingManualsByPrimaryKey(xh);
        	if(type.equals("1")){
        		view = new ModelAndView("teaching_manuals/jx_wardround");
        	}else if(type.equals("2")){
        		view = new ModelAndView("teaching_manuals/jx_practicerecord");
        	}else if(type.equals("3")){
        		view = new ModelAndView("teaching_manuals/jx_typicalCaseRecord");
        	}else if(type.equals("4")){
        		view = new ModelAndView("teaching_manuals/jx_caseDiscussion");
        	}else if(type.equals("5")){
        		view = new ModelAndView("teaching_manuals/jx_lectureNotes");
        	}
			view.addObject("entity", entity);
			view.addObject("bindinfo", bindinfo);
			view.addObject("option", "1");
			view.addObject("time", time);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    /**
    *方法注释信息
    *JX_TEACHING_MANUALS,实习生带教手册记录表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxTeachingManuals(HttpServletRequest request, HttpServletResponse response, JxTeachingManualsEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxTeachingManualsEntity entityJxTeachingManualsEntity=jxTeachingManualsService.selectJxTeachingManualsByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxTeachingManualsEntity);
        return view;
    }
    
  //获取属性配置文件中的值
    public String getPropertiesValue(String key) {
    	Properties prop = new Properties();
        try {
            String value = "";
            InputStream path =Thread.currentThread().getContextClassLoader().getResourceAsStream("imagePath.properties");
            prop.clear();
            prop.load(path);
            value = prop.getProperty(key).toString();
            return value;
        } catch (Exception e) {
            return "";
        }
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

    public void setJxTeachingManualsService(IJxTeachingManualsService jxTeachingManualsService) {
        this.jxTeachingManualsService = jxTeachingManualsService;
    }

    public IJxTeachingManualsService getJxTeachingManualsService() {
        return jxTeachingManualsService;
    }

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}

	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}
	
	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}
	
	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}
	public IJxDepartmentService getJxDepartmentService() {
		return jxDepartmentService;
	}
	public void setJxDepartmentService(IJxDepartmentService jxDepartmentService) {
		this.jxDepartmentService = jxDepartmentService;
	}
	public IJxClassStudentsService getJxClassStudentsService() {
		return jxClassStudentsService;
	}
	public void setJxClassStudentsService(
			IJxClassStudentsService jxClassStudentsService) {
		this.jxClassStudentsService = jxClassStudentsService;
	}
	public IJxLunxunService getJxLunxunService() {
		return jxLunxunService;
	}
	public void setJxLunxunService(IJxLunxunService jxLunxunService) {
		this.jxLunxunService = jxLunxunService;
	}
	public IFrmCodeService getFrmCodeService() {
		return frmCodeService;
	}
	public void setFrmCodeService(IFrmCodeService frmCodeService) {
		this.frmCodeService = frmCodeService;
	}
	public IJxTeachingManusService getJxTeachingManusService() {
		return jxTeachingManusService;
	}
	public void setJxTeachingManusService(
			IJxTeachingManusService jxTeachingManusService) {
		this.jxTeachingManusService = jxTeachingManusService;
	}
	public IJxTeachingDblService getJxTeachingDblService() {
		return jxTeachingDblService;
	}
	public void setJxTeachingDblService(IJxTeachingDblService jxTeachingDblService) {
		this.jxTeachingDblService = jxTeachingDblService;
	}
	
	
    
}