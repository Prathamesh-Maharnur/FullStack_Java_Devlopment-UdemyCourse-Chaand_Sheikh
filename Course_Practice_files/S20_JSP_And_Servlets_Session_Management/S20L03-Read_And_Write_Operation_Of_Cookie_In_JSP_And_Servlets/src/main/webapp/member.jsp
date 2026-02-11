<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member page</title>
</head>
<body>
	<%
			String userName = null;
			String sessionId = null;
			Cookie[] cookies = request.getCookies();
			
			if(cookies != null){
				for(Cookie cookie : cookies){
					if(cookie.getName().equals("user-name")){
						userName = cookie.getValue();
					}
					if(cookie.getName().equals("JSESSIONID")){
						sessionId = cookie.getValue();
					}
				}
			}
			
			if(userName ==null || sessionId == null){
				response.sendRedirect("login.jsp");
			}
			
			
	%>
	
	<label for="name">Name: </label>
	<%= userName %><br/>
	
	<label for="password">Session ID: </label>
	<%= sessionId %>
</body>
</html>