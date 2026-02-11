<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>	JSP Declarations</title>
</head>
<body>
<strong>"Hello, I am Prathamesh Maharnur"</strong>
<br />
<%! public int x = 10; %>
<%!
String message(){
	return "Learning JSP Basics";
}
%>
<%= x %>
<br />
<%= message() %>
</body>
</html>