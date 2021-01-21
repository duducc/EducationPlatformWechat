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
import com.saint.teaching.bean.JxTeachingManusEntity;
import com.saint.teaching.services.IJxTeachingManusService;
import com.saint.teaching.sqlWhere.JxTeachingManusSqlWhere;

/**
*��ע����Ϣ
*����JX_TEACHING_MANUS
*��˵�������ֲ����
  */
public class JxTeachingManusAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxTeachingManusService jxTeachingManusService;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_TEACHING_MANUS
    *��˵�������ֲ����
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxTeachingManusEntity> entitylist=jxTeachingManusService.selectListPageJxTeachingManusBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("code", 0);//�ɹ�   
            jsonMap.put("msg", "��ѯ�ɹ�");//�ɹ�   
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("data", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxTeachingManus.toString(),Tools.getException(e));
        }
    }

    /**
    *����ע����Ϣ
    *ҳ����ת����
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxTeachingManus(request,response,entity);
        }else if(option.equals("edit")){
            updateJxTeachingManus(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxTeachingManus(request,response,entity);
        }
    }

    /**
    *����ע����Ϣ
    *JX_TEACHING_MANUS,�����ֲ�����,������Ϣ
      */
    public void insertJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxTeachingManusService.insertJxTeachingManus(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.����()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxTeachingManus, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxTeachingManus.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_TEACHING_MANUS,�����ֲ�����,�޸�
      */
    public void updateJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxTeachingManusService.updateJxTeachingManusByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxTeachingManus, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxTeachingManus.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_TEACHING_MANUS,�����ֲ�����,ɾ��
      */
    public void deleteJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String manuId=entity.getManuId();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxTeachingManusService.deleteJxTeachingManusByPrimaryKey(manuId);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxTeachingManus, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxTeachingManus.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_TEACHING_MANUS,�����ֲ�����
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxTeachingManus(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_TEACHING_MANUS,�����ֲ�����
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxTeachingManus(HttpServletRequest request, HttpServletResponse response, JxTeachingManusEntity entity) {
        String manuId=entity.getManuId();
        //�޸�ҳ��
        JxTeachingManusEntity entityJxTeachingManusEntity=jxTeachingManusService.selectJxTeachingManusByPrimaryKey(manuId);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxTeachingManusEntity);
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

    public void setJxTeachingManusService(IJxTeachingManusService jxTeachingManusService) {
        this.jxTeachingManusService = jxTeachingManusService;
    }

    public IJxTeachingManusService getJxTeachingManusService() {
        return jxTeachingManusService;
    }
}