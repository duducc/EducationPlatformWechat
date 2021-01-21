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
    <title>详细信息</title>
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
    <meta name="format-detection" content="telephone=no" />
    <meta name="robots" content="index, follow">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="css/weui.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <link rel="stylesheet" href="css/common.css">
</head>
<body>
   <form action="" name="wxjbfrom" id="wxjbfrom" method="post" enctype="multipart/form-data">
   		<div style="margin:5px 10px 5px;" id="yw" style="display:inline">  
   			<input name="id"  id="id" type="hidden" value="${id }"/>
   			<input name="type"  id="type" type="hidden" value="${type }"/>
   			<input name="yiyuan"  id="yiyuan" type="hidden" value="${yiyuan }"/>
   			<input name="openId"  id="openId" type="hidden" value="${openId }"/>
   			<input name="clientsxh"  id="clientsxh" type="hidden" value="${clientsxh }"/>
   			<div class="form-group input-group">   
   				<span class="input-group-addon">姓名：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="proCode" name="proCode" value="${entity.userxm }" readonly="readonly" maxlength="10"/>
   			</div>
   			<div class="form-group input-group">   
   				<span class="input-group-addon">医通卡号：</span>
   				<input class="form-control" type="text" id="proCode" name="proCode" value="${entity.yitongcode }" readonly="readonly" maxlength="10"/>
   			</div>
   			<div class="form-group input-group" style="padding-top:5px;">
			   <span class="input-group-addon">身份证号：</span>
			   <input class="form-control" type="text" id="proCode" name="proCode" value="${entity.sfzhm }" readonly="readonly" maxlength="10"/>
		    </div>
   				<c:if test="${entity.usersex==0 }">
		   			<div class="form-group input-group">
		   				<span class="input-group-addon">性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   						<input class="form-control" type="text" id="usersex" name="usersex" value="女" readonly="readonly" maxlength="18"/>
	   				</div>
   				</c:if>
   				<c:if test="${entity.usersex==1 }">
   					<div class="form-group input-group">
   						<span class="input-group-addon">性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   						<input class="form-control" type="text" id="usersex" name="usersex" value="男" readonly="readonly" maxlength="18"/>
   					</div>
   				</c:if>
   			<div class="form-group input-group">
   				<span class="input-group-addon">医院：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="mane" name="mane" value="${yiyuanname}" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">科室：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="manTel" name="manTel" value="${deptname }" readonly="readonly" maxlength="20"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">职称：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<select class="form-control"  id="zhicheng" name="zhicheng" class="select_wx" disabled="disabled">
				 	<code:printCode dmjc="ZC" defaultValue="${entity.zhicheng }" type="1"/>
				</select>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">申请时间：</span>
   				<input class="form-control" type="text" id="holdStartDate" name="holdStartDate" value="${entity.gxsj.substring(0,19) }" readonly="readonly" maxlength="20"/>
   			</div>
   			<%-- <div class="form-group input-group">
   				<span class="input-group-addon">照片：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
   				<input class="form-control" type="text" id="holdEndDate" name="holdEndDate" value="${entity.remark5 }" readonly="readonly" maxlength="20"/>
   			</div> --%>
			<div align="center" style="clear:both;padding-top:10px;">
			     <!-- <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="savewxjb()" >审核</button> -->
			     <button type="button" style="width:100%;" class="btn btn-primary disabled" onclick="cancelwxjb()" >返回</button>
		   </div>
   		</div>
   </form>
   <div style="height:10px;"></div>  
</body>
<script type="text/javascript">
	function cancelwxjb(){
		var clientsxh = $("#clientsxh").val();
		var openId = $("#openId").val();
		var yiyuan = $("#yiyuan").val();
		var type = $("#type").val();
		if(type==3){
		   	window.location.href="applyInfo.do?method=toInfo_ApplyNewCard&clientsxh="+clientsxh+"&openid="+openId+"&yiyuan="+yiyuan;										
		}else if(type==2){
			window.location.href="applyInfo.do?method=toInfo_ApplyReplaceCard&clientsxh="+clientsxh+"&openid="+openId+"&yiyuan="+yiyuan;
		}
 	}
 	
</script>
</html>