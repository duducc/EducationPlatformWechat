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
    <title>我的缴费</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.1.7.2.min.js"></script>
    <style type="text/css">
    	.imfg{
    		width: 15%;
    	}
    	.imfgs{
    		width: 10%;
    	}
    </style>
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="xh" name="xh" value="${entity.xh }"/>
<input type="hidden" id="openid" name="openid" value="${openid }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 内容展现 -->
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">我的缴费</h1>
        </header>
		<span style="margin-left: 15px;color: #3cc51f;font-size: 18px;">医通卡号：${entity.yitongcode }</span><br>
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">姓名：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="userxm" name="suerxm"  type="text" value="${entity.userxm }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">身份证号：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input class="weui_input" id="hsfzhm" name="hsfzhm"  type="text" value="${entity.sfzhm }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">申请时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input class="weui_input" id="qdeptmc" name="qdeptmc"  type="text" value="${entity.sqsj.substring(0,19) }" readonly="readonly">
                </div>
            </div> 
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">需缴费金额：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${entity.bltype==2 }">
                   		<input class="weui_input" id="qSex" name="qSex"  type="text" value="120元" readonly="readonly">
                   	</c:if>
                   	<c:if test="${entity.bltype==3 }">
                  		<input class="weui_input" id="qSex" name="qSex"  type="text" value="150元" readonly="readonly">
                   	</c:if>
                </div>
            </div> 
        </div>
		<div align="center" style="clear:both;padding-top:10px;">
		     <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="savewxjb()" >立即缴费</button>
		     <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="cancelwxjb()" >删除本条信息</button>
	   		 <input type="hidden" id="bltype" name="bltype" value="${entity.bltype }"/>
	   </div>
    </div>
</div>


</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	function cancelwxjb(){
		 var clientsxh = $("#clientsxh").val();
		 var openId = $("#openId").val();
		 var xh = $("#xh").val();
		 var url = "applyInfo.do?method=deleteApplyinfoByxh";
         $.post(url,{xh:xh},function (data, status) {
             if( status=="success" ){
                 var json = eval(data);
                 switch (json.errorMsg) {
                     case "success":		//成功
                    	 $.toast("删除成功！");
                         setTimeout("WeixinJSBridge.call('closeWindow')",1000);
                         break;
                     case "failed":		//失败
                         $.alert("删除失败！", "提示");
                         break;
                     case "error":		//服务器异常
                         $.alert("服务器异常，稍后再试！", "警告！");
                         break;
                 }
             }else{
                 $.alert("操作失败！", "提示");
             }
         },"json");										
 	}
 	
 	function savewxjb(){
 		var clientsxh = $("#clientsxh").val();
		var openId = $("#openid").val();
		var bltype = $("#bltype").val();
		 var type = "";
		 if(bltype==3){
			 type="0";
		 }else if(bltype==2){
			 type="1";
		 }
 		window.location.href="paymentManage.do?method=toPayRenewPage&openId="+openId+"&clientsxh="+clientsxh+"&type="+type;
    }
</script>
</body>
</html>
