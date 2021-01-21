<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:directive.page import="com.saint.constant.Constant"/>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>操作手册</title>
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
    <meta name="format-detection" content="telephone=no" />
    <meta name="robots" content="index, follow">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="css/weui.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <link rel="stylesheet" href="css/common.css">
    <style type="text/css">
    	.head{
    		font-size: 15px;
    	}
    	.head_s{
    		color: #68228B;
    	}
    	.fase{
    		color: #43CD80;
    	}
    </style>
</head>
<body>
    <div style="width: 94%;margin-left:3%;margin-top:10px;border:1px solid #cccccc; padding:20px;">
    	<p><h4 class="head_s">步骤一：账号注册</h4></p>
    	<p class="head">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		点击菜单栏【<span class="fase">个人信息</span>】，选择【<span class="fase">人员管理</span>】，在弹出消息界面中选择【<span class="fase">账号注册</span>】进行账号信息注册；
    	</p>
    	<p class="head">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<span style="color: red;">提示：有卡人员，请直接绑定医通卡！</span>
    	</p>
    	<p>
    		<img src="images/czwd/czwd001.jpg" style="width: 80%;height: 400px;">
    	</p>
    	<br><br>
    	<p><h4 class="head_s">步骤二：绑定医通卡</h4></p>
    	<p class="head">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		点击菜单栏【<span class="fase">个人信息</span>】，选择【<span class="fase">我的医通卡</span>】，在弹出消息界面中选择【<span class="fase">绑定医通卡</span>】进行医通卡信息绑定；
    	</p>
    	<p>
    		<img src="images/czwd/czwd002.jpg" style="width: 80%;height: 400px;">
    	</p>
    	<br><br>
    	<p><h4 class="head_s">步骤三：检查GPS和提供位置信息功能是否打开</h4></p>
    	<p class="head">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<span style="color: red;">首先，请确认，本机GPS功能已开启！</span>
    	</p>
    	<p class="head">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		其次，点击微信公众号，右上角【<span class="fase">菜单</span>】按钮，跳转至微信公众号详情页面，打开【<span class="fase">提供位置信息</span>】按钮即可；
    	</p>
    	<p>
    		<img src="images/czwd/czwd003.jpg" style="width: 80%;height: 400px;">
    	</p><br>
    	<p>
    		<img src="images/czwd/czwd004.jpg" style="width: 80%;height: 400px;">
    	</p>
    </div>
</body>
</html>