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

  <div style="color: teal; font-size: 30px">Home Services | Service
   Details</div>
  <c:if test="${!empty subservices}">
	<table align="center" border="1">
			<tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
			<th>SubService ID</th>
			<th>SubService Name</th>
			<th>Service Name</th>
			<th>Effected Date</th>
			<th>Status</th>
			<th>Options</th>
		</tr>

		<c:forEach items="${subservices}" var="subservice">
			<tr>
				<td><c:out value="${subservice.sub_serv_id}"/></td>
				<td><c:out value="${subservice.sub_serv_desc}"/></td>
				<td><c:out value="${subservice.service.serv_desc}"/></td>
				<td><c:out value="${subservice.eff_date}"/></td>
				<td><c:out value="${subservice.status}"/></td>
				<td align="center"><a href="editSubService.html?sub_serv_id=${subservice.sub_serv_id}">Edit</a></td>
		</c:forEach>
	</table>
</c:if>
</center>
<h3 style="text-align: center;"> <a href="addSubService.html">Adding SubService</a></h3>
</body>
</html>