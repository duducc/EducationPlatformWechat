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
    <title>选择人员类型</title>
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
  </head>
  <body>
  	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="type" name="type" value="${type }"/>
	
	<div class="weui_tab_bd">
        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
        	<p style="color:#f00; font-size:15px; text-align:center; margin-bottom:20px;padding:5px 5px 5px 5px;">注：请依据自身属性选择角色！</p>
	        <div class='demos-content-padded'>
	        	<img  src="images/studentEnter.png" style="width:100%;" onclick="toSelfPage('1')">
	        	<img  src="images/doctorEnter.png" style="width:100%; margin-top:10px;" onclick="toSelfPage('2')">
	            <!-- <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary" onclick="toSelfPage('1')">我是学员</a>
	            <a style="background-color: #1AA094;" class="weui_btn weui_btn_primary" onclick="toSelfPage('2')">我是医务人员</a> -->
	        </div>
    	</div>
	</div>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <script src="js/jquery-2.1.4.js"></script>
  </body>
  <script type="text/javascript">
  	function toSelfPage(s){
  	var layer = layui.layer;
		var clientsxh = $("#clientsxh").val();
		var openid = $("#openid").val();
		var type=$("#type").val();
		if(type=="1"&&s=="2"){
		  	layer.alert('您已绑定学员信息,请先注销再绑定！', {title: '提示信息'});
		  	return false;
		}else if(type=="2"&&s=="1"){
		  	layer.alert('您已绑定医护人员信息,请先注销再注册！', {title: '提示信息'});
		  	return false;
		}
		window.location.href="jxStudents.do?method=toSelfPage&clientsxh="+clientsxh+"&openid="+openid+"&type="+s;										
 	}
  </script>
</html>
