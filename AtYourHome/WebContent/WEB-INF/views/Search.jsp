<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>

<style>
table {
    border-collapse: collapse;
}

table, td, th {
    border: 1px solid black;
    width : 500px;
    height :30px;
}
body{

background-color:				#B0E0E6;

}
</style>

</head>
<body bgcolor="grey">
	<center>
		<hl >
		<i><b>Customer Details</b></i></hl>
		<br> <br>
		<div>
			<form>
				<table align = "center" >

					<tr align = "center">
						<th >Customer Name</th>
						<td >${searchService.sr_pers_name }</td>
					</tr>
					<tr align = "center">
						<th>Service</th>
						<td>${searchService.sr_desc }</td>
					</tr>
					<tr align = "center">
						<th>Email</th>
						<td>${searchService.email }</td>
					</tr>
					<tr align = "center">
						<th>Mobile Number</th>
						<td>${searchService.phoneno }</td>
					</tr>
					<!-- <tr>
					<th>Employee Assigned</th>
					<td></td>
				</tr>
				<tr>
					<th>Emp Mobile Number</th>
					<td></td>
				</tr> -->
					<tr align = "center">
						<th>Address1</th>
						<td>${searchService.address1 }</td>
					</tr>
					<tr align = "center">
						<th>Address2</th>
						<td>${searchService.address2 }</td>
					</tr>
					<tr align = "center">
						<th>EXP Date</th>
						<td>${searchService.ep_date }</td>
					</tr>
					<tr align = "center">
						<th>Status</th>
						<td>${searchService.status }</td>
					</tr>

				</table>
			</form>
			<h2><a href="home.html">HOME</a></h2>
		</div>
	</center>
</body>
</html>