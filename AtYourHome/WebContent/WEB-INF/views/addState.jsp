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
		  
               st_name: {
                  required: true,
                    maxlength: 20
               },
               eff_date: {
                  required: true,
                  
 
               }
			  
			  
            },
            messages: {
               st_name: {
                  required: "State Name required",
                 
               },
               eff_date: {
                  required: "effdate required",
                 
               }
			  

            }
         });
    
});
</script>
  
</head>


<body style="width:98%;">

<form:form id="contactForm"  action="saveState.html" method="post" class="form-horizontal">
<div align="right">
<a href="index.html" title="Log out" target="_parent" align="right">Log Out</a><br>
<a href="admin.html" title="Log out" target="_parent" color="red">Go Back</a>
</div>
<h3 style="text-align: center;"> Create New State</h3>
			   <div>	
			   
			        <div><form:label path="st_id" ></form:label></div>
			        <div><form:input path="st_id" type="hidden" value="${state.st_id}" readonly="true"/></div>
			
			    <div class="row">
			     <div class="col-sm-4"><form:label path="st_name">State Name :</form:label></div>
			        <div class="col-sm-4"><form:input path="st_name" value="${state.st_name}"/></div>
			    </div>		<br/>
			    
			   <div class="row">
			     <div class="col-sm-4">
				    	<form:label path="country.cnt_id">Country Name :</form:label>
				    </div>
				 <div class="col-sm-4">
				   		<form:select path="country.cnt_id" cssStyle="width: 175px;">    
							<option value="-1">Select a type</option>
							<c:forEach items="${countries}" var="country">
								<option value="${country.cnt_id}">${country.cnt_name}</option>
							</c:forEach>
						</form:select>
					</div>
			    </div>		<br/>
			     <div class="row">
			         <div class="col-sm-4"><form:label path="eff_date">Effective Date :</form:label></div>
			        <div class="col-sm-4"><form:input path="eff_date" value="${state.eff_date}" type="date" cssStyle="width: 175px;"/></div>
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
  <c:if test="${!empty states}">
	<table class="table table-bordered">
	<thead>
		<tr>
			<th>State ID</th>
						<th>Country Name</th>
			
			<th>StateName</th>
			<th>Effective Date</th>
			<th>Options</th>
		</tr>
</thead>
		<tbody>
		<c:forEach items="${states}" var="state">
			<tr>
				<td><c:out value="${state.st_id}"/></td>
				<td><c:out value="${state.st_name}"/></td>
				<td><c:out value="${state.country.cnt_name}"/></td>
				<td><c:out value="${state.eff_date}"/></td>
				<td align="center"><a href="editState.html?st_id=${state.st_id}">Edit</a> </td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>
</div>
</div>
<!-- <h2><a href="#">Adding Services</a></h2> -->
</body> 
</html>