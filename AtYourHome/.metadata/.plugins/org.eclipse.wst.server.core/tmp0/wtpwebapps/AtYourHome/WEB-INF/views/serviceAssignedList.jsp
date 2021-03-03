<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service Assigned List</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
table {
    border-collapse: collapse;
}

table, td, th {
    border: 2px solid black;
    width : 500px;
    height :30px;
}
body
{
background-color:				#B0E0E6;

}
</style>
</head>
<body style="align:center">

<h1>Service Assigned List</h1><br>
<div class="container">
<table class="table">
	
		 <tr> 
			<th>SR ID</th>
			<th>Service Name</th>
			<th>Customer name</th>
			<th>Mobile Number</th>
			<th>Email</th>
			<th>Ex.date</th>
			<th>Area id</th>
			<th>Address1 </th>
			<th>Address2</th>
			<th>Status</th>
		</tr> 

		<c:forEach items="${serviceAssignedList}" var="serviceAssigned">
		
			<tr align = "center">
				<td><c:out value="${serviceAssigned.sr_id}"/></td>
				<td><c:out value="${serviceAssigned.sr_desc}"/></td>
				<td><c:out value="${serviceAssigned.sr_pers_name}"/></td>
				<td><c:out value="${serviceAssigned.phoneno}"/></td>
				<td><c:out value="${serviceAssigned.email}"/></td>
				<td><c:out value="${serviceAssigned.ep_date}"/></td>
				<td><c:out value="${serviceAssigned.area.ar_name}"/></td>
				<td><c:out value="${serviceAssigned.address1}"/></td>
				<td><c:out value="${serviceAssigned.address2}"/></td>
				<td><c:out value="${serviceAssigned.status}"/></td>
			</tr>
			
		</c:forEach>
	
	</table> 
</div>
<h2><a href="home.html">HOME</a></h2>

</body>
</html>