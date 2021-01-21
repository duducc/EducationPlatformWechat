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
import com.saint.teaching.bean.JxGraduateDabianEntity;
import com.saint.teaching.services.IJxGraduateDabianService;
import com.saint.teaching.sqlWhere.JxGraduateDabianSqlWhere;

/**
*��ע����Ϣ
*����JX_GRADUATE_DABIAN
*��˵���о�������걨
  */
public class JxGraduateDabianAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxGraduateDabianService jxGraduateDabianService;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_GRADUATE_DABIAN
    *��˵���о�������걨
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxGraduateDabian(HttpServletRequest request, HttpServletResponse response, JxGraduateDabianSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxGraduateDabianEntity> entitylist=jxGraduateDabianService.selectListPageJxGraduateDabianBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxGraduateDabian.toString(),Tools.getException(e));
        }
    }

    /**
    *����ע����Ϣ
    *ҳ����ת����
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxGraduateDabianEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxGraduateDabian(request,response,entity);
        }else if(option.equals("edit")){
            updateJxGraduateDabian(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxGraduateDabian(request,response,entity);
        }
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DABIAN,�о�������걨��,������Ϣ
      */
    public void insertJxGraduateDabian(HttpServletRequest request, HttpServletResponse response, JxGraduateDabianEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxGraduateDabianService.insertJxGraduateDabian(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.����()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxGraduateDabian, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxGraduateDabian.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DABIAN,�о�������걨��,�޸�
      */
    public void updateJxGraduateDabian(HttpServletRequest request, HttpServletResponse response, JxGraduateDabianEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxGraduateDabianService.updateJxGraduateDabianByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxGraduateDabian, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxGraduateDabian.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DABIAN,�о�������걨��,ɾ��
      */
    public void deleteJxGraduateDabian(HttpServletRequest request, HttpServletResponse response, JxGraduateDabianEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxGraduateDabianService.deleteJxGraduateDabianByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxGraduateDabian, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxGraduateDabian.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DABIAN,�о�������걨��
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxGraduateDabian(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DABIAN,�о�������걨��
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxGraduateDabian(HttpServletRequest request, HttpServletResponse response, JxGraduateDabianEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxGraduateDabianEntity entityJxGraduateDabianEntity=jxGraduateDabianService.selectJxGraduateDabianByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxGraduateDabianEntity);
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

    public void setJxGraduateDabianService(IJxGraduateDabianService jxGraduateDabianService) {
        this.jxGraduateDabianService = jxGraduateDabianService;
    }

    public IJxGraduateDabianService getJxGraduateDabianService() {
        return jxGraduateDabianService;
    }
}