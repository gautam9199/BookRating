

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
        <div  bgcolor="#F3F4F5" class="hdr">
                   <img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
    </div>
<% Statement statement = null;
        ResultSet resultSet = null;
       ResultSet  resultSet1=null;
    Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
      
            String query = "select * from user_rating  where bname='" + session.getAttribute("b_name").toString()+ "' and breg_no='" + session.getAttribute("n1") + "' ";
            statement = con.createStatement();          
        resultSet = statement.executeQuery(query);
        
        resultSet.last();
        int total_no_row = resultSet.getRow();
        resultSet.beforeFirst();
       // out.println(total_no_row); 
        /* int new_rat=(Integer)session.getAttribute("r");
        out.println(new_rat);
        int old_rat=(Integer)session.getAttribute("b_rating");
        out.println(old_rat);
        int avg=((old_rat + new_rat)/(total_no_row + 1));
        out.println(avg);  */    
       int sum=0;
       int arr[]=new int[total_no_row+1];
       int t=total_no_row;
        for(int i=0;i<t;i++)
        {
            while (resultSet.next()) 
            {
                    arr[i]=resultSet.getInt(3);  
                    sum+=arr[i];
            }   
        }  
      int avg1=sum / total_no_row;
     
      session.setAttribute("a",avg1);
       String sql = "update book set rating='"+session.getAttribute("a").toString()+"' where reg_no='"+session.getAttribute("n1")+"' ";
            int g = statement.executeUpdate(sql);
       if(g>0)
       { %>
       <div style="position:relative; top:100px;">
           <center>
       </br><a href='Vsearchbook.jsp'><font size="5" face="verdana" color="#585858">Click here Continue Searching Books</font></a>
       </br></br><a href='Vsuccess.jsp'><font size="5" face="verdana" color="#585858">Click here to go back to Home page</font></a> 
           </center>
       </div>
      <% }
       else
       {out.println("error!...");} 
%>
         

    </body>
</html>
