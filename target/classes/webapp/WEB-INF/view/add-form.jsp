<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Add form</title>
	
<link href="http://cdn.jsdelivr.net/webjars/bootstrap/3.3.5/css/bootstrap.min.css"
      href="/webjars/bootstrap/3.3.5/css/bootstrap.min.css}"
      rel="stylesheet" media="screen" />
	
<head>
<body>


	<div class="container">
	<h2>Add new shop</h2>
	<form:form action="saveShop" modelAttribute="shop" mothod="POST">
	<form:hidden path="id"/>
	<table class="table">
		<tr>
			<td>Shop Name:</td>
			<td><form:input path="shopName"/></td>
		<tr>
		<tr>
			<td>Address:</td>
			<td><form:input path="address"/></td>
		<tr>
		<tr>
			<td>Contact number:</td>
			<td><form:input path="contactNumber"/></td>
		<tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Save" class="btn btn-primary" role="button"/></td>
	</table>
	</form:form>
		
		<p>
			<a href="${pageContext.request.contextPath}/shop/list"
			class="btn btn-dark" role="button" aria-pressed="true">Back to List</a>
		</p>
	
	</div>
	
	
<script src="http://cdn.jsdelivr.net/webjars/jquery/2.1.4/jquery.js"
        src=/webjars/jquery/2.1.4/jquery.min.js} type="text/javascript"></script>
</body>

</html>




