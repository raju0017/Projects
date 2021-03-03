<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
        <link rel="stylesheet" href="css/style1.css">

       
</head>
<body>

<div class="wrapper">
	<div class="container">

 <h2 align="center" >User Registration</h2>
 <hr width=600 >
 <form:form action="register.html" method="post">
  <table align="center" >
    <tr>
     <td>
       <form:label path="username" >User Name:</form:label>
       <FONT color="red"><form:errors path="username" /></FONT>
     
       <form:input path="username" size="26" />  
       </td>     
    </tr>
    <tr>
     <td>
      <form:label path="email">User Email:</form:label>
      <FONT color="red"><form:errors path="email" /></FONT>
   
   
       <form:input path="email" size="26" />
         </td>
    </tr>
    <tr>
     <td>
      <form:label path="password">Password:</form:label>
      <FONT color="red"><form:errors path="password" /></FONT>
    
       <form:password path="password" size="26" />
      </td>
    </tr> 
          
    <tr>
     <td>
       <form:label path="f_name" >First Name:</form:label>
       <FONT color="red"><form:errors path="f_name" /></FONT>
    
       <form:input path="f_name" size="26" />       
      </td>
    </tr> 
    <tr>
     <td>
       <form:label path="l_name" >Last Name:</form:label>
       <FONT color="red"><form:errors path="l_name" /></FONT>
    
       <form:input path="l_name" size="26" />       
     </td>
    </tr> 
         
    <tr>
     <td>
      <form:label path="phone">phone No:</form:label>
      <FONT color="red"><form:errors path="phone" /></FONT>
    
       <form:input type="number" path="phone" size="26" />
      </td>
    </tr>
    <tr>
     <td>
      <form:label path="address1">Address Line1:</form:label><br>
    
       <form:textarea path="address1" rows="5" ></form:textarea>
     </td>
    </tr>  
    <tr>
     <td>
      <form:label path="address2">Address Line2:</form:label><br>
   
       <form:textarea path="address2" rows="5" ></form:textarea>
     </td>
    </tr>   <br>         
    <tr>    
    <td>
      <input type="submit" value="Submit"/>     
    </td>
  </tr> 
  
</table>
</form:form>
</div></div>

<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="js/index.js"></script>

</body>
</html>