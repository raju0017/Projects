<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome page</title>

<style>

a:hover {
	color: red;
}

</style>

</head>
<body bgcolor="cyan">
<center>
<%String name=(String) request.getAttribute("user");%>
<h1>hai..<%=name %>&nbsp;&nbsp;&nbsp;&nbsp;welcome to students galary</h1>
<h2>to view students details..!</h2>
<h3><a href="view">click here</a></h3>
<h3><a href="resetPassword.html">Chane your password</a></h3>
</center>

</body>
</html>