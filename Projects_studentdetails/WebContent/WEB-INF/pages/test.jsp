<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
	<center>

		<div style="color: teal; font-size: 30px">Registration Form</div>

		<form:form id="registerForm" modelAttribute="student" method="post"
			action="register.do">
			<table width="400px" height="150px">
				<tr>
					<td><form:label path="firstName">First Name</form:label></td>
					<td><form:input path="firstName" /></td>
				</tr>
				<tr>
					<td><form:label path="lastName">Last Name</form:label></td>
					<td><form:input path="lastName" /></td>
				</tr>
				<tr>
					<td><form:label path="address">Address</form:label></td>
					<td><form:textarea path="address" /></td>
				</tr>
				<tr>
					<td><form:label path="email">Email</form:label></td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td><form:label path="phone" length="10">Phone</form:label></td>
					<td><form:input path="phone" length="10" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form:form>
		<a href="list.do">Click Here to see User List</a>
	</center>
</body>
</html>
