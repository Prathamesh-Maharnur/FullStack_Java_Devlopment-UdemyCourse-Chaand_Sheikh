<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member</title>
</head>
<body>
		<%
				String userName = request.getSession().getAttribute("user-name").toString();
				String sessionId = request.getSession().getId();
		%>
		<label for="name">Name: </label>
		<%= userName %>
		<br/>
		
		<label for="sessionId">sessionId:</label>
		<%= sessionId %>
		<br/>
		
		<form action="<%= request.getContextPath() %>/MemberAreaController">
				<input type="submit"  value="logout"/>
				<input type="hidden" name="action" value="destroy" />
		</form>
</body>
</html>