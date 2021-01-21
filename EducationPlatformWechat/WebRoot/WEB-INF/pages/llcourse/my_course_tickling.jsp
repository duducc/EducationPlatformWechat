<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<jsp:directive.page import="com.saint.constant.Constant"/>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>学员课题反馈</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jweixin-1.0.0.js"></script>
    <script src="layui/layui.all.js" charset="utf-8"></script>
    <style type="text/css">
		.weui_tab{
			 position:absolute; z-index:1;
		}
 		.in_but{
			width: 100%;
		}
		.weui_label{
			width: 100%;
			border:1px solid #ccc;
			padding:5px;
		}
		.weui_cell{
			padding:0 0;
		}
		.layui-form-pane .layui-form-radio, .layui-form-pane .layui-form-switch{
			margin-bottom: 0px;
			margin-top: 0px;
		}
		.layui-form-radio{
			margin: 0 0 0 0;
		}
		.weui_cell_hd{
			width: 100%;
		}
		.layui-form-checkbox i{
			height: 30px;
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
<form class="layui-form layui-form-pane" action=""  id="baseform" method="post">
	<input type="hidden" id="usernumber" name="usernumber" value="${usernumber }"/>
	<input type="hidden" id="courseId" name="courseId" value="${entity.xh }"/>
	<input type="hidden" id="username" name="username" value="${username }"/>
	<input type="hidden" id="coursename" name="coursename" value="${entity.coursename }"/>
	<input type="hidden" id="xh" name="xh" value="${xh }"/>
	
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
	        <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
  				<div style="width: 25%;height: 80px;float: left;">
  					<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D;" >
  						<img src="images/boolean/xgmm.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
  					</button>
  				</div>
  				<div style="width: 45%;height: 80px;float: left;">
  					<div style="width: 100%;margin-top: 20px;">
	  					<span style="color: #fff;font-size: 18px;"><b>学生课题反馈</b></span><br>
	  					<span style="color: #fff;font-size: 15px;">举办时间：${entity.skdate.substring(0,10)}</span>
  					</div>
  				</div>
  				<div style="width: 30%;height: 80px;float: left;">
  					<div style="width: 100%;margin-top: 30px;">
	  					<span style="color: #fff;font-size: 15px;float: right;margin-right: 10px;">2018-09-28</span>
  					</div>
  				</div>
  			</div>
        	<!-- 内容展现 -->
       		<div style="width: 100%;border: 1px solid #cccccc;background-color:#DCDDC0;padding:5px; ">
  				<span style="color: red;font-size: 15px;">
  					项目名称:${entity.coursename}
  				</span><br>
 			</div>
       		<div style="overflow-y:auto;height: 84%;margin-bottom: 5px;">
	        	<div class="weui_cell">
	                <div class="weui_cell_hd">
		                <label for="home-city" class="weui_label">
		                	1、课前准备充分，备课认真，遵守教学
		                </label>
		                <label for="home-city" class="weui_label" style="margin-top: -5px;border-top: 0px;">
		                	<input type="radio" name="subjectone" value="A" checked="checked"/>A.是&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectone" value="B"/>B.基本是&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectone" value="C"/>C.否
		                </label>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd">
		                <label for="home-city" class="weui_label">
		                	2、您对本项目基本内容以前了解情况为：
		                </label>
		                <label for="home-city" class="weui_label" style="margin-top: -5px;border-top: 0px;">
		                	<input type="radio" name="subjecttwo" value="A" checked="checked"/>A.全知道&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjecttwo" value="B"/>B.部分知道&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjecttwo" value="C"/>C.不知道
		                </label>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd">
		                <label for="home-city" class="weui_label">
		                	3、您通过本项目学习认为收获：
		                </label>
		                <label for="home-city" class="weui_label" style="margin-top: -5px;border-top: 0px;">
		                	<input type="radio" name="subjectthree" value="A" checked="checked"/>A.很大&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectthree" value="B"/>B.较大&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectthree" value="C"/>C.一般
		                </label>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd">
		                <label for="home-city" class="weui_label">
		                	4、您对授课教师讲授内容满意度：
		                </label>
		                <label for="home-city" class="weui_label" style="margin-top: -5px;border-top: 0px;">
		                	<input type="radio" name="subjectfour" value="A" checked="checked"/>A.很满意&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectfour" value="B"/>B.满意&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectfour" value="C"/>C.一般
		                </label>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd">
		                <label for="home-city" class="weui_label">
		                	5、您对本项目的教学计划安排感到：
		                </label>
		                <label for="home-city" class="weui_label" style="margin-top: -5px;border-top: 0px;">
		                	<input type="radio" name="subjectfive" value="A" checked="checked"/>A.很满意&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectfive" value="B"/>B.满意&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectfive" value="C"/>C.一般
		                </label>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd">
		                <label for="home-city" class="weui_label">
		                	6、您对本项目的教材的满意度：
		                </label>
		                <label for="home-city" class="weui_label" style="margin-top: -5px;border-top: 0px;">
		                	<input type="radio" name="subjectsix" value="A" checked="checked"/>A.很满意&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectsix" value="B"/>B.满意&nbsp;&nbsp;&nbsp;
		                	<input type="radio" name="subjectsix" value="C"/>C.一般
		                </label>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd">
		                <label for="home-city" class="weui_label">
		                	7、您通过本项目学习，感到收获最大的是（最多选2项）：
		                </label>
		                <label for="home-city" class="weui_label" style="margin-top: -5px;border-top: 0px;">
		                	<!-- <input type="checkbox" name="subjectseven" value="A"/>A.开阔思路&nbsp;&nbsp;&nbsp;
		                	<input type="checkbox" name="subjectseven" value="B"/>B.提高临床诊治能力<br>
		                	<input type="checkbox" name="subjectseven" value="C"/>C.提高理论水平&nbsp;&nbsp;&nbsp;
		                	<input type="checkbox" name="subjectseven" value="D"/>D.提高科研工作能力<br>
		                	<input type="checkbox" name="subjectseven" value="E"/>E.提高操作能力 -->
						      <input type="checkbox" name="subjectseven" value="A" title="A.开阔思路">
						      <input type="checkbox" name="subjectseven" value="B" title="B.提高临床诊治能力">
						      <input type="checkbox" name="subjectseven" value="C" title="C.提高理论水平">
						      <input type="checkbox" name="subjectseven" value="D" title="D.提高科研工作能力">
						      <input type="checkbox" name="subjectseven" value="E" title="E.提高操作能力">
		                </label>
	                </div>
	            </div>
			</div>
			<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
			<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
			    <div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
			      	<button type="button" onclick="submitInfo();" class="layui-btn"><i class="layui-icon">&#x1005;</i>立即提交</button>
		    	</div>
		    	<div class="layui-form-item" style="text-align: center;margin-top: 4px;float: left;width: 50%;">
			      	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
		    	</div>
			</div>
			<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
    	</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	function close_windos(){WeixinJSBridge.call('closeWindow')}
	layui.use(['form','laydate'], function(){
		  var form = layui.form;
		  form.render();
	});
		
	function submitInfo(){
		var xh = $("#xh").val();
    	var usernumber = $("#usernumber").val();
    	var courseid = $("#courseId").val();
    	var username = $("#username").val();
    	var proid = $("#proid").val();
    	var proname = $("#proname").val();
    	var coursename = $("#coursename").val();
		
    	var subjectone = $("input[name='subjectone']:checked").val();
    	var subjecttwo = $("input[name='subjecttwo']:checked").val();
    	var subjectthree = $("input[name='subjectthree']:checked").val();
    	var subjectfour = $("input[name='subjectfour']:checked").val();
    	var subjectfive = $("input[name='subjectfive']:checked").val();
    	var subjectsix = $("input[name='subjectsix']:checked").val();
    	var subjectseven = "";
    	if($('input[type=checkbox]:checked').length>2){
    		$.alert("多选题最多只可选两项！", "提示");
    		return false;
    	}
    	if($('input[type=checkbox]:checked').length==0){
    		$.alert("请选择您的收获！", "提示");
        	return false;
    	}
    	$.each($('input:checkbox'),function(){
            if(this.checked){
                subjectseven = subjectseven+$(this).val()+",";
            }
        });
    	subjectseven = subjectseven.substr(0,subjectseven.length-1);
    	
    	var ticklinginfos = {};
    	ticklinginfos['usernumber']=usernumber;
    	ticklinginfos['courseid']=courseid;
    	ticklinginfos['username']=username;
    	ticklinginfos['proid']=proid;
    	ticklinginfos['proname']=proname;
    	ticklinginfos['coursename']=coursename;
    	ticklinginfos['subjectone']=subjectone;
    	ticklinginfos['subjecttwo']=subjecttwo;
    	ticklinginfos['subjectthree']=subjectthree;
    	ticklinginfos['subjectfour']=subjectfour;
    	ticklinginfos['subjectfive']=subjectfive;
    	ticklinginfos['subjectsix']=subjectsix;
    	ticklinginfos['subjectseven']=subjectseven;
		var ticklings = JSON.stringify(ticklinginfos);
        //ajax请求数据
        var url = "xfcoursetickling.do?method=insertXfCourseTickling";
        $.post(url,{ticklings:encodeURI(ticklings),xh:xh},function (data, status) {
            if( status=="success" ){
                var json = eval(data);
                switch (json.errorMsg) {
                    case "success":		//成功
                        $.toast("提交成功");
                        setTimeout("WeixinJSBridge.call('closeWindow')",1000);
                        break;
                    case "failed":		//失败
                        $.alert("提交失败！", "提示");
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
</script>
</body>
</html>
