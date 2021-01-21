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
    <style type="text/css">
    	.weui_label{
    		font-size: 15px;
    	}
    	.weui_input{
    		font-size: 15px;
    	}
    </style>
</head>
<body ontouchstart>
<form method="get" id="from1">
<input type="hidden" id="courseId" name="courseId" value="${pentity.courseId }"/>
<input type="hidden" id="yitongCard" name="yitongCard" value="${pentity.yitongCard }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">报名信息</h1>
        </header>

        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">课题名称：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="task" name="task"  type="text" value="${pentity.coursesTask }" readonly="readonly">
                </div>
            </div>
   			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所属项目：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="proName" name="proName"  type="text" value="${pentity.proName}" readonly="readonly">
                </div>
            </div>
			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">项目学分：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="eduCredit" name="eduCredit"  type="text" value="${pentity.credit }" readonly="readonly">
                </div>
            </div>
        </div>
	        <div class='demos-content-padded'>
	            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">取消报名</a>
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
         * 点击绑定按钮
         */
        $("a[name='bindingBtn']").click(function () {
            //获取接种卡号
           	var courseId = $("#courseId").val();
           	var yitongCard = $("#yitongCard").val();
            //ajax请求数据
            var url = "xfCourseSignup.do?method=updateCourseSignuoCancel&courseId="+courseId+"&yitongCard="+yitongCard;
            $.post(url,function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
                        case "success":		//成功
                            $.toast("取消报名成功");
                            //document.getElementById("from1").submit();
                            //window.location.href="xfCourseSignup.do?method=toCourseSignUpCancelList&yitongCard="+yitongCard;
                            //WeixinJSBridge.call('closeWindow');
                            break;
                        case "failed":		//失败
                            $.alert("取消报名失败！", "提示");
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
