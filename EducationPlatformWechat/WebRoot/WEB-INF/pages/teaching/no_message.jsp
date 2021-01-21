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
    <title>提示页面</title>
    <meta charset="utf-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<script type="text/javascript" src="js/json2.js"></script>
	<script type="text/javascript" src="jquery/highcharts.js"></script>
	
	<style type="text/css">
	</style>
</head>
<body >
<div style="text-align: center">
<img  style="height:200px;width: 200px;"  src="images/lzsey/zwshj.gif">
</div>
</body>
<script type="text/javascript">
</script>
<script src="layui/layui.all.js" charset="utf-8"></script>
</body>
</html>
