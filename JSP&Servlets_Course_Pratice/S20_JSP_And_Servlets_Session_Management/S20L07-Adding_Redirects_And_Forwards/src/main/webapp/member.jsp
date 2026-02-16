<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberArea</title>
</head>
<body>
		<%
				String userName = null, sessionId = null;
				if(request.getSession().getAttribute("user-name") == null){
					response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
				}else{
					userName = request.getSession().getAttribute("user-name").toString();
					sessionId = request.getSession().getId();
				}
		%>

		<label for="name">Name: </label>
		<%= userName %>
		<br/>
		
		<label for="session-id">Session Id: </label>
		<%= sessionId %>
		
		<form action="<%= request.getContextPath() %>/MemberAreaController" method="get">
				<input  type="submit" value="Logout" />
				<input type="hidden" name="action" value="destroy" />
		</form>
		
</body>
</html>