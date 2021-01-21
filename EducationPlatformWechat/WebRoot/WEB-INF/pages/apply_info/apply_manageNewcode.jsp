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
	<!-- 新卡办理申请 -->
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
				<span style="font-size: 13px;">上传中</span>
			</div>
		</div>
	</div>
	<!-- ---------------------------------------------------------------------------------------------- -->
<form method="post" id="uploadform" name="uploadform" action="" enctype="multipart/form-data" >
	<input type="hidden" id="openId" name="openId" value="${openId }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<div class="weui_tab">
    	<div class="weui_tab_bd">
	        <header class='demos-header'>
	            <h1 class="demos-title">新卡办理</h1>
	        </header>
        	<!-- 内容展现 -->
        	<div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">医通卡号：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input class="weui_input" id="yitongCard" name="yitongCard" placeholder="输入您的卡号" type="text" style="float: left;width: 80%;">
                    <a name="createBtn" href="javascript:;" onclick="findbkinfo();">
                    	<img src="images/service/wdcx2.jpg" style="width: 30px;height: 30px;">
                    </a>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">身份证号：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="sfzhm" name="sfzhm" placeholder="输入您的身份证号" type="text" style="float: left;width: 80%;">
                    <a name="createBtn" href="javascript:;" onclick="findbkinfo();">
                    	<img src="images/service/wdcx2.jpg" style="width: 30px;height: 30px;">
                    </a>
                </div>
            </div>
            
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">姓名：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="username" name="username"  type="text" placeholder="请填写真实姓名">
                </div>
            </div>
             <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">性别：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                   	<input type="radio" name="usersex" value="0">女&nbsp;&nbsp;
                   	<input type="radio" name="usersex" value="1" checked="checked">男
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所在医院：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<select  class="select_wx" name="yiyuan" id="yiyuan" onchange="deptchange('');">
                		<option value="00">请选择所在医院</option>
                		<c:forEach items="${yiyuanList }" var="yylist">
                			<option value="${yylist.glbm }">${yylist.bmmc }</option>
                		</c:forEach>
                	</select>
                	<input type="hidden" id="dept" name="dept"/>
                </div>
            </div>
            <!-- <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">科室：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <select class="select_wx" name="dept" id="dept">
                		<option value="00">请选择科室</option>
                	</select>
                </div>
            </div> -->
            <%-- <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">职称：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<select  id="zhicheng" name="zhicheng" class="select_wx">
					 	<code:printCode dmjc="ZC" defaultValue="${empEntity.zhicheng }" type="1"/>
					</select>
                </div>
            </div> --%>
            <input type="hidden" id="zhicheng" name="zhicheng"/>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">用户类别：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                   	<input type="radio" name="yhlb" checked="checked" value="1">医院用户&nbsp;&nbsp;
                   	<input type="radio" name="yhlb" value="2">其他群众
                </div>
            </div>
            <!-- action="applyInfo.do?method=upload"  -->
             <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上传照片：</label></div>
               	<div class="fileInputContainer divimg">
				    <input class="fileInput" type="file" name="file1" id="file1" onchange='PreviewImage1(this)'>
			    </div>
			    <div>
				</div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label"></label></div>
               	<div class="weui_cell_bd weui_cell_primary" style="height: 90px;">
				    <div id="imgPreview1" style="float: left;">
				    	<img src="images/nopic.png" style="height: 100px;width:100px;"/>
				    </div>
				    <div style="float: left;margin-left: 30px;margin-top: 50px;">
						<input type="button" onclick="UploadFile();"  class="in_but" value="点击上传"/>
                    </div>
			    </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">邮寄地址：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input class="weui_input" id="location" name="location"  type="text" placeholder="请填写收取地址">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">联系方式：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input class="weui_input" id="Tel" name="Tel"  type="text" placeholder="请填写联系方式">
                </div>
            </div>
        </div>
		<!--  -->
		
        <div class='demos-content-padded'>
            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">确认</a>
        </div>
    </div>
</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	function findbkinfo(){
		var sfzhm = $("#sfzhm").val();
		var yitongCard = $("#yitongCard").val();
		if(sfzhm=='' && yitongCard==''){
			alert("提取信息时信息不能为空！");
			return false;
		}
		 $.ajax({
		 	url: 'applyInfo.do?method=getBKInfoBySfzhm&sfzhm='+sfzhm+'&yitongCard='+yitongCard,
		  	cache: false,
		  	async: true,  
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var entity = data; 
		  		$("#yitongCard").val(entity.yitongcode);
		  		$("#sfzhm").val(entity.sfzhm);
		  		$("#username").val(entity.userxm);
		  		$("input[name='usersex']").eq(entity.usersex).attr("checked","checked");
		  		$("#yiyuan").val(entity.yiyuan);
		  		$("#zhicheng").val(entity.zhicheng);
		  		$("#dept").val(entity.dept);
		     },
		}); 
	}
	//-------------------------------------------根据医院异步获取子科室-----------------------------------
	/* function deptchange(value){
		var yiyuan = $("#yiyuan").val();
		document.getElementById("dept").options.length = 0;
		 $.ajax({
		 	url: 'dept.do?method=getDeptByYiyuan&yiyuan='+yiyuan,
		  	cache: false,
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var arraylist = data;
		  		$("#dept").append("<option value='00'>请选择科室</option>");
		  		for(var i = 0;i<arraylist.length;i++){
		  			$("#dept").append("<option value='"+arraylist[i].glbm+"'>"+arraylist[i].bmmc+"</option>");
		  		} 
		     },
		}); 
	} */
	//===========================================文件上传================================================
	//------------------------------------------显示图片信息-------------------------------------------
	function PreviewImage1(imgFile) {
   		if (checkPic1()) {
	    	var path; 
	    	if(document.all){ 
	     		imgFile.select(); 
	     		path = document.selection.createRange().text; 
	     		document.getElementById("imgPreview1").innerHTML=""; 
	     		document.getElementById("imgPreview1").style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(enabled='true',sizingMethod='scale',src=\"" + path + "\")";//使用滤镜效果 
	    	}else{ 
	     		path = URL.createObjectURL(imgFile.files[0]);
				document.getElementById("imgPreview1").innerHTML = "<img src='"+path+"'/>"; 
	    	} 
   		}     
	} 
	function checkPic1() { 
		var picPath = document.getElementById("file1").value;
		var type = picPath.substring(picPath.lastIndexOf(".") + 1, picPath.length) .toLowerCase(); 
		var pattern = /(\jpg$)|(\png$)|(\jpeg$)|(\gif$)|(\bmp$)/; 
		if(!pattern.test(type)){ 
	    	$.alert("系统仅支持jpg/jpeg/png/gif/bmp格式的照片！","提示");
	    	return false; 
		} 
	    	return true; 
	}
	//=============================================上传文件==============================================
	var filepath = "";
	function UploadFile() {  
		 var filename = jQuery("input[name='file1']").val();
		 if(filename==""){
		     $.alert("请选择照片后上传！","提示信息");
		     return ;
	  	 }
		 document.getElementById('up_div').style.display ='block';
	     var formData = new FormData($( "#uploadform" )[0]); 
	     var url = '${pageContext.request.contextPath}/servlet/UploadServlet';
	     $.ajax({  
	          url: url,  
	          type: 'POST',  
	          data: formData,  
	          async: true,  
	          cache: false,  
	          contentType: false,  
	          processData: false,  
	          dataType: "json",
	          success: function (data, status) {
	        	  if( status=="success" && data!=null){
						var json = eval(data);
						switch (json.msgType) {
							case "0":		
							$.alert(json.msgInfo,"提示信息");
							break;
							case "1":		
							filepath = json.msgInfo;
					        if(filepath!=null||filepath!=""){
					        	$.alert("照片上传成功！","提示信息");
					        	document.getElementById('up_div').style.display='none';
					        }else{
					            $.messager.alert("提示信息", "操作失败！");
					        }
							break;
						}
					}else{
						$.messager.alert("提示信息", "操作失败！");
					}
	          },
	          error:function(msg){
	        	  alert("msg:"+JSON.stringify(msg));
	          }
	 	});  
	} 
	//=============================================保存办卡信息===========================================
    $(document).ready(function () {
        $("a[name='bindingBtn']").click(function () {
        	var openId = $("#openId").val();
            var clientsxh = $("#clientsxh").val();
        	var username = $("#username").val();
        	if(username==""||username==null){
        		$.alert("姓名不能为空！","提示");
        		return false;
        	}
        	var sfzhm = $("#sfzhm").val();
        	if(sfzhm==""||sfzhm==null){
        		$.alert("身份证号码不能为空！","提示");
        		return false;
        	}
        	var isIDCard=/^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$|^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}([0-9]|X)$/;
 			if(!isIDCard.test(sfzhm)){
 				$.alert("身份证格式不正确！","提示");
 				return false;
 			}       	
        	var usersex = $("input[name='usersex']:checked").val();
        	var yiyuan = $("#yiyuan").val();
        	if(yiyuan=="00"){
        		$.alert("请选择医院！","提示");
        		return false;
        	}
        	var dept = $("#dept").val();
        	if(dept=="00"){
        		$.alert("请选择科室！","提示");
        		return false;
        	}
        	var zhicheng = $("#zhicheng").val();
        	if(zhicheng==""||zhicheng==null){
        		$.alert("请选择职称！","提示");
        		return false;
        	}
        	if(filepath==undefined || filepath.trim()==''||filepath==null ){
        		$.alert("请上传照片！","提示");
        		return false;
        	}
        	var location = $("#location").val();
        	if(location==undefined || location.trim()=='' ){
        		$.alert("请填写地址！","提示");
        		return false;
        	}
        	var tel = $("#Tel").val();
        	if(tel==undefined || tel.trim()=='' ){
        		$.alert("请填写联系方式！","提示");
        		return false;
        	}
        	var yhlb = $("input[name='yhlb']:checked").val();
        	var applyinfos = {};
        	applyinfos['openid']=openId;
        	applyinfos['userxm']=username;
        	applyinfos['sfzhm']=sfzhm;
        	applyinfos['usersex']=usersex;
        	applyinfos['yiyuan']=yiyuan;
        	applyinfos['dept']=dept;
        	applyinfos['zhicheng']=zhicheng;
        	applyinfos['yhlb']=yhlb;
        	applyinfos['state']='1';
        	applyinfos['sqrdz']=location;
        	applyinfos['sqrlxfs']=tel;
        	applyinfos['bltype']='3';
        	applyinfos['spbj']='0';
        	applyinfos['zhichengmc']=filepath;
			var applyInfo = JSON.stringify(applyinfos);
        	//location.href="applyInfo.do?method=toPayNewcardPage&username="+username+"&sfzhm="+sfzhm+"&usersex="+usersex+"&yiyuan="+yiyuan+"&dept="+dept+"&zhicheng="+zhicheng+"&yhlb="+yhlb+"&yiyuantext="+yiyuantext+"&depttext="+depttext+"&zhichengtext="+zhichengtext+"&userImage="+userImage;
            //ajax请求数据
            var url = "applyInfo.do?method=SaveNewcodeInfo";
           	$.post(url,{applyInfo:encodeURI(applyInfo)},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
	                    case "noemp":		//春福
	                        $.alert("没有您的人员信息，请在管理员处添加人员信息！", "提示");
	                        break;
                    	case "exsit":		//春福
                            $.alert("已有您的信息，您可办理补卡！", "提示");
                            break;
                        case "success":		//成功
                        	/* if (confirm("办卡信息提交成功，是否立即缴费？")) {  
                         		window.location.href="paymentManage.do?method=toPayRenewPage&openId="+openId+"&clientsxh="+clientsxh+"&type=0";
                        	}else{
                        		setTimeout("WeixinJSBridge.call('closeWindow')",20);
                        	} */
                            //setTimeout("applyInfo.do?method=SaveNewcodeInfo&username="+username+"&yiyuantext="+yiyuantext+"&depttext="+depttext+"&zhichengtext="+zhichengtext,1000);
                        	$.toast("提交申请成功");
                        	//setTimeout("WeixinJSBridge.call('closeWindow')",1000);
                            break;
                        case "failed":		//失败
                            $.alert("申请失败！", "提示");
                            break;
                        case "error":		//服务器异常
                            $.alert("服务器异常，稍后再试！", "警告！");
                            break;
                    }
                }else{
                    $.alert("操作失败！", "提示");
                }
            },"json");
        });
    });
</script>
</body>
</html>
