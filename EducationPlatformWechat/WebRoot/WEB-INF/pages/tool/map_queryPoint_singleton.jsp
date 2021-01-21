<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>地图</title>
    <meta http-equiv="X-UA-Compatible"content="IE=9; IE=8; IE=7; IE=EDGE">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	
	<link href="sysManager/css/admin.css" rel="stylesheet" type="text/css" />
	
	<link rel="stylesheet" href="jquery/ea-ui/themes/default/easyui.css" type="text/css"></link>
	<link href="jquery/ea-ui/themes/icon.css" type="text/css" rel="stylesheet" />
	
	<link rel="stylesheet" href="css/saveORUpdateORdelBtn.css"type="text/css"></link>	
	
	<style type="text/css">
			body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"微软雅黑";}
	</style>
	
	<script type="text/javascript" src="jquery/jquery-1.7.2.min.js"> </script>
	<script type="text/javascript" src="jquery/ea-ui/easyloader.js"> </script>
	<script type="text/javascript" src="jquery/ea-ui/jquery.easyui.min.js"> </script>
	<script type="text/javascript" src="jquery/ea-ui/locale/easyui-lang-zh_CN.js"> </script>
	<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=fYqilD8XhjuoIOnpiRDK5zgG"></script>

	<!--加载鼠标绘制工具-->
	<script type="text/javascript" src="http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.js"></script>
	<link rel="stylesheet" href="http://api.map.baidu.com/library/DrawingManager/1.4/src/DrawingManager_min.css" />

	<script type="text/javascript">
		
	</script>
  </head>
  
  <body>
   
  <input type="hidden" id="winInfo" value='${winInfo }'>
       <div id="allmap" style="width: 100%;height: 90%"></div>
       <div id="btn_ContByEdit"> 
		  <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:false,iconCls:'icon-cancel'" onClick="javascript: window.close();">关闭</a> 
      </div>
  </body>
</html>
 <script type="text/javascript">
	// 百度地图API功能
	
	
	
	var top_left_control = new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT});// 左上角，添加比例尺
	var top_left_navigation = new BMap.NavigationControl();  //左上角，添加默认缩放平移控件
	
	var map = new BMap.Map("allmap");  // 创建Map实例
	map.addControl(new BMap.MapTypeControl());   //添加地图类型控件
	map.enableScrollWheelZoom(true);     //鼠标滚轮缩放
	map.addControl(top_left_control);        
	map.addControl(top_left_navigation); 
	
	var jd="${jd}";
	var wd="${wd}";
	var thisPoint="${thisBean}";
	map.centerAndZoom(new BMap.Point(jd,wd), 7);
	
	
	
	
	var myIcon = new BMap.Icon("http://api.map.baidu.com/img/markers.png", new BMap.Size(23, 25), {  
        offset: new BMap.Size(10, 25), // 指定定位位置  
        imageOffset: new BMap.Size(0, 0 - 10 * 25) // 设置图片偏移  
    });  
	
	
	var marker = new BMap.Marker(new BMap.Point(jd,wd),{icon:myIcon});  // 创建标注
	map.addOverlay(marker); 

	var thisinfoWindow = new BMap.InfoWindow(thisPoint, opts);  // 创建信息窗口对象
	marker.addEventListener("click", function(){          
		map.openInfoWindow(thisinfoWindow,new BMap.Point(jd,wd)); //开启信息窗口
	});
	var opts_2 = {
			  position : new BMap.Point(jd,wd),    // 指定文本标注所在的地理位置
			  offset   : new BMap.Size(30, -30)    //设置文本偏移量
			}
	var thisBeanTitle="${thisBeanTitle}";
			var label = new BMap.Label(thisBeanTitle, opts_2);  // 创建文本标注对象
			label.setStyle({
				 color : "red",
				 fontSize : "12px",
				 height : "20px",
				 lineHeight : "20px",
				 fontFamily:"微软雅黑"
			 });
			map.addOverlay(label);   
	
//
	var opts = {
			width : 250,     // 信息窗口宽度
			height: 120,     // 信息窗口高度
			title : "服务区（站）信息" , // 信息窗口标题
			enableMessage:true//设置允许信息窗发送短息
		   };
var data_info=$("#winInfo").val();
data_info=eval(data_info);

for(var i=0;i<data_info.length;i++){
	
	var marker = new BMap.Marker(new BMap.Point(data_info[i][0],data_info[i][1]));  // 创建标注
	var content = data_info[i][2];
	map.addOverlay(marker);               // 将标注添加到地图中
	marker.addEventListener("click",openInfo.bind(null,content));
	//
	var opts_1 = {
	  position : new BMap.Point(data_info[i][0],data_info[i][1]),    // 指定文本标注所在的地理位置
	  offset   : new BMap.Size(30, -30)    //设置文本偏移量
	}
	var label = new BMap.Label(data_info[i][3], opts_1);  // 创建文本标注对象
	label.setStyle({
		 color : "black",
		 fontSize : "12px",
		 height : "20px",
		 lineHeight : "20px",
		 fontFamily:"微软雅黑"
	 });
	map.addOverlay(label);   
}
function openInfo(content,e){
	var p = e.target;
	var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat);
	var infoWindow = new BMap.InfoWindow(content,opts);  // 创建信息窗口对象 
	map.openInfoWindow(infoWindow,point); //开启信息窗口
}
	
	

 </script>