<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>  
    <title>课程详细信息</title>
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
    <meta name="format-detection" content="telephone=no" />
    <meta name="robots" content="index, follow">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="css/weui.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css"> 
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<script type="text/javascript" src="js/json2.js"></script> 
</head>
<body>
   <form action="" name="wxjbfrom" id="wxjbfrom" method="post" enctype="multipart/form-data">
   		<div style="margin:5px 10px 5px;" id="yw" style="display:inline">  
   			<input name=""  id="" type="hidden" value=""/>
   			<input name=""  id="" type="hidden" value=""/>
			<div class="form-group input-group" style="padding-top:5px;">
			   <span class="input-group-addon">课程名称：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
			   <textarea id="coursename" name="coursename" class="form-control" rows="3" readonly="readonly" >${entity.coursename }</textarea>
		    </div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">授课学校：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="holdUnit" name="holdUnit" value="${en.shkxuexname }" readonly="readonly" maxlength="18"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">授课周次：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="holdUnit" name="holdUnit" value="第${entity.shkzhci }周" readonly="readonly" maxlength="18"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">授课星期：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="mane" name="mane" value="星期${entity.shkxqi }" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">授课节数：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="holdDays" name="holdDays" value="第${entity.skjshu }节" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">授课时间：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="holdStartDate" name="holdStartDate" value="${entity.skdate.substring(0,10)}" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">授课地点：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="shkdid" name="shkdid" value="${en.shkdid}" readonly="readonly"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">授课时间段：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="holdEndDate" name="holdEndDate" value="${entity.shtime }" readonly="readonly" maxlength="20"/>
   			</div>
            <div class="form-group input-group">
   				<span class="input-group-addon">授课学时：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="holdEndDate" name="holdEndDate" value="${entity.shkxsh }(小时)" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
			   <span class="input-group-addon">授课内容：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
			   <textarea id="holdLocation" name="holdLocation" class="form-control" rows="2" readonly="readonly" style="padding-top: 5px;">${entity.jshnr }</textarea>
		    </div> 		
   		</div>
   </form>
</body>
<script type="text/javascript">
	function cancelwxjb(){
		parent.closeStudentView();										
 	}
</script>
</html>