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
<input type="hidden" id="courseId" name="courseId" value="${entity.courseId }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header' style="background-color:#65B39D;">
            <h1 class="demos-title" style="color: #fff;"><b>课题信息</b></h1>
        </header>

        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">课题名称：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="task" name="task"  type="text" value="${entity.courseName }" readonly="readonly">
                </div>
            </div>
   			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所属项目：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="proName" name="proName"  type="text" value="${entity.proName}" readonly="readonly">
                </div>
            </div>
			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">课程学分：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="eduCredit" name="eduCredit"  type="text" value="${entity.credit }分" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">学时：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="hours" name="hours"  type="text" value="${entity.hours }小时" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">举办时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="hours" name="hours"  type="text" value="${entity.startDate.substring(0,10) }" readonly="readonly">
                </div>
            </div>
           	<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">举办地点：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input class="weui_input" id="placeName" name="placeName"  type="text" value="${entity.placeName }" readonly="readonly">
                </div>
           	</div>
           	<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input class="weui_input" id="validTime" name="validTime"  type="text" value="${entity.startDate.substring(0,19)}" readonly="readonly">
                </div>
           	</div>
        </div>
	 </div>
</div>
<!-- 
	<div class='demos-content-padded'>
	        	<c:if test="${entity.isbegin==0 }">
		        	<a name="YholdBtn" href="javascript:;" onclick="holdTask(1);" class="weui_btn weui_btn_primary">确认举办</a>
	        	</c:if>
	        	<c:if test="${entity.isbegin==1 }">
		        	<a name="NholdBtn" href="javascript:;" onclick="holdTask(0);" class="weui_btn weui_btn_primary" style="background-color: red;">取消举办</a>
	        	</c:if>
	            <a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_primary">关闭</a>
	        </div>
 -->
<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
	      	<c:if test="${entity.isbegin==0 }">
	        	<a name="YholdBtn" href="javascript:;" onclick="holdTask(1);" class="weui_btn weui_btn_primary" style="width: 80%;">确认举办</a>
        	</c:if>
        	<c:if test="${entity.isbegin==1 }">
	        	<a name="NholdBtn" href="javascript:;" onclick="holdTask(0);" class="weui_btn weui_btn_primary" style="background-color: red;width: 80%;">取消举办</a>
        	</c:if>
    	</div>
    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
	      	<a name="closeBtn" href="javascript:;" class="weui_btn weui_btn_primary" style="width: 80%;">关闭</a>
    	</div>
	</div>
	<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->

</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
    $(document).ready(function () {
        $("a[name='closeBtn']").click(function () {
           WeixinJSBridge.call('closeWindow');
        });
    });
    function holdTask(value){
    	var courseId = $("#courseId").val();
    	var url = 'xfCourse.do?method=courseTaskHoldingManager';
        $.post(url,{courseId:courseId,isbegin:value},function (data, status) {
            if( status=="success" ){
                var json = eval(data);
                switch (json.errorMsg) {
                    case "success":		//成功
                    	$.toast("操作成功！");
                    	window.location.href="xfCourse.do?method=toholdTaskPage&courseId="+courseId;
                        break;
                    case "failed":		//失败
                    	$.alert("操作失败！", "提示");
                        break;
                    case "error":		//服务器异常
                        $.alert("服务器异常，稍后再试！", "提示");
                        break;
                }
            }else{
                $.alert("操作失败！", "提示");
            }
      },"json");
    }
</script>
</body>
</html>
