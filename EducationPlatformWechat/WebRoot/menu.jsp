<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'menu.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="wechatMenuinfo.do" method="post">
    	<input type="hidden" name="method" value="create" />
    	<input type="text" name="clientsxh" />
    	<input type="submit" value="生成" />
    </form>
  </body>
</html>
