<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
  <head>
    <base href="<%=basePath%>">
    <title>学生信息下载保存</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
    <style type="text/css">
    	.menudiv{
    		width: 100%;
    		height: 85px;
    		border-bottom: 1px solid #E0E0E0;
    		background-color: #F8F8F8;
    		/* background-image: url('images/appbackgrond.jpg'); */
    	}
    	.imagediv,.textdiv{
    		width: 20%;
    		margin-left:2%;
    		height: 75px;
    		margin-top:2%;
    		float: left;
    	}
    	.imagediv{
    		text-align: center;
    	}
    	.ondiv{
    		width: 98%;
    		height: 30px;
    		margin-top: 15px;
    	}
    	.updiv{
    		width: 98%;
    		height: 20px;
    	}
    </style>
  </head>
  <body>
  	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="userid" name="userid" value="${userid }"/>
	<div class="weui_tab_bd">
		<div class="js-capture hide">
        <!-- 内容展现 -->
       	<div class="menudiv" onclick="toNextPage(1);">
        	<div class="imagediv">
        		<img  src="images/menu/bdytk.png" style="width:80%;">
        	</div>
        	<div class="textdiv" style="width: 55%;margin-left: 3px;">
        		<div class="ondiv">
        			<span style="font-size: 18px;color: #666;height: 30px;line-height: 30px;"><b>学生胸牌</b></span>
        		</div>
        		<div class="updiv">
        			<span style="font-size: 13px;color: #747474;height: 20px;line-height: 20px;">保存胸牌(高：550mm；宽：900mm)</span>
        		</div>
        	</div>
        	<div class="textdiv" style="width: 15%;text-align: center;float: right;">
        		<img  src="images/jiantou.png" style="width:80%;margin-top: 10%;">
        	</div>
        </div>
        <!-- ----------------------------------------报到证 ------------------------------------------------ -->
        <div class="menudiv" onclick="toNextPage(2);">
        	<div class="imagediv">
        		<img  src="images/menu/czwd.png" style="width:80%;">
        	</div>
        	<div class="textdiv" style="width: 55%;margin-left: 3px;">
        		<div class="ondiv">
        			<span style="font-size: 18px;color: #666;height: 30px;line-height: 30px;"><b>学生报到证</b></span>
        		</div>
        		<div class="updiv">
        			<span style="font-size: 13px;color: #747474;height: 20px;line-height: 20px;">点击查看保存报到证</span>
        		</div>
        	</div>
        	<div class="textdiv" style="width: 15%;text-align: center;float: right;">
        		<img  src="images/jiantou.png" style="width:80%;margin-top: 10%;">
        	</div>
        </div>
        <!-- -----------------------------------------缴费单-------------------------------------------------- -->
        <c:if test="${comtype==2 }">
	        <div class="menudiv" onclick="toNextPage(3);">
	        	<div class="imagediv">
	        		<img  src="images/menu/ktxxshd.png" style="width:80%;">
	        	</div>
	        	<div class="textdiv" style="width: 55%;margin-left: 3px;">
	        		<div class="ondiv">
	        			<span style="font-size: 18px;color: #666;height: 30px;line-height: 30px;"><b>学生缴费单</b></span>
	        		</div>
	        		<div class="updiv">
	        			<span style="font-size: 13px;color: #747474;height: 20px;line-height: 20px;">点击查看保存缴费单</span>
	        		</div>
	        	</div>
	        	<div class="textdiv" style="width: 15%;text-align: center;float: right;">
	        		<img  src="images/jiantou.png" style="width:80%;margin-top: 10%;">
	        	</div>
	        </div>
        </c:if>
        </div>
	</div>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <script src="js/jquery-2.1.4.js"></script>
  </body>
  <script type="text/javascript">
  	function toNextPage(value){
  		var openid = $("#openid").val();
  		var clientsxh = $("#clientsxh").val();
  		var userid = $("#userid").val();
  		var sysurl = "jxStudents.do?method=toStudentsFileInfo&type="+value+"&openid="+openid+"&clientsxh="+clientsxh+"&userid="+userid;
		window.location.href=sysurl;										
 	}
  </script>
</html>
