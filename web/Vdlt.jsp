
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
        <div  class="hdr" >
		<img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
	</div>
        <center>
	<div style="position:relative; top:50px;">
        <table border="3" cellpadding="1" cellspacing="0">
        <tr>
        <th>Book No.</th>
        <th>Book name</th>
        <th>Author</th>
        <th>Publication</th>
        <th>genre</th>
        <th>Description</th>
        <th>Book cover</th>
        <th>Rating</th>
        <th> </th>
        </tr>
        <%
            Statement statement = null;
        ResultSet resultSet = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
        String query = "select * from book where flag1=1";
        statement = con.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
        %>
        
        <tr>
            <form action="Vdlt1.jsp" method="post">
        <td width="100px"><input type="text" name="no" value="<%=resultSet.getString("reg_no")%>"></input></td>
        <td width="100px"><input type="text" name="bname" value="<%=resultSet.getString("bname1")%>"></input></td>
        <td width="100px"><input type="text" name="author" value="<%=resultSet.getString("author1")%>"></input></td>
        <td width="100px"><input type="text" name="pub" value="<%=resultSet.getString("publication1")%>"></input></td>
        <td width="100px"><input type="text" name="cat" value="<%=resultSet.getString("genre1")%>"></input></td>
        <td width="100px"><input type="text" name="des" value="<%=resultSet.getString("description1")%>"></input></td>
        <td width="100px"><input type="text" name="cvr" value="<%=resultSet.getString("img1")%>"></input></td>
        <td width="100px"><input type="text" name="rating" value="<%=resultSet.getString("rating")%>"></input></td>
        <td width="100px"><button  class="button1" type="submit" value="dlt">Delete</button></td></form>
        </tr>
        <%
         
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
        %>
        </table>
        </center>
        </div>
        </body>
</html>
