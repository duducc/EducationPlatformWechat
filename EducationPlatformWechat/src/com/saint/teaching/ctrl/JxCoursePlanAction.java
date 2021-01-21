package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxCoursePlanEntity;
import com.saint.teaching.services.IJxCoursePlanService;
import com.saint.teaching.sqlWhere.JxCoursePlanSqlWhere;

/**
*��ע����Ϣ
*����JX_COURSEPLAN
*��˵�����ۿν�ѧ����
  */
public class JxCoursePlanAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxCoursePlanService jxCoursePlanService;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_COURSEPLAN
    *��˵�����ۿν�ѧ����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxCoursePlanEntity> entitylist=jxCoursePlanService.selectListPageJxCoursePlanBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxCoursePlan.toString(),Tools.getException(e));
        }
    }

    /**
    *����ע����Ϣ
    *ҳ����ת����
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxCoursePlan(request,response,entity);
        }else if(option.equals("edit")){
            updateJxCoursePlan(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxCoursePlan(request,response,entity);
        }
    }

    /**
    *����ע����Ϣ
    *JX_COURSEPLAN,���ۿν�ѧ���ȱ�,������Ϣ
      */
    public void insertJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursePlanService.insertJxCoursePlan(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.����()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxCoursePlan, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxCoursePlan.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_COURSEPLAN,���ۿν�ѧ���ȱ�,�޸�
      */
    public void updateJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursePlanService.updateJxCoursePlanByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxCoursePlan, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxCoursePlan.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_COURSEPLAN,���ۿν�ѧ���ȱ�,ɾ��
      */
    public void deleteJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxCoursePlanService.deleteJxCoursePlanByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxCoursePlan, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxCoursePlan.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_COURSEPLAN,���ۿν�ѧ���ȱ�
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxCoursePlan(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_COURSEPLAN,���ۿν�ѧ���ȱ�
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxCoursePlan(HttpServletRequest request, HttpServletResponse response, JxCoursePlanEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxCoursePlanEntity entityJxCoursePlanEntity=jxCoursePlanService.selectJxCoursePlanByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxCoursePlanEntity);
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

    public void setJxCoursePlanService(IJxCoursePlanService jxCoursePlanService) {
        this.jxCoursePlanService = jxCoursePlanService;
    }

    public IJxCoursePlanService getJxCoursePlanService() {
        return jxCoursePlanService;
    }
}