<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
  
  <style type="text/css">
  	.layui-nav* {
   	 	font-size: 19px !important
	}
	.layui-tab-title .layui-this{
		background-color: #eee
	}
  </style>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
	  <div class="layui-header">
	    <div class="layui-logo">R-Watch后台管理</div>
	    <!-- 头部区域（可配合layui已有的水平导航） -->
	    <ul class="layui-nav  layui-layout-right layui-bg-blue ">
	      <li class="layui-nav-item">
	      	<a href="">
	      		<i class="fa fa-envelope-o" aria-hidden="true"></i>
	      			消息
	      	</a>
	      </li>
	      <li class="layui-nav-item">
	      	<a href="">
	      		<i class="fa fa-file-text-o" aria-hidden="true"></i>
	      			公告
	      	</a>
	      </li>
	      <li class="layui-nav-item">
	      	<a href="">
	      		<i class="layui-icon layui-icon-username"></i>
	      			账户
	      	</a>
	      </li>
	      <li class="layui-nav-item">
	     	 <a href="<%=basePath%>login/logout">
	     	 <i class="fa fa-sign-out" aria-hidden="true"></i>
	     			 退出
	     	 </a>
	      </li>
	    </ul>
	  </div>
	  
	  <div class="layui-side layui-bg-black">
	    <div class="layui-side-scroll">
	      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
	      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
	        <li class="layui-nav-item"> <!--  layui-nav-itemed 默认展开 -->
	          <a id="health" class="side-active" href="javascript:;" data-id="health" data-title="健康数据" data-url="<%=basePath%>/health/list">
	          	<i class="fa fa-ambulance" aria-hidden="true">&nbsp;</i>
	          		健康数据
	          	</a>
	        </li>
	        <li class="layui-nav-item">
	          <a href="javascript:;"><i class="fa fa-th-list" aria-hidden="true">&nbsp;</i>设备管理</a>
	          <dl class="layui-nav-child">
	            <dd><a class="side-active" href="javascript:;" data-id="aDevicesAll" data-title="全部设备" data-url="url">全部设备 </a></dd>
	            <dd><a class="side-active" href="javascript:;" data-id="aDeviceExp7" data-title="7天内过期设备" data-url="url">7天内过期设备</a></dd>
	            <dd><a class="side-active" href="javascript:;" data-id="aDeviceExp15" data-title="15天内过期设备" data-url="url">15天内过期设备</a></dd>
	            <dd><a class="side-active" href="javascript:;" data-id="aDeviceExp60" data-title="60天内过期设备" data-url="rul">60天内过期设备</a></dd>
	            <dd><a class="side-active" href="javascript:;" data-id="aDeviceExp" data-title="已过期设备" data-url="url">已过期设备</a></dd>
	          </dl>
	        </li>
	        <li class="layui-nav-item">
	        	<a href="javascript:;"><i class="fa fa-video-camera" aria-hidden="true">&nbsp;</i>监控</a>
	        </li>
	        <li class="layui-nav-item">
	      	    <a href="javascript:;"><i class="fa fa-exclamation-triangle" aria-hidden="true">&nbsp;</i>报警中心</a>
	        	<dl class="layui-nav-child">
		            <dd><a class="side-active" href="javascript:;" data-id="aDevicesAll" data-title="信息列表" data-url="<%=basePath %>Comment/toInforList">信息列表</a></dd>
		            <dd><a class="side-active" href="javascript:;" data-id="aDeviceExp7" data-title="用户信息" data-url="<%=basePath %>Comment/toUserList">用户信息</a></dd>
		            <dd><a class="side-active" href="javascript:;" data-id="aDeviceExp15" data-title="实时跟踪" data-url="<%=basePath %>Comment/position">实时跟踪</a></dd>
	          	</dl>
	        </li>
	      </ul>
	    </div>
	  </div>
	  
	  <div class="layui-body">
	    <!-- 内容主体区域 -->
	    <div class="layui-tab layui-show" lay-filter="demo" lay-allowclose="true">
		    <ul class="layui-tab-title"></ul>
		    <div class="layui-tab-content"></div>
		</div>
	  </div>
	  
	  <div class="layui-footer">
	    <!-- 底部固定区域 -->
	    © R-Watch - 智能手环
	  </div>
	</div>
	<script src="<%=basePath %>static/jquery/jquery.min.js"></script>
	<script src="<%=basePath %>static/layui2.4.5/layui.js"></script>
	<script src="<%=basePath %>static/js/login.js"></script>
</body>
</html>