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
body{

background-color:#EAF4D9;
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
               ename: {
			   
                  required: true,
                  maxlength: 20
               },
			   email: {
                    required: true,
                 email: true,
            minlength:10
               },
			  address1: {
                  required: true,
                  
				},
			  address2: {
                  required: true,
                  
				},
				phoneno :
				{
				required: true,
				
				},
				   
				eff_date: {
	                  required: true,
	                  
	 
	               },
	               status: {
	                  required: true,
	                  
	 
	               }
				
            },
            messages: {
               ename: {
                  required: "Employee Name required",
                 
               },
			   email: {
                  required: "email required",
                 
               },
			 address1: {
                  required: "address1 required",
                 
               },
			address2: {
                  required: "address2 required",
                 
               },
	
			  phoneno: {
                  required: "phoneno required",
                 
               },
               eff_date: {
                   required: "Date required",
                  
                },
                status: {
                   required: "status required",
                  
                }
            }
			
         });
    
});

	

function verifyEmail(){
			//alert(document.getElementById("email").value);
			var email = (document.getElementById("email").value);
			alert(email);
			
			obj = new XMLHttpRequest();
			
			obj.open("GET","verifyEmail.html?email ="+email,true);
			obj.send();
			
			/* obj.open("POST","verifyEmail.html",true);
			obj.send("email = x"); */
			obj.onreadystatechange = function() {
				//alert("hi");
				if (obj.readyState == 4 ) {
					alert("hello");
					var sub = obj.responseText;
					alert(sub);
					document.getElementById("verify").innerHTML = sub;
				}
			}
		 	
		}

  </script>
</head>


<body style="width:98%;">

<form:form  id="contactForm" action="saveEmployee.html" method="post" class="form-horizontal" >
<div align="right">
<a href="index.html" title="Log out" target="_parent" align="right">Log Out</a><br>
<a href="admin.html" title="Log out" target="_parent" color="red">Go Back</a>
</div>
<h3 style="text-align: center;"> Create New Employee</h3>
      <div>
			  
	               <div><form:label path="emp_id"></form:label>  </div>
	               <div><form:input path="emp_id"  type="hidden" />   </div>
	        
                 <div class="row">
	              <div class="col-sm-4"><form:label path="ename">Employee Name</form:label></div>
	             <div class="col-sm-4"><form:input path="ename"  value="${employee.ename}"/></div>
	         </div><br>
             <div class="row">
	               <div class="col-sm-4"><form:label path="email">Email</form:label> </div>
	             <div class="col-sm-4"><form:input id="email" path="email" value="${employee.email}" /> </div>
	              </div>
	              <div id="verify"><a href = "verifyEmail.html">Check Availability</a></div> <br>
	         <div class="row">
			   <div class="col-sm-4"><form:label path="address1">Address1</form:label>  </div>
			     <div class="col-sm-4"><form:input path="address1" value="${employee.address1}"/> </div>
		     </div><br>
		    <div class="row">
			       <div class="col-sm-4"><form:label path="address2">Address2</form:label> </div>
			    <div class="col-sm-4"><form:input path="address2"  value="${employee.address2}"/>  </div>
		 </div><br>
		      <div class="row">
			    <div class="col-sm-4"><form:label path="phoneno">Phone Number</form:label>   </div>
			     <div class="col-sm-4"><form:input path="phoneno" value="${employee.phoneno}" /> </div>
			  	 </div><br>
			   <div class="row">
			     <div class="col-sm-4"><form:label path="eff_date">Effective Date</form:label> </div>
			  <div class="col-sm-4"><form:input path="eff_date" type="date" value="${employee.eff_date}"  cssStyle="width: 175px;"/> </div>                                                                                                                                                                      
			   		 </div><br>
			 
               <div class="row">
			     <div class="col-sm-4"><form:label path="status"  value="${employee.status}">Status:</form:label></div>
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
  <c:if test="${!empty employees}">
	<table class="table table-bordered">
		<thead>
		<tr>
		<th>Employee Id</th>
	     <th>Employee Name</th>
	     <th>Email</th>
	     <th>Address1</th>
	     <th>Address2 </th>
	     <th>phone number</th>
	     <th>Eff_Date</th>
	     <th>Status</th>
		 <th>Options</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.emp_id}"/></td>
				<td><c:out value="${employee.ename}"/></td>
				<td><c:out value="${employee.email}" /></td>				
				<td><c:out value="${employee.address1}"/></td>
				<td><c:out value="${employee.address2}"/></td>
				<td><c:out value="${employee.phoneno}" /> </td>
                 <td><c:out value="${employee.eff_date}"/></td>
				<td><c:out value="${employee.status}"/></td>
				<td align="center"><a href="editEmployee.html?emp_id=${employee.emp_id}">Edit</a> </td>
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