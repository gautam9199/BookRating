<%@ page import="java.sql.*" %>  
<html>
<head>
<style>
 .rectangle {width: 700px; height: 205px; border: 5px solid black; position:relative; top:10px;}
.tb{position:absolute; top:10px; bottom:10px; left:10px; right:10px; height:170px; width:680px;}
.i1{border: none;  background:#0fcabf; font-size:2px; color:white;
border-color: transparent;}
</style>   
</head>
<body>
<center>
<%  
String name=request.getParameter("val");  
if(name==null||name.trim().equals("")){  
out.print("<p>Please enter name!</p>");  
}else{  
try{  
Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
PreparedStatement ps=con.prepareStatement("select * from book where bname1 like '"+name+"%' and flag1=1");  
ResultSet rs=ps.executeQuery();  
  
if(!rs.isBeforeFirst()) {      
 out.println("<p>No Record Found!</p>");   
}else{  
while(rs.next()){  

%>

    <div class="rectangle"> 
        <form action="Vview.jsp" method="get" align="center">
		<table border="0" class="tb">
		<tr>
		<td width="120px" rowspan="2" bgcolor="#0fcabf"><img src="<%=rs.getBlob(6)%>" height="170px" width="110px" alt="book cover"/></td>
		<td  align="center" bgcolor="#0fcabf" width="530px" height="130px;"><font size="4px" color="white">Book name : <%=rs.getString(1)%><br>Author : <%=rs.getString(2)%><br>Genre :  <%=rs.getString(4)%><br>Stars : <%=rs.getInt(7)%>/5 Stars<br/><input class="i1" type="text" name="n1" value="<%=rs.getString(9)%>"/></td>
		</tr>
		<tr>
		<td align="center">
			<button type="submit" class="button1">View</button></form></td>
		</tr>
		</table>
        </form>
	</div>
<%
}  
out.print("</table>");  
}//end of else for rs.isBeforeFirst  
con.close();  
}catch(Exception e){out.print(e);}  
}//end of else  
%>
</center>
</body>
</html>