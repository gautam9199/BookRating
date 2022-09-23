
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            .ftr
    {	position:relative;  top:400px;    height:90px;		width:100%;		background-color:#D1D6D4; }
    .ftr_info{
         font-size:5; font-family:cambria; color:#585858; }
    </style>
    </head>
    <body>
        <div  class="hdr">
	<table border="0">
	<tr>
	<td width="700px"><img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/></td>
	<td width="500px"><form action="Vupload.jsp" method="get" align="center">
                <button type="submit" class="button1"> UPLOAD BOOK </button></form></td>
        <td><form action="Logout.jsp" method="get"><button  class="button1" type="submit">Logout</button></form></td>
	</tr>
	</table>
	</div>
        <div>
		<table border="0" cellpadding="0" cellspacing="0" width="100%">
			<tr height="50px" bgcolor="#585858" valign="center" width="100%">
				<td align="center" width="50%"><form action="Vsearchcat.jsp" method="get" align="center">
			<button type="submit" class="button1"> Search By Category </button></form></td>
				<td align="center" width="50%"><form action="Vsearchbook.jsp" method="get" align="center">
			<button type="submit" class="button1"> Search By Bookname </button></form></td>
			</tr>
		</table>
	</div>
        <div>
            <%
                String value = session.getAttribute("name1").toString();
                out.println(value);
            %>
        </div>
        <div class="ftr">
	<table border="0">
	<tr>
		<td width="100px"><a class="ftr_info" href="Vcontact.jsp" >Contact us</a></td>
		<td width="100px"><a class="ftr_info" href ="abc.com">About us</a></td>
		<!--<td width="100px"><a href ="pqr.com">Feedback</a></td> -->
		<td>&copy; Copyright 2017.All rights are reserved.</td>
	</div>
    </body>
</html>
