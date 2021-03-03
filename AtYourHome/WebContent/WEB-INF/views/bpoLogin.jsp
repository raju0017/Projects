<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BPO Login</title>
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

    $('#BPoForm').validate({

    	
       
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
<form id="BpoForm" action = "bpoLogin.html" method = "post" name = "form1">
	<table>
		<tr>
			<th><label>UserName</label></th>
			<td><input type = "text" name = "username" ></td>
		</tr>
		<tr>
			<th><label>Password</label></th>
			<td><input type = "password" name = "Password"> </td>
		</tr>
		<tr>
			<th><label></label></th>
			<td><input type = "submit" name = "Submit" value = "Submit" ></td>
		</tr>
		<tr>
			<td><span>${errorMsg}</span></td>
		</tr>
	</table>
</form>
</body>
</html>