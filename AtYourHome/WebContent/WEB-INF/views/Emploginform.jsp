<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring3Example</title>
</head>
<body>
<h3>Login Form</h3>
<FONT color="blue">
User Name="UserName" and password="password"
</FONT>
<form:form action="Emplogin.html"  commandName="loginForm">
	<table>
		<tr>
			<td>User Name:<FONT color="red"><form:errors
				path="Emp_name" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="Emp_name" /></td>
		</tr>
		<tr>
			<td>Password:<FONT color="red"><form:errors
				path="address" /></FONT></td>
		</tr>
		<tr>
			<td><form:password path="address" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>