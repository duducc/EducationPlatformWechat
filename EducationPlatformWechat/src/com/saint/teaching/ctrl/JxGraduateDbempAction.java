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
import com.saint.teaching.bean.JxGraduateDbempEntity;
import com.saint.teaching.services.IJxGraduateDbempService;
import com.saint.teaching.sqlWhere.JxGraduateDbempSqlWhere;

/**
*��ע����Ϣ
*����JX_GRADUATE_DBEMP
*��˵���о������μ���Ա
  */
public class JxGraduateDbempAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxGraduateDbempService jxGraduateDbempService;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_GRADUATE_DBEMP
    *��˵���о������μ���Ա
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxGraduateDbemp(HttpServletRequest request, HttpServletResponse response, JxGraduateDbempSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxGraduateDbempEntity> entitylist=jxGraduateDbempService.selectListPageJxGraduateDbempBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxGraduateDbemp.toString(),Tools.getException(e));
        }
    }

    /**
    *����ע����Ϣ
    *ҳ����ת����
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxGraduateDbempEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxGraduateDbemp(request,response,entity);
        }else if(option.equals("edit")){
            updateJxGraduateDbemp(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxGraduateDbemp(request,response,entity);
        }
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DBEMP,�о������μ���Ա��,������Ϣ
      */
    public void insertJxGraduateDbemp(HttpServletRequest request, HttpServletResponse response, JxGraduateDbempEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxGraduateDbempService.insertJxGraduateDbemp(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.����()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxGraduateDbemp, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxGraduateDbemp.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DBEMP,�о������μ���Ա��,�޸�
      */
    public void updateJxGraduateDbemp(HttpServletRequest request, HttpServletResponse response, JxGraduateDbempEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxGraduateDbempService.updateJxGraduateDbempByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxGraduateDbemp, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxGraduateDbemp.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DBEMP,�о������μ���Ա��,ɾ��
      */
    public void deleteJxGraduateDbemp(HttpServletRequest request, HttpServletResponse response, JxGraduateDbempEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxGraduateDbempService.deleteJxGraduateDbempByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxGraduateDbemp, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxGraduateDbemp.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DBEMP,�о������μ���Ա��
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxGraduateDbemp(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_GRADUATE_DBEMP,�о������μ���Ա��
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxGraduateDbemp(HttpServletRequest request, HttpServletResponse response, JxGraduateDbempEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxGraduateDbempEntity entityJxGraduateDbempEntity=jxGraduateDbempService.selectJxGraduateDbempByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxGraduateDbempEntity);
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

    public void setJxGraduateDbempService(IJxGraduateDbempService jxGraduateDbempService) {
        this.jxGraduateDbempService = jxGraduateDbempService;
    }

    public IJxGraduateDbempService getJxGraduateDbempService() {
        return jxGraduateDbempService;
    }
}