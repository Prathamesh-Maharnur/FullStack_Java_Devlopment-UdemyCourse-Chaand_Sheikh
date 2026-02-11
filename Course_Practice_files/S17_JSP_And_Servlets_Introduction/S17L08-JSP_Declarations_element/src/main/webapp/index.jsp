<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IndexJSP</title>
</head>
<body>
	<h1>Hello index.jsp</h1>
	
		 <%!
		 		public int x = 20;
		 		int y = 30;
		 		
		 		public String printMessage(){
		 			return "Hello World";
		 		}
		 %>
		 <% 
		 			out.println(x);
		 			String msg = printMessage();
		 			out.println(msg);
		 %>
		 <% int x = 30; %>
</body>
</html>