<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>

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
  </style>
  <!-- <script>
 
$(document).ready(function() {

    $('#contactForm').validate({

    	
       
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
          rules: {
               serv_desc: {
                  required: true,
                    maxlength: 20
               },
               eff_date: {
                  required: true,
                  
 
               }
			  
			  
            },
            messages: {
               serv_desc: {
                  required: "servicename required",
                 
               },
               eff_date: {
                  required: "effdate required",
                 
               }
			  

            }
         });
    
});
</script>
   -->
</head>


<body>

<form  id="contactForm"  method="post"  action="/sdnext/saveService.html" class="form-horizontal">
<h3 style="text-align: center;"> Create New Service</h3>
    <div class="form-group">
        <label class="col-xs-3 control-label" type="hidden" path="serv_id" ></label>
        <div class="col-xs-4">
            <input  class="form-control" type="hidden" name="serv_id" readonly="true" />
        </div>
        <div class="col-xs-5 messageContainer"></div>
    </div>
 <div class="form-group">
        <label class="col-xs-3 control-label" path="serv_desc" value="${service.serv_desc}">Service Name</label>
        <div class="col-xs-4">
            <input type="text" class="form-control" name="serv_desc" />
        </div>
        <div class="col-xs-5 messageContainer"></div>
    </div>
	
    <div class="form-group">
        <label class="col-xs-3 control-label" path="eff_date" value="${service.eff_date}">Effective Date</label>
        <div class="col-xs-4">
            <input type="date" class="form-control" name="eff_date" />
        </div>
        <div class="col-xs-5 messageContainer"></div>
    </div>

    <div class="form-group">
        <label class="col-xs-3 control-label"  path="status" value="${service.status}">Status</label>
        <div class="col-xs-4">
		     
        	 
		 <select required  class="form-control" name="status"> 
	        	<option value="">Select Type</option>
	        	<option value="Active">Active</option>
	        	<option value="Inactive">Inactive</option>
	       	</select>
       </div>
        <div class="col-xs-5 messageContainer"></div>
    </div>

   <div class="form-group">
        <div class="col-xs-9 col-xs-offset-3">
            <button type="submit" class="btn btn-default"  >SAVE</button>
        </div>
    </div>
</form>


 <c:if test="${!empty services}">
	<table align="center" border="1">
		<tr>
			<th>Service ID</th>
			<th>Service Name</th>
			<th>Effected Date</th>
			<th>Status</th>
			<th>Options</th>
		</tr>

		<c:forEach items="${services}" var="service">
			<tr>
				<td><c:out value="${service.serv_id}"/></td>
				<td><c:out value="${service.serv_desc}"/></td>
				<td><c:out value="${service.eff_date}"/></td>
				<td><c:out value="${service.status}"/></td>
				
				<td align="center"><a href="editService.html?serv_id=${service.serv_id}">Edit</a> | <a href="deleteService.html?serv_id=${service.serv_id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if> 
    <h2><a href="listService.html">Click Here To List Services</a></h2>


<!-- <div class="form-group">
        <div class="col-xs-10 col-xs-offset-4">
            <a href="listService.html">Click Here to see list of Services</a>
        </div>
    </div>
 -->
</div>
</body>
</html>