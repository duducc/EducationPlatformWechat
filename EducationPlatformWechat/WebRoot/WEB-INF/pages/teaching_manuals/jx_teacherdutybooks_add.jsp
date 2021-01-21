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
    
    <title>����������</title>
    
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
    	<input type="hidden" id="openid" name="openid" value="${openid }"/>
		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh }"/>
		<input type="hidden" id="stuId" name="stuId" lay-verify="stuId" value="${bindinfo.yitongCard }"/>
		<input type="hidden" id="stuName" name="stuName" lay-verify="stuName" value="${bindinfo.xm }"/>
		<input type="hidden" id="deptid" name="deptid" lay-verify="deptid" value="${deptid }"/>
		<input type="hidden" id="deptname" name="deptname" lay-verify="deptname" value="${deptname }"/>
		<input type="hidden" id="xh" name="xh" lay-verify="xh" value="${entity.xh }"/>
		<input type="hidden" id="classid" name="classid" lay-verify="classid" value="${lunxun.classid }"/>
		<input type="hidden" id="classname" name="classname" lay-verify="classname" value="${lunxun.classname }"/>
		<input type="hidden" id="zuid" name="zuid" lay-verify="zuid" value="${lunxun.zuid }"/>
		<input type="hidden" id="zuname" name="zuname" lay-verify="zuname" value="${lunxun.zuname }"/>
		<input type="hidden" id="type" name="type" lay-verify="type" value="${type }"/>
		<input type="hidden" id="opinion" name="opinion" value="${opinion }"/>
		
		<input type="hidden" id="lxxh" name="lxxh" value="${lxxh }"/>
    	<!------------------------------------------------------��ͷ --------------------------------------------------------->
    	<div style="width: 100%;height: 80px;border-bottom: 0px solid #cccccc;background-color: #65B39D;">
			<div style="width: 25%;height: 80px;float: left;">
				<button style="width: 70px;height: 70px;border-radius: 50%;border: none;margin-top: 5px;margin-left: 8px;background-color: #65B39D" >
					<img src="images/boolean/qt.png" style="width: 70px;height: 70px;margin-left: 3px;" onclick="MillisecondToDate('-661000');">
				</button>
			</div>
			<div style="width: 45%;height: 80px;float: left;">
				<div style="width: 100%;margin-top: 16px;">
					<span style="color: #fff;font-size: 18px;"><b>${bindinfo.xm }</b></span><br>
					<span style="color: #fff;font-size: 15px;">${deptname}</span>
				</div>
			</div>
		</div>
		<div style="overflow-y:auto;height: 85%;background-color: #fff;" id="mainCount_div">
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">���̽�ʦ��Ϣ</h2>
  					<div class="layui-colla-content layui-show">
						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >��ʦ����</label>
						    <div class="layui-input-inline">
						      	<input id="teacherId" name="teacherId" lay-verify="teacherId" type="hidden">
				      			<input value="${entity.teacherName }" id="teacherName" name="teacherName" lay-verify="teacherName" type="text" placeholder="��ѡ���ʦ" autocomplete="off" class="layui-input" style="height:38px;width: 60%;float: left;" readonly="readonly">
				      			<button style="float: left;height: 38px;width: 40%;" class="layui-btn layui-btn-sm" type="button" onclick="getemp();"><i class="layui-icon">&#xe615;</i>��ѯ</button>
						    </div>
					    </div>
					    <div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >ǩ������</label>
						    <div class="layui-input-inline">
				      			<input value="${entity.zttime.substring(0,10) }"  id="zttime" name="zttime" lay-verify="zttime" type="text" placeholder="��ѡ��" autocomplete="off" class="layui-input" readonly="readonly">
						    </div>
					    </div>
 					</div>
				</div>
			</div>
			<!---------------------------------------------------------��ͥ��Ϣ -------------------------------------------------->
			<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
				<div class="layui-colla-item">	
  					<h2 class="layui-colla-title">ǩ����Ϣ</h2>
  					<div class="layui-colla-content layui-show">
  						<div class="layui-form-item">
						    <label class="layui-form-label" style="color:red;" >ǩ��״̬</label>
						    <div class="layui-input-inline" style="border:1px solid #D2D2D2;height:36px;line-height: 36px;">
						    	<input type="radio" name="state" value="1" checked="checked"/><span style="color:green;">��ǩ��</span>
				      			<input type="radio" name="state" value="0"/><span style="color:red;">δǩ��</span>
						    </div>
					    </div>
						<div class="layui-upload" id="upImgBut">
						    <c:if test="${not empty entity.wjlj}">
						    	<img class="layui-upload-img" id="upImg" style="height:200px;" src="${entity.remark10 }">
						    </c:if>
						    <c:if test="${empty entity.wjlj}">
						    	<img class="layui-upload-img" id="upImg" style="height:200px;" src="images/service/headimage.jpg">
						    </c:if>
						    <p id="demoText"></p>
						  	<span style="color: blue;">���ϴ�����������ǩ��ͼƬ</span>
						</div> 
 					</div>
				</div>
			</div>
		</div>
		<input type="hidden" id="isuploding" name="isuploding" lay-verify="isuploding" value="0"/>
    	<input type="hidden" id="wjlj" name="wjlj" lay-verify="wjlj" value="${entity.wjlj}"/> <!-- ͼƬ·�� -->
    	<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" lay-submit="submit" lay-filter="submit"><i class="layui-icon">&#x1005;</i>�����ύ</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>�ر�</button>
	     	</div>
	  	</div>
    </form>
<script src="layui/layui.all.js" charset="utf-8"></script>
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
    function close_windos(){WeixinJSBridge.call('closeWindow')}
    layui.use(['form', 'layedit', 'laydate','upload'], function(){
		var form = layui.form,
		layer = layui.layer,
		layedit = layui.layedit,
		laydate = layui.laydate,
		upload = layui.upload;
		laydate.render({elem: '#zttime',theme: 'molv',type:'date'});
		//�Զ�����֤����
		form.verify({
			teacherName: function(value){if(value==""||value==null){return '��ʦ��������Ϊ�գ�'}},
			zttime: function(value){if(value==""||value==null){return '��ѡ�����ڣ�'}},
			isuploding: function(value){if(value=="1"){return 'ͼƬ�����ϴ������Ժ�'}},
		});
		form.on('submit(submit)', function(data){
			var state = $("input[name='state']:checked").val();
			if(state==0){
				layer.msg("����������ǩ�������д",{icon:'2'});
				return;
			}
			var openid = $("#openid").val();
			var clientsxh = $("#clientsxh").val();
			var deptid = $("#deptid").val();
			var lxxh = $("#lxxh").val();
	        var Info = JSON.stringify(data.field);
	        document.getElementById('up_div').style.display ='block';
	        var opinion = $("#opinion").val();
	        var url = "";
	        if(opinion==0){
	        	url = "Jxteacherman.do?method=insertJxTeachingManuals";
	        }else{
	        	url = "Jxteacherman.do?method=updateJxTeachingManuals";	        	
	        }
            $.post(url,{Info:encodeURI(Info),openid:openid,clientsxh:clientsxh},function (data, status) {
                if( status=="success" ){
                    var json = eval(data);
                    switch (json.errorMsg) {
                        case "success":		//�ɹ�
                        	document.getElementById('up_div').style.display ='none';
                        	layer.msg("�ύ�ɹ���",{icon:'1'},function(){
	                        	var spath = url+"&openid="+openid+"&clientsxh="+clientsxh+"&pertype=5";
	                        	window.location.href="Jxteacherman.do?method=toAddTeachingmanuals&openid="+openid+"&clientsxh="+clientsxh+"&deptid="+deptid+"&lxxh="+lxxh;
                        	});
                        	return;
                        case "failed":		//ʧ��
                      	  	  layer.alert("�ύʧ��", {title: '��ʾ��Ϣ'});
                      	  	  document.getElementById('up_div').style.display ='none';
                              break;
                        case "error":		//�������쳣
                              layer.alert("�������쳣���Ժ����ԣ�", {title: '����'});
                              document.getElementById('up_div').style.display ='none';
                              break;
                    }
                }else{
                    layer.alert("����ʧ�ܣ�", {title: '����'});
                    document.getElementById('up_div').style.display ='none';
                }
          },"json");
		});
		  
		  //��ͨͼƬ�ϴ�
		  var ggindex;
		  var uploadInst = upload.render({
		      elem: '#upImgBut',
		      url: 'jxStudents.do?method=uploadImg',
		      before: function(obj){
		     	  //Ԥ�������ļ�ʾ������֧��ie8
		      	  obj.preview(function(index, file, result){
		        	  $('#upImg').attr('src', result); //ͼƬ���ӣ�base64��
		      	  });
		      	  $("#isuploding").val("1");  //�����ϴ�ͼƬ
		       	  ggindex = layer.open({
		        	  type: 1,
		        	  offset: '100px',
		        	  title: false,
		        	  closeBtn: false,
		        	  area: '300px;',
		        	  shade: 0.8,
		        	  id: 'LAY_layuipro',
		        	  moveType: 1,
		        	  content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">ͼƬ�����ϴ������Ժ󡣡���</div>',
		        	  success: function(layero){}
		          });
		       },
		       done: function(res){
			       //����ϴ�ʧ��
			       if(res.code > 0){
			        	return layer.msg('�ϴ�ʧ��');
			       }
			       //�ϴ��ɹ�
			       $("#wjlj").val(res.realPath);  //��ͼƬ·���������ŵ���������
			       $("#isuploding").val("0");  //ͼƬ�ϴ����
			       layer.close(ggindex);
		    	},
		    	error: function(){
			        //��ʾʧ��״̬����ʵ���ش�
			        var demoText = $('#demoText');
			        demoText.html('<span style="color: #FF5722;">�ϴ�ʧ��</span> <a class="layui-btn layui-btn-xs demo-reload">����</a>');
			        demoText.find('.demo-reload').on('click', function(){
			        	uploadInst.upload();
			      	});
		    	}
		  });
		  form.render();
		});
    
    
    	/* =======================================��ȡ��Ա��Ϣ========================================= */
    	var layer_query_index ; 
    	function getemp(){
    		layer_query_index = layer.open({
    			type: 2,
    			skin: 'demo-class',
    			area: [(width-50)+'px', (height-100)+'px'],
    			title: "��Ա��Ϣ",
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
    		$("#teacherId").val(data.usernumber);
    		$("#teacherName").val(data.username);
    	}
</script>
</body>
</html>
