<jsp:include page="include/header.jsp">
	<jsp:param value="HomePage" name="titlePage" />
</jsp:include>


<a href="<%= request.getContextPath()  %>/SiteController?action=login">login</a>
		
<jsp:include page="include/footer.jsp"></jsp:include>
