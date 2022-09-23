<%@ page import ="java.sql.*" %>
<html>

 <body>
<%
    String uid = request.getParameter("uname");    
    String pwd = request.getParameter("pwd");
    Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
    Statement st = con.createStatement();
    ResultSet rs;
    ResultSet rs1;
    rs = st.executeQuery("select * from members where email='" + uid + "' and pass='" + pwd + "' and user_type=2");
    
    if (rs.next()) {
        session.setAttribute("userid", uid);
        String fname=rs.getString("first_name");
        session.setAttribute("name1",fname);
        response.sendRedirect("Success.jsp");
    }
     else
    {
        out.println("Invalid password <a href='Vlogin.jsp'>try again</a>");
    }
    rs1 = st.executeQuery("select * from members where email='" + uid + "' and pass='" + pwd + "' and user_type=1");
     if(rs1.next())
    {
        session.setAttribute("userid", uid);
        String fname=rs1.getString("first_name");
        session.setAttribute("name1",fname);
        response.sendRedirect("Vadmin.jsp");
    }
    else
    {
        out.println("Invalid password <a href='Vlogin.jsp'>try again</a>");
    }
%>
    </body>
</html>