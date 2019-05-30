<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户列表</title>
<style type="text/css">
	div.list{width: 500px;margin: 50px auto;background-color: #EEE;padding: 20px 50px;text-align: center;position: relative;}
	table{width: 100%;height:100%}
	table tr th,td{border: 1px solid #FFF;width: 33%;text-align: center;}
	a{border:0;background-color: #0099E6;margin: 5px 20px;padding: 10px;box-shadow: 2px 2px 2px rgba(0,0,0,.3);border-radius: 5px;text-decoration: none;color: white; }
	button{border:0;background-color: #0099E6;margin: 5px 20px;padding: 10px;box-shadow: 2px 2px 2px rgba(0,0,0,.3);border-radius: 5px;text-decoration: none;color: white; }
</style>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>姓名</th>
			<th>经度</th>
			<th>维度</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${list }" var="d">
		<tr>
			<td>${d.Name }</td>
			<td>${d.x }</td>
			<td>${d.y }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>