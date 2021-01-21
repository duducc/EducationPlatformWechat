<%@ page language="java" contentType="text/html"  pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>绑定页面</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
</head>
<body ontouchstart>
	<form method="get" id="from1">
	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<div class="weui_tab">
    <!-- 内容 -->
    	<div class="weui_tab_bd">
	        <!-- 标题 -->
	        <header class='demos-header' style="background-color:#65B39D;">
	            <h1 class="demos-title" style="color: #fff;"><b>学员绑定</b></h1>
	        </header>
	        <!-- 内容展现 -->
	        <div class="weui_cells weui_cells_form">
	        	<p style="color:#f00; font-size:14px; margin-bottom:20px;padding:5px 5px 5px 5px;">注：如果在此公众号中已经注册过信息，现在只需要绑定即可，否则请点击下方的注册按钮进行注册，待系统审核通过后即可使用！</p>
	             <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">姓名</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="name" name="name" placeholder="输入姓名" type="text">
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">身份证号</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="idcard" name="idcard" placeholder="请输入证件号码" type="text" value="">
	                </div>
	            </div>
	        </div>
	        <div class='demos-content-padded'>
	            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">确认</a>
	        </div>
	        <div class='demos-content-padded' style="margin-top: -10px;text-align: center;">
	            <a href="javascript:;" style="text-decoration:underline;" onclick="toRegist();">点击注册</a>
	            /
	            <a href="javascript:;" style="text-decoration:underline;" onclick="tochaxun();">忘记账号?</a>
	        </div>
    	</div>
	</div>
</form>
</body>
<div id="apply_opinion"  style="display:none; ;padding-left:10px;padding-right: 10px;  text-align: center;">
	<div class="layui-form-pane" style="margin-top: 20px;">
		<input type="radio" name="xylx" value="1" checked="checked"/>实习学员&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="radio" name="xylx" value="2"/>研究生
	</div>
</div>
<script src="layer/layer.js" charset="utf-8"></script>
<script src="js/jquery-2.1.4.js"></script>
<script>
	var width=$("body").width();
	var height=$("body").height()+4;
    $(document).ready(function () {
        /**
         * 点击绑定按钮
         */
        $("a[name='bindingBtn']").click(function () {
            //获取接种卡号
            var openid = $("#openid").val();
			var clientsxh = $("#clientsxh").val();
            var idcard = $("#idcard").val().replace(/\s+/g,"");
            var name = $("#name").val().replace(/\s+/g,"");
            if( idcard==undefined || idcard.trim()=='' || name==undefined || name.trim()=='' ){
                $.alert("姓名或证件号号不能为空！","提示");
                return;
            }
            var wechatInfos = {};
            wechatInfos['name'] = name;
            wechatInfos['idcard'] = idcard;
            var taskinfo = JSON.stringify(wechatInfos);
            //ajax请求数据
           	var url ="jxStudents.do?method=bindStudent";
			$.post(url,{taskinfo:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh},function (data, status) {
		         if( status=="success" ){
		             var json = eval(data);
		             switch (json.errorMsg) {
		                 case "success":		//成功
			             layer.alert("绑定成功", {title: '提示信息',yes: function(){
							layer.closeAll();
						    WeixinJSBridge.call('closeWindow');
						 }});
			             break;
			             case "chunfubind":
			             layer.alert("不能在同一个手机绑定其他账号！", {title: '提示信息'});
			             break;
			             case "none":		//成功
			             layer.alert("信息不匹配，请核实！", {title: '提示信息'});
			             break;
		                 case "error":		//服务器异常
		                 layer.alert("服务器异常，稍后再试！", {title: '警告'});
		                 break;
		              }
		            }else{
		                 layer.alert("操作失败！", {title: '警告'});
		            }
		      },"json");
        });
    });
    
    function toRegist(){
    	var url = "xfemployee.do?method=toUserRegisterPage&type=2";
    	var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
    	window.location.href=url+"&openid="+openid+"&clientsxh="+clientsxh;
    	
    	
    	/* layer_index = layer.open({
			 type: 1,
			 title: '注册类型',
			 area: [(width-60)+'px', (height/2-100)+'px'],
			 shade: 0.8,
			 content:  $("#apply_opinion"),
			 btn: ['去注册', '取消'],
			 yes:function(index, layero){
				 stuRegist();
			 },
			 btn2:function( index , layero){
				 $("#apply_opinion").css("display","none");
			 },
			 cancel: function(){ 
			     $("#apply_opinion").css("display","none");
			 }
	    }); */
    }
    
    /* function stuRegist(){
    	var xylx = $("input[name='xylx']:checked").val();
    	var url = "";
    	if(xylx==1){
    		url = "jxStudents.do?method=toStudentRegistPage";
    	}else if(xylx==2){
    		url = "jxStudents.do?method=toGraduateRegistPage";
    	}
    	var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
    	window.location.href=url+"&openid="+openid+"&clientsxh="+clientsxh;
    } */
</script>
</html>
