package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
import com.saint.teaching.bean.JxClassEntity;
import com.saint.teaching.bean.JxStencilEntity;
import com.saint.teaching.services.IJxStencilService;
import com.saint.teaching.sqlWhere.JxStencilSqlWhere;

/**
*��ע����Ϣ
*����JX_STENCIL
*��˵������ģ��
  */
public class JxStencilAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxStencilService jxStencilService;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_STENCIL
    *��˵������ģ��
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxStencil(HttpServletRequest request, HttpServletResponse response, JxStencilSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//���ܲ���page��rows
            
            String keyword = request.getParameter("keyword");
            if(keyword!=null&&!keyword.equals("")){
            	keyword = new String(keyword.getBytes("ISO-8859-1"), "utf-8");
            }
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage);
            sqlWhere.setName(keyword);
            sqlWhere.setOrderByClause("xh desc");
            List<JxStencilEntity> entitylist=jxStencilService.selectListPageJxStencilBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map 
            jsonMap.put("code", 0);//rows�� ���ÿҳ��¼ list
            jsonMap.put("msg", "");//rows�� ���ÿҳ��¼ list
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("data", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            System.out.println("+++++++++++++++++++++"+new Gson().toJson(jsonMap).toString());
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxStencil.toString(),Tools.getException(e));
        }
    }

    /**
    *����ע����Ϣ
    *ҳ����ת����
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxStencilEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxStencil(request,response,entity);
        }else if(option.equals("edit")){
            updateJxStencil(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxStencil(request,response,entity);
        }
    }

    /**
    *����ע����Ϣ
    *JX_STENCIL,����ģ���,������Ϣ
      */
    public void insertJxStencil(HttpServletRequest request, HttpServletResponse response, JxStencilEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            String xh = jxStencilService.selectListJxStencilBySql("select SQE_JX_STENCIL.nextval from dual").get(0).get("NEXTVAL").toString();
            entity.setXh(xh);
            result = jxStencilService.insertJxStencil(entity);
            if(result.getReturnCode().equals("1")){
//            	processResultImpl.setParentScript("parent.refreshParent();");
            } 
        } catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxStencil.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_STENCIL,����ģ���,�޸�
      */
    public void updateJxStencil(HttpServletRequest request, HttpServletResponse response, JxStencilEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        try {
        	out = response.getWriter();
        	String jsonProjectInfo = request.getParameter("jsonProjectInfo");
    		jsonProjectInfo = URLDecoder.decode(jsonProjectInfo, "utf-8"); 
            entity = JsonUtil.json2Object(jsonProjectInfo, JxStencilEntity.class);
            if(entity.getIsusing()==null||entity.getIsusing().equals(""))
            {
            	entity.setIsusing("0");
            }
        	String gxsj = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        	entity.setUpdatedate(gxsj);
            result = jxStencilService.updateJxStencilByPrimaryKeySelective(entity);
            if(result.getReturnCode().equals("1")){
            	resultMap.put("errorMsg", "upsuccess");
            }
            else{
            	resultMap.put("errorMsg", "upfailed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxStencil.toString(),Tools.getException(e));
        }finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
        	System.out.println(json);
        	out.write(json);
        	if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_STENCIL,����ģ���,ɾ��
      */
    public void deleteJxStencil(HttpServletRequest request, HttpServletResponse response, JxStencilEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        Map<String,Object> resultMap = new HashMap();
        try {
            out = response.getWriter();
            result = jxStencilService.deleteJxStencilByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
            	resultMap.put("errorMsg", "delsuccess");
            }
            else{
            	resultMap.put("errorMsg", "delfailed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxStencil.toString(),Tools.getException(e));
        }finally{
        	String json = new Gson().toJson(resultMap, new TypeToken<Map<String, Object>>(){}.getType());
        	System.out.println(json);
        	out.write(json);
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_STENCIL,����ģ���
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxStencil(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_STENCIL,����ģ���
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxStencil(HttpServletRequest request, HttpServletResponse response, JxStencilEntity entity) {
        String xh=entity.getXh();
        ModelAndView view=new ModelAndView("jx_accessmanage/mytest");
        if(!xh.equals("-1"))
        {
            JxStencilEntity entityJxStencilEntity=jxStencilService.selectJxStencilByPrimaryKey(xh);
            if(entityJxStencilEntity.getIsusing()==null||entityJxStencilEntity.getIsusing().equals("")){
            	entityJxStencilEntity.setIsusing("0");
            }
            view.addObject("entity", entityJxStencilEntity);
            view.addObject("option", "edit");
        }else{
        	view.addObject("option", "add");
        }
        return view;
    }
    
    /***************************************�������ֶ�д�ķ���***********************************************************/
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

    public void setJxStencilService(IJxStencilService jxStencilService) {
        this.jxStencilService = jxStencilService;
    }

    public IJxStencilService getJxStencilService() {
        return jxStencilService;
    }
    
}