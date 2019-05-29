<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath(); //web项目的根路径
			String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
					+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>健康数据</title>
<link rel="stylesheet" href="<%=basePath%>static/layui2.4.5/css/layui.css">
<link rel="stylesheet" href="<%=basePath%>static/font-awesome/css/font-awesome.min.css">
<script src="<%=basePath%>static/easyui/jquery.min.js"></script>
<script src="<%=basePath%>static/layui2.4.5/layui.js"></script>
</head>
<body>
	<div class="layui-inline">
				<div class="layui-inline">
					<label class="layui-form-label"
						style="font-weight: bold; font-size: 15px; width: 70px;">IMEI：</label>
					<div class="layui-input-inline">
						<input type="text" name="waybillnosecondary" autocomplete="off" class="layui-input" id="waybillnosecondary" style="text-transform:uppercase;" onkeyup="this.value=this.value.toUpperCase()"/>
					</div>
				</div>
	</div>
	<div class="layui-inline">
		 <button class="layui-btn" text-align:'right' lay-submit="" id="searchBtn" data-type="getInfo">查询</button>
		 <button class="layui-btn" data-type="reload" id="addBtn">新增</button>
	</div>
	<table class="layui-hide" id="health"></table>
	
	<script type="text/html" id="bar">
  		<a class="layui-btn layui-btn-xs" lay-event="edit">修改信息</a>
  		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="find">查看历史</a>
	</script>
	<script>
		layui.use('table', function() {
			var table = layui.table;
			 table.render({
				    elem: '#health'
				    //,url:''
				    ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
				    ,cols: [[
				      {field:'imei', width:'15%', title: 'IMEI', sort: true ,align: 'center'}
				      ,{field:'custodian', width:'10%', title: '监护人' ,align: 'center'}
				      ,{field:'nickName',  width:'10%', title: '姓名和号码牌', sort: true ,align: 'center'}
				      ,{field:'userLevel', width:'15%', title: '会员等级',sort: true,align: 'center'}
				      ,{field:'preAmount', width:'15%', title: '预存金额', sort: true ,align: 'center'}
				      ,{field:'heartBeat', width:'15%', title: '心率', sort: true ,align: 'center'}
				      ,{fixed: 'right',    title:'操作', toolbar: '#bar',align: 'center'}
				    ]]
			 ,data: [
			         {
			        	 "imei": "863703032297843"
						      ,"custodian": "杜甫"
						      ,"nickName": "DDDDDDDDD"
						      ,"userLevel": "普通会员"
						      ,"preAmount": "0.00"
						      ,"heartBeat": "75"
    }, {
    	"imei": "863137002809453"
		      ,"custodian": "杜甫"
		      ,"nickName": "ZZZZZZZZZ"
		      ,"userLevel": "一级会员"
		      ,"preAmount": "1.00"
		      ,"heartBeat": "82"
    },{
			      "imei": "863703031400778"
			      ,"custodian": "杜甫"
			      ,"nickName": "TTTTTTTT"
			      ,"userLevel": "特级会员"
			      ,"preAmount": "2.00"
			      ,"heartBeat": "77"
			      
			    }]
				   ,page: true
				  });
				});
	</script>
</body>
</html>
