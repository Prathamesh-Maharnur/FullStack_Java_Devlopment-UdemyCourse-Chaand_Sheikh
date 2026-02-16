<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formValue</title>
</head>
<body>
	<jsp:useBean id="user" class="org.maharnur.prathamesh.User" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="user"/>
	Name:<jsp:getProperty property="firstName" name="user" /><br/>
	Surname: <jsp:getProperty property="lastName" name="user" />
</body>
</html>