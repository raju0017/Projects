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
<c:if test="${!empty areas}">
	<table align="center" width="600px" border="1">
		<tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
			<th>AREA ID</th>
			<th>Area Name</th>
			<th>Land Mark</th>
			<th>city Name</th>
			<th>status</th>
			<th>options</th>
		</tr>

		<c:forEach items="${areas}" var="area">
			<tr>
				<td><c:out value="${area.ar_id}"/></td>
				<td><c:out value="${area.ar_name}"/></td>
				<td><c:out value="${area.near_landmark}"/></td>
				<td><c:out value="${area.city.ct_name}"/></td>
				<td><c:out value="${area.status}"/></td>
				<td align="center"><a href="editArea.html?ar_id=${area.ar_id}">Edit</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</center>
</body>
</html>