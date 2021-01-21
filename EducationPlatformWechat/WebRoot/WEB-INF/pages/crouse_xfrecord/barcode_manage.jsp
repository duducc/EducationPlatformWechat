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
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/mobiscroll_002.js" type="text/javascript"></script>
	<script src="js/mobiscroll_004.js" type="text/javascript"></script>
	<link href="css/mobiscroll_002.css" rel="stylesheet" type="text/css">
	<link href="css/mobiscroll.css" rel="stylesheet" type="text/css">
	<script src="js/mobiscroll.js" type="text/javascript"></script>
	<script src="js/mobiscroll_003.js" type="text/javascript"></script>
	<script src="js/mobiscroll_005.js" type="text/javascript"></script>
	<link href="css/mobiscroll_003.css" rel="stylesheet" type="text/css">
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="openId" name="openId" value="${openid }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<input type="hidden" id="deptId" name="deptId" value="${deptId }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">二维码生成管理</h1>
        </header>

        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label"><span style="color: red;">请选择课题：</span></label></div>
            </div>
            <div class="weui_cell" style="border-bottom: 1px solid #bebebe;">
                <div class="weui_cell_bd weui_cell_primary">
                	<select style="border:0px solid black;font-size: inherit;
                		width: 100%" name="course" id="course" onchange="xzjbkt();">
                		<c:forEach items="${list }" var="list">
                			<option value="${list.courseId }">${list.coursesTask }</option>
                		</c:forEach>
                	</select>
                </div>
            </div>
            <div style="border: 1px solid #bebebe; margin-top: 15px;width: 98%;margin-left: 1%;border-radius: 20px;" id="yhkzz">
	            <div class="weui_cell" id="yhkzz">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">举办地址：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="position" name="position" type="text" value="${placename }">
	                </div>
	            </div>
	            <div class="weui_cell" id="yhkzz">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">上课时间：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="begintime" name="begintime" type="text" value="${starttime }">
	                </div>
	            </div>
	            <div class="weui_cell" id="yhkzz" style="border: 0px;">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label" style="color: #bebebe;">下课时间：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input class="weui_input" id="endtime" name="endtime" type="text" value="${endtime }">
	                </div>
	            </div>
            </div>
    	</div>
    	<!------------------------- 按钮 ------------------------------>
        <div class='demos-content-padded'>
            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">生成二维码</a>
            <a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_primary">关闭</a>
        </div>
</div>
</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
    function cancelwxjb(){
   		WeixinJSBridge.call('closeWindow');											
 	}
 	function xzjbkt(){
		var courseId = $("#course").val();
		 $.ajax({
		 	url: 'xfProject.do?method=getBarcodeInfo&courseId='+courseId,
		  	cache: false,
		  	type:'post',
		  	dataType:'json',
		  	success: function(data){
		  		var courseEntity = data;
		  		var time = courseEntity.validTime;
		  		var startTime = time.substring(0,16);
		  		var endTime = time.substring(17);
		  		$("#position").val(courseEntity.placeName);
		  		$("#begintime").val(startTime);
		  		$("#endtime").val(endTime);
		     },
		}); 
	}
 	 $(document).ready(function () {
 		 var access_token ="";
        /**
         * 点击绑定按钮
         */
        $("a[name='closeBtn']").click(function () {
        	WeixinJSBridge.call('closeWindow');
        });
        $("a[name='bindingBtn']").click(function () {
        	/* $.ajax({
    		 	url: 'https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=wxe080d1a54a47db71&secret=abfbbc9c1d66884d60ee3913bf078726 ',
    		  	cache: false,
    		  	type:'GET',
    		  	dataType:'json',
    		  	success: function(data){
    		  		alert(data);
    		    },
    		});  */
 			var courseId = $("#course").val();
    		var begintime = $("#begintime").val();
    		var endtime = $("#endtime").val();
 			window.location.href = "xfProject.do?method=barcodeCreate&courseId="+courseId+"&begintime="+begintime+"&endtime="+endtime;
 			/* url=" https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token=";
			$.post(url,function (data, status) {
	              if( status=="success" ){
	                  var json = eval(data);
	                  switch (json.errorMsg) {
	                      case "success":		//成功
	                          $.toast("举办项目成功！");
	                          //setTimeout("WeixinJSBridge.call('closeWindow')",2000);
	                          break;
	                      case "failed":		//失败
	                          $.alert("举办项目失败！", "提示");
	                          break;
	                      case "error":		//服务器异常
	                          $.alert("服务器异常，稍后再试！", "警告！");
	                          break;
	                  }
	              }else{
	                  $.alert("操作失败！", "提示");
	              }
	          },"json"); */
        });
    });
</script>
</body>
</html>
