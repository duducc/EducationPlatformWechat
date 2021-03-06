<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>提示页面</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <script src="js/jquery.1.7.2.min.js"></script>
</head>
<body ontouchstart>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">提示信息</h1>
        </header>
		<input type="hidden" id="openid" name="openid" value="${openid }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">提示：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <span>您的信息已绑定，请在《我的信息》基础信息中查看</span>
                </div>
            </div>
        </div>
        <div class='demos-content-padded'>
            <a name="examine" href="javascript:;" class="weui_btn weui_btn_primary">查看</a>
            <a name="noexamine" href="javascript:;" class="weui_btn weui_btn_primary">关闭</a>
        </div>
    </div>
</div>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
    $(document).ready(function () {
        /**
         * 点击绑定按钮
         */
        $("a[name='examine']").click(function () {
        	var openid = $("#openid").val();
        	var clientsxh = $("#clientsxh").val();
            location.href = "wechatBind.do?method=toBaseInfo&openid="+openid+"&clientsxh="+clientsxh;
        });
        $("a[name='noexamine']").click(function () {
            WeixinJSBridge.call('closeWindow');
        });
            //WeixinJSBridge.call('closeWindow');
    });
</script>
</body>
</html>
