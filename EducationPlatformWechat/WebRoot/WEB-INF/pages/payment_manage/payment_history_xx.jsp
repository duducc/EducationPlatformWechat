<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/common.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	
</head>
<body ontouchstart>
<div class="weui_tab">
<input type="hidden" value="${recordType }"/>
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">详细信息</h1>
        </header>
        <!-- 内容展现 -->
        
        <div class="weui_cells weui_cells_form">
        	<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">缴费人姓名：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="" name=""  type="text" value="${entity.username }" readonly="readonly">
                </div>
            </div>
             <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">缴费类型：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${entity.paymethod==3 }">
                    	<input class="weui_input" id="" name=""  type="text" value="医通卡续费" readonly="readonly">
                	</c:if>
                	<c:if test="${entity.paymethod==2 }">
                    	<input class="weui_input" id="" name=""  type="text" value="补卡缴费" readonly="readonly">
                	</c:if>
                	<c:if test="${entity.paymethod==1 }">
                    	<input class="weui_input" id="" name=""  type="text" value="新办卡缴费" readonly="readonly">
                	</c:if>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">缴费方式：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="" name=""  type="text" value="人工收费" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">金额：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="" name=""  type="text" value="${entity.paymoney }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">缴费时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="" name=""  type="text" value="${entity.paytime }" readonly="readonly">
                </div>
            </div>
        </div>
        <div class='demos-content-padded' id="close">
            <a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_primary">关闭</a>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
	$(document).ready(function () {
        /**
         * 点击绑定按钮
         */
        $("a[name='closeBtn']").click(function () {
            WeixinJSBridge.call('closeWindow');
        });
    });
</script>
</html>
