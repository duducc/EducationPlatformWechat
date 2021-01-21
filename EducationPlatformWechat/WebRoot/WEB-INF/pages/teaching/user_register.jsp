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
	<!-- 注册账号 -->
    <title>注册账号</title>
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
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jweixin-1.0.0.js"></script>
    <script src="layui/layui.all.js" charset="utf-8"></script>
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
		.weui_input,.select_wx{
			width: 93%;
		}
		.in_but{
			width: 100%;
		}
    </style>
</head>
<body>
<!-- -----------------------------------------等待页面--------------------------------------------- -->
<div id="up_div" class="up_div">
	<div style="width: 100%;" id="bet_ondiv"></div>
	<div class="bet_div" id="bet_div">
		<div style="width: 100%;height: 10px;"></div>
		<div style="height: 70px;width: 60%;margin-left:20%;">
			<img src="images/loadingwx.gif" style="width: 100%;">
		</div>
		<div style="width: 100%;height: 5px;"></div>
		<div style="width: 100%;text-align: center;">
			<span style="font-size: 13px;">请稍后</span>
		</div>
	</div>
</div>
<!-- ---------------------------------------------------------------------------------------------- -->
<form method="post" id="uploadform" name="uploadform" action="" enctype="multipart/form-data" style="width: 100%;">
	<input type="hidden" id="openId" name="openId" value="${openId }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="openionType" name="openionType" value="${openionType }"/>
	<div class="weui_tab">
    	<div class="weui_tab_bd" >
	        <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
  				<div style="width: 25%;height: 80px;float: left;">
  					<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;" >
  						<img src="images/txwsc1.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
  					</button>
  				</div>
  				<div style="width: 45%;height: 80px;float: left;">
  					<div style="width: 100%;margin-top: 26px;">
	  					<span style="color: #fff;font-size: 18px;"><b>账号注册</b></span><br>
	  					<span style="color: #fff;font-size: 15px;">带*号选项为必填项</span>
  					</div>
  				</div>
  				<div style="width: 30%;height: 80px;float: left;">
  					<div style="width: 100%;margin-top: 30px;">
	  					<span style="color: #fff;font-size: 15px;float: right;margin-right: 10px;">${time }</span>
  					</div>
  				</div>
  			</div>
  			<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
    			<div style="width: 100%;; height: 30px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0;line-height: 30px;">
     				<span style="color: red;font-size: 14px;margin-left: 15px;">用户工号最后将作为您的登录账户，请认真填写！</span><br>
    			</div>
     		</div>
        	<!-- 内容展现 -->
        	<div class="weui_cells weui_cells_form" style="border:1px solid #cccccc;height: 80%;overflow-y:auto;">
        		<div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">工号：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<input class="weui_input" id="usernumber" name="usernumber" placeholder="输入您的工号" type="text">
	                	<span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">姓名：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<input class="weui_input" id="username" name="username" placeholder="输入您的姓名" type="text">
	                	<span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">性别：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                   	<input type="radio" name="usersex" value="0">女&nbsp;&nbsp;
	                   	<input type="radio" name="usersex" value="1" checked="checked">男
	                   	<span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">身份证号：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="sfzhm" name="sfzhm" placeholder="输入您的身份证号" type="text">
	                	<span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">用户来源：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <select  id="uresource" name="uresource" class="select_wx" onchange="getyhlb();">
						 	<code:printCode dmjc="JJYHLY" defaultValue="1" dmz="1" type="1"/>
						</select>
						<span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所在医院：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="yiyuan_name" placeholder="输选择医院名称" type="text"
	                    style="width: 70%;border: 1px solid #cccccc;height: 35px;border-radius: 4px 0px 0px 4px;float: left;">
	                	<input type="hidden" id="yiyuan_id"/>
	                    <select id="yiyuan_select" style="width: 20%;height: 35px;border-radius: 0px 4px 4px 0px;float: left;" onchange="yiyuanchange();">
	                	</select>
	                    <span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所在科室：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="dept_name" placeholder="输选择科室名称" type="text"
	                    style="width: 70%;border: 1px solid #cccccc;height: 35px;border-radius: 4px 0px 0px 4px;float: left;">
	                    <input type="hidden" id="dept_id"/>
	                    <select id="dept_select" style="width: 20%;height: 35px;border-radius: 0px 4px 4px 0px;float: left;" onchange="deptchange();">
	                    	
	                	</select>
	                    <span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">联系电话：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="usertel" name="usertel" placeholder="输入您的电话" type="text">
	                    <span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">职称：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select  id="zhicheng" name="zhicheng" class="select_wx">
						 	<code:printCode dmjc="ZC" bShowDmz="false" defaultValue="YA" type="1"/>
						</select>
						<span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">职称级别：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select  id="zhichenglv" name="zhichenglv" class="select_wx">
						 	<code:printCode dmjc="ZCJB" bShowDmz="false" dmz="${userobj.zcjb}"  defaultValue="1" type="1"/>
						</select>
						<span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">专业：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <select id="zhuanye" name="zhuanye" class="select_wx">
						 	<code:printCode bShowDmz="false" dmjc="ZY" defaultValue="01" type="1"/>
						</select>
						<span style="color: red;float: right;">*</span>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">学历：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select  id="xueli" name="xueli" class="select_wx">
						 	<code:printCode bShowDmz="false" dmjc="XL" defaultValue="" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">名族：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select name="minzu" id="minzu"  class="select_wx">
						 	<code:printCode bShowDmz="false" dmjc="MZ" dmz="${userobj.mz}"  defaultValue="${employee.minzu}" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">政治面貌：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select name="zhengzi" id="zhengzi"  class="select_wx">
						 	<code:printCode bShowDmz="false" dmjc="ZZMM" dmz="${userobj.zzmm}"  defaultValue="" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">职务：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	 <select name="zhiwu" id="zhiwu"  class="select_wx">
						 	<code:printCode bShowDmz="false" dmjc="YNZW" dmz="${userobj.ynzw}"  defaultValue="" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">学位：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<select name="xuewei" id="xuewei"  class="select_wx">
						 	<code:printCode bShowDmz="false" dmjc="XW" dmz="${userobj.xw}"  defaultValue="" type="1"/>
						</select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">电子邮箱：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                	<input class="weui_input" id="useremail" name="useremail" placeholder="输入您的邮箱" type="text">
	                </div>
	            </div>
        	</div>
        	<!-- <div class='demos-content-padded'>
	            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">立即申请</a>
	            <a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_primary">关闭</a>
	        </div> -->
	        <!-- <div class="layui-form-item" style="text-align: center;margin-top: 4px;">
		      	<button name="bindingBtn" type="button" class="layui-btn" onclick="register_submit();"><i class="layui-icon">&#x1005;</i>立即提交</button>
		      	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
	    	</div> -->
	    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
			     	<button name="bindingBtn" type="button" class="layui-btn" onclick="register_submit();"><i class="layui-icon">&#x1005;</i>立即提交</button>
		      		<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
		     	</div>
		  	</div>
    	</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	$(function(){
		getyhlb();
	});
	//-------------------------------------------根据医院异步获取子科室-----------------------------------
	function yiyuanchange(value){
		var yiyuan = yiyuan = $("#yiyuan_select").val();
		var yiyuanname = yiyuanname = $("#yiyuan_select option:selected").text();
		$("#yiyuan_name").val(yiyuanname);
		$("#yiyuan_id").val(yiyuan);
		$("#yiyuan_select").val("");
		document.getElementById("dept_select").options.length = 0;
		 $.ajax({
		 	url: 'dept.do?method=getDeptByYiyuan&yiyuan='+yiyuan,
		  	cache: false,
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var arraylist = data;
		  		$("#dept_select").append("<option value='00'></option>");
		  		for(var i = 0;i<arraylist.length;i++){
		  			$("#dept_select").append("<option value='"+arraylist[i].glbm+"'>"+arraylist[i].bmmc+"</option>");
		  		} 
		     },
		});
	}
	
	function deptchange(value){
		var dept = $("#dept_select").val();
		var deptname = $("#dept_select option:selected").text();
		$("#dept_name").val(deptname);
		$("#dept_id").val(dept);
		$("#dept_select").val("");
	}
	function getyhlb(){
		document.getElementById('up_div').style.display ='block';
		document.getElementById("yiyuan_select").options.length = 0;
		document.getElementById("dept_select").options.length = 0;
		$("#yiyuan_name").val("");
		$("#dept_name").val("");
		$("#yiyuan_id").val("");
		$("#dept_id").val("");
		var uresource = $("#uresource").val();
		if(uresource=='1'){
			document.getElementById("yiyuan_name").readOnly=true;
			document.getElementById("dept_name").readOnly=true;
		}else{
			document.getElementById("yiyuan_name").readOnly=false;
			document.getElementById("dept_name").readOnly=false;
		}
		$.ajax({
		 	url: 'xfemployee.do?method=getYiyuanBySource&uresource='+uresource,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var arraylist = data;
		  		$("#yiyuan_select").append("<option value=''></option>");
		  		for(var i = 0;i<arraylist.length;i++){
		  			$("#yiyuan_select").append("<option value='"+arraylist[i].glbm+"'>"+arraylist[i].bmmc+"</option>");
		  		} 
		  		document.getElementById('up_div').style.display='none';
		     },
		});
	}
	//=============================================保存办卡信息===========================================
	function register_submit(){
		var openId = $("#openId").val();
        var clientsxh = $("#clientsxh").val();
        var usernumber = $("#usernumber").val();
        if(usernumber==""||usernumber==null){
      		$.alert("用户工号不能为空！","提示");
      		return false;
      	}
      	var username = $("#username").val();
      	var uresource = $("#uresource").val();
      	if(username==""||username==null){
      		$.alert("姓名不能为空！","提示");
      		return false;
      	}
      	var sfzhm = $("#sfzhm").val();
      	/* if(sfzhm==""||sfzhm==null){
      		$.alert("身份证号码不能为空！","提示");
      		return false;
      	}
      	var isIDCard=/^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
		if(!isIDCard.test(sfzhm)){
			$.alert("身份证格式不正确！","提示");
			return false;
		}    */     	
      	var usersex = $("input[name='usersex']:checked").val();
      	var yiyuanid = $("#yiyuan_id").val();
      	var yiyuanname = $("#yiyuan_name").val();
      	var deptid = $("#dept_id").val();
      	var deptname = $("#dept_name").val();
      	if(yiyuanname==""||yiyuanname==null){
      		$.alert("请选择或填写医院！","提示");
      		return false;
      	}
      	if(deptname==""||deptname==null){
      		$.alert("请选择或填写科室！","提示");
      		return false;
      	}
      	var usertel = $("#usertel").val();
      	if(usertel==""||usertel==null){
      		$.alert("请填写电话！","提示");
      		return false;
      	}
      	if(uresource==""||uresource==null){
      		$.alert("请选择用户来源！","提示");
      		return false;
      	}
      	var zhicheng = $("#zhicheng").val();
      	if(zhicheng==""||zhicheng==null){
      		$.alert("请选择职称！","提示");
      		return false;
      	}
      	var zhichenglv = $("#zhichenglv").val();
      	if(zhichenglv==""||zhichenglv==null){
      		$.alert("请选择职称级别！","提示");
      		return false;
      	}
      	var zhuanye = $("#zhuanye").val();
      	if(zhuanye==""||zhuanye==null){
      		$.alert("请选择专业！","提示");
      		return false;
      	}
      	var xueli = $("#xueli").val();
      	var minzu = $("#minzu").val();
      	var zhengzi = $("#zhengzi").val();
      	var zhiwu = $("#zhiwu").val();
      	var xuewei = $("#xuewei").val();
      	var useremail = $("#useremail").val();
      	var applyinfos = {};
      	applyinfos['usernumber']=usernumber;
      	applyinfos['username']=username;
        applyinfos['sex']=usersex;
      	applyinfos['idcard']=sfzhm;
      	applyinfos['yiyuan']=yiyuanid;
      	applyinfos['yiyuanname']=yiyuanname;
      	applyinfos['depart']=deptid;
      	applyinfos['deptname']=deptname;
      	applyinfos['usertel']=usertel;
      	applyinfos['userphone']=usertel;
      	applyinfos['uresource']=uresource;
      	applyinfos['zhicheng']=zhicheng;
      	applyinfos['zhichenglv']=zhichenglv;
      	applyinfos['zhuanye']=zhuanye;
      	applyinfos['xueli']=xueli;
      	applyinfos['minzu']=minzu;
      	applyinfos['zhengzi']=zhengzi;
      	applyinfos['zhiwu']=zhiwu;
      	applyinfos['xuewei']=xuewei;
      	applyinfos['useremail']=useremail;
      	applyinfos['qq']='1';
      	
      	var yhdh = $("#usernumber").val();
		var userinfos = {};
		userinfos['glbm']="62000001";
		userinfos['lxdh']=usertel;
		userinfos['mmyxq']=getlateyear();
		userinfos['qxgroup']="118";
		userinfos['qxms']="118";
		userinfos['sfgly']="0";
		userinfos['sfzmhm']=sfzhm;
		userinfos['xm']=$("#username").val();
		userinfos['yhdh']=yhdh;
		userinfos['yhgh']=usertel;
		userinfos['yhjb']="6";
		userinfos['yhyxq']=getlateyear();
		userinfos['sfxz']="1";
		userinfos['zt']="0";
		var userInfo = JSON.stringify(userinfos);
      	
		var applyInfo = JSON.stringify(applyinfos);
          //ajax请求数据
          var url = "xfemployee.do?method=insertXfEmployee";
         	$.post(url,{applyInfo:encodeURI(applyInfo),openid:openId,clientsxh:clientsxh},function (data, status) {
         		if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
	                    case "idcarderror":		//成功
	                        layer.alert("身份证号码不正确！", {title: '提示信息'});
	                        document.getElementById('up_div').style.display ='none';
	                        break;
	                    case "idcardchongfu":		//成功
	                          layer.alert("身份证重复！", {title: '提示信息'});
	                          document.getElementById('up_div').style.display ='none';
	                          break;
	                    case "usernumberchongfu":		//成功
	                          layer.alert("该人员工号已经注册！", {title: '提示信息'});
	                          document.getElementById('up_div').style.display ='none';
	                          break;
                        case "success":		//成功
                        	var url = "sysuser.do?method=addUser";
                            $.post(url,{userInfo:encodeURI(userInfo),openid:openId,clientsxh:clientsxh},function (data, status) {
                                if( status=="success" ){
                                    var json = eval(data);
                                    switch (json.errorMsg) {
                                        case "success":		//成功
                                        	  layer.msg("添加成功");
                                        	  document.getElementById('up_div').style.display ='none';
                                        	  setTimeout("WeixinJSBridge.call('closeWindow')",2000);
                	                          break;
                                        case "failed":		//失败
                                      	  	  layer.alert("添加失败", {title: '提示信息'});
                                      	  	  document.getElementById('up_div').style.display ='none';
                                              break;
                                        case "error":		//服务器异常
                                              layer.alert("服务器异常，稍后再试！", {title: '警告'});
                                              document.getElementById('up_div').style.display ='none';
                                              break;
                                    }
                                }else{
                                    layer.alert("操作失败！", {title: '警告'});
                                    document.getElementById('up_div').style.display ='none';
                                }
                          	},"json");
                        case "failed":		//失败
                      	  	  /* layer.alert("添加失败3", {title: '提示信息'}); */
                      	  	  document.getElementById('up_div').style.display ='none';
                              break;
                        case "error":		//服务器异常
                              layer.alert("服务器异常，稍后再试！", {title: '警告'});
                              document.getElementById('up_div').style.display ='none';
                              break;
                    }
                }else{
                    layer.alert("操作失败！", {title: '警告'});
                    document.getElementById('up_div').style.display ='none';
                }
          },"json");
	}
	
	function getlateyear(){
		var today = new Date();
		var y = today.getFullYear();
		var m = today.getMonth() + 1;
		var d = today.getDate();
		var SelTime = (y+1) + '-' + m + '-' + d;//开始时间……
		return SelTime;
	}
	
	function close_windos(){
		WeixinJSBridge.call('closeWindow');
	}
</script>
</body>
</html>
