<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	<form action="submit.jsp" method="post">
		<label for="name">Name:</label>
		<input type="text" id="name" name="user-name"/>
		<br/>
		
		<label for="gender">Gender:</label>
		<input type="radio" id=gender name="gender-type" value="male"/>Male
		<input type="radio" id=gender name=gender-type value="female"/>Female
		<br/>
		
		<label for="languages">Languages now:</label>
		<input type="checkbox" id="languages" name="languages-known" value="English"/>English
		<input type=checkbox id="languages" name="languages-known" value="Hindi" />Hindi
		<input type=checkbox id="languages" name="languages-known" value="Marathi"/>Marathi
		<br/>
		
		
		<label for="country">Country</label>
		<select  name="country">
			<option value ="India">India</option>
			<option value="USA">USA</option>
			<option value="Finland">Finland</option>
			<option value="UK">UK</option>
		</select>
		<br/>
		<button type="submit">Submit</button>
		
	</form>
</body>
</html>