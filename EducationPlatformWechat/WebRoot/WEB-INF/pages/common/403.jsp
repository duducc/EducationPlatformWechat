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
    <title>403</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jweixin-1.0.0.js"></script>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <style type="text/css">
    	.weui_tab{
			 position:absolute; z-index:1;
		}
    </style>
</head>
<body>
<form class="layui-form layui-form-pane" action=""  id="baseform" method="post">
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
    		<div style="width: 100%;height: 52px;background-color: #3D74AD;"></div>
    		<div style="width: 100%;height: 90%;text-align: center;">
    			<div style="width: 100%;text-align: center;">
    				<img src="images/qrqyh/quesheng.png" style="width: 60%;height: 50%;margin-top: 20%;">
    			</div>
    			<div style="width: 60%;margin-left:20%;margin-top:10px; text-align: center;">
    				<span style="font-size: 15px;color: red;">${message }</span>
    			</div>
    		</div>
			<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
			<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 55px;">
		    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 96%;margin-left: 2%;">
			      	<button name="closeBtn" type="button" class="layui-btn layui-btn-danger" onclick="close_windos();" style="width: 100%;"><i class="layui-icon">&#x1007;</i>关闭</button>
		    	</div>
			</div>
    	</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	function close_windos(){WeixinJSBridge.call('closeWindow')}
</script>
</body>
</html>
