
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             int no = Integer.parseInt(request.getParameter("no"));
            Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
        Statement st = con.createStatement();
        String sql = "update book set flag1=0 where reg_no='"+no+"' ";
            int i=st.executeUpdate(sql);
                      if (i > 0) 
                      {
                       out.println("Book will no longer be seen on the website!...");
                    %>
           <br><a href='Vdlt.jsp'><font face="verdana" color="#585858">Click here to  continue with deleting books</font></a>
            <br><a href='Vadmin.jsp'><font face="verdana" color="#585858">Click here to go to home page</font></a>
            <%
                      }
        
        %>
    </body>
</html>
