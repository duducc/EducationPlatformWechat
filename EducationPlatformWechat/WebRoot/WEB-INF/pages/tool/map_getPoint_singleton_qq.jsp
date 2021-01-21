<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>地图</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no">
    <meta name="description" content="Write an awesome description for your new site here. You can edit this line in _config.yml. It will appear in your document head meta (for Google search results) and in your feed.xml site description.">
    <link rel="stylesheet" href="css/weui.css">
    <link rel="stylesheet" href="css/jquery-weui.css">
    <link rel="stylesheet" href="css/demos.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/example.css">  
    <script src="js/jquery.1.7.2.min.js"></script>
</head>
<body ontouchstart>
<iframe id="mapPage" width="100%" height="100%" frameborder=0 
    src="http://apis.map.qq.com/tools/locpicker?search=1&type=1&key=OB4BZ-D4W3U-B7VVO-4PJWW-6TKDJ-WPB77&referer=myapp">
</iframe> 

<!--js类库-->
<script src="js/jquery-weui.js"></script>
<script src="js/umgo-picker.js"></script>
<script>
	window.addEventListener('message', function(event) {
	    // 接收位置信息，用户选择确认位置点后选点组件会触发该事件，回传用户的位置信息
	    var loc = event.data;
	    if (loc && loc.module == 'locationPicker') {console.log('location', loc)}       
	    var jd = loc.latlng.lat;
	    var wd = loc.latlng.lng;
	    var local = loc.poiaddress 
	    window.opener.document.getElementById('jd').value = jd; // 赋值
		window.opener.document.getElementById('wd').value = wd; // 赋值
		window.opener.document.getElementById('location').value = local;
	}, false); 
</script>
</body>
</html>
