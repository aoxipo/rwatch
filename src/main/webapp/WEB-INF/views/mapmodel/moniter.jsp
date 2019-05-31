 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath(); //web项目的根路径
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>R-Watch智能手环</title>


    <link rel="stylesheet" href="<%=basePath%>static/layui2.4.5/css/layui.css">
    <link rel="stylesheet" href="<%=basePath%>static/font-awesome/css/font-awesome.min.css">
    <!--地图插件-->
    <script src="<%=basePath%>static/jquery/jquery.min.js"></script>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.0.3/dist/leaflet.css" />
    <script src="https://unpkg.com/leaflet@1.0.3/dist/leaflet.js"></script>
    <script src="https://cdn.bootcss.com/proj4js/2.4.3/proj4.js"></script>
    <script src="https://cdn.bootcss.com/proj4leaflet/1.0.1/proj4leaflet.min.js"></script>
    <script type="text/javascript" src='<%=basePath%>static/leaflet/leaflet.ChineseTmsProviders.js'></script>
    <link rel="stylesheet" href="<%=basePath%>static/mouseRightMenu/mouseRightMenu.css" />
    <script src="<%=basePath%>static/leaflet-tileLayer-baidu-master/src/tileLayer.baidu.js"></script>


    <style type="text/css">
        /*.content>li>ul>li>a:after{*/
        /*    float: right;*/
        /*    display: block;*/
        /*    padding-right: 25px;*/
        /*}*/
        <%--.content>li>ul>li>a:after {--%>
        <%--    content: "\e65f";--%>
        <%--    display: block;--%>
        <%--    height: 40px;--%>
        <%--    width: 50px;--%>
        <%--    margin-right: 9px;--%>
        <%--    float: right;--%>
        <%--    color: white;--%>
        <%--    background-size:cover;--%>
        <%--    background-image:url('<%=basePath%>static/images/more2.png');--%>
        <%--}--%>
        .layui-btn-container button{
            background-color:#5FB878;
        }
        .nav li{
            width:85px;
        }
        .moniter-tree{
            width:100%;
        }
        .moniter-tree li{
            width:100%;
        }
        .fr{
            float:right;
        }
        dd{
            cursor:pointer;
        }
        .layui-nav-child dd a i:hover{
            color:red;
        }
        .layui-tree li i{
            color: rgba(255,255,255,.7);
            display: none;
        }
        .layui-tree li a cite{
            color: rgba(255,255,255,.7);
        }
        .layui-tree li .layui-tree-spread{
            display: block;
            position: absolute;
            right: 30px;

        }
        .layui-tree li{
            line-height: 45px;
            position: relative;
            background-color: #282b33;
        }
        .layui-tree li ul{
            margin-left: 0;
        }
        .layui-tree li ul a{
            padding-left: 20px;
            background-color: #393d49;
        }
        .layui-tree li a{
            height: 45px;
            border-left: 5px solid transparent;
            box-sizing: border-box;
            width: 100%;
        }
        .layui-tree li a:hover{
            background: #4E5465;
            color: #fff;
            border-left: 5px solid #009688;
        }
        .layui-tree li a.active{
            background: #009688;
        }
    </style>
</head>
<body class="layui-layout-body">


<div class="layui-collapse">
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">监视</h2>
        <div class="layui-colla-content layui-show">
            <div class="layui-fluid">
                <div class="layui-row">
                    <div class="layui-col-md3 layui-col-sm4 ">
                        <!--设备导航-->
                        <div class="layui-tab layui-tab-card" style="margin: 0 auto;">
                            <ul class="layui-tab-title">
                                <li class="layui-this">全部</li>
                                <li>在线</li>
                                <li>离线</li>
                                <li>未启用</li>
                            </ul>
                            <div class="layui-tab-content" style="padding:0px;">
                                <div class="layui-tab-item layui-show">
                                    <div style="display: inline-block;height: 500px;width:100%;  overflow: auto;">
                                        <ul id="demo1" class="content"></ul>
                                    </div>
                                </div>
                                <div class="layui-tab-item">
                                    <ul class="layui-nav layui-nav-tree moniter-tree" lay-filter="test">
                                        <li class="layui-nav-item"><a href="">大数据</a></li>
                                    </ul>
                                </div>
                                <div class="layui-tab-item">
                                    <ul class="layui-nav layui-nav-tree moniter-tree" lay-filter="test">

                                        <li class="layui-nav-item"><a href="">产品</a></li>
                                        <li class="layui-nav-item"><a href="">大数据</a></li>
                                    </ul>
                                </div>
                                <div class="layui-tab-item">
                                    <ul class="layui-nav layui-nav-tree moniter-tree" lay-filter="test">
                                        <li class="layui-nav-item layui-nav-itemed">
                                            <a href="javascript:;">默认展开</a>
                                            <dl class="layui-nav-child">
                                                <dd><a href="javascript:;">选项1</a></dd>
                                                <dd><a href="javascript:;">选项2</a></dd>
                                                <dd><a href="">跳转</a></dd>
                                            </dl>
                                        </li>
                                        <li class="layui-nav-item">
                                            <a href="javascript:;">解决方案</a>
                                            <dl class="layui-nav-child">
                                                <dd><a href="">移动模块</a></dd>
                                                <dd><a href="">后台模版</a></dd>
                                                <dd><a href="">电商平台</a></dd>
                                            </dl>
                                        </li>
                                        <li class="layui-nav-item"><a href="">产品</a></li>
                                        <li class="layui-nav-item"><a href="">大数据</a></li></ul>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="layui-col-md9 layui-col-sm8 gaode_map" >
                        <div class="pad">
                            <!-- Map will be created here -->
                            <div id="map" class="map"  style="height: 480px;">

                            </div>
                        </div>
                    </div>
                    <div class="layui-col-md9 layui-col-sm8 baidu_map">
                        <div class="pad">
                            <!-- Map will be created here -->
                            <div id="map2" class="map"  style="height: 480px;">

                            </div>
                        </div>
                    </div>

                    <div class="layui-col-md3 layui-col-sm4 layui-btn-container" style="height: 500px;">
                        <div class=" layui-row" >
                            <button class="layui-btn btn_baidu layui-col-md3" ><img src="<%=basePath%>static/images/百度地图.png" height="38" width="38">百度地图</button>
                            <button class="layui-btn btn_gaode layui-col-md3"><img src="<%=basePath%>static/images/高德地图.png" height="38" width="38">高德地图</button>
                            <button class="layui-btn btn_full_screen layui-col-md3" style="width:130px;"><i class="layui-icon layui-icon-layer"></i> 全屏</button>
                            <button class="layui-btn btn_device_location_show layui-col-md3" ><i class="layui-icon layui-icon-user"></i>显示设备</button>

                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>











<script src="<%=basePath%>static/jquery/jquery.min.js"></script>
<script src="<%=basePath%>static/layui2.4.5/layui.js"></script>
<script>
    var listdata={"id":1,};
    //注意：折叠面板 依赖 element 模块，否则无法进行功能性操作
    var l;
    layui.config({base: '<%=basePath%>static/mouseRightMenu/'})
    layui.use(['mouseRightMenu','layer','jquery'],function(){
        var mouseRightMenu = layui.mouseRightMenu,layer = layui.layer,$=layui.jquery;
        //右键监听
        $('.content>li>ul>li>a').bind("dblclick",function(e){

            var data = listdata;
            var menu_data=[
                {'data':data,'type':1,'title':'显示当前位置'},
                {'data':data,'type':2,'title':'设置栅栏'},
                {'data':data,'type':3,'title':'删除地图上标记'},
                {'data':data,'type':4,'title':'右键操作4'},
            ]
            mouseRightMenu.open(menu_data,false,function(d){
                switch (d.type) {
                    case 1:
                        var params = [];
                        params.push({"name":d.data.name,"device_location_x":d.data.infor[0].x,"device_location_y":d.data.infor[0].y,"device_id":d.data.infor[0].device,"device_power":d.data.infor[0].power,"device_signal_state":d.data.infor[0].state,"device_state":d.data.infor[0].state,"device_time":d.data.infor[0].time,});

                        draw_marker(params[0]);
                        break;
                    case 2:
                        var params=[];
                        params.push({"ByDevice":,"ByMember":,"X":,"Y":,"Radius":,});
                        $.ajax({
                            type : "post",
                            datatype:"json",
                            url : "<%=basePath %>monitor/addfence",
                            data : params,
                            success: function(data){
                                if(data.success){
                                    alert("成功添加!");
                                }else{
                                    alert(data.msg )
                                }
                            },
                            error: function() {
                                alert("请检查网络连接");
                            }
                        });
                        break;
                    case 3:
                        day = "星期二";
                        break;
                    case 4:
                        day = "星期三";
                        break;
                }
            })
            return false;
        });


    })
    layui.use('element', function(){
        var element = layui.element;
    });
    // $(".content>li>ul>li>a").append("<i style='    float: right;\n" +
    //     "    /* background-color: red; */\n" +
    //     "    display: block;\n" +
    //     "    padding-right: 25px;'>asdasd</i>");
    var node=[ //节点
        {
            name: '常用文件夹'
            ,id: 1
            ,alias: 'changyong'
            ,children: [
                {
                    name: '所有未读（设置跳转）'
                    ,id: 11
                    ,href: 'http://www.layui.com/'
                    ,alias: 'weidu'
                }, {
                    name: '置顶邮件'
                    ,id: 12
                }, {
                    name: '标签邮件'
                    ,id: 13
                }
            ]
        },
        {
            name: '我的邮箱'
            ,id: 2
            ,spread: true
            ,children: [
                {
                    name: 'QQ邮箱'
                    ,id: 21
                    ,spread: true
                    ,children: [
                        {
                            name: '收件箱'
                            ,id: 211
                            ,children: [
                                {
                                    name: '所有未读'
                                    ,id: 2111
                                }, {
                                    name: '置顶邮件'
                                    ,id: 2112
                                }, {
                                    name: '标签邮件'
                                    ,id: 2113
                                }
                            ]
                        }, {
                            name: '已发出的邮件'
                            ,id: 212
                        }, {
                            name: '垃圾邮件'
                            ,id: 213
                        }
                    ]
                }, {
                    name: '阿里云邮'
                    ,id: 22
                    ,children: [
                        {
                            name: '收件箱'
                            ,id: 221
                        }, {
                            name: '已发出的邮件'
                            ,id: 222
                        }, {
                            name: '垃圾邮件'
                            ,id: 223
                        }
                    ]
                }
            ]
        }
        ,{
            name: '收藏夹'
            ,id: 3
            ,alias: 'changyong'
            ,children: [
                {
                    name: '爱情动作片'
                    ,id: 31
                    ,alias: 'love'
                }, {
                    name: '技术栈'
                    ,id: 12
                    ,children: [
                        {
                            name: '前端'
                            ,id: 121
                        }
                        ,{
                            name: '全端'
                            ,id: 122
                        }
                    ]
                }
            ]
        }
    ];
    var l={
        "device_manage":"admin",
        "auth":0,
        "manage_device_number":3,
        "device_location":[
            {
                "name":"lijunlin",
                "device_id":123123,
                "device_state":"good",
                "device_power":"100%",
                "device_signal_state":"good",
                "device_time":"2019/5/14/9/46",
                "device_location":{"x":31,"y":117,},
            },
            {
                "name":"lijunlin2",
                "device_id":123124,
                "device_state":"middle",
                "device_power":"50%",
                "device_signal_state":"good",
                "device_time":"2019/5/14/9/46",
                "device_location":{"x":29,"y":117,},
            },
            {
                "name":"lijunlin3",
                "device_id":123125,
                "device_state":"bad",
                "device_power":"1%",
                "device_signal_state":"bad",
                "device_time":"2019/5/14/9/46",
                "device_location":{"x":36,"y":117,},
            },
        ],
    }
    var start_initmap_location=[31.834912, 117.220102];
    var map_gaode;
    var map_baidu;
    function baidu_map_init(){

        var map2 = L.map('map2', {
            crs: L.CRS.Baidu,
            minZoom: 3,
            maxZoom: 18,
            attributionControl: false,
            center: start_initmap_location,
            zoom: 12
        });


        //控制地图底图
        L.control.layers(
            {
                "百度地图": L.tileLayer.baidu({ layer: 'vec' }).addTo(map2),
                "百度卫星": L.tileLayer.baidu({ layer: 'img' }),
                "百度地图-大字体": L.tileLayer.baidu({ layer: 'vec',bigfont:true }),
                "百度卫星-大字体": L.tileLayer.baidu({ layer: 'img', bigfont: true }),
                "自定义样式-黑色地图": L.tileLayer.baidu({ layer: 'custom', customid:'dark' }),
                "自定义样式-蓝色地图": L.tileLayer.baidu({ layer: 'custom', customid:'midnight' })
            },
            {
                "实时交通信息": L.tileLayer.baidu({ layer: 'time' })
            },
            { position: "topright" }).addTo(map2);
        new L.marker(start_initmap_location).addTo(map2);
        return map2;
    }
    function gaode_map_init(){

        var normalm = L.tileLayer.chinaProvider('GaoDe.Normal.Map', {
            maxZoom: 18,
            minZoom: 5
        });
        var imgm = L.tileLayer.chinaProvider('GaoDe.Satellite.Map', {
            maxZoom: 18,
            minZoom: 5
        });
        var imga = L.tileLayer.chinaProvider('GaoDe.Satellite.Annotion', {
            maxZoom: 18,
            minZoom: 5
        });

        var normal = L.layerGroup([normalm]),
            image = L.layerGroup([imgm, imga]);

        var baseLayers = {
            "高德地图": normal,
            "高德卫星地图": image,

        }

        var map = L.map("map", {
            center: start_initmap_location,
            zoom: 12,
            layers: [normal],
            zoomControl: false
        });

        L.control.layers(baseLayers, null).addTo(map);
        L.control.zoom({
            zoomInTitle: '放大',
            zoomOutTitle: '缩小'
        }).addTo(map);
        return map;
    }
    function get_distance(A,B){
        var latlng = L.latLng(A[0],A[1]);
        var distance=latlng.distanceTo(L.latLng(B[0],B[1]));
        return distance;
    }
    function draw_distance(Obj){
        var treeCol=new Array();
        for(var i=0;i<Obj.manage_device_number;i++){
            treeCol[i]=new Array();
            for(var j=0;j<Obj.manage_device_number;j++){
                treeCol[i][j]=0;
            }
        }
        for(var i=0;i< Obj.manage_device_number;i++){
            for(var j=0;j<Obj.manage_device_number;j++){
                if(i==j||treeCol[i][j]!=0)
                    continue;
                else{

                    temp=get_distance([Obj.device_location[i].device_location.x,Obj.device_location[i].device_location.y],[Obj.device_location[j].device_location.x,Obj.device_location[j].device_location.y]);
                    treeCol[i][j]=temp;
                    treeCol[j][i]=temp;
                }
            }
        }

        for(var i=0;i<Obj.manage_device_number;i++){
            for(var j=0;j<Obj.manage_device_number;j++){
                if(i==j)
                    continue;
                //alert([Obj.manage_device_number,treeCol[i][j],i,j]);
                var red = parseInt(Math.random()*257).toString(16);
                var blue = parseInt(Math.random()*257).toString(16);
                var green= parseInt(Math.random()*257).toString(16);

                var linecolor = '#'+red+blue+green;

                var polyline = L.polyline([[Obj.device_location[i].device_location.x,Obj.device_location[i].device_location.y],[Obj.device_location[j].device_location.x,Obj.device_location[j].device_location.y]], {color: linecolor}).addTo(map_baidu)
                    .bindPopup("距离为"+treeCol[i][j])
                    .openPopup();

                var polyline = L.polyline([[Obj.device_location[i].device_location.x,Obj.device_location[i].device_location.y],[Obj.device_location[j].device_location.x,Obj.device_location[j].device_location.y]], {color: linecolor}).addTo(map_gaode)
                    .bindPopup("距离为"+treeCol[i][j])
                    .openPopup();
            }

        }
    }
    function draw_marker(Obj){

        var marker_gaode = L.marker([Obj.device_location_x, Obj.device_location_y])
            .addTo(map_gaode)
            .bindPopup("<b>设备名称:"+Obj.name+"</b>"+"<br><b>设备号:"+Obj.device_id+"</b>"+"<br><b>设备电量:"+Obj.device_power+"</b><br>"+"<b>设备状态:"+Obj.device_state+"</b><br><b>设备信号:"+Obj.device_signal_state+"</b><br><b>设备传输时间:"+Obj.device_time+"</b>"
            )
            .openPopup();
        var marker_baidu = L.marker([Obj.device_location_x, Obj.device_location_y])
            .addTo(map_baidu)
            .bindPopup("<b>设备名称:"+Obj.name+"</b>"+"<br><b>设备号:"+Obj.device_id+"</b>"+"<br><b>设备电量:"+Obj.device_power+"</b><br>"+"<b>设备状态:"+Obj.device_state+"</b><br><b>设备信号:"+Obj.device_signal_state+"</b><br><b>设备传输时间:"+Obj.device_time+"</b>"
            )
            .openPopup();
    }
    function get_marker(l){
        for (var i in l.device_location){
            draw_marker(l.device_location[i]);
        }
    }
    $(".btn_baidu").click(function(){
        $(".baidu_map").show();

        $(".gaode_map").hide();
    });
    $(".btn_gaode").click(function(){
        $(".baidu_map").hide();
        $(".gaode_map").show();
    });
    //初始化地图
    $(document).ready(function () {
        loaddata(l);
        map_gaode=gaode_map_init();
        $(".gaode_map").hide();
        map_baidu=baidu_map_init();
    });
    function loaddata(l) {
        $.ajax({
            type: "post",
            datatype: "json",
            url: "<%=basePath %>monitor/loadtodata",
            contentType : "application/json;charset=utf-8",
            success: function (data) {
                if (data.success) {

                    l.device_location = data.body.list;
                    layui.use(['tree', 'layer'], function(){
                        var layer = layui.layer
                            ,$ = layui.jquery;
                        layui.tree({
                            elem: '#demo1' //指定元素
                            ,target: '_blank' //是否新选项卡打开（比如节点返回href才有效）
                            ,click: function(item){ //点击节点回调
                                //layer.msg('当前节名称：'+ item.name + '<br>全部参数：'+ JSON.stringify(item));
                                //console.log(item);
                                listdata=[];
                                listdata=item;

                            },
                            nodes: data.body.group
                        })
                    })


                }
            },
            error: function () {
                alert("请检查网络连接");
            }
        });

    };
    $(".btn_full_screen").click(function(){
        $(".map").css("height",$(window).height());
        $(".map").css("width",$(window).width());

        map_baidu.invalidateSize(true);
        map_gaode.invalidateSize(true);
    });
    $(".btn_device_location_show").click(function(){
        get_marker(l);
    });
    $(".layui-colla-title").click(function(){
        $(".map").css("height","500px");
        $(".map").css("width","100%");
    });
    $(".btn_draw_distance_show").click(function(){
        draw_distance(l);
    });
    // $(document).ready(function(){
    //     $(".content>li>ul>li>a").append("<i style='    float: right;\n" +
    //         "    display: block;\n" +
    //         "    padding-right: 25px;'>asdasd</i>");
    //
    // });
    //map.removeLayer(marker)删除标记
</script>

</body>


</html>