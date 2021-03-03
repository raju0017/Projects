<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Services|Register Service</title>

<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script
	src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/jquery.validate.min.js"></script>
<style type="text/css">
form {
	width: 50%;
	margin: 0 auto;
}

span {
	color: red;
}
</style>

<script>
  
$(document).ready(function() {

    $('#contactForm').validate({

    	
       
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
          rules: {        
            	   ep_date:
            	   {
            	   
            	   required: true,
            	   } 
            },
            messages: {
                   
                   ep_date: {
                       required: "date required",
                      
                    },
                    
            }
         });
    
});
</script>

</head>
<body>
	<h2 align="center">Wel Come To Home Services</h2>
	<hr width=600>
	<div align="right" style="top: 0">
		<%if(session.getAttribute("userName")!=null){ %>
		Welcome :<% out.print(session.getAttribute("username"));%>
		<%} %>&nbsp;
		<center>Welcome ${loggedInUser}</center>

		<a href="logout.html">LogOut</a>
	</div>
	<form:form id="contactForm" action="save.html" method="post"
		class="form-horizontal">

		<div>
			<div class="row">
				<div class="col-sm-4">
					<form:select path="ep_date">  Service Expecting Date:</form:select>
				</div>
				<div class="col-sm-4">
					<form:input path="ep_date"  name="ep_date" type="date" />
				</div>
			</div>

			<br>
			<div class="row">
				<div class="col-sm-4">
					<form:label path="sr_date"> RequestedDate:</form:label>
				</div>
				<div class="col-sm-4">
					<form:input path="sr_date" value="" name="sr_date" type="date" />
				</div>
			</div>

			<br>
			<div class="row">
				<div style="text-align: center;">
					<input type="submit" value="   Request a Service" />
				</div>
			</div>
			<br>
			<div class="row">
				<div style="text-align: center;">
					<input type="submit" value="SAVE" />
				</div>
			</div>
		</div>
	</form:form>


</body>
</html>