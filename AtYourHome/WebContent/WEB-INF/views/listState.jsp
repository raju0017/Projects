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
<c:if test="${!empty states}">

       
	<table align="center" border="1">
			<tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
			<th>State ID</th>
			<th>Country Name</th>
			<th>StateName</th>
			<th>Effective Date</th>
			<th>Options</th>
		</tr>
 
		<c:forEach items="${states}" var="state">
		<div class="form-group">
        <div class="col-xs-9 col-xs-offset-3">
			<tr>
				<td><c:out value="${state.st_id}"/></td>
				<td><c:out value="${state.st_name}"/></td>
				<td><c:out value="${state.country.cnt_name}"/></td>
				<td><c:out value="${state.eff_date}"/></td>
				<td align="center"><a href="editState.html?st_id=${state.st_id}">Edit</a> </td>
			</tr>
			</div>
    </div>
		</c:forEach>
	</table>
</c:if>
</center>
</body>
</html>