package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Vadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .hdr\n");
      out.write("        { height:100px; width:100%;\n");
      out.write("        background-color:#F3F4F5;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div  class=\"hdr\" >\n");
      out.write("\t\t<img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/>\n");
      out.write("\t</div>\n");
      out.write("        <center>\n");
      out.write("\t<div style=\"position:relative; top:50px;\">\n");
      out.write("        <table border=\"3\" cellpadding=\"5\" cellspacing=\"2\">\n");
      out.write("        <tr>\n");
      out.write("        <th>Book name</th>\n");
      out.write("        <th>Publication</th>\n");
      out.write("        <th>Author</th>\n");
      out.write("        <th>genre</th>\n");
      out.write("        <th>Description</th>\n");
      out.write("        <th>Book cover</th>\n");
      out.write("        <th> </th>\n");
      out.write("        </tr>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        \n");
      out.write("        <tr>\n");
      out.write("            <form action=\"Vadd1.jsp\" method=\"post\">\n");
      out.write("            <td><input type=\"text\" name=\"bname\" value=\"");
      out.print(resultSet.getString("bname"));
      out.write("\"></input></td>\n");
      out.write("        <td><input type=\"text\" name=\"pub\" value=\"");
      out.print(resultSet.getString("publication"));
      out.write("\"></input></td>\n");
      out.write("        <td><input type=\"text\" name=\"author\" value=\"");
      out.print(resultSet.getString("author"));
      out.write("\"></input></td>\n");
      out.write("        <td><input type=\"text\" name=\"cat\" value=\"");
      out.print(resultSet.getString("genre"));
      out.write("\"></input></td>\n");
      out.write("        <td><input type=\"text\" name=\"des\" value=\"");
      out.print(resultSet.getString("description"));
      out.write("\"></input></td>\n");
      out.write("        <td><input type=\"text\" name=\"cvr\" value=\"");
      out.print(resultSet.getString("img"));
      out.write("\"></input></td>\n");
      out.write("        <td><button  class=\"button1\" type=\"submit\" value=\"add\">Add</button></td></form>\n");
      out.write("        </tr>\n");
      out.write("        ");

         
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
        
      out.write("\n");
      out.write("        </table>\n");
      out.write("        </center>\n");
      out.write("        </div>\n");
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
