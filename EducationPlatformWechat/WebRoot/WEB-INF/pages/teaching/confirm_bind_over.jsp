<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>确认注销</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
  </head>
  
  <body>
  	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<div class="weui_tab_bd">
	        <!-- 标题 -->
	        <header class='demos-header'>
	            <h1 class="demos-title">您是否确认注销？</h1>
	        </header>
	        <!-- 内容展现 -->
	        <div class="weui_cells weui_cells_form">
		        <div class='demos-content-padded'>
		        	<!-- <img  src="images/studentEnter.png" style="width:100%;" onclick="toSelfPage('1')">
		        	<img  src="images/doctorEnter.png" style="width:100%; margin-top:10px;" onclick="toSelfPage('2')"> -->
		            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary" onclick="toSelfPage('1')">确认注销</a>
		            <a style="background-color: #1AA094;" class="weui_btn weui_btn_primary" onclick="toSelfPage('2')">取消注销</a>
		        </div>
	    	</div>
	</div>
	
   
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <script src="js/jquery-2.1.4.js"></script>
    
    
  </body>
  <script src="layer/layer.js" charset="utf-8"></script>
	<script src="js/jquery-2.1.4.js"></script>
  <script type="text/javascript">
  	function toSelfPage(s){
  	var layer = layui.layer;
		var clientsxh = $("#clientsxh").val();
		var openid = $("#openid").val();
		if(s=="2"){
		  	 WeixinJSBridge.call('closeWindow');
		}else if(s=="1"){
		  	window.location.href="wechatBind.do?method=toBindOverPage&clientsxh="+clientsxh+"&openid="+openid;		
		}
										
 	}
  </script>
</html>
