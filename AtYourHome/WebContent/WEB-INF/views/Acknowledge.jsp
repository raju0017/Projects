<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
<div 
		align="right" style="top: 0 ; color: #FA58F4">
		Welcome :<% out.print(session.getAttribute("username"));%><br>	

		<a href="logout.html">LogOut</a>
	</div>

<h1 align="center">Thank You  <% out.print(session.getAttribute("username"));%> For Your Request
				<br> Our Executive Will Contact You</h1>
<div align="center">		
<a href="selectCity.html">Click Here To Go To Booking Menu</a></div>	
</body>
</html>


