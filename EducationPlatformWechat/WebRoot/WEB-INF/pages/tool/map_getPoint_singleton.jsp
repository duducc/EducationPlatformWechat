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

  </head>
  
  <body class="easyui-layout">
       <div id="allmap" style="width: 100%;height: 80%"></div>
       
       <div id="r-result">条件检索:<input type="text" id="suggestId" size="20" value="百度" style="width:350px;" /></div>
	   <div id="searchResultPanel" style="border:1px solid #C0C0C0;width:150px;height:auto; display:none;"></div>
       
       <div id="btn_ContByEdit"> 
          <a href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:false,iconCls:'icon-ok'" onClick="getAttr();">确定</a> 
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
	map.centerAndZoom("西宁",20);      // 初始化地图,用城市名设置地图中心点
	
    var jd="${jd}";
    var wd="${wd}";
	
	
	var marker;
	
	if(jd!=null){
		 marker = new BMap.Marker(new BMap.Point(jd, wd)); // 创建点
			map.addOverlay(marker);    //增加点
			marker.setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画
	}
	
	//单击获取点击的经纬度
	map.addEventListener("click",function(e){
		//alert(e.point.lng + "," + e.point.lat);
		map.clearOverlays();
	    marker = new BMap.Marker(new BMap.Point(e.point.lng, e.point.lat)); // 创建点
		map.addOverlay(marker);    //增加点
		//marker.setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画
	});
	
	//获得覆盖物
    function getAttr(){
		var p = marker.getPosition();       //获取marker的位置
		//alert("marker的位置是" + p.lng + "," + p.lat);   
		 window.opener.document.getElementById('jd').value = p.lng; // 赋值
		 window.opener.document.getElementById('wd').value = p.lat; // 赋值
         window.close(); // 关闭窗口
	}
	
    var ac = new BMap.Autocomplete(    //建立一个自动完成的对象
    		{"input" : "suggestId"
    		,"location" : map
    	});

    	ac.addEventListener("onhighlight", function(e) {  //鼠标放在下拉列表上的事件
    	var str = "";
    		var _value = e.fromitem.value;
    		var value = "";
    		if (e.fromitem.index > -1) {
    			value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    		}    
    		str = "FromItem<br />index = " + e.fromitem.index + "<br />value = " + value;
    		
    		value = "";
    		if (e.toitem.index > -1) {
    			_value = e.toitem.value;
    			value = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    		}    
    		str += "<br />ToItem<br />index = " + e.toitem.index + "<br />value = " + value;
    		G("searchResultPanel").innerHTML = str;
    	});

    	var myValue;
    	ac.addEventListener("onconfirm", function(e) {    //鼠标点击下拉列表后的事件
    	var _value = e.item.value;
    		myValue = _value.province +  _value.city +  _value.district +  _value.street +  _value.business;
    		G("searchResultPanel").innerHTML ="onconfirm<br />index = " + e.item.index + "<br />myValue = " + myValue;
    		
    		setPlace();
    	});

    	function setPlace(){
    		map.clearOverlays();    //清除地图上所有覆盖物
    		function myFun(){
    			var pp = local.getResults().getPoi(0).point;    //获取第一个智能搜索的结果
    			map.centerAndZoom(pp, 18);
    			map.addOverlay(new BMap.Marker(pp));    //添加标注
    		}
    		var local = new BMap.LocalSearch(map, { //智能搜索
    		  onSearchComplete: myFun
    		});
    		local.search(myValue);
    	}
    	
    	function G(id) {
    		return document.getElementById(id);
    	}


 </script>