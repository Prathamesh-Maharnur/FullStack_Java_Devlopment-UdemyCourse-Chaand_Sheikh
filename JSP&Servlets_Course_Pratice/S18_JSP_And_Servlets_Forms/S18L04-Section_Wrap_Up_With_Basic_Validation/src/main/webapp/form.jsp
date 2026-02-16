<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/Controller" method="post">
			<label for="name">Name:</label>
			<input type="text" id="name" name="user-name" required/>
			<br/>
			
			<label for="gender">Gender:</label>
			<input type="radio" id="gender" name="gender-type" value="male" checked/>Male
			<input type="radio"  id="gender"  name="gender-type" value="female" />Female <br/>
			
			<label for="language">Languages:</label>
			<input type="checkbox" id="language" name="languages" value="English" />English
			<input type="checkbox" id="language" name="languages" value="Hindi" />Hindi
			<input type="checkbox" id="language" name="languages" value="Marathi" />Marathi
			<br/>
			
			<label for="country">Country</label>
			<select name="country" >
					<option value="India">India</option>
					<option value="USA">USA</option>
					<option value="Finland">Finland</option>
					<option value="UK">UK</option>
			</select>
			<br/>
			
			<button type=submit>Submit</button>
					
			
	</form>
</body>
</html>