<jsp:include page="include/header.jsp"></jsp:include>

<h2>Home page</h2>

<form action="${pageContext.request.contextPath}/site" method="post">
		<label for="name">Name: </label>
		<input type="text" id="name" name="user_name" value="${param.user_name}" required/>
		<br/>
		
		<label for="email">Email: </label>
		<input type="text" id="email" name="email_id" value="${param.email_id}" required />
		<br/>
		
		<input type="hidden" id="id" name="user_id" value="${param.user_id}" />
		
		<input type="submit"  value="update user" />
		<input type="hidden" name="form" value="UpdateUserOperation" />
		<br/>
</form>

<jsp:include page="include/footer.jsp"></jsp:include>