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
    <title>注册成功</title>
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
<form class="layui-form layui-form-pane" action=""  id="mainform" method="post">
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
		    <div style="width: 100%;height: 120px;border-bottom: 1px solid #cccccc;">
				<div style="width: 30%;height: 120px;float: left;">
						<img  src="images/finash.png" style="width: 100px;height: 100px;margin-top: 10px;margin-left: 20px;">
				</div>
				<div style="width: 65%;height: 80px;float: left;margin-left: 20px;">
					<div style="width: 100%;margin-top: 26px;">
						<span style="color: #47D973;font-size: 40px;">注册成功</span>
					</div>
				</div>
			</div>
   			<!-- 内容展现 -->
		   	<div style="overflow-y:auto;padding: 10px;" id="mainCount_div">
		   		<span>1：注册成功后请在<span style="color:red;">电脑端</span>登录：http://jxpt-soft.cn:8088/jx</span><br>
		   		<span>2：用户名为您注册时填写的【手机号】，初始密码：111111。</span><br>
		   		<span>3：登录成功后，依次点击【研究生管理】-【学生答辩申报】。</span><br>
		   		<span>4：点击（新增）按钮，在弹出页面认真填写资料，并<span style="color:red;">上传附件</span>。</span><br>
		   		<span>5：资料填写完成后，点击保存。申报信息保存成功。</span><br>
		   		<span>6：如果无需修改信息，在初始页面点击（提交），上报至教学部。</span><br>
		   		<span>7：资料上报后无法修改。如需修改，请点击（撤回）。</span><br>
		   		<span>8：可随时登陆查看提交资料是否审核通过。</span><br>
		   		<span>9：可在<span style="color:red;">微信端</span>点击【学员账号】-【我的信息】查看此文档。</span><br>
		    </div>
		    <div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
		    	<div style="margin-top: 5px;width: 100%;text-align: center;">
			     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
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
	  	laydate.render({elem: '#grade',type:'year',theme: 'molv'});
	  	form.on('select(professional)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
			$("#professionalname").val(name);
		});
		form.on('select(graduateschool)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
		    $("#graduateschoolname").val(name);
		});
		form.on('select(collegeid)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
		    $("#collegename").val(name);
		});
	  	//创建一个编辑器
		var editIndex = layedit.build('LAY_demo_editor');
		//自定义验证规则
		form.verify({
			telnumber: function(value){if(value==""||value==null){
			  	  	return '请填写联系电话！';
			  	}else if(!(/^1[3|4|5|7|8][0-9]\d{4,8}$/.test(value))){
				  	return '请填写正确的电话！';
			  	}
		  	},
			name: function(value){if(value==""||value==null){return '姓名不能为空！'}},
			idcard: function(value){
				if(value==""||value==null){
					return '请填写身份证号码！';
				}else{
			  		var year = value.substring(6,10);
					var month = value.substring(10,12);
					var day = value.substring(12,14);
					var userShengri = year+"-"+month+"-"+day;
					$("#birthday").val(userShengri);
			  	}
			},
			classid: function(value){if(value==""||value==null){return '请选择科室！'}},
			xueli: function(value){if(value==""||value==null){return '请选择学历！'}},
			schoolnum: function(value){if(value==""||value==null){return '请填写学号！'}},
			graduateschool: function(value){if(value==""||value==null){return '请选择学校！'}},
			collegeid: function(value){if(value==""||value==null){return '请选择学院！'}},
			grade: function(value){if(value==""||value==null){return '请选择年级！'}},
			professional: function(value){if(value==""||value==null){return '请选择专业！'}},
			professionalguid: function(value){if(value==""||value==null){return '请填写学科方向！'}},
			teachrename: function(value){if(value==""||value==null){return '请填写导师名称！'}},
		});
		form.on('submit(submit)', function(data){
			var openid = $("#openid").val();
			var clientsxh = $("#clientsxh").val();
			var yhdh = $("#telnumber").val();
			var userinfos = {};
			userinfos['glbm']="62000001";
			userinfos['lxdh']=yhdh;
			userinfos['mmyxq']=getlateyear();
			userinfos['qxgroup']="180";
			userinfos['qxms']="180";
			userinfos['sfgly']="0";
			userinfos['sfzmhm']=$("#idcard").val();
			userinfos['xm']=$("#name").val();
			userinfos['yhdh']=yhdh;
			userinfos['yhgh']=yhdh;
			userinfos['yhjb']="6";
			userinfos['yhyxq']=getlateyear();
			userinfos['sfxz']="1";
			userinfos['zt']="0";
			var userInfo = JSON.stringify(userinfos);
	        var taskinfo = JSON.stringify(data.field);
	        document.getElementById('up_div').style.display ='block';
			var url = "jxStudents.do?method=saveGraduateInfo";
            $.post(url,{taskinfo:encodeURI(taskinfo),openid:openid,clientsxh:clientsxh,type:'g'},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
	                    case "idcarderror":		//成功
	                        layer.alert("身份证号码不正确！", {title: '提示信息'});
	                        document.getElementById('up_div').style.display ='none';
	                        break;
	                    case "chongfu":		//成功
	                          layer.alert("该手机号已注册账号！", {title: '提示信息'});
	                          document.getElementById('up_div').style.display ='none';
	                          break;
	                    /* case "openidchunfu":		//成功
	                          layer.alert("该手机号已注册！", {title: '提示信息'});
	                          document.getElementById('up_div').style.display ='none';
	                          break; */
                        case "success":		//成功
                        	var url = "sysuser.do?method=addUser";
                            $.post(url,{userInfo:encodeURI(userInfo),openid:openid,clientsxh:clientsxh},function (data, status) {
                                if( status=="success" ){
                                    var json = eval(data);
                                    switch (json.errorMsg) {
                                        case "success":		//成功
                                        	  document.getElementById('up_div').style.display ='none';
                                        	  layer.msg("注册成功",{icon:'1'},function(){
                                        		  var url = "jxStudents.do?method=toGraduateSuccessPage";
                                        		  window.open(spath,"toGraduateSuccessPage");
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
                        case "failed":		//失败
                      	  	  /* layer.alert("添加失败3", {title: '提示信息'}); */
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
	
	
	function getlateyear(){
		var today = new Date();
		var y = today.getFullYear();
		var m = today.getMonth() + 1;
		var d = today.getDate();
		var SelTime = (y+1) + '-' + m + '-' + d;//开始时间……
		return SelTime;
	}
	
	/* =======================================获取人员信息========================================= */
	var layer_query_index ; 
	function getteacher(){
		layer_query_index = layer.open({
			type: 2,
			skin: 'demo-class',
			area: [(width-50)+'px', (height-100)+'px'],
			title: "教师信息",
			shade: 0.8,
			id: layer_query_index,
			btnAlign: 'c',
			moveType: 1,
			content: 'xfemployee.do?method=toQueryPerson',
			success: function(layero){}
		});
	}
	function closeQueryLayer(data){
		layer.close(layer_query_index);
		$("#teacherid").val(data.usernumber);
		$("#teachrename").val(data.username);
	}
</script>
</body>
</html>
