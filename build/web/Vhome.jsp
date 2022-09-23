
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <style>
            @keyframes slidy {
		0% { left: 0%; }
		20% { left: 0%; }
		25% { left: -100%; }
		45% { left: -100%; }
		50% { left: -200%; }
		70% { left: -200%; }
		75% { left: -300%; }
		95% { left: -300%; }
		100% { left: -400%; }
		}

		body { margin: 0; } 
		div#slider { overflow: hidden; }
		div#slider figure img { width: 20%; float: left; }
		div#slider figure { 
		  position: relative;
		  width: 500%;
		  margin: 0;
		  left: 0;
		  text-align: left;
		  font-size: 0;
		  animation: 30s slidy infinite; 
		}
        .hdr
        { height:100px; width:100%;
        background-color:#F3F4F5;
        }
        .button1 { 
            border:none;
            background-color:#0fcabf; 
            color: white;
            padding: 8px 26px;
            text-align: center;
            font-size: 16px;
            cursor: pointer;
            border-radius: 6px;	
           }
         .ftr
        {  height:90px;	 width:100%;	background-color:#D1D6D4; }
        .ftr_info{
         font-size:5; font-family:cambria; color:#585858; }
        </style>
    </head>
    <body>
	<div  class="hdr" >
	<table border="0">
	<tr>
	<td width="700px"><img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/></td>
	<td width="500px"><form action="Vlogin.jsp" method="get" align="center">
			<button style="padding: 10px 30px;"type="submit" class="button1"> UPLOAD BOOK </button></form></td>
                        <td><form action="Vlogin.jsp" method="get"><button  class="button1" type="submit" value="  Login"> LOGIN </button></form><br>
            <form action="Vreg.jsp" method="post"><button  class="button1" type="submit" value="  sing up">Signup</button></form></td>
	</tr>
        </table>
	</div>
        <div>
            <table border="0" cellpadding="0" cellspacing="0" width="100%">
		<tr height="50px" bgcolor="#585858" valign="center" width="100%">
                    <td align="center" width="50%"><form action="Vsearchcat.jsp" method="get" align="center">
			<button style="padding: 10px 30px;" type="submit" class="button1"> Search By Category </button></form></td>
                    <td align="center" width="50%"><form action="Vsearchbook.jsp" method="get" align="center">
			<button style="padding: 10px 30px;" type="submit" class="button1"> Search By Bookname </button></form></td>
		</tr>
            </table>
        </div>
       <div id="slider">
        <figure>
        <img style=" height:550px;" src="11.jpg" alt>
        <img style=" height:550px;" src="22.jpg" alt>
        <img style=" height:550px;" src="3.jpg" alt>
        <img style=" height:550px;" src="4.jpg" alt>
        <img style=" height:550px;" src="6.jpg" alt> 
        </figure>
        </div>
	<div class="ftr">
	<table border="0">
	<tr>
		<td  width="100px"><a class="ftr_info" href="Vcontact.jsp" >Contact us</a></td>
		<td width="100px"><a class="ftr_info" href ="abc.com">About us</a></td>
		<!--<td width="100px"><a class="ftr_info" href ="pqr.com">Feedback</a></td> -->
		<td>&copy; Copyright 2017.All rights are reserved.</td>
	</div>
    </body>
</html>
