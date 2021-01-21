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
            <div class="weui_cell" style="border-top: 1px solid #D9D9D9;">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课状态：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${awardstate==0 }">
                    	<input class="weui_input" id="courseState" name="courseState" style="color: green;"  type="text" value="正常" readonly="readonly">
                	</c:if>
                	<c:if test="${awardstate==1 }">
                    	<input class="weui_input" id="courseState" name="courseState" style="color: red;"  type="text" value="迟到" readonly="readonly">
                	</c:if>
                </div>
            </div>
            <div class="weui_cell" style="border-bottom: 1px solid #D9D9D9;">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">是否反馈：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${remarks3==0 }">
                    	<input class="weui_input" id="courseState" name="courseState" style="color: red;"  type="text" value="未反馈" readonly="readonly">
                	</c:if>
                	<c:if test="${remarks3==1 }">
                    	<input class="weui_input" id="courseState" name="courseState" style="color: green;"  type="text" value="已反馈" readonly="readonly">
                	</c:if>
                </div>
            </div>
            <div class="weui_cell" style="border-bottom: 1px solid #D9D9D9;">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">课程分数：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<c:if test="${fenshu==''||fenshu==null}">
                    	<input class="weui_input" id="fenshu" name="fenshu" style="color: red;"  type="text" value="未 打分" readonly="readonly">
                	</c:if>
                	<c:if test="${fenshu!=''&&fenshu!=null}">
                    	<input class="weui_input" id="fenshu" name="fenshu"  type="text" value="${fenshu }分" readonly="readonly">
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
