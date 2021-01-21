<%@ page language="java" contentType="text/html"  pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>进度登记页面</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/common.css">
    <link rel="stylesheet" href="css/demos.css">
    <script src="js/jquery.1.7.2.min.js"></script>
    <script src="js/jquery-weui.js"></script>
	<script src="js/umgo-picker.js"></script>
	<style type="text/css">
		.textarea{
		 	width: 96%;
		 	border-radius:5px;
		 	background-color: #F0EFF5;
		 	font-size: 16px;
		 	padding:5px;
		 	border: 1px solid #cccccc;
		 }
	</style>
</head>
<body ontouchstart>
	<form method="get" id="from1">
	<input type="hidden" id="proname" name="proname" value="${proentity.proname }"/>
	<input type="hidden" id="prosequence" name="prosequence" value="${proentity.prosequence }"/>
	<input type="hidden" id="tasknum" name="tasknum" value="${planentity.xh }"/>
	<input type="hidden" id="taskname" name="taskname" value="${planentity.taskgoal }"/>
	<input name="proproion" type="hidden" id="proproion" value="${planentity.proportion }"/>
	<div class="weui_tab">
    <!-- 内容 -->
    	<div class="weui_tab_bd">
	        <!-- 标题 -->
	        <header class='demos-header' style="text-align: center;color: ">
	            <h1 class="demos-title">进度登记</h1>
	        </header>
	        <!-- 内容展现 -->
	        <div class="weui_cells weui_cells_form">
	             <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">完成进度：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <input style="width: 59%;" class="weui_input" id="subproportion" name="subproportion" placeholder="请输入进度" type="text" value="">
	                    <div style="width: 40%;float: right;">%</div>
	                </div>
	            </div>
	            <div class="weui_cell">
	                <div class="weui_cell_hd"><label for="home-city" class="weui_label">登记描述：</label></div>
	                <div class="weui_cell_bd weui_cell_primary">
	                    <textarea  class="textarea" rows="4" id="progressdesc" name="progressdesc">
                 		</textarea>
	                </div>
	            </div>
	        </div>
	        <div class='demos-content-padded'>
	            <a name="bindingBtn" href="javascript:;" class="weui_btn weui_btn_primary">保存</a>
	        </div>
    	</div>
	</div>
</form>
<script>
    $(document).ready(function () {
        /**
         * 点击绑定按钮
         */
        $("a[name='bindingBtn']").click(function () {
            var prosequence = $("#prosequence").val();
			var proname = $("#proname").val();
			var tasknum = $("#tasknum").val();
			var taskname = $("#taskname").val();
			var subproportion = $("#subproportion").val();
			var progressdesc = $("#progressdesc").val();
			var regdate = $("#regdate").val();
			var regperid = $("#regperid").val();
			var regpername = $("#regpername").val();
			var proproion = $("#proproion").val();
			if(subproportion==null||subproportion==""){
				$.messager.alert("提示","请填写本次完成进度！");
				return false;
			}
			if(progressdesc==null||progressdesc==""){
				$.messager.alert("提示","请填写任务描述！");
				return false;
			}
			if(subproportion>100){
				$.messager.alert("提示","百分比不可大于100！");
				return false;
			}
			var YJsubproportion = $("#YJsubproportion").html();
			var registers = {};
			registers['proname']=proname;
			registers['taskname']=taskname;
			registers['progressdesc']=progressdesc;
			registers['prosequence']=prosequence;
			registers['tasknum']=tasknum;
			registers['subproportion']=subproportion;
			registers['proproion']=proproion;
			var register = JSON.stringify(registers);
			var url = "kyProjectPlan.do?method=insertKyProjectGress";
	        $.post(url,{register:encodeURI(register)},function (data, status) {
	            if( status=="success" ){
	                var json = eval(data);
	                switch (json.errorMsg) {
		                case "exceedproproion":		//成功
		                	$.alert( "本次登记超过100%,请重新登记！","提示信息");
		                    break;
	                    case "success":		//成功
	                    	$.alert("登记成功！","提示信息", "info", function () {
	                    		location.reload();
	                        });
	                        break;
	                    case "failed":		//失败
	                    	$.alert( "登记失败！","提示信息");
	                        break;
	                    case "error":		//服务器异常
	                        $.alert( "服务器异常，稍后再试！","警告");
	                        break;
	                }
	            }else{
	            	$.alert("操作失败！","提示信息");
	            }
	        },"json");
        });
    });
</script>
</body>
</html>
