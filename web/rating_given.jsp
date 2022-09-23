
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
        background:#F3F4F5;
        }
        </style>
    </head>
    <body>
        <div  class="hdr">
                   <img  src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
    </div>
        <% if(session.getAttribute("userid")==null || session.getAttribute("userid")=="")
        {
        response.sendRedirect("Vlogin.jsp");
        }
        
        else{
                
                 if(request.getParameter("g_rating")!=null)
    {
         Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
        Statement st = con.createStatement();
        String queryCheck = "SELECT * from  user_rating WHERE email='"+session.getAttribute("userid").toString()+"' and breg_no='"+session.getAttribute("n1")+"'";
        ResultSet rs = st.executeQuery(queryCheck); 

        // if this ID already exists, we quit
        if(rs.absolute(1)) {
        %>
        <div style="position:relative; top:100px;">
           <center>
               </br><font size="3" face="verdana" color="#585858">You have already given rating for this book once!..</font>
       </br><a href='Vsearchbook.jsp'><font size="5" face="verdana" color="#585858">Click here Continue Searching Books</font></a>
       </br><a href='Vsuccess.jsp'><font size="5" face="verdana" color="#585858">Click here to go back to Home page</font></a> 
           </center>
       </div>
        <%
        }
        else{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
              "shabnam", "12121996shab@");
        Statement st1 = con.createStatement();
        int m=Integer.parseInt(request.getParameter("g_rating"));
        session.setAttribute("r",m);
          String email = session.getAttribute("userid").toString();
        int i = st1.executeUpdate("insert into user_rating(email,bname,rating,breg_no) values ('" + email + "','" + session.getAttribute("b_name").toString() + "','" + request.getParameter("g_rating") + "','" + session.getAttribute("n1") + "')");
            if (i > 0) 
            {
               response.sendRedirect("rating_refresh.jsp");
               
            } 
    } }}
        %>
    </body>
</html>
