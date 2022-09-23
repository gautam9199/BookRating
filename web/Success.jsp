
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
        padding: 10px 30px;
        text-align: center;
        font-size: 16px;
        cursor: pointer;
            border-radius: 6px;	
    }
    </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
     <div  class="hdr" >
		<img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
     </div>
     <%
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
    %>
    <div align="center"><font size="5" face="cambria" color="#0fcabf"><br><br><br>You are not logged in<br/></font>
        <a href="Vlogin.jsp"><font face="verdana" color="#585858">Please Login</font></a>
    <%
    } else{
    %>
    Welcome <%=session.getAttribute("userid")%>
    <!--<a href='Vsuccess.jsp'><font face="verdana" color="#585858">Log out</font></a> -->
    <%
    response.sendRedirect("Vsuccess.jsp");
     }
    %>
    </div>
    </body>
</html>
