<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>扫描二维码</title>
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
	<script src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		.tabs1{
			width: 100%;
			height: 90%;
			background-image: url('images/qrqyh/qyhbj.png');
			background-size:98% 70%;
			background-repeat: no-repeat;
			margin-left: 1%;
			margin-top: 8px;
		}
	</style>
  </head>
  
  <body>
    <input type="hidden" id="appId" name="appId" value="${appId }"/>
    <input type="hidden" id="timestamp" name="timestamp" value="${timestamp }"/>
    <input type="hidden" id="nonceStr" name="nonceStr" value="${nonceStr }"/>
    <input type="hidden" id="signature" name="signature" value="${signature }"/>
    <input type="hidden" id="openId" name="openId" value="${openId }"/>
    <input type="hidden" id="clientsxh" name="signature" value="${clientsxh }"/>
    
    <div style="width: 100%;">
    	<div style="width: 100%;height: 10%;border-bottom: 1px solid #cccccc;background-color: #ffffff;">
 			<div style="width: 20%;height: 60px;float: left;">
 				<img src="images/feixianchangpic.png" style="width: 55px;height: 55px;margin-left: 10px;" onclick="MillisecondToDate('-661000');">
 			</div>
 			<div style="width: 50%;height: 60px;float: left;">
 				<div style="width: 100%;margin-top: 10px;">
  					<span style="color: #1D2426;font-size: 16px;"><b>${bindinfo.xm }</b></span><br>
  					<span style="color: #989C9C;font-size: 14px;">点击扫码签到</span>
 				</div>
 			</div>
			<div style="width: 30%;height: 60px;float: left;">
				<div style="width: 100%;margin-top: 20px;">
					<span style="color: #989C9C;font-size: 14px;float: right;margin-right: 10px;">${time }</span>
				</div>
			</div>
 		</div>
 		<div class="tabs1">
		    <a style="cursor:pointer;" onclick="main();">
		    	<img src="images/qrqyh/qrqyh.png" style="width: 60%;margin-left:20%; height: 40%;margin-top: 5%;">
		    </a>
		    <div style="width: 100%;">
		    	<img src="images/qrqyh/qyzi.png" style="width: 70%;margin-left:15%; height: 20%;margin-top: 5%;">
		    </div>
		    <a href="javascript:;" onclick="closeWindow();">
		    	<img src="images/qrqyh/qyhclose.png" style="width: 20%;margin-left:40%; height: 14%;margin-top: 20%;">
		    </a>
	    </div>
    </div>
  </body> 
    <script src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js"></script>
    <script type="text/javascript">
    	function closeWindow(){
    		WeixinJSBridge.call('closeWindow');
    	}
    	/* function qrscan(){
    		main();
    	} */
    	
    	function main(){
    		wx.config({
			    debug: false, // 开启调试模式,调用的所有api的返回值会在客户端alert出来，若要查看传入的参数，可以在pc端打开，参数信息会通过log打出，仅在pc端时才会打印。
			    appId: $("#appId").val(), // 必填，企业微信的corpID
			    timestamp:$("#timestamp").val() , // 必填，生成签名的时间戳
			    nonceStr: $("#nonceStr").val(), // 必填，生成签名的随机串
			    signature: $("#signature").val(),// 必填，签名，见附录1
			    jsApiList: ['scanQRCode'] // 必填，需要使用的JS接口列表，所有JS接口列表见附录2
			});
			
			wx.ready(function () {
				wx.scanQRCode({
				    desc: 'scanQRCode desc',
				    needResult: 1, // 默认为0，扫描结果由企业微信处理，1则直接返回扫描结果，
				    scanType: ["qrCode", "barCode"], // 可以指定扫二维码还是一维码，默认二者都有
				    success: function(res) {
				        var url = res.resultStr;
				        location.href=url+"&openid="+$("#openId").val()+"&clientsxh="+$("#clientsxh").val();
				    },
				    error: function(res) {
				        if (res.errMsg.indexOf('function_not_exist') > 0) {
				            alert('版本过低请升级');
				        }
				    }
				});
			});
    	}
    </script>
</html>
