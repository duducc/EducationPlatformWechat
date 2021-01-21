<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>我的课程</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
     <link rel="stylesheet" href="css/layui.css" media="all">
    <link rel="stylesheet" href="css/example.css">  
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <style type="text/css">
    	.weui_label{
    		font-size: 15px;
    	}
    	.weui_input{
    		font-size: 15px;
    	}
    	.weui_tab{
			 position:absolute; z-index:1;
			 width: 100%;
		}
    </style>
</head>
<body>
<form method="get" id="from1">
<input type="hidden" id="openid" name="openid" value="${openid }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<input type="hidden" id="courseId" name="courseId" value="${entity.xh }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <div style="width: 100%;height: 80px;border-bottom: 1px solid #cccccc;background-color: #ffffff">
 			<div style="width: 20%;height: 80px;float: left;">
 				<img src="images/boolean/chuli.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
 			</div>
			<div style="width: 50%;height: 60px;float: left;">
				<div style="width: 100%;margin-top: 15px;">
					<span style="color: #1D2426;font-size: 18px;"><b>课题详细信息</b></span><br>
					<span style="color: #989C9C;font-size: 15px;">请确认信息无误后生成二维码</span>
				</div>
			</div>
			<div style="width: 30%;height: 60px;float: left;">
				<div style="width: 100%;margin-top: 30px;">
					<span style="color: #989C9C;font-size: 15px;float: right;margin-right: 10px;">${nowdate }</span>
				</div>
			</div>
 		</div>

        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form" style="height: 86%;overflow-y:auto;">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">课题名称：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="task" name="task"  type="text" value="${entity.coursename }" readonly="readonly">
                </div>
            </div>
			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">任课教师：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="eduCredit" name="eduCredit"  type="text" value="${entity.rkjshname }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">教师电话：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="eduCredit" name="eduCredit"  type="text" value="${entity.lxdh }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课日期：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="hours" name="hours"  type="text" value="${entity.skdate.substring(0,10) }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="hours" name="hours"  type="text" value="${entity.shtime }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课周次：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="hours" name="hours"  type="text" value="第${entity.shkzhci }周" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell" style="border-bottom: 1px solid #D9D9D9;">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课星期：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="hours" name="hours"  type="text" value="星期${entity.shkxqi }" readonly="readonly">
                </div>
            </div>
            <div style="width: 92%;margin-left: 4%;margin-top: 5px;margin-bottom: 5px;">
                <div style="width:100%;border:1px solid #ccc;height: 30px; "><label for="home-city" class="weui_label" style="line-height: 30px;">讲授内容</label></div>
                <div style="width:100%;border:1px solid #ccc;border-top:0px; height: 100px; ">
                	<textarea style="width: 96%;margin-left: 2%;border: 0px;font-size: 16px;">${entity.jshnr }</textarea>
                </div>
            </div>
        </div>
	  </div>
	  <!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
	      	<button name="bindingBtn" type="button" class="layui-btn" onclick="CreditQR();" style="width: 80%;">生成二维码</button>
    	</div>
    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
	      	<button name="closeBtn" type="button" class="layui-btn layui-btn-danger" onclick="close_windos();" style="width: 80%;">关闭</button>
    	</div>
	</div>
	<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
</div>


</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	function close_windos(){
		WeixinJSBridge.call('closeWindow');
	}
	/*--------------------------------------生成二维码------------------------------------  */
 	function CreditQR(){
 		var courseId = $("#courseId").val();
 		var clientsxh = $("#clientsxh").val();
 		window.location.href="xfProject.do?method=CreditQR&courseId="+courseId+"&clientsxh="+clientsxh+"&type=2";
 	}
</script>
</body>
</html>
