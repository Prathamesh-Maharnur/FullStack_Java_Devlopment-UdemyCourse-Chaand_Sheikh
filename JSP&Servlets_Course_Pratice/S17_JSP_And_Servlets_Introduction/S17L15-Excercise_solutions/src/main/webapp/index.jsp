<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
index.jsp<br/>
<a href="<%= request.getContextPath()%>/Demo?page=login">Login</a><br/>
<a href="<%= request.getContextPath()%>/Demo?page=signUp">SignUp</a><br/>
<a href="<%= request.getContextPath()%>/Demo?page=about">About</a><br/>
</body>
</html>