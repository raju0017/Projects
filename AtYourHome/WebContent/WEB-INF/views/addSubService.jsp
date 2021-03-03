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
body {

background-color : #EAF4D9;
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
               sub_serv_desc: {
                  required: true,
                    maxlength: 20
               },
               eff_date: {
                  required: true,
                  
 
               },
               status: {
                   required: true,
                   
  
                }
			  
			  
            },
            messages: {
               sub_serv_desc: {
                  required: "SubService  Name required",
                 
               },
               eff_date: {
                  required: "effdate required",
                 
               },
               status: {
                   required: "Status required",
                    
                  }

            }
         });
    
});
</script>
  
</head>


<body style="width:98%;">

<form:form  id="contactForm"  method="post"  action="saveSubService.html" class="form-horizontal">
<div align="right">
<a href="index.html" title="Log out" target="_parent" align="right">Log Out</a><br>
<a href="admin.html" title="Log out" target="_parent" color="red">Go Back</a>
</div>
<h3 style="text-align: center;"> Create New SubService</h3>

<div>
			   <div>	
			
			        <div><form:label path="sub_serv_id"></form:label></div>
			        <div><form:input path="sub_serv_id" type="hidden" value="${subservice.sub_serv_id}" readonly="true"/></div>
			    </div>
			   <div class="row">
			     <div class="col-sm-4"><form:label path="sub_serv_desc">SubService Name :</form:label></div>
			        <div class="col-sm-4"><form:input path="sub_serv_desc" value="${subservice.sub_serv_desc}" name="sub_serv_desc"/></div>
			    </div>
			    <br/>
			   <div class="row">
				  <div class="col-sm-4">
				    	<form:label path="service.serv_id">Service Name :</form:label>
				    </div>
				<div class="col-sm-4">
				   		<form:select path="service.serv_id" cssStyle="width: 175px;">    
							<option value="-1">Select a type</option>
							<c:forEach items="${services}" var="service">
								<option value="${service.serv_id}">${service.serv_desc}</option>
							</c:forEach>
						</form:select>
					</div>
			    </div><br/>
			      <div class="row">
			       <div class="col-sm-4"><form:label path="eff_date">Effective Date :</form:label></div>
			     <div class="col-sm-4"><form:input path="eff_date" type="date" value="${subservice.eff_date}" cssStyle="width: 175px;"/></div>
			    </div>		   <br/>
			      <div class="row">
			       <div class="col-sm-4"><form:label path="status" value="${subservice.status}">Status :</form:label></div>
			        
			       <div class="col-sm-4">
			        <form:select  name="status" path="status" cssStyle="width: 175px;" > 
	        	<option value="">Select Type</option>
	        	<option value="Active">Active</option>
	        	<option value="Inactive">Inactive</option>
	       </form:select>
	       </div>
			        
			    </div>
			   <br/>
			    <div class="row">
			      <div style="text-align:center;"><input type="submit" value="SAVE"/></div>
		      	</div>
</div> 
		</form:form>
		<br/>
<div class="row">
	<div class="col-sm-2"></div>
        <div class="col-sm-8">	
  	<c:if test="${!empty subservices}">
<table class="table table-bordered">
	<thead>
		<tr>
			<th>SubService ID</th>
			<th>SubService Name</th>
			<th>Service Name</th>
			<th>Effective Date</th>
			<th>Status</th>
			<th>Options</th>
		</tr>
</thead>
		<tbody>
		<c:forEach items="${subservices}" var="subservice">
			<tr>
				<td><c:out value="${subservice.sub_serv_id}"/></td>
				<td><c:out value="${subservice.sub_serv_desc}"/></td>
				<td><c:out value="${subservice.service.serv_desc}"/></td>
				<td><c:out value="${subservice.eff_date}"/></td>
				<td><c:out value="${subservice.status}"/></td>
				<td align="center"><a href="editSubService.html?sub_serv_id=${subservice.sub_serv_id}">Edit</a> </td>
			</tr>
		</c:forEach>
		</tbody>	
	</table>
</c:if>
</div>
</div>
<h2><a href="addSubService.html">Adding SubService</a></h2>


</body>
</html>