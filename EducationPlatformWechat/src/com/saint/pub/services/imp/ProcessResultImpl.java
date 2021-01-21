package com.saint.pub.services.imp;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import com.saint.pub.database.ExcuteResult;
import com.saint.systemManager.services.IFrmZlExlogService;
import com.saint.systemManager.services.IFrmZlLogService;


public class ProcessResultImpl {
	private IFrmZlLogService frmZlLogService;
	private IFrmZlExlogService frmZlExlogService;
	private String parentScript="";
	private String logInfo;
	
	public void processResult(HttpServletRequest request,ExcuteResult result,Enum gnid){
				if(Integer.parseInt(result.getReturnCode())>-1){
					frmZlLogService.saveFrmZlLog(request, gnid.toString(), result.getReturnMessage());
			}else{//异常信息日志		
					frmZlExlogService.saveFrmZlExlog(request, gnid.toString(), result.getReturnMessage());
			}
				this.logInfo="";
	}
	
	public void processResult(HttpServletRequest request,ExcuteResult result,String str){
		if(Integer.parseInt(result.getReturnCode())>-1){
			frmZlLogService.saveFrmZlLog(request, str, result.getReturnMessage());
	}else{//异常信息日志		
			frmZlExlogService.saveFrmZlExlog(request, str, result.getReturnMessage());
	}
		this.logInfo="";
}

	public void processScript(String script,PrintWriter out){
		StringBuffer sb=new StringBuffer();
		sb.append("<script>");
		sb.append(script);
		sb.append("</script>");
//System.err.println(sb.toString());
System.out.println(sb.toString());
		out.println(sb.toString());
		this.parentScript="";
	}
	/**
	 * 弹出信息框
	 * @param request
	 * @param result
	 * @param gnid
	 * @param out processService.processResult(request, result, FrmGnid.addTunnel, out);
	 */
	public void processResult(HttpServletRequest request,ExcuteResult result,Enum gnid,PrintWriter out){
		processResult(request,result, gnid);
		StringBuffer _script=new StringBuffer(this.parentScript);
		String mesType=Integer.parseInt(result.getReturnCode())==-1?"error":Integer.parseInt(result.getReturnCode())==0?"warning":"info";
		String exMess = result.getExcepMessage()==null?"":result.getExcepMessage();
		_script.append("parent.showProcessMessage('"+gnid.toString() + result.getReturnMessage()+exMess+"','"+mesType+"');");
		processScript(_script.toString(),out);
	}
	/**
	 * 弹出信息框
	 * @param request
	 * @param result
	 * @param gnid
	 * @param out processService.processResult(request, result, FrmGnid.addTunnel, out);
	 */
	public void processResult(HttpServletRequest request,ExcuteResult result,String str,PrintWriter out){
		processResult(request,result, str);
		StringBuffer _script=new StringBuffer(this.parentScript);
		String mesType=Integer.parseInt(result.getReturnCode())==-1?"error":Integer.parseInt(result.getReturnCode())==0?"warning":"info";
		String exMess = result.getExcepMessage()==null?"":result.getExcepMessage();
		_script.append("parent.showProcessMessage('"+str + result.getReturnMessage()+exMess+"','"+mesType+"');");
		processScript(_script.toString(),out);
	}
	/**
	 * catch的异常信息弹出框
	 * @param request
	 * @param exceptionMessage
	 * @param out
	 */
	public void processExceptionResult(String exceptionMessage,PrintWriter out,String scriptstr){
		StringBuffer _script=new StringBuffer(this.parentScript);
		_script.append("parent.showProcessMessage('"+exceptionMessage+"','error');"+scriptstr+"");
		processScript(_script.toString(),out);
	}
	public void processResult(HttpServletRequest request,ExcuteResult result,Enum gnid,PrintWriter out,String bs){
		if(!bs.equals("") || bs!=null){
			processResult(request,result, gnid);
			StringBuffer _script=new StringBuffer();
			String mesType=Integer.parseInt(result.getReturnCode())==-1?"error":Integer.parseInt(result.getReturnCode())==0?"warning":"info";
			_script.append("parent.showProcessMessage1('"+gnid.toString() + result.getReturnMessage()+"','"+mesType+"');");
		//	_script.append(this.parentScript+"}");
			processScript(_script.toString(),out);
		}
	}
	
	
	
	public IFrmZlLogService getFrmZlLogService() {
		return frmZlLogService;
	}
	public void setFrmZlLogService(IFrmZlLogService frmZlLogService) {
		this.frmZlLogService = frmZlLogService;
	}
	public IFrmZlExlogService getFrmZlExlogService() {
		return frmZlExlogService;
	}
	public void setFrmZlExlogService(IFrmZlExlogService frmZlExlogService) {
		this.frmZlExlogService = frmZlExlogService;
	}
	public String getParentScript() {
		return parentScript;
	}
	public void setParentScript(String parentScript) {
		this.parentScript = parentScript;
	}
	public String getLogInfo() {
		return logInfo;
	}
	public void setLogInfo(String logInfo) {
		this.logInfo = logInfo;
	}
	
}
