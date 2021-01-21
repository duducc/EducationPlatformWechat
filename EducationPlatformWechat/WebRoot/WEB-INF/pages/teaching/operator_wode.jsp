<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生操作手册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery.1.7.2.min.js"></script>
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
	<style type="text/css">
		*{
			margin:0;
			padding:0;
		}
		.layui-form-switch {
		    height: 28px;
		    line-height: 28px;
		    min-width: 60px;
		    padding: 0 8px;
		    margin-top: 0px;
		    border-radius: 25px;
		}
		.layui-form-switch em {
		    font-size: 14px;
		}
		.layui-form-switch i {
		    top: 5px;
		}
		.layui-form-pane .layui-form-radio, .layui-form-pane .layui-form-switch {
		    margin-top: 0px;
		}
		.redspan{
			color: red;
		}
	</style>
  </head>
  <body>
    <form class="layui-form layui-form-pane" action="" style="width:100%; ">
    	<input type="hidden" id="openid" name="openid" value="${openid }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
		<input type="hidden" id="pertype" name="pertype" value="${pertype }"/>
    	<!------------------------------------------------------开头 --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>操作手册</b></span><br>
					<span style="color: #fff;font-size: 15px;">请认真阅读操作手册</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">第一步</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;padding: 10px;">
						<span class="fispan">填写注册信息，上传<span class="redspan">证件照片</span>，点击立即提交。如果提示"注册成功"，则表示已注册成功，即可点击关闭按钮，等待教学部审核。</span>
 					</div>
				</div>
			</div>
			<!---------------------------------------------------------家庭信息 -------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">第二步</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;">
						若收到"注册信息审核成功"的推送消息，则表明教学部已审核通过。<br>
						推送消息中会注明："报到时间"、"报到地点"、"所携带物品"，请详细阅读。
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------实习信息 -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">第三步</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;">
  						教学部审核通过后，请点击【我的信息】-【我的文件】：学生胸牌和学生报到证。
  						在打开的页面中截屏保存胸牌和报到证的图片，自行打印。并携带打印的证件等，在规定的时间和地点进行报到。
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------学校信息 -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">第四步</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;">
						报到完成后，学生每天进行签到：点击【常用功能】-【学员签到】进行打卡签到。签到时系统将记录签到位置，时间等。<br>
						学生请假点击【常用功能】-【请假申请】进行请假审核。详情点击查看《请假注意事项》
 					</div>
				</div>
			</div>
		    <!--------------------------------------------------------其他信息 -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">第五步</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;">
					            学生也可以在【学员账号】-【我的信息】中查看自己的个人信息。<br>
					            学生实习期间可以在【我的信息】中查询自己的请假信息、轮训信息、学分信息、违纪信息等。
 					</div>
				</div>
			</div>
			<div style="width: 100%;height: 50px;margin-bottom: 20px;padding: 5px;">
				<input type="hidden" name="shxsxy" id="shxsxy" lay-verify="shxsxy" value="1"/>
				<input type="checkbox" lay-skin="switch" lay-filter="switchTest" lay-text="已阅读|未阅读">
				<span style="font-size: 14px;">我已阅读学生操作手册，继续注册！</span>
			</div>
		</div>
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" onclick="jixuzhuce();"><i class="layui-icon">&#xe609;</i>继续注册</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
	     	</div>
	  	</div>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
	layui.use(['form', 'layedit', 'laydate'], function(){
		var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate;
    	form.on('switch(switchTest)', function(data){
			if(this.checked==true){
				$("#shxsxy").val(2);
			}else{
				$("#shxsxy").val(1);
			}
		});
	});
	
    function close_windos(){WeixinJSBridge.call('closeWindow')}
    function jixuzhuce(){
    	var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
		var pertype = $("#pertype").val();
		var shxsxy = $("#shxsxy").val();
		if(shxsxy==1){
			layer.msg("请仔细阅读操作手册，并同意已阅读！",{icon:'5'});
			return false;
		}else{
			if(pertype==2){
				var openid = $("#openid").val();
				var clientsxh = $("#clientsxh").val();
				var url = "jxStudents.do?method=toStudentRegistPage";
				/* var spath = "jxStudents.do?method=toInternRegistPage&openid="+openid+"&clientsxh="+clientsxh; */
				var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&pertype="+pertype;
				window.open(spath,"toTraineeRegist");
			}else if(pertype==5){
				var openid = $("#openid").val();
				var clientsxh = $("#clientsxh").val();
				var url = "jxStudents.do?method=toJxStudentRegistPage";
				var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&pertype="+pertype;
				window.open(spath,"toJianxsRegist");
			}
		}
    }
</script>
</body>
</html>
