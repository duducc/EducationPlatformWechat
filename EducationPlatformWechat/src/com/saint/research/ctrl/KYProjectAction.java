package com.saint.research.ctrl;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.research.bean.KYProjectEntity;
import com.saint.research.services.IKYProjectService;
import com.saint.research.sqlWhere.KYProjectSqlWhere;
import com.saint.systemManager.services.IFrmZlExlogService;

/**
*类注释信息
*表名KY_PROJECT
*表说明科研项目信息
  */
public class KYProjectAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;
    
    private ProcessResultImpl processResultImpl;

    private IKYProjectService kYProjectService;

   
    
    
    /**
     * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询(ywq)
     * @param sqlWhere
     * @return
     */
     public void getListKYProject(HttpServletRequest request, HttpServletResponse response, KYProjectSqlWhere sqlWhere) {
     	response.setContentType("text/html; charset=GBK");
         PrintWriter out=null; 
         try{
         	sqlWhere.setProstate("2");
             List<KYProjectEntity> entitylist=kYProjectService.selectListPageKYProjectBySqlWhere(sqlWhere);
             out=response.getWriter();
             out.write(new Gson().toJson(entitylist));
         }catch (Exception e) {
             e.printStackTrace();
             frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageKYProject.toString(),Tools.getException(e));
         }
     }
     /**
      * 跳转至项目查询页面
      * @param request
      * @param response
      * @return
      */
     public ModelAndView toProject(HttpServletRequest request, HttpServletResponse response){
    	 response.setContentType("text/html; charset=UTF-8");
    	 ModelAndView view = null;
    	 try {
			 view = new ModelAndView("project/project_main") ;
		} catch (Exception e) {
			 e.printStackTrace();
		}
    	return view ; 
	 }
     
     public void getKyprojectList(HttpServletRequest request, HttpServletResponse response, KYProjectSqlWhere sqlWhere) {
      	  response.setContentType("text/html; charset=GBK");
          PrintWriter out=null; 
          try{
        	  String proName = request.getParameter("name");
     		  if(proName!=null&&!proName.equals("")){
     			  proName=new String(proName.getBytes("ISO-8859-1"), "UTF-8");
     		  }
     		  sqlWhere.setProname(proName);
     		  List<KYProjectEntity> entitylist =  kYProjectService.selectListKYProjectBySqlWhere(sqlWhere);
              out=response.getWriter();
              out.write(new Gson().toJson(entitylist));
          }catch (Exception e) {
              e.printStackTrace();
              frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageKYProject.toString(),Tools.getException(e));
          }
    	 /*response.setContentType("text/html; charset=GBK");
         PrintWriter out=null; 
    	 	try {
//    	 		String proName = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
    	 		UserSession userSession = (UserSession) request.getSession().getAttribute("userSession");
    	 		String userId = userSession.getUser().getYhgh();
//    	 		String userId = "280000025543";
    	 		KYProjectUserSqlWhere userwhere = new KYProjectUserSqlWhere();
    	 		userwhere.setUserid(userId);
    	 		List<KYProjectUserEntity> userlist = kYProjectUserService.selectListKYProjectUserBySqlWhere(userwhere);
    		    List<KYProjectEntity> proList = new ArrayList<KYProjectEntity>();
    		    for(int i = 0;i<userlist.size();i++){
    		    	String prosequence = userlist.get(i).getProsequence();
    		    	KYProjectEntity entity = kYProjectService.selectKYProjectByPrimaryKey(prosequence);
    		    	if(entity!=null){
    		    		proList.add(entity);
    		    	}
    		    }
    		    out=response.getWriter();
    		    out.write(new Gson().toJson(proList));
    	 	} catch (Exception e) {
 			e.printStackTrace();
 		}*/
      }
   
     public ModelAndView toFunds(HttpServletRequest request, HttpServletResponse response){
    	 response.setContentType("text/html; charset=UTF-8");
    	 try {
    		 /*UserSession userSession = (UserSession) request.getSession().getAttribute("userSession");
         	 String userId = userSession.getUser().getYhgh();
			String proName = new String(request.getParameter("name").getBytes("ISO-8859-1"), "UTF-8");
			KYProjectUserSqlWhere sqlWhere2 = new KYProjectUserSqlWhere();
			 KYProjectSqlWhere sqlWhere = new KYProjectSqlWhere();
			 sqlWhere.setProname(proName);
			 List<KYProjectEntity> lists =  kYProjectService.selectListKYProjectBySqlWhere(sqlWhere);
			 sqlWhere2.setUserid(userId);
			 List<KYProjectUserEntity> users = kYProjectUserService.selectListKYProjectUserBySqlWhere(sqlWhere2);
			 List<KYProjectEntity> list = new ArrayList<KYProjectEntity>();
			 for(KYProjectEntity entity:lists){
				 for(KYProjectUserEntity user:users){
					 if(entity.getProsequence().equals(user.getProsequence())){
						 list.add(entity);
					 }
				 }
			 }*/
    		 KYProjectSqlWhere sqlWhere = new KYProjectSqlWhere();
    		 String proName = request.getParameter("name");
    		  if(proName!=null&&!proName.equals("")){
    			  //proName=new String(proName.getBytes("ISO-8859-1"), "UTF-8");
    		  }
    		  sqlWhere.setProname(proName);
    		  List<KYProjectEntity> list =  kYProjectService.selectListKYProjectBySqlWhere(sqlWhere);
			ModelAndView view = new ModelAndView("research/funds_main") ;
			view.addObject("list", list);
			return view ; 
		} catch (Exception e) {
			e.printStackTrace();
		}
    	 return null;
		
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

    public void setKYProjectService(IKYProjectService kYProjectService) {
        this.kYProjectService = kYProjectService;
    }

    public IKYProjectService getKYProjectService() {
        return kYProjectService;
    }

	public IKYProjectService getkYProjectService() {
		return kYProjectService;
	}

	public void setkYProjectService(IKYProjectService kYProjectService) {
		this.kYProjectService = kYProjectService;
	}
	
}