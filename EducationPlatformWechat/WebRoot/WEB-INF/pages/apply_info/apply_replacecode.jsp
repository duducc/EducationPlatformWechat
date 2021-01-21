<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<!--申请部卡页面  -->
    <title></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="js/jquery.1.7.2.min.js"></script>
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
<form method="post" id="from1" name="from1" action="" enctype="multipart/form-data" >
<input type="hidden" id="openId" name="openId" value="${openId }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">申请补卡</h1>
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
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">持卡人姓名：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="userName" name="userName" placeholder="输入您的姓名" type="text" value="">
                </div>
            </div>
			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">性别：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
    				<input id="rdo1" name="usersex" type="radio" value="0"/>女&nbsp;&nbsp;
                   	<input id="rdo1" name="usersex" type="radio" value="1"/>男
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上传照片：</label></div>
               	<div class="fileInputContainer divimg">
				    <input class="fileInput" type="file" name="file1" id="file1" onchange='PreviewImage1(this)'>
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
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">邮递地址：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="location" name="location" placeholder="请输入邮寄地址" type="text" value="">
                    <!-- <textarea id="location" name="location" class="form-control" rows="4" style="width: 90%;" ></textarea> -->
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">联系方式</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="lxfs" name="lxfs" placeholder="输入您的手机号码" type="text" value="">
                </div>
            </div>
        </div>
        <div class='demos-content-padded'>
            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">确认申请</a>
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
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var entity = data; 
		  		$("#yitongCard").val(entity.yitongcode);
		  		$("#sfzhm").val(entity.sfzhm);
		  		$("#userName").val(entity.userxm);
		  		$("input[name='usersex']").eq(entity.usersex).attr("checked","checked");
		     },
		}); 
	}
	
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
	  	 }else{
	  		
	  	 }
		 
	     var formData = new FormData($( "#from1" )[0]); 
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
	          beforeSend:function(XMLHttpRequest){
	        	  document.getElementById('up_div').style.display='block';
	          },
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
	
    $(document).ready(function () {
        $("a[name='bindingBtn']").click(function () {
            //获取接种卡号
            var yitongCard = $("#yitongCard").val();
            var userName = $("#userName").val();
            var openId = $("#openId").val();
            var clientsxh = $("#clientsxh").val();
            var location = $("#location").val();
            var lxfs = $("#lxfs").val();
            if( yitongCard==undefined || yitongCard.trim()=='' || userName==undefined || userName.trim()=='' ){
                $.alert("请点击获取您的信息！","提示");
                return;
            }
            if(filepath==undefined || filepath.trim()==''||filepath==null ){
        		$.alert("请上传照片！","提示");
        		return false;
        	}
            if(location==undefined || location.trim()=='' ){
        		$.alert("请填写地址！","提示");
        		return false;
        	}
        	if(lxfs==undefined || lxfs.trim()=='' ){
        		$.alert("请填写联系方式！","提示");
        		return false;
        	}
            //ajax请求数据
            var applyinfos = {};
            applyinfos['yitongcode']=yitongCard;
        	applyinfos['openid']=openId;
        	applyinfos['userxm']=userName;
        	applyinfos['sqrlxfs']=lxfs;
        	applyinfos['zhichengmc']=filepath;
        	applyinfos['sqrdz']=location;
        	applyinfos['state']='1';
        	applyinfos['bltype']='2';
        	applyinfos['spbj']='0';
			var applyInfo = JSON.stringify(applyinfos);
			
            var url = "applyInfo.do?method=applyreplacecode";
            $.post(url,{applyInfo:encodeURI(applyInfo)},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
                        case "success":		//成功
                            /* if (confirm("补卡信息提交成功，是否立即缴费？")) { 
                            	window.location.href="paymentManage.do?method=toPayRenewPage&openId="+openId+"&clientsxh="+clientsxh+"&type=1";
                        	}else{
                        		return;
                        	} */
                        	$.toast("提交申请成功");
                        	//setTimeout("WeixinJSBridge.call('closeWindow')",1000);
                            break;
                        case "failed":		//失败
                            $.alert("申请失败！", "提示");
                            break;
                        case "infoerror":
                        	$.alert("卡号或姓名错误，请重新输入！","提示");
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
            //WeixinJSBridge.call('closeWindow');
    });
</script>
</body>
</html>
