
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%  String bname = request.getParameter("bname");    
    String pub = request.getParameter("pub");
    String author = request.getParameter("author");
    String cat = request.getParameter("cat");
    String des = request.getParameter("des");
    String img = request.getParameter("cvr");
    String bname2 = request.getParameter("bname"); 
    String uid1 = request.getParameter("uid");
    String unm1 = request.getParameter("unm");
    Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
   
        Statement st = con.createStatement();
        if(bname!="" && pub!="" && author!="" && cat!="" && des!="" && img!="")
        {
            if(bname!=null && pub!=null && author!=null && cat!=null && des!=null &&  img!=null)
            {
                 int i = st.executeUpdate("insert into book(bname1,author1,publication1,genre1,description1,img1,rating,flag1) values ('" + bname + "','" + author + "','" + pub + "','" + cat + "','" + des + "','" + img + "','" + 0 + "','" + 1 + "')");
                  String sql = "update request set flag=0 where bname='"+bname2+"'";
            st.executeUpdate(sql);
                      if (i > 0) 
                      {
                        String result;
                //Recipient's email ID needs to be mentioned.
                String to = uid1;
                // Sender's email ID needs to be mentioned
                String from = "bookratingsg@gmail.com";
                final String username = "bookratingsg@gmail.com";
                final String password = "gsha9199";
                String host = "smtp.gmail.com";

                Properties props = new Properties();
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.host", host);
                props.put("mail.smtp.port", "25");

                //Get the Session object.
                Session mailSession = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username,password);
                          }
                        });

                try {
                      // Create a default MimeMessage object.
                    Message message = new MimeMessage(mailSession);
                    // Set From: header field of the header.

                    message.setFrom(new InternetAddress(from));
                    // Set To: header field of the header.

                    message.setRecipients(Message.RecipientType.TO,
                            InternetAddress.parse(to));
               // Set Subject: header field
                    message.setSubject("Book request accepted");
                    // Now set the actual message
                    message.setText("Hello, your book request has been accepted and your uploaded book is now viewed on our website ");
                    Transport.send(message);
                    out.println("Book added!...");
                    %>
            <br><a href='Vadd.jsp'><font face="verdana" color="#585858">Click here to  continue with adding books</font></a>
            <br><a href='Vadmin.jsp'><font face="verdana" color="#585858">Click here to go to home page</font></a>
            <%
            }
            catch (MessagingException e) {
                    e.printStackTrace();
            } 
         }
      }
      }
         %>
    </body>
</html>
