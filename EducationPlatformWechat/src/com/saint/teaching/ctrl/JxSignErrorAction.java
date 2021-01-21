package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
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
import com.saint.teaching.bean.JxSignErrorEntity;
import com.saint.teaching.bean.JxSignInfoEntity;
import com.saint.teaching.bean.JxStudentsEntity;
import com.saint.teaching.services.IJxSignErrorService;
import com.saint.teaching.sqlWhere.JxSignErrorSqlWhere;

/**
*��ע����Ϣ
*����JX_SIGN_ERROR
*��˵��ѧ��ǩ��ʧ����־
  */
public class JxSignErrorAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxSignErrorService jxSignErrorService;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_SIGN_ERROR
    *��˵��ѧ��ǩ��ʧ����־
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxSignError(HttpServletRequest request, HttpServletResponse response, JxSignErrorSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxSignErrorEntity> entitylist=jxSignErrorService.selectListPageJxSignErrorBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxSignError.toString(),Tools.getException(e));
        }
    }

    /**
    *����ע����Ϣ
    *ҳ����ת����
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxSignErrorEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxSignError(request,response,entity);
        }else if(option.equals("edit")){
            updateJxSignError(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxSignError(request,response,entity);
        }
    }

    /**
     * ���ǩ��ʧ����־��ywq��
     * @param request
     * @param response
     * @param entity
     */
    public void insertJxSignError(HttpServletRequest request, HttpServletResponse response,JxSignErrorEntity entity){
    	response.setContentType("text/html; charset=GBK");
    	PrintWriter out = null;
    	ExcuteResult result;
    	Map<String,Object> resultMap = new HashMap();
    	try {
    		out = response.getWriter();
    		String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    		String errorinfo = request.getParameter("errorinfo");
    		errorinfo = URLDecoder.decode(errorinfo, "utf-8"); 
            entity = JsonUtil.json2Object(errorinfo, JxSignErrorEntity.class);
            entity.setSigntime(gxsj);
            result = jxSignErrorService.insertJxSignError(entity);
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
    *����ע����Ϣ
    *JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,�޸�
      */
    public void updateJxSignError(HttpServletRequest request, HttpServletResponse response, JxSignErrorEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxSignErrorService.updateJxSignErrorByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxSignError, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxSignError.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��,ɾ��
      */
    public void deleteJxSignError(HttpServletRequest request, HttpServletResponse response, JxSignErrorEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxSignErrorService.deleteJxSignErrorByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxSignError, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxSignError.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxSignError(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_SIGN_ERROR,ѧ��ǩ��ʧ����־��
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxSignError(HttpServletRequest request, HttpServletResponse response, JxSignErrorEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxSignErrorEntity entityJxSignErrorEntity=jxSignErrorService.selectJxSignErrorByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxSignErrorEntity);
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

    public void setJxSignErrorService(IJxSignErrorService jxSignErrorService) {
        this.jxSignErrorService = jxSignErrorService;
    }

    public IJxSignErrorService getJxSignErrorService() {
        return jxSignErrorService;
    }
}