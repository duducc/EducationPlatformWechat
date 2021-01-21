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
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.pub.util.json.JsonUtil;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxStudentsGradeEntity;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.services.IJxStudentsGradeService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxStudentsGradeSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxStudyRegistrationSqlWhere;
/**
*类注释信息
*表名JX_STUDENTS_GRADE
*表说明学员分数明细
  */
public class JxStudentsGradeAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentsGradeService jxStudentsGradeService;
    private IJxStudentsService jxStudentsService;
    
   /**
    *方法注释信息
    *分页查询表JX_STUDENTS_GRADE
    *表说明学员分数明细
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudentsGrade(HttpServletRequest request, HttpServletResponse response, JxStudentsGradeSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
            String studentname = request.getParameter("studentname");
            String emplx = request.getParameter("emplx");
            String sybj = request.getParameter("sybj");
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            sqlWhere.setStudentname(studentname);
            sqlWhere.setEmplx(emplx);
            sqlWhere.setSybj(sybj);
            sqlWhere.setOrderByClause("jjfsj DESC");
            List<JxStudentsGradeEntity> entitylist=jxStudentsGradeService.selectListPageJxStudentsGradeBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("code", 0);//rows键 存放每页记录 list
            jsonMap.put("msg", "");//rows键 存放每页记录 list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("data", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsGrade.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxStudentsGradeEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxStudentsGrade(request,response,entity);
        }else if(option.equals("edit")){
            updateJxStudentsGrade(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxStudentsGrade(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *JX_STUDENTS_GRADE,学员分数明细表,插入信息
      */
    public void insertJxStudentsGrade(HttpServletRequest request, HttpServletResponse response, JxStudentsGradeEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentsGradeService.insertJxStudentsGrade(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.主键()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxStudentsGrade, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxStudentsGrade.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_STUDENTS_GRADE,学员分数明细表,修改
      */
    public void updateJxStudentsGrade(HttpServletRequest request, HttpServletResponse response, JxStudentsGradeEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentsGradeService.updateJxStudentsGradeByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxStudentsGrade, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxStudentsGrade.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }
    
    
    public void getListPageJxStudentsGradeMessage(HttpServletRequest request, HttpServletResponse response, JxStudentsGradeSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
            String studentname = request.getParameter("studentname");
            String xh = request.getParameter("xh");
            String sybj = request.getParameter("sybj");
            String jjfyy = request.getParameter("jjfyy");
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            sqlWhere.setStudentname(studentname);
            sqlWhere.setStudentid(xh);
            sqlWhere.setSybj(sybj);
            sqlWhere.setRemark1(jjfyy);
            sqlWhere.setOrderByClause("jjfsj DESC");
            List<JxStudentsGradeEntity> entitylist=jxStudentsGradeService.selectListPageJxStudentsGradeBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("code", 0);//rows键 存放每页记录 list
            jsonMap.put("msg", "");//rows键 存放每页记录 list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("data", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsGrade.toString(),Tools.getException(e));
        }
    }
    
    /**
    *方法注释信息
    *JX_STUDENTS_GRADE,学员分数明细表,删除
      */
    public void deleteJxStudentsGrade(HttpServletRequest request, HttpServletResponse response, JxStudentsGradeEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentsGradeService.deleteJxStudentsGradeByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxStudentsGrade, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxStudentsGrade.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_STUDENTS_GRADE,学员分数明细表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxStudentsGrade(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *方法注释信息
    *JX_STUDENTS_GRADE,学员分数明细表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxStudentsGrade(HttpServletRequest request, HttpServletResponse response, JxStudentsGradeEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxStudentsGradeEntity entityJxStudentsGradeEntity=jxStudentsGradeService.selectJxStudentsGradeByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxStudentsGradeEntity);
        return view;
    }


    /**
     * 跳转到新增，修改页面
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toAddOrUpdatePage(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html; charset=utf-8");
        String type = request.getParameter("type");
        String xh = request.getParameter("xh");
        ModelAndView view=new ModelAndView("jx_personrecord/student_grade_add");
        if(type != null && "0".equals(type)){
    		String index =jxStudentsGradeService.queryNextIndex();
        	JxStudentsEntity entity = jxStudentsService.selectJxStudentsByPrimaryKey(xh);
        	view.addObject("index", index);
        	view.addObject("entity", entity);
        }else if(type != null && "1".equals(type) || "2".equals(type)){
        	JxStudentsGradeEntity entity = jxStudentsGradeService.selectJxStudentsGradeByPrimaryKey(xh);
        	view.addObject("en", entity);
        	view.addObject("xh", xh);
        }
        view.addObject("type", type);
        return view;
    }
    
    /**
     * 加减分登记新增
     * @param request
     * @param response
     * @param entity
     */
    public void insertJxStudentsGradeMessage(HttpServletRequest request,HttpServletResponse response,JxStudentsGradeEntity entity){
    	response.setContentType("text/html; charset=utf-8");
     	PrintWriter pw = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap<String,Object>();
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        //UserSession userSession = (UserSession) request.getSession().getAttribute("userSession");
        try{
        	pw = response.getWriter();
        	String jjfyy = request.getParameter("jjfyy");
        	jjfyy = URLDecoder.decode(jjfyy, "utf-8"); 
        	String taskinfo = request.getParameter("taskinfo");
        	String grade = request.getParameter("grade");
        	taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
          	entity = JsonUtil.json2Object(taskinfo, JxStudentsGradeEntity.class);
        	int grades = Integer.parseInt(grade);
        	String jjfyyval = request.getParameter("jjfyyval");
        	jjfyyval = URLDecoder.decode(jjfyyval, "utf-8"); 
        	entity.setJjfyy(jjfyy);
        	entity.setGrade(grades+"");
        	entity.setJjfsj(nowTime);
        	//entity.setCrateid(userSession.getUser().getYhdh());
        	//entity.setCreatename(userSession.getUser().getXm());
        	entity.setCreatedate(nowTime);
        	entity.setRemark1(jjfyyval);
        	result=jxStudentsGradeService.insertJxStudentsGradeSelective(entity);
        	if("1".equals(result.getReturnCode())){
        		 String fs = "100";
        		 String gradesql = "select sum(grade) as FS  from JX_STUDENTS_GRADE t where studentid = '"+entity.getStudentid()+"' and sybj = 1";
         		 List<HashMap<String,Object>> fsmap = jxStudentsGradeService.selectListJxStudentsGradeBySql(gradesql);
         		if(fsmap != null && fsmap.size() > 0){
         			Map tempmap = fsmap.get(0);
         			if(tempmap != null && tempmap.get("FS") != null){
         				fs =  String.valueOf(100 + Integer.parseInt(tempmap.get("FS").toString()));
         			}
         		}
         		result = changeStudentGrade(entity.getStudentid(),fs);
         		if(Integer.parseInt(fs) <60){
         			resultMap.put("errorMsg","fsLess60");
         		}else{
         			resultMap.put("errorMsg","success");
         		}
        	}else{
        		resultMap.put("errorMsg","failed");
        	}
        }catch(Exception e){
        	e.printStackTrace();
        	resultMap.put("errorMsg","error");
        }finally{	
    	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
    	System.out.println(json);
    	pw.write(json);
         if(pw!=null){
        	pw.close();
         }
       }
    }    
    
    /**
     * 
     * 根据学生所有减分记录计算出的剩余总分
     * @param studentid
     * @param fs
     * @return
     */
    public ExcuteResult changeStudentGrade(String studentid, String fs) {
    	ExcuteResult result = null;
    	if(studentid != null){
			JxStudentsEntity ent = new JxStudentsEntity();
     		ent.setXh(studentid);
     		ent.setXyfs(fs);
     		result = jxStudentsService.updateJxStudentsByPrimaryKeySelective(ent);
		}
		return result;
	}

	/**
     * 修改一条数据
     * @param request
     * @param response
     * @param entity
     */
    public void updateJxStudentsGradeMessage(HttpServletRequest request,HttpServletResponse response,JxStudentsGradeEntity entity){
    	response.setContentType("text/html; charset=utf-8");
     	PrintWriter pw = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap<String,Object>();
          try{
        	pw = response.getWriter();
        	String jjfyy = request.getParameter("jjfyy");
        	jjfyy = URLDecoder.decode(jjfyy, "utf-8"); 
        	String taskinfo = request.getParameter("taskinfo");
        	String grade = request.getParameter("grade");
        	String xh = request.getParameter("xh");
        	taskinfo = URLDecoder.decode(taskinfo, "utf-8");
        	String jjfyyval = request.getParameter("jjfyyval");
        	jjfyyval = URLDecoder.decode(jjfyyval, "utf-8"); 
        	String jjfyy2 = request.getParameter("jjfyy2");
        	jjfyy2 = URLDecoder.decode(jjfyy2, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxStudentsGradeEntity.class);
        	int grades = Integer.parseInt(grade);
        	entity.setGrade(grades+"");
        	entity.setXh(xh);
        	entity.setRemark1(jjfyyval);
        	result=jxStudentsGradeService.updateJxStudentsGradeByPrimaryKeySelective(entity);
        	if("1".equals(result.getReturnCode())){
        		 String fs = "100";
        		 String gradesql = "select sum(grade) as FS  from JX_STUDENTS_GRADE t where studentid = '"+entity.getStudentid()+"' and sybj = 1";
         		 List<HashMap<String,Object>> fsmap = jxStudentsGradeService.selectListJxStudentsGradeBySql(gradesql);
         		 if(fsmap != null && fsmap.size() > 0){
         			Map tempmap = fsmap.get(0);
         			if(tempmap != null && tempmap.get("FS") != null){
         				fs =  String.valueOf(100 + Integer.parseInt(tempmap.get("FS").toString()));
         			}
         		}
         		result = changeStudentGrade(entity.getStudentid(),fs);
         		if(Integer.parseInt(fs) < 60){
         			resultMap.put("errorMsg","fsLess60");
         		}else{
         			resultMap.put("errorMsg","success");
         		}
        	}else{
        		resultMap.put("errorMsg","failed");
        	}
        }catch(Exception e){
        	e.printStackTrace();
        	resultMap.put("errorMsg","error");
        }finally{	
    	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
    	System.out.println(json);
    	pw.write(json);
         if(pw!=null){
        	pw.close();
         }
       }
    }
    
    
    /**
     * 删除一条数据
     * @param request
     * @param response
     * @param entity
     */
    public void deleteJxStudentsGradeMessage(HttpServletRequest request,HttpServletResponse response,JxStudentsGradeEntity entity){
    	response.setContentType("text/html; charset=utf-8");
     	PrintWriter pw = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap<String,Object>();
          try{
        	pw = response.getWriter();
        	String xh = request.getParameter("xh");
        	entity.setXh(xh);
        	result=jxStudentsGradeService.deleteJxStudentsGradeByPrimaryKey(xh);
        	if("1".equals(result.getReturnCode())){
        		resultMap.put("errorMsg","success");
        	}else{
        		resultMap.put("errorMsg","failed");
        	}
        }catch(Exception e){
        	e.printStackTrace();
        	resultMap.put("errorMsg","error");
        }finally{	
    	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
    	System.out.println(json);
    	pw.write(json);
         if(pw!=null){
        	pw.close();
         }
       }
    }
    
    /**
     * 作废记录
     * @param request
     * @param response
     * @param entity
     */
    public void toZuoFeiMessage(HttpServletRequest request,HttpServletResponse response,JxStudentsGradeEntity entity){
    	response.setContentType("text/html; charset=utf-8");
     	PrintWriter pw = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap<String,Object>();
          try{
        	pw = response.getWriter();
        	String zfyy = request.getParameter("zfyy");
        	zfyy = URLDecoder.decode(zfyy, "utf-8"); 
        	String xh = request.getParameter("xh");
        	entity.setXh(xh);
        	entity.setZfyy(zfyy);
        	entity.setSybj("0");
        	result=jxStudentsGradeService.updateJxStudentsGradeByPrimaryKeySelective(entity);
        	if("1".equals(result.getReturnCode())){
        		JxStudentsGradeEntity en = jxStudentsGradeService.selectJxStudentsGradeByPrimaryKey(xh);
        		 String fs = "100";
        		 String gradesql = "select sum(grade) as FS  from JX_STUDENTS_GRADE t where studentid = '"+en.getStudentid()+"' and sybj = 1";
         		 List<HashMap<String,Object>> fsmap = jxStudentsGradeService.selectListJxStudentsGradeBySql(gradesql);
         		 if(fsmap != null && fsmap.size() > 0){
         			Map tempmap = fsmap.get(0);
         			if(tempmap != null && tempmap.get("FS") != null){
         				fs =  String.valueOf(100 + Integer.parseInt(tempmap.get("FS").toString()));
         			}
         		}
         		result = changeStudentGrade(en.getStudentid(),fs);
         		resultMap.put("errorMsg","success");
        	}else{
        		resultMap.put("errorMsg","failed");
        	}
        }catch(Exception e){
        	e.printStackTrace();
        	resultMap.put("errorMsg","error");
        }finally{	
    	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
    	System.out.println(json);
    	pw.write(json);
         if(pw!=null){
        	pw.close();
         }
       }
    }
    

    /**
     * 恢复已经作废的记录
     * @param request
     * @param response
     * @param entity
     */
    public void returnState(HttpServletRequest request,HttpServletResponse response,JxStudentsGradeEntity entity){
    	response.setContentType("text/html; charset=utf-8");
     	PrintWriter pw = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap<String,Object>();
          try{
        	pw = response.getWriter();
        	String sybj = request.getParameter("sybj");
        	String xh = request.getParameter("xh");
        	entity.setXh(xh);
        	entity.setSybj(sybj);
        	result=jxStudentsGradeService.updateJxStudentsGradeByPrimaryKeySelective(entity);
        	if("1".equals(result.getReturnCode())){
        		JxStudentsGradeEntity en = jxStudentsGradeService.selectJxStudentsGradeByPrimaryKey(xh);
       		    String fs = "100";
       		    String gradesql = "select sum(grade) as FS  from JX_STUDENTS_GRADE t where studentid = '"+en.getStudentid()+"' and sybj = 1";
        		 List<HashMap<String,Object>> fsmap = jxStudentsGradeService.selectListJxStudentsGradeBySql(gradesql);
        		 if(fsmap != null && fsmap.size() > 0){
        			Map tempmap = fsmap.get(0);
        			if(tempmap != null && tempmap.get("FS") != null){
        				fs =  String.valueOf(100 + Integer.parseInt(tempmap.get("FS").toString()));
        			}
        		}
        		result = changeStudentGrade(en.getStudentid(),fs);
        		if(Integer.parseInt(fs) < 60){
        			resultMap.put("errorMsg","fsLess60");
        		}else{
        			resultMap.put("errorMsg","success");
        		}
        	}else{
        		resultMap.put("errorMsg","failed");
        	}
        }catch(Exception e){
        	e.printStackTrace();
        	resultMap.put("errorMsg","error");
        }finally{	
    	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
    	System.out.println(json);
    	pw.write(json);
         if(pw!=null){
        	pw.close();
         }
       }
    }
    
    /**
     * 实习生分数查询的查询学员列表
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void getListPageJxStudents(HttpServletRequest request, HttpServletResponse response, JxStudentsSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        List<JxStudentsEntity> erreylist = new ArrayList<JxStudentsEntity>();
        List<String> array = null;
        List<String> values = null;
        List<String> undkcount = null;
        try{
        	int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
            String Name = request.getParameter("name");
            String graduateschool = request.getParameter("graduateschool");
            String comtype = request.getParameter("comtype");
            String zt = request.getParameter("zt");
            sqlWhere.setZt(zt);
            String zhiweitype = request.getParameter("zhiweitype");
            sqlWhere.setZhiweitype(zhiweitype);
            String stuyear = request.getParameter("stuyear");
            sqlWhere.setStuyear(stuyear);
            Page listPage=new Page(rows,page);
            sqlWhere.setName(Name);
            sqlWhere.setGraduateschool(graduateschool);
            sqlWhere.setComtype(comtype);
            sqlWhere.setListPage(listPage); 
            List<JxStudentsEntity> list=jxStudentsService.selectListPageJxStudentsBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("code", 0);//rows键 存放每页记录 list
            jsonMap.put("msg", "");//rows键 存放每页记录 list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("data", list);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            //frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudents.toString(),Tools.getException(e));
        }
    }
    
    
    public ModelAndView toCreateLookJxStudentsGradePage(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
        String type = request.getParameter("type");
        String xh = request.getParameter("xh");
        ModelAndView view=new ModelAndView("jx_personrecord/student_grade_add");
    	if(type != null && "0".equals(type)){
    		String index =jxStudentsGradeService.queryNextIndex();
        	JxStudentsEntity entity = jxStudentsService.selectJxStudentsByPrimaryKey(xh);
        	view.addObject("index", index);
        	view.addObject("entity", entity);
        }else if(type != null && "1".equals(type) || "2".equals(type)){
        
        	
        }
        view.addObject("type", type);
        return view;
    }
    
    
    public ModelAndView toSearchJxStudentsGradePage(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
        String xh = request.getParameter("xh");
        ModelAndView view=new ModelAndView("jx_personrecord/students_grade_main");
        view.addObject("xh",xh);
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

    public void setJxStudentsGradeService(IJxStudentsGradeService jxStudentsGradeService) {
        this.jxStudentsGradeService = jxStudentsGradeService;
    }

    public IJxStudentsGradeService getJxStudentsGradeService() {
        return jxStudentsGradeService;
    }

	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}

	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}
    
}