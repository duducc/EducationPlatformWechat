package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
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
import com.saint.teaching.bean.JxClassStudentsEntity;
import com.saint.teaching.bean.JxLunxunEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveEntity;
import com.saint.teaching.bean.JxStudentsInternshipProveKey;
import com.saint.teaching.services.IJxClassStudentsService;
import com.saint.teaching.services.IJxLunxunService;
import com.saint.teaching.services.IJxStudentsInternshipProveService;
import com.saint.teaching.sqlWhere.JxClassStudentsSqlWhere;
import com.saint.teaching.sqlWhere.JxLunxunSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsInternshipProveSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentsSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;

/**
*��ע����Ϣ
*����JX_STUDENTS_INTERNSHIP_PROVE
*��˵��ʵϰ֤��
  */
public class JxStudentsInternshipProveAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStudentsInternshipProveService jxStudentsInternshipProveService;

    private IJxLunxunService jxLunxunService;
    
    private IJxClassStudentsService jxClassStudentsService;
    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STUDENTS_INTERNSHIP_PROVE
    *��˵��ʵϰ֤��
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStudentsInternshipProve(HttpServletRequest request, HttpServletResponse response, JxStudentsInternshipProveSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxStudentsInternshipProveEntity> entitylist=jxStudentsInternshipProveService.selectListPageJxStudentsInternshipProveBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStudentsInternshipProve.toString(),Tools.getException(e));
        }
    }


    /**
    *����ע����Ϣ
    *JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,������Ϣ
      */
    public void insertJxStudentsInternshipProves(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        try {
        	out = response.getWriter();
            String names = request.getParameter("names");
            String stuxh = request.getParameter("stuxh");
            String stuname = request.getParameter("stuname");
            String[] classes = names.split("/");
            JxClassStudentsSqlWhere cssqlWhere = new JxClassStudentsSqlWhere();
        	cssqlWhere.setStudentid(stuxh);
        	List<JxClassStudentsEntity> cslist = jxClassStudentsService.selectListJxClassStudentsBySqlWhere(cssqlWhere);
        	String zuid = "";
        	if(cslist.size()>0){
        		zuid = cslist.get(0).getZuid();
        	}
        	JxLunxunSqlWhere lxsqlWhere = new JxLunxunSqlWhere();
        	lxsqlWhere.setZuid(zuid);
        	List<JxLunxunEntity> lxlist = jxLunxunService.selectListJxLunxunBySqlWhere(lxsqlWhere);
        	int s = 0;
            for(int i=0;i<classes.length;i++){
            	JxStudentsInternshipProveEntity entity = new JxStudentsInternshipProveEntity();
            	String[] xhs = classes[i].split(",");
            	String num = "";
            	String userid = "";
            	String username = "";
            	if(xhs.length==3){
            		num = xhs[0];
            		userid = xhs[1];
            		username = xhs[2];
            	}else{
            		num = xhs[0];
            	}
            	for(int j=0;j<lxlist.size();j++){
            		if(lxlist.get(j).getNum().equals(num)){
            			entity.setStudentsid(stuxh);
            			entity.setDepid(lxlist.get(j).getDeptid());
            			entity.setDepname(lxlist.get(j).getRemark1());
            			entity.setStudentsname(stuname);
            			entity.setStartdate(lxlist.get(j).getStartdate().substring(0,10));
            			entity.setEnddate(lxlist.get(j).getEnddate().substring(0,10));
            			entity.setZmrid(userid);
            			entity.setZmr(username);
            		}
            	}
            	result = jxStudentsInternshipProveService.insertJxStudentsInternshipProveSelective(entity);
            	if(result.getReturnCode().equals("1")){
            		s++;
            	}
            }
            if(classes.length==s){
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
    *����ע����Ϣ
    *JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,�޸�
      */
    public void updateJxStudentsInternshipProve(HttpServletRequest request, HttpServletResponse response, JxStudentsInternshipProveEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentsInternshipProveService.updateJxStudentsInternshipProveByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxStudentsInternshipProve, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxStudentsInternshipProve.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����,ɾ��
      */
    public void deleteJxStudentsInternshipProve(HttpServletRequest request, HttpServletResponse response, JxStudentsInternshipProveKey key) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxStudentsInternshipProveService.deleteJxStudentsInternshipProveByPrimaryKey(key);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxStudentsInternshipProve, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxStudentsInternshipProve.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxStudentsInternshipProve(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_STUDENTS_INTERNSHIP_PROVE,ʵϰ֤����
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxStudentsInternshipProve(HttpServletRequest request, HttpServletResponse response, JxStudentsInternshipProveKey key) {
        //�޸�ҳ��
        JxStudentsInternshipProveEntity entityJxStudentsInternshipProveEntity=jxStudentsInternshipProveService.selectJxStudentsInternshipProveByPrimaryKey(key);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxStudentsInternshipProveEntity);
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

    public void setJxStudentsInternshipProveService(IJxStudentsInternshipProveService jxStudentsInternshipProveService) {
        this.jxStudentsInternshipProveService = jxStudentsInternshipProveService;
    }

    public IJxStudentsInternshipProveService getJxStudentsInternshipProveService() {
        return jxStudentsInternshipProveService;
    }


	public IJxLunxunService getJxLunxunService() {
		return jxLunxunService;
	}


	public void setJxLunxunService(IJxLunxunService jxLunxunService) {
		this.jxLunxunService = jxLunxunService;
	}


	public IJxClassStudentsService getJxClassStudentsService() {
		return jxClassStudentsService;
	}


	public void setJxClassStudentsService(
			IJxClassStudentsService jxClassStudentsService) {
		this.jxClassStudentsService = jxClassStudentsService;
	}
    
    
}