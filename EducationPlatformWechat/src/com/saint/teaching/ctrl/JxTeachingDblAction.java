package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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
import com.saint.teaching.bean.JxTeachingDblEntity;
import com.saint.teaching.bean.JxTeachingManualsEntity;
import com.saint.teaching.services.IJxTeachingDblService;
import com.saint.teaching.sqlWhere.JxTeachingDblSqlWhere;
import com.saint.teaching.sqlWhere.JxTeachingManualsSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.services.IWechatBindService;

/**
*��ע����Ϣ
*����JX_TEACHING_DBL
*��˵������
  */
public class JxTeachingDblAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxTeachingDblService jxTeachingDblService;
    
    private IWechatBindService wechatBindService;

    /**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_TEACHING_DBL
    *��˵������
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxTeachingDbl(HttpServletRequest request, HttpServletResponse response, JxTeachingDblSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("limit"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxTeachingDblEntity> entitylist=jxTeachingDblService.selectListPageJxTeachingDblBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("code", 0);//�ɹ�   
            jsonMap.put("msg", "��ѯ�ɹ�");//�ɹ�   
            jsonMap.put("count", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("data", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxTeachingDbl.toString(),Tools.getException(e));
        }
    }


    /**
    *����ע����Ϣ
    *JX_TEACHING_DBL,������,������Ϣ
      */
    public void insertJxTeachingDbl(HttpServletRequest request, HttpServletResponse response, JxTeachingDblEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            out = response.getWriter();
        	String openid = request.getParameter("openid");
        	String clientsxh = request.getParameter("clientsxh");
        	WechatBindEntity bindinfo = wechatBindService.getBindInfo(openid,clientsxh);
        	String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) ;	
            String Info = request.getParameter("Info") ;
            Info = URLDecoder.decode(Info, "utf-8"); 
            entity = JsonUtil.json2Object(Info, JxTeachingDblEntity.class);
            entity.setCreditdate(date);
            String xh = UUID.randomUUID().toString().replaceAll("-", "");
            entity.setXh(xh);
            result = jxTeachingDblService.insertJxTeachingDbl(entity);
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
    *JX_TEACHING_DBL,������,�޸�
      */
    public void updateJxTeachingDbl(HttpServletRequest request, HttpServletResponse response, JxTeachingDblEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            out = response.getWriter();
            String Info = request.getParameter("Info") ;
            Info = URLDecoder.decode(Info, "utf-8"); 
            entity = JsonUtil.json2Object(Info, JxTeachingDblEntity.class);
            entity.setZttime(entity.getZttime().substring(0,10));
            result = jxTeachingDblService.updateJxTeachingDblByPrimaryKeySelective(entity);
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
    *JX_TEACHING_DBL,������,ɾ��
      */
    public void deleteJxTeachingDbl(HttpServletRequest request, HttpServletResponse response, JxTeachingDblEntity entity) {
    	response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
            out = response.getWriter();
        	String xh = request.getParameter("xh");
            result = jxTeachingDblService.deleteJxTeachingDblByPrimaryKey(xh);
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
     *��ҳ��ѯ��JX_TEACHING_MANUALS
     *��˵��ʵϰ�������ֲ��¼
     * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
     * @param sqlWhere
     * @return
     */
     public void getListJxTeachingManuals(HttpServletRequest request, HttpServletResponse response, JxTeachingDblSqlWhere sqlWhere) {
         response.setContentType("text/html; charset=GBK");
         PrintWriter out=null; 
         try{
         	String stuid = request.getParameter("stuid");
         	String deptid = request.getParameter("deptid");
         	String zttime = request.getParameter("zttime");
         	if(zttime==null||zttime.equals("")){
         		zttime = "";
         	}else{
         		zttime = zttime+"-01";
         	}
         	sqlWhere.setDeptid(deptid);
         	sqlWhere.setZttime(zttime);
         	sqlWhere.setStuId(stuid);
            List<JxTeachingDblEntity> entitylist=jxTeachingDblService.selectListJxTeachingDblBySqlWhere(sqlWhere);
             out=response.getWriter();
             out.write(new Gson().toJson(entitylist));
         }catch (Exception e) {
             e.printStackTrace();
             frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxTeachingManuals.toString(),Tools.getException(e));
         }
     }
    /**
    *����ע����Ϣ
    *JX_TEACHING_DBL,������
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxTeachingDbl(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_TEACHING_DBL,������
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxTeachingDbl(HttpServletRequest request, HttpServletResponse response, JxTeachingDblEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxTeachingDblEntity entityJxTeachingDblEntity=jxTeachingDblService.selectJxTeachingDblByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxTeachingDblEntity);
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

    public void setJxTeachingDblService(IJxTeachingDblService jxTeachingDblService) {
        this.jxTeachingDblService = jxTeachingDblService;
    }

    public IJxTeachingDblService getJxTeachingDblService() {
        return jxTeachingDblService;
    }

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
    
    
}