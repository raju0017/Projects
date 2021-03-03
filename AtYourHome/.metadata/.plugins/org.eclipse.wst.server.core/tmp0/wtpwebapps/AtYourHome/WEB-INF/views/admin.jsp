<%@include file="include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login</title>
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
     <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
  <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
		
		<style type="text/css">

form{  
    width:50%; 
    margin:0 auto;
}
  span {
	color: red;
}
body {

background-color : #EAF4D9;
}
  </style>
		
		
		
		
		 <script>
  
$(document).ready(function() {

    $('#adminForm').validate({

    	
       
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
          rules: {
        	  username: {
                  required: true,
                 
               },
               password: {
                  required: true,
                   maxlength: 8
               }
              
			  
            },
            messages: {
            	username: {
                  required: "username required",
                 
               },
               password: {
                  required: "password required",                 
               }
               
            }
         });
    
});
</script> 
	</head>
	<body>
	
		<font color="red">${message}</font>
		<form:form id="adminForm" method="post" action="admin.html" modelAttribute="AdminBean">
<h3 style="text-align: center;"> Admin Login</h3>
<br>
<div>

<div class="row">
			        <div class="col-sm-4">
			<form:label path="username">Enter your user-name</form:label></div>
			
			<div class="col-sm-4"><form:input id="username" name="username" path="username" /></div>
			 </div>
			
			<br>
			
			<div class="row">
			        <div class="col-sm-4">
			<form:label path="username">Please enter your password</form:label>
			 </div>
		<div class="col-sm-4">	<form:password id="password" name="password" path="password" /><br>
			 </div>
			</div>
			
			 <br>
			    <div class="row">
			      <div style="text-align:center;"><input type="submit" ></div>
		      	</div>
			
		 </div>		
		</form:form>
	</body>
</html>