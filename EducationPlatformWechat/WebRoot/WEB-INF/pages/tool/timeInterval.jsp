<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="GBK">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/weui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/jquery-weui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/demos.css">
     <script src="${pageContext.request.contextPath}/resource/js/jquery.1.7.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/resource/js/mobiscroll_002.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/resource/js/mobiscroll_004.js" type="text/javascript"></script>
	<link href="${pageContext.request.contextPath}/resource/css/mobiscroll_002.css" rel="stylesheet" type="text/css">
	<link href="${pageContext.request.contextPath}/resource/css/mobiscroll.css" rel="stylesheet" type="text/css">
	<script src="${pageContext.request.contextPath}/resource/js/mobiscroll.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/resource/js/mobiscroll_003.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/resource/js/mobiscroll_005.js" type="text/javascript"></script>
	<link href="${pageContext.request.contextPath}/resource/css/mobiscroll_003.css" rel="stylesheet" type="text/css">
</head>
<body ontouchstart>
<form action="${pageContext.request.contextPath}/course/savetime" method="get" id="from1">

<div class="weui_tab">
	<input name="openId" type="hidden" value="${openId}">
  	<input name="course_id" type="hidden" value="${course_id}">
    <!-- 内容 -->
    <div class="weui_tab_bd">
        <!-- 标题 -->
        <header class='demos-header'>
            <h1 class="demos-title">设置上下课时间</h1>
        </header>

        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input value="" placeholder="输入上课时间" class="weui_input" readonly="readonly" name="begintime" id="begintime" type="text">
                </div>
            </div>
             <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">下课时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                    <input value="" placeholder="输入下课时间" class="weui_input" readonly="readonly" name="endtime" id="endtime" type="text">
                </div>
            </div>
        </div>

        <!--绑定-按钮-->
        <div class='demos-content-padded'>
            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">保存时间</a>
        </div>
    </div>

</div>


</form>

<!--js类库-->
<script src="${pageContext.request.contextPath}/resource/js/jquery-weui.js"></script>
<script src="${pageContext.request.contextPath}/resource/js/umgo-picker.js"></script>
<script>
    $(document).ready(function () {
    	var currYear = (new Date()).getFullYear();	
			var opt={};
			opt.date = {preset : 'date'};
			opt.datetime = {preset : 'datetime'};
			opt.time = {preset : 'time'};
			opt.default = {
				theme: 'android-ics light', //皮肤样式
		        display: 'modal', //显示方式 
		        mode: 'scroller', //日期选择模式
				dateFormat: 'yyyy-mm-dd',
				lang: 'zh',
				showNow: true,
				nowText: "今天",
		        startYear: currYear - 10, //开始年份
		        endYear: currYear + 10 //结束年份
			};

		  	var optDateTime = $.extend(opt['datetime'], opt['default']);
		  	var optTime = $.extend(opt['time'], opt['default']);
		    $("#begintime").mobiscroll(optDateTime).datetime(optDateTime);
		    $("#endtime").mobiscroll(optDateTime).datetime(optDateTime);
        /**
         * 点击绑定按钮
         */
        $("a[name='bindingBtn']").click(function () {
            //获取接种卡号
            var begin = $("#begintime").val();
            var end = $("#endtime").val();
            var begintime = begin+":00";
            var endtime = end+":00";
            var openId=$("input[name='openId'][type='hidden']").val();
            var course_id=$("input[name='course_id'][type='hidden']").val();
            if( begintime==undefined || begintime.trim()=='' || endtime==undefined || endtime.trim()=='' ){
                $.alert("上课或下课时间不能为空！","提示");
                return;
            }
            if(openId==undefined || openId.trim()==''){
            	 $.alert("请在微信公众号绑定","提示");
            	 return;
            }
            
            //ajax请求数据
            var url = "${pageContext.request.contextPath}/course/savetime";
            $.post(url,{openId:$("input[name='openId'][type='hidden']").val(),course_id:$("input[name='course_id'][type='hidden']").val(), begintime:begintime,endtime:endtime},function (data, status) {
                 if( status=="success" ){
                    var json = eval(data);
                    $.toast("保存成功,再次点击<生成二维码>");
                    setTimeout("WeixinJSBridge.call('closeWindow')",1000);
               	 }else{
                    $.toast("操作失败");
                }
            },"json");
            //end
        });
    });
</script>
</body>
</html>
