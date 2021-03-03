<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
  <head>
    <meta charset="UTF-8">
    <title>At Your Home</title>
         <link rel="stylesheet" href="css/style1.css">
  </head>
  <body>
    <div class="wrapper">
	<div class="container">
		<h1>Welcome</h1>
			<form:form commandName="userRegister" action="userlogin.html" >
				<table align="center">
					  <tr>
					    <td><form:label path="username" >User Name:</form:label></td>
					    <td>
					     <form:input path="username"/>     
					    </td>
					  </tr>
					  <tr>
					    <td></td>
					    <td>
					      <FONT color="red"><form:errors path="username"></form:errors></FONT>
					    </td>
			  			</tr>
					  <tr>
					    <td><form:label path="password"  >Password:</form:label></td>
					    <td>
					      <form:password path="password" />      
					    </td>
					  </tr>
					  <tr>
					    <td></td>
					    <td>
					      <FONT color="red"><form:errors path="password"></form:errors></FONT>
					    </td>
					  </tr>
					  <tr>
					    <td></td>
					    <td>
					      <input type="submit" value="Login"/> or
					      <a href="registerUser.html"> Sign up</a>
					    </td>
					  </tr> 
			 </table>
		</form:form> 
	</div>
				<ul class="bg-bubbles">
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
				</ul>
	<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
    <script src="js/index.js"></script>
	</div>
    
  </body>