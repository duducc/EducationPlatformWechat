<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/common.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap.min.css" rel="stylesheet"> 
    <link rel="stylesheet" href="css/example.css"> 
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<style type="text/css">
		.d1{
			width: 100%;
			margin-top:5px;
			text-align:center;
		}
	</style>
</head>
<body>
<%-- <%
out.clear();
out = pageContext.pushBody();
%> --%>
	<input type="hidden" id="type" name="type" value="${type }"/>
	<input type="hidden" id="courseId" name="courseId" value="${courseId }"/>
	<input type="hidden" id="times" name="times" value="${dakatimes}"/>
	<input type="hidden" id="SessionToken" name="SessionToken" value="${access_token}"/>
	<div id="main_div" style="height: 85%;">
		<div style="text-align:center;margin-top: 20px;">
			<span style="font-size: 20px;color: #3cc51f;">请扫描二维码进行签到</span>
		</div>
		<div class="d1">
			<input type="hidden" id="type" name="type" value="00"/>
			<img style="width:50%" src="${QR_images}"/>
		</div>
	</div>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
</body>
 <script type="text/javascript">
 	var times = $("#times").val();
 	var dakatimes = (Number(times)*1000)-2000;
 	setTimeout(function(){refresh()},dakatimes); 
	$(document).ready(function () {
	    $("a[name='closeBtn']").click(function () {
	        WeixinJSBridge.call('closeWindow');
	    });
	});
 	function refresh(){
 		var type = $("#type").val();
 		var courseId = $("#courseId").val();
 		var SessionToken = $("#SessionToken").val();
 		window.location.href="xfProject.do?method=tobarcodeCreateofPC&courseId="+courseId+"&SessionToken="+SessionToken+"&type="+type; 
 	}
 </script>
</html>
