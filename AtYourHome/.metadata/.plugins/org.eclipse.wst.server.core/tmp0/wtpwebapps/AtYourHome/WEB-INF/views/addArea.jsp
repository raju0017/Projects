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
        	  ar_name: {
                  required: true,
                  maxlength: 20
               },
               near_landmark: {
                  required: true,
                  
 
               },
               
              
               status: {
                   required: true,
                 
                },
                CityName:{
            	   
                    required: true,

            	   
               }
            },
            messages: {
            	ar_name: {
                  required: "Area Name required",
                 
               },
               near_landmark: {
                  required: "landmark required",
                 
               },
			  
               status: {
                   required: "status required",
                  
                },
                CityName: {
                    required: "CityName required",
                   
                 }
            }
         });
    
});

/* var e = document.getElementById("city");
var strUser = e.options[e.selectedIndex].value;
var e = document.getElementById("status");
var strUser = e.options[e.selectedIndex].value; */

</script>

</head>


<body style="width:98%;">
<div align="right">
<a href="index.html"  title="Log out"  target="_parent" >Log Out</a><br>
<a href="admin.html" title="Log out" target="_parent" color="red">Go Back</a></div>   

<form:form  id="contactForm" action="saveArea.html" method="post" class="form-horizontal">
<h3 style="text-align: center;"> Create Areas</h3>
 		<div>
			    <div>
			        <div><form:label path="ar_id"></form:label></div>
			        <div><form:input path="ar_id" type="hidden"/></div>
			    </div>
			    <div class="row">
			        <div class="col-sm-4"><form:label path="ar_name">Area Name:</form:label></div>
			        <div class="col-sm-4"><form:input path="ar_name" value="${area.ar_name}" name="ar_name"/></div>
			    </div>
			    
			    <br>
			    
			    <div class="row">
			        <div class="col-sm-4"><form:label path="near_landmark">Land mark:</form:label></div>
			        <div class="col-sm-4"><form:input path="near_landmark" value="${area.near_landmark}" name="near_landmark"/></div>
			    </div>
			    
			    <br>
			    
			    <div class="row">
				    <div class="col-sm-4"><form:label path="city.ct_id">City Name:</form:label></div>
				    <div class="col-sm-4">
				   		<form:select  path="city.ct_id" name="city.ct_id" cssStyle="width: 175px;">    
							<option >Select Type</option>
							<c:forEach items="${cities}" var="city">
								<option value="${city.ct_id}" >${city.ct_name}  </option>
							</c:forEach>
						</form:select>
					</div>
			    </div>
			    
			   <br>
			   
			   <div class="row">
			     <div class="col-sm-4"><form:label path="status" >Status:</form:label></div>
			     <div class="col-sm-4">
			        <form:select  name="status" path="status" cssStyle="width: 175px;" > 
			        	<option value="0">Select Type</option>
			        	<option value="1" >Active</option>
			        	<option value="2" >Inactive</option>
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
  <c:if test="${!empty areas}">
	<table class="table table-bordered">
		<thead>
		<tr>
			<th>AREA ID</th>
			<th>Area Name</th>
			<th>Land Mark</th>
			<th>City Name</th>
			<th>Status</th>
			<th>Options</th>
		</tr>	
		</thead>
	<tbody>
		<c:forEach items="${areas}" var="area">
			<tr>
				<td><c:out value="${area.ar_id}"/></td>
				<td><c:out value="${area.ar_name}"/></td>
				<td><c:out value="${area.near_landmark}"/></td>
				<td><c:out value="${area.city.ct_name}"/></td>
				<td><c:out value="${area.status}"/></td>
				<td align="center"><a href="editArea.html?ar_id=${area.ar_id}">Edit</a> 
				
				</td>
				
			</tr>
		</c:forEach>
</tbody>		
	</table>
</c:if>
</div>
</div>
</body>
</html>