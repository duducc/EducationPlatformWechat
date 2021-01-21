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
<input type="hidden" id="openId" name="openId" value="${openId }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D;" >
					<img src="images/boolean/chuli.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 20px;"><b>课题详细信息</b></span><br>
				</div>
			</div>
			<div style="width: 30%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 30px;">
					<span style="color: #fff;font-size: 15px;float: right;margin-right: 10px;"></span>
				</div>
			</div>
		</div>

        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form" style="height: 86%;overflow-y:auto;">
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
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">授分状态：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${isgrant==0 }">
                    	<input class="weui_input" id="courseState" name="courseState"  type="text" value="未授分" readonly="readonly">
                	</c:if>
                	<c:if test="${isgrant==1 }">
                    	<input class="weui_input" id="courseState" name="courseState"  type="text" value="已授分" readonly="readonly">
                	</c:if>
                	<c:if test="${isgrant==2 }">
                    	<input class="weui_input" id="courseState" name="courseState"  type="text" value="授分失败" readonly="readonly">
                	</c:if>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课状态：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${awardstate==0 }">
                    	<input class="weui_input" id="courseState" name="courseState"  type="text" value="正常" readonly="readonly">
                	</c:if>
                	<c:if test="${awardstate==1 }">
                    	<input class="weui_input" id="courseState" name="courseState"  type="text" value="迟到" readonly="readonly">
                	</c:if>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">是否反馈：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${remarks3==0 }">
                    	<input class="weui_input" id="courseState" name="courseState"  type="text" value="未上报" readonly="readonly">
                	</c:if>
                	<c:if test="${remarks3==1 }">
                    	<input class="weui_input" id="courseState" name="courseState"  type="text" value="已上报" readonly="readonly">
                	</c:if>
                </div>
            </div>
        </div>
	  </div>
	  <!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
	      	<button name="bindingBtn" type="button" class="layui-btn" onclick="cancelbind();" style="width: 80%;">返回</button>
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
    function cancelbind(){
    	var openId = $("#openId").val();
 		var clientsxh = $("#clientsxh").val();
 		window.location.href="xfStudyRegistration.do?method=toMyTaskInfoPage&openid="+openId+"&clientsxh="+clientsxh;
    }
</script>
</body>
</html>
