package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmDepartmentSqlWhere;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.bean.JxDepartmentEntity;
import com.saint.teaching.bean.JxEvaluateTeacherEntity;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.bean.JxStencilEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.services.IJxDepartmentService;
import com.saint.teaching.services.IJxEvaluateTeacherService;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.services.IJxStencilService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxEvaluateTeacherSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.teaching.sqlWhere.JxStencilSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfEmployeeService;

/**
*类注释信息
*表名JX_EVALUATE_TEACHER
*表说明教师评价表
  */
public class JxEvaluateTeacherAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxEvaluateTeacherService jxEvaluateTeacherService;
    
    private IJxDepartmentService  jxDepartmentService;
    
    private IWechatBindService wechatBindService;
    
    private IJxClassStudentsService jxClassStudentsService;
    
    private IFrmDepartmentService frmDepartmentService;
    
    private IJxLunxunService jxLunxunService;
    
    private IXfEmployeeService xfEmployeeService;
    
    private IJxStudentsService jxStudentsService;
    
    private IJxStencilService jxStencilService;
    
    

    /**
    *方法注释信息
    *分页查询表JX_EVALUATE_TEACHER
    *表说明教师评价表
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxEvaluateTeacher(HttpServletRequest request, HttpServletResponse response, JxEvaluateTeacherSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxEvaluateTeacherEntity> entitylist=jxEvaluateTeacherService.selectListPageJxEvaluateTeacherBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxEvaluateTeacher.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxEvaluateTeacherEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxEvaluateTeacher(request,response,entity);
        }else if(option.equals("edit")){
            updateJxEvaluateTeacher(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxEvaluateTeacher(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *JX_EVALUATE_TEACHER,教师评价表表,插入信息
      */
    public void insertJxEvaluateTeacher(HttpServletRequest request, HttpServletResponse response, JxEvaluateTeacherEntity entity) {
    	response.setContentType("text/html; charset=gbk");
    	PrintWriter out = null;
        ExcuteResult result;
        String openid = "";
        String clientsxh = "";
        Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String taskinfo = request.getParameter("taskinfo");
            String[] allAnswer = request.getParameterValues("allAnswer[]");
            System.out.println(allAnswer.length);
            openid = request.getParameter("openid");
            clientsxh = request.getParameter("clientsxh");
            WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String xh = bindinfo.getYitongCard();
        	JxStudentsEntity ee = jxStudentsService.selectJxStudentsByPrimaryKey(xh);
        	JxClassStudentsSqlWhere sqlWhere1 = new JxClassStudentsSqlWhere();
        	sqlWhere1.setRemark2(xh);
        	List<JxClassStudentsEntity> lists = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(sqlWhere1);
        	taskinfo = URLDecoder.decode(taskinfo, "utf-8");
            String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        	
            
            //************************获取题库题目，插入对应的答案*******************************
            JxStencilSqlWhere sqlWhere = new JxStencilSqlWhere();
            sqlWhere.setRemark4("1");//兰州市第二人民医院
            sqlWhere.setType("1");//评价教师
            sqlWhere.setIsusing("1");//是否启用
            sqlWhere.setOrderByClause("remark3");
            List<JxStencilEntity> entitylist=jxStencilService.selectListJxStencilBySqlWhere(sqlWhere);
            //*******************************************************************************
            for(int i = 0 ; i<entitylist.size();i++){
            	entity = JsonUtil.json2Object(taskinfo, JxEvaluateTeacherEntity.class);
            	entity.setXh(getNewId());
            	entity.setQuestion1(allAnswer[i]);
            	entity.setQuestion2(entitylist.get(i).getXh());
            	entity.setQuestion3(entitylist.get(i).getRemark2());//问题的类型
            	entity.setOperatedate(gxsj);
            	entity.setStudentid(ee.getXh());
            	entity.setStudentname(ee.getName());
            	entity.setRemark1(lists.get(0).getClassid());
            	entity.setRemark2(lists.get(0).getZuid());
            	result = jxEvaluateTeacherService.insertJxEvaluateTeacher(entity);
            	if(result.getReturnCode().equals("1")){
    				resultMap.put("errorMsg", "success");
    			}else{
    				resultMap.put("errorMsg", "failed");
    				return;
    			}
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
        	System.out.println(json);
        	out.write(json);
            if(out!=null)out.close();
        }
    }
    public String getNewId(){
    	String id = jxStudentsService.selectListJxStudentsBySql("select JX_STUDENTS_SEQ.nextval from dual").get(0).get("NEXTVAL").toString();
		int s = Integer.valueOf(id);
		if(s<10){
			id="0000"+s;
		}else if(s<100){
			id="000"+s;
		}else if(s<1000){
			id="00"+s;
		}else if(s<10000){
			id="0"+s;
		}else{
			id=""+s;
		}
		return id;
    }
    /**
    *方法注释信息
    *JX_EVALUATE_TEACHER,教师评价表表,修改
      */
    public void updateJxEvaluateTeacher(HttpServletRequest request, HttpServletResponse response, JxEvaluateTeacherEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxEvaluateTeacherService.updateJxEvaluateTeacherByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxEvaluateTeacher, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxEvaluateTeacher.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_EVALUATE_TEACHER,教师评价表表,删除
      */
    public void deleteJxEvaluateTeacher(HttpServletRequest request, HttpServletResponse response, JxEvaluateTeacherEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxEvaluateTeacherService.deleteJxEvaluateTeacherByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxEvaluateTeacher, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxEvaluateTeacher.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    
    public ModelAndView toEvaluatePage(HttpServletRequest request, HttpServletResponse response, JxLunxunSqlWhere sqlWhere) throws ParseException {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view = null;
        String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	long today = new Date().getTime();
    	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
    	String xh = bindinfo.getYitongCard();
    	JxClassStudentsSqlWhere sqlWhere1 = new JxClassStudentsSqlWhere();
    	sqlWhere1.setRemark2(xh);
    	List<JxClassStudentsEntity> lists = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(sqlWhere1);
    	if(lists.size()==0){
    		view = new ModelAndView("teaching/no_message");
    		return view;
    	}
    	sqlWhere.setZuid(lists.get(0).getZuid());
    	sqlWhere.setOrderByClause("NUM");
    	List<JxLunxunEntity> entitylist=jxLunxunService.selectListJxLunxunBySqlWhere(sqlWhere);
    	JxEvaluateTeacherSqlWhere sqlWhere2 = new JxEvaluateTeacherSqlWhere();
    	for(JxLunxunEntity e:entitylist){
    		sqlWhere2.setStudentid(xh);
    		sqlWhere2.setDepid(e.getDeptid());
    		List<JxEvaluateTeacherEntity> sss = jxEvaluateTeacherService.selectListJxEvaluateTeacherBySqlWhere(sqlWhere2);
    		long endTime = new SimpleDateFormat("yyyy-MM-dd").parse(e.getEnddate()).getTime();
    		if(sss.size()!=0){
    			e.setRemark6("1");//已评价
    		}else if(sss.size()==0&&endTime<today){
    			e.setRemark6("2");//未评价
    			break;
    		}
    	}
        view=new ModelAndView("teaching/teacher_list");
        view.addObject("list",entitylist);
        view.addObject("option", "add");
        view.addObject("clientsxh", clientsxh);
        view.addObject("openid", openid);
        return view;
    }
    public ModelAndView toEvaluatePage2(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
        String xh = request.getParameter("xh");
        JxStencilSqlWhere sqlWhere = new JxStencilSqlWhere();
        sqlWhere.setRemark4("1");//兰州市第二人民医院
        sqlWhere.setType("1");//评价教师
        sqlWhere.setIsusing("1");//是否启用
        sqlWhere.setOrderByClause("remark3");
        List<JxStencilEntity> entitylist=jxStencilService.selectListJxStencilBySqlWhere(sqlWhere);
        ModelAndView view=new ModelAndView("teaching/student_view");
        JxLunxunEntity entity = jxLunxunService.selectJxLunxunByPrimaryKey(xh);
        String teacherid = entity.getTeacherid();
        XfEmployeeEntity e = xfEmployeeService.selectXfEmployeeByPrimaryKey(teacherid);
        view.addObject("option", "add");
        if(e==null){
        	view.addObject("error","noTeacher");
        }else{
        	view.addObject("sex",e.getSex());
        }
        List<JxStencilEntity> radioList = new ArrayList<JxStencilEntity>();
        List<JxStencilEntity> checkboxList = new ArrayList<JxStencilEntity>();
        List<JxStencilEntity> questionList = new ArrayList<JxStencilEntity>();
        for(JxStencilEntity ee :entitylist){
        	if(ee.getRemark2().equals("1")){
        		radioList.add(ee);
        	}else if(ee.getRemark2().equals("2")){
        		checkboxList.add(ee);
        	}else if(ee.getRemark2().equals("3")){
        		questionList.add(ee);
        	}
        }
        view.addObject("entity",entity);
        view.addObject("clientsxh", clientsxh);
        view.addObject("openid", openid);
        view.addObject("entitylist", entitylist);
        view.addObject("radioList", radioList);
        view.addObject("checkboxList", checkboxList);
        view.addObject("questionList", questionList);
        return view;
    }
    public ModelAndView toEvaluateViewPage(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        JxEvaluateTeacherSqlWhere sqlWhere = new JxEvaluateTeacherSqlWhere();
        String openid = request.getParameter("openid");
    	String clientsxh = request.getParameter("clientsxh");
    	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
    	String teacherid = bindinfo.getYitongCard();
    	String studentid = request.getParameter("xh");
        ModelAndView view=new ModelAndView("teaching/student_view_edit");
        sqlWhere.setStudentid(studentid);
        sqlWhere.setTeacherid(teacherid);
        sqlWhere.setOrderByClause("QUESTION2");
        List<JxEvaluateTeacherEntity> entityList = jxEvaluateTeacherService.selectListJxEvaluateTeacherBySqlWhere(sqlWhere);
        
        JxStencilSqlWhere sqlWhere2 = new JxStencilSqlWhere();
        sqlWhere2.setRemark4("1");//兰州市第二人民医院
        sqlWhere2.setType("1");//评价教师
        sqlWhere2.setIsusing("1");//是否启用
        sqlWhere2.setOrderByClause("remark3");
        List<JxStencilEntity> entitylist=jxStencilService.selectListJxStencilBySqlWhere(sqlWhere2);
        List<JxStencilEntity> radioList = new ArrayList<JxStencilEntity>();
        List<JxStencilEntity> checkboxList = new ArrayList<JxStencilEntity>();
        List<JxStencilEntity> questionList = new ArrayList<JxStencilEntity>();
        for(JxStencilEntity ee :entitylist){
        	if(ee.getRemark2().equals("1")){
        		radioList.add(ee);
        	}else if(ee.getRemark2().equals("2")){
        		checkboxList.add(ee);
        	}else if(ee.getRemark2().equals("3")){
        		questionList.add(ee);
        	}
        }
        List<JxEvaluateTeacherEntity> radiovalue = new ArrayList<JxEvaluateTeacherEntity>();
        List<JxEvaluateTeacherEntity> checkboxvalue = new ArrayList<JxEvaluateTeacherEntity>();
        List<JxEvaluateTeacherEntity> questionvalue = new ArrayList<JxEvaluateTeacherEntity>();
        for(JxEvaluateTeacherEntity ee :entityList){
        	if(ee.getQuestion3().equals("1")){
        		radiovalue.add(ee);
        	}else if(ee.getQuestion3().equals("2")){
        		checkboxvalue.add(ee);
        	}else if(ee.getQuestion3().equals("3")){
        		questionvalue.add(ee);
        	}
        }
        view.addObject("radioList", radioList);
        view.addObject("checkboxList", checkboxList);
        view.addObject("questionList", questionList);
        
        view.addObject("radiovalue", radiovalue);
        view.addObject("checkboxvalue", checkboxvalue);
        view.addObject("questionvalue", questionvalue);
        
        view.addObject("entitylist",entityList);
        view.addObject("clientsxh", clientsxh);
        view.addObject("openid", openid);
        view.addObject("option","view");
        return view;
    }
    public void viewList(HttpServletRequest request, HttpServletResponse response,JxEvaluateTeacherSqlWhere sqlWhere) {
        PrintWriter out = null;
        Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String xh = request.getParameter("xh");
            String name = request.getParameter("name");
            name = URLDecoder.decode(name, "utf-8");
            String classid = request.getParameter("classid");
            String zuid = request.getParameter("zuid");
            sqlWhere.setTeacherid(xh);
            if(name!=null&&!"".equals(name)&&!"null".equals(name)){
            	sqlWhere.setStudentname(name);
            }
            if(classid!=null&&!"".equals(classid)&&!"null".equals(classid)){
            	sqlWhere.setRemark1(classid);
            }
            if(zuid!=null&&!"".equals(zuid)&&!"null".equals(zuid)){
            	sqlWhere.setRemark2(zuid);
            }
            List<JxEvaluateTeacherEntity> entitylist=jxEvaluateTeacherService.selectListJxEvaluateTeacherBySqlWhere(sqlWhere);
            List<JxEvaluateTeacherEntity> entitylists = new ArrayList<JxEvaluateTeacherEntity>();
            Set<String> set=new HashSet<String>();
            for (JxEvaluateTeacherEntity user : entitylist) {
                if (user == null) {
                    continue;
                }
                String  studentid = user.getStudentid();
                if (studentid != null) {
                    if (!set.contains(studentid)) { //set中不包含重复的
                    	set.add(studentid);
                    	entitylists.add(user);
                        } else {
                            continue;
                        }
                    }   
        }


         set.clear();
            
            resultMap.put("entitylist", entitylists);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
        	System.out.println(json);
        	out.write(json);
            if(out!=null)out.close();
        }
    }
    
    public ModelAndView toMyViewPage(HttpServletRequest request, HttpServletResponse response,JxEvaluateTeacherSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view = null;
        try {
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String teachtype = bindinfo.getLanguage();
        	if(teachtype.indexOf("21")!=-1){
        		view=new ModelAndView("teaching/student_view_list");
        	}else{
        		view=new ModelAndView("teaching/common_notcanpage");
        	}
        	String xh = bindinfo.getYitongCard();
            view.addObject("clientsxh", clientsxh);
            view.addObject("openid", openid);
            view.addObject("xh", xh);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    /**
    *方法注释信息
    *JX_EVALUATE_TEACHER,教师评价表表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxEvaluateTeacher(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *方法注释信息
    *JX_EVALUATE_TEACHER,教师评价表表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxEvaluateTeacher(HttpServletRequest request, HttpServletResponse response, JxEvaluateTeacherEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxEvaluateTeacherEntity entityJxEvaluateTeacherEntity=jxEvaluateTeacherService.selectJxEvaluateTeacherByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxEvaluateTeacherEntity);
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

    public void setJxEvaluateTeacherService(IJxEvaluateTeacherService jxEvaluateTeacherService) {
        this.jxEvaluateTeacherService = jxEvaluateTeacherService;
    }

    public IJxEvaluateTeacherService getJxEvaluateTeacherService() {
        return jxEvaluateTeacherService;
    }

	public IJxDepartmentService getJxDepartmentService() {
		return jxDepartmentService;
	}

	public void setJxDepartmentService(IJxDepartmentService jxDepartmentService) {
		this.jxDepartmentService = jxDepartmentService;
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

	public IJxLunxunService getJxLunxunService() {
		return jxLunxunService;
	}

	public void setJxLunxunService(IJxLunxunService jxLunxunService) {
		this.jxLunxunService = jxLunxunService;
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

	public IJxStencilService getJxStencilService() {
		return jxStencilService;
	}

	public void setJxStencilService(IJxStencilService jxStencilService) {
		this.jxStencilService = jxStencilService;
	}
    
	
    
}