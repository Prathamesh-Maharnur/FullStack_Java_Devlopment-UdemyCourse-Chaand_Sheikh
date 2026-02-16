<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/SiteController" method="post">
		<label for="name">Name: </label>
		<input type="text" id="name" name="user-name"/><br/>
		
		<label for="password">Password: </label>
		<input type="password" id="password" name="user-password"/><br/>
		
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>