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
    		font-size: 20px;
    	}
    </style>
</head>
<body>
    <div style="width: 94%;margin-left:3%;margin-top:10px;border:1px solid #cccccc; padding:20px;">
    <div style="width: 100%;height: 40px;text-align: center;">
    	<span class="fase">请长按二维码进行识别测试账号</span>
    </div>
    	<img src="images/czwd/QR_test.png" style="width: 100%;height: 100%;">
    </div>
</body>
</html>