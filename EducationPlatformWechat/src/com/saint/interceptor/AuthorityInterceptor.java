package com.saint.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class AuthorityInterceptor implements HandlerInterceptor
{
	  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	    throws Exception
	  {
		  System.out.println("·ÃÎÊÂ·¾¶£º"+handler.getClass().getName());
	   /* if((handler.getClass().getName().indexOf("LoginAction") >= 0) || 
	      (handler.getClass().getName().indexOf("SysmanagerAction") >= 0))
	    {
	      return true; 
	    }
	    UserSession userSession = (UserSession)request.getSession().getAttribute("userSession");
	    if (userSession == null) {
	      sendRedirect(request, response);
	      return false;
	    }else{
	    }*/
	    return true;
	  }

	  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
	  {
	  }

	  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
	  {
	  }

	  private void sendRedirect(HttpServletRequest request, HttpServletResponse response) {
	    try {
	      response.sendRedirect("login.do?method=exception&errinfo=sessionnull");
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
}