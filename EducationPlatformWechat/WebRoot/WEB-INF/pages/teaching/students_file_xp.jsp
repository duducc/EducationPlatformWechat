<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="/printDep" prefix="dep"%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=EmulateIE8" />
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>学生胸牌</title>
<link href="js/sysManager/css/writeobj.css" rel="stylesheet" type="text/css" />
<link href="jquery/ea-ui/themes/icon.css" type="text/css" rel="stylesheet" />
<link href="jquery/ea-ui/themes/default/easyui.css" type="text/css" rel="stylesheet" />
<link href="css/common.css" type="text/css" rel="stylesheet" />

<script type="text/javascript" src="jquery/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="jquery/ea-ui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="jquery/ea-ui/easyloader.js"></script>
<script type="text/javascript" src="jquery/ea-ui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script src="https://cdn.bootcss.com/html2canvas/0.5.0-beta4/html2canvas.min.js"></script>
<style type="text/css">
	
</style>
</head>
<body style="height: 98%;">
	<div id="content" style="width: 100%;">
		<div style="width: 100%;text-align: center;background-color: #ffffff;padding: 20px;" id="main_div">
			<div style="width: 900px;margin-left: 20px;border:2px solid #000000;height: 550px;margin:0 auto;margin-top: 50px;">
				<div style="width: 100%;border-bottom: 2px solid #000000;height: 150px;">
					<div style="float: left;width: 150px;text-align: right;">
						<img src="images/logo-sy.png" style="width: 120px;height: 120px;margin-top: 15px;">
					</div>
					<div style="float: left;width: 700px;height: 150px;line-height: 180px;">
						<span style="font-size: 60px;">甘&nbsp;&nbsp;肃&nbsp;&nbsp;省&nbsp;&nbsp;人&nbsp;&nbsp;民&nbsp;&nbsp;医&nbsp;&nbsp;院</span>
					</div>
				</div>
				<div style="width: 100%;height: 399px;background-color:#66FFCC; ">
					<div style="width: 39%;float: left;height: 395px;">
						<img class="layui-upload-img" id="upImg" style="height:400px;width: 97%;float: left;" src="${stu.imagepath }">
					</div>
					<div style="width: 60%;float: left;">
						<div style="line-height: 140px;height: 120px;text-align: center;">
								<span style="font-size: 60px;"><b>姓名：  ${stu.name }</b></span>
						</div>
						<div style="line-height: 150px;height: 150px;text-align:center;">
							<c:if test="${stu.zhiweitype=='1' }">
								<span style="font-size: 80px;margin-left: 0px;"><b>实&nbsp;&nbsp;习&nbsp;&nbsp;医&nbsp;&nbsp;师</b></span>
							</c:if>
							<c:if test="${stu.zhiweitype=='2' }">
								<span style="font-size: 80px;margin-left: 0px;"><b>实&nbsp;&nbsp;习&nbsp;&nbsp;护&nbsp;&nbsp;士</b></span>
							</c:if>
						</div>
						<div style="line-height: 140px;height: 120px;text-align: center;">
								<span style="font-size: 50px;"><b>编号： ${stu.xh }</b></span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function(){
		alert("胸牌打印尺寸：高：550mm；宽：900mm");
	});
	
	function creatimg(){
		html2canvas($('#content'),{
	        onrendered: function(canvas) {
	            convertCanvasToImage(canvas);
	        }
	    });
		document.getElementById('main_div').style.display ='none';
	}
	
	function convertCanvasToImage(canvas) {
	    var image = new Image();
	    image.src = canvas.toDataURL("image/png");
	    document.body.appendChild(image);
	    return image;
	    
	}
</script>
</html>
