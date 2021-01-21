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
    <script src="js/jquery.1.7.2.min.js"></script>
    <style type="text/css">
    	.t1{
    		border:1px solid #8E8E8E;
    		width: 20px;
    		height: 20px;
    	}
    	.t2{
    		border:1px solid #8E8E8E;
    		height: 20px;
    		width: 58px;
    	}
    	.t3{
    		border:1px solid #8E8E8E;
    		height: 20px;
    		width: 75px;
    	}
    	.t4{
    		border:1px solid #8E8E8E;
    		height: 20px;
    		width: 55px;
    	}
    	.xinxzs{
    		margin-left: 15px;
    		margin-right:15px;
    		height:160px;
    		border-radius: 20px;
    		margin-top: 20px;
    		border:1px solid #D1D1D1;
    	}
    </style>
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="openId" name="openId" value="${openId }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<input type="hidden" id="yitongcode" name="yitongcode" value="${entity.yitongcode }">
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">进度查看</h1>
        </header>
        <c:if test="${entity.bltype==2 }">
			<span style="margin-left: 15px;color: #8E8E8E;">医通号：${entity.yitongcode }</span>
		</c:if>
		<span style="margin-left: 15px;color: #8E8E8E;">姓名：${entity.userxm }</span>
		<c:if test="${entity.bltype==3 }">
			<span style="margin-left: 10px;color: #8E8E8E;">身份证：${entity.sfzhm }</span><br>
		</c:if>
		<%-- <span style="margin-left: 15px;color: #3cc51f;">申请时间：${entity.gxsj }</span> --%>
        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form" style="margin-top: 20px;height: 300px;">
        	<div style="border: 1px red;font-size: 15px;margin-top: 20px;">
        		<c:if test="${entity.state==1 }">
					<img src="images/service/kuang_1.png" style="margin-left: 10px;width: 60px;height: 40px">
				</c:if>
				<c:if test="${entity.state!=1 }">
					<span style="color: #D1D1D1;font-size: 15px;margin-left: 15px;">已申请</span>
				</c:if>
				<c:if test="${entity.state==2 }">
					<img src="images/service/kuang_2.png" style="margin-left: 0px;width: 80px;height: 40px">
				</c:if>
				<c:if test="${entity.state!=2 }">
					<span style="color: #D1D1D1;margin-left: 18px;">已缴费</span>
				</c:if>
				<c:if test="${entity.state==3 }">
					<img src="images/service/kuang_3.png" style="margin-left: 10px;width: 80px;height: 40px">
				</c:if>
				<c:if test="${entity.state!=3 }">
					<span style="color: #D1D1D1;margin-left: 20px;">制卡中</span>
				</c:if>
				<c:if test="${entity.state==4 }">
					<img src="images/service/kuang_4.png" style="margin-left: 15px;width: 80px;height: 40px">
				</c:if>
				<c:if test="${entity.state!=4 }">
					<span style="color: #D1D1D1;margin-left: 20px;">待邮递</span>
				</c:if>
				<c:if test="${entity.state==5 }">
					<img src="images/service/kuang_5.png" style="margin-left: 10px;width: 60px;height: 40px;">
				</c:if>
				<c:if test="${entity.state!=5 }">
					<span style="color: #D1D1D1;margin-left: 15px;">已邮递</span>
				</c:if>
        	</div>
        	<div style="margin-top: 0px;">
        		<c:if test="${entity.state==1 }">
        			<img src="images/service/quan1.png" style="margin-left: 13px;">
        		</c:if>
        		<c:if test="${entity.state!=1 }">
		            <img src="images/service/quan2.png" style="margin-left: 13px;">
        		</c:if>
	            <img src="images/service/xian.png" style="width:50px;margin-bottom: 10px;">
	            <c:if test="${entity.state==2 }">
        			<img src="images/service/quan1.png">
        		</c:if>
        		<c:if test="${entity.state!=2 }">
		            <img src="images/service/quan2.png">
        		</c:if>
	            <img src="images/service/xian.png" style="width:50px;margin-bottom: 10px;">
	            <c:if test="${entity.state==3 }">
        			<img src="images/service/quan1.png">
        		</c:if>
        		<c:if test="${entity.state!=3 }">
		            <img src="images/service/quan2.png">
        		</c:if>
	            <img src="images/service/xian.png" style="width:50px;margin-bottom: 10px;">
	            <c:if test="${entity.state==4 }">
        			<img src="images/service/quan1.png">
        		</c:if>
        		<c:if test="${entity.state!=4 }">
		            <img src="images/service/quan2.png">
        		</c:if>
	            <img src="images/service/xian.png" style="width:50px;margin-bottom: 10px;">
	            <c:if test="${entity.state==5 }">
        			<img src="images/service/quan1.png">
        		</c:if>
        		<c:if test="${entity.state!=5 }">
		            <img src="images/service/quan2.png">
        		</c:if>
	        </div>
	        <c:if test="${entity.state==1 }">
		        <div class="xinxzs">
		        	<br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">申请人：${entity.userxm }</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">身份证号：${entity.sfzhm }</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">所在医院：${yiyuanname }</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">申请时间：${entity.gxsj.substring(0,19) }</span>
		        </div>
	        </c:if>
	        <c:if test="${entity.state==2 }">
		        <div class="xinxzs">
		        	<br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">缴费金额：</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">缴费时间：</span><br>
		        </div>
	        </c:if>
	        <c:if test="${entity.state==3 }">
		        <div class="xinxzs">
		        	<br>
		        	<span style="margin-left: 10px;color: #1FB748;">您的卡正在努力制作中，请耐心等待。</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">制卡人员：${entity.zkryxm }</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">联系方式：${entity.zkrlxfs }</span><br>
		        </div>
	        </c:if>
	        <c:if test="${entity.state==4 }">
		        <div class="xinxzs">
		        	<br>
		        	<span style="margin-left: 10px;color: #1FB748;">正在准备为您邮递中，请耐心等待。</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">邮递人员：兰州盛腾科技有限公司</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">联系方式：0931-8446001</span><br>
		        </div>
	        </c:if>
	        <c:if test="${entity.state==5 }">
		        <div class="xinxzs">
		        	<br>
		        	<span style="margin-left: 10px;color: #1FB748;">您的卡正在快递途中，可根据快递单号进行查询。</span><br>
		        	<span style="margin-left: 10px;color: #8E8E8E;">快递公司名称：${entity.kdgsmc }</span><br>
			       	<span style="margin-left: 10px;color: #8E8E8E;">快递单号：${entity.kddh }</span><br>
		        </div>
	        </c:if>
        </div>
		
        <div class="demos-content-padded" style="margin-top: 0px;" >
            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">返回</a>
        </div>
    </div>
</div>


</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
    $(document).ready(function () {
        /**
         * 返回
         */
        $("a[name='bindingBtn']").click(function () {
        	var clientsxh = $("#clientsxh").val();
			var openId = $("#openId").val();
			window.location.href="applyInfo.do?method=toInfo_MakeCardplan&clientsxh="+clientsxh+"&openid="+openId;										
        });
            //WeixinJSBridge.call('closeWindow');
    });
</script>
</body>
</html>
