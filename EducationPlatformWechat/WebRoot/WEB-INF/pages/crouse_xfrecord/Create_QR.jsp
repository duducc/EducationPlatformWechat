<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>二维码生成页面</title>
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
	<link rel="stylesheet" type="text/css" href="css/loading.css"/>
	<script src="js/mobiscroll.js" type="text/javascript"></script>
	<script src="js/mobiscroll_003.js" type="text/javascript"></script>
	<script src="js/mobiscroll_005.js" type="text/javascript"></script>
	<link href="css/mobiscroll_003.css" rel="stylesheet" type="text/css">
    <style type="text/css">
    	.fileInputContainer{
			height:80px;
			width:80px;
			background-image:url(images/service/cx1.jpg);
			background-size:60px 60px;
			background-repeat:no-repeat;
			position:relative;
		}
		.fileInput{
			height:80px;
			width:80px;
			position:absolute;
			right:0;
			top:0;
			opacity: 0;
			filter:alpha(opacity=0);
			cursor:pointer;
		}
		.divimg{
			float:left;
			width:28%;
			height:60px;
		}
		.divimgborder{
			float:left;
			width:28%;
			height:80px;
			margin-left:10px;
		}
		img{
			max-width:100%;
			max-height:100%;
			width:80px; 
			height:80px;
			display:block;
		}
		.xinxzs{
	   		margin-left: 5px;
	   		margin-right:5px;
	   		height:160px;
	   		border-radius: 20px;
	   		border:1px solid #D1D1D1;
	   	}
		.weui_tab{
			 position:absolute; z-index:1;
		}
	</style>
</head>
<body>
<!-- -----------------------------------------等待页面--------------------------------------------- -->
<div id="up_div" class="up_div">
	<div style="width: 100%;" id="bet_ondiv"></div>
	<div class="bet_div" id="bet_div">
		<div style="width: 100%;height: 10px;"></div>
		<div style="height: 70px;width: 60%;margin-left:20%;">
			<img src="images/loadingwx.gif" style="width: 100%;">
		</div>
		<div style="width: 100%;height: 5px;"></div>
		<div style="width: 100%;text-align: center;">
			<span style="font-size: 13px;">请稍后</span>
		</div>
	</div>
</div>
<!-- ---------------------------------------------------------------------------------------------- -->
<form method="get" id="from1">
<input type="hidden" id="usernumber" name="usernumber" value="${usernumber }"/>
<input type="hidden" id="deptId" name="deptId" value="${deptId }"/>
<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
<div class="weui_tab" style="width: 100%;">
    <!-- 内容 -->
    <div class="weui_tab_bd" id="map" style="display: none;">
    	<iframe id="mapPage" width="100%"  frameborder=0 
		    src="http://apis.map.qq.com/tools/locpicker?search=1&type=1&key=OB4BZ-D4W3U-B7VVO-4PJWW-6TKDJ-WPB77&referer=myapp">
		</iframe> 
    </div>
    <div class="weui_tab_bd" id="count" style="width: 100%;">
        <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D;" >
					<img src="images/boolean/E-Mail.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 50%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 30px;">
					<span style="color: #fff;font-size: 20px;"><b>二维码管理</b></span><br>
				</div>
			</div>
		</div>
		<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
   			<div style="width: 100%;; height: 50px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; ">
   				<span style="color: red;font-size: 14px;margin-left: 15px;">1.如果需修改课题信息，则点击【立即提交】按钮！</span><br>
   				<span style="color: red;font-size: 14px;margin-left: 15px;">2.无需修改则直接点击【生成二维码】按钮！</span>
   			</div>
    	</div>
        <!-- 内容展现 -->
        <div class="weui_cells weui_cells_form">
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">请选择课题：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<select style="border:0px solid black;font-size: inherit;
                		width: 100%" name="courseId" id="courseId" onchange="xzjbkt();">
                		<option value="00">请选择要举办的课题</option>
                		<c:forEach items="${courselist }" var="courselist" varStatus="status">
                			<option value="${courselist.courseId }">${courselist.coursesTask }</option>
                		</c:forEach>
                	</select>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">地理位置：</label></div>
               	<div class="fileInputContainer divimg">
				    <input class="fileInput" type="button" name="getLocationop" id="getLocationop" onclick="getLocation();">
               		<input type="hidden" name="jd" id="jd" value="${jd }" readonly="readonly" >
               		<input type="hidden" name="wd" id="wd" value="${wd }" readonly="readonly" >
			    </div>
			</div>
			<div class="weui_cell">
			    <div class="form-group" style="width: 100%">
	      			<input class="weui_input" id="location" name="location"  type="text" value="" placeholder="请点击获取地理位置" readonly="readonly">
	   			</div>
	   		</div>
	   		<div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">上课时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                	<input value="" placeholder="点击选择上课时间" class="weui_input" readonly="readonly" name="begintime" id="begintime" type="text" onchange="changeStart(this.value);">
                	<input type="hidden" id="holdStartDate"/>
                </div>
            </div>
            <div class="weui_cell">
                <div class="weui_cell_hd"><label for="home-city" class="weui_label">下课时间：</label></div>
                <div class="weui_cell_bd weui_cell_primary">
                     <input value="" placeholder="点击选择下课时间" class="weui_input" readonly="readonly" name="endtime" id="endtime" type="text"  onchange="changeEnd(this.value);">
                	 <input type="hidden" id="holdEndDate"/>
                </div>
            </div>
            <div class="weui_cell" id="yhkzzw" style="border: 1px solid #999999;width: 96%;margin-left: 2%;border-radius:10px;display:none;">
                <span style="margin-left: 10px;color: red;">请选择位置和时间保存课题。</span><br>
            </div>
    	</div>
        <!-- <div align="center" style="clear:both;padding-top:10px;">
		     <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="savewxjb()" >立即提交</button>
		     <button type="button" style="width:40%;" class="btn btn-primary disabled" onclick="CreditQR()" >生成二维码</button>
	   </div> -->
	</div>
	<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
	    <div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
	      	<button type="button" style="width:80%;" class="btn btn-primary disabled" onclick="savewxjb()">
	      		立即提交
	      	</button>
    	</div>
    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
	      	<button type="button" style="width:80%;" class="btn btn-primary disabled" onclick="CreditQR()" >生成二维码</button>
    	</div>
	</div>
	<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
</div>
</form>

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	var height = document.documentElement.clientHeight;
	$(function(){
		document.getElementById("mapPage").height=height;
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
		        startYear: currYear, //开始年份
		        endYear: currYear + 10 //结束年份
			};
		  	var optDateTime = $.extend(opt['datetime'], opt['default']);
		  	var optTime = $.extend(opt['time'], opt['default']);
		    $("#begintime").mobiscroll(optDateTime).datetime(optDateTime);
		    $("#endtime").mobiscroll(optDateTime).datetime(optDateTime);
	});
    function xzjbkt(){
    	document.getElementById('up_div').style.display='block';
    	var courseId = $("#courseId").val();
    	if(courseId=='00'){
    		document.getElementById('up_div').style.display='none';
    	}else{
	    	$.ajax({
				url:'xfCourse.do?method=getCourseLocTimInfo&courseId='+courseId,
				cache:false,
				async: true,  
				type:'post',
				dataType:'json',
				success:function(data){
					var entity = data;
			  		if(entity.placeName!=""&&entity.placeName!=null&&entity.startDate!=""&&entity.startDate!=null&&entity.endDate!=""&&entity.endDate!=null){
			  			var position = entity.position;
			  			var jd = position.split("/")[0];
			  			var wd = position.split("/")[1];
			  			$("#jd").val(jd);
			  			$("#wd").val(wd);
			  			$("#location").val(entity.placeName);
			  			$("#begintime").val(entity.startDate.substring(0,19));
			  			$("#endtime").val(entity.endDate.substring(0,19));
			  			$("#holdStartDate").val(entity.remark1.substring(0,19));
			  			$("#holdEndDate").val(entity.remark2.substring(0,19));
			  			document.getElementById('up_div').style.display='none';
			  		}else{
			  			document.getElementById("yhkzzw").style.display = "block";
			  		}
				}
			});
    		
    	}
    }
    function cancelwxjb(){
   		WeixinJSBridge.call('closeWindow');											
 	}
 	function getLocation(){
 		document.getElementById("map").style.display = "block";
 		document.getElementById("count").style.display = "none";
	}
 	window.addEventListener('message', function(event) {
	    // 接收位置信息，用户选择确认位置点后选点组件会触发该事件，回传用户的位置信息
	    var loc = event.data;
	    if (loc && loc.module == 'locationPicker') {console.log('location', loc)}       
	    var jd = loc.latlng.lat;
	    var wd = loc.latlng.lng;
	    var local = loc.poiaddress 
	    $("#jd").val(jd);
	    $("#wd").val(wd);
	    $("#location").val(local);
	    document.getElementById("map").style.display = "none";
 		document.getElementById("count").style.display = "block";			
	}, false); 
	
 	function savewxjb(){
 		var courseName=$("#course option:checked").text();
 		var usernumber = $("#usernumber").val();
 		var deptId = $("#deptId").val();
 		var courseId = $("#courseId").val();
 		if(courseId=='00'){
 			$.alert("请选择想要修改的课题！","提示信息");
 			return;
 		}
		var location = $("#location").val();
 		var begintime = $("#begintime").val();
 		var endtime = $("#endtime").val();
 		var jd = $("#jd").val();
 		var wd = $("#wd").val();
 		if(location==null||location.trim()==''){
 			$.alert("请获取上课位置","提示信息");
 			return;
 		}
 		if( begintime==null || begintime==''){
                $.alert("上课时间不能为空！","提示");
                return;
        }
 		if( endtime==null || endtime==''){
            $.alert("下课时间不能为空！","提示");
            return;
    	}
 		var courseInfos = {};
 		courseInfos['deptId'] = deptId;
 		courseInfos['courseId'] = courseId;
 		courseInfos['placeName'] = location;
 		courseInfos['position'] = jd+"/"+wd;
 		courseInfos['startDate'] = begintime;
 		courseInfos['endDate'] = endtime;
 		var courseInfo = JSON.stringify(courseInfos);
	 	url = "xfCourse.do?method=saveHoldcourseTask";
	 	$.post(url,{courseInfo:encodeURI(courseInfo),usernumber:usernumber},function (data, status) {
            if( status=="success" ){
                var json = eval(data);
                switch (json.errorMsg) {
                    case "success":		//成功
                        $.toast("课题信息修改成功！");
                        break;
                    case "failed":		//失败
                        $.alert("课题信息修改失败！", "提示");
                        break;
                    case "error":		//服务器异常
                        $.alert("服务器异常，稍后再试！", "警告！");
                        break;
                }
            }else{
                $.alert("操作失败！", "提示");
            }
        },"json");
 	}
 	
 	function changeStart(value){
 		var time = value.substring(0,10);
		var holdStartDate = $("#holdStartDate").val();
		var holdEndDate = $("#holdEndDate").val();
		//alert("time="+time+"holdStartDate="+holdStartDate+"holdEndDate="+holdEndDate);
		if(time!=holdStartDate.substring(0,10)){
			if(time<holdStartDate||time>holdEndDate){
				$.alert("项目起止日期："+holdStartDate.substring(0,10)+"至 "+holdEndDate.substring(0,10)+"！！请在该时间段内填写！","提示");
				$("#begintime").val('');
			}
		}
 	}
 	function changeEnd(value){
 		var startDate = $("#begintime").val();
		var holdStartDate = $("#holdStartDate").val();
		var holdEndDate = $("#holdEndDate").val();
		var time = value;
		if(time<startDate){
			$.alert("结束日期不能大于开始日期！","提示");
			$("#endtime").val('');
			return;
		}
		holdEndDate = holdEndDate.substring(0,10)+" 23:59:59";
		if(time>holdEndDate){
			$.alert("项目起止日期："+holdStartDate.substring(0,10)+"至 "+holdEndDate.substring(0,10)+"！！请在该时间段内填写！","提示");
			$("#endtime").val('');
			return;
		}
 	}
 	
 	/*--------------------------------------生成二维码------------------------------------  */
 	function CreditQR(){
 		var courseId = $("#courseId").val();
 		var clientsxh = $("#clientsxh").val();
 		if(courseId=='00'){
			$.alert("请选择课题！","提示");
			return;
		}
		//微信公众号接口生成二维码
 		window.location.href="xfProject.do?method=CreditQR&courseId="+courseId+"&clientsxh="+clientsxh+"&type=1";
 		//微信企业号，自己生成二维码
 		/* window.location.href="xfProject.do?method=creatQRCode&courseId="+courseId+"&clientsxh="+clientsxh; */
 	}
</script>
</body>
</html>
