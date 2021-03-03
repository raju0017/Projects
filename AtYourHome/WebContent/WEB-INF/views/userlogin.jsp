<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<head>
<meta charset="UTF-8" />
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
<title>WelCome To VSCS AtYourHome</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="WelCome To VSCS AtYourHome" />
<meta name="keywords"
	content="html5, css3, form, switch, animation, :target, pseudo-class" />
<meta name="" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />

<!-- EXAMPLE CODE -->

<SCRIPT type="text/javascript">
    		window.history.forward();
    		function noBack() { window.history.forward(); }
</SCRIPT>



<!-- EXAMPLE CODE -->

</head>
<body onload="noBack();" onpageshow="if (event.persisted) noBack();"
	onunload="">


	<div class="container">
		<!-- Codrops top bar -->
		.
		<div class="codrops-top">
			<a href=""> <strong> From VSCS inc </strong>
			</a> <span class="right"> <strong>Vincere Semantics
					Consultancy Services</strong> </a>

			</span>
			<div class="clr"></div>
		</div>
		<!--/ Codrops top bar -->
		<header>
		<h1>
			Hai <span>WelCome To VSCS AtYourHome</span>
		</h1>
		<nav class="codrops-demos"> </nav> </header>
		<section> <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
		<a class="hiddenanchor" id="toregister"></a> <a class="hiddenanchor"
			id="tologin"></a>
		<div id="wrapper">
			<div id="login" class="animate form">
				<form:form commandName="userRegister" action="userlogin.html"
					autocomplete="on">
					<h1>Log in</h1>
					<p>
						<label for="username" class="uname" data-icon="u"> Your
							email or username </label> <input id="username" name="username"
							required="required" type="text"
							placeholder="myusername or mymail@mail.com" />
					</p>
					<p>
						<label for="password" class="youpasswd" data-icon="p">
							Your password </label> <input id="password" name="password"
							required="required" type="password" placeholder="eg. X8df!90EO" />
					</p>
					<p class="keeplogin">
						<input type="checkbox" name="loginkeeping" id="loginkeeping"
							value="loginkeeping" /> <label for="loginkeeping">Keep
							me logged in</label>
					</p>
					<p class="login button">
						<td><input type="submit" value="Login" /> <a
							href="registerUser.html"> Sign up</a><br> <a
							href="bpoLogin.html">Login as Employee</a></td>
				</form:form>
			</div>


		</div>
		</section>
	</div>
</body>
</html>