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
<title>ʵϰ���ɷѵ�</title>
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
	p{
		font-size: 25px;
	}
	.sps{
		font-size: 23px;
		font-style: italic;
	}
	.sp{
		font-size: 16px;
		color:#555555;
	}
	input{
		border: 0px;
		font-size:20px;
		width: 50px;
		text-align: center;
	}
</style>
</head>
<body style="height: 96%;">
	<div id="content" style="width: 100%;">
		<div style="width: 96%; margin-left:2%; border: 1px solid #999999;margin-top: 50px;padding:20px; background-color: #ffffff;" id="main_div">
			<div style="width: 100%;">
				<div style="width: 100%;height:120px;text-align: center;">
					<span style="line-height: 140px;font-size: 30px;"><b>����ʡ����ҽԺʵϰ���ɷѵ���ʵϰ�ѣ�</b></span>
				</div>
				<div style="width: 100%;margin-bottom: 50px;">
					<div style="width: 72%;margin-left: 16%;margin-top: 30px;">
						<p style="font-size: 30px;">���񴦣�</p><br>
						<p style="font-size: 25px;">���У�&nbsp;&nbsp;<span class="sps">${school}</span>&nbsp;&nbsp;<span class="sps">${stu.grade }</span>��&nbsp;&nbsp;ͬѧ��${stu.name }��<br>
						����Ժ�о�ͬ�⣬����Ժʵϰ��&nbsp;&nbsp;����&nbsp;&nbsp;<span class="sps">${stu.month}</span>&nbsp;&nbsp;���£�ʵϰ��ÿ��
						<span class="sps">${sxmothercost}</span>&nbsp;&nbsp;Ԫ������&nbsp;&nbsp;<span class="sps">${sxmothercost*stu.month}</span>&nbsp;&nbsp;Ԫ�������԰���</p>
					</div>
					<div style="width: 60%;margin-left: 20%;margin-top: 50px;text-align: right;">
						<p style="font-size: 25px;">�ٴ���ѧ��</p>
						<p style="font-size: 25px;">
							<span class="sps">${nowyear}</span>
							��
							<span class="sps">${nowmother}</span>
							��
							<span class="sps">${nowday}</span>
							��
						</p>
					</div>
				</div>
			</div>
			<div style="width: 100%;margin-top: 30px;">
				<div style="width: 100%;height:120px;text-align: center;">
					<span style="line-height: 140px;font-size: 30px;"><b>����ʡ����ҽԺʵϰ���ɷѵ�����װ�ѣ�</b></span>
				</div>
				<div style="width: 100%;margin-bottom: 50px;">
					<div style="width: 72%;margin-left: 16%;margin-top: 30px;">
						<p style="font-size: 30px;">���񴦣�</p><br>
						
						<p style="font-size: 25px;">���У�&nbsp;&nbsp;<span class="sps">${school}</span>&nbsp;&nbsp;<span class="sps">${stu.grade }</span>&nbsp;&nbsp;��ͬѧ��${stu.name }��<br>
						����Ժ�о�ͬ�⣬����Ժʵϰ��&nbsp;&nbsp;����&nbsp;&nbsp;<span class="sps">${stu.month}</span>&nbsp;&nbsp;���£����η�ÿ��
						<span class="sps">${fzmothercost}</span>&nbsp;&nbsp;Ԫ�������ʵϰ���η�&nbsp;&nbsp;<span class="sps">${fzmothercost*2}</span>&nbsp;&nbsp;Ԫ�������԰���</p>
						<p><span class="sps">��ע���±���ѧ��ÿ������2�ף�</span></p>
					</div>
					<div style="width: 60%;margin-left: 20%;margin-top: 50px;text-align: right;">
						<p style="font-size: 25px;">�ٴ���ѧ��</p>
						<p style="font-size: 25px;">
							<span class="sps">${nowyear}</span>
							��
							<span class="sps">${nowmother}</span>
							��
							<span class="sps">${nowday}</span>
							��
						</p>
					</div>
				</div>
			</div>
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
