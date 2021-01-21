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

  </head>
  
  <body>
    <input type="hidden" id="appId" name="appId" value="${appId }"/>
    <input type="hidden" id="timestamp" name="timestamp" value="${timestamp }"/>
    <input type="hidden" id="nonceStr" name="nonceStr" value="${nonceStr }"/>
    <input type="hidden" id="signature" name="signature" value="${signature }"/>
    
    <input type="hidden" id="openId" name="openId" value="${openId }"/>
    <input type="hidden" id="clientsxh" name="signature" value="${clientsxh }"/>
    
    <script src="http://res.wx.qq.com/open/js/jweixin-1.2.0.js"></script>
    <script type="text/javascript">
    	//alert(location.href.split('#')[0]);
    	wx.config({
		    beta: true,// 必须这么写，否则wx.invoke调用形式的jsapi会有问题
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
			        // 回调
			        var url = res.resultStr;
			        location.href=url+"&openid="+$("#openId").val()+"&clientsxh="+$("#clientsxh").val();
			    },
			    error: function(res) {
			        if (res.errMsg.indexOf('function_not_exist') > 0) {
			            alert('版本过低请升级')
			        }
			    }
			});
		});
		
		/* var btn = document.getElementById('weixin');
		  wx.ready(function () {
		    // 在这里调用 API
		    btn.onclick = function(){
		        wx.scanQRCode ({
		            success : function(res){
		            }
		        });
		    }
		  }); */
		  
		  
    </script>
  </body>
</html>
