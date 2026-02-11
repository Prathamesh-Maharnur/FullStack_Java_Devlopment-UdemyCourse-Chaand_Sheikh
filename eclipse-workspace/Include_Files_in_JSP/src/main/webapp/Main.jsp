<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include file in jsp</title>
</head>
<body>
<!-- Static -->
<%@include file="./files/demo1.txt" %>
<hr/>
<!-- Dynamic -->
<jsp:include page="demo2.txt"/>
<hr/>
<jsp:include page="./files/demo3.jsp"/>
<hr/>
</body>
</html>