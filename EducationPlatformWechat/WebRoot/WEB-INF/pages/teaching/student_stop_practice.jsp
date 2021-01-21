<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
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
    <title>停止实习申请</title>
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
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
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
		.btn-delete{
	       background-color: #f76d4e;
        }
        
        input{
           text-align: center;
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
    <form class="layui-form layui-form-pane" action="" style="width:100%; ">
    	<!------------------------------------------------------开头 --------------------------------------------------------->
    	<div style="width: 100%;height: 60px;border-bottom: 1px solid #cccccc;background-color: #ffffff">
			<div style="width: 20%;height: 60px;float: left;">
				<img src="images/txwsc.jpg" style="width: 46px;height: 46px;margin-left: 15px;margin-top: 5px;">
			</div>
			<h2 style="color: green;text-align: center;line-height:65px;font-weight: bolder;">终止实习申请</h2>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-form-item" style="margin-top: 10px;">
			    <label class="layui-form-label">医通卡号</label>
			    <div class="layui-input-inline">
			      	<input value="${entity.xh}" type="text" name="xh" id="xh" autocomplete="off" class="layui-input" readonly="readonly">
			    </div>
		    </div>
			<div class="layui-form-item" style="margin-top: 10px;">
			    <label class="layui-form-label">申请人</label>
			    <div class="layui-input-inline">
			      	<input value="${entity.name}" type="text" name="sqr" id="sqr" autocomplete="off" class="layui-input" readonly="readonly">
			    </div>
		    </div>
		    <div class="layui-form-item">
			    <label class="layui-form-label">申请时间</label>
			    <div class="layui-input-inline">
			      	<input value="${entity.tzrq.substring(0,10)}" type="text" name="tzrq" id="tzrq" lay-verify="tzrq" placeholder="yyyy-mm-dd" autocomplete="off" class="layui-input">
			    </div>
		    </div>
		    <div class="layui-form-item layui-form-text">
			 	<label class="layui-form-label">终止原因</label>
			    <div class="layui-input-block">
			      <textarea placeholder="请输入终止实习原因..." class="layui-textarea" id="tzyy" name="tzyy" lay-verify="tzyy" rows="8">${entity.tzyy}</textarea>
			 	</div>
			</div>
		</div>
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn layui-btn-normal" lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>提交</button>
                <button type="button" class="layui-btn btn-delete"  name="closeBtn" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>	     	
            </div>
	  	</div>
    </form>
</body>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
    layui.use(['form', 'layedit', 'laydate','upload'], function(){
		var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate,
		upload = layui.upload;
		form.render();
		laydate.render({elem: '#tzrq'});
		var editIndex = layedit.build('LAY_demo_editor');
		  //自定义验证规则
		  form.verify({
			  tzrq: function(value){if(value==""||value==null){return '请选择申请时间！'}},
			  tzyy: function(value){if(value==""||value==null){return '请输入终止实习原因！'}},
		  });
		  
		form.on('submit(submit)', function(data){
		      var taskinfo = JSON.stringify(data.field);
		      document.getElementById('up_div').style.display ='block';
			  var url = "jxStudents.do?method=reSetStudentStopPeactice";
			  $.post(url,{taskinfo:encodeURI(taskinfo)},function (data, status) {
                  if( status=="success" ){
                      var json = eval(data);
                      switch(json.errorMsg){
                          case "stopped":
                        	   document.getElementById("up_div").style.display="none";
                        	   layer.alert("已停止实习，无需再申请！",{icon:'6'},function(index){
                        		   layer.close(index);
                        	   });
                        	   break;
                          case "success":
                    		   document.getElementById("up_div").style.display="none";
                    	       layer.alert("申请成功！",{icon:'6'},function(index){
                    		      layer.close(index);
                    	       }); 
                    	       break;
                    	  case "failed":
                    		  document.getElementById("up_div").style.display="none";
                    		  layer.alert("申请未成功！",{icon:'5'},function(index){
                    			  layer.close(index);
                    		  });
                    		  break;
                    	  case "error":	 
                    		  document.getElementById("up_div").style.display="none";
                    		  layer.alert("服务器异常，请稍后重试！",{icon:'2'},function(index){
                    			  layer.close(index); 
                    		  });
                    		  break;
                      }	  
                  }else{
                	  layer.alert("操作失败！");
                  }
          		},"json");
			});
		});
      
	  function close_windos(){
	    WeixinJSBridge.call('closeWindow')
	  }
</script>
</html>
