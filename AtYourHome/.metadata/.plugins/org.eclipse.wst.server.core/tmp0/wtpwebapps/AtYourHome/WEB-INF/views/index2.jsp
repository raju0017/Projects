<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script type="text/javascript" src="jquery-1.2.6.min.js"></script>
<title>Hi VSCS | Hello World</title>
<script>
	function dropdownchange() {

		var x = document.getElementById("selectId").value;
		alert("x value " + x);
		if (x === "Electrical") {
			window.location = "electricity.html";
		} else if (x === "Plumbing") {
			window.location = "plumber.html";
		} else {
			window.location = "cleaning.html"
		}
	}
</script>

	<style type="text/css">
.button-0 {
	position: relative;
	padding: 10px 40px;
	margin: 0px 10px 10px 0px;
	float: left;
	border-radius: 10px;
	font-family: 'Helvetica', cursive;
	font-size: 25px;
	color: #FFF;
	text-decoration: none;
	background-color: #3498DB;
	border-bottom: 5px solid #2980B9;
	text-shadow: 0px -2px #2980B9;
	/* Animation */
	transition: all 0.1s;
	-webkit-transition: all 0.1s;
}

.button-0:hover, .button-0:focus {
	text-decoration: none;
	color: #fff;
}

.button-0:active {
	transform: translate(0px, 5px);
	-webkit-transform: translate(0px, 5px);
	border-bottom: 1px solid;
}
</style>
</head>
<body bgcolor="oRANGE">
	<br />
	<br />
	<br />
	<br />
	<center>
		<h1>WELCOME TO HOME SERVICES</h1>
		<h4>${message}</h4>
		<div>
			<h4>
				<!-- 			<a href="electricity.html">Electricity Service</a>
 -->
				<a href="electricity.html" class="button-0">Electricity Service</a>
				<a href="plumber.html" class="button-0">Plumbing Service</a>
				<!-- 			 <a	href="plumber.html">Plumbing Service</a> 
 -->
				<a href="cleaning.html" class="button-0">Cleaning Service</a>
				<!-- 			 <a href="cleaning.html">CleaningService</a> 
 -->
				<a href="beauty.html" class="button-0">Beauty Service</a>
				<!--  <a href="beauty.html">Beauty Service</a><br> <br>
 -->
				<!-- <a href="registerUser.html">Register User</a><br> <a
				href="addSR.html">SR Table</a> -->
				<a href="addSR.html" class="button-0">Service Request</a> <a
					href="registerUser.html" class="button-0">Register User</a><br>
				<a href="userlogin.html" class="button-0">Registered User Login Here</a> 
				
				<a href="admin.html" class="button-0">DropDown</a> 
				<a href="selectCity.html" class="button-0">DropDown222</a> 
				
				<a href="admin.html" class="button-0">Admin</a> 
<a href="addDummy.html" class="button-0">Dummy</a> 

<a href="Bpohome.html" class="button-0">BPO</a> 
<a href="Emplogin.html" class="button-0">BPO EMP LOGIN</a> 
			</h4>
			<br>
		</div>

	

	</center>

	<select id="selectId">
		<option>Electrical</option>
		<option>Plumbing</option>
		<option>Cleaning</option>
	</select>
	<input type="button" value="submit" onclick="dropdownchange();">

</body>
</html>
