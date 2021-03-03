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
<c:if test="${!empty cities}">
	<table align="center" width="600px" border="1">
		<tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
			<th>City ID</th>
			<th>City Name</th>
			<th>State Name</th>
		   <th>Eff date</th>
		<th>status</th>
					<th>options</th>
		</tr>

		<c:forEach items="${cities}" var="city">
			<tr>
				<td><c:out value="${city.ct_id}"/></td>
				<td><c:out value="${city.ct_name}"/></td>
				<td><c:out value="${city.state.st_name}"/></td>
				<td><c:out value="${city.eff_date}"/></td>
				<td><c:out value="${city.status}"/></td>
				
				<td align="center"><a href="editCity.html?ct_id=${city.ct_id}">Edit</a> | <a href="deleteCity.html?ct_id=${city.ct_id}">Delete</a></td>
			</tr>
			
		</c:forEach>
		
	</table>
</c:if>
</center>
 <h3 style="text-align: center;"> <a href="addArea.html" >Adding Area</a></h3>
</body>
</html>