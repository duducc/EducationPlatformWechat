<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>管理员通讯录</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/layui.css" media="all">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/common.css" rel="stylesheet" type="text/css" />
    <script src="js/layui.js" charset="utf-8"></script>
	<script type="text/javascript" src="js/jquery-1.9.1.js" ></script>
	<script type="text/javascript" src="js/date.js" ></script>
	<script type="text/javascript" src="js/iscroll.js" ></script>
	<style type="text/css">
		.weui_cell {
			padding:15px 5px;
			margin-top: 0;
		}
		.weui_tab{
			 position:absolute; z-index:1;
		}
	</style>
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="openId" name="openId" value="${openid }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<div class="weui_tab" style="width: 100%;">
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D;" >
					<img src="images/boolean/Paste.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>管理员通讯录</b></span><br>
				</div>
			</div>
			<div style="width: 30%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 30px;">
					<span style="color: #fff;font-size: 15px;float: right;margin-right: 10px;"></span>
				</div>
			</div>
		</div>
    	<div style="height: 80%;overflow-y:auto;">
	    	<c:if test="${size==0 }">
	    		<div style="text-align: center;border-top: 1px solid #DADADA;">
		    		<span style="font-size:25px;color: red;margin-top: 15px;">
		    			暂时没有记录
		    		</span>
	    		</div>
	    	</c:if>
 			<c:forEach items="${arraylist }" var="p">
 				<div class="weui_cells weui_cells_access">
      				<a class="weui_cell" href="javascript:;">
          				<div class="weui_cell_bd weui_cell_primary" >
              				<p style="width: 85%;font-size:0.9em;">${p.xm}【${p.remark1 }】</p>
          				</div>
	          			<span style="font-size: 14px;color: #999999;">${p.remark2 }</span>
     				</a>
  				</div>
 			</c:forEach>
 		</div>
 	<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 80%;margin-left: 10%;">
	      	<a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_warn">关闭</a>
    	</div>
	</div>
	<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
</body>
<script type="text/javascript">
	 $(document).ready(function () {
		 $("a[name='closeBtn']").click(function () {
			 WeixinJSBridge.call('closeWindow');
		 });
	 });
</script>
</html>
