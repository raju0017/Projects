<%@page contentType="text/html" pageEncoding="UTF-8"%>
<HEAD>
<!--<SCRIPT LANGUAGE="JavaScript">
    function pload()
    {
        document.getElementById("mine").style.color = "maroon";
        setTimeout("pload1()", 2500);
    }
    function pload1()
    {
        document.getElementById("mine").style.color = "blue";
        setTimeout("pload2()", 2500);
    }
    function pload2()
    {
        document.getElementById("mine").style.color = "brown";
        setTimeout("pload3()", 2500);
    }
    function pload3()
    {
        document.getElementById("mine").style.color = "red";
        setTimeout("pload()", 2500);
    }

</SCRIPT>-->
</head>

<BODY onload=""> <table> <tr>
            <td width="8%"> <img border="0" src="E:\swathi\homeservices\HomeServices\src\main\webapp\WEB-INF\pages\home.jpg" width="80" height="80"></td>
            <td width="62%"> <H1 id="mine" style="font-family:impact;text-align:left;font-size:50px;color:#5379fa">AT YOUR HOME</H1></td>
            <td width="30%"style="color: #ffffff">Date and time: <%=new java.util.Date()%><br></td>
        </tr>
    </table>
  <!--<marquee behavior="slide" direction="left">Your slide-in text goes here</marquee>-->
</BODY>

