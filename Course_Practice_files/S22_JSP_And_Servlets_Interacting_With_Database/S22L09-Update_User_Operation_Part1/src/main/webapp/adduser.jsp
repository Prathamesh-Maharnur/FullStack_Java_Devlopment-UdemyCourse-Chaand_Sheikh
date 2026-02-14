<jsp:include page="include/header.jsp"></jsp:include>

<h2>Home page</h2>

<form action="${pageContext.request.contextPath }/site" method="post">
		<label for="name">Name: </label>
		<input type="text" id="name" name="user_name" required/>
		<br/>
		
		<label for="email">Email: </label>
		<input type="text" id="email" name="email_id" required />
		<br/>
		
		<input type="submit"  value="Add user" />
		<input type="hidden" name="form" value="AddUserOperation" />
		<br/>
</form>

<jsp:include page="include/footer.jsp"></jsp:include>