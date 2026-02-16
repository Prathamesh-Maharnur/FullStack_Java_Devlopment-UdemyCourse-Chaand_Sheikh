<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ page import="org.prathamesh.HelloClass, java.util.Date" %>
<meta charset="UTF-8">
<title>Import class in JSP</title>
</head>
<body>
	<%= new HelloClass().demoString() %>
	<% out.println("<br/>"+new Date()); %>
</body>
</html>