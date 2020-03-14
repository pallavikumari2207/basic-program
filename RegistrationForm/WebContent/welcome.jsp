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
if (session.getAttribute("Email")==null)
{
	response.sendRedirect("login.jsp");
}
%>
welcome ${Email}
<form action="logout" method="post">
<input type="submit" value="logout">
</form>
<h1>hello</h1>
</body>
</html>