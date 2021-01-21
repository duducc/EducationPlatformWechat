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
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxClassService;
import com.saint.teaching.services.IJxStudentsService;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;

/**
*类注释信息
*表名JX_CLASS
*表说明教学班级
  */
public class JxClassAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxClassService jxClassService;
    
    private IJxStudentsService jxStudentsService;

    /**
    *方法注释信息
    *分页查询表JX_CLASS
    *表说明教学班级
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxClass(HttpServletRequest request, HttpServletResponse response, JxClassSqlWhere sqlWhere) {
    	response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//接受参数page和rows
            String Name = request.getParameter("name");
            String groade = request.getParameter("groade");
            String unit = request.getParameter("unit");
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            sqlWhere.setName(Name);
            sqlWhere.setGrade(groade);
            sqlWhere.setDeptid(unit);
            List<JxClassEntity> entitylist=jxClassService.selectListPageJxClassBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            
            jsonMap.put("code", 0);//rows键 存放每页记录 list
            jsonMap.put("msg", "");//rows键 存放每页记录 list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("data", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            //frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxClass.toString(),Tools.getException(e));
        }
    }
    /**
    *方法注释信息
    *JX_CLASS,教学班级表,插入信息
      */
    public void insertJxClass(HttpServletRequest request, HttpServletResponse response, JxClassEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        JxClassSqlWhere sqlWhere = new JxClassSqlWhere();
        try {
            out = response.getWriter();
            String taskinfo = request.getParameter("taskinfo") ;
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxClassEntity.class);
        	//String id = jxClassService.selectListJxClassBySql("select JX_CLASS_INFO.nextval from dual").get(0).get("NEXTVAL").toString();
			String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			entity.setGrade(gxsj.substring(0,4));
			entity.setEmpnumber("0");
			entity.setUpdatetime(gxsj);
			sqlWhere.setGrade(entity.getGrade());
			sqlWhere.setName(entity.getName());
			List<JxClassEntity> list = jxClassService.selectListJxClassBySqlWhere(sqlWhere);
			if(list.size()>0){
				resultMap.put("errorMsg", "chunfu");
			}else{
				result = jxClassService.insertJxClass(entity);
				if(result.getReturnCode().equals("1")){
					resultMap.put("errorMsg", "success");
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
     * 学员班级修改(ywq)
     * @param request
     * @param response
     * @param entity
     */
    public void updateJxClass(HttpServletRequest request, HttpServletResponse response, JxClassEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String taskinfo = request.getParameter("taskinfo") ;
            taskinfo = URLDecoder.decode(taskinfo, "utf-8"); 
        	entity = JsonUtil.json2Object(taskinfo, JxClassEntity.class);
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        	entity.setUpdatetime(gxsj);
            result = jxClassService.updateJxClassByPrimaryKeySelective(entity);
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
     * 班级删除(ywq)
     * @param request
     * @param response
     */
    public void deleteJxClass(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            String xh = request.getParameter("xh");
            result = jxClassService.deleteJxClassByPrimaryKey(xh);
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
     * 跳转至班级新增页面(ywq)
     * @param request
     * @param response
     * @return
     */
    public ModelAndView toCreateAddPageJxClass(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view= null;
        try {
        	String type = request.getParameter("type");
        	view=new ModelAndView("jx_personrecord/class_info_add");
        	if(type.equals("2")){
        		String xh = request.getParameter("xh");
        		JxClassEntity entity = jxClassService.selectJxClassByPrimaryKey(xh);
        		view.addObject("entity", entity);
        		view.addObject("xh", entity.getXh());
        	}
        	view.addObject("type", type);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    public ModelAndView toCreateAddPageJxClassFz(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        ModelAndView view= null;
        try {
        	JxStudentsSqlWhere sqlWhere = new JxStudentsSqlWhere();
        	String xh = request.getParameter("xh");
        	String value = request.getParameter("value");
    		JxClassEntity entity = jxClassService.selectJxClassByPrimaryKey(xh);
    		String classid=entity.getXh();
    		sqlWhere.setClassid(classid);
    		List<JxStudentsEntity> list = jxStudentsService.selectListJxStudentsBySqlWhere(sqlWhere);
        	view=new ModelAndView("jx_personrecord/class_info_fz");
        	view.addObject("className", entity.getName());
        	view.addObject("count", list.size());
        	view.addObject("list", list);
        	view.addObject("xh", xh);
        	view.addObject("value",value);
        	view.addObject("classid",classid);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return view;
    }
    public void JxClassZiDongFz(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        Map<String,Object> resultMap = new HashMap();
        PrintWriter out = null;
        try {
        	out=response.getWriter();
        	JxStudentsSqlWhere sqlWhere = new JxStudentsSqlWhere();
        	String xh = request.getParameter("xh");
        int zushu=Integer.parseInt(request.getParameter("zushu"));//要分的组数
      //  	int renshu=Integer.parseInt(request.getParameter("renshu"));//每组人数
    		JxClassEntity entity = jxClassService.selectJxClassByPrimaryKey(xh);
    		String classid=entity.getXh();
    		sqlWhere.setClassid(classid);
    		List<JxStudentsEntity> list = jxStudentsService.selectListJxStudentsBySqlWhere(sqlWhere);
    		int total = list.size();
    		int renshu=total/zushu;
    		int zushuyu=total%zushu;
    		int zushuyu2=total%zushu;
    		List<List<JxStudentsEntity>> lists = new ArrayList<List<JxStudentsEntity>>();
    		int aaa=0;
    		int bbb=0;
		for(int i=0;i<zushu;i++){
			if(zushuyu!=0){
				bbb=bbb+renshu+1;
				lists.add(list.subList(aaa, bbb));
				aaa=bbb;
				zushuyu--;
				continue;
			}
			if(zushuyu2!=0){
				aaa=bbb;
				bbb=bbb+renshu;
				lists.add(list.subList(aaa, bbb));
				continue;
			}
			bbb=bbb+renshu;
			lists.add(list.subList(aaa, bbb));
			aaa=bbb;
		 }
    		resultMap.put("lists", lists);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
        	System.out.println(json);
        	out.write(json);
            if(out!=null)out.close();
        }
    }
    public void JxClassShouDongFz(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        Map<String,Object> resultMap = new HashMap();
        PrintWriter out = null;
        try {
        	out=response.getWriter();
        	JxStudentsSqlWhere sqlWhere = new JxStudentsSqlWhere();
        	String xh = request.getParameter("xh");
    		JxClassEntity entity = jxClassService.selectJxClassByPrimaryKey(xh);
    		String classid=entity.getXh();
    		sqlWhere.setClassid(classid);
    		List<JxStudentsEntity> list = jxStudentsService.selectListJxStudentsBySqlWhere(sqlWhere);
    		resultMap.put("list", list);
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
    *JX_CLASS,教学班级表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxClass(HttpServletRequest request, HttpServletResponse response, JxClassEntity entity) {
        String xh=entity.getXh();
        //修改页面
        JxClassEntity entityJxClassEntity=jxClassService.selectJxClassByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxClassEntity);
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

    public void setJxClassService(IJxClassService jxClassService) {
        this.jxClassService = jxClassService;
    }

    public IJxClassService getJxClassService() {
        return jxClassService;
    }
	public IJxStudentsService getJxStudentsService() {
		return jxStudentsService;
	}
	public void setJxStudentsService(IJxStudentsService jxStudentsService) {
		this.jxStudentsService = jxStudentsService;
	}
    
}