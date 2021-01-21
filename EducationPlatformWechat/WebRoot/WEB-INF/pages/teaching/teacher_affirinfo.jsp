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
    
    <title>��ʦ�Ͽ�����ȷ��</title>
    
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
	</style>
  </head>
  <body>
  <!-- -----------------------------------------�ȴ�ҳ��--------------------------------------------- -->
	<div id="up_div" class="up_div">
		<div style="width: 100%;" id="bet_ondiv"></div>
		<div class="bet_div" id="bet_div">
			<div style="width: 100%;height: 10px;"></div>
			<div style="height: 70px;width: 60%;margin-left:20%;">
				<img src="images/loadingwx.gif" style="width: 100%;">
			</div>
			<div style="width: 100%;height: 5px;"></div>
			<div style="width: 100%;text-align: center;">
				<span style="font-size: 13px;">���Ժ�</span>
			</div>
		</div>
	</div>
	<!-- ---------------------------------------------------------------------------------------------- -->
    <form class="layui-form layui-form-pane" action="" style="width:100%; ">
    	<input type="hidden" id="arrangexh" name="arrangexh" value="${entity.xh }"/>
    	<input type="hidden" id="num" name="num" value="${num}"/>
    	<!------------------------------------------------------��ͷ --------------------------------------------------------->
		<div style="overflow-y:auto;height: 95%;background-color: #fff;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-form-item layui-form-text" style="height:200">
					<label class="layui-form-label">ȷ������</label>
			      	<div class="layui-input-block">
				    	<textarea class="layui-textarea" id="count" placeholder="�Ͽ��������յ�"  style="height: 140px;"></textarea>
				    </div>
				</div>
				
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">�γ���Ϣ</h2>
  					<div class="layui-colla-content ">
						<div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;">�ڿ�ѧУ</label>
						    <div class="layui-input-inline">
						    	<input value="${plan.shkxuexname }" type="text" disabled="disabled" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >�ڿ��꼶</label>
						    <div class="layui-input-inline">
						      <input value="${nj}" type="text" disabled="disabled" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >�ڿΰ༶</label>
						    <div class="layui-input-inline">
						      <input value="${zhuanye}" type="text" disabled="disabled" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >�γ�����</label>
						    <div class="layui-input-inline">
						      <input value="${plan.coursename}" type="text" disabled="disabled" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >��������</label>
						    <div class="layui-input-inline">
						      <input value="${entity.jshnr}" type="text" disabled="disabled" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >������</label>
						    <div class="layui-input-inline">
						      <input value="${plan.emonum}" type="text" disabled="disabled" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item layui-form-text" style="height:200">
							<label class="layui-form-label">�ڿεص�</label>
					      	<div class="layui-input-block">
						    	<textarea class="layui-textarea" style="height: 140px;">${plan.shkdid}</textarea>
						    </div>
						</div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >����̲�</label>
						    <div class="layui-input-inline">
						      <input value="${plan.xyjcshm}" type="text" disabled="disabled" autocomplete="off" class="layui-input">
						    </div>
					    </div>
					    <div class="layui-form-item" style="margin-top: 10px;">
						    <label class="layui-form-label" style="color:red;" >�Ͽ�ʱ��</label>
						    <div class="layui-input-inline">
						      <input value="${time}" type="text" disabled="disabled" autocomplete="off" class="layui-input">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
		</div>
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" onclick="quereninfo();"><i class="layui-icon">&#x1005;</i>ȷ��</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>�ر�</button>
	     	</div>
	  	</div>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
    function close_windos(){WeixinJSBridge.call('closeWindow')}
	
    function quereninfo(){
    	document.getElementById('up_div').style.display ='block';
        var count = $("#count").val();
        count = count==null||count==""?"�Ͽ��������յ�":count;
        var num = $("#num").val();
        var arrangexh = $("#arrangexh").val();
		var url = "JxCourseArrange.do?method=updateJxCourseArrange&count="+count;
        $.post(url,{arrangexh:arrangexh,num:num},function (data, status) {
              if( status=="success" ){
                  var json = eval(data);
                  switch (json.errorMsg) {
                      case "success":		//�ɹ�
                          layer.msg("�ظ��ɹ���",{icon:'1'});
                          document.getElementById('up_div').style.display ='none';
                          setTimeout(tomineleave(),1000);
                          break;
                      case "failed":		//ʧ��
                    	  layer.msg("�ظ�ʧ��",{icon:'2'});
                    	  document.getElementById('up_div').style.display ='none';
                          break;
                      case "error":		//�������쳣
                          layer.msg("�������쳣���Ժ����ԣ�",{icon:'5'});
                          document.getElementById('up_div').style.display ='none';
                          break;
                  }
              }else{
                  layer.msg("����ʧ�ܣ�",{icon:'5'});
                  document.getElementById('up_div').style.display ='none';
              }
      },"json");
    }
</script>
</body>
</html>
