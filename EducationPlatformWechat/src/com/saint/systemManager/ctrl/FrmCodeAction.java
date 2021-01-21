package com.saint.systemManager.ctrl;

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
import com.saint.systemManager.bean.FrmCodeEntity;
import com.saint.systemManager.bean.FrmCodeKey;
import com.saint.systemManager.services.IFrmCodeService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.sqlWhere.FrmCodeSqlWhere;

/**
*��ע����Ϣ
*����FRM_CODE
*��˵��������Ϣ
  */
public class FrmCodeAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IFrmCodeService frmCodeService;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��FRM_CODE
    *��˵��������Ϣ
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageFrmCode(HttpServletRequest request, HttpServletResponse response, FrmCodeSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<FrmCodeEntity> entitylist=frmCodeService.selectListPageFrmCodeBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageFrmCode.toString(),Tools.getException(e));
        }
    }

    /**
    *����ע����Ϣ
    *ҳ����ת����
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, FrmCodeEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertFrmCode(request,response,entity);
        }else if(option.equals("edit")){
            updateFrmCode(request,response,entity);
        }else if(option.equals("delete")){
            deleteFrmCode(request,response,entity);
        }
    }

    /**
    *����ע����Ϣ
    *FRM_CODE,������Ϣ��,������Ϣ
      */
    public void insertFrmCode(HttpServletRequest request, HttpServletResponse response, FrmCodeEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmCodeService.insertFrmCode(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.����()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertFrmCode, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertFrmCode.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *FRM_CODE,������Ϣ��,�޸�
      */
    public void updateFrmCode(HttpServletRequest request, HttpServletResponse response, FrmCodeEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmCodeService.updateFrmCodeByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateFrmCode, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateFrmCode.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *FRM_CODE,������Ϣ��,ɾ��
      */
    public void deleteFrmCode(HttpServletRequest request, HttpServletResponse response, FrmCodeKey key) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = frmCodeService.deleteFrmCodeByPrimaryKey(key);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteFrmCode, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteFrmCode.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *FRM_CODE,������Ϣ��
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageFrmCode(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *FRM_CODE,������Ϣ��
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageFrmCode(HttpServletRequest request, HttpServletResponse response, FrmCodeKey key) {
        //�޸�ҳ��
        FrmCodeEntity entityFrmCodeEntity=frmCodeService.selectFrmCodeByPrimaryKey(key);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityFrmCodeEntity);
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

    public void setFrmCodeService(IFrmCodeService frmCodeService) {
        this.frmCodeService = frmCodeService;
    }

    public IFrmCodeService getFrmCodeService() {
        return frmCodeService;
    }
}