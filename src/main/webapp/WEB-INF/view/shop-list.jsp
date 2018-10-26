<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Shop list</title>
  
<link href="http://cdn.jsdelivr.net/webjars/bootstrap/3.3.5/css/bootstrap.min.css"
      href="/webjars/bootstrap/3.3.5/css/bootstrap.min.css}"
      rel="stylesheet" media="screen" />


</head>
<body>
	<div class="container">
	
			<h3>Shop list</h3>
		
	
	<input type="button" value="Add Shop"
			onclick="window.location.href='addForm'; return false;"
			class="btn btn-primary" />
	
     <form:form action="search" method="POST">
             Search customer: <input type="text" name="theSearchName" />
                
            <input type="submit" value="Search" class="btn btn-primary btn-sm" />
      </form:form>
		
	<table class="table table-striped">
		<tr>
			<th>Shop name</th>
			<th>Address</th>
			<th>Contact number</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="tempShop" items="${shops}">
		<c:url var="updateLink" value="/shop/updateForm">
			<c:param name="shopId" value="${tempShop.id }"/>
			</c:url>
			<c:url var="deleteLink" value="/shop/delete">
			<c:param name="shopId" value="${tempShop.id }"/>
		</c:url>
		<tr>
			<td>${tempShop.shopName }</td>
			<td>${tempShop.address }</td>
			<td>${tempShop.contactNumber }</td>
			<td> <a href="${updateLink}"class="btn btn-primary" role="button" aria-pressed="true">Update</a></td>
			<td><a href="${deleteLink }"class="btn btn-danger" role="button" aria-pressed="true"
			onclick="if(!(confirm('Are you sure?')))return false">Delete</a><td>
		</tr>
		</c:forEach>
	</table>
	</div>
	


<script src="http://cdn.jsdelivr.net/webjars/jquery/2.1.4/jquery.js"
        src=/webjars/jquery/2.1.4/jquery.min.js} type="text/javascript"></script>
</body>
</html>







