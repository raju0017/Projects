<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
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
		<h2>Book Your Service</h2>
		<form:form method="POST" action="register.html">
	   		<table>
			    <tr>
			        <td><form:label path="user_id">User ID:</form:label></td>
			        <td><form:input path="user_id" value="${user.user_id}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="username">User Name:</form:label></td>
			        <td><form:input path="username" value="${user.username}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="f_name">First Name</form:label></td>
			        <td><form:input path="f_name" value="${user.f_name}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="l_name">Last Name:</form:label></td>
			        <td><form:input path="l_name" value="${user.l_name}"/></td>
			    </tr>
			    
			    <tr>
			        <td><form:label path="address1">Address1:</form:label></td>
                    <td><form:input path="address1" value="${user.address1}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="address2">Employee Address2:</form:label></td>
                    <td><form:input path="address2" value="${user.address2}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="email">Email:</form:label></td>
                    <td><form:input path="email" value="${user.email}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="phone">Mobile:</form:label></td>
                    <td><form:input path="phone" value="${user.phone}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="phone">Mobile:</form:label></td>
                    <td><form:input path="phone" value="${user.phone}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="password">Password</form:label></td>
                    <td><form:input path="password" value="${user.password}"/></td>
			    </tr><tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
		
  <c:if test="${!empty employees}">
		<h2>List Employees</h2>
	<table align="left" border="1">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee Age</th>
			<th>Employee Salary</th>
			<th>Employee Address</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${employees}" var="employee">
			<tr>
				<td><c:out value="${employee.id}"/></td>
				<td><c:out value="${employee.name}"/></td>
				<td><c:out value="${employee.age}"/></td>
				<td><c:out value="${employee.salary}"/></td>
				<td><c:out value="${employee.address}"/></td>
				<td align="center"><a href="edit.html?id=${employee.id}">Edit</a> | <a href="delete.html?id=${employee.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
	</body>
</html> --%>









<script src="https://cdn.jotfor.ms/static/prototype.forms.js" type="text/javascript"></script>
<script src="https://cdn.jotfor.ms/static/jotform.forms.js?3.3.10245" type="text/javascript"></script>
<script type="text/javascript">
   JotForm.init(function(){
      setTimeout(function() {
          $('input_9').hint('ex: myname@example.com');
       }, 20);
	JotForm.clearFieldOnHide="disable";
	JotForm.onSubmissionError="jumpToSubmit";
   });
</script>
<link href="https://cdn.jotfor.ms/static/formCss.css?3.3.10245" rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet" href="https://cdn.jotfor.ms/css/styles/nova.css?3.3.10245" />
<link type="text/css" media="print" rel="stylesheet" href="https://cdn.jotfor.ms/css/printForm.css?3.3.10245" />
<link type="text/css" rel="stylesheet" href="https://secure.jotform.me/themes/CSS/5489cead700cc469138b4567.css?session=47844351322449&themeRevisionID=555da031977cdfad168b4567"/>
<style type="text/css">
    .form-label-left{
        width:150px !important;
    }
    .form-line{
        padding-top:12px;
        padding-bottom:12px;
    }
    .form-label-right{
        width:150px !important;
    }
    .form-all{
        width:450px;
        color:#555 !important;
        font-family:'Open Sans';
        font-size:14px;
    }
    .form-radio-item label, .form-checkbox-item label, .form-grading-label, .form-header{
        color: #555;
    }

</style>

<style type="text/css" id="form-designer-style">
    /* Injected CSS Code */
@import "https://fonts.googleapis.com/css?family=Open+Sans:light,lightitalic,normal,italic,bold,bolditalic";
.form-all {
  font-family: "Open Sans", sans-serif;
}
.form-all {
  width: 450px;
  width: 100%;
  max-width: 450px;
}
.form-label-left,
.form-label-right {
  width: 150px;
}
.form-label {
  white-space: normal;
}
.form-label.form-label-auto {
  display: inline-block;
  float: left;
  text-align: left;
  width: 150px;
}
.form-label-left {
  display: inline-block;
  white-space: normal;
  float: left;
  text-align: left;
}
.form-label-right {
  display: inline-block;
  white-space: normal;
  float: left;
  text-align: right;
}
.form-label-top {
  white-space: normal;
  display: block;
  float: none;
  text-align: left;
}
.form-all {
  font-size: 14px;
}
.form-label {
  font-weight: bold;
}
.form-checkbox-item label,
.form-radio-item label {
  font-weight: normal;
}
.supernova {
  background-color: none;
  background-color: #ffffff;
}
.supernova body {
  background-color: transparent;
}
/*
@width30: (unit(@formWidth, px) + 60px);
@width60: (unit(@formWidth, px)+ 120px);
@width90: (unit(@formWidth, px)+ 180px);
*/
/* | */
/* | */
/* | */
@media screen and (max-width: 480px) {
  .jotform-form {
    padding: 10px 0;
  }
}
/* | */
/* | */
@media screen and (min-width: 480px) and (max-width: 768px) {
  .jotform-form {
    padding: 30px 0;
  }
}
/* | */
/* | */
@media screen and (min-width: 480px) and (max-width: 450px) {
  .jotform-form {
    padding: 30px 0;
  }
}
/* | */
/* | */
@media screen and (min-width: 768px) and (max-width: 1024px) {
  .jotform-form {
    padding: 60px 0;
  }
}
/* | */
/* | */
@media screen and (max-width: 450px) {
  .jotform-form {
    padding: 0;
  }
}
/* | */
.supernova .form-all,
.form-all {
  background-color: none;
  border: 1px solid transparent;
}
.form-all {
  color: #555555;
}
.form-header-group .form-header {
  color: #555555;
}
.form-header-group .form-subHeader {
  color: #6f6f6f;
}
.form-sub-label {
  color: #6f6f6f;
}
.form-label-top,
.form-label-left,
.form-label-right,
.form-html {
  color: #555555;
}
.form-checkbox-item label,
.form-radio-item label {
  color: #6f6f6f;
}
.form-line.form-line-active {
  -webkit-transition-property: all;
  -moz-transition-property: all;
  -ms-transition-property: all;
  -o-transition-property: all;
  transition-property: all;
  -webkit-transition-duration: 0.3s;
  -moz-transition-duration: 0.3s;
  -ms-transition-duration: 0.3s;
  -o-transition-duration: 0.3s;
  transition-duration: 0.3s;
  -webkit-transition-timing-function: ease;
  -moz-transition-timing-function: ease;
  -ms-transition-timing-function: ease;
  -o-transition-timing-function: ease;
  transition-timing-function: ease;
  background-color: rgba(255, 252, 252, 0);
}
/* ömer */
.form-radio-item,
.form-checkbox-item {
  padding-bottom: 0px !important;
}
.form-radio-item:last-child,
.form-checkbox-item:last-child {
  padding-bottom: 0;
}
/* ömer */
[data-type="control_radio"] .form-input,
[data-type="control_checkbox"] .form-input,
[data-type="control_radio"] .form-input-wide,
[data-type="control_checkbox"] .form-input-wide {
  width: 100%;
  max-width: 400px;
}
.form-radio-item,
.form-checkbox-item {
  width: 100%;
  max-width: 400px;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.form-textbox.form-radio-other-input,
.form-textbox.form-checkbox-other-input {
  width: 80%;
  margin-left: 3%;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.form-multiple-column {
  width: 100%;
}
.form-multiple-column .form-radio-item,
.form-multiple-column .form-checkbox-item {
  width: 10%;
}
.form-multiple-column[data-columncount="1"] .form-radio-item,
.form-multiple-column[data-columncount="1"] .form-checkbox-item {
  width: 100%;
}
.form-multiple-column[data-columncount="2"] .form-radio-item,
.form-multiple-column[data-columncount="2"] .form-checkbox-item {
  width: 50%;
}
.form-multiple-column[data-columncount="3"] .form-radio-item,
.form-multiple-column[data-columncount="3"] .form-checkbox-item {
  width: 33.33333333%;
}
.form-multiple-column[data-columncount="4"] .form-radio-item,
.form-multiple-column[data-columncount="4"] .form-checkbox-item {
  width: 25%;
}
.form-multiple-column[data-columncount="5"] .form-radio-item,
.form-multiple-column[data-columncount="5"] .form-checkbox-item {
  width: 20%;
}
.form-multiple-column[data-columncount="6"] .form-radio-item,
.form-multiple-column[data-columncount="6"] .form-checkbox-item {
  width: 16.66666667%;
}
.form-multiple-column[data-columncount="7"] .form-radio-item,
.form-multiple-column[data-columncount="7"] .form-checkbox-item {
  width: 14.28571429%;
}
.form-multiple-column[data-columncount="8"] .form-radio-item,
.form-multiple-column[data-columncount="8"] .form-checkbox-item {
  width: 12.5%;
}
.form-multiple-column[data-columncount="9"] .form-radio-item,
.form-multiple-column[data-columncount="9"] .form-checkbox-item {
  width: 11.11111111%;
}
.form-single-column .form-checkbox-item,
.form-single-column .form-radio-item {
  width: 100%;
}
.supernova {
  height: 100%;
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center top;
  background-repeat: repeat;
}
.supernova {
  background-image: none;
  background-image: url("//www.jotform.com/uploads/banMedo/form_files/blurry-gaussian_00420663.jpg");
}
#stage {
  background-image: none;
  background-image: url("//www.jotform.com/uploads/banMedo/form_files/blurry-gaussian_00420663.jpg");
}
/* | */
.form-all {
  background-image: url("//www.jotform.com/uploads/banMedo/form_files/8.png");
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center top;
  background-size: cover;
}
.form-header-group {
  background-repeat: no-repeat;
  background-attachment: scroll;
  background-position: center top;
  background-repeat: repeat;
}
.form-line {
  margin-top: 3px;
  margin-bottom: 3px;
}
.form-line {
  padding: 5px 36px;
}
.form-all .form-textbox,
.form-all .form-radio-other-input,
.form-all .form-checkbox-other-input,
.form-all .form-captcha input,
.form-all .form-spinner input,
.form-all .form-pagebreak-back,
.form-all .form-pagebreak-next,
.form-all .qq-upload-button,
.form-all .form-error-message {
  -webkit-border-radius: 20px;
  -moz-border-radius: 20px;
  border-radius: 20px;
}
.form-all .form-sub-label {
  margin-left: 3px;
}
.form-all .form-textarea {
  -webkit-border-radius: 20px;
  -moz-border-radius: 20px;
  border-radius: 20px;
}
.form-all .form-submit-button,
.form-all .form-submit-reset,
.form-all .form-submit-print {
  -webkit-border-radius: 100px;
  -moz-border-radius: 100px;
  border-radius: 100px;
}
.form-all .form-sub-label {
  margin-left: 3px;
}
.form-all {
  -webkit-border-radius: 6px;
  -moz-border-radius: 6px;
  border-radius: 6px;
}
.form-section:first-child {
  -webkit-border-radius: 6px 6px 0 0;
  -moz-border-radius: 6px 6px 0 0;
  border-radius: 6px 6px 0 0;
}
.form-section:last-child {
  -webkit-border-radius: 0 0 6px 6px;
  -moz-border-radius: 0 0 6px 6px;
  border-radius: 0 0 6px 6px;
}
.form-all .qq-upload-button,
.form-all .form-submit-button,
.form-all .form-submit-reset,
.form-all .form-submit-print {
  width: 150px;
  font-size: 1em;
  padding: 9px 15px;
  font-family: "Open Sans", sans-serif;
  font-size: 14px;
  font-weight: bold;
  border: none;
  border-width: 3px !important;
  border-style: solid !important;
  border-color: #9fccad !important;
}
.form-all .qq-upload-button,
.form-all .form-submit-button,
.form-all .form-submit-reset,
.form-all .form-submit-print {
  color: #ffffff !important;
  background: #f59202;
  box-shadow: none;
  text-shadow: none;
}
.form-all .form-pagebreak-back,
.form-all .form-pagebreak-next {
  font-size: 1em;
  padding: 9px 15px;
  font-family: "Open Sans", sans-serif;
  font-size: 14px;
  font-weight: normal;
}
/*
& when ( @buttonFontType = google ) {
	@import (css) "@{buttonFontLink}";
}
*/
h2.form-header {
  line-height: 1.618em;
  font-size: 1.714em;
}
h2 ~ .form-subHeader {
  line-height: 1.5em;
  font-size: 1.071em;
}
.form-header-group {
  text-align: left;
}
.form-line {
  zoom: 1;
}
.form-line:before,
.form-line:after {
  display: table;
  content: '';
  line-height: 0;
}
.form-line:after {
  clear: both;
}
.form-sub-label-container {
  margin-right: 0;
  float: left;
  white-space: nowrap;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.form-sub-label-container .date-separate {
  visibility: hidden;
}
.form-captcha input,
.form-spinner input {
  width: 400px;
}
.form-textbox,
.form-textarea {
  width: 100%;
  max-width: 400px;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.form-input,
.form-address-table,
.form-matrix-table {
  width: 100%;
  max-width: 400px;
}
.form-radio-item,
.form-checkbox-item {
  width: 100%;
  max-width: 400px;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.form-textbox.form-radio-other-input,
.form-textbox.form-checkbox-other-input {
  width: 80%;
  margin-left: 3%;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
.form-multiple-column {
  width: 100%;
}
.form-multiple-column .form-radio-item,
.form-multiple-column .form-checkbox-item {
  width: 10%;
}
.form-multiple-column[data-columncount="1"] .form-radio-item,
.form-multiple-column[data-columncount="1"] .form-checkbox-item {
  width: 100%;
}
.form-multiple-column[data-columncount="2"] .form-radio-item,
.form-multiple-column[data-columncount="2"] .form-checkbox-item {
  width: 50%;
}
.form-multiple-column[data-columncount="3"] .form-radio-item,
.form-multiple-column[data-columncount="3"] .form-checkbox-item {
  width: 33.33333333%;
}
.form-multiple-column[data-columncount="4"] .form-radio-item,
.form-multiple-column[data-columncount="4"] .form-checkbox-item {
  width: 25%;
}
.form-multiple-column[data-columncount="5"] .form-radio-item,
.form-multiple-column[data-columncount="5"] .form-checkbox-item {
  width: 20%;
}
.form-multiple-column[data-columncount="6"] .form-radio-item,
.form-multiple-column[data-columncount="6"] .form-checkbox-item {
  width: 16.66666667%;
}
.form-multiple-column[data-columncount="7"] .form-radio-item,
.form-multiple-column[data-columncount="7"] .form-checkbox-item {
  width: 14.28571429%;
}
.form-multiple-column[data-columncount="8"] .form-radio-item,
.form-multiple-column[data-columncount="8"] .form-checkbox-item {
  width: 12.5%;
}
.form-multiple-column[data-columncount="9"] .form-radio-item,
.form-multiple-column[data-columncount="9"] .form-checkbox-item {
  width: 11.11111111%;
}
[data-type="control_dropdown"] .form-dropdown {
  width: 100% !important;
  max-width: 400px;
}
[data-type="control_fullname"] .form-sub-label-container {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  width: 48%;
}
[data-type="control_fullname"] .form-sub-label-container:first-child {
  margin-right: 4%;
}
[data-type="control_phone"] .form-sub-label-container {
  width: 65%;
}
[data-type="control_phone"] .form-sub-label-container:first-child {
  width: 32.5%;
  margin-right: 2.5%;
}
[data-type="control_birthdate"] .form-sub-label-container {
  width: 22%;
  margin-right: 3%;
}
[data-type="control_birthdate"] .form-sub-label-container:first-child {
  width: 50%;
}
[data-type="control_birthdate"] .form-sub-label-container:last-child {
  margin-right: 0;
}
[data-type="control_birthdate"] .form-sub-label-container .form-dropdown {
  width: 100%;
}
[data-type="control_time"] .form-sub-label-container {
  width: 37%;
  margin-right: 3%;
}
[data-type="control_time"] .form-sub-label-container:last-child {
  width: 20%;
  margin-right: 0;
}
[data-type="control_time"] .form-sub-label-container .form-dropdown {
  width: 100%;
}
[data-type="control_datetime"] .form-sub-label-container {
  width: 28%;
  margin-right: 4%;
}
[data-type="control_datetime"] .form-sub-label-container:last-child {
  width: 4%;
  margin-right: 0;
}
[data-type="control_datetime"].allowTime .form-sub-label-container {
  width: 12%;
  margin-right: 3%;
}
[data-type="control_datetime"].allowTime .form-sub-label-container:last-child {
  width: 4%;
  margin-right: 0;
}
[data-type="control_datetime"].allowTime .allowTime-container {
  float: right;
  width: 51%;
}
[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container {
  width: 27%;
  margin-right: 4%;
}
[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container:first-child {
  width: 4%;
  margin-left: 3%;
}
[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container:last-child {
  width: 27%;
  margin-right: 0;
}
[data-type="control_datetime"].allowTime .form-dropdown {
  width: 100%;
}
[data-type="control_payment"] .form-sub-label-container {
  width: auto;
}
[data-type="control_payment"] .form-sub-label-container .form-dropdown {
  width: 100%;
}
.form-address-table td .form-dropdown {
  width: 100%;
}
.form-address-table td .form-sub-label-container {
  width: 96%;
}
.form-address-table td:last-child .form-sub-label-container {
  margin-left: 4%;
}
.form-address-table td[colspan="2"] .form-sub-label-container {
  width: 100%;
  margin: 0;
}
.form-line,
.form-input,
.form-input-wide,
.form-dropdown,
.form-sub-label-container,
.form-address-table,
.form-matrix-table {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  width: 100%;
  max-width: none;
}
.form-textbox,
.form-textarea,
.form-radio-item,
.form-checkbox-item,
.form-captcha input,
.form-spinner input,
.form-error-message {
  width: 100%;
  max-width: none;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
/*.form-dropdown,
.form-radio-item,
.form-checkbox-item,
.form-radio-other-input,
.form-checkbox-other-input,*/
.form-captcha input,
.form-spinner input,
.form-error-message {
  padding: 4px 3px 2px 3px;
}
.form-header-group {
  font-family: "Open Sans", sans-serif;
}
.form-section {
  padding: 0px 0px 0px 0px;
}
.form-header-group {
  margin: 10px 35px 10px 35px;
}
.form-header-group {
  padding: 20px 0px 20px 0px;
}
.form-header-group .form-header,
.form-header-group .form-subHeader {
  color: #fdfdfd;
}
.form-header-group {
  background-color: ;
}
.form-textbox,
.form-textarea {
  border-width: 3px;
  border-color: #cf4343;
  color: #b5b5b5;
  padding: 4px 3px 2px 3px;
}
.form-textbox {
  height: 35px;
}
.form-textbox,
.form-textarea {
  width: 100%;
  max-width: 400px;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}
[data-type="control_textbox"] .form-input,
[data-type="control_textarea"] .form-input,
[data-type="control_fullname"] .form-input,
[data-type="control_phone"] .form-input,
[data-type="control_datetime"] .form-input,
[data-type="control_address"] .form-input,
[data-type="control_email"] .form-input,
[data-type="control_passwordbox"] .form-input,
[data-type="control_autocomp"] .form-input,
[data-type="control_textbox"] .form-input-wide,
[data-type="control_textarea"] .form-input-wide,
[data-type="control_fullname"] .form-input-wide,
[data-type="control_phone"] .form-input-wide,
[data-type="control_datetime"] .form-input-wide,
[data-type="control_address"] .form-input-wide,
[data-type="control_email"] .form-input-wide,
[data-type="control_passwordbox"] .form-input-wide,
[data-type="control_autocomp"] .form-input-wide {
  width: 100%;
  max-width: 400px;
}
[data-type="control_fullname"] .form-sub-label-container {
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
  width: 48%;
}
[data-type="control_fullname"] .form-sub-label-container:first-child {
  margin-right: 4%;
}
[data-type="control_phone"] .form-sub-label-container {
  width: 65%;
}
[data-type="control_phone"] .form-sub-label-container:first-child {
  width: 32.5%;
  margin-right: 2.5%;
}
[data-type="control_phone"] .form-sub-label-container .date-separate {
  visibility: hidden;
}
[data-type="control_datetime"] .form-sub-label-container {
  width: 28%;
  margin-right: 4%;
}
[data-type="control_datetime"] .form-sub-label-container:last-child {
  width: 4%;
  margin-right: 0;
}
[data-type="control_datetime"] .form-sub-label-container .date-separate {
  visibility: hidden;
}
[data-type="control_datetime"].allowTime .form-sub-label-container {
  width: 12%;
  margin-right: 3%;
}
[data-type="control_datetime"].allowTime .form-sub-label-container:last-child {
  width: 4%;
  margin-right: 0;
}
[data-type="control_datetime"].allowTime .allowTime-container {
  float: right;
  width: 51%;
}
[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container {
  width: 27%;
  margin-right: 4%;
}
[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container:first-child {
  width: 4%;
  margin-left: 3%;
}
[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container:last-child {
  width: 27%;
  margin-right: 0;
}
[data-type="control_datetime"].allowTime .form-dropdown {
  width: 100%;
}
.form-matrix-table {
  width: 100%;
  max-width: 400px;
}
.form-address-table {
  width: 100%;
  max-width: 400px;
}
.form-address-table td .form-dropdown {
  width: 100%;
}
.form-address-table td .form-sub-label-container {
  width: 96%;
}
.form-address-table td:last-child .form-sub-label-container {
  margin-left: 4%;
}
.form-address-table td[colspan="2"] .form-sub-label-container {
  width: 100%;
  margin: 0;
}
[data-type="control_dropdown"] .form-input,
[data-type="control_birthdate"] .form-input,
[data-type="control_time"] .form-input,
[data-type="control_dropdown"] .form-input-wide,
[data-type="control_birthdate"] .form-input-wide,
[data-type="control_time"] .form-input-wide {
  width: 100%;
  max-width: 400px;
}
[data-type="control_dropdown"] .form-dropdown {
  width: 100% !important;
  max-width: 400px;
}
[data-type="control_birthdate"] .form-sub-label-container {
  width: 22%;
  margin-right: 3%;
}
[data-type="control_birthdate"] .form-sub-label-container:first-child {
  width: 50%;
}
[data-type="control_birthdate"] .form-sub-label-container:last-child {
  margin-right: 0;
}
[data-type="control_birthdate"] .form-sub-label-container .form-dropdown {
  width: 100%;
}
[data-type="control_time"] .form-sub-label-container {
  width: 37%;
  margin-right: 3%;
}
[data-type="control_time"] .form-sub-label-container:last-child {
  width: 20%;
  margin-right: 0;
}
[data-type="control_time"] .form-sub-label-container .form-dropdown {
  width: 100%;
}
.form-buttons-wrapper {
  margin-left: 0 !important;
  text-align: center !important;
}
.form-header-group {
  border-bottom: none;
}
.form-label {
  font-family: "Open Sans", sans-serif;
}
li[data-type="control_image"] div {
  text-align: left;
}
li[data-type="control_image"] img {
  border: none;
  border-width: 0px !important;
  border-style: solid !important;
  border-color: false !important;
}
.form-line-column {
  width: auto;
}
.form-line-error {
  overflow: hidden;
  -webkit-transition-property: none;
  -moz-transition-property: none;
  -ms-transition-property: none;
  -o-transition-property: none;
  transition-property: none;
  -webkit-transition-duration: 0.3s;
  -moz-transition-duration: 0.3s;
  -ms-transition-duration: 0.3s;
  -o-transition-duration: 0.3s;
  transition-duration: 0.3s;
  -webkit-transition-timing-function: ease;
  -moz-transition-timing-function: ease;
  -ms-transition-timing-function: ease;
  -o-transition-timing-function: ease;
  transition-timing-function: ease;
  background-color: #fff4f4;
}
.form-line-error .form-error-message {
  background-color: #f47171;
  clear: both;
  float: none;
}
.form-line-error .form-error-message .form-error-arrow {
  border-bottom-color: #f47171;
}
.form-line-error input:not(#coupon-input),
.form-line-error textarea,
.form-line-error .form-validation-error {
  border: 1px solid #f47171;
  -webkit-box-shadow: 0 0 3px #f47171;
  -moz-box-shadow: 0 0 3px #f47171;
  box-shadow: 0 0 3px #f47171;
}
.form-all {
  position: relative;
}
.form-all:before {
  content: "";
  background-image: url("//www.jotform.com/landing/resources/img/dl/png-big-orange.png");
  display: inline-block;
  height: 106px;
  position: absolute;
  background-size: 196px 106px;
  background-repeat: no-repeat;
  width: 100%;
}
.form-all {
  margin-top: 106px;
}
.form-all:before {
  top: -106px;
  background-position: top center;
}
.ie-8 .form-all {
  margin-top: auto;
  margin-top: initial;
}
.ie-8 .form-all:before {
  display: none;
}
/* | */
@media screen and (max-width: 480px), screen and (max-device-width: 768px) and (orientation: portrait), screen and (max-device-width: 415px) and (orientation: landscape) {
  .jotform-form {
    padding: 0;
  }
  .form-all {
    border: 0;
    width: 100%;
    max-width: initial;
  }
  .form-sub-label-container {
    width: 100%;
    margin: 0;
  }
  .form-input {
    width: 100%;
  }
  .form-label {
    width: 100%!important;
  }
  .form-line {
    padding: 2% 5%;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
  }
  input[type=text],
  input[type=email],
  input[type=tel],
  textarea {
    width: 100%;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
    max-width: initial !important;
  }
  .form-input,
  .form-input-wide,
  .form-textarea,
  .form-textbox,
  .form-dropdown {
    max-width: initial !important;
  }
  div.form-header-group {
    padding: 20px 0px !important;
    margin: 0 10px 2% !important;
    margin-left: 5% !important;
    margin-right: 5% !important;
    -moz-box-sizing: border-box;
    -webkit-box-sizing: border-box;
    box-sizing: border-box;
  }
  [data-type="control_button"] {
    margin-bottom: 0 !important;
  }
  .form-buttons-wrapper {
    margin: 0!important;
  }
  .form-buttons-wrapper button {
    width: 100%;
  }
  table {
    width: 100%!important;
    max-width: initial !important;
  }
  table td + td {
    padding-left: 3%;
  }
  .form-checkbox-item input,
  .form-radio-item input {
    width: auto;
  }
  .form-collapse-table {
    margin: 0 5%;
  }
}
/* | */

/*__INSPECT_SEPERATOR__*/

    /* Injected CSS Code */
</style>

<form class="jotform-form" action="register.html" method="post" name="form_53442575819464" id="53442575819464" accept-charset="utf-8">
  <input type="hidden" name="formID" value="53442575819464" />
  <div class="form-all">
    <ul class="form-section page-section">
      <li class="form-line always-hidden" data-type="control_textbox" id="id_1">
        <label class="form-label form-label-left form-label-auto" id="label_1" for="input_1"> Id </label>
        <div id="cid_1" class="form-input always-hidden jf-required">
          <input type="text" class=" form-textbox" data-type="input-textbox" id="input_1" name="user_id" size="20" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_3">
        <label class="form-label form-label-left form-label-auto" id="label_3" for="input_3">
          First Name
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_3" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_3" name="f_name" size="20" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_4">
        <label class="form-label form-label-left form-label-auto" id="label_4" for="input_4">
          Last Name
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_4" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_4" name="l_name" size="20" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_7">
        <label class="form-label form-label-left form-label-auto" id="label_7" for="input_7">
          Mobile
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_4" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required, Mobile]" data-type="input-textbox" id="input_7" name="phone" size="12" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_email" id="id_9">
        <label class="form-label form-label-left form-label-auto" id="label_9" for="input_9">
          E-mail
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_9" class="form-input jf-required">
          <input type="email" class=" form-textbox validate[required, Email]" id="input_9" name="email" size="30" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_5">
        <label class="form-label form-label-left form-label-auto" id="label_5" for="input_5">
          User Name
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_5" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required, AlphaNumeric]" data-type="input-textbox" id="input_5" name="username" size="20" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_6">
        <label class="form-label form-label-left form-label-auto" id="label_6" for="input_6">
          Password
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_6" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_6" name="password" size="20" value="" />
        </div>
      </li>
       <li class="form-line jf-required" data-type="control_textbox" id="id_6">
        <label class="form-label form-label-left form-label-auto" id="label_6" for="input_6">
           Conform Password
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_6" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_6" name="password" size="20" value="" />
        </div>
      </li>
      <!-- <li class="form-line jf-required" data-type="control_textbox" id="id_7">
        <label class="form-label form-label-left form-label-auto" id="label_7" for="input_7">
          Area Name
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_7" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_7" name="q7_areaName" size="20" value="" />
        </div>
      </li> -->
      <li class="form-line jf-required" data-type="control_textbox" id="id_8">
        <label class="form-label form-label-left form-label-auto" id="label_8" for="input_8">
          Address1
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_8" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_8" name="address1" size="20" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_10">
        <label class="form-label form-label-left form-label-auto" id="label_10" for="input_10">
          Address2
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_10" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_10" name="address2" size="20" value="" />
        </div>
      </li>
      <li class="form-line" data-type="control_button" id="id_2">
        <div id="cid_2" class="form-input-wide">
          <div style="margin-left:156px" class="form-buttons-wrapper">
            <button id="input_2" type="submit" class="form-submit-button">
              RegISter
            </button>
          </div>
           <div style="margin-left:156px" class="form-buttons-wrapper">
            <a  href="index.html" id="input_2" type="button" class="form-submit-button">
              Go Back To Main Page
            </a>
          </div>
        </div>
      </li>
      <li style="display:none">
        Should be Empty:
        <input type="text" name="website" value="" />
      </li>
    </ul>
  </div>
  <input type="hidden" id="simple_spc" name="simple_spc" value="53442575819464" />
  <script type="text/javascript">
  document.getElementById("si" + "mple" + "_spc").value = "53442575819464-53442575819464";
  </script>
</form>
<script type="text/javascript"></script>