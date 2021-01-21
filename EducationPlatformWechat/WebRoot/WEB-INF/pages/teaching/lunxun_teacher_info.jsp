<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="/codetag" prefix="code"%>
<%@ taglib uri="/printDep" prefix="dep"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>轮训教师维护</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery.1.7.2.min.js"></script>
	<link rel="stylesheet" href="layui/css/layui.css"  media="all">
	<link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
	<style type="text/css">
		*{
			margin:0;
			padding:0;
		}
		.layui-form-switch {
		    height: 28px;
		    line-height: 28px;
		    min-width: 60px;
		    padding: 0 8px;
		    margin-top: 0px;
		    border-radius: 25px;
		}
		.layui-form-switch em {
		    font-size: 14px;
		}
		.layui-form-switch i {
		    top: 5px;
		}
		.layui-form-pane .layui-form-radio, .layui-form-pane .layui-form-switch {
		    margin-top: 0px;
		}
	</style>
  </head>
  <body>
    <form class="layui-form layui-form-pane" action="" style="width:100%; ">
    	<input type="hidden" id="stuxh" name="stuxh" value="${stuxh }"/>
    	<input type="hidden" id="stuname" name="stuname" value="${stuname }"/>
    	<input type="hidden" id="size" name="size" value="${size}"/>
    	<!------------------------------------------------------开头 --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>轮训教师维护</b></span><br>
					<span style="color: #fff;font-size: 15px;">可只需维护当前轮训科室</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<c:forEach items="${lxlist }" var="s">
				<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
					<div class="layui-colla-item">	
	  					<h2 class="layui-colla-title">${s.remark1 }</h2>
	  					<div class="layui-colla-content layui-show">
							<div class="layui-form-item" style="margin-top: 10px;">
							    <label class="layui-form-label" style="color:red;">科室名称</label>
							    <div class="layui-input-inline">
							      	<input value="${s.remark1}" type="text" autocomplete="off" class="layui-input" readonly="readonly">
							    </div>
						    </div>
						    <div class="layui-form-item" style="margin-top: 10px;">
							    <label class="layui-form-label" style="color:red;">开始时间</label>
							    <div class="layui-input-inline">
							      	<input value="${s.startdate.substring(0,10)}" type="text" autocomplete="off" class="layui-input" readonly="readonly">
							    </div>
						    </div>
						    <div class="layui-form-item" style="margin-top: 10px;">
							    <label class="layui-form-label" style="color:red;">结束时间</label>
							    <div class="layui-input-inline">
							      	<input value="${s.enddate.substring(0,10)}" type="text" autocomplete="off" class="layui-input" readonly="readonly">
							    </div>
						    </div>
						    <div class="layui-form-item" style="margin-top: 10px;">
							    <label class="layui-form-label" style="color:red;">轮训教师</label>
							    <div class="layui-input-inline">
							      	<input id="zmrid${s.num}" type="hidden">
					      			<input id="zmr${s.num}" type="text" placeholder="请选择教师" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
					      			<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getemp(${s.num});"><i class="layui-icon">&#xe615;</i>查询</button>
					      		</div>
						    </div>
						    <input type="hidden" id="syxhs${s.num }" value="${s.num }"/>
	 					</div>
					</div>
				</div>		
			</c:forEach>
		</div>
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" onclick="save();"><i class="layui-icon">&#x1005;</i>立即提交</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
	     	</div>
	  	</div>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
    $(function(){
    });
    
   	/* =======================================获取人员信息========================================= */
   	var type = "";
   	var layer_query_index ; 
   	function getemp(value){
   		type=value;
   		layer_query_index = layer.open({
   			type: 2,
   			skin: 'demo-class',
   			area: [(width-50)+'px', (height-100)+'px'],
   			title: "人员信息",
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
   		$("#zmrid"+type).val(data.usernumber);
   		$("#zmr"+type).val(data.username);
   		var xhs = type+","+data.usernumber+","+data.username;
   		$("#syxhs"+type).val(xhs);
   	}
   	
   	function save(){
   		var size = ($("#size").val()*1)+1;
   		var stuxh = $("#stuxh").val();
   		var stuname = $("#stuname").val();
   		var names = "";
   		for(var i=1;i<size;i++){
   			var xhs = $("#syxhs"+i).val();
   			names += xhs+"/";
   		}
   		var url ="JxStuInterPro.do?method=insertJxStudentsInternshipProves&stuname="+stuname;
		$.post(url,{names:names,stuxh:stuxh},function (data, status) {
	        if( status=="success" ){
	            var json = eval(data);
	            switch (json.errorMsg) {
	                case "success":		//成功
		               layer.msg("保存成功", {icon: 1});
	                   $("#type").val("1");
		               break;
	                case "failed":		//修改失败
	                   layer.msg("保存失败", {icon: 2});
	                   break;
	                case "error":		//服务器异常
	                   layer.msg("服务器异常，稍后再试！", {icon: 2}, {title: '警告',offset: '100px'});
	                   break;
	            }
	        }else{
	            layer.msg("操作失败！", {icon: 2}, {title: '警告'});
	        }
	    },"json");
   	}
</script>
</body>
</html>
