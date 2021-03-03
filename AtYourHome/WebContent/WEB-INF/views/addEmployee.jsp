<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
		
		
		
		
	</head>
	<body>
		<h2>Book Your Service</h2>
		<form:form method="POST" action="save.html">
	   		<table>
			    <tr>
			        <td><form:label path="sr_id">Service ID:</form:label></td>
			        <td><form:input path="sr_id" value="${sr.sr_id}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="sr_desc">Service Name:</form:label></td>
			        <td><form:input path="sr_desc" value="${sr.sr_desc}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="sr_pers_name">Name</form:label></td>
			        <td><form:input path="sr_pers_name" value="${sr.sr_pers_name}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="phone">Phone:</form:label></td>
			        <td><form:input path="phone" value="${sr.phone}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="address1">Address1:</form:label></td>
                    <td><form:input path="address1" value="${sr.address1}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="address2">Employee Address2:</form:label></td>
                    <td><form:input path="address2" value="${sr.address2}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="ep_date">Expected Date</form:label></td>
                    <td><form:input path="ep_date" value="${sr.ep_date}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="sr_date">Service Request Date</form:label></td>
                    <td><form:input path="sr_date" value="${sr.sr_date}" placeholde="dd-MM-yyyy" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email" value="${sr.email}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="ar_name">Area Name:</form:label></td>
                    <td><form:input path="ar_name" value="${sr.ar_name}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="sub_serv_name">Sub Serv Name</form:label></td>
                    <td><form:input path="sub_serv_name" value="${sr.sub_serv_name}"/></td>
			    </tr><tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
  <c:if test="${!empty employees}">
		<h2>List Employees</h2>
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Age</th>
			<th>Employee Salary</th>
			<th>Employee Address</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"/></td>
				<td><c:out value="${employee.name}"/></td>
				<td><c:out value="${employee.age}"/></td>
				<td><c:out value="${employee.salary}"/></td>
				<td><c:out value="${employee.address}"/></td>
				<td align="center"><a href="edit.html?id=${employee.id}">Edit</a> | <a href="delete.html?id=${employee.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	</body>
</html> --%>