<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home services details</title>
</head>
<body>
 <center>

  <div style="color: teal; font-size: 30px">Home Services | Service
   Details</div>

  <c:if test="${!empty services}">
   <table border="1" bgcolor="black" width="600px">
    <tr
     style="background-color: teal; color: white; text-align: center;"
     height="40px">
     
    <td>Service Id</td>
     <td>Service Name</td>
     <td>Eff Date</td>
     <td>Status</td>
     <td>Options</td>
     
    </tr>
    <c:forEach items="${services}" var="service">
     <tr
      style="background-color: white; color: black; text-align: center;"
      height="30px">
      <td><c:out value="${service.serv_id}" />
      </td>
      <td><c:out value="${service.serv_desc}" />
      </td>
      <td><c:out value="${service.eff_date}" />
      </td>
      <td><c:out value="${service.status}" />
      </td>
      
      <td><a href="editService.html?serv_id=${service.serv_id}">Edit</a></td>
     
     </tr>
    </c:forEach>
   </table>
  </c:if>


  <a href="addService.html">Click Here to add new service</a>
 </center>
</body>
</html>