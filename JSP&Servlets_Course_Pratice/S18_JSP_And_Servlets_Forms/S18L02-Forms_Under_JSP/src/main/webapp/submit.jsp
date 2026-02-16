<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Name: <%= request.getParameter("user-name") %>
	<br/>
	Gender: <%= request.getParameter("gender-type") %>
	<br/>
	languages:
	<%
		String[] languages = request.getParameterValues("languages-known");
		if(languages != null){	
			for(int i =0; i<languages.length; i++){
					out.println("\t");
					out.println(languages[i]);
				}
		}
	%>
	<br/>
	Country:<%= request.getParameter("country") %>
</body>
</html>