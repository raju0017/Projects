<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head >
<style type="text/css">
  .RightBackground
  {
     background-color: #EAF4D9;
  }
 </style>

</head>
 <frameset class="RightBackground" rows="130,*,25"  framespacing=0 frameborder=no border=0 style="background:url('C:\Users\SYSTEM 3\Desktop\images\homepic.png') ;background-repeat:no-repeat;box-shadow: inset 0 0 0 1000px rgba(0,0,0,.2);background-size:cover;"> 
            <frame  class="RightBackground" name="a" src="Title.jsp" /> 
        <frameset  class="RightBackground" cols="10,300,*,10" > 
        <frame/>
            <frame  class="RightBackground" name="b" src="names.jsp" style="border-top: solid;border-bottom: solid;border-left: solid;"/>
            <frame class="RightBackground" src=""  name="disp" style="border: solid;"/>
         </frameset>
         
  </frameset>     
         
</html>



