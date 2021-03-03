<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://cdn.jotfor.ms/static/prototype.forms.js" type="text/javascript"></script>
<script src="https://cdn.jotfor.ms/static/jotform.forms.js?3.3.9913" type="text/javascript"></script>
<script type="text/javascript">
   JotForm.init(function(){
      setTimeout(function() {
          $('input_10').hint('ex: myname@example.com');
       }, 20);
      JotForm.calendarMonths = ["January","February","March","April","May","June","July","August","September","October","November","December"];
      JotForm.calendarDays = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"];
      JotForm.calendarOther = {"today":"Today"};
      JotForm.setCalendar("16", false, false);
	JotForm.clearFieldOnHide="disable";
	JotForm.onSubmissionError="jumpToSubmit";
   });
</script>
<link href="https://cdn.jotfor.ms/static/formCss.css?3.3.9913" rel="stylesheet" type="text/css" />
<link type="text/css" rel="stylesheet" href="https://cdn.jotfor.ms/css/styles/nova.css?3.3.9913" />
<link type="text/css" media="print" rel="stylesheet" href="https://cdn.jotfor.ms/css/printForm.css?3.3.9913" />
<link type="text/css" rel="stylesheet" href="https://secure.jotform.me/themes/CSS/5489cead700cc469138b4567.css?session=47761147387008&themeRevisionID=555da031977cdfad168b4567"/>
<style type="text/css">
    .form-label-left{
        width:184px !important;
    }
    .form-line{
        padding-top:12px;
        padding-bottom:12px;
    }
    .form-label-right{
        width:184px !important;
    }
    .form-all{
        width:450px;
        color:rgb(27, 2, 9) !important;
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
  width: 184px;
}
.form-label {
  white-space: normal;
}
.form-label.form-label-auto {
  display: inline-block;
  float: left;
  text-align: left;
  width: 184px;
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
  background-color: #effab4;
  background-color: #d1f2a5;
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
    border: 1px solid #baec78;
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
@media screen and (min-width: 768px) and (max-width: 1024px) {
  .jotform-form {
    padding: 60px 0;
  }
}
/* | */
/* | */
@media screen and (min-width: 1024px) {
  .jotform-form {
    padding: 90px 0;
  }
}
/* | */
.supernova .form-all,
.form-all {
  background-color: #effab4;
  border: 1px solid transparent;
}
.form-header-group {
  border-color: #e5f784;
}
.form-matrix-table tr {
  border-color: #e5f784;
}
.form-matrix-table tr:nth-child(2n) {
  background-color: #eaf89c;
}
.form-all {
  color: #1b0209;
}
.form-header-group .form-header {
  color: #1b0209;
}
.form-header-group .form-subHeader {
  color: #4a0619;
}
.form-sub-label {
  color: #4a0619;
}
.form-label-top,
.form-label-left,
.form-label-right,
.form-html {
  color: #1b0209;
}
.form-checkbox-item label,
.form-radio-item label {
  color: #4a0619;
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
  background-color: rgba(255, 255, 255, 0.75);
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
}
.supernova {
  background-image: none;
}
#stage {
  background-image: none;
}
/* | */
.form-all {
  background-image: url("//www.jotform.com/themes/css/|nobackground|");
  background-image: none;
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
.form-all .form-submit-button,
.form-all .form-submit-reset,
.form-all .form-submit-print {
  -webkit-border-radius: 6px;
  -moz-border-radius: 6px;
  border-radius: 6px;
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
  color: #b119d4;
}
.form-header-group {
  background-color: ;
}
.form-textbox,
.form-textarea {
  color: #b5b5b5;
  padding: 4px 3px 2px 3px;
}
.form-textbox,
.form-textarea,
.form-radio-other-input,
.form-checkbox-other-input,
.form-captcha input,
.form-spinner input {
  background-color: #fdfdfd;
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
  margin-right: 1px;
  margin-bottom: 0;
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
  background-image: url("//cdn.mysitemyway.com/etc-mysitemyway/icons/legacy-previews/icons/matte-blue-and-white-square-icons-business/116975-matte-blue-and-white-square-icon-business-home5.png");
  display: inline-block;
  height: 102px;
  position: absolute;
  background-size: 102px 102px;
  background-repeat: no-repeat;
  width: 100%;
}
.form-all {
  margin-top: 102px;
}
.form-all:before {
  top: -102px;
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
</head>
<body>
<form class="jotform-form" action="electricity.html" method="post" name="form_53132013259445" id="53132013259445" accept-charset="utf-8">
  <input type="hidden" name="formID" value="53132013259445" />
  <div class="form-all">
    <ul class="form-section page-section">
      <li id="cid_1" class="form-input-wide" data-type="control_head">
        <div class="form-header-group">
          <div class="header-text httal htvam">
            <h2 id="header_1" class="form-header">
              Home Services|Register Employee details
            </h2>
          </div>
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_3">
        <label class="form-label form-label-left form-label-auto" id="label_3" for="input_3">
          User Id
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_3" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_3" name="q3_employeeId" size="23" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_5">
        <label class="form-label form-label-left form-label-auto" id="label_5" for="input_5">
          Enter Name
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_5" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_5" name="q5_Employee" size="20" value="" />
        </div>
      </li>
      <li class="form-line" data-type="control_email" id="id_10">
        <label class="form-label form-label-left form-label-auto" id="label_10" for="input_10"> E-mail </label>
        <div id="cid_10" class="form-input jf-required">
          <input type="email" class=" form-textbox validate[Email]" id="input_10" name="q10_email" size="30" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_12">
        <label class="form-label form-label-left form-label-auto" id="label_12" for="input_12">
          Address1
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_12" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_12" name="q12_address1" size="20" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_textbox" id="id_13">
        <label class="form-label form-label-left form-label-auto" id="label_13" for="input_13">
          Address2
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_13" class="form-input jf-required">
          <input type="text" class=" form-textbox validate[required]" data-type="input-textbox" id="input_13" name="q13_address2" size="20" value="" />
        </div>
      </li>
      <li class="form-line jf-required" data-type="control_phone" id="id_14">
        <label class="form-label form-label-left form-label-auto" id="label_14" for="input_14">
          Phone Number
          <span class="form-required">
            *
          </span>
        </label>
        <div id="cid_14" class="form-input jf-required">
          <span class="form-sub-label-container" style="vertical-align: top">
            <input class="form-textbox validate[required]" type="tel" name="q14_phoneNumber[area]" id="input_14_area" size="3">
            <span class="phone-separate">
              &nbsp;-
            </span>
            <label class="form-sub-label" for="input_14_area" id="sublabel_area" style="min-height: 13px;"> Area Code </label>
          </span>
          <span class="form-sub-label-container" style="vertical-align: top">
            <input class="form-textbox validate[required]" type="tel" name="q14_phoneNumber[phone]" id="input_14_phone" size="8">
            <label class="form-sub-label" for="input_14_phone" id="sublabel_phone" style="min-height: 13px;"> Phone Number </label>
          </span>
        </div>
      </li>
      <li class="form-line" data-type="control_datetime" id="id_16">
        <label class="form-label form-label-left form-label-auto" id="label_16" for="input_16"> Effective Date </label>
        <div id="cid_16" class="form-input jf-required">
          <span class="form-sub-label-container" style="vertical-align: top">
            <input class="form-textbox" id="month_16" name="q16_Effective[month]" type="tel" size="2" maxlength="2" value="" />
            <span class="date-separate">
              &nbsp;-
            </span>
            <label class="form-sub-label" for="month_16" id="sublabel_month" style="min-height: 13px;"> Month </label>
          </span>
          <span class="form-sub-label-container" style="vertical-align: top">
            <input class="form-textbox" id="day_16" name="q16_Effective[day]" type="tel" size="2" maxlength="2" value="" />
            <span class="date-separate">
              &nbsp;-
            </span>
            <label class="form-sub-label" for="day_16" id="sublabel_day" style="min-height: 13px;"> Day </label>
          </span>
          <span class="form-sub-label-container" style="vertical-align: top">
            <input class="form-textbox" id="year_16" name="q16_Effective[year]" type="tel" size="4" maxlength="4" value="" />
            <label class="form-sub-label" for="year_16" id="sublabel_year" style="min-height: 13px;"> Year </label>
          </span>
          <span class="form-sub-label-container" style="vertical-align: top">
            <img class="showAutoCalendar" alt="Pick a Date" id="input_16_pick" src="https://cdn.jotfor.ms/images/calendar.png" align="absmiddle" />
            <label class="form-sub-label" for="input_16_pick" style="min-height: 13px;">  </label>
          </span>
        </div>
      </li>
      <li class="form-line" data-type="control_button" id="id_15">
        <div id="cid_15" class="form-input-wide">
          <div style="margin-left:190px" class="form-buttons-wrapper">
            <button id="input_15" type="submit" class="form-submit-button">
              Submit
            </button>
          </div>
        </div>
      </li>
      <li style="display:none">
        Should be Empty:
        <input type="text" name="website" value="" />
      </li>
    </ul>
  </div>
  <input type="hidden" id="simple_spc" name="simple_spc" value="53132013259445" />
  <br>		<a href="index.html">Click Here To Go Back to Main Page</a>

  </body>
  <script type="text/javascript">
  document.getElementById("si" + "mple" + "_spc").value = "53132013259445-53132013259445";
  </script>
</form>
</html> 