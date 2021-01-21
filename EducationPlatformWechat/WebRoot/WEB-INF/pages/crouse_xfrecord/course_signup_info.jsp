<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
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
<input type="hidden" id="openId" name="openId" value="${openId }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<input type="hidden" id="courseId" name="courseId" value="${pentity.courseId }"/>
<div class="weui_tab">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">课题详细信息</h1>
        </header>

        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">课题名称：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="coursesTask" name="coursesTask"  type="text" value="${pentity.coursesTask }" readonly="readonly">
                </div>
            </div>
   			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">所属项目：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="proName" name="proName"  type="text" value="${pentity.proName }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">课题内容：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <textarea id="coursesTask" name="coursesTask" class="form-control" rows="3" readonly="readonly" >${pentity.coursesContent }</textarea>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">项目举办地址：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <textarea id="holdLocation" name="holdLocation" class="form-control" rows="3" readonly="readonly" >${pentity.placeName }</textarea>
                </div>
            </div>
   			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">举办单位：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="holdUnit" name="holdUnit"  type="text" value="${deptName}" readonly="readonly">
                </div>
            </div>
   			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">项目开始时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="holdStartDate" name="holdStartDate"  type="text" value="${pentity.startDate.substring(0,19)}" readonly="readonly">
                </div>
            </div>
   			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">项目结束时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="holdEndDate" name="holdEndDate"  type="text" value="${pentity.endDate.substring(0,19) }" readonly="readonly">
                </div>
            </div>
			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">项目学分：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="eduCredit" name="eduCredit"  type="text" value="${pentity.credit }（分）" readonly="readonly">
                </div>
            </div>
   			<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">培训人数：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="eduObjCount" name="eduObjCount"  type="text" value="${pentity.eduObjCount }" readonly="readonly">
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">剩余人数：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input class="weui_input" id="syeduObjCount" name="syeduObjCount"  type="text" value="${wsign }" readonly="readonly">
                </div>
            </div>
        </div>
		
		
        <div class='demos-content-padded'>
            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">确认报名</a>
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
            
           	var openId = $("#openId").val();
           	//alert("openId:"+openId);
	    	var clientsxh = $("#clientsxh").val();
	    	var courseId = $("#courseId").val();
	    	
	    	var syeduObjCount = $("#syeduObjCount").val();
	    	if(syeduObjCount<=0){
	    		$.alert("报名人数已满，请选择其他课题！", "提示");
	    		return false;
	    	}
            //ajax请求数据
            var url = "xfCourseSignup.do?method=saveCourseSignuoInfo";
            $.post(url,{openId:openId,clientsxh:clientsxh,courseId:courseId,},
            function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    var jsonresult = json.errorMsg;
                    if(jsonresult == "yijieshu"){
                    	 $.alert("报名已结束！", "提示");
                    }else if(jsonresult == "success"){
                    	$.toast("报名成功");
                        //document.getElementById("from1").submit();
                        //setTimeout("WeixinJSBridge.call('closeWindow')",2000);
                        //window.location.href="xfCourseSignup.do?method=toCourseSignUpList&openId="+openId+"&clientsxh="+clientsxh;
                        //WeixinJSBridge.call('closeWindow');
                    }else if(jsonresult == "failed"){
                    	 $.alert("报名失败！", "提示");
                    }else if(jsonresult == "repetition"){
                    	$.alert("不可重复报名！","提示");
                	}else if(jsonresult == "error"){
                		 $.alert("服务器异常，稍后再试！", "警告！");
                	}else{
                		$.alert(jsonresult, "警告！");
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
