<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service Request Details </title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  
  table{
  
  padding: 5px 3px 5px 8px;
  }
  body{
  
  background-color:				#B0E0E6;
  
  }
  </style>
</head>
<body>
<div align="right">
<a href="bpoLogin.html"  title="Log out"  target="_parent" >Log Out</a><br>
<a href="index.html" title="Log out" target="_parent" color="red">Go Back</a></div>   
<form>
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
			<th>Assign</th>
		</tr> 

		<c:forEach items="${servicerequests}" var="servicerequest">
		
			<tr align = "center">
				<td><c:out value="${servicerequest.sr_id}"/></td>
				<td><c:out value="${servicerequest.sr_desc}"/></td>
				<td><c:out value="${servicerequest.sr_pers_name}"/></td>
				<td><c:out value="${servicerequest.phoneno}"/></td>
				<td><c:out value="${servicerequest.email}"/></td>
				<td><c:out value="${servicerequest.ep_date}"/></td>
				<td><c:out value="${servicerequest.area.ar_name}"/></td>
				<td><c:out value="${servicerequest.address1}"/></td>
				<td><c:out value="${servicerequest.address2}"/></td>
				<td><c:out value="${servicerequest.status}"/></td>
				<td align="center"><a href="assign.html?sr_id=${servicerequest.sr_id}&sr_desc=${servicerequest.sr_desc}">ASSIGN</a> </td>
			</tr>
			
		</c:forEach>
	
	</table> 
</form>
</body>
</html>