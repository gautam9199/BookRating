
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact form</title>
        <style>
         .hdr
        { height:100px; width:100%;
        background-color:#F3F4F5;
        }
         .ftr
        {position:relative;   height:90px;	 width:100%;	background-color:#D1D6D4; }
        .ftr_info{
         font-size:5; font-family:cambria; color:#585858; }
        .button1 { 
	background-color:#0fcabf; 
	border: none;
        color: white;
        padding: 10px 30px;
        text-align: center;
        font-size: 16px;
        cursor: pointer;
        border-radius: 6px;	
        }
        </style>
    </head>
    <body>
        <div  class="hdr" >
	<table border="0">
	<tr>
	<td width="700px"><img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/></td>
	</tr>
        </table>
	</div>
        <div>
             <form action="Contact.jsp" method=post>
            <center>
         <table cellpadding=8 cellspacing=8 border="0" bgcolor="transparent"><BR><BR>
            <tr>
                <th colspan="2"><font size=10 face="verdana" color="#585858">Contact Us</font><br></th>
            </tr>
            <tr bgcolor="transparent">
                <td valign=top><font size=5 face="verdana" color="#0fcabf"><b>Name</b></font></td>
                <td><input type="text" name="name" value="" size=40 maxlength=30>
            <tr>
            <tr bgcolor="transparent">
                <td valign=top><font size=5 face="verdana" color="#0fcabf"><b>Email id</b></font></td>
                <td><input type="email" name="email" value="" size=40 maxlength=30>
            <tr>
            <tr bgcolor="transparent">
                <td valign=top><font size=5 face="verdana" color="#0fcabf"><b>City</b></font></td>
                <td><input type="text" name="city" value="" size=40 maxlength=15>
            <tr>
            <tr bgcolor="transparent">
                <td valign=top> <font size=5 face="verdana" color="#0fcabf"><b>Description</b></font></td>
                <td><TEXTAREA name="des" ROWS=4 COLS=42></textarea>
            </tr>
            <tr bgcolor="transparent">
                <td align="center" colspan="2"><input class="button1" type="SUBMIT" value="SUBMIT"></td>
            </tr>
            </table>
        </form>
	</div>
         </div>
	<div class="ftr">
	<table border="0">
	<tr>
		<td  width="100px"><a class="ftr_info" href="xyz.com" >Contact us</a></td>
		<td width="100px"><a class="ftr_info" href ="abc.com">About us</a></td>
		<!--<td width="100px"><a class="ftr_info" href ="pqr.com">Feedback</a></td> -->
		<td>&copy; Copyright 2017.All rights are reserved.</td>
	</div>
    </body>
</html>
