package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.bean.JxDepartmentEntity;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.services.IJxClassService;
import com.saint.teaching.services.IJxDepartmentService;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.sqlWhere.JxDepartmentSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;

/**
*类注释信息
*表名JX_DEPARTMENT
*表说明教学部门
  */
public class JxDepartmentAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxDepartmentService jxDepartmentService;
    
    private IJxClassService jxClassService;
    
    private IJxLunxunService jxLunxunService;

    /**
    *方法注释信息
    *分页查询表JX_DEPARTMENT
    *表说明教学部门
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxDepartment(HttpServletRequest request, HttpServletResponse response, JxDepartmentSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
            String classid = request.getParameter("classid");
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            sqlWhere.setClassid(classid);
            List<JxDepartmentEntity> entitylist=jxDepartmentService.selectListPageJxDepartmentBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("code", 0);//rows键 存放每页记录 list
            jsonMap.put("msg", "");//rows键 存放每页记录 list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("data", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxDepartment.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxDepartmentEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxDepartment(request,response,entity);
        }else if(option.equals("edit")){
            updateJxDepartment(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxDepartment(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *JX_DEPARTMENT,教学部门表,插入信息
      */
    public void insertJxDepartment(HttpServletRequest request, HttpServletResponse response, JxDepartmentEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        ExcuteResult result2;
        Map<String,Object> resultMap = new HashMap();
        JxDepartmentSqlWhere sqlWhere = new JxDepartmentSqlWhere();
        try {
            out = response.getWriter();
            String taskinfo = request.getParameter("taskinfo") ;
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxDepartmentEntity.class);
        	String id = jxClassService.selectListJxClassBySql("select JX_CLASS_INFO.nextval from dual").get(0).get("NEXTVAL").toString();
            entity.setXh(id);
            sqlWhere.setClassid(entity.getClassid());
            sqlWhere.setDepid(entity.getDepid());
            List<JxDepartmentEntity> entitylist=jxDepartmentService.selectListJxDepartmentBySqlWhere(sqlWhere);
            /*JxLunxunSqlWhere sqlWhere2 = new JxLunxunSqlWhere();
        	sqlWhere2.setClassid(entity.getClassid());
        	sqlWhere2.setNum("1");
            List<JxLunxunEntity> lunxunlist=jxLunxunService.selectListJxLunxunBySqlWhere(sqlWhere2);*/
            
            
            if(entitylist.size()!=0){
            	resultMap.put("errorMsg", "chongfu");
            	return;
            }
            /*JxLunxunSqlWhere sqlWhere2 = new JxLunxunSqlWhere();
        	sqlWhere2.setClassid(entity.getClassid());
        	sqlWhere2.setDeptid(entity.getDepid());
            List<JxLunxunEntity> lunxunlist=jxLunxunService.selectListJxLunxunBySqlWhere(sqlWhere2);
            Collections.sort(lunxunlist, new Comparator<JxLunxunEntity>() {
                @Override
                public int compare(JxLunxunEntity e1, JxLunxunEntity e2) {
                    return (e2.getStartdate() + "").compareTo(e1.getStartdate() + "");
                }
            });
            
            String[] teachernames = entity.getRemark2().split(",");
            String[] teacherids = entity.getRemark3().split(",");
            for(int i = 0;i<lunxunlist.size();i++){
            	lunxunlist.get(i).setTeacherid(teacherids[i]=="*"?"":teacherids[i]);
            	lunxunlist.get(i).setTeachername(teachernames[i]=="*"?"":teachernames[i]);
            	result2 = jxLunxunService.updateJxLunxunByPrimaryKeySelective(lunxunlist.get(i));
            	if(!result2.getReturnCode().equals("1")){
    				resultMap.put("errorMsg", "failed");
    				return;
    			}
            }*/
            result = jxDepartmentService.insertJxDepartment(entity);
            
            if(result.getReturnCode().equals("1")){
				resultMap.put("errorMsg", "success");
			}else{
				resultMap.put("errorMsg", "failed");
			}
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxDepartment.toString(),Tools.getException(e));
        }finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
        	System.out.println(json);
        	out.write(json);
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_DEPARTMENT,教学部门表,修改
      */
    public void updateJxDepartment(HttpServletRequest request, HttpServletResponse response, JxDepartmentEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        Map<String,Object> resultMap = new HashMap();
        ExcuteResult result;
        try {
            out = response.getWriter();
            String taskinfo = request.getParameter("taskinfo") ;
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxDepartmentEntity.class);
            result = jxDepartmentService.updateJxDepartmentByPrimaryKeySelective(entity);
            if(result.getReturnCode().equals("1")){
            	resultMap.put("errorMsg", "upsuccess");
			}else{
				resultMap.put("errorMsg", "failed");
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
    /**
     * 判断轮训是否已安排结束
     * @param request
     * @param response
     * @param entity
     */
    public void ifFinish(HttpServletRequest request, HttpServletResponse response, JxDepartmentEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String classid = request.getParameter("classid") ;
            JxClassEntity e = jxClassService.selectJxClassByPrimaryKey(classid);
            if(classid.equals("")){
				resultMap.put("errorMsg", "noclass");
			}
            else if(e.getRemark3().equals("2")){
            	resultMap.put("errorMsg", "finish");
			} 
			else{
				resultMap.put("errorMsg", "nofinish");
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
    /**
    *方法注释信息
    *JX_DEPARTMENT,教学部门表,删除
      */
    public void deleteJxDepartment(HttpServletRequest request, HttpServletResponse response, JxDepartmentEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=request.getParameter("xh");
        PrintWriter out = null;
        Map<String,Object> resultMap = new HashMap();
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxDepartmentService.deleteJxDepartmentByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
				resultMap.put("errorMsg", "success");
			}else{
				resultMap.put("errorMsg", "failed");
			}
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxDepartment.toString(),Tools.getException(e));
        }finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
        	System.out.println(json);
        	out.write(json);
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_DEPARTMENT,教学部门表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxDepartment(HttpServletRequest request, HttpServletResponse response) {
         response.setContentType("text/html; charset=utf-8");
         
         String classid = request.getParameter("classid");
         JxClassEntity entity = jxClassService.selectJxClassByPrimaryKey(classid);
        //新增页面
        ModelAndView view=new ModelAndView("jx_traininginroation/jx_traininginroation_template");
        view.addObject("option", "add");
        view.addObject("classid", entity.getXh());
        view.addObject("zushu", entity.getRemark2());
        return view;
    }

    /**
    *方法注释信息
    *JX_DEPARTMENT,教学部门表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxDepartment(HttpServletRequest request, HttpServletResponse response) {
        String xh=request.getParameter("xh");
        String classid = request.getParameter("classid");
        //修改页面
        JxDepartmentEntity entityJxDepartmentEntity=jxDepartmentService.selectJxDepartmentByPrimaryKey(xh);
        JxClassEntity entity = jxClassService.selectJxClassByPrimaryKey(classid);
        ModelAndView view=new ModelAndView("jx_traininginroation/jx_traininginroation_template");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxDepartmentEntity);
        view.addObject("zushu", entity.getRemark2());
        String danwei = entityJxDepartmentEntity.getRemark1().substring(entityJxDepartmentEntity.getRemark1().length()-1, entityJxDepartmentEntity.getRemark1().length());
        view.addObject("danwei", danwei);
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

    public void setJxDepartmentService(IJxDepartmentService jxDepartmentService) {
        this.jxDepartmentService = jxDepartmentService;
    }

    public IJxDepartmentService getJxDepartmentService() {
        return jxDepartmentService;
    }

	public IJxClassService getJxClassService() {
		return jxClassService;
	}

	public void setJxClassService(IJxClassService jxClassService) {
		this.jxClassService = jxClassService;
	}

	public IJxLunxunService getJxLunxunService() {
		return jxLunxunService;
	}

	public void setJxLunxunService(IJxLunxunService jxLunxunService) {
		this.jxLunxunService = jxLunxunService;
	}
    
    
}