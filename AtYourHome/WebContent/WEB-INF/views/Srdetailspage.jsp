<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>B P O</title>
		<style type="text/css">
		#mainDiv{
		width:500px;
		margin:0 auto;
		}	
		</style>
	</head>
	<body>
	<form:form method="POST" action="/savesrdetails.html">
	   	<div id="mainDiv">
	<h2 style="text-align: center;">Service Details</h2>
	<br>
	<div> <input type="hidden"></div>
		 <div class="row">
		 	<div class="col-sm-4">Service Details Id :</div>
		 	<div class="col-sm-4"><input type="text" value="${servicerequest.sr_id}"></div>
		 </div>
		 <br>
		 <div class="row">
		 	<div class="col-sm-4">Service Request Id :</div>
		 	<div class="col-sm-4"><input type="text" value="${srdetails.subservice.sub_serv_desc}"></div>
		 </div>
		 <br>
		 
		 <div class="row">
		 	<div class="col-sm-4"> Service ATTEND  Id :</div>
		 	<div class="col-sm-4"><input type="text" value="${srdetails.srattend.name}"></div>
		 </div>
		 
		 
		 
		 
		 <%-- <div class="row">
		 	<div class="col-sm-4">Service Attendant :</div>
		 	<div class="col-sm-4">
		 		<select>
		 		<option>Select Person</option>
		 		 <c:forEach items="${srattends}" var="srattend">
		            <option value="${srattend.serv_attend_id}">${srattend.name}</option>
		        </c:forEach>
		 		</select>
		 	</div>
		 </div> --%>
		 <br>
		
		
		 <div class="row">
		 	<div class="col-sm-4"> Service PHONE Id :</div>
		 	<div class="col-sm-4"><input type="text" value="${srdetails.srattend.phoneno}"></div>
		 </div>
		
		
		 <%--  <div class="row">
		 	<div class="col-sm-4" >Phone Number:</div>
		 	<div class="col-sm-4">
		 	<select>
		 		<option>Select Person</option>
		 		 <c:forEach items="${srattends}" var="srattend">
		            <option value="${srattend.serv_attend_id}">${srattend.phoneno}</option>
		        </c:forEach>
		 		</select>
		 		</div>
		 	
		 </div> --%>
		 <br>
		
		
		
		
		
		<div class="row">
		 	<div class="col-sm-4">Status :</div>
		 	<div class="col-sm-4">
		 		<select  cssStyle="width:50%">
			 		<option>Select Type</option>
			 		<option>Booked</option>
			 		<option>In Process</option>
			 		<option>Completed</option>
		 		</select>
		 	</div>
		 </div>
		 <br>
		 
		 <div class="row">
		 	<div class="col-sm-3"></div>
			<div class="col-sm-4">
				<input type="submit" value="Save">			
			</div>		 
	 </div>
		 
	</div>	
	</form:form>
	<br>
  <c:if test="${!empty srdetailss}">
	<table align="center" border="1">
	<thead>
		<tr>
			<th>SR DET ID</th>
			<th>SR ID FK</th>
			<th>SUB SERV ID FK</th>
			<th>Serv addtend fk</th>
			<th>phon num</th>
			<th>status</th>		
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${srdetailss}" var="srdetails">
			<tr>
				<td><c:out value="${srdetails.sr_det_id}"/></td>
				<td><c:out value="${srdetails.servicerequest.sr_id}"/></td>
				<td><c:out value="${srdetails.subservice.sub_serv_desc}"/></td>
				
				<%-- <td><c:out value="${srdetails.srattend.name}"/></td> --%>
				<td><form action="srattend" method="post">
    <select name="srattend">
        <c:forEach items="${srattends}" var="srattend">
            <option value="${srattend.serv_attend_id}">${srattend.name}</option>
        </c:forEach>
    </select>
   
</form></td>
				
				<td><c:out value="${srdetails.srattend.phoneno}"/></td>
				<td><c:out value="${srdetails.status}"/></td>
				
				
				
				 <td align="center"><a href="editSrdetails.html?sr_det_id=${srdetails.sr_det_id}">Edit</a> | <a href="deleteCategory.html?categoryId=${category.categoryId}">Delete</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</c:if>


	    
			    
<%-- <form action="srattend" method="post">
    <select name="srattend">
        <c:forEach items="${srattends}" var="srattend">
            <option value="${srattend.serv_attend_id}">${srattend.name}</option>
        </c:forEach>
    </select>
   
</form> --%>



<h2 style="text-align: center;"><a href="home.jsp">HOME</a></h2>

	</body>
</html>