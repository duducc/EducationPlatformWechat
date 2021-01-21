<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>扫码结果</title>
    
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>

  </head>
  
  <body>
  <input type="hidden" id="status" value="${Stste}">
  <img id="myImage" style="width:28%; margin-left:36%; display:none;" src="images/finash.png">
  <p id="statusText" style="width:100%; text-align:center; font-size:25px; margin-top:10px;"></p>
  <p style="width:90%; margin-left:5%; text-align:center; font-size:16px; margin-top:10px;">${Message}</p>
    <p onclick="closeWindows()" id="buttons" style="margin-top:80px;text-align:center; line-height:42px; width:70%; margin-left:15%; height:42px; border-radius:21px; color:#fff; font-size:20px;">完成</p>
    <script type="text/javascript">
    	$(document).ready(function(){ 
			var height = $(document.body).height();
			var imgwidth = $("#myImage").width();
			$("#myImage").css("margin-top", (height-imgwidth)/6+"px");
			if($("#status").val()=="file"){
				$("#myImage").attr("src","images/fail.png");
				$("#statusText").text("打卡失败！");
				$("#buttons").css("background-color","#fc3f3f");
				$("#myImage").css("display","block");
			}else if($("#status").val()=="success"){
				$("#myImage").attr("src","images/finash.png");
				$("#statusText").text("恭喜你！打卡成功");
				$("#buttons").css("background-color","#47d973");
				$("#myImage").css("display","block");
				/* setTimeout("WeixinJSBridge.call('closeWindow')",1500); */
			}else{
				$("#myImage").attr("src","images/ggxxfb.png");
				$("#statusText").text("提示警告");
				$("#buttons").css("background-color","#F99146");
				$("#myImage").css("display","block");
			}
		}); 
		function closeWindows(){
			WeixinJSBridge.call('closeWindow');
		}
    </script>
  </body>
  
</html>
