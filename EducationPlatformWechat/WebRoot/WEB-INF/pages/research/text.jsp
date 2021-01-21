<!doctype html>
<html lang="zh-cn">
<head>
    <meta name="viewport" content="initial-scale=1, user-scalable=0, minimal-ui" charset="UTF-8">
    <title>加载顶部、底部</title>
    <style>
    *{
        margin: 0;
        padding:0;
        -webkit-tap-highlight-color:rgba(0,0,0,0);
        -webkit-text-size-adjust:none;
    }
    html{
        font-size:10px;
    }
    body{
        background-color: #f5f5f5;
        font-size: 1.2em;
    }
    .header{
        height: 44px;
        line-height: 44px;
        border-bottom: 1px solid #ccc;
        background-color: #eee;
    }
    .header h1{
        text-align: center;
        font-size: 2rem;
        font-weight: normal;
    }
    .content{
        padding-bottom: 40px;
        background-color: #fff;
    }
    .content .item{
        display: -webkit-box;
        display: -webkit-flex;
        display: -ms-flexbox;
        display: flex;
        -ms-flex-align:center;
        -webkit-box-align:center;
        box-align:center;
        -webkit-align-items:center;
        align-items:center;
        padding:3.125%;
        border-bottom: 1px solid #ddd;
        color: #333;
        text-decoration: none;
    }
    .content .item img{
        display: block;
        width: 40px;
        height: 40px;
        border:1px solid #ddd;
    }
    .content .item h3{
        display: block;
        -webkit-box-flex: 1;
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
        width: 100%;
        max-height: 40px;
        overflow: hidden;
        line-height: 20px;
        margin: 0 10px;
        font-size: 1.2rem;
    }
    .content .item .date{
        display: block;
        height: 20px;
        line-height: 20px;
        color: #999;
    }
    .opacity{
        -webkit-animation: opacity 0.3s linear;
        animation: opacity 0.3s linear;
    }
    @-webkit-keyframes opacity {
        0% {
            opacity:0;
        }
        100% {
            opacity:1;
        }
    }
    @keyframes opacity {
        0% {
            opacity:0;
        }
        100% {
            opacity:1;
        }
    }
    .footer{
        position: fixed;
        left: 0;
        bottom: 0;
        display: -webkit-box;
        display: -webkit-flex;
        display: -ms-flexbox;
        display: flex;
        width: 100%;
        height: 40px;
    }
    .footer a{
        position: relative;
        display: block;
        -webkit-box-flex: 1;
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
        line-height: 40px;
        text-align: center;
        color: #666;
        background-color: #eee;
        text-decoration: none;
    }
    .footer a:before{
        content: '';
        position: absolute;
        left: 0;
        top: 10px;
        width: 1px;
        height: 20px;
        background-color: #ccc;
    }
    .footer a:first-child:before{
        display: none;
    }
    </style>
    <link rel="stylesheet" href="css/dropload.css">
</head>
<body>
<div class="header">
    <h1>就当我是新闻页吧</h1>
</div>
<div class="content">
    <div class="lists">
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>1文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>2文字描述文字描述文字描述文字描述文字描述文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>3文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>4文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>5文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>6文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>7文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>8文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>9文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>10文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>11文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
        <a class="item" href="#">
            <img src="http://d6.yihaodianimg.com/N02/M0B/81/5A/CgQCsVMhX_mAAvXsAAJDE3K2zh485900_80x80.jpg" alt="">
            <h3>12文字描述文字描述文字描述文字描述文字描述</h3>
            <span class="date">2014-14-14</span>
        </a>
    </div>
</div>
<div class="footer">
    <a href="#1" class="item">测试菜单</a>
    <a href="#2" class="item">只做展示</a>
    <a href="#3" class="item">无功能</a>
    <a href="#4" class="item">不用点</a>
</div>
<!-- jQuery1.7以上 或者 Zepto 二选一，不要同时都引用 -->
<script src="js/jquery-1.9.1.js"></script>
<script src="js/dropload.min.js"></script>
<script type="text/javascript">
$(function(){
    var counter = 0;
    // 每页展示4个
    var num = 4;
    var pageStart = 0,pageEnd = 0;

    // dropload
    $('.content').dropload({
        scrollArea : window,
        domUp : {
            domClass   : 'dropload-up',
            domRefresh : '<div class="dropload-refresh">↓下拉刷新-自定义内容</div>',
            domUpdate  : '<div class="dropload-update">↑释放更新-自定义内容</div>',
            domLoad    : '<div class="dropload-load"><span class="loading"></span>加载中-自定义内容...</div>'
        },
        domDown : {
            domClass   : 'dropload-down',
            domRefresh : '<div class="dropload-refresh">↑上拉加载更多-自定义内容</div>',
            domLoad    : '<div class="dropload-load"><span class="loading"></span>加载中-自定义内容...</div>',
            domNoData  : '<div class="dropload-noData">暂无数据-自定义内容</div>'
        },
        loadUpFn : function(me){
            $.ajax({
                type: 'GET',
                url: 'login.do?method=toProject',
                dataType: 'json',
                success: function(data){
                    var result = '';
                    for(var i = 0; i < data.list.length; i++){
                        result +=   '<a class="item opacity" href="'+data.list[i].link+'">'
                                        +'<h3>'+data.list[i].proname+'</h3>'
                                        +'<span class="date">'+data.list[i].prograde+'</span>'
                                    +'</a>';
                    }
                    // 为了测试，延迟1秒加载
                    setTimeout(function(){
                        $('.lists').html(result);
                        // 每次数据加载完，必须重置
                        me.resetload();
                        // 重置索引值，重新拼接more.json数据
                        counter = 0;
                        // 解锁
                        me.unlock();
                        me.noData(false);
                    },1000);
                },
                error: function(xhr, type){
                    alert('Ajax error!');
                    // 即使加载出错，也得重置
                    me.resetload();
                }
            });
        },
        loadDownFn : function(me){
            $.ajax({
                type: 'GET',
                url: 'json/more.json',
                dataType: 'json',
                success: function(data){
                    var result = '';
                    counter++;
                    pageEnd = num * counter;
                    pageStart = pageEnd - num;

                    for(var i = pageStart; i < pageEnd; i++){
                        result +=   '<a class="item opacity" href="'+data.lists[i].link+'">'
                                        +'<img src="'+data.lists[i].pic+'" alt="">'
                                        +'<h3>'+data.lists[i].title+'</h3>'
                                        +'<span class="date">'+data.lists[i].date+'</span>'
                                    +'</a>';
                        if((i + 1) >= data.lists.length){
                            // 锁定
                            me.lock();
                            // 无数据
                            me.noData();
                            break;
                        }
                    }
                    // 为了测试，延迟1秒加载
                    setTimeout(function(){
                        $('.lists').append(result);
                        // 每次数据加载完，必须重置
                        me.resetload();
                    },1000);
                },
                error: function(xhr, type){
                    alert('Ajax error!');
                    // 即使加载出错，也得重置
                    me.resetload();
                }
            });
        },
        threshold : 50
    });
});
</script>
</body>
</html>