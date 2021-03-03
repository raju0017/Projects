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

<form  id="contactForm" action="saveServcity.html" method="post" class="form-horizontal">
<h3 style="text-align: center;"> Create new servcity</h3>

<div class="form-group">
        <label class="col-xs-3 control-label" type="hidden" path="serv_city_id"></label>
        <div class="col-xs-4">
            <input  class="form-control" type="hidden" readonly="true" />
        </div>
		<div class="col-xs-5 messageContainer"></div>
    </div>


<div class="form-group">
        <label class="col-xs-3 control-label"  path="city.ct_id" >City Name </label>
        <div class="col-xs-4">
		     
        	 
		 <select required  class="form-control" name="city.ct_id"> 
	        <option value="">Select a type</option>
							<c:forEach items="${cities}" var="city">
								<option value="${city.ct_id}">${city.ct_name}</option>
							</c:forEach>
					
	       	</select>
       </div>
        <div class="col-xs-5 messageContainer"></div>
    </div>
	
   

	<div class="form-group">
        <label class="col-xs-3 control-label"  path="service.serv_id" >Service Name </label>
        <div class="col-xs-4">
		     
        	 
		 <select required  class="form-control" name="service.serv_id"> 
	        <option value="">Select a type</option>
							<c:forEach items="${services}" var="service">
								<option value="${service.serv_id}">${service.serv_desc}</option>
							</c:forEach>
					
	       	</select>
       </div>
        <div class="col-xs-5 messageContainer"></div>
    </div>
	
	
    <div class="form-group">
        <label class="col-xs-3 control-label" path="eff_date" value="${serv_city.eff_date}">Eff Date</label>
        <div class="col-xs-4">
            <input type="date" class="form-control" name="eff_date" />
        </div>
        <div class="col-xs-5 messageContainer"></div>
    </div>

    <div class="form-group">
        <label class="col-xs-3 control-label" path="status" value="${serv_city.status}">Status</label>
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

  
<h3 style="text-align: center;"> <a href="listServcity.html">Click Here to see list of City Services Details</a></h3>
   
   


</body>
</html>