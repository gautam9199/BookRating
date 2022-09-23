<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style>
.hdr
{ height:100px; width:100%;
background-color:#F3F4F5;
}
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
<body background="F:\wallies\HD Wallpapers\img36.jpg">
	<div  class="hdr" >
		<img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
	</div>
      <form method="post" action="Login.jsp">
       <center>
		<table cellpadding=8 cellspacing=8 border="0" bgcolor="transparent"><BR><BR>
			<tr>
			<th colspan="3">
			<font size=10 face="verdana" color="#585858">Login Here</font><br></th>
			</tr>
			<tr bgcolor="transparent">
				<td valign=top> <font size=5 face="verdana" color="#0fcabf"><b>Username</b></font></td>
				<td colspan="2"><input type="text" name="uname" value="" size=40 maxlength=50></td>
			</tr>
			<tr>
                            <td valign=top> <font size=5 face="Verdana" color="#0fcabf"><b>Password</b></font></td><br>
				<td colspan="2"><input type="Password" name="pwd" value="" size=40 maxlength=10></td>
			</tr>
			<tr bgcolor="transparent">
				<td></td>
				<td><input class="button1" type="Submit" value="Submit">
					<input class="button1" type="reset" value="Reset"></td>
			</tr>
             <tr>
                 <td colspan="3" align="center"><font face="Verdana" color="#0fcabf">Yet Not Registered!! </font><font face="verdana" color="#585858"><a href="Vreg.jsp">Register Here</a></font></td>
            </tr>
            </table>
            </center>
        </form>
    </body>
</html>