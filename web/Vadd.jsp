<%@ page import ="java.sql.*" %>
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
        <th>Book name</th>
        <th>Author</th>
        <th>Publication</th>
        <th>genre</th>
        <th>Description</th>
        <th>Book cover</th>
        <th>User name</th>
        <th>email-id</th>
        <th> </th>
        </tr>
        <%
            Statement statement = null;
        ResultSet resultSet = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
        String query = "select * from request where flag=1";
        statement = con.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
        %>
        
        <tr>
            <form action="Vadd1.jsp" method="post">
            <td width="100px"><input type="text" name="bname" value="<%=resultSet.getString("bname")%>"></input></td>
        <td width="100px"><input type="text" name="author" value="<%=resultSet.getString("author")%>"></input></td>
        <td width="100px"><input type="text" name="pub" value="<%=resultSet.getString("publication")%>"></input></td>
        <td width="100px"><input type="text" name="cat" value="<%=resultSet.getString("genre")%>"></input></td>
        <td width="100px"><input type="text" name="des" value="<%=resultSet.getString("description")%>"></input></td>
        <td width="100px"><input type="text" name="cvr" value="<%=resultSet.getString("img")%>"></input></td>
        <td width="100px"><input type="text" name="unm" value="<%=resultSet.getString("Uname")%>"></input></td>
        <td width="100px"><input type="text" name="uid" value="<%=resultSet.getString("Uid")%>"></input></td>
        <td width="100px"><button  class="button1" type="submit" value="add">Add</button></td></form>
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
