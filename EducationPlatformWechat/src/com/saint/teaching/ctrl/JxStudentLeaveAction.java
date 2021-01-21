package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jxl.JXLException;

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
import com.saint.systemManager.bean.FrmSysparaTypeEntity;
import com.saint.systemManager.bean.FrmSysparaTypeKey;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmSysparaTypeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.bean.JxStudentLeaveCheckEntity;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveKey;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.services.IJxStudentLeaveCheckService;
import com.saint.teaching.services.IJxStudentLeaveService;
import com.saint.teaching.services.IJxStudentsInternshipProveService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentLeaveCheckSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.WechatSysparamEntity;
import com.saint.wechat.manager.bean.WechatSysparamKey;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IWechatSysparamService;
import com.saint.wechat.manager.sqlWhere.WechatBindSqlWhere;

/**
*类注释信息
*表名JX_STUDENTS_LEAVE
*表说明学生请假
*/
public class JxStudentLeaveAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentLeaveService jxStudentLeaveService;
    
    private IJxStudentLeaveCheckService jxStudentLeaveCheckService;
    
    private IWechatBindService wechatBindService;
    
    private IJxStudentsService jxStudentsService;
    
    private IJxLunxunService jxLunxunService;
    
    private IWechatSysparamService wechatSysparamService;
    
    private IJxClassStudentsService jxClassStudentsService;

    private IFrmSysparaTypeService frmSysparaTypeService;
    
    private IJxStudentsInternshipProveService jxStudentsInternshipProveService;
    
    private IFrmCodeService frmCodeService;
    
    public static String clientsxh="6201001002";
    /**
    *方法注释信息
    *分页查询表JX_STUDENTS_LEAVE
    *表说明学生请假
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudentLeave(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxStudentLeaveEntity> entitylist=jxStudentLeaveService.selectListPageJxStudentLeaveBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentLeave.toString(),Tools.getException(e));
        }
    }
    /**
     * 获取到学生请假列表（ywq）
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void getListJxStudentLeave(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	String stuname = request.getParameter("stuname");
        	String state = request.getParameter("state");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String usernumber = bindinfo.getYitongCard();
        	sqlWhere.setRemark1(usernumber);
        	sqlWhere.setState(state);
        	sqlWhere.setStuname(stuname);
        	//sqlWhere.setOrderByClause("LEAVEDATESTART");
            List<JxStudentLeaveEntity> entitylist=jxStudentLeaveService.selectListJxStudentLeaveBySqlWhere(sqlWhere);
            out=response.getWriter();
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentLeave.toString(),Tools.getException(e));
        }
    }
    /**
     * 跳转到请假提交页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView ToStuLeavePage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	JxStudentsEntity students = jxStudentsService.selectJxStudentsByPrimaryKey(bindinfo.getYitongCard());
        	if(students.getPertype().equals("2")||students.getPertype().equals("5")){
        		WechatBindEntity entity = getClassTeacherId(bindinfo.getYitongCard());
	        	int seq = jxStudentLeaveService.selectXhJxStudentLeaveBySql();
	        	String xh = String.valueOf(seq);
	        	view = new ModelAndView("teaching/student_leave");
	        	view.addObject("bindinfo", bindinfo);
	        	view.addObject("time", gxsj);
	        	view.addObject("xh", xh);
	        	view.addObject("teacheropenid", entity.getOpenId());
	        	view.addObject("teacherid", entity.getYitongCard());
	        	view.addObject("teachername", entity.getXm());
	        	view.addObject("deptid", entity.getDeptId());
	        	view.addObject("deptname", entity.getRemark1());
        	}else{
        		view = new ModelAndView("teaching/common_notcanpage");
        	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
     * 跳转的我的请假信息页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toMineLeavePage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String xh = request.getParameter("xh");
    		String sptype = request.getParameter("sptype");
    		String openId = request.getParameter("openId");
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        	JxStudentLeaveEntity entity = jxStudentLeaveService.selectJxStudentLeaveByPrimaryKey(xh);
        	String stuid = entity.getStuid();
        	JxStudentsEntity stuentity = jxStudentsService.selectJxStudentsByPrimaryKey(stuid);
        	if(entity.getState().equals("2-1")||entity.getState().equals("2-2")){
        		sptype = "3";
        	}
        	long statedate = getMillils(entity.getLeavedatestart());
        	long enddate = getMillils(entity.getLeavedateend());
        	String sc = formatDuring(enddate-statedate);
        	long sjch = enddate-statedate;
        	String shjz = "";
        	if(sjch<86400000*3){
        		shjz = "1";
        	}else{
        		shjz = "2";
        	}
        	view = new ModelAndView("teaching/mine_leave_xx");
        	JxStudentLeaveCheckSqlWhere sqlWhere = new JxStudentLeaveCheckSqlWhere();
        	sqlWhere.setStulevid(xh);
        	sqlWhere.setCheckorder("1");
        	List<JxStudentLeaveCheckEntity> ksch = jxStudentLeaveCheckService.selectListJxStudentLeaveCheckBySqlWhere(sqlWhere);
        	String ksshyj = ksch.size()>0?ksch.get(0).getExplanation():"";
        	sqlWhere.setCheckorder("2");
        	List<JxStudentLeaveCheckEntity> kjkch = jxStudentLeaveCheckService.selectListJxStudentLeaveCheckBySqlWhere(sqlWhere);
        	String kjkshyj = kjkch.size()>0?kjkch.get(0).getExplanation():"";
        	sqlWhere.setCheckorder("3");
        	List<JxStudentLeaveCheckEntity> schch = jxStudentLeaveCheckService.selectListJxStudentLeaveCheckBySqlWhere(sqlWhere);
        	String schshyj = schch.size()>0?schch.get(0).getExplanation():"";
        	view.addObject("entity", entity);
        	view.addObject("time", gxsj);
        	view.addObject("sptype", sptype);
        	view.addObject("openId", openId);
        	view.addObject("sc", sc);
        	view.addObject("ksshyj", ksshyj);
        	view.addObject("kjkshyj", kjkshyj);
        	view.addObject("schshyj", schshyj);
        	view.addObject("shjz", shjz);
        	view.addObject("stuentity", stuentity);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    /**
     * 跳转的我的审批信息页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toLeavespInfoPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String teachtype = bindinfo.getLanguage();
        	if(teachtype.indexOf("21")!=-1){
        		view = new ModelAndView("teaching/mine_leavesp_zs");
        	}else{
        		view=new ModelAndView("teaching/common_notcanpage");
        	}
        	view.addObject("clientsxh", clientsxh);
        	view.addObject("openid", openid);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    public long getMillils(String time){
    	long millils = 0;
    	try {
             Calendar c = Calendar.getInstance();
             c.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time));
             millils = c.getTimeInMillis();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return millils;
    }
    
    public static String formatDuring(long mss) {  
	    long days = mss / (1000 * 60 * 60 * 24);  
	    long hours = (mss % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);  
	    long minutes = (mss % (1000 * 60 * 60)) / (1000 * 60);  
	    //long seconds = (mss % (1000 * 60)) / 1000;  
	    String s = "";
	    if(days==0){
	    	s = hours + "小时" + minutes + "分钟";
	    }else{
	    	s = days + "天" + hours + "小时" + minutes + "分钟" ;
	    }
	    return s ;
	}

    /**
     * 跳转到我的请假信息列表页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView MineLeaveInfoPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	JxStudentLeaveSqlWhere sqlWhere = new JxStudentLeaveSqlWhere();
        	sqlWhere.setStuid(bindinfo.getYitongCard());
        	List<JxStudentLeaveEntity> list = jxStudentLeaveService.selectListJxStudentLeaveBySqlWhere(sqlWhere);
        	view = new ModelAndView("teaching/mine_leave_zs");
        	view.addObject("list", list);
        	view.addObject("size", list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    /**
    *方法注释信息
    *JX_STUDENTS_LEAVE,学生请假表,插入信息
      */
    public void insertJxStudentLeave(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            FrmSysparaTypeKey tkey = new FrmSysparaTypeKey();
    		tkey.setXtlb("00");
    		tkey.setGjz("qjsqmid");
    		FrmSysparaTypeEntity tentity = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(tkey);
    		String template_id = tentity.getMrz();
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String teacherid = request.getParameter("teacherid");
            String taskinfo = request.getParameter("taskinfo");
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxStudentLeaveEntity.class);
        	entity.setState("0");
        	tkey.setGjz("deptleaveid");
    		FrmSysparaTypeEntity tentityt = frmSysparaTypeService.selectFrmSysparaTypeByPrimaryKey(tkey);
    		String dltype = tentityt.getMrz();
    		String openId = "";
    		String usernumber = "";
    		if(dltype.equals("0")){
    			openId = tentityt.getCsmc();
    			usernumber = tentityt.getCssm();
    		}else{
    			WechatBindSqlWhere wbsql = new WechatBindSqlWhere();
    			wbsql.setYitongCard(teacherid);
    			List<WechatBindEntity> wblist = wechatBindService.selectListWechatBindBySqlWhere(wbsql);
    			String opid = "";
    			if(wblist.size()>0){
    				opid = wblist.get(0).getOpenId();
    			}
            	openId = opid;
            	usernumber = teacherid;
    		}
    		if(openId==""||openId==null){
    			resultMap.put("errorMsg", "openidept");
    		}else{
    			entity.setRemark1(usernumber);
    			WechatSysparamKey key = new WechatSysparamKey();
    			key.setGjz("RES_PATH");
    			key.setClientsxh(clientsxh);
    			WechatSysparamEntity sys = wechatSysparamService.selectWechatSysparamByPrimaryKey(key);
    			String url = sys.getDmz()+"/jxstuleave.do?method=toMineLeavePage&xh="+entity.getXh()+"&sptype=1&openId="+openId;
    			result = jxStudentLeaveService.insertJxStudentLeave(entity);
    			if(result.getReturnCode().equals("1")){
    				resultMap.put("errorMsg", "success");
    				JxCommonAction.WechatTemplateSend("1",openId,url,entity.getStuname(),time,entity.getCause(),template_id);
    			}else{
    				resultMap.put("errorMsg", "failed");
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
     * 根据学生的ID找到当前
     * @param stuId
     * @return
     */
    public WechatBindEntity getClassTeacherId (String stuId){
    	String openId = "";
    	WechatBindEntity entity = new WechatBindEntity();
    	try {
    		JxClassStudentsSqlWhere cssqlWhere = new JxClassStudentsSqlWhere();
    		cssqlWhere.setRemark2(stuId);
			List<JxClassStudentsEntity> cslist = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(cssqlWhere);
			String zuid = "";
			if(cslist.size()>0){
				zuid = cslist.get(0).getZuid();
			}
			JxLunxunSqlWhere lxsqlWhere = new JxLunxunSqlWhere();
			lxsqlWhere.setZuid(zuid);
			List<JxLunxunEntity> lxlist = jxLunxunService.selectListJxLunxunBySqlWhereandDate(lxsqlWhere);
			String deptid =  lxlist.size()>0?lxlist.get(0).getDeptid():"";
			String deptname =  lxlist.size()>0?lxlist.get(0).getRemark1():"";
			JxStudentsInternshipProveKey intkey = new JxStudentsInternshipProveKey();
			intkey.setStudentsid(stuId);
			intkey.setDepid(deptid);
			JxStudentsInternshipProveEntity intentity = jxStudentsInternshipProveService.selectJxStudentsInternshipProveByPrimaryKey(intkey);
			String userid = intentity.getZmrid();
			String username = intentity.getZmr();
			WechatBindSqlWhere sqlWhere = new WechatBindSqlWhere();
			sqlWhere.setYitongCard(userid);
			sqlWhere.setClientsxh(clientsxh);
			List<WechatBindEntity> list = wechatBindService.selectListWechatBindBySqlWhere(sqlWhere);
			if(list.size()>0){
				openId = list.get(0).getOpenId();
			}
			entity.setOpenId(openId);
			entity.setYitongCard(userid);
			entity.setXm(username);
			entity.setDeptId(deptid);
			entity.setRemark1(deptname);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return entity;
    }
    /**
    *方法注释信息
    *JX_STUDENTS_LEAVE,学生请假表,修改
      */
    public void updateJxStudentLeave(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveEntity entity) {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String xh = request.getParameter("xh");
            String state = request.getParameter("state");
            entity.setState(state);
            entity.setXh(xh);
        	result = jxStudentLeaveService.updateJxStudentLeaveByPrimaryKeySelective(entity);
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
    *JX_STUDENTS_LEAVE,学生请假表,删除
      */
    public void deleteJxStudentLeave(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentLeaveService.deleteJxStudentLeaveByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxStudentLeave, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxStudentLeave.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_STUDENTS_LEAVE,学生请假表
    *跳转到新增页面
      */
    public ModelAndView openAgreement(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("teaching/students_leavexy");
        return view;
    }

    /**
    *方法注释信息
    *JX_STUDENTS_LEAVE,学生请假表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxStudentLeave(HttpServletRequest request, HttpServletResponse response, JxStudentLeaveEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxStudentLeaveEntity entityJxStudentLeaveEntity=jxStudentLeaveService.selectJxStudentLeaveByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxStudentLeaveEntity);
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

    public void setJxStudentLeaveService(IJxStudentLeaveService jxStudentLeaveService) {
        this.jxStudentLeaveService = jxStudentLeaveService;
    }

    public IJxStudentLeaveService getJxStudentLeaveService() {
        return jxStudentLeaveService;
    }

	public IJxStudentLeaveCheckService getJxStudentLeaveCheckService() {
		return jxStudentLeaveCheckService;
	}

	public void setJxStudentLeaveCheckService(
			IJxStudentLeaveCheckService jxStudentLeaveCheckService) {
		this.jxStudentLeaveCheckService = jxStudentLeaveCheckService;
	}

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}

	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}

	public IJxLunxunService getJxLunxunService() {
		return jxLunxunService;
	}

	public void setJxLunxunService(IJxLunxunService jxLunxunService) {
		this.jxLunxunService = jxLunxunService;
	}

	public IWechatSysparamService getWechatSysparamService() {
		return wechatSysparamService;
	}

	public void setWechatSysparamService(
			IWechatSysparamService wechatSysparamService) {
		this.wechatSysparamService = wechatSysparamService;
	}
	public IJxClassStudentsService getJxClassStudentsService() {
		return jxClassStudentsService;
	}
	public void setJxClassStudentsService(
			IJxClassStudentsService jxClassStudentsService) {
		this.jxClassStudentsService = jxClassStudentsService;
	}
	public IFrmSysparaTypeService getFrmSysparaTypeService() {
		return frmSysparaTypeService;
	}
	public void setFrmSysparaTypeService(
			IFrmSysparaTypeService frmSysparaTypeService) {
		this.frmSysparaTypeService = frmSysparaTypeService;
	}
	public IJxStudentsInternshipProveService getJxStudentsInternshipProveService() {
		return jxStudentsInternshipProveService;
	}
	public void setJxStudentsInternshipProveService(
			IJxStudentsInternshipProveService jxStudentsInternshipProveService) {
		this.jxStudentsInternshipProveService = jxStudentsInternshipProveService;
	}
	public IFrmCodeService getFrmCodeService() {
		return frmCodeService;
	}
	public void setFrmCodeService(IFrmCodeService frmCodeService) {
		this.frmCodeService = frmCodeService;
	}
    
    
}