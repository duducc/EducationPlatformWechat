package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.services.IJxClassService;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.sqlWhere.JxClassSqlWhere;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;

/**
*��ע����Ϣ
*����JX_CLASS_STUDENTS
*��˵����ѧѧ����Ϣ
  */
public class JxClassStudentsAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxClassStudentsService jxClassStudentsService;
    
    private IJxClassService jxClassService;
    
    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_CLASS_STUDENTS
    *��˵����ѧѧ����Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxClassStudents(HttpServletRequest request, HttpServletResponse response, JxClassStudentsSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxClassStudentsEntity> entitylist=jxClassStudentsService.selectListPageJxClassStudentsBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("code", 0);//rows�� ���ÿҳ��¼ list
            jsonMap.put("msg", "");//rows�� ���ÿҳ��¼ list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("data", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxClassStudents.toString(),Tools.getException(e));
        }
    }

    public void getListClass(HttpServletRequest request, HttpServletResponse response, JxClassStudentsSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	String classid = request.getParameter("classid");
        	JxClassEntity entityClass=null;
        	if(classid!=null&&classid!=""){
        		 entityClass=jxClassService.selectJxClassByPrimaryKey(classid);
        	}
        	JxClassSqlWhere sqlWhere1 = new JxClassSqlWhere();
        	List<JxClassEntity> entitylist=jxClassService.selectListJxClassBySqlWhere(sqlWhere1);
        	String classNames="";
        	String classIds="";
        	 for(JxClassEntity entity:entitylist){
        		 classNames+=entity.getName()+",";
        		 classIds+=entity.getXh()+",";
        	 }
        	 Map<String, Object> jsonMap = new HashMap<String, Object>();//����map 
             jsonMap.put("classNames",classNames);
             jsonMap.put("classIds",classIds); 
             if(entityClass!=null){
            	 jsonMap.put("zushu",entityClass.getRemark2());
             }
             out=response.getWriter();
             out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxClassStudents.toString(),Tools.getException(e));
        }
    }
    
    /**
     * �����꼶�ҳ��༶
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void getListJxClass(HttpServletRequest request,HttpServletResponse response,JxClassSqlWhere sqlWhere){
    	response.setContentType("text/html; charset=GBK");
        PrintWriter out=null;
        try{
            out=response.getWriter();
            String grade = request.getParameter("grade");
       	 	String deptid = request.getParameter("deptid");
       	 	String professtypeid = request.getParameter("professtypeid");
       	 	sqlWhere.setDeptid(deptid);
       	 	sqlWhere.setProfesstypeid(professtypeid);
       	 	sqlWhere.setGrade(grade);
       	 	List<JxClassEntity> list = jxClassService.selectListJxClassBySqlWhere(sqlWhere);
       	 	out.write(new Gson().toJson(list));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfProject.toString(),Tools.getException(e));
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

    public void setJxClassStudentsService(IJxClassStudentsService jxClassStudentsService) {
        this.jxClassStudentsService = jxClassStudentsService;
    }

    public IJxClassStudentsService getJxClassStudentsService() {
        return jxClassStudentsService;
    }

	public IJxClassService getJxClassService() {
		return jxClassService;
	}

	public void setJxClassService(IJxClassService jxClassService) {
		this.jxClassService = jxClassService;
	}

    
}