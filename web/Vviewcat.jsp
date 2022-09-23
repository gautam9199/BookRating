
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
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
.t1{font-size:17; font-family:verdana; }
</style>
</head>
<body>
	<div  class="hdr" >
		<img   src="l7.png" alt="logo" align="left" width="250px" height="80px"/>
               
        </div>
        <% int n1 = Integer.parseInt(request.getParameter("n1")); 
Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
PreparedStatement ps=con.prepareStatement("select * from book where reg_no='"+n1+"'");  
ResultSet rs=ps.executeQuery();  
while(rs.next()){ 
        session.setAttribute("b_name",rs.getString(1));
session.setAttribute("b_author",rs.getString(2));
session.setAttribute("b_pub",rs.getString(3));
session.setAttribute("b_genre",rs.getString(4));
session.setAttribute("b_rating",rs.getInt(7));
session.setAttribute("b_des",rs.getString(5));
session.setAttribute("b_img",rs.getString(6));
%>	
        


	<center>
	<div style="position:relative; top:50px;">
	<table cellpadding="3" cellspacing="2">
	<tr>
		<td width="200px" rowspan="6"><img src="l7.jpg" height="210px" width="180px" alt="Book cvr"/></td>
		<td ><p class="t1">Book Name : <font size="4" face="verdana" color="#0fcabf"><%=rs.getString(1)%></td>
	</tr>
	<tr>
		<td><p class="t1">Author : <font size="4" face="verdana" color="#0fcabf"><%=rs.getString(2)%></td>
	</tr>
	<tr>
		<td><p class="t1">Publication : <font size="4" face="verdana" color="#0fcabf"><%=rs.getString(3)%></td>
      
	</tr>
	<tr>
		<td><p class="t1">Genre : <font size="4" face="verdana" color="#0fcabf"><%=rs.getString(4)%></td>
	</tr>
	<tr>
		<td><p class="t1">Rating : <font size="4" face="verdana" color="#0fcabf"><%=rs.getString(7)%></td>
	</tr>
	<tr>
		<td><p class="t1">Give rating: <font size="4" face="verdana" color="#0fcabf">
                 <form action="rating_given.jsp" method="post">
            <input type="radio" name="g_rating" value="1" class="star">
            <input type="radio" name="g_rating" value="2" class="star">
            <input type="radio" name="g_rating" value="3" class="star">
            <input type="radio" name="g_rating" value="4" class="star">
            <input type="radio" name="g_rating" value="5" class="star">
            <br><button  class="button1" type="submit" name="gr" value="gr">submit rating</button></form>
                
                </td>
	</tr>
	<tr>
		<td colspan="2"><p class="t1">Description : <font size="4" face="verdana" color="#0fcabf"><%=rs.getString(5)%></td>
	</tr>
        <tr>
            <td colspan="2" style="text-align:center;">
                <% 
                if(session.getAttribute("userid")==null || session.getAttribute("userid")==""){
                %> 
                <form action="Vhome.jsp" method="post">
                <%
                }else{
                %>
                <form action="Vsuccess.jsp" method="post">
                <% }}%>
                <button  class="button1" type="submit">Home</button></form></div>
            </td>
        </tr>
	</table>
	</div>
	</center>


</body>
</html>