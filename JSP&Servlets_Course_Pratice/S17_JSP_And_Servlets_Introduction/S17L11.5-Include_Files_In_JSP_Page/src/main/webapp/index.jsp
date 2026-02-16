<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Static -->
	<%@ include file="file1.txt" %>
	<br/>
	<!-- Dynamic -->
	<jsp:include page="file2.txt"/>
</body>
</html>