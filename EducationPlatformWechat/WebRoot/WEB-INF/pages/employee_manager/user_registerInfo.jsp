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
    <title></title>
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
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jweixin-1.0.0.js"></script>
    <style type="text/css">
    	.fileInputContainer{
			height:80px;
			width:80px;
			background-image:url(images/zp.png);
			background-size:60px 60px;
			background-repeat:no-repeat;
			position:relative;
		}
		.fileInput{
			height:80px;
			width:80px;
			position:absolute;
			right:0;
			top:0;
			opacity: 0;
			filter:alpha(opacity=0);
			cursor:pointer;
		}
		.divimg{
			float:left;
			width:28%;
			height:60px;
			/* margin-left:10px; */
		}
		.divimgborder{
			float:left;
			width:28%;
			height:80px;
			margin-left:10px;
		}
		img{
			max-width:100%;
			max-height:100%;
			width:80px; 
			height:80px;
			display:block;
		}
		.in_but{
			width: 100%;
		}
		.weui_tab{
			 position:absolute; z-index:1;
		}
    </style>
</head>
<body>
<form method="post" id="uploadform" name="uploadform" action="" enctype="multipart/form-data" >
	<div class="weui_tab">
    	<div class="weui_tab_bd">
	        <header class='demos-header'>
	            <h1 class="demos-title">注册成功</h1>
	        </header>
        	<!-- 内容展现 -->
        	<div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">医通卡号：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input class="weui_input"  type="text" style="color: red;font-size: 18px;" value="${entity.usernumber }">
                </div>
            </div>
            <div class="weui_cell" id="yhkzzy" style="border: 1px solid #999999;width: 96%;margin-left: 2%;border-radius:10px;">
                <span style="margin-left: 10px;color: red;">医通卡号用于绑定公众号，进行签到，请好好保存。</span><br>
            </div>
        <div class='demos-content-padded'>
            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">关闭</a>
        </div>
    </div>
</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
$(document).ready(function () {
	$("a[name='bindingBtn']").click(function () {
        WeixinJSBridge.call('closeWindow');
    });
});
</script>
</body>
</html>
