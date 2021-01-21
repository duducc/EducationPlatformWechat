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
	<style type="text/css">
		.select_wx{
			background-color: #fff;
			border: 0px;
		}
	</style>
</head>
<body ontouchstart>
	<form method="get" id="from1">
	<input type="hidden" id="openId" name="openId" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<div class="weui_tab">
    <!-- 内容 -->
    	<div class="weui_tab_bd">
	        <!-- 标题 -->
	        <header class='demos-header' style="background-color:#65B39D;">
	            <h1 class="demos-title" style="color: #fff;"><b>我的资料</b></h1>
	        </header>
	        <div style="width: 100%;; height: 30px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; ">
  				<span style="color: red;font-size: 15px;margin-left: 15px;">注:请输入您的联系方式，以便维护人员通讯录。</span><br>
 			</div>
	        <!-- 内容展现 -->
	        <div class="weui_cells weui_cells_form">
	             <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">姓名</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="xm" name="xm" placeholder="输入姓名" type="text" value="">
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">证件类型</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <select  class="select_wx" onchange="get_type();" id="select_type" name="select_type">
	                    	<option value="1">工号</option>
	                    	<option value="2">身份证号码</option>
	                    </select>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label"><span id="zjhhm">工号</span></label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="number" name="number" placeholder="请输入..." type="text" value="">
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">联系方式</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="tel" name="tel" placeholder="请输入联系方式" type="text" value="">
	                </div>
	            </div>
	        </div>
	        <div class='demos-content-padded'>
	            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">确认</a>
	        </div>
	        <div class='demos-content-padded' style="margin-top: -10px;text-align: center;">
	            <a href="javascript:;" style="text-decoration:underline;" onclick="tozhuce();">点击注册</a>
	            /
	            <a href="javascript:;" style="text-decoration:underline;" onclick="tochaxun();">忘记账号?</a>
	        </div>
    	</div>
	</div>
</form>
<script>
    $(document).ready(function () {
        /**
         * 点击绑定按钮
         */
        $("a[name='bindingBtn']").click(function () {
            //获取接种卡号
            var type = $("#select_type").val();
            var number = $("#number").val().replace(/\s+/g,"");
            var userName = $("#xm").val().replace(/\s+/g,"");
            var usertel = $("#tel").val();
            var openId = $("input[name='openId'][type='hidden']").val();
            var clientsxh = $("input[name='clientsxh'][type='hidden']").val();
            if( number==undefined || number.trim()=='' || userName==undefined || userName.trim()=='' ){
                $.alert("姓名或工号不能为空！","提示");
                return;
            }
            if(usertel==""||usertel==null){
            	$.alert("联系方式不能为空！","提示");
                return;
            }
            var wechatInfos = {};
            wechatInfos['xm'] = userName;
            wechatInfos['openId'] = openId;
            wechatInfos['clientsxh'] = clientsxh;
            wechatInfos['yitongCard'] = number;
            wechatInfos['remark2'] = usertel;
            wechatInfos['state'] = type;
            var wechatInfo = JSON.stringify(wechatInfos);
            //ajax请求数据
            var url = "wechatBind.do?method=YTcodeBind";
            $.post(url,{wechatInfo:encodeURI(wechatInfo)},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
	                    case "yjbind":		//检测不匹配
	                        $.alert("该工号已绑定，请勿重复绑定！", "提示");
	                        break;
                    	case "noperson":		//检测不匹配
	                        $.alert("工号或姓名不正确！", "提示");
	                        break;
	                    case "nameerror":		//检测不匹配
	                        $.alert("工号或姓名不正确！", "提示");
	                        break;
                        case "success":		//成功
                            $.toast("绑定成功");
                            setTimeout("WeixinJSBridge.call('closeWindow')",1000);
                            break;
                        case "failed":		//失败
                            $.alert("绑定失败！", "提示");
                            break;
                        case "error":		//服务器异常
                            $.alert("服务器异常，稍后再试！", "警告！");
                            break;
                        case "noperson":		//未查询到人员信息
                            $.alert("未查询到人员信息，绑定失败！", "提示");
                            break;
                    }
                }else{
                    $.alert("操作失败！", "提示");
                }
            },"json");
        });
    });
    
    function tozhuce(){
    	var openId = $("#openId").val();
    	var clientsxh = $("#clientsxh").val();
    	window.location.href="xfemployee.do?method=toUserRegisterPage&openid="+openId+"&clientsxh="+clientsxh+"&type=2";
    }
    /* 
    	xfempregister.do?method=toUsernumbersourch
    */
    function tochaxun(){
    	var openId = $("#openId").val();
    	var clientsxh = $("#clientsxh").val();
    	window.location.href="xfempregister.do?method=toUsernumbersourch";
    }
    	
    function get_type(){
    	var type = $("#select_type").val();
    	var name = "";
    	name = type==1?"工号":"身份证号";
    	document.getElementById('zjhhm').innerText=name;
    }
</script>
</body>
</html>
