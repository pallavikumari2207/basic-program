<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("cache-control","no-cache,no-store,must-validate");
%>
<form action="logout" method="post">
<input type="submit" value="logout">
</form>
</body>
</html>