<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Service Assign</title>

</head>
<body>
<div align="right">
<a href="bpoLogin.html"  title="Log out"  target="_parent" >Log Out</a><br>
<a href="index.html" title="Log out" target="_parent" color="red">Go Back</a></div>   
<div class="container">
<form action = "Success.html" method = "post">
<table class="table">  
<tr> 
<th>User Name</th>
<td><input value ="${customer.sr_pers_name}" name = "username" readonly /></td>
</tr>
<tr> 
<th>Email</th>
<td><input value ="${customer.email}" name = "email" readonly /></td>
</tr>
<tr>
<th>Service</th>
<td><input value ="${customer.sr_desc}" name = "service" readonly /></td>
</tr>
<tr>
<th>Address1</th>
<td><input value = "${customer.address1 }" name = "address1"readonly /></td>
</tr>
<tr>
<th>Address2</th>
<td><input value = "${customer.address2 }" name = "address2"readonly /></td>
</tr>
<tr>
<th>Exp.Date</th>
<td><input value = "${customer.ep_date }" name = "expdate" readonly /></td>
</tr>
<tr>
<th>Mobile Number</th>
<td><input value = "${customer.phoneno }" name = "mobile" readonly /></td>
</tr>
<tr>
<th>Employee</th>
<td><select name = "employee">
<option>-- Select --</option>
<c:forEach items = "${employee}" var = "employee">
<option value = "${employee.emp_name}">${employee.emp_name}</option>
</c:forEach>
</select>
</td>
</tr>
<tr>
<td></td>
<td><input name = "submit" type = "submit" value ="Submit"/></td>
</tr>
</table>
</form>
</div>
<h2><a href="index.html">HOME</a></h2>
</body>
</html>