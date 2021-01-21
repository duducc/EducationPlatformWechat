package com.saint.teaching.ctrl;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
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
import com.saint.systemManager.bean.FrmDepartmentEntity;
import com.saint.systemManager.services.IFrmDepartmentService;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.teaching.bean.JxBreakSchoolEntity;
import com.saint.teaching.bean.JxStudentLeaveEntity;
import com.saint.teaching.services.IJxBreakSchoolService;
import com.saint.teaching.sqlWhere.JxBreakSchoolSqlWhere;
import com.saint.teaching.sqlWhere.JxStudentLeaveSqlWhere;
import com.saint.wechat.manager.bean.WechatBindEntity;
import com.saint.wechat.manager.bean.XfCourseEntity;
import com.saint.wechat.manager.bean.XfCreditRecordEntity;
import com.saint.wechat.manager.bean.XfEmployeeEntity;
import com.saint.wechat.manager.bean.XfProjectEntity;
import com.saint.wechat.manager.services.IWechatBindService;
import com.saint.wechat.manager.services.IXfEmployeeService;
import com.saint.wechat.manager.sqlWhere.XfCreditRecordSqlWhere;

/**
*��ע����Ϣ
*����JX_BREAKSCHOOL
*��˵��ѧ��Υ�͵Ǽ�
  */
public class JxBreakSchoolAction extends MultiActionController {
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxBreakSchoolService jxBreakSchoolService;
    
    private IWechatBindService wechatBindService;
    
    private IXfEmployeeService xfEmployeeService;
    
    private IFrmDepartmentService frmDepartmentService;
    


	/**
    *����ע����Ϣ
    *��ҳ��ѯ��JX_BREAKSCHOOL
    *��˵��ѧ��Υ�͵Ǽ�
    * ʵ�ָ���sqlWhere�����������ѯ����Ϣ�б����������ڷ�ҳ��ѯ
    * @param sqlWhere
    * @return
    */
    public void getListPageJxBreakSchool(HttpServletRequest request, HttpServletResponse response, JxBreakSchoolSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//���ܲ���page��rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxBreakSchoolEntity> entitylist=jxBreakSchoolService.selectListPageJxBreakSchoolBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//����map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total�� ����ܼ�¼���������   
            jsonMap.put("rows", entitylist);//rows�� ���ÿҳ��¼ list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxBreakSchool.toString(),Tools.getException(e));
        }
    }
    /**
     * ��ѯ����Υ����Ϣ
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void selectMinejxBreakSchool(HttpServletRequest request, HttpServletResponse response, JxBreakSchoolSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
        	String opdate = request.getParameter("opdate");
        	String state = request.getParameter("state");
        	String userid = request.getParameter("userid");
        	sqlWhere.setOpdate(opdate);
        	sqlWhere.setState(state);
        	sqlWhere.setStuid(userid);
            List<JxBreakSchoolEntity> entitylist=jxBreakSchoolService.selectListJxBreakSchoolBySqlWhere(sqlWhere);
            out=response.getWriter();
            out.write(new Gson().toJson(entitylist));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxBreakSchool.toString(),Tools.getException(e));
        }
    }
    /**
    *����ע����Ϣ
    *ҳ����ת����
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxBreakSchoolEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxBreakSchool(request,response,entity);
        }else if(option.equals("edit")){
            updateJxBreakSchool(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxBreakSchool(request,response,entity);
        }
    }
    
    
    /**
    *����ע����Ϣ
    *JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,������Ϣ
      */
    public void insertJxBreakSchool(HttpServletRequest request, HttpServletResponse response, JxBreakSchoolEntity entity) {
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxBreakSchoolService.insertJxBreakSchool(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.����()+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.insertJxBreakSchool, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxBreakSchool.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,�޸�
      */
    public void updateJxBreakSchool(HttpServletRequest request, HttpServletResponse response, JxBreakSchoolEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxBreakSchoolService.updateJxBreakSchoolByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get����+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxBreakSchool, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxBreakSchool.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *����ע����Ϣ
    *JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�,ɾ��
      */
    public void deleteJxBreakSchool(HttpServletRequest request, HttpServletResponse response, JxBreakSchoolEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        String xh=entity.getXh();
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxBreakSchoolService.deleteJxBreakSchoolByPrimaryKey(xh);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxBreakSchool, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxBreakSchool.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }
    
    /**
     * ����ע����Ϣ
     * JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�
     * ��ת���ҵ�Υ����Ϣҳ��
     * @param request
     * @param response
     * @return
     */
    
    public ModelAndView toMineBreakInfo(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String openId = request.getParameter("openid");
    		String clientsxh = request.getParameter("clientsxh");
    		WechatBindEntity bindinfo = wechatBindService.getBindInfo(openId, clientsxh);
			view = new ModelAndView("teaching/mine_wj");
			view.addObject("yhdh", bindinfo.getYitongCard());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    public ModelAndView toMinuteBreakSchoolPage(HttpServletRequest request, HttpServletResponse response){
    	ModelAndView view = null;
    	try {
    		String xh = request.getParameter("xh");
    		String userid = request.getParameter("userid");
    		JxBreakSchoolEntity entity = jxBreakSchoolService.selectJxBreakSchoolByPrimaryKey(xh);
			view = new ModelAndView("teaching/mine_wj_info");
			view.addObject("entity", entity);
			view.addObject("userid", userid);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return view;
    }
    
    /**
     * ������stuid��ѯ��Υ������Ϣ
     * @param request
     * @param response
     * @param sqlWhere
     */
    public void getMinewjInfo(HttpServletRequest request,HttpServletResponse response,JxBreakSchoolSqlWhere sqlWhere){
    	response.setContentType("text/html;charset=GBK");
    	PrintWriter out = null;
    	try {
    	out = response.getWriter();
    	String stuid = request.getParameter("stuid");
    	sqlWhere.setStuid(stuid);
    	List<JxBreakSchoolEntity> list = jxBreakSchoolService.selectListJxBreakSchoolBySqlWhere(sqlWhere);
    	out.write(new Gson().toJson(list));
    	}catch (Exception e) {
			e.printStackTrace();
			frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageXfStudyRegistration.toString(),Tools.getException(e));
		}
    }
    
    /**
     * Υ������Ϣ
     * @param request
     * @param response
     * @return
     */
    public ModelAndView selectJxBreakSchoolByPrimaryKey(HttpServletRequest request, HttpServletResponse response){
    	response.setContentType("text/html; charset=utf-8");
    	ModelAndView view = null;
    		String xh = request.getParameter("xh");
    		JxBreakSchoolEntity entity = jxBreakSchoolService.selectJxBreakSchoolByPrimaryKey(xh);
			view = new ModelAndView("teaching/mine_wj_info");
			view.addObject("entity", entity);
			return view;
		} 
    	
    /**
    *����ע����Ϣ
    *JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�
    *��ת������ҳ��
      */
    public ModelAndView toCreateAddPageJxBreakSchool(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //����ҳ��
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *����ע����Ϣ
    *JX_BREAKSCHOOL,ѧ��Υ�͵ǼǱ�
    *��ת���޸�ҳ��
      */
    public ModelAndView toCreateUpdatePageJxBreakSchool(HttpServletRequest request, HttpServletResponse response, JxBreakSchoolEntity entity) {
        String xh=entity.getXh();
        //�޸�ҳ��
        JxBreakSchoolEntity entityJxBreakSchoolEntity=jxBreakSchoolService.selectJxBreakSchoolByPrimaryKey(xh);
        ModelAndView view=new ModelAndView("jsp�ļ���/jspҳ������_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxBreakSchoolEntity);
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

    public void setJxBreakSchoolService(IJxBreakSchoolService jxBreakSchoolService) {
        this.jxBreakSchoolService = jxBreakSchoolService;
    }

    public IJxBreakSchoolService getJxBreakSchoolService() {
        return jxBreakSchoolService;
    }

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}
	public IXfEmployeeService getXfEmployeeService() {
		return xfEmployeeService;
	}
	public void setXfEmployeeService(IXfEmployeeService xfEmployeeService) {
		this.xfEmployeeService = xfEmployeeService;
	}
	public IFrmDepartmentService getFrmDepartmentService() {
		return frmDepartmentService;
	}
	public void setFrmDepartmentService(IFrmDepartmentService frmDepartmentService) {
		this.frmDepartmentService = frmDepartmentService;
	}
    
	
}