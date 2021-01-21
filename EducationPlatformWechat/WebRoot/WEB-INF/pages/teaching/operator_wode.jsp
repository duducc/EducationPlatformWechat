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
    
    <title>ѧ�������ֲ�</title>
    
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
		.redspan{
			color: red;
		}
	</style>
  </head>
  <body>
    <form class="layui-form layui-form-pane" action="" style="width:100%; ">
    	<input type="hidden" id="openid" name="openid" value="${openid }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
		<input type="hidden" id="pertype" name="pertype" value="${pertype }"/>
    	<!------------------------------------------------------��ͷ --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 26px;">
					<span style="color: #fff;font-size: 18px;"><b>�����ֲ�</b></span><br>
					<span style="color: #fff;font-size: 15px;">�������Ķ������ֲ�</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">��һ��</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;padding: 10px;">
						<span class="fispan">��дע����Ϣ���ϴ�<span class="redspan">֤����Ƭ</span>����������ύ�������ʾ"ע��ɹ�"�����ʾ��ע��ɹ������ɵ���رհ�ť���ȴ���ѧ����ˡ�</span>
 					</div>
				</div>
			</div>
			<!---------------------------------------------------------��ͥ��Ϣ -------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">�ڶ���</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;">
						���յ�"ע����Ϣ��˳ɹ�"��������Ϣ���������ѧ�������ͨ����<br>
						������Ϣ�л�ע����"����ʱ��"��"�����ص�"��"��Я����Ʒ"������ϸ�Ķ���
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------ʵϰ��Ϣ -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">������</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;">
  						��ѧ�����ͨ�����������ҵ���Ϣ��-���ҵ��ļ�����ѧ�����ƺ�ѧ������֤��
  						�ڴ򿪵�ҳ���н����������ƺͱ���֤��ͼƬ�����д�ӡ����Я����ӡ��֤���ȣ��ڹ涨��ʱ��͵ص���б�����
 					</div>
				</div>
			</div>
			<!--------------------------------------------------------ѧУ��Ϣ -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">���Ĳ�</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;">
						������ɺ�ѧ��ÿ�����ǩ������������ù��ܡ�-��ѧԱǩ�������д�ǩ����ǩ��ʱϵͳ����¼ǩ��λ�ã�ʱ��ȡ�<br>
						ѧ����ٵ�������ù��ܡ�-��������롿���������ˡ��������鿴�����ע�����
 					</div>
				</div>
			</div>
		    <!--------------------------------------------------------������Ϣ -------------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;margin-bottom: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">���岽</h2>
  					<div class="layui-colla-content layui-show" style="height: 15%;">
					            ѧ��Ҳ�����ڡ�ѧԱ�˺š�-���ҵ���Ϣ���в鿴�Լ��ĸ�����Ϣ��<br>
					            ѧ��ʵϰ�ڼ�����ڡ��ҵ���Ϣ���в�ѯ�Լ��������Ϣ����ѵ��Ϣ��ѧ����Ϣ��Υ����Ϣ�ȡ�
 					</div>
				</div>
			</div>
			<div style="width: 100%;height: 50px;margin-bottom: 20px;padding: 5px;">
				<input type="hidden" name="shxsxy" id="shxsxy" lay-verify="shxsxy" value="1"/>
				<input type="checkbox" lay-skin="switch" lay-filter="switchTest" lay-text="���Ķ�|δ�Ķ�">
				<span style="font-size: 14px;">�����Ķ�ѧ�������ֲᣬ����ע�ᣡ</span>
			</div>
		</div>
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" onclick="jixuzhuce();"><i class="layui-icon">&#xe609;</i>����ע��</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>�ر�</button>
	     	</div>
	  	</div>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
	layui.use(['form', 'layedit', 'laydate'], function(){
		var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate;
    	form.on('switch(switchTest)', function(data){
			if(this.checked==true){
				$("#shxsxy").val(2);
			}else{
				$("#shxsxy").val(1);
			}
		});
	});
	
    function close_windos(){WeixinJSBridge.call('closeWindow')}
    function jixuzhuce(){
    	var openid = $("#openid").val();
		var clientsxh = $("#clientsxh").val();
		var pertype = $("#pertype").val();
		var shxsxy = $("#shxsxy").val();
		if(shxsxy==1){
			layer.msg("����ϸ�Ķ������ֲᣬ��ͬ�����Ķ���",{icon:'5'});
			return false;
		}else{
			if(pertype==2){
				var openid = $("#openid").val();
				var clientsxh = $("#clientsxh").val();
				var url = "jxStudents.do?method=toStudentRegistPage";
				/* var spath = "jxStudents.do?method=toInternRegistPage&openid="+openid+"&clientsxh="+clientsxh; */
				var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&pertype="+pertype;
				window.open(spath,"toTraineeRegist");
			}else if(pertype==5){
				var openid = $("#openid").val();
				var clientsxh = $("#clientsxh").val();
				var url = "jxStudents.do?method=toJxStudentRegistPage";
				var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&pertype="+pertype;
				window.open(spath,"toJianxsRegist");
			}
		}
    }
</script>
</body>
</html>
