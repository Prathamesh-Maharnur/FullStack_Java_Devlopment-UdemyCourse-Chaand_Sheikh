<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setProperty</title>
</head>
<body>
	<jsp:useBean id="user" class="org.maharnur.prathamesh.User"></jsp:useBean>
	
	<jsp:setProperty property="firstName" name="user" value="Prathamesh "/>
	 <jsp:setProperty property="lastName" name="user" value="Maharnur"/>
	
	After setProperty:
	<br/>
	Name: <jsp:getProperty property="firstName" name="user"/><br/>
	Surname:<jsp:getProperty property="lastName" name="user"/>
</body>
</html>