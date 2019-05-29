<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
    String path = request.getContextPath(); //web项目的根路径
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script src="<%=basePath %>static/jquery/jquery.min.js"></script>
<script src="<%=basePath%>static/layui2.4.5/layui.js"></script>
<link rel="stylesheet" href="<%=basePath%>static/layui2.4.5/css/layui.css" >
<script >
layui.use('table', function(){
      var table = layui.table;
//      var playerName;
//      if(item != undefined) {
//        playerName=item;
//      }
      table.render({
        elem: '#test' 
        ,url:'<%=basePath %>Comment/inforList'
        ,method:'post'
        /* ,response: {
        	dataName: 'data'
        } */
        ,page:true
        ,limit:5
        /* ,cellMinWidth: 200 */ //全局定义常规单元格的最小宽度，layui 2.2.1 新增
        ,cols: [
               [
                   { field: 'name', title: '设备名',align:'center' ,width: "17%", sort: true, fixed: 'left' },
                   { field: 'byMemberId', title: 'IMEI',align:'center' , width: "17%" },
                   { field: 'type', title: '报警类型',align:'center' , width: "17%" },
                   { field: 'time', title: '报警时间',align:'center' , width: "17%" },
                   { field: 'ontime', title: '定位时间',align:'center' , width: "17%" },
                   { field: 'state', title: '状态',align:'center' , width: "15%" },
               ]
           ],
      });
});
      
      

      
      
</script>



</head>

<body>
<table class="layui-hide" id="test" lay-filter="test"></table>

<h2>1</h2>

</body>
</html>