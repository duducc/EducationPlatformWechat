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
<title>实习生报到证</title>
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
	.tds{
		border:1px solid #000000;
		height: 120px;
		font-size: 30px;
	}
</style>
</head>
<body style="height: 98%;">
	<div id="content" style="width: 100%;">
	<div style="width: 98%;margin-left: 1%;border: 0px;margin-top: 20px;background-color: #ffffff;padding: 5px;" id="main_div">
		<div style="width: 100%;height:150px; border-bottom: 1px solid #000000;text-align: center;">
			<span style="line-height: 150px;font-size: 40px;"><b>甘肃省人民医院实习学生报到证</b></span>
		</div>
		<table width="100%" align="center" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="center" class="tds" width="18%"><b>姓名</b></td>
				<td align="center" class="tds" width="18%">
					${stu.name}
				</td>
				<td align="center" class="tds" width="18%">性别</td>
				<td align="center" class="tds" width="18%">
					${sex}
				</td>
				<td align="center" class="tds" rowspan="3" width="28%">
					<img class="layui-upload-img" id="upImg" style="width:100%;height:370px" src="${stu.imagepath }">
				</td>
			</tr>
			<tr>
				<td  align="center" class="tds">所在院校</td>
				<td  align="center" class="tds">
					${school}
				</td>
				<td  align="center" class="tds">实习年度</td>
				<td  align="center" class="tds">
					${stu.stuyear }
				</td>
			</tr>
			<tr>
				<td  align="center" class="tds">专业</td>
				<td  align="center" class="tds">
					${zy}
				</td>
				<td  align="center" class="tds">学历</td>
				<td  align="center" class="tds">
					${xl }
				</td>
			</tr>
			<tr>
				<td  align="center" class="tds">实习时间</td>
				<td  align="center" class="tds">
					${stu.studystarttime.substring(0,10) }<br>${stu.studyendtime.substring(0,10) }
					
				</td>
				<td  align="center" class="tds">联系电话</td>
				<td  align="center" class="tds" colspan="3">
					${stu.telnumber}
				</td>
			</tr>
			<tr>
				<td  align="center" class="tds">来院方式</td>
				<td  align="center" class="tds" colspan="7">
					${comtypel}
				</td>
			</tr>
			<tr>
				<td  align="center" class="tds">学校所在地</td>
				<td  align="center" class="tds">
					${xxszd}
				</td>
				<td  align="center" class="tds">签发日期</td>
				<td  align="center" class="tds" colspan="3">
					${nowtime }
				</td>
			</tr>
			<tr>
				<td  align="center" class="tds" rowspan="30">所在院校意见</td>
				<td  align="center" class="tds" rowspan="30" colspan="5">
					<div style="width: 94%; min-height: 400px;margin-top: 80px;">
						${stu.fromunit }
					</div>
				</td>
			</tr>
		</table>
	</div>
	</div>
</body>
<script type="text/javascript">
	$(function(){
		creatimg();
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
