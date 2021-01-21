package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import bsh.ParseException;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxClassService;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.services.IJxStudentsInternshipProveService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.services.IWechatBindService;

/**
*类注释信息
*表名JX_LUNXUN
*表说明教学轮训
  */
public class JxLunxunAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxLunxunService jxLunxunService;
    
    private IWechatBindService wechatBindService;
    
    private IJxClassStudentsService jxClassStudentsService;
    
    private IFrmDepartmentService frmDepartmentService;
    private IJxStudentsService jxStudentsService;
    private IJxClassService  jxClassService;
    
    private IJxStudentsInternshipProveService jxStudentsInternshipProveService;

    /**
    *方法注释信息
    *分页查询表JX_LUNXUN
    *表说明教学轮训
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxLunxun(HttpServletRequest request, HttpServletResponse response, JxLunxunSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxLunxunEntity> entitylist=jxLunxunService.selectListPageJxLunxunBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxLunxun.toString(),Tools.getException(e));
        }
    }
    /**
     * 我的轮训信息
     * @param request
     * @param response
     * @param sqlWhere
     * @return
     */
    public ModelAndView getMyLunxunMsg(HttpServletRequest request, HttpServletResponse response, JxLunxunSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        ModelAndView view = null;
        try{
        	FrmDepartmentSqlWhere sqlwhere3 = new FrmDepartmentSqlWhere();
        	FrmDepartmentSqlWhere sqlwhere4 = new FrmDepartmentSqlWhere();
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date()) ;
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String xh = bindinfo.getYitongCard();
        	JxStudentsEntity ee = jxStudentsService.selectJxStudentsByPrimaryKey(xh);
        	JxClassEntity eee = jxClassService.selectJxClassByPrimaryKey(ee.getClassid());
        	JxClassStudentsSqlWhere sqlWhere1 = new JxClassStudentsSqlWhere();
        	sqlWhere1.setRemark2(xh);
        	List<JxClassStudentsEntity> lists = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(sqlWhere1);
        	if(!eee.getRemark3().equals("2")||lists.size()==0){
        		view = new ModelAndView("teaching/no_message");
        		return view;
        	}
        	String zuid = lists.size()>0?lists.get(0).getZuid():"";
        	sqlWhere.setZuid(zuid);
        	sqlWhere.setOrderByClause( "to_number(NUM)");
        	List<JxLunxunEntity> entitylist=jxLunxunService.selectListJxLunxunBySqlWhere(sqlWhere);
        	JxLunxunEntity entity = new JxLunxunEntity();
        	long todayTime = new Date().getTime();
        	String nowDate = sdf.format(new Date());
        	int nowDays=0;//已入科天数
        	int surplusDays=0;//剩余天数
        	for(JxLunxunEntity e : entitylist){
        		long startDate = sdf.parse(e.getStartdate()).getTime();
        		long endDate = sdf.parse(e.getEnddate()).getTime()+86400000;
        		if(todayTime>=startDate&&todayTime<=endDate){
        			entity = e;
        			nowDays = daysBetween(e.getStartdate().substring(0, 10),nowDate); 
        			surplusDays = daysBetween(nowDate,e.getEnddate().substring(0, 10));
        		}
        	}
        	
        	sqlwhere3.setGlbm(entity.getDeptid());
        	if(entity!=null&&entity.getNum()!=null&&!entity.getNum().equals("")&&!entity.getNum().equals(entitylist.size()+"")){
        		sqlwhere4.setGlbm(entitylist.get(Integer.parseInt(entity.getNum())).getDeptid());
        	}
        	Double nowDays1 = (double) nowDays;
        	Double surplusDays1= (double) surplusDays;
        	List<FrmDepartmentEntity> sss = frmDepartmentService.selectListFrmDepartmentBySqlWhere(sqlwhere3);
        	List<FrmDepartmentEntity> ssss = frmDepartmentService.selectListFrmDepartmentBySqlWhere(sqlwhere4);
        	view = new ModelAndView("teaching/student_lunxun"); 
        	view.addObject("entity", entity);
        	view.addObject("entitylist", entitylist);
        	view.addObject("bindinfo", bindinfo);
        	view.addObject("nowDept", sss.get(0).getBmmc());
        	view.addObject("nowDays", nowDays);
        	view.addObject("surplusDays", surplusDays);
        	String ttt = (nowDays1/(surplusDays1+nowDays1))*100+"%";
        	System.out.println(ttt);
        	view.addObject("proportion", (nowDays1/(surplusDays1+nowDays1))*100+"%");
        	if(entity.getNum().equals(entitylist.size()+"")){
        		view.addObject("nextDept", "");
        	}else{
        		view.addObject("nextDept", ssss.get(0).getBmmc());
        	}
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxLunxun.toString(),Tools.getException(e));
        }
		return view;
    }
    
    /**
     * 轮训教师维护
     * @param request
     * @param response
     * @param sqlWhere
     * @return
     */
    public ModelAndView getMyLunxunTeacher(HttpServletRequest request, HttpServletResponse response, JxLunxunSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        ModelAndView view = null;
        try{
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String stuxh = bindinfo.getYitongCard();
        	String stuname = bindinfo.getXm();
        	JxClassStudentsSqlWhere cssqlWhere = new JxClassStudentsSqlWhere();
        	cssqlWhere.setStudentid(stuxh);
        	List<JxClassStudentsEntity> cslist = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(cssqlWhere);
        	String zuid = "meiyou";
        	if(cslist.size()>0){
        		zuid = cslist.get(0).getZuid();
        	}
        	JxLunxunSqlWhere lxsqlWhere = new JxLunxunSqlWhere();
        	lxsqlWhere.setZuid(zuid);
        	List<JxLunxunEntity> lxlist = jxLunxunService.selectListJxLunxunBySqlWhere(lxsqlWhere);
        	view = new ModelAndView("teaching/lunxun_teacher_info");
        	view.addObject("stuxh", stuxh);
        	view.addObject("stuname", stuname);
        	view.addObject("lxlist", lxlist);
        	view.addObject("size", lxlist.size());
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxLunxun.toString(),Tools.getException(e));
        }
		return view;
    }
    
    public static int daysBetween(String smdate,String bdate) throws ParseException, java.text.ParseException{  
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(sdf.parse(smdate));    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(sdf.parse(bdate));    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
        return Integer.parseInt(String.valueOf(between_days));     
    } 
    public ModelAndView toCreateViewPageJxLunxun(HttpServletRequest request, HttpServletResponse response, JxLunxunEntity entity) {
        String classid = request.getParameter("classid");
        String zuid = request.getParameter("zuid");
        JxLunxunSqlWhere sqlWhere = new JxLunxunSqlWhere();
        sqlWhere.setClassid(classid);
        sqlWhere.setZuid(zuid);
        sqlWhere.setOrderByClause("NUM");
        List<JxLunxunEntity> list = jxLunxunService.selectListJxLunxunBySqlWhere(sqlWhere);
        ModelAndView view=new ModelAndView("teaching/jx_traininginroation_view");
        view.addObject("list", list);
        return view;
    }
    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxLunxunEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxLunxun(request,response,entity);
        }else if(option.equals("edit")){
            updateJxLunxun(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxLunxun(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *JX_LUNXUN,教学轮训表,插入信息
      */
    public void insertJxLunxun(HttpServletRequest request, HttpServletResponse response, JxLunxunEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxLunxunService.insertJxLunxun(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxLunxun, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxLunxun.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_LUNXUN,教学轮训表,修改
      */
    public void updateJxLunxun(HttpServletRequest request, HttpServletResponse response, JxLunxunEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxLunxunService.updateJxLunxunByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxLunxun, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxLunxun.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_LUNXUN,教学轮训表,删除
      */
    public void deleteJxLunxun(HttpServletRequest request, HttpServletResponse response, JxLunxunEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxLunxunService.deleteJxLunxunByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxLunxun, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxLunxun.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_LUNXUN,教学轮训表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxLunxun(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }
    /**
     * 教学评价页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toEvaluatePage(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        FrmDepartmentSqlWhere sqlWhere = new FrmDepartmentSqlWhere();
        List<FrmDepartmentEntity> depts = frmDepartmentService.selectListFrmDepartmentBySqlWhere(sqlWhere);
        ModelAndView view=new ModelAndView("teaching/student_view");
        view.addObject("option", "add");
        return view;
    }
    /**
    *方法注释信息
    *JX_LUNXUN,教学轮训表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxLunxun(HttpServletRequest request, HttpServletResponse response, JxLunxunEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxLunxunEntity entityJxLunxunEntity=jxLunxunService.selectJxLunxunByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxLunxunEntity);
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

    public void setJxLunxunService(IJxLunxunService jxLunxunService) {
        this.jxLunxunService = jxLunxunService;
    }

    public IJxLunxunService getJxLunxunService() {
        return jxLunxunService;
    }
	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}
	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
	public IJxClassStudentsService getJxClassStudentsService() {
		return jxClassStudentsService;
	}
	public void setJxClassStudentsService(
			IJxClassStudentsService jxClassStudentsService) {
		this.jxClassStudentsService = jxClassStudentsService;
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
	public IJxClassService getJxClassService() {
		return jxClassService;
	}
	public void setJxClassService(IJxClassService jxClassService) {
		this.jxClassService = jxClassService;
	}
	public IJxStudentsInternshipProveService getJxStudentsInternshipProveService() {
		return jxStudentsInternshipProveService;
	}
	public void setJxStudentsInternshipProveService(
			IJxStudentsInternshipProveService jxStudentsInternshipProveService) {
		this.jxStudentsInternshipProveService = jxStudentsInternshipProveService;
	}
	
    
    
}