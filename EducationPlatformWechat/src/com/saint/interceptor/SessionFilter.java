package com.saint.interceptor;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionFilter extends HttpServlet implements Filter {
	private static final long serialVersionUID = 1L;

	protected String encoding = null;

	protected FilterConfig filterConfig = null;

	protected boolean ignore = false;

	protected String forwardPath = null;

	public void destroy() {
		this.encoding = null; 
		this.filterConfig = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		String requesturi = httpServletRequest.getRequestURI();
		// 通过检查session中的变量，过虑请求
		HttpSession session = httpServletRequest.getSession();
		Object currentUser = session.getAttribute("userSession");
		// 当前会话用户为空而且不是请求登录，退出登录，欢迎页面和根目录则退回到应用的根目录		
		if (currentUser == null && !requesturi.endsWith("/") && 
				!requesturi.endsWith("/login.do") && 
				!requesturi.endsWith("/index.do") && 
				!requesturi.endsWith("/dept.do") && 
				!requesturi.endsWith("/wechatMenuinfo.do") && 
				!requesturi.endsWith("/wechatBind.do") && 
				!requesturi.endsWith("/xfCreditRecord.do") &&
				!requesturi.endsWith("/applyInfo.do") &&
				!requesturi.endsWith("/paymentManage.do") &&
				!requesturi.endsWith("/xfCourse.do") &&
				!requesturi.endsWith("/xfCourseSignup.do") &&
				!requesturi.endsWith("/xfApplyChange.do") &&
				!requesturi.endsWith("/xfProject.do") &&
				!requesturi.endsWith("/xfemployee.do") &&
				!requesturi.endsWith("/xfempregister.do") &&
				!requesturi.endsWith("/xfStudyRegistration.do") &&
				!requesturi.endsWith("/xfcoursetickling.do") &&
				!requesturi.endsWith("/barcodeManage.do")&& 
				!requesturi.endsWith("/kybonus.do")&& 
				!requesturi.endsWith("/kyProject.do")&& 
				!requesturi.endsWith("/kyProjectPlan.do")&& 
				!requesturi.endsWith("/jxStudents.do")&&
				!requesturi.endsWith("/jxSignInfo.do")&& 
				!requesturi.endsWith("/jxstusign.do")&& 
				!requesturi.endsWith("/jxstuleave.do")&& 
				!requesturi.endsWith("/jxstuleaveCheck.do")&& 
				!requesturi.endsWith("/jxLunxun.do")&& 
				!requesturi.endsWith("/sysuser.do")&& 
				!requesturi.endsWith("/jxEvaluateTeacher.do")&&
				!requesturi.endsWith("/jxClassStudents.do")&&
				!requesturi.endsWith("/Jxteacherman.do")&&
				!requesturi.endsWith("/Jxsignerror.do")&&
				!requesturi.endsWith("/JxCourseArrange.do")&&
				!requesturi.endsWith("/jxBreakSchool.do")&&
				!requesturi.endsWith("/JxStuInterPro.do")&&
				!requesturi.endsWith("/jxStudyregistra.do")&&
				!requesturi.endsWith("/jxQuestionnaireTest.do")&&
				!requesturi.endsWith("/jxQuestionnaireAnswer.do")&&
				!requesturi.endsWith("/JxStudentsGrade.do")&&
				!requesturi.endsWith("/jxClass.do")&&
				!requesturi.endsWith("/jxTeachingDbl.do")&&
				!requesturi.endsWith("/error.jsp") && 
				!requesturi.endsWith("/menu.jsp")&& 
				!requesturi.endsWith("Example.jsp")) {
			System.out.println("拦截了："+requesturi);
			httpServletResponse.sendRedirect("login.do?method=exception&errinfo=sessionnull");
			return; 
		} 
		System.out.println("没有拦截");
		chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	protected String selectEncoding(ServletRequest request) {
		return (this.encoding);
	}
}
