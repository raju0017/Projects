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
		<form:form method="POST" action="/chaitu/savesrdetails.html">
	   		<table>
			  <%--   <tr>
			        <td><form:label path="sr_det_id">sr detail ID:</form:label></td>
			        <td><form:input path="sr_det_id" value="${srdetails.sr_det_id}" readonly="true"/></td>
			    </tr> --%>
			    <tr>
			        <td><form:label path="sr_id_fk">sr id:</form:label></td>
			        <td><form:input path="sr_id_fk" value="${srdetails.sr_id_fk}"/></td>
			    </tr>
			    
			  	<tr>
				    <td>
				    	<form:label path="srattend.serv_attend_id">service man  Type:</form:label>
				    </td>
				    <td>
				   		<form:select path="srattend.serv_attend_id" cssStyle="width: 150px;">    
							<option value="-1">Select a man</option>
							<c:forEach items="${srattends}" var="category">
								<option value="${srattend.serv_attend_id}">${srattend.name}</option>
							</c:forEach>
						</form:select>
					</td>
			    </tr>
			    <tr>
				    <td>
				    	<form:label path="srattend.serv_attend_id">service man  Type:</form:label>
				    </td>
				    <td>
				   		<form:select path="srattend.serv_attend_id" cssStyle="width: 150px;">    
							<option value="-1">Select a man</option>
							<c:forEach items="${srattends}" var="category">
								<option value="${srattend.serv_attend_id}">${srattend.phoneno}</option>
							</c:forEach>
						</form:select>
					</td>
			    </tr>
			    
			   <tr>
			        <td><form:label path="sr_id_fk">sr id:</form:label></td>
			        <td><form:input path="sr_id_fk" value="${srdetails.status}"/></td>
			    </tr>
			   
			    <tr>
			      <td>&nbsp;</td>
			      <td><input type="submit" value="SAVE"/></td>
		      </tr>
			</table> 
		</form:form>
		<br/>
  <%-- <c:if test="${!empty publications}">
	<table align="center" border="1">
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Type</th>
			<th>Content</th>
			<th>Options</th>
		</tr>

		<c:forEach items="${publications}" var="publication">
			<tr>
				<td><c:out value="${publication.pubId}"/></td>
				<td><c:out value="${publication.pubTitle}"/></td>
				<td><c:out value="${publication.category.categoryName}"/></td>
				<td><c:out value="${publication.pubContent}"/></td>
				<td align="center"><a href="editPublication.html?pubId=${publication.pubId}">Edit</a> | <a href="deletePublication.html?pubId=${publication.pubId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<h2><a href="addCategory.html">Adding Category</a></h2> --%>
</center>
	</body>
</html>