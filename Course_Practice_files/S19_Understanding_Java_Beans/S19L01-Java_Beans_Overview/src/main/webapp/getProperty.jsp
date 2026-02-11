<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getProperty</title>
</head>
<body>
	<p>getProperty:</p>
	<jsp:useBean id="user" class="org.maharnur.prathamesh.User" scope="session"></jsp:useBean>
	
	Name: <jsp:getProperty property="firstName" name="user"/>
	<br/>
	Surname: <jsp:getProperty property="lastName" name="user"/>
</body>
</html>