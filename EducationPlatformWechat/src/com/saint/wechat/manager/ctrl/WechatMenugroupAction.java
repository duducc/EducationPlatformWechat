package com.saint.wechat.manager.ctrl;

import com.google.gson.Gson;
import com.saint.constant.FrmGnid;
import com.saint.pub.Tools;
import com.saint.pub.database.ExcuteResult;
import com.saint.pub.plugin.Page;
import com.saint.pub.services.imp.ProcessResultImpl;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.wechat.manager.bean.WechatMenugroupEntity;
import com.saint.wechat.manager.services.IWechatMenugroupService;
import com.saint.wechat.manager.sqlWhere.WechatMenugroupSqlWhere;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class WechatMenugroupAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IWechatMenugroupService wechatMenugroupService;

    public void getListPageWechatMenugroup(HttpServletRequest request, HttpServletResponse response, WechatMenugroupSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<WechatMenugroupEntity> entitylist=wechatMenugroupService.selectListPageWechatMenugroupBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageWechatMenugroup.toString(),Tools.getException(e));
        }
    }

    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, WechatMenugroupEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertWechatMenugroup(request,response,entity);
        }else if(option.equals("edit")){
            updateWechatMenugroup(request,response,entity);
        }else if(option.equals("delete")){
            deleteWechatMenugroup(request,response,entity);
        }
    }

    public void insertWechatMenugroup(HttpServletRequest request, HttpServletResponse response, WechatMenugroupEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatMenugroupService.insertWechatMenugroup(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.����()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertWechatMenugroup, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertWechatMenugroup.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void updateWechatMenugroup(HttpServletRequest request, HttpServletResponse response, WechatMenugroupEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
        try {
            out = response.getWriter();
            result = wechatMenugroupService.updateWechatMenugroupByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateWechatMenugroup, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateWechatMenugroup.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public void deleteWechatMenugroup(HttpServletRequest request, HttpServletResponse response, WechatMenugroupEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String menusxh=entity.getMenusxh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = wechatMenugroupService.deleteWechatMenugroupByPrimaryKey(menusxh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteWechatMenugroup, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteWechatMenugroup.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    public ModelAndView toCreateAddPageWechatMenugroup(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    public ModelAndView toCreateUpdatePageWechatMenugroup(HttpServletRequest request, HttpServletResponse response, WechatMenugroupEntity entity) {
        String menusxh=entity.getMenusxh();
        //�޸�ҳ��
        WechatMenugroupEntity entityWechatMenugroupEntity=wechatMenugroupService.selectWechatMenugroupByPrimaryKey(menusxh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityWechatMenugroupEntity);
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

    public void setWechatMenugroupService(IWechatMenugroupService wechatMenugroupService) {
        this.wechatMenugroupService = wechatMenugroupService;
    }

    public IWechatMenugroupService getWechatMenugroupService() {
        return wechatMenugroupService;
    }
}