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
import com.saint.teaching.bean.JxQuestionnaireAnswerEntity;
import com.saint.teaching.bean.JxQuestionnaireAnswerKey;
import com.saint.teaching.bean.JxStudyRegistrationEntity;
import com.saint.teaching.services.IJxQuestionnaireAnswerService;
import com.saint.teaching.services.IJxStudyRegistrationService;
import com.saint.teaching.sqlWhere.JxQuestionnaireAnswerSqlWhere;
import com.saint.wechat.manager.bean.XfStudyRegistrationEntity;
import com.saint.wechat.manager.services.IWechatBindService;

/**
*类注释信息
*表名JX_QUESTIONNAIRE_ANSWER
*表说明理论课签到
  */
public class JxQuestionnaireAnswerAction extends MultiActionController {
	
    private IFrmZlExlogService frmZlExlogService;

    private ProcessResultImpl processResultImpl;

    private IJxQuestionnaireAnswerService jxQuestionnaireAnswerService;
    
    private IWechatBindService wechatBindService;
    
    private IJxStudyRegistrationService jxStudyRegistrationService;

    /**
    *方法注释信息
    *分页查询表JX_QUESTIONNAIRE_ANSWER
    *表说明理论课签到
    * 实现根据sqlWhere传入的条件查询出信息列表，本方法用于分页查询
    * @param sqlWhere
    * @return
    */
    public void getListPageJxQuestionnaireAnswer(HttpServletRequest request, HttpServletResponse response, JxQuestionnaireAnswerSqlWhere sqlWhere) {
        response.setContentType("text/html; charset=GBK");
        PrintWriter out=null; 
        try{
            int page =Integer.parseInt(request.getParameter("page"));
            int rows = Integer.parseInt(request.getParameter("rows"));//接受参数page和rows
            Page listPage=new Page(rows,page);
            sqlWhere.setListPage(listPage); 
            List<JxQuestionnaireAnswerEntity> entitylist=jxQuestionnaireAnswerService.selectListPageJxQuestionnaireAnswerBySqlWhere(sqlWhere);
            Map<String, Object> jsonMap = new HashMap<String, Object>();//定义map   
            jsonMap.put("total", sqlWhere.getListPage().getTotalResult());//total键 存放总记录数，必须的   
            jsonMap.put("rows", entitylist);//rows键 存放每页记录 list
            out=response.getWriter();
            out.write(new Gson().toJson(jsonMap));
        }catch (Exception e) {
            e.printStackTrace();
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.selectListPageJxQuestionnaireAnswer.toString(),Tools.getException(e));
        }
    }

    /**
    *方法注释信息
    *页面跳转方法
      */
    public void mergeInsertUpdateDelete(HttpServletRequest request, HttpServletResponse response, JxQuestionnaireAnswerEntity entity) {
        String option=request.getParameter("option");
        if(option.equals("add")){
            insertJxQuestionnaireAnswer(request,response,entity);
        }else if(option.equals("edit")){
            updateJxQuestionnaireAnswer(request,response,entity);
        }else if(option.equals("delete")){
            deleteJxQuestionnaireAnswer(request,response,entity);
        }
    }

    /**
    *方法注释信息
    *JX_QUESTIONNAIRE_ANSWER,理论课签到表,插入信息
      */
    public void insertJxQuestionnaireAnswer(HttpServletRequest request,HttpServletResponse response, JxQuestionnaireAnswerEntity entity) {			
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = null;
		ExcuteResult result;
		Map<String, Object> resultMap = new HashMap();	
		try {
			out = response.getWriter();
			String xh = request.getParameter("xh");
			String strQuestList = request.getParameter("questInfo") ;
			strQuestList = URLDecoder.decode(strQuestList, "utf-8"); 
	 		List<JxQuestionnaireAnswerEntity> qeList = JsonUtil.json2ObjectList(strQuestList, JxQuestionnaireAnswerEntity.class) ; 
	 		int s = 0;
			for(int i=0;i<qeList.size();i++){
				entity = qeList.get(i);
				result = jxQuestionnaireAnswerService.insertJxQuestionnaireAnswer(entity);
				if (result.getReturnCode().equals("1")) {
					s ++;
				}
			}
			if (s==qeList.size()) {
				resultMap.put("cueMessage", "success");
				JxStudyRegistrationEntity record = new JxStudyRegistrationEntity();
        		record.setXh(xh);
        		record.setRemarks3("1");
        		jxStudyRegistrationService.updateJxStudyRegistrationByPrimaryKeySelective(record);
			} else {
				resultMap.put("cueMessage", "failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			frmZlExlogService.saveFrmZlExlog(request,FrmGnid.insertJxCoursePlan.toString(),Tools.getException(e));									
			resultMap.put("cueMessage", "error");
		} finally {
			String json = new Gson().toJson(resultMap,new TypeToken<Map<String, Object>>() {}.getType());									
			out.write(json);
			if (out != null)
				out.close();
		}
	}
    /**
    *方法注释信息
    *JX_QUESTIONNAIRE_ANSWER,理论课签到表,修改
      */
    public void updateJxQuestionnaireAnswer(HttpServletRequest request, HttpServletResponse response, JxQuestionnaireAnswerEntity entity) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxQuestionnaireAnswerService.updateJxQuestionnaireAnswerByPrimaryKey(entity);
            if(result.getReturnCode().equals("1")){
                //	processResultImpl.setParentScript("parent.initUpdate();parent.backPrimary('"+entity.get主键+"');");
            }
            processResultImpl.processResult(request, result, FrmGnid.updateJxQuestionnaireAnswer, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('save_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.updateJxQuestionnaireAnswer.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_QUESTIONNAIRE_ANSWER,理论课签到表,删除
      */
    public void deleteJxQuestionnaireAnswer(HttpServletRequest request, HttpServletResponse response, JxQuestionnaireAnswerKey key) {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = null;
        ExcuteResult result;
        try {
            out = response.getWriter();
            result = jxQuestionnaireAnswerService.deleteJxQuestionnaireAnswerByPrimaryKey(key);
            if(result.getReturnCode().equals("1")){
                processResultImpl.setParentScript("parent.deleteDone();");
            }
            processResultImpl.processResult(request, result, FrmGnid.deleteJxQuestionnaireAnswer, out);
        } catch (Exception e) {
            e.printStackTrace();
            processResultImpl.processExceptionResult(Tools.getException(e), out,"parent.show_btn('delete_btn');");
            frmZlExlogService.saveFrmZlExlog(request,FrmGnid.deleteJxQuestionnaireAnswer.toString(),Tools.getException(e));
        }finally{
            if(out!=null)out.close();
        }
    }

    /**
    *方法注释信息
    *JX_QUESTIONNAIRE_ANSWER,理论课签到表
    *跳转到新增页面
      */
    public ModelAndView toCreateAddPageJxQuestionnaireAnswer(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=utf-8");
        //新增页面
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "add");
        return view;
    }

    /**
    *方法注释信息
    *JX_QUESTIONNAIRE_ANSWER,理论课签到表
    *跳转到修改页面
      */
    public ModelAndView toCreateUpdatePageJxQuestionnaireAnswer(HttpServletRequest request, HttpServletResponse response, JxQuestionnaireAnswerKey key) {
        //修改页面
        JxQuestionnaireAnswerEntity entityJxQuestionnaireAnswerEntity=jxQuestionnaireAnswerService.selectJxQuestionnaireAnswerByPrimaryKey(key);
        ModelAndView view=new ModelAndView("jsp文件夹/jsp页面名称_edit");
        view.addObject("option", "edit");
        view.addObject("entity", entityJxQuestionnaireAnswerEntity);
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

    public void setJxQuestionnaireAnswerService(IJxQuestionnaireAnswerService jxQuestionnaireAnswerService) {
        this.jxQuestionnaireAnswerService = jxQuestionnaireAnswerService;
    }

    public IJxQuestionnaireAnswerService getJxQuestionnaireAnswerService() {
        return jxQuestionnaireAnswerService;
    }

	public IWechatBindService getWechatBindService() {
		return wechatBindService;
	}

	public void setWechatBindService(IWechatBindService wechatBindService) {
		this.wechatBindService = wechatBindService;
	}

	public IJxStudyRegistrationService getJxStudyRegistrationService() {
		return jxStudyRegistrationService;
	}

	public void setJxStudyRegistrationService(
			IJxStudyRegistrationService jxStudyRegistrationService) {
		this.jxStudyRegistrationService = jxStudyRegistrationService;
	}
    
    
}