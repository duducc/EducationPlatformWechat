package com.saint.wechat.manager.ctrl;

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
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfCourseTicklingEntity;
import com.saint.wechat.manager.bean.XfCourseTicklingKey;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.services.IXfCourseService;
import com.saint.wechat.manager.services.IXfCourseTicklingService;
import com.saint.wechat.manager.services.IXfStudyRegistrationService;
import com.saint.wechat.manager.sqlWhere.XfCourseTicklingSqlWhere;

/**
*��ע����Ϣ
*����XF_COURSE_TICKLING
*��˵���γ���ϢѧԱ����
  */
public class XfCourseTicklingAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IXfCourseTicklingService xfCourseTicklingService;
    
    private IXfCourseService xfCourseService;

    private IXfStudyRegistrationService xfStudyRegistrationService;
    /**
    *����ע����Ϣ
    *XF_COURSE_TICKLING,�γ���ϢѧԱ������,������Ϣ
    */
    public void insertXfCourseTickling(HttpServletRequest request, HttpServletResponse response, XfCourseTicklingEntity entity) throws UnsupportedEncodingException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        Map<String, Object> resultMap = new HashMap<String, Object>();
        try {
        	out = response.getWriter();
        	String xh = request.getParameter("xh");
        	String ticklings = request.getParameter("ticklings");
        	ticklings = URLDecoder.decode(ticklings, "UTF-8");
            entity = JsonUtil.json2Object(ticklings, XfCourseTicklingEntity.class);
	        String dateNowStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	        entity.setAddtime(dateNowStr);
        	result = xfCourseTicklingService.insertXfCourseTickling(entity);
        	if(result.getReturnCode().equals("1")){
        		resultMap.put("errorMsg", "success");
        		XfStudyRegistrationEntity record = new XfStudyRegistrationEntity();
        		record.setXh(xh);
        		record.setRemarks3("1");
        		xfStudyRegistrationService.updateXfStudyRegistrationByPrimaryKeySelective(record);
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
    *XF_COURSE_TICKLING,�γ���ϢѧԱ������,�޸�
      */
    public void updateXfCourseTickling(HttpServletRequest request, HttpServletResponse response, XfCourseTicklingEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfCourseTicklingService.updateXfCourseTicklingByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateXfCourseTickling, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateXfCourseTickling.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *XF_COURSE_TICKLING,�γ���ϢѧԱ������,ɾ��
      */
    public void deleteXfCourseTickling(HttpServletRequest request, HttpServletResponse response, XfCourseTicklingKey key) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = xfCourseTicklingService.deleteXfCourseTicklingByPrimaryKey(key);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteXfCourseTickling, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteXfCourseTickling.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *XF_COURSE_TICKLING,�γ���ϢѧԱ������
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageXfCourseTickling(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *XF_COURSE_TICKLING,�γ���ϢѧԱ������
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageXfCourseTickling(HttpServletRequest request, HttpServletResponse response, XfCourseTicklingKey key) {
        //�޸�ҳ��
        XfCourseTicklingEntity entityXfCourseTicklingEntity=xfCourseTicklingService.selectXfCourseTicklingByPrimaryKey(key);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityXfCourseTicklingEntity);
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

    public void setXfCourseTicklingService(IXfCourseTicklingService xfCourseTicklingService) {
        this.xfCourseTicklingService = xfCourseTicklingService;
    }

    public IXfCourseTicklingService getXfCourseTicklingService() {
        return xfCourseTicklingService;
    }
	public IXfCourseService getXfCourseService() {
		return xfCourseService;
	}
	public void setXfCourseService(IXfCourseService xfCourseService) {
		this.xfCourseService = xfCourseService;
	}
	public IXfStudyRegistrationService getXfStudyRegistrationService() {
		return xfStudyRegistrationService;
	}
	public void setXfStudyRegistrationService(
			IXfStudyRegistrationService xfStudyRegistrationService) {
		this.xfStudyRegistrationService = xfStudyRegistrationService;
	}
    
    
}