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
    <title>注册账号 </title>
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
		.layui-form-radio {
		    margin: 0 0 0 0;
		    padding-right: 0px;
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
<form class="layui-form layui-form-pane" action=""  id="mainform" method="post">
	<input type="hidden" id="openid" name="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="qq" name="qq" lay-verify="qq" value="3"/>
	<input type="hidden" id="shengri" name="shengri" lay-verify="shengri" value=""/>
	<input type="hidden" id="state" name="state" lay-verify="state" value="1"/>
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
		    <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
				<div style="width: 25%;height: 80px;float: left;">
					<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
						<img src="images/boolean/xgmm.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
					</button>
				</div>
				<div style="width: 45%;height: 80px;float: left;">
					<div style="width: 100%;margin-top: 26px;">
						<span style="color: #fff;font-size: 18px;"><b>实习生注册</b></span><br>
						<span style="color: #fff;font-size: 15px;">红色选项为必填项</span>
					</div>
				</div>
			</div>
			<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
    			<div style="width: 100%;; height: 30px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; ">
     				<span style="color: red;font-size: 14px;margin-left: 15px;">完成注册后即已绑定，即可开始打卡签到！</span>
    			</div>
     		</div>
   			<!-- 内容展现 -->
		   	<div style="overflow-y:auto;height: 80%;" id="mainCount_div">
		     	<div class="layui-form-item">
			    	<label class="layui-form-label" style="color:red;">姓名：</label>
				    <div class="layui-input-inline">
				      	<input id="username" type="text" name="username" value="${employee.username }" lay-verify="username" placeholder="请输入姓名" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
		        <div class="layui-form-item">
			    	<label class="layui-form-label" style="color:red;">性别：</label>
			    	<div class="layui-input-inline">
				      	<input type="radio" name="sex" value="1" title="男" checked="">
				      	<input type="radio" name="sex" value="0" title="女">
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color:red;">身份证：</label>
				    <div class="layui-input-inline">
				      	<input id="idcard" type="text" name="idcard" value="${employee.idcard }" lay-verify="idcard" placeholder="请输入身份证号码" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color:red;">联系电话：</label>
				    <div class="layui-input-inline">
				      	<input id="usertel" type="text" name="usertel" value="${employee.usertel }" lay-verify="usertel" placeholder="请输入联系电话" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label">毕业学校：</label>
				    <div class="layui-input-inline">
				      	<input id="byyuabxiao" type="text" name="byyuabxiao" value="${employee.byyuabxiao }" lay-verify="byyuabxiao" placeholder="请输入学校" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label">专业：</label>
				    <div class="layui-input-inline">
				      	<select id="zhuanye" name="zhuanye">
						 	<code:printCode bShowDmz="false" dmjc="ZY" defaultValue="${employee.zhuanye }" type="1"/>
						</select>
				    </div>
				</div>
		    </div>
		    <div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
			     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>立即提交</button>
			     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
			     	<!-- <button type="button" class="layui-btn"  onclick="get1();"><i class="layui-icon">&#xe643;</i>测试</button> -->
		     	</div>
		  	</div>
		</div>
	</div>
</form>
<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	var height= $("body").height();
	var width= $("body").width();
	document.getElementById("mainCount_div").style.height=height-135;
	layui.use(['form', 'layedit', 'laydate'], function(){
	  	var form = layui.form,
	  	layer = layui.layer,
	  	layedit = layui.layedit,
	  	laydate = layui.laydate;
	  	form.render();
	  	laydate.render({elem: '#xkrq',theme: 'molv'});
	  	//创建一个编辑器
		var editIndex = layedit.build('LAY_demo_editor');
		//自定义验证规则
		form.verify({
			usertel: function(value){if(value==""||value==null){
			  	  	return '请填写联系电话！';
			  	}else if(!(/^1[3|4|5|7|8][0-9]\d{4,8}$/.test(value))){
				  	return '请填写正确的电话！';
			  	}
		  	},
			username: function(value){if(value==""||value==null){return '姓名不能为空！'}},
			idcard: function(value){
				if(value==""||value==null){
					return '请填写身份证号码！';
				}else{
			  		var year = value.substring(6,10);
					var month = value.substring(10,12);
					var day = value.substring(12,14);
					var userShengri = year+"-"+month+"-"+day;
					$("#shengri").val(userShengri);
			  	}
			},
		});
		form.on('submit(submit)', function(data){
			var openid = $("#openid").val();
			var clientsxh = $("#clientsxh").val();
	        var taskinfo = JSON.stringify(data.field);
	        document.getElementById('up_div').style.display ='block';
			var url = "xfemployee.do?method=saveInternInfo";
            $.post(url,{taskinfo:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
	                    case "idcarderror":		//成功
	                        layer.alert("身份证号码不正确！", {title: '提示信息'});
	                        document.getElementById('up_div').style.display ='none';
	                        break;
	                    case "chongfu":		//成功
	                          layer.alert("人员已存在！", {title: '提示信息'});
	                          document.getElementById('up_div').style.display ='none';
	                          break;
                        case "success":		//成功
                        	  document.getElementById('up_div').style.display ='none';
                        	  layer.msg("注册成功！", {icon: 1}, function(){
                        		  close_windos();
                        	  });
	                          break;
                        case "failed":		//失败
                      	  	  layer.alert("注册失败", {title: '提示信息'});
                      	  	  document.getElementById('up_div').style.display ='none';
                              break;
                        case "error":		//服务器异常
                              layer.alert("服务器异常，稍后再试！", {title: '警告'});
                              document.getElementById('up_div').style.display ='none';
                              break;
                    }
                }else{
                    layer.alert("操作失败！", {title: '警告'});
                    document.getElementById('up_div').style.display ='none';
                }
          },"json");
		});
	});	
	function close_windos(){
		WeixinJSBridge.call('closeWindow');
	}
</script>
</body>
</html>
