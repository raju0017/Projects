<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Services|Register Service</title>

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
               
               eff_date: {
                  required: true,
                  
 
               }
			  
			  
            },
            messages: {
               
               eff_date: {
                  required: "effdate required",
                 
               }
			  

            }
         });
    
});
</script>
  
</head>


<body>

<form:form  id="contactForm" action="/sdnext/saveServcity.html" method="post" class="form-horizontal">
<h3 style="text-align: center;"> Create new servcity</h3>

	 <div>
			  
			  
			  	<div>
			        <div><form:label path="serv_city_id"></form:label></div>
			   <div><form:input path="serv_city_id" type="hidden"/></div>
			    </div>
			 
			    
			 <div class="row"> 
				      <div class="col-sm-4">
				    	<form:label path="city.ct_id">City Name:</form:label>
				    </div>
				      <div class="col-sm-4">
				   		<form:select path="city.ct_id" cssStyle="width: 175px;" name="city.ct_id">    
							<option value="-1">Select a type</option>
							<c:forEach items="${cities}" var="city">
								<option value="${city.ct_id}">${city.ct_name}</option>
							</c:forEach>
						</form:select>
					</div>
			    </div>
			      		  
			     <br>	
			     <div class="row"> 
			    <div class="col-sm-4">
				 
				    	<form:label path="service.serv_id">Service Name :</form:label>
				    </div>
				<div class="col-sm-4">
				   		<form:select path="service.serv_id" cssStyle="width: 175px;" name="service.serv_id">    
							<option value="-1">Select a type</option>
							<c:forEach items="${services}" var="service">
								<option value="${service.serv_id}">${service.serv_desc}</option>
							</c:forEach>
						</form:select>
					</div>
			    </div>
			      		  
			     <br>	
			      <div class="row">
			    <div class="col-sm-4">
			        <form:label path="eff_date">Effective Date :</form:label></div>
			          <div class="col-sm-4"><form:input type="date" path="eff_date" value="${serv_city.eff_date}" cssStyle="width: 175px;"/></div>
			  </div>
			         		  
			     <br>	
			  		 <div class="row">
			     <div class="col-sm-4"><form:label path="status"  value="${serv_city.status}">Status  :</form:label></div>
			     <div class="col-sm-4">
			        <form:select  name="status" path="status" cssStyle="width: 175px;" > 
			        	<option value="">Select Type</option>
			        	<option value="Active">Active</option>
			        	<option value="Inactive">Inactive</option>
		       		</form:select>
	       		</div>
			  </div>	   	
		
			  
			     <br>	
			  <div class="row">
			      <div style="text-align:center;"><input type="submit" value="SAVE"/></div>
		      	</div>
		
	 </div>   		      
			
		</form:form>
		<br/>
		<div class="row">
<div class="col-sm-2"></div>
<div class="col-sm-8">
  <c:if test="${!empty servcitys}">
<table class="table table-bordered">
	<thead>
		<tr>
		    <th>Service City Id</th>
			<th>Service Name</th>
			<th>City Name</th>
		    <th>Effective Date</th>
		    <th>Status</th>
			  <th>Options</th>
		
		</tr>
	</thead>
		<tbody>
		<c:forEach items="${servcitys}" var="servcity">
			<tr>
				
				<td><c:out value="${servcity.service.serv_desc}"/></td>
				<td><c:out value="${servcity.city.ct_name}"/></td>
				<td><c:out value="${servcity.eff_date}"/></td>
				<td><c:out value="${servcity.status}"/></td>
				<td><c:out value="${servcity.serv_city_id}"/></td>
				<td align="center"><a href="editServcity.html?serv_city_id=${servcity.serv_city_id}">Edit</a> </td>
			</tr>
		</c:forEach>
			</tbody>	
	</table>
</c:if>
</div>
</div>
 <h2><a href="listServcity.html">Click Here to See List Of Services based on cities</a></h2>
   
   


</body>
</html>