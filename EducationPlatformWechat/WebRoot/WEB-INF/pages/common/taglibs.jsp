
<%@ page import="com.saint.constant.FWConstants"%>
<%
	response.setHeader("Pragma","No-Cache");
	response.setHeader("Cache-Control","No-Cache");
	response.setDateHeader("Expires", 0);

%>

	
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<c:set var="url" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${ctx}" />
<c:set var="title" value="<%=FWConstants.TITLE %>" />
