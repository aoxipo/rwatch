<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<!DOCTYPE html>
<html>
<head>
	<meta content="text/html;charset=UTF-8"/>
	<title>404</title>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
	<link rel="stylesheet"
	href="<%=basePath %>static/layui2.4.5/css/layui.css">
</head>
<body>
<div style="text-align: center;">
	<h2><i class="layui-icon" style="line-height: 300px; font-size: 300px; color: #393D49;">&#xe61c;</i></h2>
	<p style="margin-top: 50px; padding: 0 15px; font-size: 20px; color: #999; font-weight: 300;">页面找不到了…</p>
</div>
</body>
</html>
