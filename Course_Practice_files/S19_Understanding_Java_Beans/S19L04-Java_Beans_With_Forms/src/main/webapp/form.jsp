<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<jsp:useBean id="user" class="org.maharnur.prathamesh.User" scope="session"></jsp:useBean>
	<form action="formValue.jsp">
			Name:<input type="text" name="firstName" value='<jsp:getProperty property="firstName" name="user"/> '/>
			Surname:<input type="text" name="lastName" value='<jsp:getProperty property="lastName" name="user"/>' />
			
			<input type="submit" value="submit"/>
	</form>
</body>
</html>