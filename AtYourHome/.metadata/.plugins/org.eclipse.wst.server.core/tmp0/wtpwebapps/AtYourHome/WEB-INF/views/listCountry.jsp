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

<c:if test="${!empty countries}">
	<table align="center"  width="600px" border="1">
		<tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
			<th>country ID</th>
			<th>country Name</th>
			<th>Effected Date</th>
		
			<th>Options</th>
		</tr>

		<c:forEach items="${countries}" var="country">
			<tr
      style="background-color: white; color: black; text-align: center;"
      height="30px">
				<td><c:out value="${country.cnt_id}"/></td>
				<td><c:out value="${country.cnt_name}"/></td>
				<td><c:out value="${country.eff_date}"/></td>
				
				<td align="center"><a href="editCountry.html?cnt_id=${country.cnt_id}">Edit</a> </td>
		</c:forEach>
	</table>
</c:if>
</center>
<h3 style="text-align: center;"> <a href="addState.html">click here to add State</a></h3>

</body>
</html>