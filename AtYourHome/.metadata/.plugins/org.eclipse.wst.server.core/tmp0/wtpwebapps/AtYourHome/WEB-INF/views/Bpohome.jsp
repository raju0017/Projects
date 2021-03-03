<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="refresh" content="30">

<title>B P O HOME PAGE</title>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script type="text/javascript">
function Search(){
//alert("hai");
var search = document.getElementById("searchId").value;
//alert(search);
//alert(typeof search);
var x = Number(search);
//alert(typeof num);
//var status = Number.isInteger(num);
//alert(status);
if (x != 0){
	alert(x);
	document.getElementById("form1").action = "search.html?x";
	document.getElementById("form1").submit();
	return true;
	}
else{
	alert(status);
	document.getElementById("form1").reset();
	document.getElementById("searchId").focus();
	return false;
	}
}
</script>
<style>
table {
    border-collapse: collapse;
}

table, td, th {
    border: 2px solid black;
}
#table1 {
    border: 2px solid black;
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

<center>
<h1>B P O HOME PAGE</h1>
<div>
<form id = "form1" nmae = "form" method = "post" >
<table id="table1">
<tr>
<th><lable for = "search">Search By RequestId</lable></th>
<td><input type = "integer" name = "search" id = "searchId" ></td>
<td><input type = "submit" value = "Submit" onclick=" return Search()"/></td>
</tr>
</table>
</form>
</div>
<br>
<div>
<table align= "center">
<tr>
<td><a href="Servicerequestpage.html" ><button> Assign Service </button></a></td>
<td><a href="getServiceInProgressList.html" ><button> Service In Progress </button></a></td>
<td><a href="getServiceAssignedList.html?status=inActive"><button> Service Assigned </button></a></td>
</tr>
</table>
</div>
<br>
<br>
<br>
<div class="container">
<table class="table" id="table" >
	
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

		<c:forEach items="${servicerequestList}" var="serviceRequest">
		
			<tr align = "center">
				<td><c:out value="${serviceRequest.sr_id}"/></td>
				<td><c:out value="${serviceRequest.sr_desc}"/></td>
				<td><c:out value="${serviceRequest.sr_pers_name}"/></td>
				<td><c:out value="${serviceRequest.phoneno}"/></td>
				<td><c:out value="${serviceRequest.email}"/></td>
				<td><c:out value="${serviceRequest.ep_date}"/></td>
				<td><c:out value="${serviceRequest.area.ar_name}"/></td>
				<td><c:out value="${serviceRequest.address1}"/></td>
				<td><c:out value="${serviceRequest.address2}"/></td>
				<td><c:out value="${serviceRequest.status}"/></td>
			</tr>
			
		</c:forEach>
	
	</table> 
</div>
</center> 
</body>
</html>