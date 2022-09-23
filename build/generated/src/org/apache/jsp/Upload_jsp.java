package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Upload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("    .hdr\n");
      out.write("    { height:100px; width:100%;\n");
      out.write("    background-color:#F3F4F5;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("        </head>\n");
      out.write("    <body>\n");
      out.write("    ");

    String bname = request.getParameter("bname");    
    String pub = request.getParameter("pub");
    String author = request.getParameter("author");
    String cat = request.getParameter("cat");
    String des = request.getParameter("des");
    String img = request.getParameter("cvr");
    String unm = session.getAttribute("name1").toString();
    String uid = session.getAttribute("userid").toString();
 
    if(bname!="" && pub!="" && author!="" && cat!="" && des!="" && (img!="" || img!=null))
    {
        //out.println("welcome");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookRating",
                "shabnam", "12121996shab@");
        Statement st = con.createStatement();

        int i = st.executeUpdate("insert into request(bname,author,publication,genre,description,img,flag,Uname,uid) values ('" + bname + "','" + author + "','" + pub + "','" + cat + "','" + des + "','" + img + "',1,'" + unm + "','" + uid + "')");
            if (i > 0) 
            {
         
      out.write("\n");
      out.write("        <div  class=\"hdr\" >\n");
      out.write("\t\t<img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("\t<div style=\"position:relative; top:50px;\">\n");
      out.write("               <font size=\"5\" color=\"#0fcabf\">book request has been sent!..you will get the reply in your email</font>\n");
      out.write("             <br><a href='Vsuccess.jsp'><font face=\"verdana\" color=\"#585858\">Click here to Continue</font></a>\n");
      out.write("        </div>\n");
      out.write("        </center>\n");
      out.write("           ");
 
            }
            else 
            {
                response.sendRedirect("Vsuccess.jsp");
               
            }
    }
    else
    { 
    
      out.write("\n");
      out.write("    <font face=\"Verdana\" color=\"#0fcabf\">please fill up entire details!..</font>\n");
      out.write("    ");

    }

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
