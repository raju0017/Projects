<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>B P O</title>
	</head>
	<body><center>
		<h1>Service attend Table</h1>
  <c:if test="${!empty srattends}">
	<table align="center" border="1">
		<tr>
			<th>SR att id</th>
			<th>person Name</th>
			<th>number</th>
			<th>mail id</th>
			<th>adress </th>
			<th>adress</th>
			<th>back ground</th>
			<th>area id fk</th>
			<th>serv id fk</th>
			<th>eff date</th>

			
			<th>status</th>
		</tr>

		<c:forEach items="${srattends}" var="srattend">
			<tr>
				<td><c:out value="${srattend.serv_attend_id}"/></td>
				<td><c:out value="${srattend.name}"/></td>
				<td><c:out value="${srattend.phoneno}"/></td>
				<td><c:out value="${srattend.email}"/></td>
				<td><c:out value="${srattend.address1}"/></td>
				<td><c:out value="${srattend.address2}"/></td>
				<td><c:out value="${srattend.background_check}"/></td>
				<td><c:out value="${srattend.area.ar_name}"/></td>
				<td><c:out value="${srattend.service.serv_desc}"/></td>
				<td><c:out value="${srattend.eff_date}"/></td>
				<td><c:out value="${srattend.status}"/></td>
				
				
				 <!--  <td align="center"><a href="editCategory.html?categoryId=${category.categoryId}">ASSIGN</a> </td>-->
			</tr>
		</c:forEach>
	
	</table>
</c:if>

<h2><a href="home.jsp">HOME</a></h2>
</center>
	</body>
</html>