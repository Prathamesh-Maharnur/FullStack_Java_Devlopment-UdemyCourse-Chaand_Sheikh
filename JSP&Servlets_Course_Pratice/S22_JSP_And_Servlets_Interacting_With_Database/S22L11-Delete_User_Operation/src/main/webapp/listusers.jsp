<%@page import="java.net.URLEncoder"%>
<jsp:include page="include/header.jsp"></jsp:include>
<%@ page import="java.util.*, org.maharnur.prathamesh.entity.User" %>
<h2>Home page</h2>
<table border="1">
		<thead>
			<tr>
					<td>User Id</td>
					<td>User Name</td>
					<td>Email Id</td>
					<td>Operation(s)</td>
			</tr>
		</thead>
<%
		List<User> users = (List)request.getAttribute("listusers");
		for(User _user: users){
			out.println("<tr>");
			out.println("<td>"+_user.getUser_id()+"</td>");
			out.println("<td>"+_user.getUser_name()+"</td>");
			out.println("<td>"+_user.getEmail_id()+"</td>");
			out.println("<td><a href="+request.getContextPath()+"/site?page=updateuser&user_id="+_user.getUser_id()+
							"&user_name="+URLEncoder.encode(_user.getUser_name(), "UTF-8") +"&email_id="+_user.getEmail_id()+">Update</a>");
			out.println(" | ");
			out.println("<a href="+request.getContextPath()+"/site?page=deleteuser&user_id="+_user.getUser_id()+">Delete</a></td>");
			out.println("</tr>");
		}
		/*
			URLEncoder.encode(_user.getUser_name(), "UTF-8") 
			is used because the user name has space due to 
			which the url breaks thats the reason this was used
			(This method is not taught in current Lecture)
		*/
%>
</table>
<jsp:include page="include/footer.jsp"></jsp:include>