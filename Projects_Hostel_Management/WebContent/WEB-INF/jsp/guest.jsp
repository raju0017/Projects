<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hostel management</title>
</head>
<body>
	<h1>Guests Data</h1>
<form:form action="guest.do" method="POST" commandName="guest">
	
	<table>
		<tr>
			<td>Guest ID</td>
			<td><form:input path="id"/></td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>Name</td>
			<td><form:input path="name"/></td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>Email</td>
			<td><form:input path="email"/></td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>Address</td>
			<td><form:input path="address"/></td>
		</tr>
		
		<tr>
			<td>Phone</td>
			<td></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><form:input path="phone"/></td>
		</tr>
		<tr>
			<td>Joining Data</td>
			<td><form:input path="joiningdate"/></td>
		</tr>
		<tr>
			<td>Ending Data</td>
			<td><form:input path="endingdate"/></td>
		</tr>
		<tr>
			<td>Advance Amount</td>
			<td><form:input path="advance"/></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" name = "action" value ="Add"/>
				<input type="submit" name = "action" value ="Edit"/>
				<input type="submit" name = "action" value ="Delete	"/>
				<input type="submit" name = "action" value ="Search"/> 
			</td>
		</tr>
	</table>
	
	
</form:form>
<br>

<table border="1">
	<th>ID</th>
	<th>Name</th>
	<th>Email</th>
	<th>Phone</th>
	<th>Address</th>
	<th>Joining Data</th>
	<th>Ending date</th>
	<c:forEach items="${gusetList}" var="guest" ></c:forEach>
	
	<tr>
		<td>${guest.guestID}</td>
		<td>${guest.name}</td>
		<td>${guest.email}</td>
		<td>${guest.phone}</td>
		<td>${guest.address}</td>
		<td>${guest.joiningdate}</td>
		<td>${guest.endingdate}</td>
	</tr>
</table>

</body>
</html>