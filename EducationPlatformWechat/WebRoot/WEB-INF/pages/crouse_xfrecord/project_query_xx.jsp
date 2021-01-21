<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>  
    <title>项目详细信息</title>
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
    <meta name="format-detection" content="telephone=no" />
    <meta name="robots" content="index, follow">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="css/weui.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
</head>
<body>
   <form action="" name="wxjbfrom" id="wxjbfrom" method="post" enctype="multipart/form-data">
   		<div style="margin:5px 10px 5px;" id="yw" style="display:inline">  
   			<input name=""  id="" type="hidden" value=""/>
   			<input name=""  id="" type="hidden" value=""/>
   			<div class="form-group input-group">   
   				<span class="input-group-addon">项目编号：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="proCode" name="proCode" value="${projectEntity.proCode }" readonly="readonly" maxlength="10"/>
   			</div>
   			<div class="form-group input-group" style="padding-top:5px;">
			   <span class="input-group-addon">项目名称：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
			   <textarea id="proName" name="proName" class="form-control" rows="3" readonly="readonly" >${projectEntity.proName }</textarea>
		    </div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">举办单位：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="holdUnit" name="holdUnit" value="${projectEntity.holdUnit }" readonly="readonly" maxlength="18"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">项目负责人：&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="mane" name="mane" value="${projectEntity.mane }" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">负责人电话：&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="manTel" name="manTel" value="${projectEntity.manTel }" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">项目举办天数：</span>
   				<input class="form-control" type="text" id="holdDays" name="holdDays" value="${projectEntity.holdDays }（天）" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">项目开始时间：</span>
   				<input class="form-control" type="text" id="holdStartDate" name="holdStartDate" value="${start }" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">项目结束时间：</span>
   				<input class="form-control" type="text" id="holdEndDate" name="holdEndDate" value="${end }" readonly="readonly" maxlength="20"/>
   			</div>

   			<div class="form-group input-group" style="padding-top:5px;">
			   <span class="input-group-addon">项目举办地址：</span>
			   <textarea id="holdLocation" name="holdLocation" class="form-control" rows="3" readonly="readonly" >${projectEntity.holdLocation }</textarea>
		    </div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">项目学分：</span>
   				<input class="form-control" type="text" id="eduCredit" name="eduCredit" value="${projectEntity.eduCredit }（分）" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">培训人数：</span>
   				<input class="form-control" type="text" id="eduObjCount" name="eduObjCount" value="${projectEntity.eduObjCount }（人）" readonly="readonly" maxlength="20"/>
   			</div>
   			<div align="center" style="clear:both;padding-top:10px;">
			     <button type="button" style="width:95%;" class="btn btn-primary disabled" onclick="cancelwxjb()" >关闭</button>
		   </div>
   		</div>
   </form>
   <div style="height:10px;"></div>  
</body>
<script type="text/javascript">
	function cancelwxjb(){
   		WeixinJSBridge.call('closeWindow');											
 	}
 	function savewxjb(){
    	location.href="paymentManage.do?method=toPayRenewPage";
 	}
</script>
</html>