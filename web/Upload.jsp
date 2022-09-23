
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
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
    </style>
        </head>
    <body>
    <%
    String bname = request.getParameter("bname");    
    String pub = request.getParameter("pub");
    String author = request.getParameter("author");
    String cat = request.getParameter("cat");
    String des = request.getParameter("des");
   String img = request.getParameter("cvr");
    String unm = session.getAttribute("name1").toString();
    String uid = session.getAttribute("userid").toString();
 
    if(bname!="" && pub!="" && author!="" && cat!="" && des!="" )
    {
        //out.println("welcome");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
        Statement st = con.createStatement();

       int i = st.executeUpdate("insert into request(bname,author,publication,genre,description,img,flag,Uname,uid) values ('" + bname + "','" + author + "','" + pub + "','" + cat + "','" + des + "','" + img + "',1,'" + unm + "','" + uid + "')");
            if (i > 0) 
            {
         %>
        <div  class="hdr" >
		<img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
	</div>
        
        <center>
	<div style="position:relative; top:50px;">
               <font size="5" color="#0fcabf">book request has been sent!..you will get the reply in your email</font>
             <br><a href='Vsuccess.jsp'><font face="verdana" color="#585858">Click here to Continue</font></a>
        </div>
        </center>
           <% 
            }
            else 
            {
                response.sendRedirect("Vsuccess.jsp");
               
            }
    }
    else
    { 
    %>
    <font face="Verdana" color="#0fcabf">please fill up entire details!..</font>
    <%
    }
%>
    </body>
</html>
