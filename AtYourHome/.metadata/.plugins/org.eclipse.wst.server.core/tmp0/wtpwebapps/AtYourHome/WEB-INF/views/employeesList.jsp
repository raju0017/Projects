<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Employees</title>
</head>
<body>
<h1>List Employees</h1>
<h3><a href="add.html">Add More Employee</a></h3>

<c:if test="${!empty employees}">
	<table align="left" border="1">
		<tr>
			<th>Sr ID</th>
			<th>Sr Name</th>
			<th>User Name</th>
			<th>Phone</th>
			<th>Address1</th>
			<th>Address2</th>
			<th>ep_date</th>
			<th>sr_date</th>
			<th>email</th>
			<th>ar_name</th>
			<th>sub service Name</th>
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${sr.sr_id}"/></td>
				<td><c:out value="${sr.sr_desc}"/></td>
				<td><c:out value="${sr.sr_pers_name}"/></td>
				<td><c:out value="${sr.phone}"/></td>
				<td><c:out value="${sr.address1}"/></td>
				<td><c:out value="${sr.address2}"/></td>
				<td><c:out value="${sr.ep_date}"/></td>
				<td><c:out value="${sr.sr_date}"/></td>
				<td><c:out value="${sr.email}"/></td>
				<td><c:out value="${sr.ar_name}"/></td>
				<td><c:out value="${sr.sub_serv_name}"/></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>