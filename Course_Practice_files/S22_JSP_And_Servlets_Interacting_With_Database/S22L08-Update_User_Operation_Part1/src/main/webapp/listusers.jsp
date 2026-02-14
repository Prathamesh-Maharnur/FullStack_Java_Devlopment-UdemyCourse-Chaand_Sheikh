<jsp:include page="include/header.jsp"></jsp:include>
<%@ page import="java.util.*, org.maharnur.prathamesh.entity.User" %>
<h2>Home page</h2>
<table border="1">
		<thead>
			<tr>
					<td>User Id</td>
					<td>User Name</td>
					<td>Email Id</td>
			</tr>
		</thead>
<%
		List<User> users = (List)request.getAttribute("listusers");
		for(User _user: users){
			out.println("<tr>");
			out.println("<td>"+_user.getUser_id()+"</td>");
			out.println("<td>"+_user.getUser_name()+"</td>");
			out.println("<td>"+_user.getEmail_id()+"</td>");
			out.println("<td><a href="+request.getContextPath()+"/site?page=updateuser&user_id="+_user.getUser_id()+">Update</a></td>");
			out.println("</tr>");
		}
%>
</table>
<jsp:include page="include/footer.jsp"></jsp:include>