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
			String userName = null;
			String sessionId = null;
			Cookie[] cookies = request.getCookies();
			for(Cookie cookie: cookies){
				if(cookie.getName().equals("user-name")){
					userName = cookie.getValue();
				}
				if(cookie.getName().equals("JSESSIONID")){
					sessionId = cookie.getValue();
				}
			}
			
			if(userName == null || sessionId == null){
				response.sendRedirect("login.jsp");
			}
			
	%>
	
	<label for="name">Name: </label>
	<%= userName %>
	<br/>
	
	<label for="sesssionId">SessionId: </label>
	<%= sessionId %>
	<br/>
	
	<form action="<%= request.getContextPath()  %>/MemberAreaController" method="get">
		<input type="hidden" name="action" value="destroy"/>
		<input type="submit" value="logout"/>
	</form>
</body>
</html>