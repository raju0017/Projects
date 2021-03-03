<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Details</title>
</head>
<body>
	<center>
	
		<div style="color: teal; font-size: 30px">User Details</div>

		<c:if test="${!empty studentList}">
			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: teal; color: white; text-align: center;"
					height="40px">

					<td>First Name</td>
					<td>Last Name</td>
					<td>Address</td>
					<td>Email</td>
					<td>Phone</td>
					<td>Edit</td>
					<td>Delete</td>
				</tr>
				<c:forEach items="${studentList}" var="student">
					<tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">

						<td><c:out value="${student.firstName}" /></td>
						<td><c:out value="${student.lastName}" /></td>
						<td><c:out value="${student.address}" /></td>
						<td><c:out value="${student.email}" /></td>
						<td><c:out value="${student.phone}" /></td>
						<td><a href="edit.do?id=${student.id}">Edit</a></td>
						<td><a href="delete.do?id=${student.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>


		<a href="form.do">Click Here to add new User</a>
	</center>
</body>
</html>
