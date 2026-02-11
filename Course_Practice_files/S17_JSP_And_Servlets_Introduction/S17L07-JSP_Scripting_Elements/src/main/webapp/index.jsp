<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IndexJSP</title>
</head>
<body>
	<h1>Hello it's index.jsp</h1>
	<% int x = 20; int y=30;  %>
	<br/>
	<%= new Integer(20) %>
	<br>
	<%= x %>
	<br/>
	<% out.println(y);%>
	<%  new String("Prathamesh"); %>
	<br>
	<%= 25*5 %>
	<%-- This is comment --%>
	<br/>
</body>
</html>