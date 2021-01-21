<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>  
    <title>医通卡续费</title>
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
   			<input type="hidden" id="openId" name="openId" value="${openId }"/>
			<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
   			<div class="form-group input-group">   
   				<span class="input-group-addon">持卡人姓名：</span>
   				<input class="form-control" type="text" id="username" name="username" value="${bindinfo.xm }" readonly="readonly" maxlength="10"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">医卡通号码：</span>
   				<input class="form-control" type="text" id="yitongcard" name="yitongcard" value="${bindinfo.yitongCard }" readonly="readonly" maxlength="11"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">身份证号码：</span>
   				<input class="form-control" type="text" id="sfzhm" name="sfzhm" value="${bindinfo.sfzmhm }" readonly="readonly" maxlength="18"/>
   			</div>
   			<div class="form-group input-group">
   				<span class="input-group-addon">卡到期时间：</span>
   				<input class="form-control" type="text" id="dqsj" name="dqsj" value="${dqsj }" readonly="readonly" maxlength="20"/>
   			</div>
   			<c:if test="${shc>30*86400000 }">
	   			<div class="form-group">
	      			<textarea id="jbnr" name="jbnr" class="form-control" rows="5" readonly="readonly" style="color:green;">您的医通卡还有${shc/86400000 }天到期！</textarea>
	   			</div>
	   		</c:if>
   			<c:if test="${shc>0&&shc<30*86400000 }">
	   			<div class="form-group">
	      			<textarea id="jbnr" name="jbnr" class="form-control" rows="5" readonly="readonly" style="color: #FF8000;">您的医通卡马上到期，请及时续费！</textarea>
	   			</div>
	   		</c:if>
   			<c:if test="${shc<0 }">
	   			<div class="form-group">
	      			<textarea id="jbnr" name="jbnr" class="form-control" rows="5" readonly="readonly" style="color: red;">您的医通卡已过期，请及时续费！</textarea>
	   			</div>
	   		</c:if>
   			<div align="center" style="clear:both;padding-top:10px;">
			     <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="savewxjb()" >立即续费</button>
			     <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="cancelwxjb()" >取消</button>
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
 		var openId = $("#openId").val();
 		var clientsxh = $("#clientsxh").val();
    	location.href="paymentManage.do?method=toPayRenewPage&openId="+openId+"&clientsxh="+clientsxh+"&type=2";
 	}
</script>
</html>