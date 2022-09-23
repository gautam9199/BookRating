<%@ page import ="java.sql.*" %>
<html>
    <body>
<%
    String fname = request.getParameter("fname");    
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String pwd = request.getParameter("pwd");
    String cntry = request.getParameter("cntry");
    String phone = request.getParameter("phone");
    if(fname!="" && lname!="" && email!="" && pwd!="" && cntry!="" && phone!="")
    {
        out.println("welcome");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
        Statement st = con.createStatement();

        int i = st.executeUpdate("insert into members(first_name,last_name,email,pass,country,phone,user_type) values ('" + fname + "','" + lname + "','" + email + "','" + pwd + "','" + cntry + "','" + phone + "','2')");
            if (i > 0) 
            {
               response.sendRedirect("Welcome.jsp");
               
            } 
            else 
            {
                response.sendRedirect("Vhome.jsp");
               
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