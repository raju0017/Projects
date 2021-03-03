<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>B P O</title>
		  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<script type="text/javascript">

function getServiceDetails(){
			var x=(document.getElementById("serviceId").value);
			if(navigator.appName == "Microsoft Internet Explore"){
				obj = new ActiveXObject("Microsoft.XMLHTTP");
			}
			else{
				obj = new XMLHttpRequest();
			}
			obj.open("GET","getServiceDetails.html?service="+x,true);
			obj.send();
			obj.onreadystatechange = function() {
				
				if (obj.readyState == 4 && obj.status == 200) {
					var sub = obj.responseText;
					//alert(sub);
					document.getElementById("serviceRequeestId").innerHTML = obj.responseText;
				}
			};	
		}
</script>
<style>

table {
    border-collapse: collapse;
}

table, td, th {
    border: 2px solid black;
}
body
{

background-color:				#B0E0E6;

}
</style>
	</head>
	<body><center>
		<h1>Service Request Table</h1>
	<form action = "#" method = "get">
	<table align="center" >
		<tr>
			<th>Services</th>
			<td><select name = "service" id = "serviceId" onchange = "getServiceDetails()">
			<option>-- Select --</option>
			<c:forEach items="${services}" var="service">
			<option value = "${service.serv_desc}">${service.serv_desc }</option>
			</c:forEach>
			</select> 
			</td>
		</tr>
	</table>
	<br>
	<div id = "serviceRequeestId"></div>
	
	</form>
		<h2><a href="/WEB-INF/view/home.jsp">HOME</a></h2>
	</center>
	</body>
	
	
</html>