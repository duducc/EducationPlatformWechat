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
    
    <title>问卷星</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="js/jquery.1.7.2.min.js"></script>
    <link rel="stylesheet" href="layui/css/layui.css"  media="all">
    <link rel="stylesheet" type="text/css" href="layuis/css/common_main.css"/>
    <link rel="stylesheet" type="text/css" href="css/loading.css"/>
    <script src="layui/layui.js"  charset="gbk"></script>
    <script type="text/javascript" src="layui/pinyin.js"></script>
    <script type="text/javascript" src="layui/initials.js"></script>
  	<style type="text/css">
  		.weui_tab{
			 position:absolute; z-index:1;
		}
		.bestupdiv{
			width: 95%;
		}
		.oneupdiv{
			width: 100%;
			min-height: 40px;
			line-height: 40px;
			padding: 0px 20px 0px 20px;
			border: 1px solid #E6E6E6;
			background-color: #FBFBFB;
			margin-top: 5px;
		}
		.onedowndiv{
			width: 100%;
			height: 100px;
			padding: 10px 20px 10px 20px;
			border: 1px solid #E6E6E6;
			border-top: 0px;
		}
  </style>
</head>
<body>
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
   	<form class="layui-form layui-form-pane" action=""  id="baseform" method="post">
   		<!---------------------------------公共信息------------------------------------>
   		<input type="hidden" id="openId" name="openId" value="${openId}"/>
   		<input type="hidden" id="clientsxh" name="clientsxh" value="${clientsxh}"/>
   		<input type="hidden" id="studentid" name="studentid" value="${studentid}"/>
   		<input type="hidden" id="studentname" name="studentname" value="${studentname}"/>
   		<input type="hidden" id="courseid" name="courseid" value="${courseid}"/>
   		<input type="hidden" id="coursename" name="coursename" value="${coursename}"/>
   		<input type="hidden" id="arrangexh" name="arrangexh" value="${arrangexh}"/>
   		<input type="hidden" id="jshnr" name="jshnr" value="${jshnr}"/>
   		<input type="hidden" id="rkjshid" name="rkjshid" value="${rkjshid}"/>
   		<input type="hidden" id="rkjshname" name="rkjshname" value="${rkjshname}"/>
   		<input type="hidden" id="wjlb" name="wjlb" value="${wjlb }"/>
   		<input type="hidden" id="xh" name="xh" value="${xh}"/>
   		<!---------------------------------公共信息------------------------------------>
   		<input type="hidden" id="listsize" name="listsize" value="${listsize }"/>
      	<div style="overflow-y:auto;height: 92%;background-color: #fff;" id="mainCount_div">
        	<div style="width:96%; margin-left:2%; padding-top:10px;">
				<!-- ---------------------------------------内容 ---------------------------------------------- -->
				<div class="layui-collapse" style="margin-top: 10px;" lay-accordion="">
					<div class="layui-colla-item">	
	  					<h2 class="layui-colla-title">课程信息</h2>
	  					<div class="layui-colla-content layui-show">
							<div class="layui-form-item" style="margin-top: 10px;">
							    <label class="layui-form-label" style="color:red;">学生姓名</label>
							    <div class="layui-input-inline">
							    	<input class="layui-input" type="text" value="${studentname}" disabled="disabled"/>
							    </div>
						    </div>
						    <div class="layui-form-item" style="margin-top: 10px;">
							    <label class="layui-form-label" style="color:red;" >授课教师</label>
							    <div class="layui-input-inline">
							      	<input class="layui-input" type="text" value="${rkjshname}" disabled="disabled"/>
							    </div>
						    </div>
						    <div class="layui-form-item" style="margin-top: 10px;">
							    <label class="layui-form-label" style="color:red;" >课程名称</label>
							    <div class="layui-input-inline">
							      	<input class="layui-input" type="text" value="${coursename}" disabled="disabled"/>
							    </div>
						    </div>
						    <div class="layui-form-item" style="margin-top: 10px;">
							    <label class="layui-form-label" style="color:red;" >上课时间</label>
							    <div class="layui-input-inline">
							      	<input class="layui-input" type="text" value="${skdarte}" disabled="disabled"/>
							    </div>
						    </div>
	 					</div>
					</div>
				</div>
				<c:forEach items="${erreylist }" var="erreylist">
					<div class="bestupdiv">
						<div class="oneupdiv">
							${erreylist.totalProgress }：${erreylist.test.wt }
						</div>
						<div class="onedowndiv">
							<c:forEach items="${erreylist.qrList }" var="qrlist" varStatus="xh">
								<c:if test="${xh.index==0 }">
									<input type="radio" name="${wjlb }${erreylist.test.sxh }" value="${erreylist.test.questionid }/${qrlist.xh}/${qrlist.fsh}/${erreylist.test.sxh }" title="${qrlist.wt }" checked="">
								</c:if>
								<c:if test="${xh.index!=0 }">
									<input type="radio" name="${wjlb }${erreylist.test.sxh }" value="${erreylist.test.questionid }/${qrlist.xh}/${qrlist.fsh}/${erreylist.test.sxh }" title="${qrlist.wt }">
								</c:if>
							</c:forEach>
						</div>
					</div>
				</c:forEach>
	    	</div>
		</div>
		<!---------------------------------------------------------- 底部菜单-------------------------------------------------------->
		<div class="weui_tabbar" style="border-top:1px solid #cccccc; height: 50px;margin-bottom: -5px;">
	    	<div style="margin-top: 5px;width: 100%;text-align: center;">
		     	<button name="bindingBtn" type="button" class="layui-btn" onclick="saveTest();"><i class="layui-icon">&#x1005;</i>立即提交</button>
		     	<button name="closeBtn" type="button" class="layui-btn layui-btn-primary" onclick="close_windos();"><i class="layui-icon">&#x1007;</i>关闭</button>
	     	</div>
	  	</div>
		<!---------------------------------------------------底部菜单 ----------------------------------------------------- -->
	</form>

</body>
<script type="text/javascript">
	var height= $("body").height();
	var width= $("body").width();
	document.getElementById("mainCount_div").style.height=height-49;
	layui.use(['form', 'layedit', 'laydate','element'], function(){
		  var $ = layui.jquery,element = layui.element;
		  var form = layui.form,
		  layer = layui.layer,
		  layedit = layui.layedit,
		  laydate = layui.laydate;
		  form.render();
	});
	var m_queryList = new Array();
	function saveTest(){
		document.getElementById('up_div').style.display ='block';
		var openId = $("#openId").val();
		var clientsxh = $("#clientsxh").val();
		var xh = $("#xh").val();
   		var studentid = $("#studentid").val();
   		var studentname = $("#studentname").val();
   		var courseid = $("#courseid").val();
   		var coursename = $("#coursename").val();
   		var arrangexh = $("#arrangexh").val();
   		var jshnr = $("#jshnr").val();
   		var rkjshid = $("#rkjshid").val();
   		var rkjshname = $("#rkjshname").val();
   		var sfdt = $("#sfdt").val();
		var wjlb = $("#wjlb").val();
		var listsize = $("#listsize").val();
		for(var i=1;i<=(listsize*1);i++){
			var value = $('input[name="'+wjlb+i+'"]:checked').val();
			var m_query = {};
			m_query['studentid'] = studentid; 
			m_query['studentname'] = studentname; 
			m_query['courseid'] = courseid; 
			m_query['coursename'] = coursename; 
			
			m_query['arrangexh'] = arrangexh; 
			m_query['jshnr'] = jshnr; 
			m_query['rkjshid'] = rkjshid; 
			m_query['rkjshname'] = rkjshname;
			
			m_query['wjlb'] = wjlb; 
			m_query['questionid'] = value.split("/")[0];
			m_query['wtda'] = value.split("/")[1];
			m_query['dyfsh'] = value.split("/")[2];
			m_query['sfdt'] = value.split("/")[3]; 
       		m_queryList.push(m_query);
        }
		
		var questInfo = JSON.stringify(m_queryList) ;
		var url = "jxQuestionnaireAnswer.do?method=insertJxQuestionnaireAnswer";
        $.post(url,{questInfo:encodeURI(questInfo),xh:xh},function (data, status){	            	 
            if( status=="success" ){
            var json = eval(data);
                switch (json.cueMessage){
                    case "success":		//成功
                  	    layer.msg("提交成功",{icon:'1'});
                  	    document.getElementById('up_div').style.display ='none';
                  	    var url = "jxStudyregistra.do?method=toMyTaskInfotickling";
                  	  	var spath = url+"&openid="+openId+"&clientsxh="+clientsxh;
              			window.open(spath,"toTraineeRegist");
                        break;
                    case "failed":		//失败
                  	    layer.msg("提交失败",{icon:'2'});
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
	}
</script>
</html>
