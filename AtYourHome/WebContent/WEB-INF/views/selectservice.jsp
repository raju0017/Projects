<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Your Service</title>
<script src="https://cdn.jotfor.ms/static/prototype.forms.js"
	type="text/javascript"></script>
<script src="https://cdn.jotfor.ms/static/jotform.forms.js?3.3.10225"
	type="text/javascript"></script>
<script type="text/javascript">
function getSubService(){
			//alert(document.getElementById("serv_id").value);
			var x=(document.getElementById("serv_id").value);
			//alert(x);
			if(navigator.appName == "Microsoft Internet Explore"){
				obj = new ActiveXObject("Microsoft.XMLHTTP");
			}
			else{
				obj = new XMLHttpRequest();
			}
			obj.open("GET","http://localhost:8001/AtYourHome/getSubService.html?serv_id="+x,true);
			obj.send();
			obj.onreadystatechange = function() {
				
				if (obj.readyState == 4 && obj.status == 200) {
					var sub = obj.responseText;
					//alert(sub);
					document.getElementById("sub_serv_id").innerHTML = sub;
				}
			}
		 	/* urlStr = "http://localhost:9090/test/getSubCourse.html?courseId="+document.getElementById("courseId").value;
	        $.ajax({url: urlStr, success: function(result) {
	            alert(result);
	      		$("#subcourseId").html(result); 
	        
	        } }); 
	       
	       // alert(cityDD);
	        return x; */ 
		}
</script>

<script type="text/javascript">
   JotForm.init(function(){
      setTimeout(function() {
          $('input_4').hint('1234567890');
       }, 20);
      JotForm.description('input_4', 'Do Not Use Area Code');
	JotForm.clearFieldOnHide="disable";
	JotForm.onSubmissionError="jumpToSubmit";
   });
</script>
<link href="https://cdn.jotfor.ms/static/formCss.css?3.3.10225"
	rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet"
	href="https://cdn.jotfor.ms/css/styles/nova.css?3.3.10225" />
<link type="text/css" media="print" rel="stylesheet"
	href="https://cdn.jotfor.ms/css/printForm.css?3.3.10225" />
<link type="text/css" rel="stylesheet"
	href="https://secure.jotform.me/themes/CSS/54a64d6e25d7909c1f8b4567.css?session=47841077132574&themeRevisionID=5628e855977cdf35308b4567" />
<style type="text/css">
.form-label-left {
	width: 150px !important;
}

.form-line {
	padding-top: 12px;
	padding-bottom: 12px;
}

.form-label-right {
	width: 150px !important;
}

.form-all {
	width: 554px;
	color: rgb(19, 19, 19) !important;
	font-family: 'Rambla';
	font-size: 16px;
}

.form-radio-item label, .form-checkbox-item label, .form-grading-label,
	.form-header {
	color: rgb(19, 19, 19);
}
</style>

<style type="text/css" id="form-designer-style">
/* Injected CSS Code */
@import
	"https://fonts.googleapis.com/css?family=Rambla:light,lightitalic,normal,italic,bold,bolditalic"
	;

.form-all {
	font-family: "Rambla", sans-serif;
}

.form-all {
	width: 554px;
	width: 100%;
	max-width: 554px;
}

.form-label-left, .form-label-right {
	width: 150px;
}

.form-label {
	white-space: normal;
}

.form-label.form-label-auto {
	display: block;
	float: none;
	text-align: left;
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
	font-size: 16px;
}

.form-label {
	font-weight: bold;
}

.form-checkbox-item label, .form-radio-item label {
	font-weight: normal;
}

.supernova {
	background-color: rgba(255, 255, 255, 0);
	background-color: #f2ede4;
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
@media screen and (min-width: 480px) {
	.supernova .form-all {
		border: 1px solid #e1d6c2;
		-webkit-box-shadow: 0 3px 9px rgba(0, 0, 0, 0.1);
		-moz-box-shadow: 0 3px 9px rgba(0, 0, 0, 0.1);
		box-shadow: 0 3px 9px rgba(0, 0, 0, 0.1);
	}
}
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
@media screen and (min-width: 480px) and (max-width: 554px) {
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
@media screen and (max-width: 554px) {
	.jotform-form {
		padding: 0;
	}
}
/* | */
.supernova .form-all, .form-all {
	background-color: rgba(255, 255, 255, 0);
	border: 1px solid transparent;
}

.form-header-group {
	border-color: rgba(230, 230, 230, 0);
}

.form-matrix-table tr {
	border-color: rgba(230, 230, 230, 0);
}

.form-matrix-table tr:nth-child(2n) {
	background-color: rgba(242, 242, 242, 0);
}

.form-all {
	color: #131313;
}

.form-header-group .form-header {
	color: #131313;
}

.form-header-group .form-subHeader {
	color: #2d2d2d;
}

.form-sub-label {
	color: #2d2d2d;
}

.form-label-top, .form-label-left, .form-label-right, .form-html {
	color: #131313;
}

.form-checkbox-item label, .form-radio-item label {
	color: #2d2d2d;
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
	background-color: rgba(255, 251, 234, 0);
}
/* ömer */
.form-radio-item, .form-checkbox-item {
	padding-bottom: 2px !important;
}

.form-radio-item:last-child, .form-checkbox-item:last-child {
	padding-bottom: 0;
}
/* ömer */
[data-type="control_radio"] .form-input, [data-type="control_checkbox"] .form-input,
	[data-type="control_radio"] .form-input-wide, [data-type="control_checkbox"] .form-input-wide
	{
	width: 100%;
	max-width: 202px;
}

.form-radio-item, .form-checkbox-item {
	width: 100%;
	max-width: 202px;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

.form-textbox.form-radio-other-input, .form-textbox.form-checkbox-other-input
	{
	width: 80%;
	margin-left: 3%;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

.form-multiple-column {
	width: 100%;
}

.form-multiple-column .form-radio-item, .form-multiple-column .form-checkbox-item
	{
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

.form-single-column .form-checkbox-item, .form-single-column .form-radio-item
	{
	width: 100%;
}

.form-radio-item:not (#foo ) {
	margin-bottom: 0;
	position: relative;
}

.form-radio-item:not (#foo ) input[type="checkbox"], .form-radio-item:not
	(#foo ) input[type="radio"] {
	display: none;
}

.form-radio-item:not (#foo ) .form-radio-other, .form-radio-item:not (#foo
	) .form-checkbox-other {
	display: inline-block !important;
	margin-left: 7px;
	margin-right: 3px;
	margin-top: 2px;
}

.form-radio-item:not (#foo ) .form-checkbox-other-input,
	.form-radio-item:not (#foo ) .form-radio-other-input {
	margin: 0;
}

.form-radio-item:not (#foo ) label {
	line-height: 18px;
	margin-left: 0;
	float: left;
	text-indent: 27px;
}

.form-radio-item:not (#foo ) label:before {
	content: '';
	position: absolute;
	display: inline-block;
	vertical-align: baseline;
	margin-right: 4px;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border-radius: 2px;
	left: 4px;
	width: 18px;
	height: 18px;
	cursor: pointer;
}

.form-radio-item:not (#foo ) label:after {
	content: '';
	position: absolute;
	z-index: 10;
	display: inline-block;
	opacity: 0;
	top: 4px;
	left: 8px;
	width: 10px;
	height: 10px;
}

.form-radio-item:not (#foo ) input:checked+label:after {
	opacity: 1;
}

.form-radio-item:not (#foo ) label:before {
	background-color: transparent;
	border: 2px solid #828282;
}

.form-radio-item:not (#foo ) label:after {
	background-color: #305096;
	cursor: pointer;
}

.form-checkbox-item:not (#foo ) {
	margin-bottom: 0;
	position: relative;
}

.form-checkbox-item:not (#foo ) input[type="checkbox"],
	.form-checkbox-item:not (#foo ) input[type="radio"] {
	display: none;
}

.form-checkbox-item:not (#foo ) .form-radio-other, .form-checkbox-item:not
	(#foo ) .form-checkbox-other {
	display: inline-block !important;
	margin-left: 7px;
	margin-right: 3px;
	margin-top: 2px;
}

.form-checkbox-item:not (#foo ) .form-checkbox-other-input,
	.form-checkbox-item:not (#foo ) .form-radio-other-input {
	margin: 0;
}

.form-checkbox-item:not (#foo ) label {
	line-height: 18px;
	margin-left: 0;
	float: left;
	text-indent: 27px;
}

.form-checkbox-item:not (#foo ) label:before {
	content: '';
	position: absolute;
	display: inline-block;
	vertical-align: baseline;
	margin-right: 4px;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border-radius: 2px;
	left: 4px;
	width: 18px;
	height: 18px;
	cursor: pointer;
}

.form-checkbox-item:not (#foo ) label:after {
	content: '';
	position: absolute;
	z-index: 10;
	display: inline-block;
	opacity: 0;
	top: 6px;
	left: 10px;
	width: 4px;
	height: 4px;
}

.form-checkbox-item:not (#foo ) input:checked+label:after {
	opacity: 1;
}

.form-checkbox-item:not (#foo ) label:before {
	background-color: transparent;
	border: 2px solid #828282;
}

.form-checkbox-item:not (#foo ) label:after {
	background-color: #305096;
	box-shadow: 0 3px 0 0 #305096, 3px 3px 0 0 #305096, 6px 3px 0 0 #305096,
		9px 3px 0 0 #305096, 8px 6px 0 0 rgba(255, 255, 255, 0), 10px 1px 0 0
		rgba(255, 255, 255, 0);
	-moz-transform: rotate(-45deg);
	-webkit-transform: rotate(-45deg);
	-o-transform: rotate(-45deg);
	-ms-transform: rotate(-45deg);
	transform: rotate(-45deg);
}

.supernova {
	height: 100%;
	background-repeat: no-repeat;
	background-attachment: scroll;
	background-position: center top;
}

.supernova {
	background-image: none;
}

#stage {
	background-image: none;
}
/* | */
.form-all {
	background-repeat: no-repeat;
	background-attachment: scroll;
	background-position: center top;
}

.form-header-group {
	background-repeat: no-repeat;
	background-attachment: scroll;
	background-position: center top;
}

.form-line {
	margin-top: 0px;
	margin-bottom: 0px;
}

.form-line {
	padding: 6px 28px;
}

.form-all .form-textbox, .form-all .form-radio-other-input, .form-all .form-checkbox-other-input,
	.form-all .form-captcha input, .form-all .form-spinner input, .form-all .form-pagebreak-back,
	.form-all .form-pagebreak-next, .form-all .qq-upload-button, .form-all .form-error-message
	{
	-webkit-border-radius: 6px;
	-moz-border-radius: 6px;
	border-radius: 6px;
}

.form-all .form-sub-label {
	margin-left: 3px;
}

.form-all .form-textarea {
	-webkit-border-radius: 6px;
	-moz-border-radius: 6px;
	border-radius: 6px;
}

.form-all .qq-upload-button, .form-all .form-submit-button, .form-all .form-submit-reset,
	.form-all .form-submit-print {
	font-size: 1.15em;
	padding: 12px 18px;
	font-family: "Rambla", sans-serif;
	font-size: 18px;
	font-weight: normal;
}

.form-all .form-submit-print {
	margin-left: 0 !important;
	margin-right: 0 !important;
}

.form-all .form-pagebreak-back, .form-all .form-pagebreak-next {
	font-size: 1em;
	padding: 9px 15px;
	font-family: "Rambla", sans-serif;
	font-size: 16px;
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
	text-align: center;
}

.form-line {
	zoom: 1;
}

.form-line:before, .form-line:after {
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

.form-captcha input, .form-spinner input {
	width: 202px;
}

.form-textbox, .form-textarea {
	width: 100%;
	max-width: 202px;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

.form-input, .form-address-table, .form-matrix-table {
	width: 100%;
	max-width: 202px;
}

.form-radio-item, .form-checkbox-item {
	width: 100%;
	max-width: 202px;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

.form-textbox.form-radio-other-input, .form-textbox.form-checkbox-other-input
	{
	width: 80%;
	margin-left: 3%;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

.form-multiple-column {
	width: 100%;
}

.form-multiple-column .form-radio-item, .form-multiple-column .form-checkbox-item
	{
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
	max-width: 202px;
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

[data-type="control_birthdate"] .form-sub-label-container .form-dropdown
	{
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

[data-type="control_datetime"].allowTime .form-sub-label-container:last-child
	{
	width: 4%;
	margin-right: 0;
}

[data-type="control_datetime"].allowTime .allowTime-container {
	float: right;
	width: 51%;
}

[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container
	{
	width: 27%;
	margin-right: 4%;
}

[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container:first-child
	{
	width: 4%;
	margin-left: 3%;
}

[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container:last-child
	{
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
/*.form-dropdown,
.form-radio-item,
.form-checkbox-item,
.form-radio-other-input,
.form-checkbox-other-input,*/
.form-captcha input, .form-spinner input, .form-error-message {
	padding: 4px 3px 2px 3px;
}

.form-header-group {
	font-family: "Rambla", sans-serif;
}

.form-section {
	padding: 0px 5px 0px 5px;
}

.form-header-group {
	margin: 12px 0px 12px 0px;
}

.form-header-group {
	padding: 12px 36px 12px 36px;
}

.form-header-group .form-header, .form-header-group .form-subHeader {
	color: #131313;
}

.form-textbox, .form-textarea {
	color: #131313;
	padding: 4px 3px 2px 3px;
}

.form-textbox, .form-textarea, .form-radio-other-input,
	.form-checkbox-other-input, .form-captcha input, .form-spinner input {
	background-color: rgba(255, 255, 255, 0);
}

.form-textbox, .form-textarea {
	width: 100%;
	max-width: 202px;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	box-sizing: border-box;
}

[data-type="control_textbox"] .form-input, [data-type="control_textarea"] .form-input,
	[data-type="control_fullname"] .form-input, [data-type="control_phone"] .form-input,
	[data-type="control_datetime"] .form-input, [data-type="control_address"] .form-input,
	[data-type="control_email"] .form-input, [data-type="control_passwordbox"] .form-input,
	[data-type="control_autocomp"] .form-input, [data-type="control_textbox"] .form-input-wide,
	[data-type="control_textarea"] .form-input-wide, [data-type="control_fullname"] .form-input-wide,
	[data-type="control_phone"] .form-input-wide, [data-type="control_datetime"] .form-input-wide,
	[data-type="control_address"] .form-input-wide, [data-type="control_email"] .form-input-wide,
	[data-type="control_passwordbox"] .form-input-wide, [data-type="control_autocomp"] .form-input-wide
	{
	width: 100%;
	max-width: 202px;
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

[data-type="control_datetime"] .form-sub-label-container .date-separate
	{
	visibility: hidden;
}

[data-type="control_datetime"].allowTime .form-sub-label-container {
	width: 12%;
	margin-right: 3%;
}

[data-type="control_datetime"].allowTime .form-sub-label-container:last-child
	{
	width: 4%;
	margin-right: 0;
}

[data-type="control_datetime"].allowTime .allowTime-container {
	float: right;
	width: 51%;
}

[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container
	{
	width: 27%;
	margin-right: 4%;
}

[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container:first-child
	{
	width: 4%;
	margin-left: 3%;
}

[data-type="control_datetime"].allowTime .allowTime-container .form-sub-label-container:last-child
	{
	width: 27%;
	margin-right: 0;
}

[data-type="control_datetime"].allowTime .form-dropdown {
	width: 100%;
}

.form-matrix-table {
	width: 100%;
	max-width: 202px;
}

.form-address-table {
	width: 100%;
	max-width: 202px;
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

[data-type="control_dropdown"] .form-input, [data-type="control_birthdate"] .form-input,
	[data-type="control_time"] .form-input, [data-type="control_dropdown"] .form-input-wide,
	[data-type="control_birthdate"] .form-input-wide, [data-type="control_time"] .form-input-wide
	{
	width: 100%;
	max-width: 202px;
}

[data-type="control_dropdown"] .form-dropdown {
	width: 100% !important;
	max-width: 202px;
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

[data-type="control_birthdate"] .form-sub-label-container .form-dropdown
	{
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
	font-family: "Rambla", sans-serif;
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
	background-color: rgba(255, 255, 255, 0);
	-webkit-box-shadow: inset 0px 3px 11px -7px #ff3200;
	-moz-box-shadow: inset 0px 3px 11px -7px #ff3200;
	box-shadow: inset 0px 3px 11px -7px #ff3200;
}

.form-line-error input:not (#coupon-input ), .form-line-error textarea,
	.form-line-error .form-validation-error {
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
	border: 1px solid #fff4f4;
	-moz-box-shadow: 0 0 3px #fff4f4;
	-webkit-box-shadow: 0 0 3px #fff4f4;
	box-shadow: 0 0 3px #fff4f4;
}

.form-line-error .form-error-message {
	margin: 0;
	position: absolute;
	color: #fff;
	display: inline-block;
	right: 0;
	font-size: 10px;
	position: absolute !important;
	box-shadow: none;
	top: 0px;
	line-height: 20px;
	color: #FFF;
	background: #ff3200;
	padding: 0px 5px;
	bottom: auto;
	min-width: 105px;
	-webkit-border-radius: 0;
	-moz-border-radius: 0;
	border-radius: 0;
}

.form-line-error .form-error-message img, .form-line-error .form-error-message .form-error-arrow
	{
	display: none;
}

.form-all {
	position: relative;
}

.form-all:before {
	content: "";
	background-image:
		url("//www.santorinipremier.gr/sites/default/files/photo%20bookingbanner.jpg");
	display: inline-block;
	height: 150px;
	position: absolute;
	background-size: 388px 150px;
	background-repeat: no-repeat;
	width: 100%;
}

.form-all {
	margin-top: 160px;
}

.form-all:before {
	top: -160px;
	left: 0;
	background-position: top left;
}

.ie-8 .form-all {
	margin-top: auto;
	margin-top: initial;
}

.ie-8 .form-all:before {
	display: none;
}
/* | */
@media screen and (max-width: 480px) , screen and (max-device-width: 768px) and
		(orientation: portrait) , screen and (max-device-width: 415px) and
	(orientation: landscape) {
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
		width: 100% !important;
	}
	.form-line {
		padding: 2% 5%;
		-moz-box-sizing: border-box;
		-webkit-box-sizing: border-box;
		box-sizing: border-box;
	}
	input[type=text], input[type=email], input[type=tel], textarea {
		width: 100%;
		-moz-box-sizing: border-box;
		-webkit-box-sizing: border-box;
		box-sizing: border-box;
		max-width: initial !important;
	}
	.form-input, .form-input-wide, .form-textarea, .form-textbox,
		.form-dropdown {
		max-width: initial !important;
	}
	div.form-header-group {
		padding: 12px 36px !important;
		padding-left: 5% !important;
		padding-right: 5% !important;
		margin: 0 12px 2% !important;
		-moz-box-sizing: border-box;
		-webkit-box-sizing: border-box;
		box-sizing: border-box;
	}
	[data-type="control_button"] {
		margin-bottom: 0 !important;
	}
	.form-buttons-wrapper {
		margin: 0 !important;
	}
	.form-buttons-wrapper button {
		width: 100%;
	}
	table {
		width: 100% !important;
		max-width: initial !important;
	}
	table td+td {
		padding-left: 3%;
	}
	.form-checkbox-item input, .form-radio-item input {
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
</head>
<body>


	<h2 align="center">Select Service</h2>
	<hr width=600>
	<div align="right" style="top: 0"></div>
	<form:form commandName="dropDown" method="post">
		<table align="center">
			<tr>
				<th>Select Service :</th>
				<td><select name="service" id="serv_id"
					onchange="getSubService()">
						<option>--SELECT--</option>
						<core:forEach var="service" items="${serviceList}">
							<option value="${service.serv_id}">${service.serv_desc}</option>
						</core:forEach>
				</select></td>
			</tr>

			<tr>
				<th>Select SubService :</th>
				<td><select name="subService" id="sub_serv_id">

						<core:forEach var="subService" items="${subServiceList}">
							<option value="${subService.sub_serv_id}">${subService.sub_serv_desc}</option>
						</core:forEach>
				</select></td>
			</tr>
		</table>

	</form:form>



	<div 
		align="right" style="top: 0">
		<%if(session.getAttribute("userName")!=null){ %>
		Welcome :<% out.print(session.getAttribute("username"));%>
		<%} %>&nbsp;
		

		<a href="logout.html">LogOut</a>
	</div>


	<form class="jotform-form" action="save.html" method="post"
		name="form_53431401626446" id="53431401626446" accept-charset="utf-8">
		<input type="hidden" name="formID" value="53431401626446" />
		<div class="form-all">
			<ul class="form-section page-section">
				<li class="form-line always-hidden" data-type="control_textbox"
					id="id_11"><label
					class="form-label form-label-top form-label-auto" id="label_11"
					for="input_11"> ID </label>
					<div id="cid_11" class="form-input-wide always-hidden jf-required">
						<input type="text" class=" form-textbox" data-type="input-textbox"
							id="input_11" name="sr_id" size="20" value="" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_1"><label
					class="form-label form-label-top form-label-auto" id="label_1"
					for="input_1"> ServiceName <span class="form-required">
							* </span>
				</label>
					<div id="cid_1" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_1" name="sr_desc" size="20"
							value="" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_8"><label
					class="form-label form-label-top form-label-auto" id="label_8"
					for="input_8"> Sub Service Name <span class="form-required">
							* </span>
				</label>
					<div id="cid_8" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_8" name="sub_serv_name"
							size="20" value="" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_9"><label
					class="form-label form-label-top form-label-auto" id="label_9"
					for="input_9"> Area Name <span class="form-required">
							* </span>
				</label>
					<div id="cid_9" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_9" name="ar_name" size="20"
							value="" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_3"><label
					class="form-label form-label-top form-label-auto" id="label_3"
					for="input_3"> Please Enter Your Name <span
						class="form-required"> * </span>
				</label>
					<div id="cid_3" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_3" name="sr_pers_name"
							size="20" value="" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_4"><label
					class="form-label form-label-top form-label-auto" id="label_4"
					for="input_4"> Kindly Provide Your Mobile Number <span
						class="form-required"> * </span>
				</label>
					<div id="cid_4" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_4" name="phone" size="12"
							value="" maxlength="12" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_5"><label
					class="form-label form-label-top form-label-auto" id="label_5"
					for="input_5"> Address Line1 <span class="form-required">
							* </span>
				</label>
					<div id="cid_5" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_5" name="address1" size="20"
							value="" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_6"><label
					class="form-label form-label-top form-label-auto" id="label_6"
					for="input_6"> Address Line2 <span class="form-required">
							* </span>
				</label>
					<div id="cid_6" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_6" name="address2" size="20"
							value="" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_7"><label
					class="form-label form-label-top form-label-auto" id="label_7"
					for="input_7"> Enter Your Email <span class="form-required">
							* </span>
				</label>
					<div id="cid_7" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_7" name="email" size="20"
							value="" />
					</div></li>
				<li class="form-line jf-required" data-type="control_textbox"
					id="id_10"><label
					class="form-label form-label-top form-label-auto" id="label_10"
					for="input_10"> Service Expecting Date <span
						class="form-required"> * </span>
				</label>
					<div id="cid_10" class="form-input-wide jf-required">
						<input type="text" class=" form-textbox validate[required]"
							data-type="input-textbox" id="input_10" name="ep_date" size="20"
							value="" />
					</div></li>
				<li class="form-line always-hidden" data-type="control_textbox"
					id="id_12"><label
					class="form-label form-label-top form-label-auto" id="label_12"
					for="input_12"> RequestedDate </label>
					<div id="cid_12" class="form-input-wide always-hidden jf-required">
						<input type="text" class=" form-textbox" data-type="input-textbox"
							id="input_12" name="sr_date" size="20" value="NOW()" />
					</div></li>
				<li class="form-line" data-type="control_button" id="id_2">
					<div id="cid_2" class="form-input-wide">
						<div style="margin-left: 156px" class="form-buttons-wrapper">
							<button id="input_2" type="submit" class="form-submit-button">
								Request a Service</button>
						</div>
						<br>
						<div style="margin-left: 156px" class="form-buttons-wrapper">
							<a href="index.html" id="input_2" type="button"
								class="form-submit-button"> Go Back To Main Page </a>
						</div>
				</li>
				<li style="display: none">Should be Empty: <input type="text"
					name="website" value="" />
				</li>
			</ul>
		</div>
		<input type="hidden" id="simple_spc" name="simple_spc"
			value="53431401626446" />
		<script type="text/javascript">
  document.getElementById("si" + "mple" + "_spc").value = "53431401626446-53431401626446";
  </script>
	</form>
	<script type="text/javascript">VSCS.ownerView=true;</script>


<form>
<div>

</div>
<div class="container">


  <form class="form-inline" role="form">
    <div class="form-group">
      <label for="service name">Service Name:</label>
      <input type="service name" class="form-control" id="service name" placeholder="enter service name">
    </div>
<br><br>
    <div class="form-group">
      <label for="sub service name">Sub Service:</label>
      <input type="sub service name" class="form-control" id="sub service name" placeholder="enter sub service">
    </div><br><br>
     <div class="form-group">
      <label for="areaname">Area Name:</label>
      <input type="areaname" class="form-control" id="areaname" placeholder=" enter areaname">
    </div><br><br>
      <div class="form-group">
      <label for="name">Enter Your Name:</label>
      <input type="name" class="form-control" id="name" >
    </div><br><br>
       <div class="form-group">
      <label for="mobileno">Enter Your Mobile No:</label>
      <input type="mobileno" class="form-control" id="mobileno" >
    </div><br><br>
      <div class="form-group">
      <label for="address line1">Address Line1:</label>
      <input type="address line1" class="form-control" id="address line1" >
    </div><br><br>
     <div class="form-group">
      <label for="address line2">Address Line2:</label>
      <input type="address line2" class="form-control" id="address line2" >
    </div><br><br>
     <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" >
    </div><br><br>
         <div class="form-group">
      <label for="serviceexpdate">Service Expected Date:</label>
      <input type="serviceexpdate" class="form-control" id="serviceexpdate" >
    </div><br><br>

   
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</form>
</body>
</html>