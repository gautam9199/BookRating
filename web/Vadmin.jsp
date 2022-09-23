
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
    width:200;
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
		<img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
	</div>
	
	<center>
	<div style="position:relative; top:100px;">
	<table cellspacing="40">
	<tr>
		<td> <form action="Vadd.jsp" method="post"><button  class="button1" type="submit" value="">Book requests</button></form></td>
	</tr>
        <tr >
		<td> <form action="Vdlt.jsp" method="post"><button  class="button1" type="submit" value="">Delete  Books</button></form></td>
	</tr>
	</table>
	</div>
	</center>

</body>
</html>