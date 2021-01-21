<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>选择菜单</title>
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
    /* 
    	background-image: url('images/common_background1.png');
    	background-repeat:no-repeat; 
    	background-size:100% 100%;
    	-moz-background-size:100% 100%;
     */
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
    	/* .weui_tab_bd{
    		background-image: url('images/appbackgrond.jpg');
	    	background-repeat:no-repeat; 
	    	background-size:100% 100%;
	    	-moz-background-size:100% 100%;
	    	
	    	6216618300013799170
	    	
    	} */
    </style>
  </head>
  <body>
  	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="url" name="url" value="${url }"/>
	
	<div class="weui_tab_bd">
        <!-- 内容展现 -->
       	<div class="menudiv" id="1" onclick="toNextPage(this.id);">
        	<div class="imagediv">
        		<img  src="images/lzsey/jx_pjjsh.jpg" style="width:80%;margin-top: 15%;">
        	</div>
        	<div class="textdiv" style="width: 55%;margin-left: 3px;">
        		<div class="ondiv">
        			<span style="font-size: 18px;color: #666;height: 30px;line-height: 30px;"><b>医护人员手册</b></span>
        		</div>
        		<div class="updiv">
        			<span style="font-size: 13px;color: #747474;height: 20px;line-height: 20px;">该手册供医护人员及导师使用</span>
        		</div>
        	</div>
        	<div class="textdiv" style="width: 15%;text-align: center;float: right;">
        		<img  src="images/jiantou.png" style="width:80%;margin-top: 30%;">
        	</div>
        </div>
        <!-- 2 -->
        <div class="menudiv" id="2" onclick="toNextPage(this.id);">
        	<div class="imagediv">
        		<img  src="images/lzsey/jx_pjxsh.jpg" style="width:80%;margin-top: 15%;">
        	</div>
        	<div class="textdiv" style="width: 55%;margin-left: 3px;">
        		<div class="ondiv">
        			<span style="font-size: 18px;color: #666;height: 30px;line-height: 30px;"><b>研究生手册</b></span>
        		</div>
        		<div class="updiv">
        			<span style="font-size: 13px;color: #747474;height: 20px;line-height: 20px;">该手册供研究生使用</span>
        		</div>
        	</div>
        	<div class="textdiv" style="width: 15%;text-align: center;float: right;">
        		<img  src="images/jiantou.png" style="width:80%;margin-top: 30%;">
        	</div>
        </div>
	</div>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <script src="js/jquery-2.1.4.js"></script>
  </body>
  <script type="text/javascript">
  	function toNextPage(value){
		window.location.href="wechatBind.do?method=toDifferentTextPage&value="+value;										
 	}
  </script>
</html>
