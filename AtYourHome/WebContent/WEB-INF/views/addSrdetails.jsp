<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
	<center>
		<h2>Create New srdetails</h2>
		<form:form method="POST" action="/chaitu/saveSrdetails.html">
	   		<table>
			    <tr>
			        <td><form:label path="sr_det_id">Publication ID:</form:label></td>
			        <td><form:input path="sr_det_id" value="${srdetails.sr_det_id}" readonly="true"/></td>
			    </tr>
			    
			  
			  	<tr>
				    <td>
				    	<form:label path="servicerequest.sr_id">sr request id:</form:label>
				    </td>
				    <td>
				   		<form:select path="servicerequest.sr_id" cssStyle="width: 150px;">    
							<option value="-1">Select a type</option>
							<c:forEach items="${servicerequests}" var="servicerequest">
								<option value="${servicerequest.sr_id}">${servicerequest.sr_desc}</option>
							</c:forEach>
						</form:select>
					</td>
			    </tr>
			  
			  
			  
			  	<tr>
				    <td>
				    	<form:label path="subservice.sub_serv_id">sub service id:</form:label>
				    </td>
				    <td>
				   		<form:select path="subservice.sub_serv_id" cssStyle="width: 150px;">    
							<option value="-1">Select a type</option>
							<c:forEach items="${subservices}" var="subservice">
								<option value="${subservice.sub_serv_id}">${subservice.sub_serv_desc}</option>
							</c:forEach>
						</form:select>
					</td>
			    </tr>
			  
			  	<tr>
				    <td>
				    	<form:label path="srattend.serv_attend_id">sr attendType:</form:label>
				    </td>
				    <td>
				   		<form:select path="srattend.serv_attend_id" cssStyle="width: 150px;">    
							<option value="-1">Select a type</option>
							<c:forEach items="${srattends}" var="srattend">
								<option value="${srattend.serv_attend_id}">${srattend.name}</option>
							</c:forEach>
						</form:select>
					</td>
			    </tr>
			    <tr>
			        <td><form:label path="status">status:</form:label></td>
			        <td><form:input path="status" value="${srdetails.status}" cssStyle="width: 150px;"/></td>
			    </tr>
			    <tr>
			      <td>&nbsp;</td>
			      <td><input type="submit" value="SAVE"/></td>
		      </tr>
			</table> 
		</form:form>
		<br/>
  <c:if test="${!empty srdetailss}">
	<table align="center" border="1">
		<tr>
			<th>ID</th>
			<th>sr id</th>
			<th>sub serv</th>
			<th>name</th>
			<th>staus</th>
		</tr>

		<c:forEach items="${srdetailss}" var="srdetails">
			<tr>
				<td><c:out value="${srdetails.sr_det_id}"/></td>
				<td><c:out value="${srdetails.servicerequest.sr_desc}"/></td>
				<td><c:out value="${srdetails.subservice.sub_serv_desc}"/></td>
				
				<td><c:out value="${srdetails.srattend.name}"/></td>
				<td><c:out value="${srdetails.status}"/></td>
				<td align="center"><a href="editSrdetails.html?sr_det_id=${srdetails.sr_det_id}">Edit</a> | <a href="deleteSrdetails.html?sr_det_id=${srdetails.sr_det_id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<h2><a href="addSrdetails.html">Adding srdetails</a></h2>
</center>
	</body>
</html>