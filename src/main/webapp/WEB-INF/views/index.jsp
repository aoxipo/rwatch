<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath(); //web项目的根路径
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
   
    /*
    	例如：
    	http://localhost:8080/rwatch/login
	    request.getSchema()可以返回当前页面使用的协议，就是上面例子中的“http”
	    request.getServerName()可以返回当前页面所在的服务器的名字，就是上面例子中的“localhost"
	    request.getServerPort()可以返回当前页面所在的服务器使用的端口,就是8080
	    request.getContextPath()可以返回当前页面所在的应用的名字，就是上面例子中的rwatch
	    有了basePath 可以直接用从而进行拼接.
	    
	    */
%>
<!doctype html>
<html lang="zh">
<head>
	<meta charset="UTF-8">
	<title>管理员登录-R-Watch</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="<%=basePath%>static/css/font.css">
	<link rel="stylesheet" href="<%=basePath%>static/css/rwatch.css">
	<script src="<%=basePath %>static/jquery/jquery.min.js"></script>
	<script src="<%=basePath%>static/layui2.4.5/layui.js"></script>

</head>
<body class="login-bg">
    
    <div class="login">
        <div class="message">R-Watch智能手环登录</div>
        <div id="darkbannerwrap"></div>
        
        <form method="post" class="layui-form" >
            <input name="username" placeholder="用户名"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input name="password" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <input class="loginin" value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <hr class="hr20" >
        </form>
    </div>

    <script type="text/javascript">
        
        	layui.extend({
				admin: '<%=basePath%>static/js/admin'
			});
            layui.use(['form','admin'], function(){
              var form = layui.form
              	,admin = layui.admin;
              // layer.msg('玩命卖萌中', function(){
              //   //关闭后的操作
              //   });
              //监听提交
              form.on('submit(login)', function(data){
            	  login(data.field);
                return false;
              });
            });   
          
            function login(data){
            	 $.ajax({  
                     type : "post",
                     datatype:"json",
                     url : "<%=basePath %>login/doLogin",
                     data : data,
                     success: function(data){ 
        	        	   	if(data.success){
        	        	   	 location.href='<%=basePath %>login/login'
        	        	}else{
        	        		layer.alert( data.msg )
        	        	}
        	       },  
        	       error: function() {    
        	    	   layer.alert("请检查网络连接");  
        	       }  
                 });
        	 }
    </script>  
    <!-- 底部结束 -->
</body>
</html>