<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>绑定成功</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<style type="text/css">
		.cent{
			text-align:center;
			width:200px;
			height:200px;
			background-color:#45b97c;
			border-radius:100px;
			position: absolute;
			left: 50%;
		    top: 50%;
		    margin: -200px 0 0 -100px;
		}
		p{
			text-align:center;
			width:200px;
			height:50px;
			position: absolute;
			left: 50%;
		    top: 50%;
		    margin: 30px 0 0 -100px;
		    line-height:50px;
		    font-size:30px;
		}
	</style>
  </head>
  
  <body>
	<div class="layui-anim layui-anim-scale cent" data-anim="layui-anim-scale">
		<img  src="images/finishing.png">
	</div>
	<p>绑定已完成!</p>
    <script src="layui/layui.all.js" charset="utf-8"></script>
  </body>
</html>
