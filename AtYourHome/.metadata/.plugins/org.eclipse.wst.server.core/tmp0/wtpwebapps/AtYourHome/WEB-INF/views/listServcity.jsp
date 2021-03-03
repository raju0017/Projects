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
 <c:if test="${!empty servcitys}">
	<table align="center" border="1">
			<tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
		   
			<th>Service Name</th>
			<th>City Name</th>
		    <th>Eff Date</th>
		    <th>Status</th>
			<th>options</th>
		
		</tr>

		<c:forEach items="${servcitys}" var="servcity">
			<tr>
				
				<td><c:out value="${servcity.service.serv_desc}"/></td>
				<td><c:out value="${servcity.city.ct_name}"/></td>
				<td><c:out value="${servcity.eff_date}"/></td>
				<td><c:out value="${servcity.status}"/></td>
				
				<td align="center"><a href="editServcity.html?serv_city_id=${servcity.serv_city_id}">Edit</a> </td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	

</center>
 <h3 style="text-align: center;"> <a href="addServcity.html">Adding new CityServices</a></h3>

</body>
</html>