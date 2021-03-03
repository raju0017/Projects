<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<c:if test="${!empty employees}">
	<table align="center" width="700px" border="1">
		<tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
		 
	     <td>Employee Name</td>
	     <td>Email</td>
	     <td>Address1</td>
	     <td>Address2 </td>
	     <td>phone number</td>
	     <td>Eff_Date</td>
	     <td>Status</td>
		 <th>Options</th>
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				
				<td><c:out value="${employee.ename}"/></td>
				<td><c:out value="${employee.email}" /></td>				
				<td><c:out value="${employee.address1}"/></td>
				<td><c:out value="${employee.address2}"/></td>
				<td><c:out value="${employee.phoneno}" /> </td>
                 <td><c:out value="${employee.eff_date}"/></td>
				<td><c:out value="${employee.status}"/></td>
				<td align="center"><a href="editEmployee.html?emp_id=${employee.emp_id}">Edit</a> </td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</center>
</body>
</html>