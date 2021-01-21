<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="GBK"%>
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
    <meta charset="GBK">
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
	<input type="hidden" id="openid" name="openid" lay-verify="openid" value="${openid }"/>
	<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
	<input type="hidden" id="type" name="type" value="${type}"/>
	<input type="hidden" id="pertype" name="pertype" lay-verify="pertype" value="4"/>
	<input type="hidden" id="state" name="state" lay-verify="state" value="2"/>
	<input type="hidden" id="id" name="id" value="${id}"/>
	<input type="hidden" id="xh" name="xh" lay-verify="xh"/>
	<div class="weui_tab" style="width: 100%;">
    	<div class="weui_tab_bd">
		    <div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
				<div style="width: 25%;height: 80px;float: left;">
					<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
						<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
					</button>
				</div>
				<div style="width: 45%;height: 80px;float: left;">
					<div style="width: 100%;margin-top: 26px;">
						<span style="color: #fff;font-size: 18px;"><b>本科生注册</b></span><br>
						<span style="color: #fff;font-size: 15px;">红色选项为必填项</span>
					</div>
				</div>
			</div>
			<div class="weui_cells weui_cells_form" style="margin-top: 0px;">
    			<div style="width: 100%;; height: 50px;border-bottom: 1px solid #cccccc;background-color:#DCDDC0; ">
     				<span style="color: red;font-size: 14px;margin-left: 15px;">1.注册成功后即绑定成功！</span><br>
     				<span style="color: red;font-size: 14px;margin-left: 15px;">2.注册成功后即可进行上课签到！</span>
    			</div>
     		</div>
   			<!-- 内容展现 -->
		   	<div style="overflow-y:auto;height: 82.4%;" id="mainCount_div">
		     	<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">姓名：</label>
				    <div class="layui-input-inline">
				      	<input id="name" type="text" name="name" value="${entity.name }" lay-verify="name" placeholder="请输入姓名" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
		        <div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">性别：</label>
			    	<div class="layui-input-inline">
			    		<select id="sex" name="sex">
						 	<code:printCode bShowDmz="false" dmjc="XB" defaultValue="${entity.sex }" type="1"/>
						</select>
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">身份证：</label>
				    <div class="layui-input-inline">
				      	<input id="idcard" type="text" name="idcard" value="${entity.idcard }" lay-verify="idcard" placeholder="请输入身份证号码" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">联系电话：</label>
				    <div class="layui-input-inline">
				      	<input id="telnumber" type="text" name="telnumber" value="${entity.telnumber }" lay-verify="telnumber" placeholder="请输入联系电话" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">学号：</label>
				    <div class="layui-input-inline">
				      	<input id="schoolnum" type="text" name="schoolnum" value="${entity.schoolnum }" lay-verify="schoolnum" placeholder="请输入学号" autocomplete="off" class="layui-input" style="height:38px;">
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">学校：</label>
				    <div class="layui-input-inline">
				    	<input type="hidden" id="remark1" name="remark1" lay-verify="remark1" />
				      	<select id="graduateschool" name="graduateschool" lay-verify="graduateschool" lay-filter="graduateschool">
						 	<code:printCode bShowDmz="false" dmjc="SHXSCH" defaultValue="${entity.graduateschool }" type="1"/>
						</select>
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">学院：</label>
				    <div class="layui-input-inline">
				    	<input type="hidden" id="collegename" name="collegename" lay-verify="collegename"/>
				      	<select id="collegeid" name="collegeid" lay-verify="collegeid" lay-filter="collegeid">
						 	<code:printCode bShowDmz="false" dmjc="COLLEGE" defaultValue="${entity.collegeid }" type="1"/>
						</select>
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">年级：</label>
				    <div class="layui-input-inline">
				      	<input id="grade" type="text" name="grade" value="${entity.grade }" lay-verify="grade" placeholder="请选择" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
						<label class="layui-form-label" style="color: red;width: 40%;border-left: 0px;">级</label>
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">专业：</label>
				    <div class="layui-input-inline">
				    	<input type="hidden" id="remark2" name="remark2" lay-verify="remark2" />
				      	<select id="professional" name="professional" lay-verify="professional" lay-filter="professional">
						 	<code:printCode bShowDmz="false" dmjc="ZY" defaultValue="${entity.professional }" type="1"/>
						</select>
				    </div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label" style="color: red;">班级：</label>
				    <div class="layui-input-inline">
				      	<select id="banji" name="banji" lay-verify="banji" lay-filter="banji">
						 	<code:printCode bShowDmz="false" dmjc="BANJI" defaultValue="${entity.banji }" type="1"/>
						</select>
				    </div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">专业方向</label>
					<div class="layui-input-block" style="margin-top: -5px;">
					  <textarea placeholder="请输入内容" class="layui-textarea" id="professionalguid" name="professionalguid" style="height: 50px;">${entity.professionalguid }</textarea>
					</div>
				</div>
				<div class="layui-form-item">
			    	<label class="layui-form-label">学历：</label>
				    <div class="layui-input-inline">
				      	<select id="xueli" name="xueli">
						 	<code:printCode bShowDmz="false" dmjc="XL" defaultValue="${entity.xueli }" type="1"/>
						</select>
				    </div>
				</div>
		    </div>
		    <c:if test="${entity.xh==null||entity.xh==''}">
			    <div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;">
			    	<div style="margin-top: 5px;width: 100%;text-align: center;">
				     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>立即提交</button>
				     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
			     	</div>
			  	</div>
		  	</c:if>
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
	  	form.on('select(graduateschool)', function(data){
	  		var name = data.elem[data.elem.selectedIndex].text;
	  		var id = $("#id").val();
	  		var xh = data.value+id;
			$("#xh").val(xh);
			$("#remark1").val(name);
		});
	  	form.on('select(collegeid)', function(data){
	  		 var name = data.elem[data.elem.selectedIndex].text;
			 $("#collegename").val(name);
		});
	  	form.on('select(professional)', function(data){
			var name = data.elem[data.elem.selectedIndex].text;
			$("#remark2").val(name);
		});
	  	laydate.render({elem: '#grade',type:'year',theme: 'molv'});
	  	
	  	//创建一个编辑器
		var editIndex = layedit.build('LAY_demo_editor');
		//自定义验证规则
		form.verify({
			name: function(value){if(value==""||value==null){return '姓名不能为空！'}},
			sex: function(value){if(value==""||value==null){return '请选择性别！'}},
			idcard: function(value){if(value==""||value==null){return '请填写身份证号码！'}},
			telnumber: function(value){if(value==""||value==null){
			  	  	return '请填写联系电话！';
			  	}else if(!(/^1[3|4|5|7|8][0-9]\d{4,8}$/.test(value))){
				  	return '请填写正确的电话！';
			  	}
		  	},
			schoolnum: function(value){if(value==""||value==null){return '请填写学号！'}},
			graduateschool: function(value){if(value==""||value==null){return '请选择学校！'}},
			grade: function(value){if(value==""||value==null){return '请选择年级！'}},
			professional: function(value){if(value==""||value==null){return '请选择专业！'}},
			banji: function(value){if(value==""||value==null){return '请选择班级！'}},
		});
		form.on('submit(submit)', function(data){
			var type = $("#type").val();
			var openid = $("#openid").val();
			var clientsxh = $("#clientsxh").val();
			var userinfos = {};
			userinfos['openId']=openid;
			userinfos['clientsxh']=clientsxh;
			userinfos['yitongCard']=$("#xh").val();
			userinfos['deptId']=$("#graduateschool").val();
			userinfos['isAdmin']=0;
			userinfos['islqxx']=1;
			userinfos['sex']=$("#sex").val();
			userinfos['sfzmhm']=$("#idcard").val();
			userinfos['xm']=$("#name").val();
			userinfos['yhlb']=1;
			userinfos['state']=2;
			var userInfo = JSON.stringify(userinfos);
	        var taskinfo = JSON.stringify(data.field);
	        document.getElementById('up_div').style.display ='block';
			var url = "jxStudents.do?method=saveUnderGraduate";
            $.post(url,{userInfo:encodeURI(userInfo),taskinfo:encodeURI(taskinfo),type:'ug'},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
	                    case "idcarderror":		//成功
	                        layer.msg("身份证号码不正确！", {icon: '7'});
	                        document.getElementById('up_div').style.display ='none';
	                        break;
	                    case "chongfu":		//成功
	                          layer.msg("人员已存在！", {icon: '5'});
	                          document.getElementById('up_div').style.display ='none';
	                          break;
	                    /* case "openidchunfu":		//成功
	                          layer.alert("该手机号已注册！", {title: '提示信息'});
	                          document.getElementById('up_div').style.display ='none';
	                          break; */
                        case "success":		//成功
                        	  layer.msg("注册成功！", {icon: '1'});
	                          document.getElementById('up_div').style.display ='none';
	                          break;
                        case "failed":		//失败
                      	  	  layer.msg("添加失败！", {icon: '2'});
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
		$("#beizhu").val(data.usernumber);
		$("#uresource").val(data.username);
	}
	
</script>
</body>
</html>
