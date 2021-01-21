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
    <title>操作手册</title>
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
    <meta name="format-detection" content="telephone=no" />
    <meta name="robots" content="index, follow">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="css/weui.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <link rel="stylesheet" href="css/common.css">
    
    <link rel="stylesheet" href="css/layui.css" media="all">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <style type="text/css">
    	.head{
    		font-size: 15px;
    	}
    	.head_s{
    		color: #68228B;
    	}
    	.fase{
    		color: #43CD80;
    	}
    </style>
</head>
<body>
	<!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header' style="background-color:#65B39D;">
            <h1 class="demos-title" style="color: #fff;font-size: 25px;">微信公众号使用手册</h1>
            <h1 style="font-size: 15px;color: #fff;text-align: center;">
            <span>(硕士研究生导师)</span>
            </h1>
        </header>
	    <div style="width: 94%;margin-left:3%;margin-top:10px;border:1px solid #cccccc; padding:20px;">
	    	<p><h4 class="head_s">1：关注科研管理平台微信公众号。</h4></p>
	    	<p class="head">
	    		微信搜索“科研管理平台”或微信扫描以下二维码进行关注。
	    	</p>
	    	<p>
	    		<img src="images/czwd/ewmsys.png" style="width: 100%;height: 150px;">
	    	</p>
	    	<br><br>
	    	<p><h4 class="head_s">2：绑定账号。</h4></p>
	    	<p class="head">
	    		点击【个人中心】--【我的信息】，弹出界面中选择【绑定账号】，进入绑定页面，填写姓名、工号、联系电话，点击“确定”按钮，完成账号绑定，以上操作完成后，只需等待会议开始前前往二维码扫描签到处扫码签到即可。
	    	</p>
	    	<p>
	    		<img src="images/czwd/wdxxcd.png" style="width: 46%;height: 300px;">
	    		<img src="images/czwd/bdcd.png" style="width: 46%;margin-left:3%; height: 300px;">
	    	</p>
	    	<p>
	    		<img src="images/czwd/bdym.png" style="width: 46%;margin-top:10px; height: 300px;">
	    	</p>
	    	<br><br>
	    	<p><h4 class="head_s">3：扫码签到</h4></p>
	    	<p class="head">
	    		会议开始前，工作人员会在会场外设置二维码扫描签到处，届时签到人员携带手机进入会场使用微信中的扫一扫，扫描二维码签到，
	    		<span style="color: red;">注（请务必完成绑定工作，否则将无法进行扫码签到）。</span>
	    	</p>
	    	<p>
	    		<img src="images/czwd/sys.png" style="width: 100%;height: 300px;">
	    	</p>
	    	<p class="head">
	    		扫描成功后，微信端会弹出下列信息：“恭喜【**人员】于活动【**】签到成功！”此时即完成此次会议签到。
	    	</p>
	    </div>
    </div>
</body>
</html>