package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Vlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<style>\n");
      out.write(".hdr\n");
      out.write("{ height:100px; width:100%;\n");
      out.write("background-color:#F3F4F5;\n");
      out.write("}\n");
      out.write(".button1 { \n");
      out.write("\tbackground-color:#0fcabf; \n");
      out.write("\tborder: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 30px;\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 16px;\n");
      out.write("    cursor: pointer;\n");
      out.write("\tborder-radius: 6px;\t\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"F:\\wallies\\HD Wallpapers\\img36.jpg\">\n");
      out.write("\t<div  class=\"hdr\" >\n");
      out.write("\t\t<img   src=\"l7.png\" alt=\"logo\" align=\"left\" width=\"250px\" height=\"80px\"/>\n");
      out.write("\t</div>\n");
      out.write("      <form method=\"post\" action=\"Login.jsp\">\n");
      out.write("       <center>\n");
      out.write("\t\t<table cellpadding=8 cellspacing=8 border=\"0\" bgcolor=\"transparent\"><BR><BR>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t<th colspan=\"3\">\n");
      out.write("\t\t\t<font size=10 face=\"verdana\" color=\"#585858\">Login Here</font><br></th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr bgcolor=\"transparent\">\n");
      out.write("\t\t\t\t<td valign=top> <font size=5 face=\"verdana\" color=\"#0fcabf\"><b>Username</b></font></td>\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"text\" name=\"uname\" value=\"\" size=40 maxlength=50></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("                            <td valign=top> <font size=5 face=\"Verdana\" color=\"#0fcabf\"><b>Password</b></font></td><br>\n");
      out.write("\t\t\t\t<td colspan=\"2\"><input type=\"Password\" name=\"pwd\" value=\"\" size=40 maxlength=10></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr bgcolor=\"transparent\">\n");
      out.write("\t\t\t\t<td></td>\n");
      out.write("\t\t\t\t<td><input class=\"button1\" type=\"Submit\" value=\"Submit\">\n");
      out.write("\t\t\t\t\t<input class=\"button1\" type=\"reset\" value=\"Reset\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td colspan=\"3\" align=\"center\"><font face=\"Verdana\" color=\"#0fcabf\">Yet Not Registered!! </font><font face=\"verdana\" color=\"#585858\"><a href=\"Vreg.jsp\">Register Here</a></font></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
