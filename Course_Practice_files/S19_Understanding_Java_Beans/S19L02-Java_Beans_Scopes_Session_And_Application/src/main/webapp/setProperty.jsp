<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setProperty</title>
</head>
<body>
		<jsp:useBean id="user" class="org.maharnur.prathamesh.User" scope="application"></jsp:useBean>
		
		<jsp:setProperty property="firstName" name="user" value="Prathamesh"/>
		<jsp:setProperty property="lastName" name="user" value="Maharnur" />
		Values Updated!
</body>
</html>